package org.springframework.boot.context.metrics.buffering;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.metrics.StartupStep;

import java.util.function.Supplier;
import java.util.function.Consumer;
import java.time.Instant;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BufferedStartupStepSapientGeneratedTest {

	private final BufferedStartupStep parentMock = mock(BufferedStartupStep.class, "BufferedStartupStep");

	//Sapient generated method id: ${5fdfba7e-6b5c-369a-b59f-2fcad9fad4db}
	@Test()
	void getParentIdWhenThisParentIsNotNull() {
		/* Branches:
		 * (this.parent != null) : true
		 */
		//Arrange Statement(s)
		Instant instant = Instant.now();
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "name1", 0L, instant, (Consumer) null);
		doReturn(1L).when(parentMock).getId();
		//Act Statement(s)
		Long result = target.getParentId();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(1L));
			verify(parentMock).getId();
		});
	}

	//Sapient generated method id: ${95008174-021a-3024-a11b-30baf1e3002b}
	@Test()
	void getParentIdWhenThisParentIsNull() {
		/* Branches:
		 * (this.parent != null) : false
		 */
		//Arrange Statement(s)
		Instant instant = Instant.now();
		BufferedStartupStep target = new BufferedStartupStep((BufferedStartupStep) null, "name1", 0L, instant, (Consumer) null);
		//Act Statement(s)
		Long result = target.getParentId();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${59fc8b6d-9cf4-385e-b4d4-3f0361c77781}
	@Test()
	void getTagsTest() {
		//Arrange Statement(s)
		Instant instant = Instant.now();
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "name1", 0L, instant, (Consumer) null);
		//Act Statement(s)
		StartupStep.Tags result = target.getTags();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${1492b9c2-b980-3a4a-9204-051aa921c1c9}
	@Test()
	void tagTest() {
		//Arrange Statement(s)
		Instant instant = Instant.now();
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "name1", 0L, instant, (Consumer) null);
		Supplier supplier = null;
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			target.tag("key1", supplier);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${9c1d60d2-3642-35ae-8a13-dd374591872a}
	@Test()
	void tag1WhenThisEndedNotGet() {
		/* Branches:
		 * (!this.ended.get()) : true
		 */
		//Arrange Statement(s)
		Instant instant = Instant.now();
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "name1", 0L, instant, (Consumer) null);
		//Act Statement(s)
		StartupStep result = target.tag("key1", "value1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${ad1c9377-0a10-3767-87a5-3115a50be4cd}
	@Disabled()
	@Test()
	void endTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Instant instant = Instant.now();
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "testStep", 12345L, instant, (Consumer) null);
		//Act Statement(s)
		target.end();
	}

	//Sapient generated method id: ${6120f7f7-3b69-3400-9ac0-126d5ae7bc19}
	@Test()
	void isEndedTest() {
		//Arrange Statement(s)
		Instant instant = Instant.now();
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "name1", 0L, instant, (Consumer) null);
		//Act Statement(s)
		boolean result = target.isEnded();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}
}
