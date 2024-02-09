package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;

import org.mockito.stubbing.Answer;

import org.springframework.core.log.LogMessage;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.util.Assert;

import java.util.function.Function;

import org.apache.commons.logging.Log;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.Random;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
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
class RandomValuePropertySourceSapientGeneratedTest {

	private final ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);

	private final LogMessage logMessageMock = mock(LogMessage.class);

	private final MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);

	private final PropertySource<?> propertySourceMock = mock(PropertySource.class);

	private final RandomValuePropertySource.Range randomValuePropertySourceRangeMock = mock(RandomValuePropertySource.Range.class);

	//Sapient generated method id: ${dbfc859f-fd81-3175-baac-e4014845ddae}
	@Test()
	void getPropertyWhenNameNotStartsWithPREFIX() {
		/* Branches:
		 * (!name.startsWith(PREFIX)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.hasText("I", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			RandomValuePropertySource target = new RandomValuePropertySource("I");
			//Act Statement(s)
			Object result = target.getProperty("B");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.hasText("I", "Property source name must contain at least one character"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${0f36305b-0097-3cd7-b65c-d72420b2f717}
	@Disabled()
	@Test()
	void getPropertyWhenTypeEqualsInt() {
		/* Branches:
		 * (!name.startsWith(PREFIX)) : false
		 * (type.equals("int")) : true  #  inside getRandomValue method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			logMessage.when(() -> LogMessage.format("Generating random property for '%s'", "random.int")).thenReturn(logMessageMock);
			RandomValuePropertySource target = spy(new RandomValuePropertySource("A"));
			Random random = new Random();
			doReturn(random).when(target).getSource();
			//Act Statement(s)
			Object result = target.getProperty("random.int");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(0));
				_assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Generating random property for '%s'", "random.int"), atLeast(1));
				verify(target, atLeast(1)).getSource();
			});
		}
	}

	//Sapient generated method id: ${f65e35f5-8987-3b69-a505-8fc9cd21e135}
	@Disabled()
	@Test()
	void getPropertyWhenTypeEqualsLong() {
		/* Branches:
		 * (!name.startsWith(PREFIX)) : false
		 * (type.equals("int")) : false  #  inside getRandomValue method
		 * (type.equals("long")) : true  #  inside getRandomValue method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			logMessage.when(() -> LogMessage.format("Generating random property for '%s'", "random.long")).thenReturn(logMessageMock);
			RandomValuePropertySource target = spy(new RandomValuePropertySource("A"));
			Random random = new Random();
			doReturn(random).when(target).getSource();
			//Act Statement(s)
			Object result = target.getProperty("random.long");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(0L));
				_assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Generating random property for '%s'", "random.long"), atLeast(1));
				verify(target, atLeast(1)).getSource();
			});
		}
	}

	//Sapient generated method id: ${09c5b2c4-a3dd-37b7-a254-a6c85c44ac03}
	@Disabled()
	@Test()
	void getPropertyWhenRangeIsNotNull() {
		/* Branches:
		 * (!name.startsWith(PREFIX)) : false
		 * (type.equals("int")) : false  #  inside getRandomValue method
		 * (type.equals("long")) : false  #  inside getRandomValue method
		 * (type.startsWith(prefix)) : true  #  inside getRange method
		 * (type.length() > startIndex) : true  #  inside getRange method
		 * (range != null) : true  #  inside getRandomValue method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<RandomValuePropertySource.Range> randomValuePropertySourceRange = mockStatic(RandomValuePropertySource.Range.class);
			 MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class)) {
			_assert.when(() -> Assert.hasText("C", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			logMessage.when(() -> LogMessage.format("Generating random property for '%s'", "random.intABDE")).thenReturn(logMessageMock);
			randomValuePropertySourceRange.when(() -> RandomValuePropertySource.Range.of(eq("BD"), (Function) any())).thenReturn(randomValuePropertySourceRangeMock);
			doReturn(1).when(randomValuePropertySourceRangeMock).getMin();
			doReturn(1).when(randomValuePropertySourceRangeMock).getMax();
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			RandomValuePropertySource target = spy(new RandomValuePropertySource("C"));
			Random random = new Random();
			doReturn(random).when(target).getSource();
			//Act Statement(s)
			Object result = target.getProperty("random.intABDE");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(1));
				_assert.verify(() -> Assert.hasText("C", "Property source name must contain at least one character"), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Generating random property for '%s'", "random.intABDE"), atLeast(1));
				randomValuePropertySourceRange.verify(() -> RandomValuePropertySource.Range.of(eq("BD"), (Function) any()), atLeast(1));
				verify(randomValuePropertySourceRangeMock, atLeast(1)).getMin();
				verify(randomValuePropertySourceRangeMock, atLeast(1)).getMax();
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(1));
				verify(target, atLeast(1)).getSource();
			});
		}
	}

	//Sapient generated method id: ${c3f8f3ae-6ab4-3435-b568-f8708d2d87c9}
	@Disabled()
	@Test()
	void getPropertyWhenRangeIsNullAndRangeIsNotNull() {
		/* Branches:
		 * (!name.startsWith(PREFIX)) : false
		 * (type.equals("int")) : false  #  inside getRandomValue method
		 * (type.equals("long")) : false  #  inside getRandomValue method
		 * (type.startsWith(prefix)) : true  #  inside getRange method
		 * (type.length() > startIndex) : true  #  inside getRange method
		 * (range != null) : false  #  inside getRandomValue method
		 * (range != null) : true  #  inside getRandomValue method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<RandomValuePropertySource.Range> randomValuePropertySourceRange = mockStatic(RandomValuePropertySource.Range.class);
			 MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class)) {
			_assert.when(() -> Assert.hasText("name1", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			logMessage.when(() -> LogMessage.format("Generating random property for '%s'", "name1")).thenReturn(logMessageMock);
			randomValuePropertySourceRange.when(() -> RandomValuePropertySource.Range.of(eq("value1"), (Function) any())).thenReturn(randomValuePropertySourceRangeMock);
			doReturn(0L).when(randomValuePropertySourceRangeMock).getMin();
			doReturn(0L).when(randomValuePropertySourceRangeMock).getMax();
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			RandomValuePropertySource target = spy(new RandomValuePropertySource("name1"));
			Random random = new Random();
			doReturn(random).when(target).getSource();
			//Act Statement(s)
			Object result = target.getProperty("name1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(0L));
				_assert.verify(() -> Assert.hasText("name1", "Property source name must contain at least one character"), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Generating random property for '%s'", "name1"), atLeast(1));
				randomValuePropertySourceRange.verify(() -> RandomValuePropertySource.Range.of(eq("value1"), (Function) any()), atLeast(1));
				verify(randomValuePropertySourceRangeMock, atLeast(1)).getMin();
				verify(randomValuePropertySourceRangeMock, atLeast(1)).getMax();
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(1));
				verify(target, atLeast(1)).getSource();
			});
		}
	}

	//Sapient generated method id: ${9f897460-478e-39e7-baae-a7f212da7774}
	@Disabled()
	@Test()
	void getPropertyWhenTypeEqualsUuid() {
		/* Branches:
		 * (!name.startsWith(PREFIX)) : false
		 * (type.equals("int")) : false  #  inside getRandomValue method
		 * (type.equals("long")) : false  #  inside getRandomValue method
		 * (type.startsWith(prefix)) : true  #  inside getRange method
		 * (type.length() > startIndex) : true  #  inside getRange method
		 * (range != null) : false  #  inside getRandomValue method
		 * (range != null) : false  #  inside getRandomValue method
		 * (type.equals("uuid")) : true  #  inside getRandomValue method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.hasText("name1", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			logMessage.when(() -> LogMessage.format("Generating random property for '%s'", "name1")).thenReturn(logMessageMock);
			RandomValuePropertySource target = new RandomValuePropertySource("name1");
			//Act Statement(s)
			Object result = target.getProperty("name1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("result1"));
				_assert.verify(() -> Assert.hasText("name1", "Property source name must contain at least one character"), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Generating random property for '%s'", "name1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e2c2da42-b907-3228-a688-d482ea1cf485}
	@Disabled()
	@Test()
	void getPropertyWhenTypeLengthNotGreaterThanStartIndexAndRangeIsNullAndRangeIsNullAndTypeNotEqualsUuid() {
		/* Branches:
		 * (!name.startsWith(PREFIX)) : false
		 * (type.equals("int")) : false  #  inside getRandomValue method
		 * (type.equals("long")) : false  #  inside getRandomValue method
		 * (type.startsWith(prefix)) : true  #  inside getRange method
		 * (type.length() > startIndex) : false  #  inside getRange method
		 * (range != null) : false  #  inside getRandomValue method
		 * (range != null) : false  #  inside getRandomValue method
		 * (type.equals("uuid")) : false  #  inside getRandomValue method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.hasText("B", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
			logMessage.when(() -> LogMessage.format("Generating random property for '%s'", "random.intA")).thenReturn(logMessageMock);
			RandomValuePropertySource target = spy(new RandomValuePropertySource("B"));
			Random random = new Random();
			doReturn(random).when(target).getSource();
			//Act Statement(s)
			Object result = target.getProperty("random.intA");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("00000000000000000000000000000000"));
				_assert.verify(() -> Assert.hasText("B", "Property source name must contain at least one character"), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Generating random property for '%s'", "random.intA"), atLeast(1));
				verify(target, atLeast(1)).getSource();
			});
		}
	}

	//Sapient generated method id: ${f501c243-87af-3b86-af39-384eda5bac28}
	@Test()
	void addToEnvironmentTest() {
		//Arrange Statement(s)
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		try (MockedStatic<RandomValuePropertySource> randomValuePropertySource = mockStatic(RandomValuePropertySource.class, CALLS_REAL_METHODS)) {
			randomValuePropertySource.when(() -> RandomValuePropertySource.addToEnvironment(eq(configurableEnvironmentMock), (Log) any())).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			RandomValuePropertySource.addToEnvironment(configurableEnvironmentMock);
			//Assert statement(s)
			assertAll("result", () -> randomValuePropertySource.verify(() -> RandomValuePropertySource.addToEnvironment(eq(configurableEnvironmentMock), (Log) any()), atLeast(1)));
		}
	}

	//Sapient generated method id: ${f1611580-9925-3d58-8c21-50def6dc3b5f}
	@Test()
	void addToEnvironment1WhenExistingIsNotNull() {
		/* Branches:
		 * (existing != null) : true
		 */
		//Arrange Statement(s)
		doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
		doReturn(propertySourceMock).when(mutablePropertySourcesMock).get("random");
		Log log = null;
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			RandomValuePropertySource.addToEnvironment(environmentMock, log);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(environmentMock).getPropertySources();
			verify(mutablePropertySourcesMock).get("random");
		});
	}

	//Sapient generated method id: ${c19f6f13-17e5-3394-9061-aec3afcbc131}
	@Test()
	void addToEnvironment1WhenSourcesGetStandardEnvironmentSYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAMEIsNotNull() {
		/* Branches:
		 * (existing != null) : false
		 * (sources.get(StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME) != null) : true
		 */
		//Arrange Statement(s)
		doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
		doReturn(null).when(mutablePropertySourcesMock).get("random");
		doReturn(propertySourceMock).when(mutablePropertySourcesMock).get("systemEnvironment");
		doNothing().when(mutablePropertySourcesMock).addAfter(eq("systemEnvironment"), (RandomValuePropertySource) any());
		Log log = null;
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			RandomValuePropertySource.addToEnvironment(environmentMock, log);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(environmentMock).getPropertySources();
			verify(mutablePropertySourcesMock).get("random");
			verify(mutablePropertySourcesMock).get("systemEnvironment");
			verify(mutablePropertySourcesMock).addAfter(eq("systemEnvironment"), (RandomValuePropertySource) any());
		});
	}

	//Sapient generated method id: ${7363f093-0718-3913-ad2f-da425b1f9448}
	@Test()
	void addToEnvironment1WhenSourcesGetStandardEnvironmentSYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAMEIsNull() {
		/* Branches:
		 * (existing != null) : false
		 * (sources.get(StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME) != null) : false
		 */
		//Arrange Statement(s)
		doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
		doReturn(null).when(mutablePropertySourcesMock).get("random");
		doReturn(null).when(mutablePropertySourcesMock).get("systemEnvironment");
		doNothing().when(mutablePropertySourcesMock).addLast((RandomValuePropertySource) any());
		Log log = null;
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			RandomValuePropertySource.addToEnvironment(environmentMock, log);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(environmentMock).getPropertySources();
			verify(mutablePropertySourcesMock).get("random");
			verify(mutablePropertySourcesMock).get("systemEnvironment");
			verify(mutablePropertySourcesMock).addLast((RandomValuePropertySource) any());
		});
	}
}
