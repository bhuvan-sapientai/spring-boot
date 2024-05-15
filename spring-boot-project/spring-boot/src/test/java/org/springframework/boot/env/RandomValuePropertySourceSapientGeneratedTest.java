package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.core.env.ConfigurableEnvironment;
import org.mockito.stubbing.Answer;
import org.apache.commons.logging.impl.NoOpLog;
import org.springframework.core.log.LogMessage;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.util.Assert;
import java.util.UUID;
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

    private final Random randomMock = mock(Random.class);

    private final RandomValuePropertySource.Range randomValuePropertySourceRangeMock = mock(RandomValuePropertySource.Range.class);

    //Sapient generated method id: ${getPropertyWhenNameNotStartsWithPREFIX}, hash: 4D240471A53CA00493A29B1DC10309C4
    @Test()
    void getPropertyWhenNameNotStartsWithPREFIX() {
        /* Branches:
         * (!name.startsWith(PREFIX)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            RandomValuePropertySource target = new RandomValuePropertySource("A");
            //Act Statement(s)
            Object result = target.getProperty("B");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getPropertyWhenTypeEqualsInt}, hash: 4E9D8CCACFCE4842CF7C0AFE8F06BD73
    @Test()
    void getPropertyWhenTypeEqualsInt() {
        /* Branches:
         * (!name.startsWith(PREFIX)) : false
         * (type.equals("int")) : true  #  inside getRandomValue method
         */
        //Arrange Statement(s)
        try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            logMessage.when(() -> LogMessage.format("Generating random property for '%s'", "random.int")).thenReturn(logMessageMock);
            RandomValuePropertySource target = spy(new RandomValuePropertySource("A"));
            doReturn(randomMock).when(target).getSource();
            doReturn(0).when(randomMock).nextInt();
            //Act Statement(s)
            Object result = target.getProperty("random.int");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Generating random property for '%s'", "random.int"), atLeast(1));
                verify(target, atLeast(1)).getSource();
                verify(randomMock, atLeast(1)).nextInt();
            });
        }
    }

    //Sapient generated method id: ${getPropertyWhenTypeEqualsLong}, hash: D91FF346DB7BE3D391EF84A363BD1A9A
    @Test()
    void getPropertyWhenTypeEqualsLong() {
        /* Branches:
         * (!name.startsWith(PREFIX)) : false
         * (type.equals("int")) : false  #  inside getRandomValue method
         * (type.equals("long")) : true  #  inside getRandomValue method
         */
        //Arrange Statement(s)
        try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            _assert.when(() -> Assert.hasText("A", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            logMessage.when(() -> LogMessage.format("Generating random property for '%s'", "random.long")).thenReturn(logMessageMock);
            RandomValuePropertySource target = spy(new RandomValuePropertySource("A"));
            doReturn(randomMock).when(target).getSource();
            doReturn(0L).when(randomMock).nextLong();
            //Act Statement(s)
            Object result = target.getProperty("random.long");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0L));
                _assert.verify(() -> Assert.hasText("A", "Property source name must contain at least one character"), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Generating random property for '%s'", "random.long"), atLeast(1));
                verify(target, atLeast(1)).getSource();
                verify(randomMock, atLeast(1)).nextLong();
            });
        }
    }

    //Sapient generated method id: ${getPropertyWhenRangeIsNotNull}, hash: ED54FCA7E6982C344EC13C2D778D6924
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
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: first - Method: isPresent
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
            MockedStatic<RandomValuePropertySource.Range> randomValuePropertySourceRange = mockStatic(RandomValuePropertySource.Range.class);
            MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class)) {
            _assert.when(() -> Assert.hasText("C", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            logMessage.when(() -> LogMessage.format("Generating random property for '%s'", "random.intAB")).thenReturn(logMessageMock);
            randomValuePropertySourceRange.when(() -> RandomValuePropertySource.Range.of(eq(""), (Function) any())).thenReturn(randomValuePropertySourceRangeMock);
            doReturn(1).when(randomValuePropertySourceRangeMock).getMin();
            doReturn(1).when(randomValuePropertySourceRangeMock).getMax();
            _assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            RandomValuePropertySource target = spy(new RandomValuePropertySource("C"));
            Random random = new Random();
            doReturn(random).when(target).getSource();
            //Act Statement(s)
            Object result = target.getProperty("random.intAB");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(1));
                _assert.verify(() -> Assert.hasText("C", "Property source name must contain at least one character"), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Generating random property for '%s'", "random.intAB"), atLeast(1));
                randomValuePropertySourceRange.verify(() -> RandomValuePropertySource.Range.of(eq(""), (Function) any()), atLeast(1));
                verify(randomValuePropertySourceRangeMock, atLeast(1)).getMin();
                verify(randomValuePropertySourceRangeMock, atLeast(1)).getMax();
                _assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(1));
                verify(target, atLeast(1)).getSource();
            });
        }
    }

    //Sapient generated method id: ${getPropertyWhenRangeIsNullAndRangeIsNotNull}, hash: A7C302F1D49700DE64B2E06B272DD781
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
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: first - Method: isPresent
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

    //Sapient generated method id: ${getPropertyWhenTypeEqualsUuid}, hash: 5C69772F8D9E609F61F6823ADD127C54
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
        try (MockedStatic<UUID> uUID = mockStatic(UUID.class);
            MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            _assert.when(() -> Assert.hasText("name1", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            logMessage.when(() -> LogMessage.format("Generating random property for '%s'", "name1")).thenReturn(logMessageMock);
            UUID uUID2 = UUID.fromString("12345678-0000-abcd-1234-abcdef123456");
            uUID.when(() -> UUID.randomUUID()).thenReturn(uUID2);
            RandomValuePropertySource target = new RandomValuePropertySource("name1");
            //Act Statement(s)
            Object result = target.getProperty("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                _assert.verify(() -> Assert.hasText("name1", "Property source name must contain at least one character"), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Generating random property for '%s'", "name1"), atLeast(1));
                uUID.verify(() -> UUID.randomUUID(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getPropertyWhenTypeLengthNotGreaterThanStartIndexAndRangeIsNullAndRangeIsNullAndTypeNotEqualsUuid}, hash: E24FA3DEFD18CAA15D855C9C8E233A40
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
         */
        //Arrange Statement(s)
        try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
            _assert.when(() -> Assert.hasText("B", "Property source name must contain at least one character")).thenAnswer((Answer<Void>) invocation -> null);
            logMessage.when(() -> LogMessage.format("Generating random property for '%s'", "random.intA")).thenReturn(logMessageMock);
            RandomValuePropertySource target = spy(new RandomValuePropertySource("B"));
            doReturn(randomMock).when(target).getSource();
            byte[] byteArray = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
            doNothing().when(randomMock).nextBytes(byteArray);
            //Act Statement(s)
            Object result = target.getProperty("random.intA");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("00000000000000000000000000000000"));
                _assert.verify(() -> Assert.hasText("B", "Property source name must contain at least one character"), atLeast(1));
                logMessage.verify(() -> LogMessage.format("Generating random property for '%s'", "random.intA"), atLeast(1));
                verify(target, atLeast(1)).getSource();
                verify(randomMock, atLeast(1)).nextBytes(byteArray);
            });
        }
    }

    //Sapient generated method id: ${addToEnvironmentTest}, hash: 9AC2E5E59C97918E9284E6EDF614DAE4
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

    //Sapient generated method id: ${addToEnvironment1WhenExistingIsNotNull}, hash: 334F414CE7D1E9A49F5E83AB9C0CC6B6
    @Test()
    void addToEnvironment1WhenExistingIsNotNull() {
        /* Branches:
         * (existing != null) : true
         */
        //Arrange Statement(s)
        doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
        doReturn(propertySourceMock).when(mutablePropertySourcesMock).get("random");
        NoOpLog noOpLog = new NoOpLog();
        //Act Statement(s)
        RandomValuePropertySource.addToEnvironment(environmentMock, noOpLog);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(environmentMock).getPropertySources();
            verify(mutablePropertySourcesMock).get("random");
        });
    }

    //Sapient generated method id: ${addToEnvironment1WhenSourcesGetStandardEnvironmentSYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAMEIsNotNull}, hash: 8F727D17C0E2F3CE97825444335606CB
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
        doNothing().when(mutablePropertySourcesMock).addAfter(eq("systemEnvironment"), (PropertySource) any());
        NoOpLog noOpLog = new NoOpLog();
        //Act Statement(s)
        RandomValuePropertySource.addToEnvironment(environmentMock, noOpLog);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(environmentMock).getPropertySources();
            verify(mutablePropertySourcesMock).get("random");
            verify(mutablePropertySourcesMock).get("systemEnvironment");
            verify(mutablePropertySourcesMock).addAfter(eq("systemEnvironment"), (PropertySource) any());
        });
    }

    //Sapient generated method id: ${addToEnvironment1WhenSourcesGetStandardEnvironmentSYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAMEIsNull}, hash: 5F8D121E0AFF6758B523350245F4E486
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
        doNothing().when(mutablePropertySourcesMock).addLast((PropertySource) any());
        NoOpLog noOpLog = new NoOpLog();
        //Act Statement(s)
        RandomValuePropertySource.addToEnvironment(environmentMock, noOpLog);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(environmentMock).getPropertySources();
            verify(mutablePropertySourcesMock).get("random");
            verify(mutablePropertySourcesMock).get("systemEnvironment");
            verify(mutablePropertySourcesMock).addLast((PropertySource) any());
        });
    }
}
