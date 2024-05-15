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
import static org.mockito.Mockito.CALLS_REAL_METHODS;
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

    private final ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);

    private final JsonParser jsonParserMock = mock(JsonParser.class);

    private final DeferredLogFactory logFactoryMock = mock(DeferredLogFactory.class);

    private final MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);

    private final SpringApplication springApplicationMock = mock(SpringApplication.class);

    //Sapient generated method id: ${postProcessEnvironmentWhenMapIsNullAndPropertySourcesNotContainsCommandLinePropertySourceCOMMAND_LINE_PROPERTY_SOURCE_N2}, hash: 462C73AB6BE480F2A428589F6D1BC6E9
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
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class, CALLS_REAL_METHODS);
            MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
            Map map = null;
            doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_APPLICATION", "{}");
            doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_SERVICES", "{}");
            doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
            doReturn(false).when(mutablePropertySourcesMock).contains("commandLineArgs");
            doNothing().when(mutablePropertySourcesMock).addFirst((PropertySource) any());
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
            jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
            Object object = new Object();
            Collection<Object> collection = new ArrayList<>();
            collection.add(object);
            Map<String, Object> stringObjectMap = new HashMap<>();
            stringObjectMap.put("A", collection);
            doReturn(stringObjectMap, map).when(jsonParserMock).parseMap("return_of_getProperty1");
            stringUtils.when(() -> StringUtils.collectionToCommaDelimitedString(anyCollection())).thenReturn("B");
            CloudFoundryVcapEnvironmentPostProcessor target = new CloudFoundryVcapEnvironmentPostProcessor(logFactoryMock);
            //Act Statement(s)
            target.postProcessEnvironment(environmentMock, springApplicationMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(environmentMock, atLeast(1)).getProperty("VCAP_APPLICATION", "{}");
                verify(environmentMock, atLeast(1)).getProperty("VCAP_SERVICES", "{}");
                verify(environmentMock, atLeast(1)).getPropertySources();
                verify(mutablePropertySourcesMock, atLeast(1)).contains("commandLineArgs");
                verify(mutablePropertySourcesMock, atLeast(1)).addFirst((PropertySource) any());
                verify(logFactoryMock, atLeast(1)).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
                jsonParserFactory.verify(() -> JsonParserFactory.getJsonParser(), atLeast(1));
                verify(jsonParserMock, times(2)).parseMap("return_of_getProperty1");
                stringUtils.verify(() -> StringUtils.collectionToCommaDelimitedString(anyCollection()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${postProcessEnvironmentWhenMapIsNullAndPropertySourcesNotContainsCommandLinePropertySourceCOMMAND_LINE_PROPERTY_SOURCE_N5}, hash: 8D7E2E250D3E337AE041897E68EEEB1D
    @Disabled()
    @Test()
    void postProcessEnvironmentWhenMapIsNullAndPropertySourcesNotContainsCommandLinePropertySourceCOMMAND_LINE_PROPERTY_SOURCE_N5() throws Exception {
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
        try (MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
            Map map = null;
            doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_APPLICATION", "{}");
            doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_SERVICES", "{}");
            doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
            doReturn(false).when(mutablePropertySourcesMock).contains("commandLineArgs");
            doNothing().when(mutablePropertySourcesMock).addFirst((PropertySource) any());
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
            jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
            Map<String, Object> stringObjectMap = new HashMap<>();
            stringObjectMap.put("return_of_parseMapItem1Key1", "return_of_parseMapItem1Value1");
            doReturn(stringObjectMap, map).when(jsonParserMock).parseMap("return_of_getProperty1");
            CloudFoundryVcapEnvironmentPostProcessor target = new CloudFoundryVcapEnvironmentPostProcessor(logFactoryMock);
            //Act Statement(s)
            target.postProcessEnvironment(environmentMock, springApplicationMock);
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
            });
        }
    }

    //Sapient generated method id: ${postProcessEnvironmentWhenPropertySourcesContainsCommandLinePropertySourceCOMMAND_LINE_PROPERTY_SOURCE_NAME}, hash: 0419FC5B2B46022792ECD0D793C3C211
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

    //Sapient generated method id: ${postProcessEnvironmentWhenMapIsNullAndPropertySourcesNotContainsCommandLinePropertySourceCOMMAND_LINE_PROPERTY_SOURCE_N6}, hash: 936C8F14D69DBAFA8D74C32C2BCA1BDF
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
         * (value instanceof Number) : true  #  inside lambda$flatten$0 method
         * (for-each(other.stringPropertyNames())) : false  #  inside addWithPrefix method
         * (map != null) : false  #  inside extractPropertiesFromServices method
         * (propertySources.contains(CommandLinePropertySource.COMMAND_LINE_PROPERTY_SOURCE_NAME)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
            Map map = null;
            doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_APPLICATION", "{}");
            doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_SERVICES", "{}");
            doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
            doReturn(false).when(mutablePropertySourcesMock).contains("commandLineArgs");
            doNothing().when(mutablePropertySourcesMock).addFirst((PropertySource) any());
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
            jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
            Map<String, Object> stringObjectMap = new HashMap<>();
            stringObjectMap.put("return_of_parseMapItem1Key1", 2);
            doReturn(stringObjectMap, map).when(jsonParserMock).parseMap("return_of_getProperty1");
            CloudFoundryVcapEnvironmentPostProcessor target = new CloudFoundryVcapEnvironmentPostProcessor(logFactoryMock);
            //Act Statement(s)
            target.postProcessEnvironment(environmentMock, springApplicationMock);
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
            });
        }
    }

    //Sapient generated method id: ${postProcessEnvironmentWhenMapIsNullAndPropertySourcesNotContainsCommandLinePropertySourceCOMMAND_LINE_PROPERTY_SOURCE_N7}, hash: DA652B8A51F472BBE8B0F171874C970F
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
         * (value instanceof Boolean) : true  #  inside lambda$flatten$0 method
         * (for-each(other.stringPropertyNames())) : false  #  inside addWithPrefix method
         * (map != null) : false  #  inside extractPropertiesFromServices method
         * (propertySources.contains(CommandLinePropertySource.COMMAND_LINE_PROPERTY_SOURCE_NAME)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
            Map map = null;
            doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_APPLICATION", "{}");
            doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_SERVICES", "{}");
            doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
            doReturn(false).when(mutablePropertySourcesMock).contains("commandLineArgs");
            doNothing().when(mutablePropertySourcesMock).addFirst((PropertySource) any());
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
            jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
            Map<String, Object> stringObjectMap = new HashMap<>();
            stringObjectMap.put("return_of_parseMapItem1Key1", false);
            doReturn(stringObjectMap, map).when(jsonParserMock).parseMap("return_of_getProperty1");
            CloudFoundryVcapEnvironmentPostProcessor target = new CloudFoundryVcapEnvironmentPostProcessor(logFactoryMock);
            //Act Statement(s)
            target.postProcessEnvironment(environmentMock, springApplicationMock);
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
            });
        }
    }

    //Sapient generated method id: ${postProcessEnvironmentWhenMapIsNullAndPropertySourcesNotContainsCommandLinePropertySourceCOMMAND_LINE_PROPERTY_SOURCE_N8}, hash: D88D40F4FE2E80C037C9F4254B309EBE
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
         * (value != null) : true  #  inside lambda$flatten$0 method
         * (for-each(other.stringPropertyNames())) : false  #  inside addWithPrefix method
         * (map != null) : false  #  inside extractPropertiesFromServices method
         * (propertySources.contains(CommandLinePropertySource.COMMAND_LINE_PROPERTY_SOURCE_NAME)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
            Map map = null;
            doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_APPLICATION", "{}");
            doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_SERVICES", "{}");
            doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
            doReturn(false).when(mutablePropertySourcesMock).contains("commandLineArgs");
            doNothing().when(mutablePropertySourcesMock).addFirst((PropertySource) any());
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
            jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
            Object object = new Object();
            Map<String, Object> stringObjectMap = new HashMap<>();
            stringObjectMap.put("return_of_parseMapItem1Key1", object);
            doReturn(stringObjectMap, map).when(jsonParserMock).parseMap("return_of_getProperty1");
            CloudFoundryVcapEnvironmentPostProcessor target = new CloudFoundryVcapEnvironmentPostProcessor(logFactoryMock);
            //Act Statement(s)
            target.postProcessEnvironment(environmentMock, springApplicationMock);
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
            });
        }
    }

    //Sapient generated method id: ${postProcessEnvironmentWhenMapIsNullAndPropertySourcesNotContainsCommandLinePropertySourceCOMMAND_LINE_PROPERTY_SOURCE_N9}, hash: 260DD31DD0B42B1A91DF8F3A93921A65
    @Disabled()
    @Test()
    void postProcessEnvironmentWhenMapIsNullAndPropertySourcesNotContainsCommandLinePropertySourceCOMMAND_LINE_PROPERTY_SOURCE_N9() throws Exception {
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
        try (MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
            Map map = null;
            doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_APPLICATION", "{}");
            doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_SERVICES", "{}");
            doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
            doReturn(false).when(mutablePropertySourcesMock).contains("commandLineArgs");
            doNothing().when(mutablePropertySourcesMock).addFirst((PropertySource) any());
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
            jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
            Map<String, Object> stringObjectMap = new HashMap<>();
            stringObjectMap.put("return_of_parseMapItem1Key1", (Object) null);
            doReturn(stringObjectMap, map).when(jsonParserMock).parseMap("return_of_getProperty1");
            CloudFoundryVcapEnvironmentPostProcessor target = new CloudFoundryVcapEnvironmentPostProcessor(logFactoryMock);
            //Act Statement(s)
            target.postProcessEnvironment(environmentMock, springApplicationMock);
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
            });
        }
    }

    //Sapient generated method id: ${postProcessEnvironmentWhenMapIsNullAndPropertySourcesContainsCommandLinePropertySourceCOMMAND_LINE_PROPERTY_SOURCE_NAME}, hash: ACB03660086EECB01B0132353093A80E
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
        try (MockedStatic<JsonParserFactory> jsonParserFactory = mockStatic(JsonParserFactory.class)) {
            Map map = null;
            doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_APPLICATION", "{}");
            doReturn("return_of_getProperty1").when(environmentMock).getProperty("VCAP_SERVICES", "{}");
            doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
            doReturn(true).when(mutablePropertySourcesMock).contains("commandLineArgs");
            doNothing().when(mutablePropertySourcesMock).addAfter(eq("commandLineArgs"), (PropertySource) any());
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(CloudFoundryVcapEnvironmentPostProcessor.class);
            jsonParserFactory.when(() -> JsonParserFactory.getJsonParser()).thenReturn(jsonParserMock);
            Map<String, Object> stringObjectMap = new HashMap<>();
            stringObjectMap.put("", (Object) null);
            doReturn(stringObjectMap, map).when(jsonParserMock).parseMap("return_of_getProperty1");
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
}
