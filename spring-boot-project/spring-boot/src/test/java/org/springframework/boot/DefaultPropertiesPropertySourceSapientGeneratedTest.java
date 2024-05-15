package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.core.env.ConfigurableEnvironment;
import org.mockito.stubbing.Answer;
import org.springframework.util.CollectionUtils;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.util.Assert;
import java.util.Map;
import java.util.HashMap;
import org.mockito.MockedStatic;
import java.util.function.Consumer;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DefaultPropertiesPropertySourceSapientGeneratedTest {

    private final PropertySource<?> propertySourceMock = mock(PropertySource.class);

    private final MutablePropertySources sourcesMock = mock(MutablePropertySources.class);

    //Sapient generated method id: ${hasMatchingNameWhenPropertySourceGetNameEqualsNAME}, hash: 87F267045FDA1C451CEE07C4F00FA127
    @Test()
    void hasMatchingNameWhenPropertySourceGetNameEqualsNAME() {
        /* Branches:
         * (propertySource != null) : true
         * (propertySource.getName().equals(NAME)) : true
         */
        //Arrange Statement(s)
        PropertySource propertySource = PropertySource.named("defaultProperties");
        //Act Statement(s)
        boolean result = DefaultPropertiesPropertySource.hasMatchingName(propertySource);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${hasMatchingNameWhenPropertySourceGetNameNotEqualsNAME}, hash: 60044C49C93D851549C53A5A34A8EF3F
    @Test()
    void hasMatchingNameWhenPropertySourceGetNameNotEqualsNAME() {
        /* Branches:
         * (propertySource != null) : true
         * (propertySource.getName().equals(NAME)) : false
         */
        //Arrange Statement(s)
        PropertySource propertySource = PropertySource.named("A");
        //Act Statement(s)
        boolean result = DefaultPropertiesPropertySource.hasMatchingName(propertySource);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${ifNotEmptyWhenActionIsNotNull}, hash: 85AE3D3718473ACC225F9A1464185781
    @Test()
    void ifNotEmptyWhenActionIsNotNull() {
        /* Branches:
         * (!CollectionUtils.isEmpty(source)) : true
         * (action != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Consumer consumerMock = mock(Consumer.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
            MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class)) {
            collectionUtils.when(() -> CollectionUtils.isEmpty(anyMap())).thenReturn(false);
            _assert.when(() -> Assert.notNull(anyMap(), eq("Property source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            Map<String, Object> stringObjectMap = new HashMap<>();
            //Act Statement(s)
            DefaultPropertiesPropertySource.ifNotEmpty(stringObjectMap, consumerMock);
            //Assert statement(s)
            assertAll("result", () -> {
                collectionUtils.verify(() -> CollectionUtils.isEmpty(anyMap()), atLeast(1));
                _assert.verify(() -> Assert.notNull(anyMap(), eq("Property source must not be null")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${addOrMergeWhenSourcesNotContainsNAME}, hash: D57EB4B1DF1AF3ADAE78271EBFC3BF3C
    @Test()
    void addOrMergeWhenSourcesNotContainsNAME() {
        /* Branches:
         * (!CollectionUtils.isEmpty(source)) : true
         * (sources.contains(NAME)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class)) {
            doReturn(false).when(sourcesMock).contains("defaultProperties");
            doNothing().when(sourcesMock).addLast((PropertySource) any());
            collectionUtils.when(() -> CollectionUtils.isEmpty(anyMap())).thenReturn(false);
            Map<String, Object> stringObjectMap = new HashMap<>();
            //Act Statement(s)
            DefaultPropertiesPropertySource.addOrMerge(stringObjectMap, sourcesMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(sourcesMock).contains("defaultProperties");
                verify(sourcesMock).addLast((PropertySource) any());
                collectionUtils.verify(() -> CollectionUtils.isEmpty(anyMap()));
            });
        }
    }

    //Sapient generated method id: ${addOrMergeWhenUnderlyingSourceInstanceOfMap}, hash: 500FEC86BAA0AF6E778FF9BC6131364C
    @Test()
    void addOrMergeWhenUnderlyingSourceInstanceOfMap() {
        /* Branches:
         * (!CollectionUtils.isEmpty(source)) : true
         * (sources.contains(NAME)) : true
         * (existingSource != null) : true  #  inside mergeIfPossible method
         * (underlyingSource instanceof Map) : true  #  inside mergeIfPossible method
         */
        //Arrange Statement(s)
        try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class)) {
            doReturn(true).when(sourcesMock).contains("defaultProperties");
            doReturn(propertySourceMock).when(sourcesMock).get("defaultProperties");
            Map map = new HashMap<>();
            doReturn(map).when(propertySourceMock).getSource();
            doNothing().when(sourcesMock).replace(eq("defaultProperties"), (PropertySource) any());
            collectionUtils.when(() -> CollectionUtils.isEmpty(anyMap())).thenReturn(false);
            Map<String, Object> stringObjectMap = new HashMap<>();
            //Act Statement(s)
            DefaultPropertiesPropertySource.addOrMerge(stringObjectMap, sourcesMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(sourcesMock).contains("defaultProperties");
                verify(sourcesMock).get("defaultProperties");
                verify(propertySourceMock).getSource();
                verify(sourcesMock).replace(eq("defaultProperties"), (PropertySource) any());
                collectionUtils.verify(() -> CollectionUtils.isEmpty(anyMap()));
            });
        }
    }

    //Sapient generated method id: ${moveToEndTest}, hash: BF3F5A40EF6BD24BB9898AC8A75E21C1
    @Test()
    void moveToEndTest() {
        //Arrange Statement(s)
        ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);
        MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);
        try (MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class, CALLS_REAL_METHODS)) {
            doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
            defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.moveToEnd(mutablePropertySourcesMock)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            DefaultPropertiesPropertySource.moveToEnd(environmentMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(environmentMock, atLeast(1)).getPropertySources();
                defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.moveToEnd(mutablePropertySourcesMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${moveToEnd1WhenPropertySourceIsNotNull}, hash: EF11C5052C5F365B5F20C726AFCD99FD
    @Test()
    void moveToEnd1WhenPropertySourceIsNotNull() {
        /* Branches:
         * (propertySource != null) : true
         */
        //Arrange Statement(s)
        MutablePropertySources propertySourcesMock = mock(MutablePropertySources.class);
        doReturn(propertySourceMock).when(propertySourcesMock).remove("defaultProperties");
        doNothing().when(propertySourcesMock).addLast(propertySourceMock);
        //Act Statement(s)
        DefaultPropertiesPropertySource.moveToEnd(propertySourcesMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(propertySourcesMock).remove("defaultProperties");
            verify(propertySourcesMock).addLast(propertySourceMock);
        });
    }
}
