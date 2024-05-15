package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import java.util.stream.Stream;
import org.springframework.util.Assert;
import java.util.function.Predicate;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FilteredIterableConfigurationPropertiesSourceSapientGeneratedTest {

    private final IterableConfigurationPropertySource iterableConfigurationPropertySourceMock = mock(IterableConfigurationPropertySource.class);

    private final Predicate predicateMock = mock(Predicate.class);

    //Sapient generated method id: ${streamTest}, hash: 7C33935AA02FC62BF8ED2FA6BC9AA3D5
    @Test()
    void streamTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IterableConfigurationPropertySource iterableConfigurationPropertySourceMock2 = mock(IterableConfigurationPropertySource.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(iterableConfigurationPropertySourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(predicateMock, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            FilteredIterableConfigurationPropertiesSource target = spy(new FilteredIterableConfigurationPropertiesSource(iterableConfigurationPropertySourceMock, predicateMock));
            doReturn(iterableConfigurationPropertySourceMock2).when(target).getSource();
            Stream stream = Stream.empty();
            doReturn(stream).when(iterableConfigurationPropertySourceMock2).stream();
            //Act Statement(s)
            Stream<ConfigurationPropertyName> result = target.stream();
            //Assert statement(s)
            //TODO: Please implement equals method in Stream for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(iterableConfigurationPropertySourceMock, "Source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(predicateMock, "Filter must not be null"), atLeast(1));
                verify(target).getSource();
                verify(iterableConfigurationPropertySourceMock2).stream();
            });
        }
    }

    //Sapient generated method id: ${getSource1Test}, hash: E6673DEFB9A8F7E7A8CFDD2BAF22F39D
    @Test()
    void getSource1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(iterableConfigurationPropertySourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(predicateMock, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            FilteredIterableConfigurationPropertiesSource target = new FilteredIterableConfigurationPropertiesSource(iterableConfigurationPropertySourceMock, predicateMock);
            //Act Statement(s)
            IterableConfigurationPropertySource result = target.getSource();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(iterableConfigurationPropertySourceMock));
                _assert.verify(() -> Assert.notNull(iterableConfigurationPropertySourceMock, "Source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(predicateMock, "Filter must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${containsDescendantOfTest}, hash: 8939C949EBC3DA3ADCE062B14CB1AE9B
    @Test()
    void containsDescendantOfTest() {
        //Arrange Statement(s)
        ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);
        try (MockedStatic<ConfigurationPropertyState> configurationPropertyState = mockStatic(ConfigurationPropertyState.class, CALLS_REAL_METHODS);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(iterableConfigurationPropertySourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(predicateMock, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            FilteredIterableConfigurationPropertiesSource target = new FilteredIterableConfigurationPropertiesSource(iterableConfigurationPropertySourceMock, predicateMock);
            configurationPropertyState.when(() -> ConfigurationPropertyState.search(eq(target), (Predicate) any())).thenReturn(ConfigurationPropertyState.PRESENT);
            //Act Statement(s)
            ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
                _assert.verify(() -> Assert.notNull(iterableConfigurationPropertySourceMock, "Source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(predicateMock, "Filter must not be null"), atLeast(1));
                configurationPropertyState.verify(() -> ConfigurationPropertyState.search(eq(target), (Predicate) any()), atLeast(1));
            });
        }
    }
}
