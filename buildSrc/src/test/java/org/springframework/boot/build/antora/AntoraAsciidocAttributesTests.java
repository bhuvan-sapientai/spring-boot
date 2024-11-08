/*
 * Copyright 2012-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.build.antora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import org.springframework.boot.build.bom.Library;
import org.springframework.boot.build.bom.Library.Group;
import org.springframework.boot.build.bom.Library.LibraryVersion;
import org.springframework.boot.build.bom.Library.Link;
import org.springframework.boot.build.bom.Library.ProhibitedVersion;
import org.springframework.boot.build.bom.Library.VersionAlignment;
import org.springframework.boot.build.bom.bomr.version.DependencyVersion;
import org.springframework.boot.build.properties.BuildType;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link AntoraAsciidocAttributes}.
 *
 * @author Phillip Webb
 * @author Stephane Nicoll
 */
class AntoraAsciidocAttributesTests {

	@Test
	void buildTypeWhenOpenSource() {
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3", true, BuildType.OPEN_SOURCE, null,
				mockDependencyVersions(), null);
		assertThat(attributes.get()).containsEntry("build-type", "opensource");
	}

	@Test
	void buildTypeWhenCommercial() {
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3", true, BuildType.COMMERCIAL, null,
				mockDependencyVersions(), null);
		assertThat(attributes.get()).containsEntry("build-type", "commercial");
	}

	@Test
	void githubRefWhenReleasedVersionIsTag() {
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3", true, BuildType.OPEN_SOURCE, null,
				mockDependencyVersions(), null);
		assertThat(attributes.get()).containsEntry("github-ref", "v1.2.3");
	}

	@Test
	void githubRefWhenLatestSnapshotVersionIsMainBranch() {
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3-SNAPSHOT", true,
				BuildType.OPEN_SOURCE, null, mockDependencyVersions(), null);
		assertThat(attributes.get()).containsEntry("github-ref", "main");
	}

	@Test
	void githubRefWhenOlderSnapshotVersionIsBranch() {
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3-SNAPSHOT", false,
				BuildType.OPEN_SOURCE, null, mockDependencyVersions(), null);
		assertThat(attributes.get()).containsEntry("github-ref", "1.2.x");
	}

	@Test
	void githubRefWhenOlderSnapshotHotFixVersionIsBranch() {
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3.1-SNAPSHOT", false,
				BuildType.OPEN_SOURCE, null, mockDependencyVersions(), null);
		assertThat(attributes.get()).containsEntry("github-ref", "1.2.3.x");
	}

	@Test
	void versionReferenceFromLibrary() {
		Library library = mockLibrary(Collections.emptyMap());
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3.1-SNAPSHOT", false,
				BuildType.OPEN_SOURCE, List.of(library), mockDependencyVersions(), null);
		assertThat(attributes.get()).containsEntry("version-spring-framework", "1.2.3");
	}

	@Test
	void versionReferenceFromSpringDataDependencyReleaseVersion() {
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3", true, BuildType.OPEN_SOURCE, null,
				mockDependencyVersions("3.2.5"), null);
		assertThat(attributes.get()).containsEntry("version-spring-data-mongodb-docs", "3.2");
		assertThat(attributes.get()).containsEntry("version-spring-data-mongodb-javadoc", "3.2.x");
	}

	@Test
	void versionReferenceFromSpringDataDependencySnapshotVersion() {
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3", true, BuildType.OPEN_SOURCE, null,
				mockDependencyVersions("3.2.0-SNAPSHOT"), null);
		assertThat(attributes.get()).containsEntry("version-spring-data-mongodb-docs", "3.2-SNAPSHOT");
		assertThat(attributes.get()).containsEntry("version-spring-data-mongodb-javadoc", "3.2.x");
	}

	@Test
	void versionNativeBuildTools() {
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3", true, BuildType.OPEN_SOURCE, null,
				mockDependencyVersions(), Map.of("nativeBuildToolsVersion", "3.4.5"));
		assertThat(attributes.get()).containsEntry("version-native-build-tools", "3.4.5");
	}

	@Test
	void urlArtifactRepositoryWhenRelease() {
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3", true, BuildType.OPEN_SOURCE, null,
				mockDependencyVersions(), null);
		assertThat(attributes.get()).containsEntry("url-artifact-repository", "https://repo.maven.apache.org/maven2");
	}

	@Test
	void urlArtifactRepositoryWhenMilestone() {
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3-M1", true, BuildType.OPEN_SOURCE,
				null, mockDependencyVersions(), null);
		assertThat(attributes.get()).containsEntry("url-artifact-repository", "https://repo.spring.io/milestone");
	}

	@Test
	void urlArtifactRepositoryWhenSnapshot() {
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3-SNAPSHOT", true,
				BuildType.OPEN_SOURCE, null, mockDependencyVersions(), null);
		assertThat(attributes.get()).containsEntry("url-artifact-repository", "https://repo.spring.io/snapshot");
	}

	@Test
	void artifactReleaseTypeWhenOpenSourceRelease() {
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3", true, BuildType.OPEN_SOURCE, null,
				mockDependencyVersions(), null);
		assertThat(attributes.get()).containsEntry("artifact-release-type", "release");
		assertThat(attributes.get()).containsEntry("build-and-artifact-release-type", "opensource-release");
	}

	@Test
	void artifactReleaseTypeWhenOpenSourceMilestone() {
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3-M1", true, BuildType.OPEN_SOURCE,
				null, mockDependencyVersions(), null);
		assertThat(attributes.get()).containsEntry("artifact-release-type", "milestone");
		assertThat(attributes.get()).containsEntry("build-and-artifact-release-type", "opensource-milestone");
	}

	@Test
	void artifactReleaseTypeWhenOpenSourceSnapshot() {
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3-SNAPSHOT", true,
				BuildType.OPEN_SOURCE, null, mockDependencyVersions(), null);
		assertThat(attributes.get()).containsEntry("artifact-release-type", "snapshot");
		assertThat(attributes.get()).containsEntry("build-and-artifact-release-type", "opensource-snapshot");
	}

	@Test
	void artifactReleaseTypeWhenCommercialRelease() {
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3", true, BuildType.COMMERCIAL, null,
				mockDependencyVersions(), null);
		assertThat(attributes.get()).containsEntry("artifact-release-type", "release");
		assertThat(attributes.get()).containsEntry("build-and-artifact-release-type", "commercial-release");
	}

	@Test
	void artifactReleaseTypeWhenCommercialMilestone() {
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3-M1", true, BuildType.COMMERCIAL, null,
				mockDependencyVersions(), null);
		assertThat(attributes.get()).containsEntry("artifact-release-type", "milestone");
		assertThat(attributes.get()).containsEntry("build-and-artifact-release-type", "commercial-milestone");
	}

	@Test
	void artifactReleaseTypeWhenCommercialSnapshot() {
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3-SNAPSHOT", true, BuildType.COMMERCIAL,
				null, mockDependencyVersions(), null);
		assertThat(attributes.get()).containsEntry("artifact-release-type", "snapshot");
		assertThat(attributes.get()).containsEntry("build-and-artifact-release-type", "commercial-snapshot");
	}

	@Test
	void urlLinksFromLibrary() {
		Map<String, Link> links = new LinkedHashMap<>();
		links.put("site", new Link((version) -> "https://example.com/site/" + version, null));
		links.put("docs", new Link((version) -> "https://example.com/docs/" + version, null));
		links.put("javadoc", new Link((version) -> "https://example.com/api/" + version,
				List.of("org.springframework.[core|util]")));
		Library library = mockLibrary(links);
		AntoraAsciidocAttributes attributes = new AntoraAsciidocAttributes("1.2.3.1-SNAPSHOT", false,
				BuildType.OPEN_SOURCE, List.of(library), mockDependencyVersions(), null);
		assertThat(attributes.get()).containsEntry("url-spring-framework-site", "https://example.com/site/1.2.3")
			.containsEntry("url-spring-framework-docs", "https://example.com/docs/1.2.3")
			.containsEntry("url-spring-framework-javadoc", "https://example.com/api/1.2.3");
		assertThat(attributes.get())
			.containsEntry("javadoc-location-org-springframework-core", "{url-spring-framework-javadoc}")
			.containsEntry("javadoc-location-org-springframework-util", "{url-spring-framework-javadoc}");
	}

	@Test
	void linksFromProperties() {
		Map<String, String> attributes = new AntoraAsciidocAttributes("1.2.3-SNAPSHOT", true, BuildType.OPEN_SOURCE,
				null, mockDependencyVersions(), null)
			.get();
		assertThat(attributes).containsEntry("include-java", "ROOT:example$java/org/springframework/boot/docs");
		assertThat(attributes).containsEntry("url-spring-data-cassandra-site",
				"https://spring.io/projects/spring-data-cassandra");
		List<String> keys = new ArrayList<>(attributes.keySet());
		assertThat(keys.indexOf("include-java")).isLessThan(keys.indexOf("code-spring-boot-latest"));
	}

	private Library mockLibrary(Map<String, Link> links) {
		String name = "Spring Framework";
		String calendarName = null;
		LibraryVersion version = new LibraryVersion(DependencyVersion.parse("1.2.3"));
		List<Group> groups = Collections.emptyList();
		List<ProhibitedVersion> prohibitedVersion = Collections.emptyList();
		boolean considerSnapshots = false;
		VersionAlignment versionAlignment = null;
		String alignsWithBom = null;
		String linkRootName = null;
		Library library = new Library(name, calendarName, version, groups, prohibitedVersion, considerSnapshots,
				versionAlignment, alignsWithBom, linkRootName, links);
		return library;
	}

	private Map<String, String> mockDependencyVersions() {
		return mockDependencyVersions("1.2.3");
	}

	private Map<String, String> mockDependencyVersions(String version) {
		Map<String, String> versions = new LinkedHashMap<>();
		addMockSpringDataVersion(versions, "spring-data-commons", version);
		addMockSpringDataVersion(versions, "spring-data-cassandra", version);
		addMockSpringDataVersion(versions, "spring-data-couchbase", version);
		addMockSpringDataVersion(versions, "spring-data-elasticsearch", version);
		addMockSpringDataVersion(versions, "spring-data-jdbc", version);
		addMockSpringDataVersion(versions, "spring-data-jpa", version);
		addMockSpringDataVersion(versions, "spring-data-mongodb", version);
		addMockSpringDataVersion(versions, "spring-data-neo4j", version);
		addMockSpringDataVersion(versions, "spring-data-r2dbc", version);
		addMockSpringDataVersion(versions, "spring-data-rest-core", version);
		addMockSpringDataVersion(versions, "spring-data-ldap", version);
		addMockJacksonVersion(versions, "jackson-annotations", version);
		addMockJacksonVersion(versions, "jackson-core", version);
		addMockJacksonVersion(versions, "jackson-databind", version);
		return versions;
	}

	private void addMockSpringDataVersion(Map<String, String> versions, String artifactId, String version) {
		versions.put("org.springframework.data:" + artifactId, version);
	}

	private void addMockJacksonVersion(Map<String, String> versions, String artifactId, String version) {
		versions.put("com.fasterxml.jackson.core:" + artifactId, version);
	}

}