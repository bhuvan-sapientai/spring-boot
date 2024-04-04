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

	private final Predicate<ConfigurationPropertyName> predicateMock = mock(Predicate.class);

	//Sapient generated method id: ${b4af2388-e781-3800-820a-b8ede09bd914}, hash: 7C33935AA02FC62BF8ED2FA6BC9AA3D5
	@Test()
	void streamTest() {
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

	//Sapient generated method id: ${bfcb6725-5fb8-3080-8655-dc87e9921af1}, hash: 0F12DD380146E3EB5CCD1C569BC59970
	@Test()
	void getSource1Test() {
		//Arrange Statement(s)
		Predicate predicateMock = mock(Predicate.class);
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

	//Sapient generated method id: ${409a869f-7d3e-391d-9ac0-8089d0ba1991}, hash: B099AAC742D5138E773B863A1CC66A48
	@Test()
	void containsDescendantOfTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyState> configurationPropertyState = mockStatic(ConfigurationPropertyState.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(iterableConfigurationPropertySourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(predicateMock, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FilteredIterableConfigurationPropertiesSource target = new FilteredIterableConfigurationPropertiesSource(iterableConfigurationPropertySourceMock, predicateMock);
			configurationPropertyState.when(() -> ConfigurationPropertyState.search(eq(target), (Predicate) any())).thenReturn(ConfigurationPropertyState.PRESENT);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("containsDescendantOf_configurationPropertyName1-name1");
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyName);
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
