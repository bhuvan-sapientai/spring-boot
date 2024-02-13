package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.aot.hint.ResourceHints;
import org.springframework.aot.hint.support.FilePatternResourceHintsRegistrar;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import org.springframework.aot.hint.RuntimeHints;
import org.springframework.core.io.support.SpringFactoriesLoader;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataLocationRuntimeHintsSapientGeneratedTest {

	//Sapient generated method id: ${0df63eb7-2b74-306a-9b9c-0370947f5ae0}
	@Test()
	void registerHintsWhenLoggerIsDebugEnabled() {
		/* Branches:
		 * (logger.isDebugEnabled()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		RuntimeHints hintsMock = mock(RuntimeHints.class);
		FilePatternResourceHintsRegistrar.Builder filePatternResourceHintsRegistrarBuilderMock = mock(FilePatternResourceHintsRegistrar.Builder.class);
		FilePatternResourceHintsRegistrar.Builder filePatternResourceHintsRegistrarBuilderMock2 = mock(FilePatternResourceHintsRegistrar.Builder.class);
		FilePatternResourceHintsRegistrar.Builder filePatternResourceHintsRegistrarBuilderMock3 = mock(FilePatternResourceHintsRegistrar.Builder.class);
		try (MockedStatic<FilePatternResourceHintsRegistrar> filePatternResourceHintsRegistrar = mockStatic(FilePatternResourceHintsRegistrar.class)) {
			ResourceHints resourceHints = new ResourceHints();
			doReturn(resourceHints).when(hintsMock).resources();
			filePatternResourceHintsRegistrar.when(() -> FilePatternResourceHintsRegistrar.forClassPathLocations(anyList())).thenReturn(filePatternResourceHintsRegistrarBuilderMock);
			List<String> stringList = new ArrayList<>(List.of("application"));
			doReturn(filePatternResourceHintsRegistrarBuilderMock2).when(filePatternResourceHintsRegistrarBuilderMock).withFilePrefixes(stringList);
			List<String> stringList2 = new ArrayList<>();
			doReturn(filePatternResourceHintsRegistrarBuilderMock3).when(filePatternResourceHintsRegistrarBuilderMock2).withFileExtensions(stringList2);
			doNothing().when(filePatternResourceHintsRegistrarBuilderMock3).registerHints(eq(resourceHints), (ClassLoader) any());
			ConfigDataLocationRuntimeHints target = spy(new ConfigDataLocationRuntimeHints());
			List<String> stringList3 = new ArrayList<>();
			doReturn(stringList3).when(target).getLocations((ClassLoader) any());
			doReturn(stringList2).when(target).getExtensions((ClassLoader) any());
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			//Act Statement(s)
			target.registerHints(hintsMock, classLoader);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(hintsMock).resources();
				filePatternResourceHintsRegistrar.verify(() -> FilePatternResourceHintsRegistrar.forClassPathLocations(anyList()));
				verify(filePatternResourceHintsRegistrarBuilderMock).withFilePrefixes(stringList);
				verify(filePatternResourceHintsRegistrarBuilderMock2).withFileExtensions(stringList2);
				verify(filePatternResourceHintsRegistrarBuilderMock3).registerHints(eq(resourceHints), (ClassLoader) any());
				verify(target).getLocations((ClassLoader) any());
				verify(target).getExtensions((ClassLoader) any());
			});
		}
	}

	//Sapient generated method id: ${a4f1ca8a-1fdc-3656-8e4e-e441e6678b0d}
	@Test()
	void getFileNamesTest() {
		//Arrange Statement(s)
		ConfigDataLocationRuntimeHints target = new ConfigDataLocationRuntimeHints();
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		List<String> result = target.getFileNames(classLoader);
		List<String> stringResultList = new ArrayList<>(List.of("application"));
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(stringResultList.size()));
			assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
		});
	}

	//Sapient generated method id: ${d4bb8a91-76ef-34f8-8f22-79aa7127ad7b}
	@Disabled()
	@Test()
	void getLocationsWhenConfigDataEnvironmentDEFAULT_SEARCH_LOCATIONSIsEmpty() {
		/* Branches:
		 * (for-each(ConfigDataEnvironment.DEFAULT_SEARCH_LOCATIONS)) : false
		 */
		//Arrange Statement(s)
		ConfigDataLocationRuntimeHints target = new ConfigDataLocationRuntimeHints();
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		List<String> result = target.getLocations(classLoader);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${9b78a88c-7858-3826-b0c3-1eed0b72872a}
	@Test()
	void getExtensionsWhenExtensionsNotContainsCandidate() {
		/* Branches:
		 * (for-each(propertySourceLoaders)) : true
		 * (for-each(propertySourceLoader.getFileExtensions())) : true
		 * (!extensions.contains(candidate)) : true
		 */
		//Arrange Statement(s)
		ConfigDataLocationRuntimeHints target = new ConfigDataLocationRuntimeHints();
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		List<String> result = target.getExtensions(classLoader);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${4cf4290c-992d-39ce-80f1-e103f4284822}
	@Test()
	void getSpringFactoriesLoaderTest() {
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class)) {
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock);
			ConfigDataLocationRuntimeHints target = new ConfigDataLocationRuntimeHints();
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			//Act Statement(s)
			SpringFactoriesLoader result = target.getSpringFactoriesLoader(classLoader);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(springFactoriesLoaderMock));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()));
			});
		}
	}
}
