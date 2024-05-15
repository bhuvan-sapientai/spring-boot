package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.springframework.boot.origin.Origin;
import org.springframework.core.ResolvableType;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.boot.context.properties.source.ConfigurationProperty;
import java.util.function.Predicate;
import org.springframework.core.CollectionFactory;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Supplier;
import org.mockito.MockedStatic;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import java.util.ArrayList;
import org.springframework.boot.context.properties.source.ConfigurationPropertyState;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MapBinderSapientGeneratedTest {

    private final AggregateElementBinder aggregateElementBinderMock = mock(AggregateElementBinder.class);

    private final Binder.Context binderContextMock = mock(Binder.Context.class);

    private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

    private final ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);

    private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

    private final Supplier supplierMock = mock(Supplier.class);

    private final Bindable<?> targetMock = mock(Bindable.class);

    //Sapient generated method id: ${isAllowRecursiveBindingTest}, hash: 30846A4F87770FB559C7F28A060F15F3
    @Test()
    void isAllowRecursiveBindingTest() {
        //Arrange Statement(s)
        MapBinder target = new MapBinder(binderContextMock);
        //Act Statement(s)
        boolean result = target.isAllowRecursiveBinding(configurationPropertySourceMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${bindAggregateWhenSourceContainsDescendantOfNameNotEqualsConfigurationPropertyStatePRESENTAndGetContextGetSourcesIsEmpty}, hash: F559B321F3ED82A3DCE39DF69FFD6843
    @Test()
    void bindAggregateWhenSourceContainsDescendantOfNameNotEqualsConfigurationPropertyStatePRESENTAndGetContextGetSourcesIsEmpty() {
        /* Branches:
         * (target.getValue() != null) : true
         * (Properties.class.isAssignableFrom(type)) : true  #  inside resolveTarget method
         * (for-each(getContext().getSources())) : true  #  inside hasDescendants method
         * (source.containsDescendantOf(name) == ConfigurationPropertyState.PRESENT) : false  #  inside hasDescendants method
         * (for-each(getContext().getSources())) : false
         * (map.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
            doReturn(supplierMock).when(targetMock).getValue();
            doReturn(resolvableTypeMock).when(targetMock).getType();
            doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
            doReturn(ConfigurationPropertyState.ABSENT).when(configurationPropertySourceMock).containsDescendantOf(configurationPropertyNameMock);
            Iterable<ConfigurationPropertySource> iterable2 = new ArrayList<>();
            doReturn(iterable, iterable2).when(binderContextMock).getSources();
            Object object = new Object();
            Object object2 = new Object();
            Map<Object, Object> objectObjectMap = new HashMap<>();
            objectObjectMap.put(object, object2);
            collectionFactory.when(() -> CollectionFactory.createMap(Map.class, 0)).thenReturn(objectObjectMap);
            MapBinder target = new MapBinder(binderContextMock);
            //Act Statement(s)
            Object result = target.bindAggregate(configurationPropertyNameMock, targetMock, aggregateElementBinderMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(objectObjectMap));
                verify(targetMock).getValue();
                verify(targetMock).getType();
                verify(resolvableTypeMock).resolve(Object.class);
                verify(binderContextMock, times(2)).getSources();
                verify(configurationPropertySourceMock).containsDescendantOf(configurationPropertyNameMock);
                collectionFactory.verify(() -> CollectionFactory.createMap(Map.class, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${bindAggregateWhenNotHasDescendants}, hash: C1858BCE34D71A068129728F4010DB48
    @Disabled()
    @Test()
    void bindAggregateWhenNotHasDescendants() {
        /* Branches:
         * (target.getValue() != null) : false
         * (Properties.class.isAssignableFrom(type)) : false  #  inside resolveTarget method
         * (for-each(getContext().getSources())) : false  #  inside hasDescendants method
         * (for-each(getContext().getSources())) : true
         * (!ConfigurationPropertyName.EMPTY.equals(name)) : true
         * (property != null) : true
         * (!hasDescendants) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Origin originMock = mock(Origin.class);
        ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class);
        BindConverter bindConverterMock = mock(BindConverter.class);
        try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
            doReturn(null).when(targetMock).getValue();
            doReturn(resolvableTypeMock).when(targetMock).getType();
            doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>();
            Iterable<ConfigurationPropertySource> iterable2 = new ArrayList<>(List.of(configurationPropertySourceMock));
            doReturn(iterable, iterable2).when(binderContextMock).getSources();
            Object object = new Object();
            ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, object, originMock);
            doReturn(configurationProperty).when(configurationPropertySourceMock).getConfigurationProperty(configurationPropertyNameMock2);
            doNothing().when(binderContextMock).setConfigurationProperty(configurationProperty);
            doReturn(bindConverterMock).when(binderContextMock).getConverter();
            Object object2 = new Object();
            doReturn(object2).when(bindConverterMock).convert(object, targetMock);
            Map<Object, Object> objectObjectMap = new HashMap<>();
            collectionFactory.when(() -> CollectionFactory.createMap(Object.class, 0)).thenReturn(objectObjectMap);
            MapBinder target = new MapBinder(binderContextMock);
            //Act Statement(s)
            Object result = target.bindAggregate(configurationPropertyNameMock2, targetMock, aggregateElementBinderMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object2));
                verify(targetMock).getValue();
                verify(targetMock, times(2)).getType();
                verify(resolvableTypeMock, times(2)).resolve(Object.class);
                verify(binderContextMock, times(2)).getSources();
                verify(configurationPropertySourceMock).getConfigurationProperty(configurationPropertyNameMock2);
                verify(binderContextMock).setConfigurationProperty(configurationProperty);
                verify(binderContextMock).getConverter();
                verify(bindConverterMock).convert(object, targetMock);
                collectionFactory.verify(() -> CollectionFactory.createMap(Object.class, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${bindAggregateWhenHasDescendantsAndMapIsEmpty}, hash: 4E930245A5DBB3865D1EA9E7EC5D479E
    @Disabled()
    @Test()
    void bindAggregateWhenHasDescendantsAndMapIsEmpty() {
        /* Branches:
         * (target.getValue() != null) : true
         * (Properties.class.isAssignableFrom(type)) : true  #  inside resolveTarget method
         * (for-each(getContext().getSources())) : true  #  inside hasDescendants method
         * (source.containsDescendantOf(name) == ConfigurationPropertyState.PRESENT) : true  #  inside hasDescendants method
         * (for-each(getContext().getSources())) : true
         * (!ConfigurationPropertyName.EMPTY.equals(name)) : true
         * (property != null) : true
         * (!hasDescendants) : false
         * (map.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConfigurationPropertyName nameMock = mock(ConfigurationPropertyName.class);
        ConfigurationPropertySource configurationPropertySourceMock2 = mock(ConfigurationPropertySource.class);
        ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);
        ConfigurationPropertySource configurationPropertySourceMock3 = mock(ConfigurationPropertySource.class);
        try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
            doReturn(false).when(nameMock).isAncestorOf(configurationPropertyNameMock);
            doReturn(supplierMock).when(targetMock).getValue();
            doReturn(resolvableTypeMock).when(targetMock).getType();
            doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
            doReturn(ConfigurationPropertyState.PRESENT).when(configurationPropertySourceMock).containsDescendantOf(nameMock);
            Iterable<ConfigurationPropertySource> iterable2 = new ArrayList<>(List.of(configurationPropertySourceMock2));
            doReturn(iterable, iterable2).when(binderContextMock).getSources();
            doReturn(configurationPropertyMock).when(configurationPropertySourceMock2).getConfigurationProperty(nameMock);
            doReturn(configurationPropertySourceMock3).when(configurationPropertySourceMock2).filter((Predicate) any());
            Map<Object, Object> objectObjectMap = new HashMap<>();
            collectionFactory.when(() -> CollectionFactory.createMap(Map.class, 0)).thenReturn(objectObjectMap);
            MapBinder target = new MapBinder(binderContextMock);
            //Act Statement(s)
            Object result = target.bindAggregate(nameMock, targetMock, aggregateElementBinderMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                verify(nameMock).isAncestorOf(configurationPropertyNameMock);
                verify(targetMock).getValue();
                verify(targetMock).getType();
                verify(resolvableTypeMock).resolve(Object.class);
                verify(binderContextMock, times(2)).getSources();
                verify(configurationPropertySourceMock).containsDescendantOf(nameMock);
                verify(configurationPropertySourceMock2).getConfigurationProperty(nameMock);
                verify(configurationPropertySourceMock2).filter((Predicate) any());
                collectionFactory.verify(() -> CollectionFactory.createMap(Map.class, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${merge1WhenExistingMapIsNull}, hash: C7FE68C066C4AB961C08377A8713EDBE
    @Test()
    void merge1WhenExistingMapIsNull() throws Exception {
        /* Branches:
         * (existingMap == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MapBinder target = new MapBinder(binderContextMock);
        Map<Object, Object> objectObjectMap = new HashMap<>();
        //Act Statement(s)
        Map<Object, Object> result = target.merge(supplierMock, objectObjectMap);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectObjectMap)));
    }

    //Sapient generated method id: ${merge1WhenExistingMapIsNotNull}, hash: DAE8913C1DE9DCDC5A63C9B65765C702
    @Disabled()
    @Test()
    void merge1WhenExistingMapIsNotNull() throws Exception {
        /* Branches:
         * (existingMap == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
            Map<Object, Object> objectObjectMap = new HashMap<>();
            collectionFactory.when(() -> CollectionFactory.createMap(HashMap.class, 0)).thenReturn(objectObjectMap);
            MapBinder target = new MapBinder(binderContextMock);
            Map<Object, Object> objectObjectMap2 = new HashMap<>();
            //Act Statement(s)
            Map<Object, Object> result = target.merge(supplierMock, objectObjectMap2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(objectObjectMap));
                collectionFactory.verify(() -> CollectionFactory.createMap(HashMap.class, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${merge1WhenCaughtUnsupportedOperationException}, hash: D6D60BEB0CDEB4627D6DBB15961E6D83
    @Disabled()
    @Test()
    void merge1WhenCaughtUnsupportedOperationException() throws Exception {
        /* Branches:
         * (existingMap == null) : false
         * (catch-exception (UnsupportedOperationException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
            Map<Object, Object> objectObjectMap = new HashMap<>();
            Map<Object, Object> objectObjectMap2 = new HashMap<>();
            collectionFactory.when(() -> CollectionFactory.createMap(HashMap.class, 0)).thenReturn(objectObjectMap).thenReturn(objectObjectMap2);
            MapBinder target = new MapBinder(binderContextMock);
            Map<Object, Object> objectObjectMap3 = new HashMap<>();
            //Act Statement(s)
            Map<Object, Object> result = target.merge(supplierMock, objectObjectMap3);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(objectObjectMap2));
                collectionFactory.verify(() -> CollectionFactory.createMap(HashMap.class, 0), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${merge1WhenCaughtException}, hash: A7D6237122A8400FA6131B9AFCC3E471
    @Disabled()
    @Test()
    void merge1WhenCaughtException() throws Exception {
        /* Branches:
         * (existingMap == null) : false
         * (catch-exception (Exception)) : true  #  inside copyIfPossible method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
            Map<Object, Object> objectObjectMap = new HashMap<>();
            collectionFactory.when(() -> CollectionFactory.createMap(HashMap.class, 0)).thenReturn(objectObjectMap);
            MapBinder target = new MapBinder(binderContextMock);
            Map<Object, Object> objectObjectMap2 = new HashMap<>();
            //Act Statement(s)
            Map<Object, Object> result = target.merge(supplierMock, objectObjectMap2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                collectionFactory.verify(() -> CollectionFactory.createMap(HashMap.class, 0), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${merge1WhenCaughtExceptionAndExistingMapIsNull}, hash: 6C5678588B9EF10B58414ACF3DD6D033
    @Test()
    void merge1WhenCaughtExceptionAndExistingMapIsNull() throws Exception {
        /* Branches:
         * (catch-exception (Exception)) : true  #  inside getExistingIfPossible method
         * (existingMap == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MapBinder target = new MapBinder(binderContextMock);
        Map<Object, Object> objectObjectMap = new HashMap<>();
        //Act Statement(s)
        Map<Object, Object> result = target.merge(supplierMock, objectObjectMap);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectObjectMap)));
    }
}
