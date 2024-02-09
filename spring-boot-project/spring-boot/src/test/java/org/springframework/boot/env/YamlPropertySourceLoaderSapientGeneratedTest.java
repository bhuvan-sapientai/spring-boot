package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.core.io.Resource;

import java.util.ArrayList;

import org.springframework.core.env.PropertySource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class YamlPropertySourceLoaderSapientGeneratedTest {

	private final Resource resourceMock = mock(Resource.class);

	//Sapient generated method id: ${e5775840-1d99-3e20-930e-2dffacb7a5ab}
	@Test()
	void getFileExtensionsTest() {
		//Arrange Statement(s)
		YamlPropertySourceLoader target = new YamlPropertySourceLoader();
		//Act Statement(s)
		String[] result = target.getFileExtensions();
		String[] stringResultArray = new String[] { "yml", "yaml" };
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
	}

	//Sapient generated method id: ${48a82a1b-89f6-3338-8f76-89ea83fc5629}
	@Disabled()
	@Test()
	void loadWhenLoadedIsEmpty() throws IOException {
		/* Branches:
		 * (!ClassUtils.isPresent("org.yaml.snakeyaml.Yaml", getClass().getClassLoader())) : false
		 * (loaded.isEmpty()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: org.springframework.boot.env.OriginTrackedYamlLoader
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		YamlPropertySourceLoader target = new YamlPropertySourceLoader();
		//Act Statement(s)
		List<PropertySource<?>> result = target.load("name1", resourceMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${581ebd9a-f59e-3122-a649-a85ffe224ec8}
	@Disabled()
	@Test()
	void loadWhenLoadedSizeNotEquals1() throws IOException {
		/* Branches:
		 * (!ClassUtils.isPresent("org.yaml.snakeyaml.Yaml", getClass().getClassLoader())) : false
		 * (loaded.isEmpty()) : false
		 * (i < loaded.size()) : true
		 * (loaded.size() != 1) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: org.springframework.boot.env.OriginTrackedYamlLoader
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		YamlPropertySourceLoader target = new YamlPropertySourceLoader();
		//Act Statement(s)
		List<PropertySource<?>> result = target.load("A", resourceMock);
		Map<String, Object> stringObjectMap = new HashMap<>();
		OriginTrackedMapPropertySource originTrackedMapPropertySource = new OriginTrackedMapPropertySource("A (document #0)", stringObjectMap, true);
		List<PropertySource<?>> anyList = new ArrayList<>(2);
		anyList.add(originTrackedMapPropertySource);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(anyList.size()));
			assertThat(result, containsInRelativeOrder(anyList.toArray()));
		});
	}

	//Sapient generated method id: ${deb6f7f9-444f-387e-bf70-330b22a79b9b}
	@Disabled()
	@Test()
	void loadWhenLoadedSizeEquals1() throws IOException {
		/* Branches:
		 * (!ClassUtils.isPresent("org.yaml.snakeyaml.Yaml", getClass().getClassLoader())) : false
		 * (loaded.isEmpty()) : false
		 * (i < loaded.size()) : true
		 * (loaded.size() != 1) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: org.springframework.boot.env.OriginTrackedYamlLoader
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		YamlPropertySourceLoader target = new YamlPropertySourceLoader();
		//Act Statement(s)
		List<PropertySource<?>> result = target.load("A", resourceMock);
		Map<String, Object> stringObjectMap = new HashMap<>();
		OriginTrackedMapPropertySource originTrackedMapPropertySource = new OriginTrackedMapPropertySource("A", stringObjectMap, true);
		List<PropertySource<?>> anyList = new ArrayList<>(1);
		anyList.add(originTrackedMapPropertySource);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(anyList.size()));
			assertThat(result, containsInRelativeOrder(anyList.toArray()));
		});
	}
}
