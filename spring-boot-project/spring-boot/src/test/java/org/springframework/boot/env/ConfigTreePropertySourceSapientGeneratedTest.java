package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.springframework.boot.origin.Origin;
import java.util.function.Supplier;
import org.mockito.MockedStatic;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;
import java.nio.file.Path;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.anySet;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigTreePropertySourceSapientGeneratedTest {

    private final Path pathMock = mock(Path.class);

    //Sapient generated method id: ${getPropertyNamesTest}, hash: 22A46CB68B999884EB3ED9723D3B13BC
    @Disabled()
    @Test()
    void getPropertyNamesTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(pathMock, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            stringUtils.when(() -> StringUtils.toStringArray(anySet())).thenReturn(stringArray);
            ConfigTreePropertySource.Option[] optionArray = new ConfigTreePropertySource.Option[] {};
            ConfigTreePropertySource target = new ConfigTreePropertySource("A", pathMock, optionArray);
            //Act Statement(s)
            String[] result = target.getPropertyNames();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.length, equalTo(0));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull(pathMock, "Property source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()), atLeast(2));
                stringUtils.verify(() -> StringUtils.toStringArray(anySet()));
            });
        }
    }

    //Sapient generated method id: ${getProperty1WhenPropertyFileIsNotNull}, hash: 5E15C92FFD4353337449F3735EF0E563
    @Disabled()
    @Test()
    void getProperty1WhenPropertyFileIsNotNull() {
        /* Branches:
         * (propertyFile != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(pathMock, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            stringUtils.when(() -> StringUtils.toStringArray(anySet())).thenReturn(stringArray);
            ConfigTreePropertySource.Option[] optionArray = new ConfigTreePropertySource.Option[] {};
            ConfigTreePropertySource target = new ConfigTreePropertySource("A", pathMock, optionArray);
            //Act Statement(s)
            ConfigTreePropertySource.Value result = target.getProperty("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull(pathMock, "Property source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()), atLeast(2));
                stringUtils.verify(() -> StringUtils.toStringArray(anySet()));
            });
        }
    }

    //Sapient generated method id: ${getProperty1WhenPropertyFileIsNull}, hash: 39AF1F8FBCCA3F9E9CB6D4C88E62F84E
    @Disabled()
    @Test()
    void getProperty1WhenPropertyFileIsNull() {
        /* Branches:
         * (propertyFile != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(pathMock, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            stringUtils.when(() -> StringUtils.toStringArray(anySet())).thenReturn(stringArray);
            ConfigTreePropertySource.Option[] optionArray = new ConfigTreePropertySource.Option[] {};
            ConfigTreePropertySource target = new ConfigTreePropertySource("A", pathMock, optionArray);
            //Act Statement(s)
            ConfigTreePropertySource.Value result = target.getProperty("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull(pathMock, "Property source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()), atLeast(2));
                stringUtils.verify(() -> StringUtils.toStringArray(anySet()));
            });
        }
    }

    //Sapient generated method id: ${getOriginWhenPropertyFileIsNotNull}, hash: DD3DD8460414017E32E1454C011FAC4B
    @Disabled()
    @Test()
    void getOriginWhenPropertyFileIsNotNull() {
        /* Branches:
         * (propertyFile != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(pathMock, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            stringUtils.when(() -> StringUtils.toStringArray(anySet())).thenReturn(stringArray);
            ConfigTreePropertySource.Option[] optionArray = new ConfigTreePropertySource.Option[] {};
            ConfigTreePropertySource target = new ConfigTreePropertySource("A", pathMock, optionArray);
            //Act Statement(s)
            Origin result = target.getOrigin("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull(pathMock, "Property source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()), atLeast(2));
                stringUtils.verify(() -> StringUtils.toStringArray(anySet()));
            });
        }
    }

    //Sapient generated method id: ${getOriginWhenPropertyFileIsNull}, hash: D907AE0E98B179DA176465CE3291F8F3
    @Disabled()
    @Test()
    void getOriginWhenPropertyFileIsNull() {
        /* Branches:
         * (propertyFile != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(pathMock, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            stringUtils.when(() -> StringUtils.toStringArray(anySet())).thenReturn(stringArray);
            ConfigTreePropertySource.Option[] optionArray = new ConfigTreePropertySource.Option[] {};
            ConfigTreePropertySource target = new ConfigTreePropertySource("A", pathMock, optionArray);
            //Act Statement(s)
            Origin result = target.getOrigin("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull(pathMock, "Property source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()), atLeast(2));
                stringUtils.verify(() -> StringUtils.toStringArray(anySet()));
            });
        }
    }

    //Sapient generated method id: ${isImmutableWhenThisOptionsNotContainsOptionALWAYS_READ}, hash: 2AF28F99A4A3CB249397BB40403AF761
    @Disabled()
    @Test()
    void isImmutableWhenThisOptionsNotContainsOptionALWAYS_READ() {
        /* Branches:
         * (!this.options.contains(Option.ALWAYS_READ)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(pathMock, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            stringUtils.when(() -> StringUtils.toStringArray(anySet())).thenReturn(stringArray);
            ConfigTreePropertySource.Option[] optionArray = new ConfigTreePropertySource.Option[] {};
            ConfigTreePropertySource target = new ConfigTreePropertySource("A", pathMock, optionArray);
            //Act Statement(s)
            boolean result = target.isImmutable();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull(pathMock, "Property source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()), atLeast(2));
                stringUtils.verify(() -> StringUtils.toStringArray(anySet()));
            });
        }
    }

    //Sapient generated method id: ${isImmutableWhenThisOptionsContainsOptionALWAYS_READ}, hash: 45EA1A0C20BF2FE0BF49E79E57598D6B
    @Disabled()
    @Test()
    void isImmutableWhenThisOptionsContainsOptionALWAYS_READ() {
        /* Branches:
         * (!this.options.contains(Option.ALWAYS_READ)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(pathMock, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            stringUtils.when(() -> StringUtils.toStringArray(anySet())).thenReturn(stringArray);
            ConfigTreePropertySource.Option[] optionArray = new ConfigTreePropertySource.Option[] {};
            ConfigTreePropertySource target = new ConfigTreePropertySource("A", pathMock, optionArray);
            //Act Statement(s)
            boolean result = target.isImmutable();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                _assert.verify(() -> Assert.notNull(pathMock, "Property source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()), atLeast(2));
                stringUtils.verify(() -> StringUtils.toStringArray(anySet()));
            });
        }
    }
}
