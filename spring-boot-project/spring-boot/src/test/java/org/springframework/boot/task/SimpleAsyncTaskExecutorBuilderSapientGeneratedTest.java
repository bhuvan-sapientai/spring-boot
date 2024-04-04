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
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SimpleAsyncTaskExecutorBuilderSapientGeneratedTest {

	private final SimpleAsyncTaskExecutorBuilder simpleAsyncTaskExecutorBuilderMock = mock(SimpleAsyncTaskExecutorBuilder.class);

	private final SimpleAsyncTaskExecutorCustomizer simpleAsyncTaskExecutorCustomizerMock = mock(SimpleAsyncTaskExecutorCustomizer.class);

	private final SimpleAsyncTaskExecutor simpleAsyncTaskExecutorMock = mock(SimpleAsyncTaskExecutor.class);

	//Sapient generated method id: ${685f4a5d-cad1-361d-add4-158862b5b607}, hash: 397E33F46578EB2551285E8B8DDEEF72
	@Test()
	void threadNamePrefixTest() {
		//Arrange Statement(s)
		SimpleAsyncTaskExecutorBuilder target = new SimpleAsyncTaskExecutorBuilder();

		//Act Statement(s)
		SimpleAsyncTaskExecutorBuilder result = target.threadNamePrefix("threadNamePrefix1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${9eac6044-a8e2-3b90-b9a3-2f54d7fcbf72}, hash: 1D7733C49EA07DDF18DE8FD3F31FEBBF
	@Test()
	void virtualThreadsTest() {
		//Arrange Statement(s)
		SimpleAsyncTaskExecutorBuilder target = new SimpleAsyncTaskExecutorBuilder();

		//Act Statement(s)
		SimpleAsyncTaskExecutorBuilder result = target.virtualThreads(false);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${ea866017-6fd3-3d5a-a04d-3fcc7a43afee}, hash: A1595B660976884C25F61D2E5727C66C
	@Test()
	void concurrencyLimitTest() {
		//Arrange Statement(s)
		SimpleAsyncTaskExecutorBuilder target = new SimpleAsyncTaskExecutorBuilder();

		//Act Statement(s)
		SimpleAsyncTaskExecutorBuilder result = target.concurrencyLimit(0);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${2647b519-24dd-3d60-a3d8-92d143b722f9}, hash: 95EC7D80A2BB783A4068B02658165286
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

	//Sapient generated method id: ${21dde231-3965-3602-a630-e377546febd3}, hash: A07AF8D2E29CF8CE45ED84A65E0F157B
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

	//Sapient generated method id: ${096c8c26-248f-3c0b-a109-b0008208dcb4}, hash: 9A57DF8F97B1FC3F480D3D5E73CEBB1F
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

	//Sapient generated method id: ${4093ce62-8361-3b14-be69-19a1177dbf57}, hash: CD511683AC0A23BBE2832EE421015849
	@Test()
	void customizers1WhenSetIsNull() {
		/* Branches:
		 * (set != null) : false  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			SimpleAsyncTaskExecutorBuilder target = new SimpleAsyncTaskExecutorBuilder();
			Iterable<SimpleAsyncTaskExecutorCustomizer> iterable = new ArrayList<>(List.of(simpleAsyncTaskExecutorCustomizerMock));
			//Act Statement(s)
			SimpleAsyncTaskExecutorBuilder result = target.customizers(iterable);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${01c5b568-1ccf-3f8d-be31-7c6a00d3b86f}, hash: 8266EF7702D03BB9AD5D359ABDC858C5
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

	//Sapient generated method id: ${ec4a4216-0b11-3482-8467-7bedcdd174bc}, hash: 5FD498212D1DE5DDF777BF9602EE67FE
	@Test()
	void additionalCustomizers1WhenSetIsNull() {
		/* Branches:
		 * (set != null) : false  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			SimpleAsyncTaskExecutorBuilder target = new SimpleAsyncTaskExecutorBuilder();
			Iterable<SimpleAsyncTaskExecutorCustomizer> iterable = new ArrayList<>(List.of(simpleAsyncTaskExecutorCustomizerMock));
			//Act Statement(s)
			SimpleAsyncTaskExecutorBuilder result = target.additionalCustomizers(iterable);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${c319ea97-f8d0-37c4-a5dd-88e142a90c6d}, hash: 84DA1171D25C8F532C9608A09D12B3D5
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

	//Sapient generated method id: ${716d80b9-84b4-3f5a-bb9e-a90cac149ddf}, hash: 13C3BA68C04E32AB1BE6443C498B7E84
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

	//Sapient generated method id: ${92778da8-5cb9-368b-8e0b-ad44bc4f7017}, hash: 57DC79AA48323D380212A7291569D3E6
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
			doReturn(propertyMapperSourceMock).when(propertyMapperMock2).from((Boolean) null);
			doNothing().when(propertyMapperSourceMock).to((Consumer) any());
			PropertyMapper.Source source = propertyMapperMock2.from((String) null);
			doReturn(source).when(propertyMapperMock2).from((String) null);
			PropertyMapper.Source source2 = propertyMapperMock2.from((Integer) null);
			doReturn(source2).when(propertyMapperMock2).from((Integer) null);
			PropertyMapper.Source source3 = propertyMapperMock2.from((TaskDecorator) null);
			doReturn(source3).when(propertyMapperMock2).from((TaskDecorator) null);
			PropertyMapper.Source source4 = propertyMapperMock2.from((Duration) null);
			doReturn(source4).when(propertyMapperMock2).from((Duration) null);
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
				verify(propertyMapperMock2).from((Integer) null);
				verify(propertyMapperMock2).from((TaskDecorator) null);
				verify(propertyMapperMock2).from((Duration) null);
			});
		}
	}
}
