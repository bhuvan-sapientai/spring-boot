package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import org.springframework.util.StringUtils;

import org.yaml.snakeyaml.Yaml;

import org.springframework.core.CollectionFactory;

import java.util.Map;

import org.springframework.core.io.Resource;

import org.mockito.MockedStatic;

import java.util.Properties;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class OriginTrackedYamlLoaderSapientGeneratedTest {

	private final Resource resourceMock = mock(Resource.class, "<init>_resource1");

	//Sapient generated method id: ${e458a625-923e-34c3-934b-318af1e1b687}, hash: C7CE5D97211986625A7BD777653F90FD
	@Test()
	void createYamlTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Resource resourceMock = mock(Resource.class);
		OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);

		//Act Statement(s)
		Yaml result = target.createYaml();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${ff42effe-8e08-33e3-9690-b409079214e3}, hash: 8F150BADAE918367C3451D64F1576726
	@Test()
	void loadTest() throws Throwable, IOException {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: yaml - Method: loadAll
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			doReturn(null).when(resourceMock).getInputStream();
			Properties properties = new Properties();
			collectionFactory.when(() -> CollectionFactory.createStringAdaptingProperties()).thenReturn(properties);
			OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);
			//Act Statement(s)
			List<Map<String, Object>> result = target.load();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(resourceMock).getInputStream();
				collectionFactory.verify(() -> CollectionFactory.createStringAdaptingProperties(), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${0df9afc4-796d-3983-9f22-9ab3012a68a2}, hash: 6E42487DE06BE8B1A16C77BE52A07195
	@Test()
	void loadTest3() throws Throwable, IOException {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: yaml - Method: loadAll
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			doReturn(null).when(resourceMock).getInputStream();
			Object object = new Object();
			Properties properties = new Properties();
			properties.put("document", object);
			collectionFactory.when(() -> CollectionFactory.createStringAdaptingProperties()).thenReturn(properties);
			OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);
			//Act Statement(s)
			List<Map<String, Object>> result = target.load();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(resourceMock).getInputStream();
				collectionFactory.verify(() -> CollectionFactory.createStringAdaptingProperties(), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c7ab1a76-9684-3a2d-b4e8-8adf3a155a3c}, hash: 467FDCC66EDEA69DD20A116371F9D319
	@Test()
	void loadTest7() throws Throwable, IOException {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: yaml - Method: loadAll
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			doReturn(null).when(resourceMock).getInputStream();
			Properties properties = new Properties();
			properties.put("asMap_object1", "return_of_createStringAdaptingPropertiesItem1Value1");
			collectionFactory.when(() -> CollectionFactory.createStringAdaptingProperties()).thenReturn(properties);
			OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);
			//Act Statement(s)
			List<Map<String, Object>> result = target.load();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(resourceMock).getInputStream();
				collectionFactory.verify(() -> CollectionFactory.createStringAdaptingProperties(), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a659dd89-1e4a-3c30-81e9-1ea3f541ae3c}, hash: 59DDDE887D6DA39D51E723EA9295032F
	@Test()
	void loadTest9() throws Throwable, IOException {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: yaml - Method: loadAll
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			doReturn(null).when(resourceMock).getInputStream();
			Properties properties = new Properties();
			collectionFactory.when(() -> CollectionFactory.createStringAdaptingProperties()).thenReturn(properties);
			OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);
			//Act Statement(s)
			List<Map<String, Object>> result = target.load();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(resourceMock).getInputStream();
				collectionFactory.verify(() -> CollectionFactory.createStringAdaptingProperties(), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${80527493-8b4f-3acd-b059-6533abb62845}, hash: F54D765F81B8A51B0AC2C3C25CAD286A
	@Test()
	void loadTest10() throws Throwable, IOException {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: yaml - Method: loadAll
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			doReturn(null).when(resourceMock).getInputStream();
			Properties properties = new Properties();
			properties.put("[asMap_object1]", "");
			collectionFactory.when(() -> CollectionFactory.createStringAdaptingProperties()).thenReturn(properties);
			OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);
			//Act Statement(s)
			List<Map<String, Object>> result = target.load();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(resourceMock).getInputStream();
				collectionFactory.verify(() -> CollectionFactory.createStringAdaptingProperties(), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${404e8824-d213-36f0-8b54-662305eca404}, hash: 228A9B8DAD4EBA626751EE52C98256D7
	@Test()
	void loadTest14() throws Throwable, IOException {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: yaml - Method: loadAll
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			doReturn(null).when(resourceMock).getInputStream();
			Properties properties = new Properties();
			properties.put("asMap_object1", "");
			collectionFactory.when(() -> CollectionFactory.createStringAdaptingProperties()).thenReturn(properties);
			OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);
			//Act Statement(s)
			List<Map<String, Object>> result = target.load();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(resourceMock).getInputStream();
				collectionFactory.verify(() -> CollectionFactory.createStringAdaptingProperties(), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${8a861d5e-5546-3f08-bbf7-c31f4df78b96}, hash: AC4020DE0AA82664E5C9B9841F98A94A
	@Test()
	void loadTest15() throws Throwable, IOException {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: yaml - Method: loadAll
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(null).when(resourceMock).getInputStream();
		OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);

		//Act Statement(s)
		List<Map<String, Object>> result = target.load();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(0));
			verify(resourceMock).getInputStream();
		});
	}

	//Sapient generated method id: ${905884fe-b108-3f80-b108-d8f417ad4b2e}, hash: E8D57E0FA15BAA1124E469D4D3EFD42A
	@Test()
	void loadWhenDefaultBranch() throws Throwable, IOException {
		/* Branches:
		 * (branch expression (line 202)) : true  #  inside process method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: yaml - Method: loadAll
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			doReturn(null).when(resourceMock).getInputStream();
			Properties properties = new Properties();
			properties.put("[asMap_object1]", "");
			collectionFactory.when(() -> CollectionFactory.createStringAdaptingProperties()).thenReturn(properties);
			OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);
			//Act Statement(s)
			List<Map<String, Object>> result = target.load();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(resourceMock).getInputStream();
				collectionFactory.verify(() -> CollectionFactory.createStringAdaptingProperties(), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2b216bd1-213c-3ae7-8203-1ee6c92eb640}, hash: 19F6A34843BFA5D1F39D17FE05E33E09
	@Test()
	void loadWhenDefaultBranchThrowsThrowable() throws IOException {
		/* Branches:
		 * (branch expression (line 202)) : true  #  inside process method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: yaml - Method: loadAll
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			doReturn(null).when(resourceMock).getInputStream();
			Properties properties = new Properties();
			properties.put("[asMap_object1]", "");
			collectionFactory.when(() -> CollectionFactory.createStringAdaptingProperties()).thenReturn(properties);
			OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);
			//Act Statement(s)
			final Throwable result = assertThrows(Throwable.class, () -> {
				target.load();
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(resourceMock).getInputStream();
				collectionFactory.verify(() -> CollectionFactory.createStringAdaptingProperties(), atLeast(1));
			});
		}
	}
}
