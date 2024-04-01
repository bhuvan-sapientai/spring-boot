package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import org.springframework.core.io.Resource;
import org.springframework.core.env.PropertySource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class YamlPropertySourceLoaderSapientGeneratedTest {

	private final Resource resourceMock = mock(Resource.class);

	//Sapient generated method id: ${e5775840-1d99-3e20-930e-2dffacb7a5ab}, hash: 329510E34E56C937E0618CC6A2066EDC
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

	//Sapient generated method id: ${48a82a1b-89f6-3338-8f76-89ea83fc5629}, hash: C11B3E365F9374D832BBC8651FECC411
	@Disabled()
	@Test()
	void loadWhenLoadedIsEmpty() throws IOException {
		/* Branches:
		 * (!ClassUtils.isPresent("org.yaml.snakeyaml.Yaml", getClass().getClassLoader())) : false
		 * (loaded.isEmpty()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type OriginTrackedYamlLoader
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		YamlPropertySourceLoader target = new YamlPropertySourceLoader();
		//Act Statement(s)
		List<PropertySource<?>> result = target.load("name1", resourceMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${581ebd9a-f59e-3122-a649-a85ffe224ec8}, hash: 3B07F152DA79A6D4F652E6CB58977446
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
		 *  Following variables could not be isolated/mocked: object of type OriginTrackedYamlLoader
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		YamlPropertySourceLoader target = new YamlPropertySourceLoader();
		//Act Statement(s)
		List<PropertySource<?>> result = target.load("A", resourceMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(1));
			assertThat(result.get(0), is(instanceOf(PropertySource.class)));
		});
	}

	//Sapient generated method id: ${deb6f7f9-444f-387e-bf70-330b22a79b9b}, hash: 23870A971773F478B5F3F33ED1975DAC
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
		 *  Following variables could not be isolated/mocked: object of type OriginTrackedYamlLoader
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		YamlPropertySourceLoader target = new YamlPropertySourceLoader();
		//Act Statement(s)
		List<PropertySource<?>> result = target.load("A", resourceMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(1));
			assertThat(result.get(0), is(instanceOf(PropertySource.class)));
		});
	}
}
