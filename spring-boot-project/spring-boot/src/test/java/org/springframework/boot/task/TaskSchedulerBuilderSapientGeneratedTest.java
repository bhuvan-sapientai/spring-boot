package org.springframework.boot.task;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.mockito.stubbing.Answer;

import org.springframework.boot.context.properties.PropertyMapper;

import java.util.Set;

import org.springframework.util.CollectionUtils;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.util.Assert;

import java.util.HashSet;
import java.time.Duration;
import java.util.function.Function;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.function.Consumer;

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
class TaskSchedulerBuilderSapientGeneratedTest {

	private final TaskSchedulerBuilder taskSchedulerBuilderMock = mock(TaskSchedulerBuilder.class);

	private final ThreadPoolTaskScheduler threadPoolTaskSchedulerMock = mock(ThreadPoolTaskScheduler.class);

	//Sapient generated method id: ${ddfe15a3-21ef-3195-b2b4-48a3bc8e08da}
	@Disabled()
	@Test()
	void poolSizeTest() {
		//Arrange Statement(s)
		Duration duration = Duration.ofDays(0L);
		Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
		TaskSchedulerBuilder target = new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet);
		//Act Statement(s)
		TaskSchedulerBuilder result = target.poolSize(1);
		TaskSchedulerBuilder taskSchedulerBuilder = new TaskSchedulerBuilder(1, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet);
		//Assert statement(s)
		//TODO: Please implement equals method in TaskSchedulerBuilder for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(taskSchedulerBuilder)));
	}

	//Sapient generated method id: ${d3a86441-89f4-3a11-9ff3-57e1b584ea81}
	@Disabled()
	@Test()
	void awaitTerminationTest() {
		//Arrange Statement(s)
		Duration duration = Duration.ofDays(0L);
		Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
		TaskSchedulerBuilder target = new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet);
		//Act Statement(s)
		TaskSchedulerBuilder result = target.awaitTermination(false);
		TaskSchedulerBuilder taskSchedulerBuilder = new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet);
		//Assert statement(s)
		//TODO: Please implement equals method in TaskSchedulerBuilder for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(taskSchedulerBuilder)));
	}

	//Sapient generated method id: ${f053c8a2-a61c-3106-a56d-ffd51d370963}
	@Disabled()
	@Test()
	void awaitTerminationPeriodTest() {
		//Arrange Statement(s)
		Duration duration = Duration.ofDays(0L);
		Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
		TaskSchedulerBuilder target = new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet);
		Duration duration2 = Duration.ofDays(0L);
		//Act Statement(s)
		TaskSchedulerBuilder result = target.awaitTerminationPeriod(duration2);
		TaskSchedulerBuilder taskSchedulerBuilder = new TaskSchedulerBuilder(0, false, duration2, "threadNamePrefix1", taskSchedulerCustomizerSet);
		//Assert statement(s)
		//TODO: Please implement equals method in TaskSchedulerBuilder for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(taskSchedulerBuilder)));
	}

	//Sapient generated method id: ${685f4a5d-cad1-361d-add4-158862b5b607}
	@Disabled()
	@Test()
	void threadNamePrefixTest() {
		//Arrange Statement(s)
		Duration duration = Duration.ofDays(0L);
		Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
		TaskSchedulerBuilder target = new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet);
		//Act Statement(s)
		TaskSchedulerBuilder result = target.threadNamePrefix("threadNamePrefix1");
		TaskSchedulerBuilder taskSchedulerBuilder = new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet);
		//Assert statement(s)
		//TODO: Please implement equals method in TaskSchedulerBuilder for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(taskSchedulerBuilder)));
	}

	//Sapient generated method id: ${096c8c26-248f-3c0b-a109-b0008208dcb4}
	@Test()
	void customizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			TaskSchedulerCustomizer[] taskSchedulerCustomizerArray = new TaskSchedulerCustomizer[] {};
			_assert.when(() -> Assert.notNull(taskSchedulerCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
			TaskSchedulerBuilder target = spy(new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet));
			List<TaskSchedulerCustomizer> taskSchedulerCustomizerList = new ArrayList<>();
			doReturn(taskSchedulerBuilderMock).when(target).customizers(taskSchedulerCustomizerList);
			//Act Statement(s)
			TaskSchedulerBuilder result = target.customizers(taskSchedulerCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(taskSchedulerBuilderMock));
				_assert.verify(() -> Assert.notNull(taskSchedulerCustomizerArray, "Customizers must not be null"), atLeast(1));
				verify(target).customizers(taskSchedulerCustomizerList);
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
			Duration duration = Duration.ofDays(0L);
			Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
			TaskSchedulerBuilder target = new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet);
			Iterable<TaskSchedulerCustomizer> iterable = null;
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
			TaskSchedulerCustomizer[] taskSchedulerCustomizerArray = new TaskSchedulerCustomizer[] {};
			_assert.when(() -> Assert.notNull(taskSchedulerCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
			TaskSchedulerBuilder target = spy(new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet));
			List<TaskSchedulerCustomizer> taskSchedulerCustomizerList = new ArrayList<>();
			doReturn(taskSchedulerBuilderMock).when(target).additionalCustomizers(taskSchedulerCustomizerList);
			//Act Statement(s)
			TaskSchedulerBuilder result = target.additionalCustomizers(taskSchedulerCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(taskSchedulerBuilderMock));
				_assert.verify(() -> Assert.notNull(taskSchedulerCustomizerArray, "Customizers must not be null"), atLeast(1));
				verify(target).additionalCustomizers(taskSchedulerCustomizerList);
			});
		}
	}

	//Sapient generated method id: ${fbe004e5-01a4-3dff-881a-cf633dd17d5f}
	@Test()
	void additionalCustomizers1WhenSetIsNotNull() {
		/* Branches:
		 * (set != null) : true  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) null, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
			TaskSchedulerBuilder target = new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet);
			Iterable<TaskSchedulerCustomizer> iterable = null;
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

	//Sapient generated method id: ${ec4a4216-0b11-3482-8467-7bedcdd174bc}
	@Test()
	void additionalCustomizers1WhenSetIsNull() {
		/* Branches:
		 * (set != null) : false  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) null, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			TaskSchedulerBuilder target = new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", (Set) null);
			Iterable<TaskSchedulerCustomizer> iterable = null;
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
		Duration duration = Duration.ofDays(0L);
		Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
		TaskSchedulerBuilder target = spy(new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet));
		doReturn(threadPoolTaskSchedulerMock).when(target).configure((ThreadPoolTaskScheduler) any());
		//Act Statement(s)
		ThreadPoolTaskScheduler result = target.build();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(threadPoolTaskSchedulerMock));
			verify(target).configure((ThreadPoolTaskScheduler) any());
		});
	}

	//Sapient generated method id: ${e9165558-da0a-36f1-a4c1-97dc35ed89ac}
	@Disabled()
	@Test()
	void configureWhenCollectionUtilsNotIsEmptyThisCustomizers() {
		/* Branches:
		 * (!CollectionUtils.isEmpty(this.customizers)) : true
		 */
		//Arrange Statement(s)
		TaskSchedulerCustomizer customizerMock = mock(TaskSchedulerCustomizer.class);
		PropertyMapper propertyMapperMock = mock(PropertyMapper.class);
		PropertyMapper propertyMapperMock2 = mock(PropertyMapper.class);
		PropertyMapper.Source propertyMapperSourceMock = mock(PropertyMapper.Source.class);
		PropertyMapper.Source propertyMapperSourceMock2 = mock(PropertyMapper.Source.class);
		PropertyMapper.Source propertyMapperSourceMock3 = mock(PropertyMapper.Source.class);
		PropertyMapper.Source<Integer> propertyMapperSourceMock4 = mock(PropertyMapper.Source.class);
		PropertyMapper.Source propertyMapperSourceMock5 = mock(PropertyMapper.Source.class);
		try (MockedStatic<PropertyMapper> propertyMapper = mockStatic(PropertyMapper.class)) {
			doNothing().when(customizerMock).customize(threadPoolTaskSchedulerMock);
			propertyMapper.when(() -> PropertyMapper.get()).thenReturn(propertyMapperMock);
			doReturn(propertyMapperMock2).when(propertyMapperMock).alwaysApplyingWhenNonNull();
			doReturn(propertyMapperSourceMock).when(propertyMapperMock2).from(1);
			doNothing().when(propertyMapperSourceMock).to((Consumer) any());
			doReturn(propertyMapperSourceMock2).when(propertyMapperMock2).from(false);
			doNothing().when(propertyMapperSourceMock2).to((Consumer) any());
			doReturn(propertyMapperSourceMock3).when(propertyMapperMock2).from((Duration) any());
			doReturn(propertyMapperSourceMock4).when(propertyMapperSourceMock3).asInt((Function) any());
			doNothing().when(propertyMapperSourceMock4).to((Consumer) any());
			doReturn(propertyMapperSourceMock5).when(propertyMapperMock2).from("threadNamePrefix1");
			doNothing().when(propertyMapperSourceMock5).to((Consumer) any());
			Duration duration = Duration.ofDays(0L);
			Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
			taskSchedulerCustomizerSet.add(customizerMock);
			TaskSchedulerBuilder target = new TaskSchedulerBuilder(1, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet);
			//Act Statement(s)
			ThreadPoolTaskScheduler result = target.configure(threadPoolTaskSchedulerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(threadPoolTaskSchedulerMock));
				verify(customizerMock).customize(threadPoolTaskSchedulerMock);
				propertyMapper.verify(() -> PropertyMapper.get(), atLeast(1));
				verify(propertyMapperMock).alwaysApplyingWhenNonNull();
				verify(propertyMapperMock2).from(1);
				verify(propertyMapperSourceMock).to((Consumer) any());
				verify(propertyMapperMock2).from(false);
				verify(propertyMapperSourceMock2).to((Consumer) any());
				verify(propertyMapperMock2).from((Duration) any());
				verify(propertyMapperSourceMock3).asInt((Function) any());
				verify(propertyMapperSourceMock4).to((Consumer) any());
				verify(propertyMapperMock2).from("threadNamePrefix1");
				verify(propertyMapperSourceMock5).to((Consumer) any());
			});
		}
	}
}
