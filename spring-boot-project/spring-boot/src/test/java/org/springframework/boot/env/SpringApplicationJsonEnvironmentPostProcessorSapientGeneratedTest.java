package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.json.JsonParseException;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.util.ClassUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import org.springframework.boot.json.JsonParser;
import org.springframework.boot.SpringApplication;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringApplicationJsonEnvironmentPostProcessorSapientGeneratedTest {

	private final ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);

	private final JsonParser jsonParserMock = mock(JsonParser.class);

	private final MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);

	private final MutablePropertySources mutablePropertySourcesMock2 = mock(MutablePropertySources.class);

	private final SpringApplication springApplicationMock = mock(SpringApplication.class);

	//Sapient generated method id: ${99159ba2-634f-301b-acba-aef10d42d902}, hash: 82F62717AE19537EC00D6C0BF3C3E762
	@Test()
	void postProcessEnvironmentWhenClassUtilsNotIsPresentSERVLET_ENVIRONMENT_CLASSNullAndSourcesNotContainsName() throws JsonParseException {
		/* Branches:
		 * (!map.isEmpty()) : true  #  inside processJson method
		 * (prefix != null) : false  #  inside flatten method
		 * (value instanceof Map) : true  #  inside extract method
		 * (CollectionUtils.isEmpty((Map<?, ?>) value)) : false  #  inside extract method
		 * (ClassUtils.isPresent(SERVLET_ENVIRONMENT_CLASS, null)) : false  #  inside findPropertySource method
		 * (sources.contains(name)) : false  #  inside addJsonPropertySource method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
			Stream stream = Stream.empty();
			doReturn(stream).when(mutablePropertySourcesMock).stream();
			doReturn(mutablePropertySourcesMock, mutablePropertySourcesMock2).when(environmentMock).getPropertySources();
			doReturn(false).when(mutablePropertySourcesMock2).contains("systemProperties");
			doNothing().when(mutablePropertySourcesMock2).addFirst((PropertySource) any());
			jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
			Map<Object, Object> anyMap = new HashMap<>();
			Map<String, Object> stringObjectMap = new HashMap<>();
			stringObjectMap.put("A", anyMap);
			doReturn(stringObjectMap).when(jsonParserMock).parseMap("json1");
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyMap())).thenReturn(false);
			classUtils.when(() -> ClassUtils.isPresent("org.springframework.web.context.support.StandardServletEnvironment", null)).thenReturn(false);
			SpringApplicationJsonEnvironmentPostProcessor target = new SpringApplicationJsonEnvironmentPostProcessor();
			//Act Statement(s)
			target.postProcessEnvironment(environmentMock, springApplicationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(environmentMock, times(2)).getPropertySources();
				verify(mutablePropertySourcesMock).stream();
				verify(mutablePropertySourcesMock2).contains("systemProperties");
				verify(mutablePropertySourcesMock2).addFirst((PropertySource) any());
				jsonParserFactory.verify(() -> JsonParserFactory.getJsonParser(), atLeast(1));
				verify(jsonParserMock).parseMap("json1");
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyMap()));
				classUtils.verify(() -> ClassUtils.isPresent("org.springframework.web.context.support.StandardServletEnvironment", null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c00d8ba9-fd0a-3b27-81cb-df61ce3e110f}, hash: 8882BB3D4E736069D42D5D0AFA83B595
	@Test()
	void postProcessEnvironmentWhenValueNotInstanceOfCollectionAndClassUtilsNotIsPresentSERVLET_ENVIRONMENT_CLASSNullAndSourcesN() throws JsonParseException {
		/* Branches:
		 * (!map.isEmpty()) : true  #  inside processJson method
		 * (prefix != null) : false  #  inside flatten method
		 * (value instanceof Map) : false  #  inside extract method
		 * (value instanceof Collection) : false  #  inside extract method
		 * (ClassUtils.isPresent(SERVLET_ENVIRONMENT_CLASS, null)) : false  #  inside findPropertySource method
		 * (sources.contains(name)) : false  #  inside addJsonPropertySource method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
			Stream stream = Stream.empty();
			doReturn(stream).when(mutablePropertySourcesMock).stream();
			doReturn(mutablePropertySourcesMock, mutablePropertySourcesMock2).when(environmentMock).getPropertySources();
			doReturn(false).when(mutablePropertySourcesMock2).contains("systemProperties");
			doNothing().when(mutablePropertySourcesMock2).addFirst((PropertySource) any());
			jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
			Object object = new Object();
			Map<String, Object> stringObjectMap = new HashMap<>();
			stringObjectMap.put("A", object);
			doReturn(stringObjectMap).when(jsonParserMock).parseMap("json1");
			classUtils.when(() -> ClassUtils.isPresent("org.springframework.web.context.support.StandardServletEnvironment", null)).thenReturn(false);
			SpringApplicationJsonEnvironmentPostProcessor target = new SpringApplicationJsonEnvironmentPostProcessor();
			//Act Statement(s)
			target.postProcessEnvironment(environmentMock, springApplicationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(environmentMock, times(2)).getPropertySources();
				verify(mutablePropertySourcesMock).stream();
				verify(mutablePropertySourcesMock2).contains("systemProperties");
				verify(mutablePropertySourcesMock2).addFirst((PropertySource) any());
				jsonParserFactory.verify(() -> JsonParserFactory.getJsonParser(), atLeast(1));
				verify(jsonParserMock).parseMap("json1");
				classUtils.verify(() -> ClassUtils.isPresent("org.springframework.web.context.support.StandardServletEnvironment", null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${baca2b8d-afd4-3335-b274-3a40ae4301d0}, hash: F024D0DB27823E8452D5498D6A787C06
	@Test()
	void postProcessEnvironmentWhenSourcesContainsName() throws JsonParseException {
		/* Branches:
		 * (!map.isEmpty()) : true  #  inside processJson method
		 * (prefix != null) : false  #  inside flatten method
		 * (value instanceof Map) : true  #  inside extract method
		 * (CollectionUtils.isEmpty((Map<?, ?>) value)) : true  #  inside extract method
		 * (ClassUtils.isPresent(SERVLET_ENVIRONMENT_CLASS, null)) : true  #  inside findPropertySource method
		 * (servletPropertySource != null) : false  #  inside findPropertySource method
		 * (sources.contains(name)) : true  #  inside addJsonPropertySource method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
			Stream stream = Stream.empty();
			doReturn(stream).when(mutablePropertySourcesMock).stream();
			doReturn(mutablePropertySourcesMock, mutablePropertySourcesMock2).when(environmentMock).getPropertySources();
			Stream stream2 = Stream.empty();
			doReturn(stream2).when(mutablePropertySourcesMock2).stream();
			doReturn(true).when(mutablePropertySourcesMock2).contains("systemProperties");
			doNothing().when(mutablePropertySourcesMock2).addBefore(eq("systemProperties"), (PropertySource) any());
			jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
			Map<Object, Object> anyMap = new HashMap<>();
			Map<String, Object> stringObjectMap = new HashMap<>();
			stringObjectMap.put("A", anyMap);
			doReturn(stringObjectMap).when(jsonParserMock).parseMap("json1");
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyMap())).thenReturn(true);
			classUtils.when(() -> ClassUtils.isPresent("org.springframework.web.context.support.StandardServletEnvironment", null)).thenReturn(true);
			SpringApplicationJsonEnvironmentPostProcessor target = new SpringApplicationJsonEnvironmentPostProcessor();
			//Act Statement(s)
			target.postProcessEnvironment(environmentMock, springApplicationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(environmentMock, times(2)).getPropertySources();
				verify(mutablePropertySourcesMock).stream();
				verify(mutablePropertySourcesMock2).stream();
				verify(mutablePropertySourcesMock2).contains("systemProperties");
				verify(mutablePropertySourcesMock2).addBefore(eq("systemProperties"), (PropertySource) any());
				jsonParserFactory.verify(() -> JsonParserFactory.getJsonParser(), atLeast(1));
				verify(jsonParserMock).parseMap("json1");
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyMap()));
				classUtils.verify(() -> ClassUtils.isPresent("org.springframework.web.context.support.StandardServletEnvironment", null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${717f0a9c-b6f1-34af-9525-28afd11c5dd8}, hash: 36D36C7670ADF0B4B37F1AF91CE82C06
	@Test()
	void postProcessEnvironmentWhenCollectionUtilsIsEmptyValueAndClassUtilsNotIsPresentSERVLET_ENVIRONMENT_CLASSNullAndSourcesNo() throws JsonParseException {
		/* Branches:
		 * (!map.isEmpty()) : true  #  inside processJson method
		 * (prefix != null) : false  #  inside flatten method
		 * (value instanceof Map) : false  #  inside extract method
		 * (value instanceof Collection) : true  #  inside extract method
		 * (CollectionUtils.isEmpty((Collection<?>) value)) : true  #  inside extract method
		 * (ClassUtils.isPresent(SERVLET_ENVIRONMENT_CLASS, null)) : false  #  inside findPropertySource method
		 * (sources.contains(name)) : false  #  inside addJsonPropertySource method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
			Stream stream = Stream.empty();
			doReturn(stream).when(mutablePropertySourcesMock).stream();
			doReturn(mutablePropertySourcesMock, mutablePropertySourcesMock2).when(environmentMock).getPropertySources();
			doReturn(false).when(mutablePropertySourcesMock2).contains("systemProperties");
			doNothing().when(mutablePropertySourcesMock2).addFirst((PropertySource) any());
			jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
			Collection<Object> collection = new ArrayList<>();
			Map<String, Object> stringObjectMap = new HashMap<>();
			stringObjectMap.put("A", collection);
			doReturn(stringObjectMap).when(jsonParserMock).parseMap("json1");
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyCollection())).thenReturn(true);
			classUtils.when(() -> ClassUtils.isPresent("org.springframework.web.context.support.StandardServletEnvironment", null)).thenReturn(false);
			SpringApplicationJsonEnvironmentPostProcessor target = new SpringApplicationJsonEnvironmentPostProcessor();
			//Act Statement(s)
			target.postProcessEnvironment(environmentMock, springApplicationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(environmentMock, times(2)).getPropertySources();
				verify(mutablePropertySourcesMock).stream();
				verify(mutablePropertySourcesMock2).contains("systemProperties");
				verify(mutablePropertySourcesMock2).addFirst((PropertySource) any());
				jsonParserFactory.verify(() -> JsonParserFactory.getJsonParser(), atLeast(1));
				verify(jsonParserMock).parseMap("json1");
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyCollection()));
				classUtils.verify(() -> ClassUtils.isPresent("org.springframework.web.context.support.StandardServletEnvironment", null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4667b870-62fc-3c9e-8b4a-826d451eadb6}, hash: 3AB2CAC069480F0FB79E8621D4DA9E9D
	@Test()
	void postProcessEnvironmentWhenClassUtilsNotIsPresentSERVLET_ENVIRONMENT_CLASSNullAndSourcesNotContainsName2() throws JsonParseException {
		/* Branches:
		 * (!map.isEmpty()) : true  #  inside processJson method
		 * (prefix != null) : false  #  inside flatten method
		 * (value instanceof Map) : false  #  inside extract method
		 * (value instanceof Collection) : true  #  inside extract method
		 * (CollectionUtils.isEmpty((Collection<?>) value)) : false  #  inside extract method
		 * (for-each((Collection<Object>) value)) : true  #  inside extract method
		 * (ClassUtils.isPresent(SERVLET_ENVIRONMENT_CLASS, null)) : false  #  inside findPropertySource method
		 * (sources.contains(name)) : false  #  inside addJsonPropertySource method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
			Stream stream = Stream.empty();
			doReturn(stream).when(mutablePropertySourcesMock).stream();
			doReturn(mutablePropertySourcesMock, mutablePropertySourcesMock2).when(environmentMock).getPropertySources();
			doReturn(false).when(mutablePropertySourcesMock2).contains("systemProperties");
			doNothing().when(mutablePropertySourcesMock2).addFirst((PropertySource) any());
			jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
			Object object = new Object();
			Collection<Object> collection = new ArrayList<>();
			collection.add(object);
			Map<String, Object> stringObjectMap = new HashMap<>();
			stringObjectMap.put("A", collection);
			doReturn(stringObjectMap).when(jsonParserMock).parseMap("json1");
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyCollection())).thenReturn(false);
			classUtils.when(() -> ClassUtils.isPresent("org.springframework.web.context.support.StandardServletEnvironment", null)).thenReturn(false);
			SpringApplicationJsonEnvironmentPostProcessor target = new SpringApplicationJsonEnvironmentPostProcessor();
			//Act Statement(s)
			target.postProcessEnvironment(environmentMock, springApplicationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(environmentMock, times(2)).getPropertySources();
				verify(mutablePropertySourcesMock).stream();
				verify(mutablePropertySourcesMock2).contains("systemProperties");
				verify(mutablePropertySourcesMock2).addFirst((PropertySource) any());
				jsonParserFactory.verify(() -> JsonParserFactory.getJsonParser(), atLeast(1));
				verify(jsonParserMock).parseMap("json1");
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyCollection()));
				classUtils.verify(() -> ClassUtils.isPresent("org.springframework.web.context.support.StandardServletEnvironment", null), atLeast(1));
			});
		}
	}
}
