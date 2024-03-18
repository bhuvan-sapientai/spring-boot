package org.springframework.boot.task;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.mockito.stubbing.Answer;

import org.springframework.boot.context.properties.PropertyMapper;
import org.springframework.util.CollectionUtils;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.util.Assert;
import org.springframework.core.task.TaskDecorator;

import java.time.Duration;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.function.Consumer;

import org.springframework.beans.BeanUtils;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TaskExecutorBuilderSapientGeneratedTest {

	private final Iterable additionsMock = mock(Iterable.class);

	private final TaskExecutorBuilder taskExecutorBuilderMock = mock(TaskExecutorBuilder.class);

	private final ThreadPoolTaskExecutor threadPoolTaskExecutorMock = mock(ThreadPoolTaskExecutor.class);

	//Sapient generated method id: ${e99b7fef-8979-33e3-ae50-fa6d305e54b1}, hash: D67ADF796ADFA5BCC61EC6ECE58FD288
	@Test()
	void queueCapacityTest() {
		//Arrange Statement(s)
		TaskExecutorBuilder target = new TaskExecutorBuilder();
		//Act Statement(s)
		TaskExecutorBuilder result = target.queueCapacity(1);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${a0ac482f-bb56-3aa3-bca1-b3e47d431f45}, hash: EBB09075E192DF40FD5928901B02E266
	@Test()
	void corePoolSizeTest() {
		//Arrange Statement(s)
		TaskExecutorBuilder target = new TaskExecutorBuilder();
		//Act Statement(s)
		TaskExecutorBuilder result = target.corePoolSize(1);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${1de9e5b7-73e7-3ca0-87f7-0b1d45ce21c5}, hash: 3463B553618AF46F6B0CC4644A9A6B8F
	@Test()
	void maxPoolSizeTest() {
		//Arrange Statement(s)
		TaskExecutorBuilder target = new TaskExecutorBuilder();
		//Act Statement(s)
		TaskExecutorBuilder result = target.maxPoolSize(1);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${c7999cfa-4c49-3069-9a75-5c2fa1ea7daa}, hash: 4B4808479D30A183B164A31CC8F07499
	@Test()
	void allowCoreThreadTimeOutTest() {
		//Arrange Statement(s)
		TaskExecutorBuilder target = new TaskExecutorBuilder();
		//Act Statement(s)
		TaskExecutorBuilder result = target.allowCoreThreadTimeOut(false);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${f011f850-0807-3238-8d56-5e8ddaa01ad9}, hash: 348F9A6DF7CCAA22B930C14BC388D6D7
	@Test()
	void keepAliveTest() {
		//Arrange Statement(s)
		TaskExecutorBuilder target = new TaskExecutorBuilder();
		Duration duration = Duration.ofDays(0L);
		//Act Statement(s)
		TaskExecutorBuilder result = target.keepAlive(duration);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${d3a86441-89f4-3a11-9ff3-57e1b584ea81}, hash: 3F782B218DF88317E8E6C3FA79A8DD38
	@Test()
	void awaitTerminationTest() {
		//Arrange Statement(s)
		TaskExecutorBuilder target = new TaskExecutorBuilder();
		//Act Statement(s)
		TaskExecutorBuilder result = target.awaitTermination(false);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${f053c8a2-a61c-3106-a56d-ffd51d370963}, hash: 3104D214012E69596EC312D5D0B8125B
	@Test()
	void awaitTerminationPeriodTest() {
		//Arrange Statement(s)
		TaskExecutorBuilder target = new TaskExecutorBuilder();
		Duration duration = Duration.ofDays(0L);
		//Act Statement(s)
		TaskExecutorBuilder result = target.awaitTerminationPeriod(duration);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${685f4a5d-cad1-361d-add4-158862b5b607}, hash: DF9A35B66734C6A42D5E828C5E2FE9A2
	@Test()
	void threadNamePrefixTest() {
		//Arrange Statement(s)
		TaskExecutorBuilder target = new TaskExecutorBuilder();
		//Act Statement(s)
		TaskExecutorBuilder result = target.threadNamePrefix("threadNamePrefix1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${2647b519-24dd-3d60-a3d8-92d143b722f9}, hash: D924480F630CCD8AEB037760D781820A
	@Test()
	void taskDecoratorTest() {
		//Arrange Statement(s)
		TaskExecutorBuilder target = new TaskExecutorBuilder();
		TaskDecorator taskDecoratorMock = mock(TaskDecorator.class);
		//Act Statement(s)
		TaskExecutorBuilder result = target.taskDecorator(taskDecoratorMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${096c8c26-248f-3c0b-a109-b0008208dcb4}, hash: 1B2A6E7C376B1B140B19E5D372BB54F8
	@Test()
	void customizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			TaskExecutorCustomizer[] taskExecutorCustomizerArray = new TaskExecutorCustomizer[] {};
			_assert.when(() -> Assert.notNull(taskExecutorCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			TaskExecutorBuilder target = spy(new TaskExecutorBuilder());
			List<TaskExecutorCustomizer> taskExecutorCustomizerList = new ArrayList<>();
			doReturn(taskExecutorBuilderMock).when(target).customizers(taskExecutorCustomizerList);
			//Act Statement(s)
			TaskExecutorBuilder result = target.customizers(taskExecutorCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(taskExecutorBuilderMock));
				_assert.verify(() -> Assert.notNull(taskExecutorCustomizerArray, "Customizers must not be null"), atLeast(1));
				verify(target).customizers(taskExecutorCustomizerList);
			});
		}
	}

	//Sapient generated method id: ${4093ce62-8361-3b14-be69-19a1177dbf57}, hash: 13743CC84366B63C439E049D53B1DD80
	@Test()
	void customizers1WhenSetIsNull() {
		/* Branches:
		 * (set != null) : false  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(additionsMock).forEach((Consumer) any());
			_assert.when(() -> Assert.notNull(additionsMock, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			TaskExecutorBuilder target = new TaskExecutorBuilder();
			//Act Statement(s)
			TaskExecutorBuilder result = target.customizers(additionsMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(additionsMock).forEach((Consumer) any());
				_assert.verify(() -> Assert.notNull(additionsMock, "Customizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${01c5b568-1ccf-3f8d-be31-7c6a00d3b86f}, hash: 4D2174ADC5871A0390DD757AB12261E2
	@Test()
	void additionalCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			TaskExecutorCustomizer[] taskExecutorCustomizerArray = new TaskExecutorCustomizer[] {};
			_assert.when(() -> Assert.notNull(taskExecutorCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			TaskExecutorBuilder target = spy(new TaskExecutorBuilder());
			List<TaskExecutorCustomizer> taskExecutorCustomizerList = new ArrayList<>();
			doReturn(taskExecutorBuilderMock).when(target).additionalCustomizers(taskExecutorCustomizerList);
			//Act Statement(s)
			TaskExecutorBuilder result = target.additionalCustomizers(taskExecutorCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(taskExecutorBuilderMock));
				_assert.verify(() -> Assert.notNull(taskExecutorCustomizerArray, "Customizers must not be null"), atLeast(1));
				verify(target).additionalCustomizers(taskExecutorCustomizerList);
			});
		}
	}

	//Sapient generated method id: ${ec4a4216-0b11-3482-8467-7bedcdd174bc}, hash: 429070231D046CBDC738D5A5E011824A
	@Test()
	void additionalCustomizers1WhenSetIsNull() {
		/* Branches:
		 * (set != null) : false  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(additionsMock).forEach((Consumer) any());
			_assert.when(() -> Assert.notNull(additionsMock, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			TaskExecutorBuilder target = new TaskExecutorBuilder();
			//Act Statement(s)
			TaskExecutorBuilder result = target.additionalCustomizers(additionsMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(additionsMock).forEach((Consumer) any());
				_assert.verify(() -> Assert.notNull(additionsMock, "Customizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c319ea97-f8d0-37c4-a5dd-88e142a90c6d}, hash: 9BCFB2A2D09CC2825646D185210C7D22
	@Test()
	void buildTest() {
		//Arrange Statement(s)
		TaskExecutorBuilder target = spy(new TaskExecutorBuilder());
		doReturn(threadPoolTaskExecutorMock).when(target).configure((ThreadPoolTaskExecutor) any());
		//Act Statement(s)
		ThreadPoolTaskExecutor result = target.build();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(threadPoolTaskExecutorMock));
			verify(target).configure((ThreadPoolTaskExecutor) any());
		});
	}

	//Sapient generated method id: ${716d80b9-84b4-3f5a-bb9e-a90cac149ddf}, hash: DE8C740618C3EDDFBDAF422E1001D879
	@Test()
	void build1Test() {
		//Arrange Statement(s)
		ThreadPoolTaskExecutor threadPoolTaskExecutorMock2 = mock(ThreadPoolTaskExecutor.class);
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class)) {
			beanUtils.when(() -> BeanUtils.instantiateClass(ThreadPoolTaskExecutor.class)).thenReturn(threadPoolTaskExecutorMock);
			TaskExecutorBuilder target = spy(new TaskExecutorBuilder());
			doReturn(threadPoolTaskExecutorMock2).when(target).configure(threadPoolTaskExecutorMock);
			//Act Statement(s)
			ThreadPoolTaskExecutor result = target.build(ThreadPoolTaskExecutor.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(threadPoolTaskExecutorMock2));
				beanUtils.verify(() -> BeanUtils.instantiateClass(ThreadPoolTaskExecutor.class), atLeast(1));
				verify(target).configure(threadPoolTaskExecutorMock);
			});
		}
	}

	//Sapient generated method id: ${92778da8-5cb9-368b-8e0b-ad44bc4f7017}, hash: D098579F0727C20A846C199A592ADC53
	@Disabled()
	@Test()
	void configureWhenCollectionUtilsIsEmptyThisCustomizers() {
		/* Branches:
		 * (!CollectionUtils.isEmpty(this.customizers)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type PropertyMapper.Source
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		PropertyMapper propertyMapperMock = mock(PropertyMapper.class);
		PropertyMapper propertyMapperMock2 = mock(PropertyMapper.class);
		PropertyMapper.Source propertyMapperSourceMock = mock(PropertyMapper.Source.class);
		try (MockedStatic<PropertyMapper> propertyMapper = mockStatic(PropertyMapper.class)) {
			propertyMapper.when(() -> PropertyMapper.get()).thenReturn(propertyMapperMock);
			doReturn(propertyMapperMock2).when(propertyMapperMock).alwaysApplyingWhenNonNull();
			doNothing().when(propertyMapperSourceMock).to((Consumer) any());
			PropertyMapper.Source source = propertyMapperMock2.from((Integer) null);
			PropertyMapper.Source source2 = propertyMapperMock2.from((Integer) null);
			doReturn(propertyMapperSourceMock, source, source2).when(propertyMapperMock2).from((Integer) null);
			PropertyMapper.Source source3 = propertyMapperMock2.from((Duration) null);
			PropertyMapper.Source source4 = propertyMapperMock2.from((Boolean) null);
			PropertyMapper.Source source5 = propertyMapperMock2.from((Boolean) null);
			doReturn(source4, source5).when(propertyMapperMock2).from((Boolean) null);
			PropertyMapper.Source source6 = propertyMapperMock2.from((Duration) null);
			doReturn(source3, source6).when(propertyMapperMock2).from((Duration) null);
			PropertyMapper.Source source7 = propertyMapperMock2.from((String) null);
			doReturn(source7).when(propertyMapperMock2).from((String) null);
			PropertyMapper.Source source8 = propertyMapperMock2.from((TaskDecorator) null);
			doReturn(source8).when(propertyMapperMock2).from((TaskDecorator) null);
			TaskExecutorBuilder target = new TaskExecutorBuilder();
			//Act Statement(s)
			ThreadPoolTaskExecutor result = target.configure(threadPoolTaskExecutorMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(threadPoolTaskExecutorMock));
				propertyMapper.verify(() -> PropertyMapper.get(), atLeast(1));
				verify(propertyMapperMock).alwaysApplyingWhenNonNull();
				verify(propertyMapperMock2, times(3)).from((Integer) null);
				verify(propertyMapperSourceMock).to((Consumer) any());
				verify(propertyMapperMock2, times(2)).from((Duration) null);
				verify(propertyMapperMock2, times(2)).from((Boolean) null);
				verify(propertyMapperMock2).from((String) null);
				verify(propertyMapperMock2).from((TaskDecorator) null);
			});
		}
	}
}
