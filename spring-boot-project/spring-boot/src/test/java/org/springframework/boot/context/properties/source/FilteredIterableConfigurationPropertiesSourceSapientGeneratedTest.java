package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FilteredIterableConfigurationPropertiesSourceSapientGeneratedTest {

	//Sapient generated method id: ${b4af2388-e781-3800-820a-b8ede09bd914}
	@Test()
	void streamTest() {
		//Arrange Statement(s)
		IterableConfigurationPropertySource iterableConfigurationPropertySourceMock = mock(IterableConfigurationPropertySource.class, "source");
		IterableConfigurationPropertySource iterableConfigurationPropertySourceMock2 = mock(IterableConfigurationPropertySource.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull((Predicate) null, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FilteredIterableConfigurationPropertiesSource target = spy(new FilteredIterableConfigurationPropertiesSource(iterableConfigurationPropertySourceMock, (Predicate) null));
			doReturn(iterableConfigurationPropertySourceMock2).when(target).getSource();
			//TODO: Needs to return real value
			doReturn(null).when(iterableConfigurationPropertySourceMock2).stream();
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.stream();
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Predicate) null, "Filter must not be null"), atLeast(1));
				verify(target, atLeast(1)).getSource();
				verify(iterableConfigurationPropertySourceMock2, atLeast(1)).stream();
			});
		}
	}

	//Sapient generated method id: ${bfcb6725-5fb8-3080-8655-dc87e9921af1}
	@Test()
	void getSource1Test() {
		//Arrange Statement(s)
		IterableConfigurationPropertySource iterableConfigurationPropertySourceMock = mock(IterableConfigurationPropertySource.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(iterableConfigurationPropertySourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Predicate) null, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FilteredIterableConfigurationPropertiesSource target = new FilteredIterableConfigurationPropertiesSource(iterableConfigurationPropertySourceMock, (Predicate) null);
			//Act Statement(s)
			IterableConfigurationPropertySource result = target.getSource();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(iterableConfigurationPropertySourceMock));
				_assert.verify(() -> Assert.notNull(iterableConfigurationPropertySourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Predicate) null, "Filter must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${409a869f-7d3e-391d-9ac0-8089d0ba1991}
	@Disabled()
	@Test()
	void containsDescendantOfTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		IterableConfigurationPropertySource iterableConfigurationPropertySourceMock = mock(IterableConfigurationPropertySource.class, "ConfigurationPropertyState");
		try (MockedStatic<ConfigurationPropertyState> configurationPropertyState = mockStatic(ConfigurationPropertyState.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull((Predicate) null, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FilteredIterableConfigurationPropertiesSource target = new FilteredIterableConfigurationPropertiesSource(iterableConfigurationPropertySourceMock, (Predicate) null);
			configurationPropertyState.when(() -> ConfigurationPropertyState.search(eq(target), (Predicate) any())).thenReturn(ConfigurationPropertyState.PRESENT);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("containsDescendantOf_configurationPropertyName1-name1");
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
				_assert.verify(() -> Assert.notNull((Predicate) null, "Filter must not be null"), atLeast(1));
				configurationPropertyState.verify(() -> ConfigurationPropertyState.search(eq(target), (Predicate) any()), atLeast(1));
			});
		}
	}
}
