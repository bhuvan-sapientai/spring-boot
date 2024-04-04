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
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ThreadPoolTaskExecutorBuilderSapientGeneratedTest {

	private final ThreadPoolTaskExecutorBuilder threadPoolTaskExecutorBuilderMock = mock(ThreadPoolTaskExecutorBuilder.class);

	private final ThreadPoolTaskExecutorCustomizer threadPoolTaskExecutorCustomizerMock = mock(ThreadPoolTaskExecutorCustomizer.class);

	private final ThreadPoolTaskExecutor threadPoolTaskExecutorMock = mock(ThreadPoolTaskExecutor.class);

	//Sapient generated method id: ${e99b7fef-8979-33e3-ae50-fa6d305e54b1}, hash: 49BA04A0BD2046DE5513EFC7DC336212
	@Test()
	void queueCapacityTest() {
		//Arrange Statement(s)
		ThreadPoolTaskExecutorBuilder target = new ThreadPoolTaskExecutorBuilder();

		//Act Statement(s)
		ThreadPoolTaskExecutorBuilder result = target.queueCapacity(1);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${a0ac482f-bb56-3aa3-bca1-b3e47d431f45}, hash: 703C9DD3C5D5B1A3F2D5A0ED5D679284
	@Test()
	void corePoolSizeTest() {
		//Arrange Statement(s)
		ThreadPoolTaskExecutorBuilder target = new ThreadPoolTaskExecutorBuilder();

		//Act Statement(s)
		ThreadPoolTaskExecutorBuilder result = target.corePoolSize(1);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${1de9e5b7-73e7-3ca0-87f7-0b1d45ce21c5}, hash: ECDBE39A6D3236E0D5259904AF3B663E
	@Test()
	void maxPoolSizeTest() {
		//Arrange Statement(s)
		ThreadPoolTaskExecutorBuilder target = new ThreadPoolTaskExecutorBuilder();

		//Act Statement(s)
		ThreadPoolTaskExecutorBuilder result = target.maxPoolSize(1);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${c7999cfa-4c49-3069-9a75-5c2fa1ea7daa}, hash: AE247E989407720B38871A5AF9BE8925
	@Test()
	void allowCoreThreadTimeOutTest() {
		//Arrange Statement(s)
		ThreadPoolTaskExecutorBuilder target = new ThreadPoolTaskExecutorBuilder();

		//Act Statement(s)
		ThreadPoolTaskExecutorBuilder result = target.allowCoreThreadTimeOut(false);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${f011f850-0807-3238-8d56-5e8ddaa01ad9}, hash: 25A192DED8568F1AAAC5ED3623FACF5C
	@Test()
	void keepAliveTest() {
		//Arrange Statement(s)
		ThreadPoolTaskExecutorBuilder target = new ThreadPoolTaskExecutorBuilder();
		Duration duration = Duration.ofDays(0L);

		//Act Statement(s)
		ThreadPoolTaskExecutorBuilder result = target.keepAlive(duration);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${09a7a88c-9c8c-3e24-ae2a-9c1412b15b5e}, hash: 743CC05B5560E7AD0D322B675A6D7448
	@Test()
	void acceptTasksAfterContextCloseTest() {
		//Arrange Statement(s)
		ThreadPoolTaskExecutorBuilder target = new ThreadPoolTaskExecutorBuilder();

		//Act Statement(s)
		ThreadPoolTaskExecutorBuilder result = target.acceptTasksAfterContextClose(false);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${d3a86441-89f4-3a11-9ff3-57e1b584ea81}, hash: 6974B09B609BB45C66F54219A91414AC
	@Test()
	void awaitTerminationTest() {
		//Arrange Statement(s)
		ThreadPoolTaskExecutorBuilder target = new ThreadPoolTaskExecutorBuilder();

		//Act Statement(s)
		ThreadPoolTaskExecutorBuilder result = target.awaitTermination(false);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${f053c8a2-a61c-3106-a56d-ffd51d370963}, hash: 6C9DC2A111C7970F1C7503BC711C16C0
	@Test()
	void awaitTerminationPeriodTest() {
		//Arrange Statement(s)
		ThreadPoolTaskExecutorBuilder target = new ThreadPoolTaskExecutorBuilder();
		Duration duration = Duration.ofDays(0L);

		//Act Statement(s)
		ThreadPoolTaskExecutorBuilder result = target.awaitTerminationPeriod(duration);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${685f4a5d-cad1-361d-add4-158862b5b607}, hash: 273A66CF72F9F4E88FA5A50B60D1FBF4
	@Test()
	void threadNamePrefixTest() {
		//Arrange Statement(s)
		ThreadPoolTaskExecutorBuilder target = new ThreadPoolTaskExecutorBuilder();

		//Act Statement(s)
		ThreadPoolTaskExecutorBuilder result = target.threadNamePrefix("threadNamePrefix1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${2647b519-24dd-3d60-a3d8-92d143b722f9}, hash: B9C5C8C01D41AF4DFFB73A3A9F184E89
	@Test()
	void taskDecoratorTest() {
		//Arrange Statement(s)
		ThreadPoolTaskExecutorBuilder target = new ThreadPoolTaskExecutorBuilder();
		TaskDecorator taskDecoratorMock = mock(TaskDecorator.class);

		//Act Statement(s)
		ThreadPoolTaskExecutorBuilder result = target.taskDecorator(taskDecoratorMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${096c8c26-248f-3c0b-a109-b0008208dcb4}, hash: 185A26297F18CC16E94BBC8B81311425
	@Test()
	void customizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ThreadPoolTaskExecutorCustomizer[] threadPoolTaskExecutorCustomizerArray = new ThreadPoolTaskExecutorCustomizer[] {};
			_assert.when(() -> Assert.notNull(threadPoolTaskExecutorCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ThreadPoolTaskExecutorBuilder target = spy(new ThreadPoolTaskExecutorBuilder());
			List<ThreadPoolTaskExecutorCustomizer> threadPoolTaskExecutorCustomizerList = new ArrayList<>();
			doReturn(threadPoolTaskExecutorBuilderMock).when(target).customizers(threadPoolTaskExecutorCustomizerList);
			//Act Statement(s)
			ThreadPoolTaskExecutorBuilder result = target.customizers(threadPoolTaskExecutorCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(threadPoolTaskExecutorBuilderMock));
				_assert.verify(() -> Assert.notNull(threadPoolTaskExecutorCustomizerArray, "Customizers must not be null"), atLeast(1));
				verify(target).customizers(threadPoolTaskExecutorCustomizerList);
			});
		}
	}

	//Sapient generated method id: ${4093ce62-8361-3b14-be69-19a1177dbf57}, hash: 4320D77CEA93D4DBADE0B7AD0B4B076D
	@Test()
	void customizers1WhenSetIsNull() {
		/* Branches:
		 * (set != null) : false  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ThreadPoolTaskExecutorBuilder target = new ThreadPoolTaskExecutorBuilder();
			Iterable<ThreadPoolTaskExecutorCustomizer> iterable = new ArrayList<>(List.of(threadPoolTaskExecutorCustomizerMock));
			//Act Statement(s)
			ThreadPoolTaskExecutorBuilder result = target.customizers(iterable);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${01c5b568-1ccf-3f8d-be31-7c6a00d3b86f}, hash: 5085EC67D36DE60A85CBDA93F7AC5F11
	@Test()
	void additionalCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ThreadPoolTaskExecutorCustomizer[] threadPoolTaskExecutorCustomizerArray = new ThreadPoolTaskExecutorCustomizer[] {};
			_assert.when(() -> Assert.notNull(threadPoolTaskExecutorCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ThreadPoolTaskExecutorBuilder target = spy(new ThreadPoolTaskExecutorBuilder());
			List<ThreadPoolTaskExecutorCustomizer> threadPoolTaskExecutorCustomizerList = new ArrayList<>();
			doReturn(threadPoolTaskExecutorBuilderMock).when(target).additionalCustomizers(threadPoolTaskExecutorCustomizerList);
			//Act Statement(s)
			ThreadPoolTaskExecutorBuilder result = target.additionalCustomizers(threadPoolTaskExecutorCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(threadPoolTaskExecutorBuilderMock));
				_assert.verify(() -> Assert.notNull(threadPoolTaskExecutorCustomizerArray, "Customizers must not be null"), atLeast(1));
				verify(target).additionalCustomizers(threadPoolTaskExecutorCustomizerList);
			});
		}
	}

	//Sapient generated method id: ${ec4a4216-0b11-3482-8467-7bedcdd174bc}, hash: 93191036A7EA68ADDEB3648B01BBE79D
	@Test()
	void additionalCustomizers1WhenSetIsNull() {
		/* Branches:
		 * (set != null) : false  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ThreadPoolTaskExecutorBuilder target = new ThreadPoolTaskExecutorBuilder();
			Iterable<ThreadPoolTaskExecutorCustomizer> iterable = new ArrayList<>(List.of(threadPoolTaskExecutorCustomizerMock));
			//Act Statement(s)
			ThreadPoolTaskExecutorBuilder result = target.additionalCustomizers(iterable);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${c319ea97-f8d0-37c4-a5dd-88e142a90c6d}, hash: 01463B07FED203C3B30C6D8E43F37FA6
	@Test()
	void buildTest() {
		//Arrange Statement(s)
		ThreadPoolTaskExecutorBuilder target = spy(new ThreadPoolTaskExecutorBuilder());
		doReturn(threadPoolTaskExecutorMock).when(target).configure((ThreadPoolTaskExecutor) any());

		//Act Statement(s)
		ThreadPoolTaskExecutor result = target.build();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(threadPoolTaskExecutorMock));
			verify(target).configure((ThreadPoolTaskExecutor) any());
		});
	}

	//Sapient generated method id: ${716d80b9-84b4-3f5a-bb9e-a90cac149ddf}, hash: 45AAE93BAD27BDC068DD9DAF03091D28
	@Test()
	void build1Test() {
		//Arrange Statement(s)
		ThreadPoolTaskExecutor threadPoolTaskExecutorMock2 = mock(ThreadPoolTaskExecutor.class);
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class)) {
			beanUtils.when(() -> BeanUtils.instantiateClass(ThreadPoolTaskExecutor.class)).thenReturn(threadPoolTaskExecutorMock);
			ThreadPoolTaskExecutorBuilder target = spy(new ThreadPoolTaskExecutorBuilder());
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

	//Sapient generated method id: ${92778da8-5cb9-368b-8e0b-ad44bc4f7017}, hash: 10F829863B76B1CC3832CD46A51AF726
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
			PropertyMapper.Source source6 = propertyMapperMock2.from((Boolean) null);
			doReturn(source4, source5, source6).when(propertyMapperMock2).from((Boolean) null);
			PropertyMapper.Source source7 = propertyMapperMock2.from((Duration) null);
			doReturn(source3, source7).when(propertyMapperMock2).from((Duration) null);
			PropertyMapper.Source source8 = propertyMapperMock2.from((String) null);
			doReturn(source8).when(propertyMapperMock2).from((String) null);
			PropertyMapper.Source source9 = propertyMapperMock2.from((TaskDecorator) null);
			doReturn(source9).when(propertyMapperMock2).from((TaskDecorator) null);
			ThreadPoolTaskExecutorBuilder target = new ThreadPoolTaskExecutorBuilder();
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
				verify(propertyMapperMock2, times(3)).from((Boolean) null);
				verify(propertyMapperMock2).from((String) null);
				verify(propertyMapperMock2).from((TaskDecorator) null);
			});
		}
	}
}
