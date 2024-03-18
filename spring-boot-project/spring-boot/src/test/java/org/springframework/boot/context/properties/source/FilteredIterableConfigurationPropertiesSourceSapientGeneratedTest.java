package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import java.util.stream.Stream;

import org.springframework.util.Assert;

import java.util.function.Predicate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FilteredIterableConfigurationPropertiesSourceSapientGeneratedTest {

	private final IterableConfigurationPropertySource iterableConfigurationPropertySourceMock = mock(IterableConfigurationPropertySource.class);

	private final Predicate predicateMock = mock(Predicate.class);

	//Sapient generated method id: ${b4af2388-e781-3800-820a-b8ede09bd914}, hash: 73789B2E7CF7031C4D1A1B371EAA3BDA
	@Test()
	void streamTest() {
		//Arrange Statement(s)
		IterableConfigurationPropertySource iterableConfigurationPropertySourceMock2 = mock(IterableConfigurationPropertySource.class);
		Stream streamMock = mock(Stream.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(iterableConfigurationPropertySourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(predicateMock, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FilteredIterableConfigurationPropertiesSource target = spy(new FilteredIterableConfigurationPropertiesSource(iterableConfigurationPropertySourceMock, predicateMock));
			doReturn(iterableConfigurationPropertySourceMock2).when(target).getSource();
			doReturn(streamMock).when(iterableConfigurationPropertySourceMock2).stream();
			Stream stream = Stream.empty();
			doReturn(stream).when(streamMock).filter(predicateMock);
			//Act Statement(s)
			Stream<ConfigurationPropertyName> result = target.stream();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(stream));
				_assert.verify(() -> Assert.notNull(iterableConfigurationPropertySourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(predicateMock, "Filter must not be null"), atLeast(1));
				verify(target).getSource();
				verify(iterableConfigurationPropertySourceMock2).stream();
				verify(streamMock).filter(predicateMock);
			});
		}
	}

	//Sapient generated method id: ${bfcb6725-5fb8-3080-8655-dc87e9921af1}, hash: E6673DEFB9A8F7E7A8CFDD2BAF22F39D
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

	//Sapient generated method id: ${409a869f-7d3e-391d-9ac0-8089d0ba1991}, hash: B099AAC742D5138E773B863A1CC66A48
	@Disabled()
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
