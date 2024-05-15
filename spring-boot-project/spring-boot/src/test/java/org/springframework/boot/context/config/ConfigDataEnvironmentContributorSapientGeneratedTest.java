package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.springframework.boot.context.properties.bind.Binder;
import java.util.Spliterator;
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

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataEnvironmentContributorSapientGeneratedTest {

    private final ConfigDataProperties propertiesMock = mock(ConfigDataProperties.class, "properties");

    private final ConfigData.Options configDataOptionsMock = mock(ConfigData.Options.class, "configDataOptions");

    private final ConfigDataActivationContext configDataActivationContextMock = mock(ConfigDataActivationContext.class);

    private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock = mock(ConfigDataEnvironmentContributor.class);

    private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock2 = mock(ConfigDataEnvironmentContributor.class);

    private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock3 = mock(ConfigDataEnvironmentContributor.class);

    private final ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class);

    private final ConfigDataLocation configDataLocationMock2 = mock(ConfigDataLocation.class);

    private final ConfigData configDataMock = mock(ConfigData.class);

    private final ConfigData.Options configDataOptionsMock2 = mock(ConfigData.Options.class);

    private final ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class);

    private final ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);

    private final ConfigDataEnvironmentContributor contributorMock = mock(ConfigDataEnvironmentContributor.class);

    private final PropertySource<?> propertySourceMock = mock(PropertySource.class);

    //Sapient generated method id: ${isActiveWhenThisKindEqualsKindUNBOUND_IMPORT}, hash: 940B2C3EFCF1F4728C786FBAB7B88FC0
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

    //Sapient generated method id: ${isActiveWhenThisPropertiesIsActiveActivationContext}, hash: 762B88C53F162C8D2F90ACA15AD5BCC9
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

    //Sapient generated method id: ${isActiveWhenThisPropertiesNotIsActiveActivationContext}, hash: BC3F908D52EB1FC3B59BE5FA469ADB1B
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

    //Sapient generated method id: ${hasConfigDataOptionWhenThisConfigDataOptionsContainsOption}, hash: 5243100BCBBAAC55FB1E99B66E411FA0
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

    //Sapient generated method id: ${hasConfigDataOptionWhenThisConfigDataOptionsNotContainsOption}, hash: 3E62902359E5BFE9806AFE6BD50E993F
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

    //Sapient generated method id: ${withoutConfigDataOptionWhenDefaultBranch}, hash: 43E93299643386522F1BA3BD0EB665D0
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
        //Assert statement(s)
        //TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(configDataOptionsMock).without(ConfigData.Option.IGNORE_IMPORTS);
        });
    }

    //Sapient generated method id: ${withoutConfigDataOptionWhenDefaultBranchAndDefaultBranch}, hash: F9C4CBFAAC8534C0B6C9499C80D02BB2
    @Test()
    void withoutConfigDataOptionWhenDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (branch expression (line 102)) : false  #  inside <init> method
         * (branch expression (line 103)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, (Map) null);
        doReturn(null).when(configDataOptionsMock).without(ConfigData.Option.IGNORE_IMPORTS);
        //Act Statement(s)
        ConfigDataEnvironmentContributor result = target.withoutConfigDataOption(ConfigData.Option.IGNORE_IMPORTS);
        //Assert statement(s)
        //TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(configDataOptionsMock).without(ConfigData.Option.IGNORE_IMPORTS);
        });
    }

    //Sapient generated method id: ${getImportsWhenThisPropertiesIsNotNull}, hash: 565818CDA735B8BC5B3C49D9B72F2CC6
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

    //Sapient generated method id: ${getImportsWhenThisPropertiesIsNull}, hash: 8521DCF6B529E53AA623B271F28698D9
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

    //Sapient generated method id: ${hasUnprocessedImportsWhenGetImportsIsEmpty}, hash: E17A48A0A1C50F8A48850208BA2758A7
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

    //Sapient generated method id: ${hasUnprocessedImportsWhenThisChildrenNotContainsKeyImportPhase}, hash: CF1E1FC113B54C0403D9A70DC2B6DA9B
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

    //Sapient generated method id: ${hasUnprocessedImportsWhenThisChildrenContainsKeyImportPhase}, hash: 8142236F0BD84B03F7E4035E995DAAB1
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

    //Sapient generated method id: ${getChildrenTest}, hash: 05F4745F49F7A966671188C5850EE89C
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

    //Sapient generated method id: ${streamTest}, hash: E59ECF7554ACD41D617B8DDF8ED024B3
    @Test()
    void streamTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
        ConfigDataEnvironmentContributor target = spy(new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap));
        Spliterator spliteratorMock = mock(Spliterator.class);
        doReturn(spliteratorMock).when(target).spliterator();
        //Act Statement(s)
        Stream<ConfigDataEnvironmentContributor> result = target.stream();
        //Assert statement(s)
        //TODO: Please implement equals method in Stream for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(target).spliterator();
        });
    }

    //Sapient generated method id: ${iteratorTest}, hash: D2B556A9835E51269E56D7608FC15299
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

    //Sapient generated method id: ${withBoundPropertiesWhenDefaultBranchAndDefaultBranch}, hash: 4804CF8EF2AB4168C48F1F8C65711B8E
    @Test()
    void withBoundPropertiesWhenDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (properties != null) : false
         * (branch expression (line 102)) : false  #  inside <init> method
         * (branch expression (line 103)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigDataProperties> configDataProperties = mockStatic(ConfigDataProperties.class)) {
            configDataProperties.when(() -> ConfigDataProperties.get((Binder) any())).thenReturn(null);
            Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
            ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, (ConfigData.Options) null, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
            Iterable<ConfigDataEnvironmentContributor> iterable = new ArrayList<>();
            //Act Statement(s)
            ConfigDataEnvironmentContributor result = target.withBoundProperties(iterable, configDataActivationContextMock);
            //Assert statement(s)
            //TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                configDataProperties.verify(() -> ConfigDataProperties.get((Binder) any()));
            });
        }
    }

    //Sapient generated method id: ${withBoundPropertiesWhenThisConfigDataOptionsContainsConfigDataOptionIGNORE_IMPORTSAndDefaultBranchAndDefaultBranch}, hash: 685182A94D45BCCC713AAC053C46384C
    @Test()
    void withBoundPropertiesWhenThisConfigDataOptionsContainsConfigDataOptionIGNORE_IMPORTSAndDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (properties != null) : true
         * (this.configDataOptions.contains(ConfigData.Option.IGNORE_IMPORTS)) : true
         * (branch expression (line 102)) : false  #  inside <init> method
         * (branch expression (line 103)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        ConfigDataProperties configDataPropertiesMock = mock(ConfigDataProperties.class);
        ConfigDataProperties configDataPropertiesMock2 = mock(ConfigDataProperties.class);
        try (MockedStatic<ConfigDataProperties> configDataProperties = mockStatic(ConfigDataProperties.class)) {
            configDataProperties.when(() -> ConfigDataProperties.get((Binder) any())).thenReturn(configDataPropertiesMock);
            doReturn(configDataPropertiesMock2).when(configDataPropertiesMock).withoutImports();
            Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
            ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
            doReturn(true).when(configDataOptionsMock).contains(ConfigData.Option.IGNORE_IMPORTS);
            Iterable<ConfigDataEnvironmentContributor> iterable = new ArrayList<>();
            //Act Statement(s)
            ConfigDataEnvironmentContributor result = target.withBoundProperties(iterable, configDataActivationContextMock);
            //Assert statement(s)
            //TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                configDataProperties.verify(() -> ConfigDataProperties.get((Binder) any()));
                verify(configDataPropertiesMock, atLeast(1)).withoutImports();
                verify(configDataOptionsMock, atLeast(1)).contains(ConfigData.Option.IGNORE_IMPORTS);
            });
        }
    }

    //Sapient generated method id: ${withChildrenWhenDefaultBranchAndDefaultBranch}, hash: 20BA0CD7F9CABAAE1BE0656C9A4BE874
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
        //Assert statement(s)
        //TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${withChildrenWhenHasAnyProfileSpecificChildrenNotBeforeAndDefaultBranchAndDefaultBranch}, hash: C64666A21C4F0032F85C00CF8FC1A926
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
        //Assert statement(s)
        //TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${withReplacementWhenThisEqualsExisting}, hash: 738B7028607D19B60427896B7EE3994C
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

    //Sapient generated method id: ${withReplacementWhenDefaultBranch}, hash: DCD76EE7AE6135E3784E97176B076C14
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
        //Assert statement(s)
        //TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(contributorMock).withReplacement(configDataEnvironmentContributorMock2, configDataEnvironmentContributorMock3);
        });
    }

    //Sapient generated method id: ${withReplacementWhenDefaultBranchAndDefaultBranch}, hash: CFA0EEB723AF7310E92B6DF54169B749
    @Test()
    void withReplacementWhenDefaultBranchAndDefaultBranch() {
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
        ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, (ConfigData.Options) null, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
        //Act Statement(s)
        ConfigDataEnvironmentContributor result = target.withReplacement(configDataEnvironmentContributorMock2, configDataEnvironmentContributorMock3);
        //Assert statement(s)
        //TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(contributorMock).withReplacement(configDataEnvironmentContributorMock2, configDataEnvironmentContributorMock3);
        });
    }

    //Sapient generated method id: ${toStringWhenThisChildrenGetOrDefaultImportPhaseAFTER_PROFILE_ACTIVATIONCollectionsEmptyListIsNotEmpty}, hash: 708A84A95052A271A874E24BF2B967BE
    @Test()
    void toStringWhenThisChildrenGetOrDefaultImportPhaseAFTER_PROFILE_ACTIVATIONCollectionsEmptyListIsNotEmpty() {
        /* Branches:
         * (for-each(this.children.getOrDefault(ImportPhase.BEFORE_PROFILE_ACTIVATION, Collections.emptyList()))) : true  #  inside buildToString method
         * (for-each(this.children.getOrDefault(ImportPhase.AFTER_PROFILE_ACTIVATION, Collections.emptyList()))) : true  #  inside buildToString method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class, "location");
        ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class, "resource");
        Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
        ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.EMPTY_LOCATION, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("EMPTY_LOCATION location resource configDataOptions\n")));
    }

    //Sapient generated method id: ${ofWhenDefaultBranch}, hash: 8A0DE58AA3995AE579253A1CE15004C6
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
        //Assert statement(s)
        //TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${ofInitialImportWhenDefaultBranch}, hash: 23782B2211ABC5CD741BBC4384C53ACA
    @Test()
    void ofInitialImportWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 102)) : false  #  inside <init> method
         * (branch expression (line 103)) : false  #  inside <init> method
         */
        //Act Statement(s)
        ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock);
        //Assert statement(s)
        //TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${ofExistingWhenDefaultBranch}, hash: 7311E67631C11D30F345BDCDE31AC275
    @Test()
    void ofExistingWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 102)) : false  #  inside <init> method
         * (branch expression (line 103)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertySource> configurationPropertySource = mockStatic(ConfigurationPropertySource.class)) {
            configurationPropertySource.when(() -> ConfigurationPropertySource.from(propertySourceMock)).thenReturn(configurationPropertySourceMock);
            //Act Statement(s)
            ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.ofExisting(propertySourceMock);
            //Assert statement(s)
            //TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                configurationPropertySource.verify(() -> ConfigurationPropertySource.from(propertySourceMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ofUnboundImportWhenDefaultBranch}, hash: 6257BF200A2BEFE561967BF63507266C
    @Test()
    void ofUnboundImportWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 102)) : false  #  inside <init> method
         * (branch expression (line 103)) : false  #  inside <init> method
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
            //Assert statement(s)
            //TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(configDataMock).getPropertySources();
                verify(configDataMock).getOptions(propertySourceMock);
                configurationPropertySource.verify(() -> ConfigurationPropertySource.from(propertySourceMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ofUnboundImportWhenDefaultBranchAndDefaultBranch}, hash: E9D65E8B7FB09BDDED38EF6F430C0B9D
    @Test()
    void ofUnboundImportWhenDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (branch expression (line 102)) : false  #  inside <init> method
         * (branch expression (line 103)) : false  #  inside <init> method
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
            //Assert statement(s)
            //TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(configDataMock).getPropertySources();
                verify(configDataMock).getOptions(propertySourceMock);
                configurationPropertySource.verify(() -> ConfigurationPropertySource.from(propertySourceMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ofEmptyLocationWhenDefaultBranch}, hash: 4506CE94DB0B8BA0D91CD6511FE187B4
    @Test()
    void ofEmptyLocationWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 102)) : false  #  inside <init> method
         * (branch expression (line 103)) : false  #  inside <init> method
         */
        //Act Statement(s)
        ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.ofEmptyLocation(configDataLocationMock, false);
        //Assert statement(s)
        //TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
