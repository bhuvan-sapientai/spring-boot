package org.springframework.boot.context.metrics.buffering;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.metrics.StartupStep;

import java.util.function.Supplier;
import java.util.function.Consumer;
import java.time.Instant;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BufferedStartupStepSapientGeneratedTest {

	private final BufferedStartupStep parentMock = mock(BufferedStartupStep.class, "null");

	private final Consumer<BufferedStartupStep> recorderMock = mock(Consumer.class, "null");

	//Sapient generated method id: ${5fdfba7e-6b5c-369a-b59f-2fcad9fad4db}, hash: 24E35FB7F0C5706820D173865D5C6F6B
	@Test()
	void getParentIdWhenThisParentIsNotNull() {
		/* Branches:
		 * (this.parent != null) : true
		 */
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "name1", 0L, instant, recorderMock);
		doReturn(1L).when(parentMock).getId();

		//Act Statement(s)
		Long result = target.getParentId();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(1L));
			verify(parentMock).getId();
		});
	}

	//Sapient generated method id: ${95008174-021a-3024-a11b-30baf1e3002b}, hash: 96E9BF2910D0D001A84A45FDB24AEB77
	@Test()
	void getParentIdWhenThisParentIsNull() {
		/* Branches:
		 * (this.parent != null) : false
		 */
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		BufferedStartupStep target = new BufferedStartupStep((BufferedStartupStep) null, "name1", 0L, instant, recorderMock);

		//Act Statement(s)
		Long result = target.getParentId();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${59fc8b6d-9cf4-385e-b4d4-3f0361c77781}, hash: 1F85437BECE6F7CCD94B70165AA04BBA
	@Test()
	void getTagsTest() {
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "name1", 0L, instant, recorderMock);

		//Act Statement(s)
		StartupStep.Tags result = target.getTags();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${1492b9c2-b980-3a4a-9204-051aa921c1c9}, hash: CB8AC17A5F72CE4D3129C9E55C3B6046
	@Test()
	void tagTest() {
		//Arrange Statement(s)
		Supplier valueMock = mock(Supplier.class);
		doReturn("return_of_get1").when(valueMock).get();
		Instant instant = Instant.now();
		BufferedStartupStep target = spy(new BufferedStartupStep(parentMock, "<string>", 0L, instant, recorderMock));
		StartupStep startupStepMock = mock(StartupStep.class);
		doReturn(startupStepMock).when(target).tag("<string>", "return_of_get1");

		//Act Statement(s)
		StartupStep result = target.tag("<string>", valueMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(startupStepMock));
			verify(valueMock).get();
			verify(target).tag("<string>", "return_of_get1");
		});
	}

	//Sapient generated method id: ${9c1d60d2-3642-35ae-8a13-dd374591872a}, hash: 4363FDE149134FEA42613F3F992B5EFF
	@Test()
	void tag1WhenThisEndedNotGet() {
		/* Branches:
		 * (!this.ended.get()) : true
		 */
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "name1", 0L, instant, recorderMock);

		//Act Statement(s)
		StartupStep result = target.tag("key1", "value1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${ad1c9377-0a10-3767-87a5-3115a50be4cd}, hash: A9D12C9B6E68796711C06A07D3EB15E8
	@Test()
	void endTest() {
		//Arrange Statement(s)
		Instant instant = Instant.now();
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "test", 123L, instant, recorderMock);
		doNothing().when(recorderMock).accept(target);

		//Act Statement(s)
		target.end();

		//Assert statement(s)
		assertAll("result", () -> verify(recorderMock).accept(target));
	}

	//Sapient generated method id: ${6120f7f7-3b69-3400-9ac0-126d5ae7bc19}, hash: E9607B25354294D879CA45CA5D39DE6A
	@Test()
	void isEndedTest() {
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "name1", 0L, instant, recorderMock);

		//Act Statement(s)
		boolean result = target.isEnded();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}
}
