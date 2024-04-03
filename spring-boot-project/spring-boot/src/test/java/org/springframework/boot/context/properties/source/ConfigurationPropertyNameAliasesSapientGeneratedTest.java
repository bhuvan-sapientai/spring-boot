package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.util.MultiValueMap;

import org.mockito.stubbing.Answer;

import java.util.Map;
import java.util.Iterator;
import java.util.Set;

import org.springframework.util.Assert;

import java.util.HashSet;

import org.mockito.MockedStatic;

import java.util.Spliterators;
import java.util.ArrayList;
import java.util.stream.StreamSupport;

import static java.util.Map.entry;
import static org.mockito.Mockito.doNothing;
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
class ConfigurationPropertyNameAliasesSapientGeneratedTest {

	private final MultiValueMap<ConfigurationPropertyName, ConfigurationPropertyName> aliasesMock = mock(MultiValueMap.class, "aliases");

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class);

	//Sapient generated method id: ${33fd4f79-ef2b-3f30-ac75-a869eebecb94}, hash: DBE65DE21BEE3B1444A658DE8A120329
	@Disabled()
	@Test()
	void addAliasesTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class)) {
			_assert.when(() -> Assert.notNull("name1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] {};
			_assert.when(() -> Assert.notNull(stringArray, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName[] configurationPropertyNameArray = new ConfigurationPropertyName[] {};
			_assert.when(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1")).thenReturn(configurationPropertyNameMock).thenReturn(configurationPropertyNameMock2);
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock2, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName[] configurationPropertyNameArray2 = new ConfigurationPropertyName[] {};
			_assert.when(() -> Assert.notNull(configurationPropertyNameArray2, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyNameAliases target = new ConfigurationPropertyNameAliases("name1", stringArray);
			List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
			doNothing().when(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList);
			List<ConfigurationPropertyName> configurationPropertyNameList2 = new ArrayList<>();
			doNothing().when(aliasesMock).addAll(configurationPropertyNameMock2, configurationPropertyNameList2);
			//Act Statement(s)
			target.addAliases("name1", stringArray);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull("name1", "Name must not be null"), atLeast(2));
				_assert.verify(() -> Assert.notNull(stringArray, "Aliases must not be null"), atLeast(2));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1"), atLeast(2));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock2, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameArray2, "Aliases must not be null"), atLeast(1));
				verify(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList);
				verify(aliasesMock).addAll(configurationPropertyNameMock2, configurationPropertyNameList2);
			});
		}
	}

	//Sapient generated method id: ${b5f7e64d-074b-3fc8-8adc-0fbfe842d7c3}, hash: 66CFCA3B130543B8FE916F2DFB1A838B
	@Disabled()
	@Test()
	void addAliases1Test() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class)) {
			_assert.when(() -> Assert.notNull("name1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] {};
			_assert.when(() -> Assert.notNull(stringArray, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1")).thenReturn(configurationPropertyNameMock);
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName[] configurationPropertyNameArray = new ConfigurationPropertyName[] {};
			_assert.when(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyNameAliases target = new ConfigurationPropertyNameAliases("name1", stringArray);
			List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
			doNothing().when(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList);
			List<ConfigurationPropertyName> configurationPropertyNameList2 = new ArrayList<>();
			doNothing().when(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList2);
			//Act Statement(s)
			target.addAliases(configurationPropertyNameMock, configurationPropertyNameArray);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull("name1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(stringArray, "Aliases must not be null"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(2));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null"), atLeast(2));
				verify(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList);
				verify(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList2);
			});
		}
	}

	//Sapient generated method id: ${0908a3eb-ee31-39d4-afd0-d5ce03bae9cd}, hash: 3D86D6368C92FC2448E0B3BB10E43AC2
	@Disabled()
	@Test()
	void getAliasesTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class)) {
			_assert.when(() -> Assert.notNull("name1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] {};
			_assert.when(() -> Assert.notNull(stringArray, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1")).thenReturn(configurationPropertyNameMock);
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName[] configurationPropertyNameArray = new ConfigurationPropertyName[] {};
			_assert.when(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyNameAliases target = new ConfigurationPropertyNameAliases("name1", stringArray);
			List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
			doNothing().when(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList);
			List list = new ArrayList<>();
			List list2 = new ArrayList<>();
			doReturn(list).when(aliasesMock).getOrDefault(configurationPropertyNameMock2, list2);
			//Act Statement(s)
			List<ConfigurationPropertyName> result = target.getAliases(configurationPropertyNameMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(list));
				_assert.verify(() -> Assert.notNull("name1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(stringArray, "Aliases must not be null"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null"), atLeast(1));
				verify(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList);
				verify(aliasesMock).getOrDefault(configurationPropertyNameMock2, list2);
			});
		}
	}

	//Sapient generated method id: ${2ba754dc-302b-3b6f-9784-0e2c63277668}, hash: 3A895386B268A3657012491FB199CF31
	@Disabled()
	@Test()
	void getNameForAliasWhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 72)) : true
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName configurationPropertyName2Mock = mock(ConfigurationPropertyName.class);
		ConfigurationPropertyName configurationPropertyName2Mock2 = mock(ConfigurationPropertyName.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class)) {
			_assert.when(() -> Assert.notNull("name1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] {};
			_assert.when(() -> Assert.notNull(stringArray, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1")).thenReturn(configurationPropertyNameMock);
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName[] configurationPropertyNameArray = new ConfigurationPropertyName[] {};
			_assert.when(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyNameAliases target = new ConfigurationPropertyNameAliases("name1", stringArray);
			List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
			doNothing().when(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList);
			List list = new ArrayList<>();
			list.add(configurationPropertyName2Mock2);
			Set<Map.Entry<Object, Object>> mapEntryObjectObjectSet = new HashSet<>();
			mapEntryObjectObjectSet.add(entry(configurationPropertyName2Mock, list));
			doReturn(mapEntryObjectObjectSet).when(aliasesMock).entrySet();
			//Act Statement(s)
			ConfigurationPropertyName result = target.getNameForAlias(configurationPropertyName2Mock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyName2Mock));
				_assert.verify(() -> Assert.notNull("name1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(stringArray, "Aliases must not be null"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null"), atLeast(1));
				verify(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList);
				verify(aliasesMock).entrySet();
			});
		}
	}

	//Sapient generated method id: ${7d45f9ca-df10-3434-98de-4f72063d0581}, hash: B23F71070098C995D4E35E89A840A545
	@Disabled()
	@Test()
	void getNameForAliasWhenDefaultBranch2() {
		/* Branches:
		 * (branch expression (line 72)) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class)) {
			_assert.when(() -> Assert.notNull("name1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] {};
			_assert.when(() -> Assert.notNull(stringArray, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1")).thenReturn(configurationPropertyNameMock);
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName[] configurationPropertyNameArray = new ConfigurationPropertyName[] {};
			_assert.when(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyNameAliases target = new ConfigurationPropertyNameAliases("name1", stringArray);
			List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
			doNothing().when(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList);
			Object object = new Object();
			List list = new ArrayList<>();
			Set<Map.Entry<Object, Object>> mapEntryObjectObjectSet = new HashSet<>();
			mapEntryObjectObjectSet.add(entry(object, list));
			doReturn(mapEntryObjectObjectSet).when(aliasesMock).entrySet();
			//Act Statement(s)
			ConfigurationPropertyName result = target.getNameForAlias(configurationPropertyNameMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull("name1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(stringArray, "Aliases must not be null"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null"), atLeast(1));
				verify(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList);
				verify(aliasesMock).entrySet();
			});
		}
	}

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}, hash: C0EC046672D94368692594161A08622D
	@Disabled()
	@Test()
	void iteratorTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class)) {
			_assert.when(() -> Assert.notNull("name1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] {};
			_assert.when(() -> Assert.notNull(stringArray, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1")).thenReturn(configurationPropertyNameMock);
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName[] configurationPropertyNameArray = new ConfigurationPropertyName[] {};
			_assert.when(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyNameAliases target = new ConfigurationPropertyNameAliases("name1", stringArray);
			List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
			doNothing().when(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList);
			Set set = new HashSet<>();
			doReturn(set).when(aliasesMock).keySet();
			//Act Statement(s)
			Iterator<ConfigurationPropertyName> result = target.iterator();
			Set set2 = new HashSet<>();
			Iterator<ConfigurationPropertyName> iteratorResult = set2.iterator();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(StreamSupport.stream(Spliterators.spliteratorUnknownSize(result, 0), false).toArray(), equalTo(StreamSupport.stream(Spliterators.spliteratorUnknownSize(iteratorResult, 0), false).toArray()));
				_assert.verify(() -> Assert.notNull("name1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(stringArray, "Aliases must not be null"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null"), atLeast(1));
				verify(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList);
				verify(aliasesMock).keySet();
			});
		}
	}
}
