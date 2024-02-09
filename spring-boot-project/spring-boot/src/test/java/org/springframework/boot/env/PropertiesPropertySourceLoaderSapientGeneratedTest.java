package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.core.env.PropertySource;
import org.springframework.boot.origin.OriginTrackedValue;

import java.util.Map;
import java.util.HashMap;

import org.springframework.core.io.Resource;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.Properties;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PropertiesPropertySourceLoaderSapientGeneratedTest {

	private final Resource resourceMock = mock(Resource.class);

	//Sapient generated method id: ${e5775840-1d99-3e20-930e-2dffacb7a5ab}
	@Test()
	void getFileExtensionsTest() {
		//Arrange Statement(s)
		PropertiesPropertySourceLoader target = new PropertiesPropertySourceLoader();
		//Act Statement(s)
		String[] result = target.getFileExtensions();
		String[] stringResultArray = new String[] { "properties", "xml" };
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
	}

	//Sapient generated method id: ${e5f3c87b-01a0-336d-9329-02d56ab20658}
	@Test()
	void loadWhenILessThanPropertiesSizeAndPropertiesSizeEquals1() throws IOException {
		/* Branches:
		 * (filename != null) : true  #  inside loadProperties method
		 * (filename.endsWith(XML_FILE_EXTENSION)) : true  #  inside loadProperties method
		 * (properties.isEmpty()) : false
		 * (i < properties.size()) : true
		 * (properties.size() != 1) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<PropertiesLoaderUtils> propertiesLoaderUtils = mockStatic(PropertiesLoaderUtils.class)) {
			doReturn(".xml").when(resourceMock).getFilename();
			Properties properties = new Properties();
			propertiesLoaderUtils.when(() -> PropertiesLoaderUtils.loadProperties(resourceMock)).thenReturn(properties);
			PropertiesPropertySourceLoader target = new PropertiesPropertySourceLoader();
			//Act Statement(s)
			List<PropertySource<?>> result = target.load("A", resourceMock);
			Map map = new HashMap<>();
			OriginTrackedMapPropertySource originTrackedMapPropertySource = new OriginTrackedMapPropertySource("A", map, true);
			List<PropertySource<?>> anyList = new ArrayList<>(1);
			anyList.add(originTrackedMapPropertySource);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(anyList.size()));
				assertThat(result, containsInRelativeOrder(anyList.toArray()));
				verify(resourceMock).getFilename();
				propertiesLoaderUtils.verify(() -> PropertiesLoaderUtils.loadProperties(resourceMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a1993d7b-2d9c-3ea6-a202-f69d3c9eca30}
	@Disabled()
	@Test()
	void loadWhenPropertiesNotIsEmptyAndILessThanPropertiesSizeAndPropertiesSizeEquals1() throws IOException {
		/* Branches:
		 * (filename != null) : true  #  inside loadProperties method
		 * (filename.endsWith(XML_FILE_EXTENSION)) : false  #  inside loadProperties method
		 * (properties.isEmpty()) : false
		 * (i < properties.size()) : true
		 * (properties.size() != 1) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn("ABCD").when(resourceMock).getFilename();
		PropertiesPropertySourceLoader target = new PropertiesPropertySourceLoader();
		//Act Statement(s)
		List<PropertySource<?>> result = target.load("", resourceMock);
		Map<String, OriginTrackedValue> stringOriginTrackedValueMap = new HashMap<>();
		OriginTrackedMapPropertySource originTrackedMapPropertySource = new OriginTrackedMapPropertySource("", stringOriginTrackedValueMap, true);
		List<PropertySource<?>> anyList = new ArrayList<>(1);
		anyList.add(originTrackedMapPropertySource);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(anyList.size()));
			assertThat(result, containsInRelativeOrder(anyList.toArray()));
			verify(resourceMock).getFilename();
		});
	}
}
