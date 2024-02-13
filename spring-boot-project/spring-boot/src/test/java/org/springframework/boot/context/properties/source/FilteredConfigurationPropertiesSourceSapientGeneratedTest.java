package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import org.springframework.util.Assert;

import java.util.function.Predicate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FilteredConfigurationPropertiesSourceSapientGeneratedTest {

	private final ConfigurationPropertySource sourceMock = mock(ConfigurationPropertySource.class, "<init>_configurationPropertySource1");

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	//Sapient generated method id: ${83cc193e-c3fe-3d15-89d9-324b130ff7fa}
	@Test()
	void getConfigurationPropertyWhenFiltered() {
		/* Branches:
		 * (filtered) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Predicate) null, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FilteredConfigurationPropertiesSource target = new FilteredConfigurationPropertiesSource(sourceMock, (Predicate) null);
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.getConfigurationProperty(configurationPropertyNameMock);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Predicate) null, "Filter must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${17249c2a-2677-3381-9b43-5c4eb5883a4b}
	@Test()
	void getConfigurationPropertyWhenNotFiltered() {
		/* Branches:
		 * (filtered) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Predicate) null, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FilteredConfigurationPropertiesSource target = new FilteredConfigurationPropertiesSource(sourceMock, (Predicate) null);
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.getConfigurationProperty(configurationPropertyNameMock);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Predicate) null, "Filter must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ec954726-fd43-35a0-bfcb-1b9fb123582d}
	@Test()
	void containsDescendantOfWhenResultEqualsConfigurationPropertyStatePRESENT() {
		/* Branches:
		 * (result == ConfigurationPropertyState.PRESENT) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Predicate) null, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FilteredConfigurationPropertiesSource target = new FilteredConfigurationPropertiesSource(sourceMock, (Predicate) null);
			doReturn(ConfigurationPropertyState.PRESENT).when(sourceMock).containsDescendantOf(configurationPropertyNameMock);
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.UNKNOWN));
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Predicate) null, "Filter must not be null"), atLeast(1));
				verify(sourceMock).containsDescendantOf(configurationPropertyNameMock);
			});
		}
	}

	//Sapient generated method id: ${037d2fc7-5bba-3d25-a42b-3c3834dbb372}
	@Test()
	void containsDescendantOfWhenResultNotEqualsConfigurationPropertyStatePRESENT() {
		/* Branches:
		 * (result == ConfigurationPropertyState.PRESENT) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Predicate) null, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FilteredConfigurationPropertiesSource target = new FilteredConfigurationPropertiesSource(sourceMock, (Predicate) null);
			doReturn(ConfigurationPropertyState.ABSENT).when(sourceMock).containsDescendantOf(configurationPropertyNameMock);
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Predicate) null, "Filter must not be null"), atLeast(1));
				verify(sourceMock).containsDescendantOf(configurationPropertyNameMock);
			});
		}
	}

	//Sapient generated method id: ${72fc3519-47ef-3838-a2f1-90ba712b0e09}
	@Test()
	void getUnderlyingSourceTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Predicate) null, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FilteredConfigurationPropertiesSource target = new FilteredConfigurationPropertiesSource(sourceMock, (Predicate) null);
			Object object = new Object();
			doReturn(object).when(sourceMock).getUnderlyingSource();
			//Act Statement(s)
			Object result = target.getUnderlyingSource();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object));
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Predicate) null, "Filter must not be null"), atLeast(1));
				verify(sourceMock).getUnderlyingSource();
			});
		}
	}

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
	@Test()
	void toStringTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Predicate) null, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FilteredConfigurationPropertiesSource target = new FilteredConfigurationPropertiesSource(sourceMock, (Predicate) null);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("<init>_configurationPropertySource1 (filtered)"));
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Predicate) null, "Filter must not be null"), atLeast(1));
			});
		}
	}
}
