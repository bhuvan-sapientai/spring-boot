package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.boot.origin.Origin;

import org.mockito.MockedStatic;

import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertySourcesPropertySourceSapientGeneratedTest {

	private final ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final Origin originMock = mock(Origin.class);

	//Sapient generated method id: ${c8522442-ccd2-31c0-bc85-866d6a266a17}
	@Test()
	void containsPropertyWhenFindConfigurationPropertyNameIsNotNull() throws Exception {
		/* Branches:
		 * (findConfigurationProperty(name) != null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Iterable) null, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(configurationPropertyNameMock);
			ConfigurationPropertySourcesPropertySource target = spy(new ConfigurationPropertySourcesPropertySource("A", (Iterable) null));
			doReturn(configurationPropertyMock).when(target).findConfigurationProperty(configurationPropertyNameMock);
			//Act Statement(s)
			boolean result = target.containsProperty("name1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Property source must not be null"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
				verify(target).findConfigurationProperty(configurationPropertyNameMock);
			});
		}
	}

	//Sapient generated method id: ${6980eeb5-53eb-3f91-8a65-1183c5921534}
	@Test()
	void containsPropertyWhenFindConfigurationPropertyNameIsNull() throws Exception {
		/* Branches:
		 * (findConfigurationProperty(name) != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Iterable) null, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(configurationPropertyNameMock);
			ConfigurationPropertySourcesPropertySource target = spy(new ConfigurationPropertySourcesPropertySource("A", (Iterable) null));
			doReturn(null).when(target).findConfigurationProperty(configurationPropertyNameMock);
			//Act Statement(s)
			boolean result = target.containsProperty("name1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Property source must not be null"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
				verify(target).findConfigurationProperty(configurationPropertyNameMock);
			});
		}
	}

	//Sapient generated method id: ${cadd315c-b0e7-3e68-80fe-801e368edab5}
	@Test()
	void containsPropertyWhenCaughtExceptionAndFindConfigurationPropertyNameIsNull() throws Exception {
		/* Branches:
		 * (catch-exception (Exception)) : true  #  inside findConfigurationProperty method
		 * (findConfigurationProperty(name) != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Iterable) null, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(configurationPropertyNameMock);
			ConfigurationPropertySourcesPropertySource target = spy(new ConfigurationPropertySourcesPropertySource("A", (Iterable) null));
			RuntimeException runtimeException = new RuntimeException();
			doThrow(runtimeException).when(target).findConfigurationProperty(configurationPropertyNameMock);
			//Act Statement(s)
			boolean result = target.containsProperty("name1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Property source must not be null"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
				verify(target).findConfigurationProperty(configurationPropertyNameMock);
			});
		}
	}

	//Sapient generated method id: ${c029e087-b4b1-3abc-a8a4-64640b8364f1}
	@Test()
	void getPropertyWhenConfigurationPropertyIsNotNull() throws Exception {
		/* Branches:
		 * (configurationProperty != null) : true
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName configurationPropertyName2Mock = mock(ConfigurationPropertyName.class);
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Iterable) null, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(configurationPropertyNameMock);
			ConfigurationPropertySourcesPropertySource target = spy(new ConfigurationPropertySourcesPropertySource("A", (Iterable) null));
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, object, originMock);
			doReturn(configurationProperty).when(target).findConfigurationProperty(configurationPropertyNameMock);
			//Act Statement(s)
			Object result = target.getProperty("name1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object));
				_assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Property source must not be null"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
				verify(target).findConfigurationProperty(configurationPropertyNameMock);
			});
		}
	}

	//Sapient generated method id: ${a5c92115-fa38-35f5-bab9-30f999101b93}
	@Test()
	void getPropertyWhenConfigurationPropertyIsNull() throws Exception {
		/* Branches:
		 * (configurationProperty != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Iterable) null, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(configurationPropertyNameMock);
			ConfigurationPropertySourcesPropertySource target = spy(new ConfigurationPropertySourcesPropertySource("A", (Iterable) null));
			doReturn(null).when(target).findConfigurationProperty(configurationPropertyNameMock);
			//Act Statement(s)
			Object result = target.getProperty("name1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Property source must not be null"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
				verify(target).findConfigurationProperty(configurationPropertyNameMock);
			});
		}
	}

	//Sapient generated method id: ${e2574411-10b7-304b-8005-c59bd362cb27}
	@Test()
	void getPropertyWhenCaughtExceptionAndConfigurationPropertyIsNull() throws Exception {
		/* Branches:
		 * (catch-exception (Exception)) : true  #  inside findConfigurationProperty method
		 * (configurationProperty != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Iterable) null, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(configurationPropertyNameMock);
			ConfigurationPropertySourcesPropertySource target = spy(new ConfigurationPropertySourcesPropertySource("A", (Iterable) null));
			RuntimeException runtimeException = new RuntimeException();
			doThrow(runtimeException).when(target).findConfigurationProperty(configurationPropertyNameMock);
			//Act Statement(s)
			Object result = target.getProperty("name1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Property source must not be null"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
				verify(target).findConfigurationProperty(configurationPropertyNameMock);
			});
		}
	}

	//Sapient generated method id: ${7470ee36-9b2f-3d61-ac6f-ede146cc5169}
	@Test()
	void getOriginTest() throws Exception {
		//Arrange Statement(s)
		try (MockedStatic<Origin> origin = mockStatic(Origin.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Iterable) null, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(configurationPropertyNameMock);
			origin.when(() -> Origin.from(configurationPropertyMock)).thenReturn(originMock);
			ConfigurationPropertySourcesPropertySource target = spy(new ConfigurationPropertySourcesPropertySource("A", (Iterable) null));
			doReturn(configurationPropertyMock).when(target).findConfigurationProperty(configurationPropertyNameMock);
			//Act Statement(s)
			Origin result = target.getOrigin("name1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(originMock));
				_assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Property source must not be null"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
				origin.verify(() -> Origin.from(configurationPropertyMock), atLeast(1));
				verify(target).findConfigurationProperty(configurationPropertyNameMock);
			});
		}
	}

	//Sapient generated method id: ${97eb5874-549b-34a9-9164-4a6cc26d7a6e}
	@Test()
	void getOriginWhenCaughtException() throws Exception {
		/* Branches:
		 * (catch-exception (Exception)) : true  #  inside findConfigurationProperty method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Origin> origin = mockStatic(Origin.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Iterable) null, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(configurationPropertyNameMock);
			origin.when(() -> Origin.from((ConfigurationProperty) null)).thenReturn(originMock);
			ConfigurationPropertySourcesPropertySource target = spy(new ConfigurationPropertySourcesPropertySource("A", (Iterable) null));
			RuntimeException runtimeException = new RuntimeException();
			doThrow(runtimeException).when(target).findConfigurationProperty(configurationPropertyNameMock);
			//Act Statement(s)
			Origin result = target.getOrigin("name1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(originMock));
				_assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Property source must not be null"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
				origin.verify(() -> Origin.from((ConfigurationProperty) null), atLeast(1));
				verify(target).findConfigurationProperty(configurationPropertyNameMock);
			});
		}
	}

	//Sapient generated method id: ${83bc0ef2-c211-3ee1-9c2d-90cf447ec19b}
	@Test()
	void findConfigurationProperty1WhenNameIsNull() {
		/* Branches:
		 * (name == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Iterable) null, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertySourcesPropertySource target = new ConfigurationPropertySourcesPropertySource("A", (Iterable) null);
			ConfigurationPropertyName configurationPropertyName = null;
			//Act Statement(s)
			ConfigurationProperty result = target.findConfigurationProperty(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Property source must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b053ca80-52b3-380a-9629-4f855e967084}
	@Disabled()
	@Test()
	void findConfigurationProperty1WhenConfigurationPropertyIsNotNull() {
		/* Branches:
		 * (name == null) : false
		 * (for-each(getSource())) : true
		 * (configurationProperty != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Iterable) null, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertySourcesPropertySource target = new ConfigurationPropertySourcesPropertySource("A", (Iterable) null);
			//Act Statement(s)
			ConfigurationProperty result = target.findConfigurationProperty(configurationPropertyNameMock);
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock2, object, originMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationProperty));
				_assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Property source must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e9e16a80-1465-3449-b5d0-62e3bb413659}
	@Disabled()
	@Test()
	void findConfigurationProperty1WhenConfigurationPropertyIsNull() {
		/* Branches:
		 * (name == null) : false
		 * (for-each(getSource())) : true
		 * (configurationProperty != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((Iterable) null, "Property source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertySourcesPropertySource target = new ConfigurationPropertySourcesPropertySource("A", (Iterable) null);
			//Act Statement(s)
			ConfigurationProperty result = target.findConfigurationProperty(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Property source must not be null"), atLeast(1));
			});
		}
	}
}
