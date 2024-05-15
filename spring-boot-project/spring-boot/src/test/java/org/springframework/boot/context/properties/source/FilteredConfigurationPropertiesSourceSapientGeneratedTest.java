package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import org.springframework.util.Assert;
import java.util.function.Predicate;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FilteredConfigurationPropertiesSourceSapientGeneratedTest {

    private final ConfigurationPropertySource sourceMock = mock(ConfigurationPropertySource.class, "source");

    private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

    private final Predicate predicateMock = mock(Predicate.class);

    //Sapient generated method id: ${getConfigurationPropertyWhenFiltered}, hash: 2F66B48978243BCD526772A605F175EE
    @Disabled()
    @Test()
    void getConfigurationPropertyWhenFiltered() {
        /* Branches:
         * (filtered) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(configurationPropertyMock).when(sourceMock).getConfigurationProperty(configurationPropertyNameMock);
            _assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(predicateMock, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            FilteredConfigurationPropertiesSource target = new FilteredConfigurationPropertiesSource(sourceMock, predicateMock);
            //Act Statement(s)
            ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configurationPropertyMock));
                verify(sourceMock).getConfigurationProperty(configurationPropertyNameMock);
                _assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(predicateMock, "Filter must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getConfigurationPropertyWhenNotFiltered}, hash: A7D4AFF2683CE66C6B8B62D820B5E2CC
    @Test()
    void getConfigurationPropertyWhenNotFiltered() {
        /* Branches:
         * (filtered) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(predicateMock, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            FilteredConfigurationPropertiesSource target = new FilteredConfigurationPropertiesSource(sourceMock, predicateMock);
            //Act Statement(s)
            ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(predicateMock, "Filter must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${containsDescendantOfWhenResultEqualsConfigurationPropertyStatePRESENT}, hash: 8E32A1CCE1B2EFE90F65EF414A23E9F4
    @Test()
    void containsDescendantOfWhenResultEqualsConfigurationPropertyStatePRESENT() {
        /* Branches:
         * (result == ConfigurationPropertyState.PRESENT) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(predicateMock, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            FilteredConfigurationPropertiesSource target = new FilteredConfigurationPropertiesSource(sourceMock, predicateMock);
            doReturn(ConfigurationPropertyState.PRESENT).when(sourceMock).containsDescendantOf(configurationPropertyNameMock);
            //Act Statement(s)
            ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.UNKNOWN));
                _assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(predicateMock, "Filter must not be null"), atLeast(1));
                verify(sourceMock).containsDescendantOf(configurationPropertyNameMock);
            });
        }
    }

    //Sapient generated method id: ${containsDescendantOfWhenResultNotEqualsConfigurationPropertyStatePRESENT}, hash: 831CFAD019914964FB5F0CB424A82B1A
    @Test()
    void containsDescendantOfWhenResultNotEqualsConfigurationPropertyStatePRESENT() {
        /* Branches:
         * (result == ConfigurationPropertyState.PRESENT) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(predicateMock, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            FilteredConfigurationPropertiesSource target = new FilteredConfigurationPropertiesSource(sourceMock, predicateMock);
            doReturn(ConfigurationPropertyState.ABSENT).when(sourceMock).containsDescendantOf(configurationPropertyNameMock);
            //Act Statement(s)
            ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
                _assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(predicateMock, "Filter must not be null"), atLeast(1));
                verify(sourceMock).containsDescendantOf(configurationPropertyNameMock);
            });
        }
    }

    //Sapient generated method id: ${getUnderlyingSourceTest}, hash: 171832E9162F50E36CDF137D7F376A0F
    @Test()
    void getUnderlyingSourceTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(predicateMock, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            FilteredConfigurationPropertiesSource target = new FilteredConfigurationPropertiesSource(sourceMock, predicateMock);
            Object object = new Object();
            doReturn(object).when(sourceMock).getUnderlyingSource();
            //Act Statement(s)
            Object result = target.getUnderlyingSource();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                _assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(predicateMock, "Filter must not be null"), atLeast(1));
                verify(sourceMock).getUnderlyingSource();
            });
        }
    }

    //Sapient generated method id: ${toStringTest}, hash: 1414D560C292640DF4572F5F3AD3C5EA
    @Test()
    void toStringTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(predicateMock, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            FilteredConfigurationPropertiesSource target = new FilteredConfigurationPropertiesSource(sourceMock, predicateMock);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("source (filtered)"));
                _assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(predicateMock, "Filter must not be null"), atLeast(1));
            });
        }
    }
}
