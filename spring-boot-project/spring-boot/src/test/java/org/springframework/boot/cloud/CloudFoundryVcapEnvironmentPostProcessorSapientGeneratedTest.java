package org.springframework.boot.cloud;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.boot.json.JsonParserFactory;

import org.apache.commons.logging.impl.NoOpLog;

import org.springframework.util.StringUtils;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

import org.mockito.MockedStatic;

import org.springframework.boot.logging.DeferredLogFactory;

import java.util.ArrayList;

import org.springframework.boot.json.JsonParser;
import org.springframework.boot.SpringApplication;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CloudFoundryVcapEnvironmentPostProcessorSapientGeneratedTest {

	private final NoOpLog loggerMock = mock(NoOpLog.class, "logger");

	private final ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);

	private final JsonParser jsonParserMock = mock(JsonParser.class);

	private final DeferredLogFactory logFactoryMock = mock(DeferredLogFactory.class);

	private final MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);

	//Sapient generated method id: ${3455ee6d-dba6-36a0-95d4-22a28703dc49}, hash: 9480D0BB3A3DC61AF53CFD7C644DD644
	@Disabled()
	@Test()
	void postProcessEnvironmentWhenMapIsNullAndPropertySourcesNotContainsCommandLinePropertySourceCOMMAND_LINE_PROPERTY_SOURCE_N2() throws Exception {
		/* Branches:
		 * (CloudPlatform.CLOUD_FOUNDRY.isActive(environment)) : true
		 * (map != null) : true  #  inside extractPropertiesFromApplication method
		 * (!StringUtils.hasText(path)) : true  #  inside getPropertyName method
		 * (value instanceof Map) : false  #  inside lambda$flatten$0 method
		 * (value instanceof Collection) : true  #  inside lambda$flatten$0 method
		 * (for-each(collection)) : true  #  inside lambda$flatten$0 method
		 * (for-each(other.stringPropertyNames())) : true  #  inside addWithPrefix method
		 * (map != null) : false  #  inside extractPropertiesFromServices method
		 * (propertySources.contains(CommandLinePropertySource.COMMAND_LINE_PROPERTY_SOURCE_NAME)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
			Map map = null;
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_APPLICATION", "{}");
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_SERVICES", "{}");
			doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
			doReturn(false).when(mutablePropertySourcesMock).contains("commandLineArgs");
			doNothing().when(mutablePropertySourcesMock).addFirst((PropertySource) any());
			doReturn(loggerMock).when(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
			jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
			Object object = new Object();
			Collection<Object> collection = new ArrayList<>();
			collection.add(object);
			Map<String, Object> stringObjectMap = new HashMap<>();
			stringObjectMap.put("return_of_parseMapItem1Key1", collection);
			doReturn(stringObjectMap, map).when(jsonParserMock).parseMap("return_of_getProperty1");
			stringUtils.when(() -> StringUtils.hasText("")).thenReturn(false);
			stringUtils.when(() -> StringUtils.collectionToCommaDelimitedString(anyCollection())).thenReturn("<String>");
			CloudFoundryVcapEnvironmentPostProcessor target = new CloudFoundryVcapEnvironmentPostProcessor(logFactoryMock);
			Class[] classArray = new Class[] {};
			SpringApplication springApplication = new SpringApplication(classArray);
			//Act Statement(s)
			target.postProcessEnvironment(environmentMock, springApplication);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(environmentMock).getProperty("VCAP_APPLICATION", "{}");
				verify(environmentMock).getProperty("VCAP_SERVICES", "{}");
				verify(environmentMock).getPropertySources();
				verify(mutablePropertySourcesMock).contains("commandLineArgs");
				verify(mutablePropertySourcesMock).addFirst((PropertySource) any());
				verify(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
				jsonParserFactory.verify(() -> JsonParserFactory.getJsonParser(), atLeast(1));
				verify(jsonParserMock, times(2)).parseMap("return_of_getProperty1");
				stringUtils.verify(() -> StringUtils.hasText(""), atLeast(1));
				stringUtils.verify(() -> StringUtils.collectionToCommaDelimitedString(anyCollection()));
			});
		}
	}

	//Sapient generated method id: ${72a45eb0-94a7-3ba0-887e-dde4e2dd6be5}, hash: 07638D12B09C0299B8653DAD56E317A2
	@Disabled()
	@Test()
	void postProcessEnvironmentWhenMapIsNullAndPropertySourcesNotContainsCommandLinePropertySourceCOMMAND_LINE_PROPERTY_SOURCE_N4() throws Exception {
		/* Branches:
		 * (CloudPlatform.CLOUD_FOUNDRY.isActive(environment)) : true
		 * (map != null) : true  #  inside extractPropertiesFromApplication method
		 * (!StringUtils.hasText(path)) : true  #  inside getPropertyName method
		 * (value instanceof Map) : false  #  inside lambda$flatten$0 method
		 * (value instanceof Collection) : false  #  inside lambda$flatten$0 method
		 * (value instanceof String) : true  #  inside lambda$flatten$0 method
		 * (for-each(other.stringPropertyNames())) : false  #  inside addWithPrefix method
		 * (map != null) : false  #  inside extractPropertiesFromServices method
		 * (propertySources.contains(CommandLinePropertySource.COMMAND_LINE_PROPERTY_SOURCE_NAME)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
			Map map = null;
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_APPLICATION", "{}");
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_SERVICES", "{}");
			doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
			doReturn(false).when(mutablePropertySourcesMock).contains("commandLineArgs");
			doNothing().when(mutablePropertySourcesMock).addFirst((PropertySource) any());
			doReturn(loggerMock).when(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
			jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
			Map<String, Object> stringObjectMap = new HashMap<>();
			stringObjectMap.put("return_of_parseMapItem1Key1", "return_of_parseMapItem1Value1");
			doReturn(stringObjectMap, map).when(jsonParserMock).parseMap("return_of_getProperty1");
			stringUtils.when(() -> StringUtils.hasText("")).thenReturn(false);
			CloudFoundryVcapEnvironmentPostProcessor target = new CloudFoundryVcapEnvironmentPostProcessor(logFactoryMock);
			Class[] classArray = new Class[] {};
			SpringApplication springApplication = new SpringApplication(classArray);
			//Act Statement(s)
			target.postProcessEnvironment(environmentMock, springApplication);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(environmentMock).getProperty("VCAP_APPLICATION", "{}");
				verify(environmentMock).getProperty("VCAP_SERVICES", "{}");
				verify(environmentMock).getPropertySources();
				verify(mutablePropertySourcesMock).contains("commandLineArgs");
				verify(mutablePropertySourcesMock).addFirst((PropertySource) any());
				verify(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
				jsonParserFactory.verify(() -> JsonParserFactory.getJsonParser(), atLeast(1));
				verify(jsonParserMock, times(2)).parseMap("return_of_getProperty1");
				stringUtils.verify(() -> StringUtils.hasText(""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${870b8789-4c8e-359d-957f-5c7e62dfb414}, hash: 38DFC44A763D22E7666F8044E6E99E04
	@Disabled()
	@Test()
	void postProcessEnvironmentWhenPropertySourcesContainsCommandLinePropertySourceCOMMAND_LINE_PROPERTY_SOURCE_NAME() throws Exception {
		/* Branches:
		 * (CloudPlatform.CLOUD_FOUNDRY.isActive(environment)) : true
		 * (map != null) : true  #  inside extractPropertiesFromApplication method
		 * (!StringUtils.hasText(path)) : true  #  inside getPropertyName method
		 * (value instanceof Map) : true  #  inside lambda$flatten$0 method
		 * (for-each(other.stringPropertyNames())) : false  #  inside addWithPrefix method
		 * (map != null) : true  #  inside extractPropertiesFromServices method
		 * (for-each(map.values())) : true  #  inside extractPropertiesFromServices method
		 * (for-each(list)) : true  #  inside extractPropertiesFromServices method
		 * (key == null) : true  #  inside extractPropertiesFromServices method
		 * (propertySources.contains(CommandLinePropertySource.COMMAND_LINE_PROPERTY_SOURCE_NAME)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplication springApplicationMock = mock(SpringApplication.class);
		try (MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_APPLICATION", "{}");
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_SERVICES", "{}");
			doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
			doReturn(true).when(mutablePropertySourcesMock).contains("commandLineArgs");
			doNothing().when(mutablePropertySourcesMock).addAfter(eq("commandLineArgs"), (PropertySource) any());
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
			jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
			Map map = new HashMap<>();
			Map<String, Object> stringObjectMap = new HashMap<>();
			stringObjectMap.put("return_of_parseMapItem1Key1", map);
			Map map2 = new HashMap<>();
			map2.put("label", "return_of_parseMapItem1ValueItem1Item1Value1");
			map2.put("name", (String) null);
			List list = new ArrayList<>();
			list.add(map2);
			Map<String, Object> stringObjectMap2 = new HashMap<>();
			stringObjectMap2.put("0", list);
			doReturn(stringObjectMap, stringObjectMap2).when(jsonParserMock).parseMap("return_of_getProperty1");
			CloudFoundryVcapEnvironmentPostProcessor target = new CloudFoundryVcapEnvironmentPostProcessor(logFactoryMock);
			//Act Statement(s)
			target.postProcessEnvironment(environmentMock, springApplicationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(environmentMock).getProperty("VCAP_APPLICATION", "{}");
				verify(environmentMock).getProperty("VCAP_SERVICES", "{}");
				verify(environmentMock).getPropertySources();
				verify(mutablePropertySourcesMock).contains("commandLineArgs");
				verify(mutablePropertySourcesMock).addAfter(eq("commandLineArgs"), (PropertySource) any());
				verify(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
				jsonParserFactory.verify(() -> JsonParserFactory.getJsonParser(), atLeast(1));
				verify(jsonParserMock, times(2)).parseMap("return_of_getProperty1");
			});
		}
	}

	//Sapient generated method id: ${dc9d06ca-4f21-39ec-9dcd-146c1b94b9e5}, hash: 318BEA3B9CD5426CEFA6C52DEFAD87B8
	@Disabled()
	@Test()
	void postProcessEnvironmentWhenMapIsNullAndPropertySourcesNotContainsCommandLinePropertySourceCOMMAND_LINE_PROPERTY_SOURCE_N5() throws Exception {
		/* Branches:
		 * (CloudPlatform.CLOUD_FOUNDRY.isActive(environment)) : true
		 * (map != null) : true  #  inside extractPropertiesFromApplication method
		 * (!StringUtils.hasText(path)) : true  #  inside getPropertyName method
		 * (value instanceof Map) : false  #  inside lambda$flatten$0 method
		 * (value instanceof Collection) : false  #  inside lambda$flatten$0 method
		 * (value instanceof String) : false  #  inside lambda$flatten$0 method
		 * (value instanceof Number) : true  #  inside lambda$flatten$0 method
		 * (for-each(other.stringPropertyNames())) : false  #  inside addWithPrefix method
		 * (map != null) : false  #  inside extractPropertiesFromServices method
		 * (propertySources.contains(CommandLinePropertySource.COMMAND_LINE_PROPERTY_SOURCE_NAME)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
			Map map = null;
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_APPLICATION", "{}");
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_SERVICES", "{}");
			doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
			doReturn(false).when(mutablePropertySourcesMock).contains("commandLineArgs");
			doNothing().when(mutablePropertySourcesMock).addFirst((PropertySource) any());
			doReturn(loggerMock).when(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
			jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
			Map<String, Object> stringObjectMap = new HashMap<>();
			stringObjectMap.put("return_of_parseMapItem1Key1", 2);
			doReturn(stringObjectMap, map).when(jsonParserMock).parseMap("return_of_getProperty1");
			stringUtils.when(() -> StringUtils.hasText("")).thenReturn(false);
			CloudFoundryVcapEnvironmentPostProcessor target = new CloudFoundryVcapEnvironmentPostProcessor(logFactoryMock);
			Class[] classArray = new Class[] {};
			SpringApplication springApplication = new SpringApplication(classArray);
			//Act Statement(s)
			target.postProcessEnvironment(environmentMock, springApplication);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(environmentMock).getProperty("VCAP_APPLICATION", "{}");
				verify(environmentMock).getProperty("VCAP_SERVICES", "{}");
				verify(environmentMock).getPropertySources();
				verify(mutablePropertySourcesMock).contains("commandLineArgs");
				verify(mutablePropertySourcesMock).addFirst((PropertySource) any());
				verify(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
				jsonParserFactory.verify(() -> JsonParserFactory.getJsonParser(), atLeast(1));
				verify(jsonParserMock, times(2)).parseMap("return_of_getProperty1");
				stringUtils.verify(() -> StringUtils.hasText(""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a09b0f79-e2cf-3515-9ae5-056593a550d8}, hash: F61F19F36C47E30C15B582C9DC099CA5
	@Disabled()
	@Test()
	void postProcessEnvironmentWhenMapIsNullAndPropertySourcesNotContainsCommandLinePropertySourceCOMMAND_LINE_PROPERTY_SOURCE_N6() throws Exception {
		/* Branches:
		 * (CloudPlatform.CLOUD_FOUNDRY.isActive(environment)) : true
		 * (map != null) : true  #  inside extractPropertiesFromApplication method
		 * (!StringUtils.hasText(path)) : true  #  inside getPropertyName method
		 * (value instanceof Map) : false  #  inside lambda$flatten$0 method
		 * (value instanceof Collection) : false  #  inside lambda$flatten$0 method
		 * (value instanceof String) : false  #  inside lambda$flatten$0 method
		 * (value instanceof Number) : false  #  inside lambda$flatten$0 method
		 * (value instanceof Boolean) : true  #  inside lambda$flatten$0 method
		 * (for-each(other.stringPropertyNames())) : false  #  inside addWithPrefix method
		 * (map != null) : false  #  inside extractPropertiesFromServices method
		 * (propertySources.contains(CommandLinePropertySource.COMMAND_LINE_PROPERTY_SOURCE_NAME)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
			Map map = null;
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_APPLICATION", "{}");
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_SERVICES", "{}");
			doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
			doReturn(false).when(mutablePropertySourcesMock).contains("commandLineArgs");
			doNothing().when(mutablePropertySourcesMock).addFirst((PropertySource) any());
			doReturn(loggerMock).when(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
			jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
			Map<String, Object> stringObjectMap = new HashMap<>();
			stringObjectMap.put("return_of_parseMapItem1Key1", false);
			doReturn(stringObjectMap, map).when(jsonParserMock).parseMap("return_of_getProperty1");
			stringUtils.when(() -> StringUtils.hasText("")).thenReturn(false);
			CloudFoundryVcapEnvironmentPostProcessor target = new CloudFoundryVcapEnvironmentPostProcessor(logFactoryMock);
			Class[] classArray = new Class[] {};
			SpringApplication springApplication = new SpringApplication(classArray);
			//Act Statement(s)
			target.postProcessEnvironment(environmentMock, springApplication);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(environmentMock).getProperty("VCAP_APPLICATION", "{}");
				verify(environmentMock).getProperty("VCAP_SERVICES", "{}");
				verify(environmentMock).getPropertySources();
				verify(mutablePropertySourcesMock).contains("commandLineArgs");
				verify(mutablePropertySourcesMock).addFirst((PropertySource) any());
				verify(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
				jsonParserFactory.verify(() -> JsonParserFactory.getJsonParser(), atLeast(1));
				verify(jsonParserMock, times(2)).parseMap("return_of_getProperty1");
				stringUtils.verify(() -> StringUtils.hasText(""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${566092f5-898d-329e-8169-c68a6186ab7a}, hash: 847563C388B61C6C5A15D11D1CA353B4
	@Disabled()
	@Test()
	void postProcessEnvironmentWhenMapIsNullAndPropertySourcesNotContainsCommandLinePropertySourceCOMMAND_LINE_PROPERTY_SOURCE_N7() throws Exception {
		/* Branches:
		 * (CloudPlatform.CLOUD_FOUNDRY.isActive(environment)) : true
		 * (map != null) : true  #  inside extractPropertiesFromApplication method
		 * (!StringUtils.hasText(path)) : true  #  inside getPropertyName method
		 * (value instanceof Map) : false  #  inside lambda$flatten$0 method
		 * (value instanceof Collection) : false  #  inside lambda$flatten$0 method
		 * (value instanceof String) : false  #  inside lambda$flatten$0 method
		 * (value instanceof Number) : false  #  inside lambda$flatten$0 method
		 * (value instanceof Boolean) : false  #  inside lambda$flatten$0 method
		 * (value != null) : true  #  inside lambda$flatten$0 method
		 * (for-each(other.stringPropertyNames())) : false  #  inside addWithPrefix method
		 * (map != null) : false  #  inside extractPropertiesFromServices method
		 * (propertySources.contains(CommandLinePropertySource.COMMAND_LINE_PROPERTY_SOURCE_NAME)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
			Map map = null;
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_APPLICATION", "{}");
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_SERVICES", "{}");
			doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
			doReturn(false).when(mutablePropertySourcesMock).contains("commandLineArgs");
			doNothing().when(mutablePropertySourcesMock).addFirst((PropertySource) any());
			doReturn(loggerMock).when(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
			jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
			Object object = new Object();
			Map<String, Object> stringObjectMap = new HashMap<>();
			stringObjectMap.put("return_of_parseMapItem1Key1", object);
			doReturn(stringObjectMap, map).when(jsonParserMock).parseMap("return_of_getProperty1");
			stringUtils.when(() -> StringUtils.hasText("")).thenReturn(false);
			CloudFoundryVcapEnvironmentPostProcessor target = new CloudFoundryVcapEnvironmentPostProcessor(logFactoryMock);
			Class[] classArray = new Class[] {};
			SpringApplication springApplication = new SpringApplication(classArray);
			//Act Statement(s)
			target.postProcessEnvironment(environmentMock, springApplication);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(environmentMock).getProperty("VCAP_APPLICATION", "{}");
				verify(environmentMock).getProperty("VCAP_SERVICES", "{}");
				verify(environmentMock).getPropertySources();
				verify(mutablePropertySourcesMock).contains("commandLineArgs");
				verify(mutablePropertySourcesMock).addFirst((PropertySource) any());
				verify(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
				jsonParserFactory.verify(() -> JsonParserFactory.getJsonParser(), atLeast(1));
				verify(jsonParserMock, times(2)).parseMap("return_of_getProperty1");
				stringUtils.verify(() -> StringUtils.hasText(""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${89f1d8f4-9989-3c64-837e-cbd3f8d9128b}, hash: 793029861A1FE27C75873C064361B74F
	@Disabled()
	@Test()
	void postProcessEnvironmentWhenMapIsNullAndPropertySourcesNotContainsCommandLinePropertySourceCOMMAND_LINE_PROPERTY_SOURCE_N8() throws Exception {
		/* Branches:
		 * (CloudPlatform.CLOUD_FOUNDRY.isActive(environment)) : true
		 * (map != null) : true  #  inside extractPropertiesFromApplication method
		 * (!StringUtils.hasText(path)) : true  #  inside getPropertyName method
		 * (value instanceof Map) : false  #  inside lambda$flatten$0 method
		 * (value instanceof Collection) : false  #  inside lambda$flatten$0 method
		 * (value instanceof String) : false  #  inside lambda$flatten$0 method
		 * (value instanceof Number) : false  #  inside lambda$flatten$0 method
		 * (value instanceof Boolean) : false  #  inside lambda$flatten$0 method
		 * (value != null) : false  #  inside lambda$flatten$0 method
		 * (for-each(other.stringPropertyNames())) : false  #  inside addWithPrefix method
		 * (map != null) : false  #  inside extractPropertiesFromServices method
		 * (propertySources.contains(CommandLinePropertySource.COMMAND_LINE_PROPERTY_SOURCE_NAME)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
			Map map = null;
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_APPLICATION", "{}");
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_SERVICES", "{}");
			doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
			doReturn(false).when(mutablePropertySourcesMock).contains("commandLineArgs");
			doNothing().when(mutablePropertySourcesMock).addFirst((PropertySource) any());
			doReturn(loggerMock).when(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
			jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
			Map<String, Object> stringObjectMap = new HashMap<>();
			stringObjectMap.put("return_of_parseMapItem1Key1", (Object) null);
			doReturn(stringObjectMap, map).when(jsonParserMock).parseMap("return_of_getProperty1");
			stringUtils.when(() -> StringUtils.hasText("")).thenReturn(false);
			CloudFoundryVcapEnvironmentPostProcessor target = new CloudFoundryVcapEnvironmentPostProcessor(logFactoryMock);
			Class[] classArray = new Class[] {};
			SpringApplication springApplication = new SpringApplication(classArray);
			//Act Statement(s)
			target.postProcessEnvironment(environmentMock, springApplication);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(environmentMock).getProperty("VCAP_APPLICATION", "{}");
				verify(environmentMock).getProperty("VCAP_SERVICES", "{}");
				verify(environmentMock).getPropertySources();
				verify(mutablePropertySourcesMock).contains("commandLineArgs");
				verify(mutablePropertySourcesMock).addFirst((PropertySource) any());
				verify(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
				jsonParserFactory.verify(() -> JsonParserFactory.getJsonParser(), atLeast(1));
				verify(jsonParserMock, times(2)).parseMap("return_of_getProperty1");
				stringUtils.verify(() -> StringUtils.hasText(""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e493d1ff-cdb6-3754-9135-8cc89c2c4047}, hash: 3FDBCE4D44CBB16B65F97C416D6FE906
	@Disabled()
	@Test()
	void postProcessEnvironmentWhenMapIsNullAndPropertySourcesContainsCommandLinePropertySourceCOMMAND_LINE_PROPERTY_SOURCE_NAME() throws Exception {
		/* Branches:
		 * (CloudPlatform.CLOUD_FOUNDRY.isActive(environment)) : true
		 * (map != null) : true  #  inside extractPropertiesFromApplication method
		 * (!StringUtils.hasText(path)) : true  #  inside getPropertyName method
		 * (value instanceof Map) : false  #  inside lambda$flatten$0 method
		 * (value instanceof Collection) : false  #  inside lambda$flatten$0 method
		 * (value instanceof String) : false  #  inside lambda$flatten$0 method
		 * (value instanceof Number) : false  #  inside lambda$flatten$0 method
		 * (value instanceof Boolean) : false  #  inside lambda$flatten$0 method
		 * (value != null) : false  #  inside lambda$flatten$0 method
		 * (catch-exception (Exception)) : true  #  inside getPropertiesFromApplication method
		 * (for-each(other.stringPropertyNames())) : true  #  inside addWithPrefix method
		 * (map != null) : false  #  inside extractPropertiesFromServices method
		 * (propertySources.contains(CommandLinePropertySource.COMMAND_LINE_PROPERTY_SOURCE_NAME)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
			Map map = null;
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_APPLICATION", "{}");
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_SERVICES", "{}");
			doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
			doReturn(false).when(mutablePropertySourcesMock).contains("commandLineArgs");
			doNothing().when(mutablePropertySourcesMock).addFirst((PropertySource) any());
			doReturn(loggerMock).when(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
			jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
			Map<String, Object> stringObjectMap = new HashMap<>();
			stringObjectMap.put("return_of_parseMapItem1Key1", (Object) null);
			doReturn(stringObjectMap, map).when(jsonParserMock).parseMap("return_of_getProperty1");
			stringUtils.when(() -> StringUtils.hasText("")).thenReturn(false);
			CloudFoundryVcapEnvironmentPostProcessor target = new CloudFoundryVcapEnvironmentPostProcessor(logFactoryMock);
			Exception exception = new Exception();
			doNothing().when(loggerMock).error("Could not parse VCAP_APPLICATION", exception);
			Class[] classArray = new Class[] {};
			SpringApplication springApplication = new SpringApplication(classArray);
			//Act Statement(s)
			target.postProcessEnvironment(environmentMock, springApplication);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(environmentMock).getProperty("VCAP_APPLICATION", "{}");
				verify(environmentMock).getProperty("VCAP_SERVICES", "{}");
				verify(environmentMock).getPropertySources();
				verify(mutablePropertySourcesMock).contains("commandLineArgs");
				verify(mutablePropertySourcesMock).addFirst((PropertySource) any());
				verify(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
				jsonParserFactory.verify(() -> JsonParserFactory.getJsonParser(), atLeast(1));
				verify(jsonParserMock, times(2)).parseMap("return_of_getProperty1");
				stringUtils.verify(() -> StringUtils.hasText(""), atLeast(1));
				verify(loggerMock).error("Could not parse VCAP_APPLICATION", exception);
			});
		}
	}
}
