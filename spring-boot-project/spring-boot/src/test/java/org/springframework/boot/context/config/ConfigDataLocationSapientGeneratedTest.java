package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.boot.origin.Origin;
import org.mockito.MockedStatic;
import org.springframework.util.StringUtils;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataLocationSapientGeneratedTest {

    //Sapient generated method id: ${hasPrefixWhenThisValueStartsWithPrefix}, hash: C4C793F4F979F7164A8DC399E6CC7905
    @Disabled()
    @Test()
    void hasPrefixWhenThisValueStartsWithPrefix() {
        /* Branches:
         * (this.value.startsWith(prefix)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            stringUtils.when(() -> StringUtils.hasText("B")).thenReturn(false);
            ConfigDataLocation target = ConfigDataLocation.of("optional:B");
            //Act Statement(s)
            boolean result = target.hasPrefix("DCEGF");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                stringUtils.verify(() -> StringUtils.hasText("B"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${hasPrefixWhenThisValueNotStartsWithPrefix}, hash: DD2EEA7E72F31547702A53BDB286477E
    @Disabled()
    @Test()
    void hasPrefixWhenThisValueNotStartsWithPrefix() {
        /* Branches:
         * (this.value.startsWith(prefix)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
            ConfigDataLocation target = ConfigDataLocation.of("optional:A");
            //Act Statement(s)
            boolean result = target.hasPrefix("CDE");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getNonPrefixedValueWhenHasPrefixPrefix}, hash: 326F65654E6EFA9DE85A8271A7A0CC68
    @Disabled()
    @Test()
    void getNonPrefixedValueWhenHasPrefixPrefix() {
        /* Branches:
         * (hasPrefix(prefix)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
            ConfigDataLocation target = spy(ConfigDataLocation.of("optional:A"));
            doReturn(true).when(target).hasPrefix("BCDEF");
            //Act Statement(s)
            String result = target.getNonPrefixedValue("BCDEF");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("LMNO"));
                stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
                verify(target).hasPrefix("BCDEF");
            });
        }
    }

    //Sapient generated method id: ${getNonPrefixedValueWhenHasPrefixNotPrefix}, hash: F74E609CD9D7B90D945EAFFA55391426
    @Disabled()
    @Test()
    void getNonPrefixedValueWhenHasPrefixNotPrefix() {
        /* Branches:
         * (hasPrefix(prefix)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
            ConfigDataLocation target = spy(ConfigDataLocation.of("optional:A"));
            doReturn(false).when(target).hasPrefix("prefix1");
            //Act Statement(s)
            String result = target.getNonPrefixedValue("prefix1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
                verify(target).hasPrefix("prefix1");
            });
        }
    }

    //Sapient generated method id: ${splitTest}, hash: 493665094A23AC52DA8A282AB1F8E234
    @Disabled()
    @Test()
    void splitTest() {
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
            ConfigDataLocation target = spy(ConfigDataLocation.of("optional:A"));
            ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
            doReturn(configDataLocationArray).when(target).split(";");
            //Act Statement(s)
            ConfigDataLocation[] result = target.split();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configDataLocationArray));
                stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
                verify(target).split(";");
            });
        }
    }

    //Sapient generated method id: ${split1WhenILessThanValuesLength}, hash: E7F4E0CA3FA4569CEB8B235834944142
    @Disabled()
    @Test()
    void split1WhenILessThanValuesLength() {
        /* Branches:
         * (i < values.length) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class);
        ConfigDataLocation configDataLocationMock2 = mock(ConfigDataLocation.class);
        try (MockedStatic<ConfigDataLocation> configDataLocation = mockStatic(ConfigDataLocation.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class, CALLS_REAL_METHODS)) {
            stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
            configDataLocation.when(() -> ConfigDataLocation.of("return_of_delimitedListToStringArrayItem1")).thenReturn(configDataLocationMock);
            doReturn(configDataLocationMock2).when(configDataLocationMock).withOrigin((Origin) null);
            ConfigDataLocation target = ConfigDataLocation.of("optional:A");
            //Act Statement(s)
            ConfigDataLocation[] result = target.split("C");
            ConfigDataLocation[] configDataLocationResultArray = new ConfigDataLocation[] { configDataLocationMock2 };
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configDataLocationResultArray));
                stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
                configDataLocation.verify(() -> ConfigDataLocation.of("return_of_delimitedListToStringArrayItem1"), atLeast(1));
                verify(configDataLocationMock, atLeast(1)).withOrigin((Origin) null);
            });
        }
    }

    //Sapient generated method id: ${toStringWhenThisNotOptional}, hash: 83B73F12DAC048B6A4467D82B64B5EB2
    @Disabled()
    @Test()
    void toStringWhenThisNotOptional() {
        /* Branches:
         * (!this.optional) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
            ConfigDataLocation target = ConfigDataLocation.of("optional:A");
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${withOriginTest}, hash: 639AA4DB07D9C109D646E0C1DCA0DB3D
    @Disabled()
    @Test()
    void withOriginTest() {
        //Arrange Statement(s)
        Origin originMock = mock(Origin.class);
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
            ConfigDataLocation target = ConfigDataLocation.of("optional:A");
            //Act Statement(s)
            ConfigDataLocation result = target.withOrigin(originMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ofWhenStringUtilsHasTextValue}, hash: 42E04B8CAEF239A34C01C65F06D5C8FF
    @Test()
    void ofWhenStringUtilsHasTextValue() {
        /* Branches:
         * (location != null) : true
         * (location.startsWith(OPTIONAL_PREFIX)) : true
         * (!optional) : false
         * (!StringUtils.hasText(value)) : false
         */
        //Act Statement(s)
        ConfigDataLocation result = ConfigDataLocation.of("optional:A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${ofWhenNotOptionalAndStringUtilsNotHasTextValue}, hash: C098BE9A636CDBAE34C86F953E504352
    @Test()
    void ofWhenNotOptionalAndStringUtilsNotHasTextValue() {
        /* Branches:
         * (location != null) : true
         * (location.startsWith(OPTIONAL_PREFIX)) : false
         * (!optional) : true
         * (!StringUtils.hasText(value)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
            //Act Statement(s)
            ConfigDataLocation result = ConfigDataLocation.of("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
            });
        }
    }
}
