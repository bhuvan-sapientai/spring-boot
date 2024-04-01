package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.mockito.stubbing.Answer;

import org.springframework.boot.origin.Origin;
import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AliasedConfigurationPropertySourceSapientGeneratedTest {

	private final ConfigurationPropertySource sourceMock = mock(ConfigurationPropertySource.class, "value");

	private final ConfigurationPropertyNameAliases configurationPropertyNameAliasesMock = mock(ConfigurationPropertyNameAliases.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class);

	private final ConfigurationPropertyName configurationPropertyNameMock3 = mock(ConfigurationPropertyName.class);

	//Sapient generated method id: ${afdea9c1-05b9-3355-84f5-40a88d07c949}, hash: 6378253F7E15992BFFB64251D6468C20
	@Test()
	void getConfigurationPropertyWhenResultIsNull() {
		/* Branches:
		 * (result == null) : true
		 */
		//Arrange Statement(s)
		ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(null).when(sourceMock).getConfigurationProperty(configurationPropertyNameMock);
			doReturn(configurationPropertyMock).when(sourceMock).getConfigurationProperty(configurationPropertyNameMock2);
			doReturn(configurationPropertyNameMock2).when(configurationPropertyNameAliasesMock).getNameForAlias(configurationPropertyNameMock);
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			AliasedConfigurationPropertySource target = new AliasedConfigurationPropertySource(sourceMock, configurationPropertyNameAliasesMock);
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyMock));
				verify(sourceMock).getConfigurationProperty(configurationPropertyNameMock);
				verify(sourceMock).getConfigurationProperty(configurationPropertyNameMock2);
				verify(configurationPropertyNameAliasesMock).getNameForAlias(configurationPropertyNameMock);
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c3c3fd5b-a356-3df9-aee3-ef869b720dbf}, hash: 7F126117F029916232B95617F483922A
	@Test()
	void containsDescendantOfWhenResultNotEqualsConfigurationPropertyStateABSENT() {
		/* Branches:
		 * (result != ConfigurationPropertyState.ABSENT) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			AliasedConfigurationPropertySource target = new AliasedConfigurationPropertySource(sourceMock, configurationPropertyNameAliasesMock);
			doReturn(ConfigurationPropertyState.PRESENT).when(sourceMock).containsDescendantOf(configurationPropertyNameMock);
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
				verify(sourceMock).containsDescendantOf(configurationPropertyNameMock);
			});
		}
	}

	//Sapient generated method id: ${708d7127-32c4-3ea7-8ada-25c956d0fab0}, hash: DDB3D0FF16AF55B94D319E68BEF210F2
	@Test()
	void containsDescendantOfWhenAliasResultNotEqualsConfigurationPropertyStateABSENT() {
		/* Branches:
		 * (result != ConfigurationPropertyState.ABSENT) : false
		 * (for-each(getAliases().getAliases(name))) : true
		 * (aliasResult != ConfigurationPropertyState.ABSENT) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
			configurationPropertyNameList.add(configurationPropertyNameMock);
			doReturn(configurationPropertyNameList).when(configurationPropertyNameAliasesMock).getAliases(configurationPropertyNameMock2);
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock2, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			AliasedConfigurationPropertySource target = new AliasedConfigurationPropertySource(sourceMock, configurationPropertyNameAliasesMock);
			doReturn(ConfigurationPropertyState.ABSENT).when(sourceMock).containsDescendantOf(configurationPropertyNameMock2);
			doReturn(ConfigurationPropertyState.UNKNOWN).when(sourceMock).containsDescendantOf(configurationPropertyNameMock);
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.UNKNOWN));
				verify(configurationPropertyNameAliasesMock).getAliases(configurationPropertyNameMock2);
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock2, "Name must not be null"), atLeast(1));
				verify(sourceMock).containsDescendantOf(configurationPropertyNameMock2);
				verify(sourceMock).containsDescendantOf(configurationPropertyNameMock);
			});
		}
	}

	//Sapient generated method id: ${4ff7f135-5180-33e6-8972-004d6855a6eb}, hash: AA7EAF79B2F05F81BF7846CE4E3C6913
	@Test()
	void containsDescendantOfWhenNameIsAncestorOfAliasAndThisSourceGetConfigurationPropertyFromIsNotNull() {
		/* Branches:
		 * (result != ConfigurationPropertyState.ABSENT) : false
		 * (for-each(getAliases().getAliases(name))) : true
		 * (aliasResult != ConfigurationPropertyState.ABSENT) : false
		 * (for-each(getAliases())) : true
		 * (for-each(getAliases().getAliases(from))) : true
		 * (name.isAncestorOf(alias)) : true
		 * (this.source.getConfigurationProperty(from) != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyNameAliases configurationPropertyNameAliasesMock = mock(ConfigurationPropertyNameAliases.class, "value");
		ConfigurationPropertyName configurationPropertyNameMock4 = mock(ConfigurationPropertyName.class);
		Origin originMock = mock(Origin.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
			configurationPropertyNameList.add(configurationPropertyNameMock);
			doReturn(configurationPropertyNameList).when(configurationPropertyNameAliasesMock).getAliases((ConfigurationPropertyName) any());
			doReturn(null).when(configurationPropertyNameAliasesMock).iterator();
			List<ConfigurationPropertyName> configurationPropertyNameList2 = new ArrayList<>();
			configurationPropertyNameList2.add(configurationPropertyNameMock2);
			doReturn(configurationPropertyNameList2).when(configurationPropertyNameAliasesMock).getAliases(configurationPropertyNameMock3);
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			AliasedConfigurationPropertySource target = new AliasedConfigurationPropertySource(sourceMock, configurationPropertyNameAliasesMock);
			doReturn(ConfigurationPropertyState.ABSENT).when(sourceMock).containsDescendantOf((ConfigurationPropertyName) any());
			doReturn(ConfigurationPropertyState.ABSENT).when(sourceMock).containsDescendantOf(configurationPropertyNameMock);
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock4, object, originMock);
			doReturn(configurationProperty).when(sourceMock).getConfigurationProperty(configurationPropertyNameMock3);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("containsDescendantOf_configurationPropertyName1-name1");
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
				verify(configurationPropertyNameAliasesMock).getAliases((ConfigurationPropertyName) any());
				verify(configurationPropertyNameAliasesMock).iterator();
				verify(configurationPropertyNameAliasesMock).getAliases(configurationPropertyNameMock3);
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null")));
				verify(sourceMock).containsDescendantOf((ConfigurationPropertyName) any());
				verify(sourceMock).containsDescendantOf(configurationPropertyNameMock);
				verify(sourceMock).getConfigurationProperty(configurationPropertyNameMock3);
			});
		}
	}

	//Sapient generated method id: ${02477335-0c9a-3ec3-adf5-ef11b2752a73}, hash: BF8C9C9808524584BF45940839DCA647
	@Test()
	void containsDescendantOfWhenNameIsAncestorOfAliasAndThisSourceGetConfigurationPropertyFromIsNull() {
		/* Branches:
		 * (result != ConfigurationPropertyState.ABSENT) : false
		 * (for-each(getAliases().getAliases(name))) : true
		 * (aliasResult != ConfigurationPropertyState.ABSENT) : false
		 * (for-each(getAliases())) : true
		 * (for-each(getAliases().getAliases(from))) : true
		 * (name.isAncestorOf(alias)) : true
		 * (this.source.getConfigurationProperty(from) != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
			configurationPropertyNameList.add(configurationPropertyNameMock);
			doReturn(configurationPropertyNameList).when(configurationPropertyNameAliasesMock).getAliases((ConfigurationPropertyName) any());
			doReturn(null).when(configurationPropertyNameAliasesMock).iterator();
			List<ConfigurationPropertyName> configurationPropertyNameList2 = new ArrayList<>();
			configurationPropertyNameList2.add(configurationPropertyNameMock2);
			doReturn(configurationPropertyNameList2).when(configurationPropertyNameAliasesMock).getAliases(configurationPropertyNameMock3);
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			AliasedConfigurationPropertySource target = new AliasedConfigurationPropertySource(sourceMock, configurationPropertyNameAliasesMock);
			doReturn(ConfigurationPropertyState.ABSENT).when(sourceMock).containsDescendantOf((ConfigurationPropertyName) any());
			doReturn(ConfigurationPropertyState.ABSENT).when(sourceMock).containsDescendantOf(configurationPropertyNameMock);
			doReturn(null).when(sourceMock).getConfigurationProperty(configurationPropertyNameMock3);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("containsDescendantOf_configurationPropertyName1-name1");
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
				verify(configurationPropertyNameAliasesMock).getAliases((ConfigurationPropertyName) any());
				verify(configurationPropertyNameAliasesMock).iterator();
				verify(configurationPropertyNameAliasesMock).getAliases(configurationPropertyNameMock3);
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null")));
				verify(sourceMock).containsDescendantOf((ConfigurationPropertyName) any());
				verify(sourceMock).containsDescendantOf(configurationPropertyNameMock);
				verify(sourceMock).getConfigurationProperty(configurationPropertyNameMock3);
			});
		}
	}

	//Sapient generated method id: ${72fc3519-47ef-3838-a2f1-90ba712b0e09}, hash: D728E67873080913969B8CFBE2FFEA38
	@Test()
	void getUnderlyingSourceTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			AliasedConfigurationPropertySource target = new AliasedConfigurationPropertySource(sourceMock, configurationPropertyNameAliasesMock);
			Object object = new Object();
			doReturn(object).when(sourceMock).getUnderlyingSource();
			//Act Statement(s)
			Object result = target.getUnderlyingSource();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object));
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null"), atLeast(1));
				verify(sourceMock).getUnderlyingSource();
			});
		}
	}
}
