package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.mockito.stubbing.Answer;
import java.lang.annotation.Annotation;
import org.springframework.core.ResolvableType;
import java.util.Set;
import org.springframework.util.Assert;
import java.util.Map;
import java.util.function.Supplier;
import org.mockito.MockedStatic;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BindableSapientGeneratedTest {

    private final ResolvableType typeMock = mock(ResolvableType.class, "type");

    private final ResolvableType boxedTypeMock = mock(ResolvableType.class, "boxedType");

    private final Bindable<Object> bindableMock = mock(Bindable.class);

    private final Bindable bindableMock2 = mock(Bindable.class);

    private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

    private final ResolvableType typeMock2 = mock(ResolvableType.class);

    //Sapient generated method id: ${getAnnotationWhenTypeIsInstanceAnnotation}, hash: 4B9D39E3B23997CCC74C3B3AA50A8D9B
    @Disabled()
    @Test()
    void getAnnotationWhenTypeIsInstanceAnnotation() {
        /* Branches:
         * (for-each(this.annotations)) : true
         * (type.isInstance(annotation)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Object object = new Object();
            _assert.when(() -> Assert.notNull(object, "Instance must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
            doReturn(bindableMock2).when(bindableMock).withExistingValue(object);
            Bindable<Object> target = Bindable.ofInstance(object);
            //Act Statement(s)
            Annotation result = target.getAnnotation(Annotation.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(object, "Instance must not be null"), atLeast(1));
                bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
                verify(bindableMock).withExistingValue(object);
            });
        }
    }

    //Sapient generated method id: ${getAnnotationWhenTypeNotIsInstanceAnnotation}, hash: 946F492CC497A9383F25C2235BD750D8
    @Disabled()
    @Test()
    void getAnnotationWhenTypeNotIsInstanceAnnotation() {
        /* Branches:
         * (for-each(this.annotations)) : true
         * (type.isInstance(annotation)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Object object = new Object();
            _assert.when(() -> Assert.notNull(object, "Instance must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
            doReturn(bindableMock2).when(bindableMock).withExistingValue(object);
            Bindable<Object> target = Bindable.ofInstance(object);
            //Act Statement(s)
            Annotation result = target.getAnnotation(Annotation.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.notNull(object, "Instance must not be null"), atLeast(1));
                bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
                verify(bindableMock).withExistingValue(object);
            });
        }
    }

    //Sapient generated method id: ${hasBindRestrictionWhenThisBindRestrictionsContainsBindRestriction}, hash: 1201C810ED1CD23F9614D2DD7B1E7EB5
    @Disabled()
    @Test()
    void hasBindRestrictionWhenThisBindRestrictionsContainsBindRestriction() {
        /* Branches:
         * (this.bindRestrictions.contains(bindRestriction)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Object object = new Object();
            _assert.when(() -> Assert.notNull(object, "Instance must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
            doReturn(bindableMock2).when(bindableMock).withExistingValue(object);
            Bindable<Object> target = Bindable.ofInstance(object);
            //Act Statement(s)
            boolean result = target.hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                _assert.verify(() -> Assert.notNull(object, "Instance must not be null"), atLeast(1));
                bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
                verify(bindableMock).withExistingValue(object);
            });
        }
    }

    //Sapient generated method id: ${hasBindRestrictionWhenThisBindRestrictionsNotContainsBindRestriction}, hash: 43C2D9F74414B6EE22D44DE877226C62
    @Disabled()
    @Test()
    void hasBindRestrictionWhenThisBindRestrictionsNotContainsBindRestriction() {
        /* Branches:
         * (this.bindRestrictions.contains(bindRestriction)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Object object = new Object();
            _assert.when(() -> Assert.notNull(object, "Instance must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
            doReturn(bindableMock2).when(bindableMock).withExistingValue(object);
            Bindable<Object> target = Bindable.ofInstance(object);
            //Act Statement(s)
            boolean result = target.hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                _assert.verify(() -> Assert.notNull(object, "Instance must not be null"), atLeast(1));
                bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
                verify(bindableMock).withExistingValue(object);
            });
        }
    }

    //Sapient generated method id: ${toStringWhenThisValueIsNull}, hash: 2B2F88690E09A39F6EF76E2B41E785A1
    @Disabled()
    @Test()
    void toStringWhenThisValueIsNull() {
        /* Branches:
         * (this.value != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: creator - Method: append
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Object object = new Object();
            _assert.when(() -> Assert.notNull(object, "Instance must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
            doReturn(bindableMock2).when(bindableMock).withExistingValue(object);
            Bindable<Object> target = Bindable.ofInstance(object);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                _assert.verify(() -> Assert.notNull(object, "Instance must not be null"), atLeast(1));
                bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
                verify(bindableMock).withExistingValue(object);
            });
        }
    }

    //Sapient generated method id: ${withAnnotationsWhenAnnotationsIsNotNull}, hash: D27A488F58709B51CC60C42BBEC80564
    @Disabled()
    @Test()
    void withAnnotationsWhenAnnotationsIsNotNull() {
        /* Branches:
         * (annotations != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Object object = new Object();
            _assert.when(() -> Assert.notNull(object, "Instance must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
            doReturn(bindableMock2).when(bindableMock).withExistingValue(object);
            Bindable<Object> target = Bindable.ofInstance(object);
            Annotation[] annotationArray = new Annotation[] {};
            //Act Statement(s)
            Bindable result = target.withAnnotations(annotationArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(object, "Instance must not be null"), atLeast(1));
                bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
                verify(bindableMock).withExistingValue(object);
            });
        }
    }

    //Sapient generated method id: ${withAnnotationsWhenAnnotationsIsNull}, hash: 101B33B54E8097108E42F5B4381D74F0
    @Disabled()
    @Test()
    void withAnnotationsWhenAnnotationsIsNull() {
        /* Branches:
         * (annotations != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Object object = new Object();
            _assert.when(() -> Assert.notNull(object, "Instance must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
            doReturn(bindableMock2).when(bindableMock).withExistingValue(object);
            Bindable<Object> target = Bindable.ofInstance(object);
            Annotation[] annotation = null;
            //Act Statement(s)
            Bindable result = target.withAnnotations(annotation);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(object, "Instance must not be null"), atLeast(1));
                bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
                verify(bindableMock).withExistingValue(object);
            });
        }
    }

    //Sapient generated method id: ${withExistingValueWhenExistingValueIsNull}, hash: EF6CCFFC56B33926E4BB20F70DF483B6
    @Disabled()
    @Test()
    void withExistingValueWhenExistingValueIsNull() {
        /* Branches:
         * (branch expression (line 193)) : false
         * (this.bindMethod != BindMethod.VALUE_OBJECT) : true
         * (existingValue != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<Bindable> bindable = mockStatic(Bindable.class)) {
            Object object = new Object();
            _assert.when(() -> Assert.notNull(object, "Instance must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
            doReturn(bindableMock2).when(bindableMock).withExistingValue(object);
            _assert.when(() -> Assert.isTrue(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Bindable<Object> target = Bindable.ofInstance(object);
            Object object2 = null;
            //Act Statement(s)
            Bindable result = target.withExistingValue(object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(object, "Instance must not be null"), atLeast(1));
                bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
                verify(bindableMock).withExistingValue(object);
                _assert.verify(() -> Assert.isTrue(eq(true), (Supplier) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
            });
        }
    }

    //Sapient generated method id: ${withExistingValueWhenThisBindMethodNotEqualsBindMethodVALUE_OBJECTAndExistingValueIsNotNull}, hash: 22933AD560EC215EF288FE4E0AFC42D5
    @Disabled()
    @Test()
    void withExistingValueWhenThisBindMethodNotEqualsBindMethodVALUE_OBJECTAndExistingValueIsNotNull() {
        /* Branches:
         * (branch expression (line 193)) : false
         * (existingValue == null) : true
         * (this.type.isArray()) : true
         * (this.bindMethod != BindMethod.VALUE_OBJECT) : true
         * (existingValue != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<Bindable> bindable = mockStatic(Bindable.class)) {
            Object object = new Object();
            _assert.when(() -> Assert.notNull(object, "Instance must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
            doReturn(bindableMock2).when(bindableMock).withExistingValue(object);
            _assert.when(() -> Assert.isTrue(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Bindable<Object> target = Bindable.ofInstance(object);
            doReturn(false).when(typeMock).isArray();
            doReturn(Object.class).when(boxedTypeMock).resolve();
            Object object2 = new Object();
            //Act Statement(s)
            Bindable result = target.withExistingValue(object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(object, "Instance must not be null"), atLeast(1));
                bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
                verify(bindableMock).withExistingValue(object);
                _assert.verify(() -> Assert.isTrue(eq(true), (Supplier) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                verify(typeMock, atLeast(1)).isArray();
                verify(boxedTypeMock, atLeast(1)).resolve();
            });
        }
    }

    //Sapient generated method id: ${withExistingValueWhenThisTypeNotIsArrayAndThisBindMethodNotEqualsBindMethodVALUE_OBJECTAndExistingValueIsNotNull}, hash: A07E6D25C748D953B99156BE87584A26
    @Disabled()
    @Test()
    void withExistingValueWhenThisTypeNotIsArrayAndThisBindMethodNotEqualsBindMethodVALUE_OBJECTAndExistingValueIsNotNull() {
        /* Branches:
         * (branch expression (line 193)) : false
         * (existingValue == null) : true
         * (this.type.isArray()) : false
         * (this.bindMethod != BindMethod.VALUE_OBJECT) : true
         * (existingValue != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<Bindable> bindable = mockStatic(Bindable.class)) {
            Object object = new Object();
            _assert.when(() -> Assert.notNull(object, "Instance must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
            doReturn(bindableMock2).when(bindableMock).withExistingValue(object);
            _assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Bindable<Object> target = Bindable.ofInstance(object);
            doReturn(false).when(typeMock).isArray();
            doReturn(Object.class).when(boxedTypeMock).resolve();
            Object object2 = new Object();
            //Act Statement(s)
            Bindable result = target.withExistingValue(object2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(object, "Instance must not be null"), atLeast(1));
                bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
                verify(bindableMock).withExistingValue(object);
                _assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
                verify(typeMock, atLeast(1)).isArray();
                verify(boxedTypeMock, atLeast(1)).resolve();
            });
        }
    }

    //Sapient generated method id: ${withSuppliedValueTest}, hash: 75F876879147033BE2CEB1C1883E1729
    @Disabled()
    @Test()
    void withSuppliedValueTest() {
        //Arrange Statement(s)
        Supplier supplierMock = mock(Supplier.class);
        try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Object object = new Object();
            _assert.when(() -> Assert.notNull(object, "Instance must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
            doReturn(bindableMock2).when(bindableMock).withExistingValue(object);
            Bindable<Object> target = Bindable.ofInstance(object);
            //Act Statement(s)
            Bindable result = target.withSuppliedValue(supplierMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(object, "Instance must not be null"), atLeast(1));
                bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
                verify(bindableMock).withExistingValue(object);
            });
        }
    }

    //Sapient generated method id: ${withBindRestrictionsTest}, hash: 01DDB31F35B22D32E151161DAEB53A66
    @Disabled()
    @Test()
    void withBindRestrictionsTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Object object = new Object();
            _assert.when(() -> Assert.notNull(object, "Instance must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
            doReturn(bindableMock2).when(bindableMock).withExistingValue(object);
            Bindable<Object> target = Bindable.ofInstance(object);
            Bindable.BindRestriction[] bindRestrictionArray = new Bindable.BindRestriction[] {};
            //Act Statement(s)
            Bindable result = target.withBindRestrictions(bindRestrictionArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(object, "Instance must not be null"), atLeast(1));
                bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
                verify(bindableMock).withExistingValue(object);
            });
        }
    }

    //Sapient generated method id: ${withBindMethodWhenThisValueIsNull}, hash: 391329737F42B25C8862ED5D042C4219
    @Disabled()
    @Test()
    void withBindMethodWhenThisValueIsNull() {
        /* Branches:
         * (bindMethod != BindMethod.VALUE_OBJECT) : false
         * (this.value == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<Bindable> bindable = mockStatic(Bindable.class)) {
            Object object = new Object();
            _assert.when(() -> Assert.notNull(object, "Instance must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
            doReturn(bindableMock2).when(bindableMock).withExistingValue(object);
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            Bindable<Object> target = Bindable.ofInstance(object);
            //Act Statement(s)
            Bindable result = target.withBindMethod(BindMethod.VALUE_OBJECT);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(object, "Instance must not be null"), atLeast(1));
                bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
                verify(bindableMock).withExistingValue(object);
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
            });
        }
    }

    //Sapient generated method id: ${ofInstanceTest}, hash: 297D1567AB8FC9AB81304E9ECD669A0D
    @Test()
    void ofInstanceTest() {
        //Arrange Statement(s)
        try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            Object object = new Object();
            _assert.when(() -> Assert.notNull(object, "Instance must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
            doReturn(bindableMock2).when(bindableMock).withExistingValue(object);
            //Act Statement(s)
            Bindable result = Bindable.ofInstance(object);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bindableMock2));
                _assert.verify(() -> Assert.notNull(object, "Instance must not be null"), atLeast(1));
                bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
                verify(bindableMock, atLeast(1)).withExistingValue(object);
            });
        }
    }

    //Sapient generated method id: ${ofTest}, hash: AFA410480DFEE37094F508BE8160A560
    @Test()
    void ofTest() {
        //Arrange Statement(s)
        Bindable bindableMock = mock(Bindable.class);
        try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class, CALLS_REAL_METHODS);
            MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(Object.class, "Type must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            resolvableType.when(() -> ResolvableType.forClass(Object.class)).thenReturn(resolvableTypeMock);
            bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
            //Act Statement(s)
            Bindable result = Bindable.of(Object.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bindableMock));
                _assert.verify(() -> Assert.notNull(Object.class, "Type must not be null"), atLeast(1));
                resolvableType.verify(() -> ResolvableType.forClass(Object.class), atLeast(1));
                bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${listOfTest}, hash: 9B6B0D7E1527B9117F05B618EA2F150D
    @Test()
    void listOfTest() {
        //Arrange Statement(s)
        Bindable<List<Object>> bindableMock = mock(Bindable.class);
        try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class, CALLS_REAL_METHODS);
            MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
            Class<Object>[] classArray = new Class[] { Object.class };
            resolvableType.when(() -> ResolvableType.forClassWithGenerics(List.class, classArray)).thenReturn(resolvableTypeMock);
            bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
            //Act Statement(s)
            Bindable<List<Object>> result = Bindable.listOf(Object.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bindableMock));
                resolvableType.verify(() -> ResolvableType.forClassWithGenerics(List.class, classArray), atLeast(1));
                bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setOfTest}, hash: 09B57E4395FF9943C470DF6831743A7B
    @Test()
    void setOfTest() {
        //Arrange Statement(s)
        Bindable<Set<Object>> bindableMock = mock(Bindable.class);
        try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class, CALLS_REAL_METHODS);
            MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
            Class<Object>[] classArray = new Class[] { Object.class };
            resolvableType.when(() -> ResolvableType.forClassWithGenerics(Set.class, classArray)).thenReturn(resolvableTypeMock);
            bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
            //Act Statement(s)
            Bindable<Set<Object>> result = Bindable.setOf(Object.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bindableMock));
                resolvableType.verify(() -> ResolvableType.forClassWithGenerics(Set.class, classArray), atLeast(1));
                bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${mapOfTest}, hash: F7223F72F6EE17B8AE6F4E90730A5B1E
    @Test()
    void mapOfTest() {
        //Arrange Statement(s)
        Bindable<Map<Object, Object>> bindableMock = mock(Bindable.class);
        try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class, CALLS_REAL_METHODS);
            MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
            Class<Object>[] classArray = new Class[] { Object.class, Object.class };
            resolvableType.when(() -> ResolvableType.forClassWithGenerics(Map.class, classArray)).thenReturn(resolvableTypeMock);
            bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
            //Act Statement(s)
            Bindable<Map<Object, Object>> result = Bindable.mapOf(Object.class, Object.class);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(bindableMock));
                resolvableType.verify(() -> ResolvableType.forClassWithGenerics(Map.class, classArray), atLeast(1));
                bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${of1WhenResolvedIsPrimitive}, hash: 9D4D889697F9254DAFFA3A754BEBD5AF
    @Disabled()
    @Test()
    void of1WhenResolvedIsPrimitive() {
        /* Branches:
         * (resolved != null) : true  #  inside box method
         * (resolved.isPrimitive()) : true  #  inside box method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(Object.class).when(typeMock2).resolve();
            _assert.when(() -> Assert.notNull(typeMock2, "Type must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            resolvableType.when(() -> ResolvableType.forClass(Object.class)).thenReturn(resolvableTypeMock);
            //Act Statement(s)
            Bindable result = Bindable.of(typeMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(typeMock2, atLeast(1)).resolve();
                _assert.verify(() -> Assert.notNull(typeMock2, "Type must not be null"), atLeast(1));
                resolvableType.verify(() -> ResolvableType.forClass(Object.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${of1WhenResolvedIsArray}, hash: 4ADA6EE92638F3B1976E8C31BC3D2D95
    @Disabled()
    @Test()
    void of1WhenResolvedIsArray() {
        /* Branches:
         * (resolved != null) : true  #  inside box method
         * (resolved.isPrimitive()) : false  #  inside box method
         * (resolved != null) : true  #  inside box method
         * (resolved.isArray()) : true  #  inside box method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ResolvableType resolvableTypeMock2 = mock(ResolvableType.class);
        ResolvableType resolvableTypeMock3 = mock(ResolvableType.class);
        try (MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(Object.class).when(typeMock2).resolve();
            doReturn(resolvableTypeMock).when(typeMock2).getComponentType();
            _assert.when(() -> Assert.notNull(typeMock2, "Type must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            resolvableType.when(() -> ResolvableType.forArrayComponent(resolvableTypeMock3)).thenReturn(resolvableTypeMock2);
            //Act Statement(s)
            Bindable result = Bindable.of(typeMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(typeMock2, atLeast(1)).resolve();
                verify(typeMock2, atLeast(1)).getComponentType();
                _assert.verify(() -> Assert.notNull(typeMock2, "Type must not be null"), atLeast(1));
                resolvableType.verify(() -> ResolvableType.forArrayComponent(resolvableTypeMock3), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${of1WhenResolvedNotIsArray}, hash: 0F0108CDC2ED1F1249E7A1C2B09DF830
    @Test()
    void of1WhenResolvedNotIsArray() {
        /* Branches:
         * (resolved != null) : true  #  inside box method
         * (resolved.isPrimitive()) : false  #  inside box method
         * (resolved != null) : true  #  inside box method
         * (resolved.isArray()) : false  #  inside box method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(Object.class).when(typeMock2).resolve();
            _assert.when(() -> Assert.notNull(typeMock2, "Type must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            Bindable result = Bindable.of(typeMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(typeMock2, atLeast(1)).resolve();
                _assert.verify(() -> Assert.notNull(typeMock2, "Type must not be null"), atLeast(1));
            });
        }
    }
}
