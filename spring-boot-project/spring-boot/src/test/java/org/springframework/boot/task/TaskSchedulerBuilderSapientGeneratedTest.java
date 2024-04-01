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
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anySet;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TaskSchedulerBuilderSapientGeneratedTest {

	private final TaskSchedulerBuilder taskSchedulerBuilderMock = mock(TaskSchedulerBuilder.class);

	private final TaskSchedulerCustomizer taskSchedulerCustomizerMock = mock(TaskSchedulerCustomizer.class);

	//Sapient generated method id: ${ddfe15a3-21ef-3195-b2b4-48a3bc8e08da}, hash: E6C2EEDC6E16AE3224749F65FED94C5E
	@Test()
	void poolSizeTest() {
		//Arrange Statement(s)
		Duration duration = Duration.ofDays(0L);
		Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
		TaskSchedulerBuilder target = new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet);
		//Act Statement(s)
		TaskSchedulerBuilder result = target.poolSize(1);
		//Assert statement(s)
		//TODO: Please implement equals method in TaskSchedulerBuilder for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${d3a86441-89f4-3a11-9ff3-57e1b584ea81}, hash: F79DFED22209DCAC586C47CD405744A1
	@Test()
	void awaitTerminationTest() {
		//Arrange Statement(s)
		Duration duration = Duration.ofDays(0L);
		Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
		TaskSchedulerBuilder target = new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet);
		//Act Statement(s)
		TaskSchedulerBuilder result = target.awaitTermination(false);
		//Assert statement(s)
		//TODO: Please implement equals method in TaskSchedulerBuilder for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${f053c8a2-a61c-3106-a56d-ffd51d370963}, hash: 2D91CEBE4513AA1616672ED212A0C138
	@Test()
	void awaitTerminationPeriodTest() {
		//Arrange Statement(s)
		Duration duration = Duration.ofDays(0L);
		Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
		TaskSchedulerBuilder target = new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet);
		Duration duration2 = Duration.ofDays(0L);
		//Act Statement(s)
		TaskSchedulerBuilder result = target.awaitTerminationPeriod(duration2);
		//Assert statement(s)
		//TODO: Please implement equals method in TaskSchedulerBuilder for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${685f4a5d-cad1-361d-add4-158862b5b607}, hash: BC97C055894452973A210A7013B56F8B
	@Test()
	void threadNamePrefixTest() {
		//Arrange Statement(s)
		Duration duration = Duration.ofDays(0L);
		Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
		TaskSchedulerBuilder target = new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet);
		//Act Statement(s)
		TaskSchedulerBuilder result = target.threadNamePrefix("threadNamePrefix1");
		//Assert statement(s)
		//TODO: Please implement equals method in TaskSchedulerBuilder for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${096c8c26-248f-3c0b-a109-b0008208dcb4}, hash: 22B6C8D882BE60C7C539838A52F4956B
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

	//Sapient generated method id: ${4093ce62-8361-3b14-be69-19a1177dbf57}, hash: 45AACE2EED1FEE2560AC5F410B8A90B3
	@Test()
	void customizers1WhenSetIsNull() {
		/* Branches:
		 * (set != null) : false  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
			TaskSchedulerBuilder target = new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet);
			Iterable<TaskSchedulerCustomizer> iterable = new ArrayList<>(List.of(taskSchedulerCustomizerMock));
			//Act Statement(s)
			TaskSchedulerBuilder result = target.customizers(iterable);
			//Assert statement(s)
			//TODO: Please implement equals method in TaskSchedulerBuilder for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${01c5b568-1ccf-3f8d-be31-7c6a00d3b86f}, hash: D8DA7A2CD862F0E7E6E16D3B8A7B8EC5
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

	//Sapient generated method id: ${fbe004e5-01a4-3dff-881a-cf633dd17d5f}, hash: 4EEFDD6A028F3EE39798B21CB6928D29
	@Test()
	void additionalCustomizers1WhenSetIsNotNull() {
		/* Branches:
		 * (set != null) : true  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
			TaskSchedulerBuilder target = new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet);
			Iterable<TaskSchedulerCustomizer> iterable = new ArrayList<>(List.of(taskSchedulerCustomizerMock));
			//Act Statement(s)
			TaskSchedulerBuilder result = target.additionalCustomizers(iterable);
			//Assert statement(s)
			//TODO: Please implement equals method in TaskSchedulerBuilder for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${ec4a4216-0b11-3482-8467-7bedcdd174bc}, hash: 5BC410912D66AA016B09CC480BD566C1
	@Test()
	void additionalCustomizers1WhenSetIsNull() {
		/* Branches:
		 * (set != null) : false  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			TaskSchedulerBuilder target = new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", (Set) null);
			Iterable<TaskSchedulerCustomizer> iterable = new ArrayList<>(List.of(taskSchedulerCustomizerMock));
			//Act Statement(s)
			TaskSchedulerBuilder result = target.additionalCustomizers(iterable);
			//Assert statement(s)
			//TODO: Please implement equals method in TaskSchedulerBuilder for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${c319ea97-f8d0-37c4-a5dd-88e142a90c6d}, hash: 4BC1391214F817DB90C41FFE0A146F75
	@Test()
	void buildTest() {
		//Arrange Statement(s)
		Duration duration = Duration.ofDays(0L);
		Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
		TaskSchedulerBuilder target = spy(new TaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet));
		ThreadPoolTaskScheduler threadPoolTaskSchedulerMock = mock(ThreadPoolTaskScheduler.class);
		doReturn(threadPoolTaskSchedulerMock).when(target).configure((ThreadPoolTaskScheduler) any());
		//Act Statement(s)
		ThreadPoolTaskScheduler result = target.build();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(threadPoolTaskSchedulerMock));
			verify(target).configure((ThreadPoolTaskScheduler) any());
		});
	}

	//Sapient generated method id: ${e9165558-da0a-36f1-a4c1-97dc35ed89ac}, hash: 6B9838DF4622B3CE33200697B0BFD585
	@Disabled()
	@Test()
	void configureWhenCollectionUtilsNotIsEmptyThisCustomizers() {
		/* Branches:
		 * (!CollectionUtils.isEmpty(this.customizers)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		PropertyMapper propertyMapperMock = mock(PropertyMapper.class);
		PropertyMapper propertyMapperMock2 = mock(PropertyMapper.class);
		PropertyMapper.Source propertyMapperSourceMock = mock(PropertyMapper.Source.class);
		PropertyMapper.Source propertyMapperSourceMock2 = mock(PropertyMapper.Source.class);
		PropertyMapper.Source<Integer> propertyMapperSourceMock3 = mock(PropertyMapper.Source.class);
		PropertyMapper.Source propertyMapperSourceMock4 = mock(PropertyMapper.Source.class);
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<PropertyMapper> propertyMapper = mockStatic(PropertyMapper.class)) {
			propertyMapper.when(() -> PropertyMapper.get()).thenReturn(propertyMapperMock);
			doReturn(propertyMapperMock2).when(propertyMapperMock).alwaysApplyingWhenNonNull();
			PropertyMapper.Source source = propertyMapperMock2.from(1);
			doReturn(source).when(propertyMapperMock2).from(1);
			doReturn(propertyMapperSourceMock).when(propertyMapperMock2).from(false);
			doNothing().when(propertyMapperSourceMock).to((Consumer) any());
			doReturn(propertyMapperSourceMock2).when(propertyMapperMock2).from((Duration) any());
			doReturn(propertyMapperSourceMock3).when(propertyMapperSourceMock2).asInt((Function) any());
			doNothing().when(propertyMapperSourceMock3).to((Consumer) any());
			doReturn(propertyMapperSourceMock4).when(propertyMapperMock2).from("<value>");
			doNothing().when(propertyMapperSourceMock4).to((Consumer) any());
			collectionUtils.when(() -> CollectionUtils.isEmpty(anySet())).thenReturn(false);
			Duration duration = Duration.ofDays(0L);
			Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
			TaskSchedulerBuilder target = new TaskSchedulerBuilder(1, false, duration, "<value>", taskSchedulerCustomizerSet);
			ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
			threadPoolTaskScheduler.setThreadNamePrefix("threadNamePrefix1");
			threadPoolTaskScheduler.setWaitForTasksToCompleteOnShutdown(false);
			//Act Statement(s)
			ThreadPoolTaskScheduler result = target.configure(threadPoolTaskScheduler);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(threadPoolTaskScheduler));
				propertyMapper.verify(() -> PropertyMapper.get(), atLeast(1));
				verify(propertyMapperMock).alwaysApplyingWhenNonNull();
				verify(propertyMapperMock2).from(1);
				verify(propertyMapperMock2).from(false);
				verify(propertyMapperSourceMock).to((Consumer) any());
				verify(propertyMapperMock2).from((Duration) any());
				verify(propertyMapperSourceMock2).asInt((Function) any());
				verify(propertyMapperSourceMock3).to((Consumer) any());
				verify(propertyMapperMock2).from("<value>");
				verify(propertyMapperSourceMock4).to((Consumer) any());
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anySet()));
			});
		}
	}
}
