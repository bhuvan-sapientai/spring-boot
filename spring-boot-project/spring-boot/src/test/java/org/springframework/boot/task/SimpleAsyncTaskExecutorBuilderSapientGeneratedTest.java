package org.springframework.boot.task;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.mockito.stubbing.Answer;

import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.boot.context.properties.PropertyMapper;
import org.springframework.util.CollectionUtils;
import org.springframework.util.Assert;
import org.springframework.core.task.TaskDecorator;

import java.time.Duration;
import java.util.function.Function;

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
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SimpleAsyncTaskExecutorBuilderSapientGeneratedTest {

	private final SimpleAsyncTaskExecutorBuilder simpleAsyncTaskExecutorBuilderMock = mock(SimpleAsyncTaskExecutorBuilder.class);

	private final SimpleAsyncTaskExecutor simpleAsyncTaskExecutorMock = mock(SimpleAsyncTaskExecutor.class);

	//Sapient generated method id: ${685f4a5d-cad1-361d-add4-158862b5b607}
	@Test()
	void threadNamePrefixTest() {
		//Arrange Statement(s)
		SimpleAsyncTaskExecutorBuilder target = new SimpleAsyncTaskExecutorBuilder();
		//Act Statement(s)
		SimpleAsyncTaskExecutorBuilder result = target.threadNamePrefix("threadNamePrefix1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${9eac6044-a8e2-3b90-b9a3-2f54d7fcbf72}
	@Test()
	void virtualThreadsTest() {
		//Arrange Statement(s)
		SimpleAsyncTaskExecutorBuilder target = new SimpleAsyncTaskExecutorBuilder();
		//Act Statement(s)
		SimpleAsyncTaskExecutorBuilder result = target.virtualThreads(false);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${ea866017-6fd3-3d5a-a04d-3fcc7a43afee}
	@Test()
	void concurrencyLimitTest() {
		//Arrange Statement(s)
		SimpleAsyncTaskExecutorBuilder target = new SimpleAsyncTaskExecutorBuilder();
		//Act Statement(s)
		SimpleAsyncTaskExecutorBuilder result = target.concurrencyLimit(0);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${2647b519-24dd-3d60-a3d8-92d143b722f9}
	@Test()
	void taskDecoratorTest() {
		//Arrange Statement(s)
		SimpleAsyncTaskExecutorBuilder target = new SimpleAsyncTaskExecutorBuilder();
		TaskDecorator taskDecoratorMock = mock(TaskDecorator.class);
		//Act Statement(s)
		SimpleAsyncTaskExecutorBuilder result = target.taskDecorator(taskDecoratorMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${21dde231-3965-3602-a630-e377546febd3}
	@Test()
	void taskTerminationTimeoutTest() {
		//Arrange Statement(s)
		SimpleAsyncTaskExecutorBuilder target = new SimpleAsyncTaskExecutorBuilder();
		Duration duration = Duration.ofDays(0L);
		//Act Statement(s)
		SimpleAsyncTaskExecutorBuilder result = target.taskTerminationTimeout(duration);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${096c8c26-248f-3c0b-a109-b0008208dcb4}
	@Test()
	void customizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			SimpleAsyncTaskExecutorCustomizer[] simpleAsyncTaskExecutorCustomizerArray = new SimpleAsyncTaskExecutorCustomizer[] {};
			_assert.when(() -> Assert.notNull(simpleAsyncTaskExecutorCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SimpleAsyncTaskExecutorBuilder target = spy(new SimpleAsyncTaskExecutorBuilder());
			List<SimpleAsyncTaskExecutorCustomizer> simpleAsyncTaskExecutorCustomizerList = new ArrayList<>();
			doReturn(simpleAsyncTaskExecutorBuilderMock).when(target).customizers(simpleAsyncTaskExecutorCustomizerList);
			//Act Statement(s)
			SimpleAsyncTaskExecutorBuilder result = target.customizers(simpleAsyncTaskExecutorCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(simpleAsyncTaskExecutorBuilderMock));
				_assert.verify(() -> Assert.notNull(simpleAsyncTaskExecutorCustomizerArray, "Customizers must not be null"), atLeast(1));
				verify(target).customizers(simpleAsyncTaskExecutorCustomizerList);
			});
		}
	}

	//Sapient generated method id: ${4093ce62-8361-3b14-be69-19a1177dbf57}
	@Test()
	void customizers1WhenSetIsNull() {
		/* Branches:
		 * (set != null) : false  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) null, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SimpleAsyncTaskExecutorBuilder target = new SimpleAsyncTaskExecutorBuilder();
			Iterable<SimpleAsyncTaskExecutorCustomizer> iterable = null;
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.customizers(iterable);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Customizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${01c5b568-1ccf-3f8d-be31-7c6a00d3b86f}
	@Test()
	void additionalCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			SimpleAsyncTaskExecutorCustomizer[] simpleAsyncTaskExecutorCustomizerArray = new SimpleAsyncTaskExecutorCustomizer[] {};
			_assert.when(() -> Assert.notNull(simpleAsyncTaskExecutorCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SimpleAsyncTaskExecutorBuilder target = spy(new SimpleAsyncTaskExecutorBuilder());
			List<SimpleAsyncTaskExecutorCustomizer> simpleAsyncTaskExecutorCustomizerList = new ArrayList<>();
			doReturn(simpleAsyncTaskExecutorBuilderMock).when(target).additionalCustomizers(simpleAsyncTaskExecutorCustomizerList);
			//Act Statement(s)
			SimpleAsyncTaskExecutorBuilder result = target.additionalCustomizers(simpleAsyncTaskExecutorCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(simpleAsyncTaskExecutorBuilderMock));
				_assert.verify(() -> Assert.notNull(simpleAsyncTaskExecutorCustomizerArray, "Customizers must not be null"), atLeast(1));
				verify(target).additionalCustomizers(simpleAsyncTaskExecutorCustomizerList);
			});
		}
	}

	//Sapient generated method id: ${ec4a4216-0b11-3482-8467-7bedcdd174bc}
	@Test()
	void additionalCustomizers1WhenSetIsNull() {
		/* Branches:
		 * (set != null) : false  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) null, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SimpleAsyncTaskExecutorBuilder target = new SimpleAsyncTaskExecutorBuilder();
			Iterable<SimpleAsyncTaskExecutorCustomizer> iterable = null;
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.additionalCustomizers(iterable);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Iterable) null, "Customizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c319ea97-f8d0-37c4-a5dd-88e142a90c6d}
	@Test()
	void buildTest() {
		//Arrange Statement(s)
		SimpleAsyncTaskExecutorBuilder target = spy(new SimpleAsyncTaskExecutorBuilder());
		doReturn(simpleAsyncTaskExecutorMock).when(target).configure((SimpleAsyncTaskExecutor) any());
		//Act Statement(s)
		SimpleAsyncTaskExecutor result = target.build();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(simpleAsyncTaskExecutorMock));
			verify(target).configure((SimpleAsyncTaskExecutor) any());
		});
	}

	//Sapient generated method id: ${716d80b9-84b4-3f5a-bb9e-a90cac149ddf}
	@Test()
	void build1Test() {
		//Arrange Statement(s)
		SimpleAsyncTaskExecutor simpleAsyncTaskExecutorMock2 = mock(SimpleAsyncTaskExecutor.class);
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class)) {
			beanUtils.when(() -> BeanUtils.instantiateClass(SimpleAsyncTaskExecutor.class)).thenReturn(simpleAsyncTaskExecutorMock);
			SimpleAsyncTaskExecutorBuilder target = spy(new SimpleAsyncTaskExecutorBuilder());
			doReturn(simpleAsyncTaskExecutorMock2).when(target).configure(simpleAsyncTaskExecutorMock);
			//Act Statement(s)
			SimpleAsyncTaskExecutor result = target.build(SimpleAsyncTaskExecutor.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(simpleAsyncTaskExecutorMock2));
				beanUtils.verify(() -> BeanUtils.instantiateClass(SimpleAsyncTaskExecutor.class), atLeast(1));
				verify(target).configure(simpleAsyncTaskExecutorMock);
			});
		}
	}

	//Sapient generated method id: ${92778da8-5cb9-368b-8e0b-ad44bc4f7017}
	@Disabled()
	@Test()
	void configureWhenCollectionUtilsIsEmptyThisCustomizers() {
		/* Branches:
		 * (!CollectionUtils.isEmpty(this.customizers)) : false
		 */
		//Arrange Statement(s)
		PropertyMapper propertyMapperMock = mock(PropertyMapper.class);
		PropertyMapper propertyMapperMock2 = mock(PropertyMapper.class);
		PropertyMapper.Source propertyMapperSourceMock = mock(PropertyMapper.Source.class);
		PropertyMapper.Source propertyMapperSourceMock2 = mock(PropertyMapper.Source.class);
		PropertyMapper.Source propertyMapperSourceMock3 = mock(PropertyMapper.Source.class);
		PropertyMapper.Source propertyMapperSourceMock4 = mock(PropertyMapper.Source.class);
		PropertyMapper.Source propertyMapperSourceMock5 = mock(PropertyMapper.Source.class);
		PropertyMapper.Source propertyMapperSourceMock6 = mock(PropertyMapper.Source.class);
		PropertyMapper.Source propertyMapperSourceMock7 = mock(PropertyMapper.Source.class);
		try (MockedStatic<PropertyMapper> propertyMapper = mockStatic(PropertyMapper.class)) {
			propertyMapper.when(() -> PropertyMapper.get()).thenReturn(propertyMapperMock);
			doReturn(propertyMapperMock2).when(propertyMapperMock).alwaysApplyingWhenNonNull();
			doReturn(propertyMapperSourceMock).when(propertyMapperMock2).from((Boolean) null);
			doNothing().when(propertyMapperSourceMock).to((Consumer) any());
			doReturn(propertyMapperSourceMock2).when(propertyMapperMock2).from((String) null);
			doReturn(propertyMapperSourceMock3).when(propertyMapperSourceMock2).whenHasText();
			doNothing().when(propertyMapperSourceMock3).to((Consumer) any());
			doReturn(propertyMapperSourceMock4).when(propertyMapperMock2).from((Integer) null);
			doNothing().when(propertyMapperSourceMock4).to((Consumer) any());
			doReturn(propertyMapperSourceMock5).when(propertyMapperMock2).from((TaskDecorator) null);
			doNothing().when(propertyMapperSourceMock5).to((Consumer) any());
			doReturn(propertyMapperSourceMock6).when(propertyMapperMock2).from((Duration) null);
			doReturn(propertyMapperSourceMock7).when(propertyMapperSourceMock6).as((Function) any());
			doNothing().when(propertyMapperSourceMock7).to((Consumer) any());
			SimpleAsyncTaskExecutorBuilder target = new SimpleAsyncTaskExecutorBuilder();
			//Act Statement(s)
			SimpleAsyncTaskExecutor result = target.configure(simpleAsyncTaskExecutorMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(simpleAsyncTaskExecutorMock));
				propertyMapper.verify(() -> PropertyMapper.get(), atLeast(1));
				verify(propertyMapperMock).alwaysApplyingWhenNonNull();
				verify(propertyMapperMock2).from((Boolean) null);
				verify(propertyMapperSourceMock).to((Consumer) any());
				verify(propertyMapperMock2).from((String) null);
				verify(propertyMapperSourceMock2).whenHasText();
				verify(propertyMapperSourceMock3).to((Consumer) any());
				verify(propertyMapperMock2).from((Integer) null);
				verify(propertyMapperSourceMock4).to((Consumer) any());
				verify(propertyMapperMock2).from((TaskDecorator) null);
				verify(propertyMapperSourceMock5).to((Consumer) any());
				verify(propertyMapperMock2).from((Duration) null);
				verify(propertyMapperSourceMock6).as((Function) any());
				verify(propertyMapperSourceMock7).to((Consumer) any());
			});
		}
	}
}
