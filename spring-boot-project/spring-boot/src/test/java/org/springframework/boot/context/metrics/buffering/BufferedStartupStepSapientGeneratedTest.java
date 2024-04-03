package org.springframework.boot.context.metrics.buffering;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.metrics.StartupStep;

import org.mockito.stubbing.Answer;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.function.Consumer;
import java.time.Instant;

import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BufferedStartupStepSapientGeneratedTest {

	private final BufferedStartupStep parentMock = mock(BufferedStartupStep.class, "null");

	private final Consumer consumerMock = mock(Consumer.class);

	//Sapient generated method id: ${5fdfba7e-6b5c-369a-b59f-2fcad9fad4db}, hash: 2C7B80A2BF3478F40E546E1528337F7D
	@Test()
	void getParentIdWhenThisParentIsNotNull() {
		/* Branches:
		 * (this.parent != null) : true
		 */
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "name1", 0L, instant, consumerMock);
		doReturn(1L).when(parentMock).getId();

		//Act Statement(s)
		Long result = target.getParentId();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(1L));
			verify(parentMock).getId();
		});
	}

	//Sapient generated method id: ${95008174-021a-3024-a11b-30baf1e3002b}, hash: 6302C8CDF7A397997F273B94595520A2
	@Test()
	void getParentIdWhenThisParentIsNull() {
		/* Branches:
		 * (this.parent != null) : false
		 */
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		BufferedStartupStep target = new BufferedStartupStep((BufferedStartupStep) null, "name1", 0L, instant, consumerMock);

		//Act Statement(s)
		Long result = target.getParentId();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${59fc8b6d-9cf4-385e-b4d4-3f0361c77781}, hash: 22560AF74AA2A4989A19E2933C570452
	@Test()
	void getTagsTest() {
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "name1", 0L, instant, consumerMock);

		//Act Statement(s)
		StartupStep.Tags result = target.getTags();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${1492b9c2-b980-3a4a-9204-051aa921c1c9}, hash: E2F1695D6C4343DB98AD06C2DDEB9DB5
	@Test()
	void tagTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Instant instant = Instant.now();
		BufferedStartupStep target = spy(new BufferedStartupStep(parentMock, "<string>", 0L, instant, consumerMock));
		StartupStep startupStepMock = mock(StartupStep.class);
		doReturn(startupStepMock).when(target).tag("<string>", "value1");
		Supplier supplierMock = mock(Supplier.class);

		//Act Statement(s)
		StartupStep result = target.tag("<string>", supplierMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(startupStepMock));
			verify(target).tag("<string>", "value1");
		});
	}

	//Sapient generated method id: ${9c1d60d2-3642-35ae-8a13-dd374591872a}, hash: B72292A66AB3F9CEA6B05EFAF6E82C79
	@Test()
	void tag1WhenThisEndedNotGet() {
		/* Branches:
		 * (!this.ended.get()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(true, "StartupStep has already ended.")).thenAnswer((Answer<Void>) invocation -> null);
			Instant instant = Instant.now();
			BufferedStartupStep target = new BufferedStartupStep(parentMock, "<String>", 0L, instant, consumerMock);
			//Act Statement(s)
			StartupStep result = target.tag("<value>", "<value>");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.state(true, "StartupStep has already ended."), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${04611057-dea2-3e81-9f88-7d97b72cc4cf}, hash: 4214EC97AD0A1ADCAAD5816DB23E5641
	@Test()
	void tag1WhenThisEndedGet() {
		/* Branches:
		 * (!this.ended.get()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(false, "StartupStep has already ended.")).thenAnswer((Answer<Void>) invocation -> null);
			Instant instant = Instant.now();
			BufferedStartupStep target = new BufferedStartupStep(parentMock, "<String>", 0L, instant, consumerMock);
			//Act Statement(s)
			StartupStep result = target.tag("<String>", "<String>");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.state(false, "StartupStep has already ended."), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ad1c9377-0a10-3767-87a5-3115a50be4cd}, hash: 7E0C9F2AE340DCF20D45ECE397BACD1E
	@Test()
	void endTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Instant instant = Instant.now();
		Consumer consumerMock = mock(Consumer.class, "null");
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "test", 123L, instant, consumerMock);

		//Act Statement(s)
		target.end();
	}

	//Sapient generated method id: ${6f56fa65-9b9b-30d4-95fe-9adeb7b08d7b}, hash: 5D41B7A759716126CCD3280CD208C180
	@Test()
	void isEndedWhenThisEndedGet() {
		/* Branches:
		 * (this.ended.get()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Instant instant = Instant.now();
		Consumer consumerMock = mock(Consumer.class, "null");
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "test", 123L, instant, consumerMock);

		//Act Statement(s)
		boolean result = target.isEnded();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${dfa4f607-23f3-3889-a73a-b00379cbc0e9}, hash: 67762D692C30AB0C02A2D5B099B3403A
	@Test()
	void isEndedWhenThisEndedNotGet() {
		/* Branches:
		 * (this.ended.get()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Instant instant = Instant.now();
		Consumer consumerMock = mock(Consumer.class, "null");
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "test", 123L, instant, consumerMock);

		//Act Statement(s)
		boolean result = target.isEnded();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}
}
