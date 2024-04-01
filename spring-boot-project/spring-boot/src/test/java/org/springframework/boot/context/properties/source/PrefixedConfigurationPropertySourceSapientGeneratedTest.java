package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.boot.origin.Origin;

import org.mockito.MockedStatic;

import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PrefixedConfigurationPropertySourceSapientGeneratedTest {

	private final ConfigurationPropertyName prefixMock = mock(ConfigurationPropertyName.class, "prefix");

	private final ConfigurationPropertySource sourceMock = mock(ConfigurationPropertySource.class, "source");

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class);

	//Sapient generated method id: ${5df79d65-bd15-3ef2-89cc-cba3d3a66689}, hash: C8DC4CC0CD33DD9215C89BCED645E106
	@Test()
	void getConfigurationPropertyWhenConfigurationPropertyIsNull() {
		/* Branches:
		 * (configurationProperty == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.hasText("prefix1", "Prefix must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("prefix1")).thenReturn(prefixMock);
			PrefixedConfigurationPropertySource target = new PrefixedConfigurationPropertySource(sourceMock, "prefix1");
			doReturn(configurationPropertyNameMock).when(prefixMock).append(configurationPropertyNameMock2);
			doReturn(null).when(sourceMock).getConfigurationProperty(configurationPropertyNameMock);
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.hasText("prefix1", "Prefix must not be empty"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("prefix1"), atLeast(1));
				verify(prefixMock).append(configurationPropertyNameMock2);
				verify(sourceMock).getConfigurationProperty(configurationPropertyNameMock);
			});
		}
	}

	//Sapient generated method id: ${87d2c1c5-91e5-3fb5-83d2-294d6c587a4a}, hash: E4D574849CFE256917621EB25AACC646
	@Test()
	void getConfigurationPropertyWhenConfigurationPropertyIsNotNull() {
		/* Branches:
		 * (configurationProperty == null) : false
		 */
		//Arrange Statement(s)
		ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);
		ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);
		Origin originMock = mock(Origin.class);
		ConfigurationProperty configurationPropertyMock2 = mock(ConfigurationProperty.class);
		try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.hasText("prefix1", "Prefix must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("prefix1")).thenReturn(prefixMock);
			Object object = new Object();
			configurationProperty.when(() -> ConfigurationProperty.of(configurationPropertySourceMock, configurationPropertyNameMock, object, originMock)).thenReturn(configurationPropertyMock);
			PrefixedConfigurationPropertySource target = new PrefixedConfigurationPropertySource(sourceMock, "prefix1");
			doReturn(configurationPropertyNameMock2).when(prefixMock).append(configurationPropertyNameMock);
			doReturn(configurationPropertyMock2).when(sourceMock).getConfigurationProperty(configurationPropertyNameMock2);
			doReturn(configurationPropertySourceMock).when(configurationPropertyMock2).getSource();
			doReturn(object).when(configurationPropertyMock2).getValue();
			doReturn(originMock).when(configurationPropertyMock2).getOrigin();
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyMock));
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.hasText("prefix1", "Prefix must not be empty"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("prefix1"), atLeast(1));
				configurationProperty.verify(() -> ConfigurationProperty.of(configurationPropertySourceMock, configurationPropertyNameMock, object, originMock), atLeast(1));
				verify(prefixMock).append(configurationPropertyNameMock);
				verify(sourceMock).getConfigurationProperty(configurationPropertyNameMock2);
				verify(configurationPropertyMock2).getSource();
				verify(configurationPropertyMock2).getValue();
				verify(configurationPropertyMock2).getOrigin();
			});
		}
	}

	//Sapient generated method id: ${409a869f-7d3e-391d-9ac0-8089d0ba1991}, hash: 6052CF9F259A798CE097E43C33043638
	@Test()
	void containsDescendantOfTest() {
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.hasText("prefix1", "Prefix must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("prefix1")).thenReturn(prefixMock);
			PrefixedConfigurationPropertySource target = new PrefixedConfigurationPropertySource(sourceMock, "prefix1");
			doReturn(configurationPropertyNameMock).when(prefixMock).append(configurationPropertyNameMock2);
			doReturn(ConfigurationPropertyState.PRESENT).when(sourceMock).containsDescendantOf(configurationPropertyNameMock);
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.hasText("prefix1", "Prefix must not be empty"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("prefix1"), atLeast(1));
				verify(prefixMock).append(configurationPropertyNameMock2);
				verify(sourceMock).containsDescendantOf(configurationPropertyNameMock);
			});
		}
	}

	//Sapient generated method id: ${72fc3519-47ef-3838-a2f1-90ba712b0e09}, hash: 856F6699D1885C2ACED62BDBEB75B420
	@Test()
	void getUnderlyingSourceTest() {
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.hasText("prefix1", "Prefix must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("prefix1")).thenReturn(prefixMock);
			PrefixedConfigurationPropertySource target = new PrefixedConfigurationPropertySource(sourceMock, "prefix1");
			Object object = new Object();
			doReturn(object).when(sourceMock).getUnderlyingSource();
			//Act Statement(s)
			Object result = target.getUnderlyingSource();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object));
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.hasText("prefix1", "Prefix must not be empty"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("prefix1"), atLeast(1));
				verify(sourceMock).getUnderlyingSource();
			});
		}
	}
}
