package org.springframework.boot.info;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import java.util.Iterator;

import org.springframework.core.env.PropertySource;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import java.time.Instant;
import java.util.Properties;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class InfoPropertiesSapientGeneratedTest {

	//Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: 8A10B5AA4BE309624B0A59AD77E4DAB7
	@Test()
	void getTest() {
		//Arrange Statement(s)
		Properties properties = new Properties();
		InfoProperties target = new InfoProperties(properties);

		//Act Statement(s)
		String result = target.get("key1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${d649b37b-85df-3b5d-a476-7b25fba0225b}, hash: E7E289505DA7013A89B6DF91864A0D90
	@Test()
	void getInstantWhenSIsNotNull() {
		/* Branches:
		 * (s != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Properties properties = new Properties();
			InfoProperties target = new InfoProperties(properties);
			//Act Statement(s)
			Instant result = target.getInstant("key1");
			Instant instant = Instant.ofEpochMilli(0L);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(instant));
				_assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
			});
		}
	}

	//Sapient generated method id: ${775cf48f-3bf0-3d18-83df-da7ba5410efa}, hash: E6EED9B1FE0AFBE786568C6E9893A3A1
	@Test()
	void getInstantWhenSIsNull() {
		/* Branches:
		 * (s != null) : false
		 */
		//Arrange Statement(s)
		Properties properties = new Properties();
		InfoProperties target = new InfoProperties(properties);

		//Act Statement(s)
		Instant result = target.getInstant("key1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${51b7559e-1395-31ed-aa27-c35cc6f8ad1e}, hash: 10FCFC29B8EBD92DCEC3F8E337AA57B4
	@Test()
	void getInstantWhenCaughtNumberFormatException() {
		/* Branches:
		 * (s != null) : true
		 * (catch-exception (NumberFormatException)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Properties properties = new Properties();
		InfoProperties target = new InfoProperties(properties);

		//Act Statement(s)
		Instant result = target.getInstant("<value>");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}, hash: 508BB129A4222AFF8949F9A05B82AE2D
	@Test()
	void iteratorTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Properties properties = new Properties();
		InfoProperties target = new InfoProperties(properties);

		//Act Statement(s)
		Iterator<InfoProperties.Entry> result = target.iterator();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${b700b133-0c21-32ef-aa97-4102f5288fda}, hash: 4BA8CC569097A804FA0F03FF7905CE86
	@Test()
	void toPropertySourceTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Properties) any(), eq("Entries must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Properties properties = new Properties();
			InfoProperties target = new InfoProperties(properties);
			//Act Statement(s)
			PropertySource<?> result = target.toPropertySource();
			Properties properties2 = new Properties();
			PropertiesPropertySource propertiesPropertySource = new PropertiesPropertySource("InfoProperties", properties2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(propertiesPropertySource));
				_assert.verify(() -> Assert.notNull((Properties) any(), eq("Entries must not be null")));
			});
		}
	}
}
