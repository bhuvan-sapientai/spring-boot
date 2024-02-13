package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.boot.context.properties.bind.Binder;

import java.util.LinkedHashMap;

import org.springframework.core.env.PropertySource;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

import org.springframework.boot.context.properties.source.ConfigurationPropertySource;

import java.util.Iterator;
import java.util.stream.Stream;

import org.mockito.MockedStatic;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataEnvironmentContributorSapientGeneratedTest {

	private final ConfigDataProperties propertiesMock = mock(ConfigDataProperties.class, "properties");

	private final ConfigData.Options configDataOptionsMock = mock(ConfigData.Options.class, "<init>_configData.Options1");

	private final ConfigDataActivationContext configDataActivationContextMock = mock(ConfigDataActivationContext.class);

	private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock = mock(ConfigDataEnvironmentContributor.class);

	private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock2 = mock(ConfigDataEnvironmentContributor.class);

	private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock3 = mock(ConfigDataEnvironmentContributor.class);

	private final ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class);

	private final ConfigDataLocation configDataLocationMock2 = mock(ConfigDataLocation.class);

	private final ConfigData configDataMock = mock(ConfigData.class);

	private final ConfigData.Options configDataOptionsMock2 = mock(ConfigData.Options.class);

	private final ConfigDataProperties configDataPropertiesMock = mock(ConfigDataProperties.class);

	private final ConfigDataProperties configDataPropertiesMock2 = mock(ConfigDataProperties.class);

	private final ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class);

	private final ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);

	private final ConfigDataEnvironmentContributor contributorMock = mock(ConfigDataEnvironmentContributor.class);

	private final PropertySource<?> propertySourceMock = mock(PropertySource.class);

	//Sapient generated method id: ${b82dc6ae-4476-3489-a96f-4da2ea20c9cb}
	@Test()
	void isActiveWhenThisKindEqualsKindUNBOUND_IMPORT() {
		/* Branches:
		 * (this.kind == Kind.UNBOUND_IMPORT) : true
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.UNBOUND_IMPORT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		//Act Statement(s)
		boolean result = target.isActive(configDataActivationContextMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${b86b554b-94f2-3468-8a27-64a0a2add7f5}
	@Test()
	void isActiveWhenThisPropertiesIsActiveActivationContext() {
		/* Branches:
		 * (this.kind == Kind.UNBOUND_IMPORT) : false
		 * (this.properties == null) : false
		 * (this.properties.isActive(activationContext)) : true
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.EMPTY_LOCATION, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		doReturn(true).when(propertiesMock).isActive(configDataActivationContextMock);
		//Act Statement(s)
		boolean result = target.isActive(configDataActivationContextMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(propertiesMock).isActive(configDataActivationContextMock);
		});
	}

	//Sapient generated method id: ${9c24c612-1d61-373e-a5cd-99400a882c18}
	@Test()
	void isActiveWhenThisPropertiesNotIsActiveActivationContext() {
		/* Branches:
		 * (this.kind == Kind.UNBOUND_IMPORT) : false
		 * (this.properties == null) : false
		 * (this.properties.isActive(activationContext)) : false
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.EMPTY_LOCATION, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		doReturn(false).when(propertiesMock).isActive(configDataActivationContextMock);
		//Act Statement(s)
		boolean result = target.isActive(configDataActivationContextMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(propertiesMock).isActive(configDataActivationContextMock);
		});
	}

	//Sapient generated method id: ${668e06d3-b2e9-3b44-8e3e-b2ecd79641b4}
	@Test()
	void hasConfigDataOptionWhenThisConfigDataOptionsContainsOption() {
		/* Branches:
		 * (this.configDataOptions.contains(option)) : true
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		doReturn(true).when(configDataOptionsMock).contains(ConfigData.Option.IGNORE_IMPORTS);
		//Act Statement(s)
		boolean result = target.hasConfigDataOption(ConfigData.Option.IGNORE_IMPORTS);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(configDataOptionsMock).contains(ConfigData.Option.IGNORE_IMPORTS);
		});
	}

	//Sapient generated method id: ${a8840295-580a-3107-95a5-62e7b9e7a2fe}
	@Test()
	void hasConfigDataOptionWhenThisConfigDataOptionsNotContainsOption() {
		/* Branches:
		 * (this.configDataOptions.contains(option)) : false
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		doReturn(false).when(configDataOptionsMock).contains(ConfigData.Option.IGNORE_IMPORTS);
		//Act Statement(s)
		boolean result = target.hasConfigDataOption(ConfigData.Option.IGNORE_IMPORTS);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(configDataOptionsMock).contains(ConfigData.Option.IGNORE_IMPORTS);
		});
	}

	//Sapient generated method id: ${913de6d1-b789-3f7d-b856-a91cf6080846}
	@Disabled()
	@Test()
	void withoutConfigDataOptionWhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		doReturn(configDataOptionsMock2).when(configDataOptionsMock).without(ConfigData.Option.IGNORE_IMPORTS);
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = target.withoutConfigDataOption(ConfigData.Option.IGNORE_IMPORTS);
		ConfigDataEnvironmentContributor configDataEnvironmentContributor = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock2, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(configDataEnvironmentContributor));
			verify(configDataOptionsMock).without(ConfigData.Option.IGNORE_IMPORTS);
		});
	}

	//Sapient generated method id: ${3eb8ae14-246b-3884-a02b-627cbfcbf3e0}
	@Disabled()
	@Test()
	void withoutConfigDataOptionWhenDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, (Map) null);
		doReturn(null).when(configDataOptionsMock).without(ConfigData.Option.IGNORE_IMPORTS);
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = target.withoutConfigDataOption(ConfigData.Option.IGNORE_IMPORTS);
		ConfigDataEnvironmentContributor configDataEnvironmentContributor = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, (ConfigData.Options) null, (Map) null);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(configDataEnvironmentContributor));
			verify(configDataOptionsMock).without(ConfigData.Option.IGNORE_IMPORTS);
		});
	}

	//Sapient generated method id: ${f66955bf-846c-3890-a5a8-4f98933ac516}
	@Test()
	void getImportsWhenThisPropertiesIsNotNull() {
		/* Branches:
		 * (this.properties != null) : true
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
		doReturn(configDataLocationList).when(propertiesMock).getImports();
		//Act Statement(s)
		List<ConfigDataLocation> result = target.getImports();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(configDataLocationList));
			verify(propertiesMock).getImports();
		});
	}

	//Sapient generated method id: ${cef93e79-e2d5-3030-a6e2-c8787f016917}
	@Test()
	void getImportsWhenThisPropertiesIsNull() {
		/* Branches:
		 * (this.properties != null) : false
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, (ConfigDataProperties) null, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		//Act Statement(s)
		List<ConfigDataLocation> result = target.getImports();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${1838affe-e765-3059-be77-1c45c8a0abb5}
	@Test()
	void hasUnprocessedImportsWhenGetImportsIsEmpty() {
		/* Branches:
		 * (getImports().isEmpty()) : true
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = spy(new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap));
		List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
		doReturn(configDataLocationList).when(target).getImports();
		//Act Statement(s)
		boolean result = target.hasUnprocessedImports(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(target).getImports();
		});
	}

	//Sapient generated method id: ${6ef93f2d-8c86-30ff-815d-8ce177c115db}
	@Test()
	void hasUnprocessedImportsWhenThisChildrenNotContainsKeyImportPhase() {
		/* Branches:
		 * (getImports().isEmpty()) : false
		 * (!this.children.containsKey(importPhase)) : true
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = spy(new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap));
		List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
		configDataLocationList.add(configDataLocationMock2);
		doReturn(configDataLocationList).when(target).getImports();
		//Act Statement(s)
		boolean result = target.hasUnprocessedImports(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(target).getImports();
		});
	}

	//Sapient generated method id: ${a1b9e28c-35e0-360d-a36d-8c9593efae85}
	@Test()
	void hasUnprocessedImportsWhenThisChildrenContainsKeyImportPhase() {
		/* Branches:
		 * (getImports().isEmpty()) : false
		 * (!this.children.containsKey(importPhase)) : false
		 */
		//Arrange Statement(s)
		List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap.put(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION, configDataEnvironmentContributorList);
		ConfigDataEnvironmentContributor target = spy(new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap));
		List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
		configDataLocationList.add(configDataLocationMock2);
		doReturn(configDataLocationList).when(target).getImports();
		//Act Statement(s)
		boolean result = target.hasUnprocessedImports(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(target).getImports();
		});
	}

	//Sapient generated method id: ${a8397c57-384b-3d57-8cc8-8aa49c1f61dd}
	@Test()
	void getChildrenTest() {
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		//Act Statement(s)
		List<ConfigDataEnvironmentContributor> result = target.getChildren(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${b4af2388-e781-3800-820a-b8ede09bd914}
	@Disabled()
	@Test()
	void streamTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = spy(new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap));
		//TODO: Needs to return real value
		doReturn(null).when(target).spliterator();
		//Act Statement(s)
		Stream<ConfigDataEnvironmentContributor> result = target.stream();
		Stream stream = Stream.empty();
		//Assert statement(s)
		//TODO: Please implement equals method in Stream for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(stream));
			verify(target).spliterator();
		});
	}

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}
	@Test()
	void iteratorTest() {
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		//Act Statement(s)
		Iterator<ConfigDataEnvironmentContributor> result = target.iterator();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${39d8d987-8ae8-34f4-9542-0c62340c8800}
	@Disabled()
	@Test()
	void withBoundPropertiesWhenDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (properties != null) : true
		 * (this.configDataOptions.contains(ConfigData.Option.IGNORE_IMPORTS)) : true
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigDataProperties> configDataProperties = mockStatic(ConfigDataProperties.class)) {
			configDataProperties.when(() -> ConfigDataProperties.get((Binder) any())).thenReturn(configDataPropertiesMock);
			doReturn(configDataPropertiesMock2).when(configDataPropertiesMock).withoutImports();
			Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
			ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
			doReturn(true).when(configDataOptionsMock).contains(ConfigData.Option.IGNORE_IMPORTS);
			//TODO: Needs initialization with real value
			Iterable iterable = null;
			//Act Statement(s)
			ConfigDataEnvironmentContributor result = target.withBoundProperties(iterable, configDataActivationContextMock);
			ConfigDataEnvironmentContributor configDataEnvironmentContributor = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.BOUND_IMPORT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, configDataPropertiesMock2, configDataOptionsMock, (Map) null);
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(configDataEnvironmentContributor));
				configDataProperties.verify(() -> ConfigDataProperties.get((Binder) any()));
				verify(configDataPropertiesMock).withoutImports();
				verify(configDataOptionsMock).contains(ConfigData.Option.IGNORE_IMPORTS);
			});
		}
	}

	//Sapient generated method id: ${54ebdb6c-4004-3202-8032-07d8930855ae}
	@Disabled()
	@Test()
	void withBoundPropertiesWhenThisConfigDataOptionsContainsConfigDataOptionIGNORE_IMPORTSAndDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (properties != null) : true
		 * (this.configDataOptions.contains(ConfigData.Option.IGNORE_IMPORTS)) : true
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigDataProperties> configDataProperties = mockStatic(ConfigDataProperties.class)) {
			configDataProperties.when(() -> ConfigDataProperties.get((Binder) any())).thenReturn(configDataPropertiesMock);
			doReturn(configDataPropertiesMock2).when(configDataPropertiesMock).withoutImports();
			Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
			ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, (ConfigData.Options) null, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
			//TODO: Needs initialization with real value
			Iterable iterable = null;
			//Act Statement(s)
			ConfigDataEnvironmentContributor result = target.withBoundProperties(iterable, configDataActivationContextMock);
			ConfigDataEnvironmentContributor configDataEnvironmentContributor = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.BOUND_IMPORT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, configDataPropertiesMock2, (ConfigData.Options) null, (Map) null);
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(configDataEnvironmentContributor));
				configDataProperties.verify(() -> ConfigDataProperties.get((Binder) any()));
				verify(configDataPropertiesMock).withoutImports();
			});
		}
	}

	//Sapient generated method id: ${7f195377-6e5a-3f00-8510-1486f1d78813}
	@Disabled()
	@Test()
	void withChildrenWhenDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (importPhase == ImportPhase.AFTER_PROFILE_ACTIVATION) : true
		 * (CollectionUtils.isEmpty(contributors)) : true  #  inside hasAnyProfileSpecificChildren method
		 * (!hasAnyProfileSpecificChildren(before)) : true  #  inside moveProfileSpecific method
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = target.withChildren(ConfigDataEnvironmentContributor.ImportPhase.AFTER_PROFILE_ACTIVATION, configDataEnvironmentContributorList);
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap2 = new LinkedHashMap<>(configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap2.put(ConfigDataEnvironmentContributor.ImportPhase.AFTER_PROFILE_ACTIVATION, configDataEnvironmentContributorList);
		ConfigDataEnvironmentContributor configDataEnvironmentContributor = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap2);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(configDataEnvironmentContributor)));
	}

	//Sapient generated method id: ${395e5e51-3b18-3916-85d3-20ad3a325456}
	@Disabled()
	@Test()
	void withChildrenWhenHasAnyProfileSpecificChildrenNotBeforeAndDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (importPhase == ImportPhase.AFTER_PROFILE_ACTIVATION) : true
		 * (CollectionUtils.isEmpty(contributors)) : true  #  inside hasAnyProfileSpecificChildren method
		 * (!hasAnyProfileSpecificChildren(before)) : true  #  inside moveProfileSpecific method
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, (ConfigData.Options) null, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = target.withChildren(ConfigDataEnvironmentContributor.ImportPhase.AFTER_PROFILE_ACTIVATION, configDataEnvironmentContributorList);
		ConfigData.Options options = ConfigData.Options.NONE;
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap2 = new LinkedHashMap<>(configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap2.put(ConfigDataEnvironmentContributor.ImportPhase.AFTER_PROFILE_ACTIVATION, configDataEnvironmentContributorList);
		ConfigDataEnvironmentContributor configDataEnvironmentContributor = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, options, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap2);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(configDataEnvironmentContributor)));
	}

	//Sapient generated method id: ${3ebab24a-8ca0-37bb-946f-abeb0886c8dc}
	@Test()
	void withReplacementWhenThisEqualsExisting() {
		/* Branches:
		 * (this == existing) : true
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = target.withReplacement(target, configDataEnvironmentContributorMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(configDataEnvironmentContributorMock)));
	}

	//Sapient generated method id: ${6e1d0279-7698-3802-a61e-e60df88068c8}
	@Disabled()
	@Test()
	void withReplacementWhenDefaultBranch() {
		/* Branches:
		 * (this == existing) : false
		 * (for-each(contributors)) : true  #  inside lambda$withReplacement$1 method
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		doReturn(configDataEnvironmentContributorMock).when(contributorMock).withReplacement(configDataEnvironmentContributorMock2, configDataEnvironmentContributorMock3);
		List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
		configDataEnvironmentContributorList.add(contributorMock);
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap.put(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION, configDataEnvironmentContributorList);
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = target.withReplacement(configDataEnvironmentContributorMock2, configDataEnvironmentContributorMock3);
		List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList2 = new ArrayList<>(1);
		configDataEnvironmentContributorList2.add(configDataEnvironmentContributorMock);
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap2 = new LinkedHashMap<>(1);
		configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap2.put(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION, configDataEnvironmentContributorList2);
		ConfigDataEnvironmentContributor configDataEnvironmentContributor = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap2);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(configDataEnvironmentContributor));
			verify(contributorMock).withReplacement(configDataEnvironmentContributorMock2, configDataEnvironmentContributorMock3);
		});
	}

	//Sapient generated method id: ${38d5fd0d-4e45-3edb-a0cd-634967433db2}
	@Disabled()
	@Test()
	void withReplacementWhenDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (this == existing) : false
		 * (for-each(contributors)) : true  #  inside lambda$withReplacement$1 method
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(configDataEnvironmentContributorMock).when(contributorMock).withReplacement(configDataEnvironmentContributorMock2, configDataEnvironmentContributorMock3);
		List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
		configDataEnvironmentContributorList.add(contributorMock);
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap.put(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION, configDataEnvironmentContributorList);
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, (ConfigData.Options) null, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = target.withReplacement(configDataEnvironmentContributorMock2, configDataEnvironmentContributorMock3);
		ConfigDataEnvironmentContributor configDataEnvironmentContributor = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, (ConfigData.Options) null, (Map) null);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(configDataEnvironmentContributor));
			verify(contributorMock).withReplacement(configDataEnvironmentContributorMock2, configDataEnvironmentContributorMock3);
		});
	}

	//Sapient generated method id: ${f19e42ad-5ced-3742-8a45-a043b752aca3}
	@Test()
	void toStringWhenThisChildrenGetOrDefaultImportPhaseAFTER_PROFILE_ACTIVATIONCollectionsEmptyListIsNotEmpty() {
		/* Branches:
		 * (for-each(this.children.getOrDefault(ImportPhase.BEFORE_PROFILE_ACTIVATION, Collections.emptyList()))) : true  #  inside buildToString method
		 * (for-each(this.children.getOrDefault(ImportPhase.AFTER_PROFILE_ACTIVATION, Collections.emptyList()))) : true  #  inside buildToString method
		 */
		//Arrange Statement(s)
		ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class, "<init>_configDataLocation1");
		ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class, "<init>_configDataResource1");
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.EMPTY_LOCATION, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		//Act Statement(s)
		String result = target.toString();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("EMPTY_LOCATION <init>_configDataLocation1 <init>_configDataResource1 <init>_configData.Options1\n")));
	}

	//Sapient generated method id: ${2e242bfc-9175-3742-b63c-1cb781c17d38}
	@Disabled()
	@Test()
	void ofWhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.of(configDataEnvironmentContributorList);
		List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList2 = new ArrayList<>();
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new LinkedHashMap<>();
		configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap.put(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION, configDataEnvironmentContributorList2);
		ConfigDataEnvironmentContributor configDataEnvironmentContributor = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, (ConfigDataLocation) null, (ConfigDataResource) null, false, (PropertySource) null, (ConfigurationPropertySource) null, (ConfigDataProperties) null, (ConfigData.Options) null, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(configDataEnvironmentContributor)));
	}

	//Sapient generated method id: ${fb11a407-c270-352d-8aa0-eeda419d163d}
	@Disabled()
	@Test()
	void ofWhenDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.of(configDataEnvironmentContributorList);
		ConfigDataEnvironmentContributor configDataEnvironmentContributor = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, (ConfigDataLocation) null, (ConfigDataResource) null, false, (PropertySource) null, (ConfigurationPropertySource) null, (ConfigDataProperties) null, (ConfigData.Options) null, (Map) null);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(configDataEnvironmentContributor)));
	}

	//Sapient generated method id: ${999886da-74d8-302b-a930-55a7c613f3f3}
	@Disabled()
	@Test()
	void ofInitialImportWhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock);
		List<ConfigDataLocation> configDataLocationList = new ArrayList<>(List.of(configDataLocationMock));
		ConfigDataProperties configDataProperties = new ConfigDataProperties(configDataLocationList, (ConfigDataProperties.Activate) null);
		ConfigDataEnvironmentContributor configDataEnvironmentContributor = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.INITIAL_IMPORT, (ConfigDataLocation) null, (ConfigDataResource) null, false, (PropertySource) null, (ConfigurationPropertySource) null, configDataProperties, (ConfigData.Options) null, (Map) null);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(configDataEnvironmentContributor)));
	}

	//Sapient generated method id: ${ff960e32-6e03-306c-8df1-e813dce5d525}
	@Disabled()
	@Test()
	void ofExistingWhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertySource> configurationPropertySource = mockStatic(ConfigurationPropertySource.class)) {
			configurationPropertySource.when(() -> ConfigurationPropertySource.from(propertySourceMock)).thenReturn(configurationPropertySourceMock);
			//Act Statement(s)
			ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.ofExisting(propertySourceMock);
			ConfigDataEnvironmentContributor configDataEnvironmentContributor = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.EXISTING, (ConfigDataLocation) null, (ConfigDataResource) null, false, propertySourceMock, configurationPropertySourceMock, (ConfigDataProperties) null, (ConfigData.Options) null, (Map) null);
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(configDataEnvironmentContributor));
				configurationPropertySource.verify(() -> ConfigurationPropertySource.from(propertySourceMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${eabf8d2b-d77d-319d-a54b-42349cdbb0d0}
	@Disabled()
	@Test()
	void ofUnboundImportWhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertySource> configurationPropertySource = mockStatic(ConfigurationPropertySource.class)) {
			List<PropertySource<?>> anyList = new ArrayList<>();
			anyList.add(propertySourceMock);
			doReturn(anyList).when(configDataMock).getPropertySources();
			doReturn(configDataOptionsMock2).when(configDataMock).getOptions(propertySourceMock);
			configurationPropertySource.when(() -> ConfigurationPropertySource.from(propertySourceMock)).thenReturn(configurationPropertySourceMock);
			//Act Statement(s)
			ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.ofUnboundImport(configDataLocationMock, configDataResourceMock, false, configDataMock, 0);
			ConfigDataEnvironmentContributor configDataEnvironmentContributor = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.UNBOUND_IMPORT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, (ConfigDataProperties) null, configDataOptionsMock2, (Map) null);
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(configDataEnvironmentContributor));
				verify(configDataMock).getPropertySources();
				verify(configDataMock).getOptions(propertySourceMock);
				configurationPropertySource.verify(() -> ConfigurationPropertySource.from(propertySourceMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ef3f8731-a6ec-3742-abf3-33184d3075f6}
	@Disabled()
	@Test()
	void ofUnboundImportWhenDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertySource> configurationPropertySource = mockStatic(ConfigurationPropertySource.class)) {
			List<PropertySource<?>> anyList = new ArrayList<>();
			anyList.add(propertySourceMock);
			doReturn(anyList).when(configDataMock).getPropertySources();
			doReturn(null).when(configDataMock).getOptions(propertySourceMock);
			configurationPropertySource.when(() -> ConfigurationPropertySource.from(propertySourceMock)).thenReturn(configurationPropertySourceMock);
			//Act Statement(s)
			ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.ofUnboundImport(configDataLocationMock, configDataResourceMock, false, configDataMock, 0);
			ConfigDataEnvironmentContributor configDataEnvironmentContributor = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.UNBOUND_IMPORT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, (ConfigDataProperties) null, (ConfigData.Options) null, (Map) null);
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(configDataEnvironmentContributor));
				verify(configDataMock).getPropertySources();
				verify(configDataMock).getOptions(propertySourceMock);
				configurationPropertySource.verify(() -> ConfigurationPropertySource.from(propertySourceMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${1684446f-5b2d-324e-932e-a26ca6fc5dae}
	@Disabled()
	@Test()
	void ofEmptyLocationWhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.ofEmptyLocation(configDataLocationMock, false);
		ConfigData.Option[] optionArray = new ConfigData.Option[] { ConfigData.Option.IGNORE_IMPORTS };
		ConfigData.Options options = ConfigData.Options.of(optionArray);
		ConfigDataEnvironmentContributor configDataEnvironmentContributor = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.EMPTY_LOCATION, configDataLocationMock, (ConfigDataResource) null, false, (PropertySource) null, (ConfigurationPropertySource) null, (ConfigDataProperties) null, options, (Map) null);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(configDataEnvironmentContributor)));
	}

	//Sapient generated method id: ${4a009397-7a64-3271-86dd-b7f5144771b8}
	@Disabled()
	@Test()
	void ofEmptyLocationWhenDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.ofEmptyLocation(configDataLocationMock, false);
		ConfigDataEnvironmentContributor configDataEnvironmentContributor = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.EMPTY_LOCATION, configDataLocationMock, (ConfigDataResource) null, false, (PropertySource) null, (ConfigurationPropertySource) null, (ConfigDataProperties) null, (ConfigData.Options) null, (Map) null);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(configDataEnvironmentContributor)));
	}
}
