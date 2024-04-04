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

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ThreadPoolTaskSchedulerBuilderSapientGeneratedTest {

	private final ThreadPoolTaskSchedulerBuilder threadPoolTaskSchedulerBuilderMock = mock(ThreadPoolTaskSchedulerBuilder.class);

	private final ThreadPoolTaskSchedulerCustomizer threadPoolTaskSchedulerCustomizerMock = mock(ThreadPoolTaskSchedulerCustomizer.class);

	//Sapient generated method id: ${ddfe15a3-21ef-3195-b2b4-48a3bc8e08da}, hash: 5BE1A092C2D4ECEB9885D992A1FEEC00
	@Test()
	void poolSizeTest() {
		//Arrange Statement(s)
		Duration duration = Duration.ofDays(0L);
		Set<ThreadPoolTaskSchedulerCustomizer> threadPoolTaskSchedulerCustomizerSet = new HashSet<>();
		ThreadPoolTaskSchedulerBuilder target = new ThreadPoolTaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", threadPoolTaskSchedulerCustomizerSet);

		//Act Statement(s)
		ThreadPoolTaskSchedulerBuilder result = target.poolSize(1);

		//Assert statement(s)
		//TODO: Please implement equals method in ThreadPoolTaskSchedulerBuilder for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${d3a86441-89f4-3a11-9ff3-57e1b584ea81}, hash: C2712EA2A70CBF01E7DD99723F62DB28
	@Test()
	void awaitTerminationTest() {
		//Arrange Statement(s)
		Duration duration = Duration.ofDays(0L);
		Set<ThreadPoolTaskSchedulerCustomizer> threadPoolTaskSchedulerCustomizerSet = new HashSet<>();
		ThreadPoolTaskSchedulerBuilder target = new ThreadPoolTaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", threadPoolTaskSchedulerCustomizerSet);

		//Act Statement(s)
		ThreadPoolTaskSchedulerBuilder result = target.awaitTermination(false);

		//Assert statement(s)
		//TODO: Please implement equals method in ThreadPoolTaskSchedulerBuilder for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${f053c8a2-a61c-3106-a56d-ffd51d370963}, hash: 1465A743DAB20E781E87CD6BE967BD66
	@Test()
	void awaitTerminationPeriodTest() {
		//Arrange Statement(s)
		Duration duration = Duration.ofDays(0L);
		Set<ThreadPoolTaskSchedulerCustomizer> threadPoolTaskSchedulerCustomizerSet = new HashSet<>();
		ThreadPoolTaskSchedulerBuilder target = new ThreadPoolTaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", threadPoolTaskSchedulerCustomizerSet);
		Duration duration2 = Duration.ofDays(0L);

		//Act Statement(s)
		ThreadPoolTaskSchedulerBuilder result = target.awaitTerminationPeriod(duration2);

		//Assert statement(s)
		//TODO: Please implement equals method in ThreadPoolTaskSchedulerBuilder for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${685f4a5d-cad1-361d-add4-158862b5b607}, hash: B4593F7CC94A1520DBFBA0AE104E5DC5
	@Test()
	void threadNamePrefixTest() {
		//Arrange Statement(s)
		Duration duration = Duration.ofDays(0L);
		Set<ThreadPoolTaskSchedulerCustomizer> threadPoolTaskSchedulerCustomizerSet = new HashSet<>();
		ThreadPoolTaskSchedulerBuilder target = new ThreadPoolTaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", threadPoolTaskSchedulerCustomizerSet);

		//Act Statement(s)
		ThreadPoolTaskSchedulerBuilder result = target.threadNamePrefix("threadNamePrefix1");

		//Assert statement(s)
		//TODO: Please implement equals method in ThreadPoolTaskSchedulerBuilder for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${096c8c26-248f-3c0b-a109-b0008208dcb4}, hash: 89C03BEC581741457DBBBEEEBC5EC420
	@Test()
	void customizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ThreadPoolTaskSchedulerCustomizer[] threadPoolTaskSchedulerCustomizerArray = new ThreadPoolTaskSchedulerCustomizer[] {};
			_assert.when(() -> Assert.notNull(threadPoolTaskSchedulerCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			Set<ThreadPoolTaskSchedulerCustomizer> threadPoolTaskSchedulerCustomizerSet = new HashSet<>();
			ThreadPoolTaskSchedulerBuilder target = spy(new ThreadPoolTaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", threadPoolTaskSchedulerCustomizerSet));
			List<ThreadPoolTaskSchedulerCustomizer> threadPoolTaskSchedulerCustomizerList = new ArrayList<>();
			doReturn(threadPoolTaskSchedulerBuilderMock).when(target).customizers(threadPoolTaskSchedulerCustomizerList);
			//Act Statement(s)
			ThreadPoolTaskSchedulerBuilder result = target.customizers(threadPoolTaskSchedulerCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(threadPoolTaskSchedulerBuilderMock));
				_assert.verify(() -> Assert.notNull(threadPoolTaskSchedulerCustomizerArray, "Customizers must not be null"), atLeast(1));
				verify(target).customizers(threadPoolTaskSchedulerCustomizerList);
			});
		}
	}

	//Sapient generated method id: ${4093ce62-8361-3b14-be69-19a1177dbf57}, hash: B5B5868A76684B388234DDD02BBEF31C
	@Test()
	void customizers1WhenSetIsNull() {
		/* Branches:
		 * (set != null) : false  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			Set<ThreadPoolTaskSchedulerCustomizer> threadPoolTaskSchedulerCustomizerSet = new HashSet<>();
			ThreadPoolTaskSchedulerBuilder target = new ThreadPoolTaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", threadPoolTaskSchedulerCustomizerSet);
			Iterable<ThreadPoolTaskSchedulerCustomizer> iterable = new ArrayList<>(List.of(threadPoolTaskSchedulerCustomizerMock));
			//Act Statement(s)
			ThreadPoolTaskSchedulerBuilder result = target.customizers(iterable);
			//Assert statement(s)
			//TODO: Please implement equals method in ThreadPoolTaskSchedulerBuilder for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${01c5b568-1ccf-3f8d-be31-7c6a00d3b86f}, hash: 282EA59051B1CFCA2FF596FF3966D64D
	@Test()
	void additionalCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ThreadPoolTaskSchedulerCustomizer[] threadPoolTaskSchedulerCustomizerArray = new ThreadPoolTaskSchedulerCustomizer[] {};
			_assert.when(() -> Assert.notNull(threadPoolTaskSchedulerCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			Set<ThreadPoolTaskSchedulerCustomizer> threadPoolTaskSchedulerCustomizerSet = new HashSet<>();
			ThreadPoolTaskSchedulerBuilder target = spy(new ThreadPoolTaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", threadPoolTaskSchedulerCustomizerSet));
			List<ThreadPoolTaskSchedulerCustomizer> threadPoolTaskSchedulerCustomizerList = new ArrayList<>();
			doReturn(threadPoolTaskSchedulerBuilderMock).when(target).additionalCustomizers(threadPoolTaskSchedulerCustomizerList);
			//Act Statement(s)
			ThreadPoolTaskSchedulerBuilder result = target.additionalCustomizers(threadPoolTaskSchedulerCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(threadPoolTaskSchedulerBuilderMock));
				_assert.verify(() -> Assert.notNull(threadPoolTaskSchedulerCustomizerArray, "Customizers must not be null"), atLeast(1));
				verify(target).additionalCustomizers(threadPoolTaskSchedulerCustomizerList);
			});
		}
	}

	//Sapient generated method id: ${fbe004e5-01a4-3dff-881a-cf633dd17d5f}, hash: C44B701F3AB01EEBAC5F6EEA88421817
	@Test()
	void additionalCustomizers1WhenSetIsNotNull() {
		/* Branches:
		 * (set != null) : true  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			Set<ThreadPoolTaskSchedulerCustomizer> threadPoolTaskSchedulerCustomizerSet = new HashSet<>();
			ThreadPoolTaskSchedulerBuilder target = new ThreadPoolTaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", threadPoolTaskSchedulerCustomizerSet);
			Iterable<ThreadPoolTaskSchedulerCustomizer> iterable = new ArrayList<>(List.of(threadPoolTaskSchedulerCustomizerMock));
			//Act Statement(s)
			ThreadPoolTaskSchedulerBuilder result = target.additionalCustomizers(iterable);
			//Assert statement(s)
			//TODO: Please implement equals method in ThreadPoolTaskSchedulerBuilder for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${ec4a4216-0b11-3482-8467-7bedcdd174bc}, hash: 5E66A68A99CA558391112B62F95272D7
	@Test()
	void additionalCustomizers1WhenSetIsNull() {
		/* Branches:
		 * (set != null) : false  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Duration duration = Duration.ofDays(0L);
			ThreadPoolTaskSchedulerBuilder target = new ThreadPoolTaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", (Set) null);
			Iterable<ThreadPoolTaskSchedulerCustomizer> iterable = new ArrayList<>(List.of(threadPoolTaskSchedulerCustomizerMock));
			//Act Statement(s)
			ThreadPoolTaskSchedulerBuilder result = target.additionalCustomizers(iterable);
			//Assert statement(s)
			//TODO: Please implement equals method in ThreadPoolTaskSchedulerBuilder for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null")));
			});
		}
	}

	//Sapient generated method id: ${c319ea97-f8d0-37c4-a5dd-88e142a90c6d}, hash: 2A005BE7B0469DDD0665F5E30292A484
	@Test()
	void buildTest() {
		//Arrange Statement(s)
		Duration duration = Duration.ofDays(0L);
		Set<ThreadPoolTaskSchedulerCustomizer> threadPoolTaskSchedulerCustomizerSet = new HashSet<>();
		ThreadPoolTaskSchedulerBuilder target = spy(new ThreadPoolTaskSchedulerBuilder(0, false, duration, "threadNamePrefix1", threadPoolTaskSchedulerCustomizerSet));
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

	//Sapient generated method id: ${e9165558-da0a-36f1-a4c1-97dc35ed89ac}, hash: 21117571A0AC7555F49052705B218981
	@Test()
	void configureWhenCollectionUtilsNotIsEmptyThisCustomizers() {
		/* Branches:
		 * (!CollectionUtils.isEmpty(this.customizers)) : true
		 */
		//Arrange Statement(s)
		PropertyMapper propertyMapperMock = mock(PropertyMapper.class);
		PropertyMapper propertyMapperMock2 = mock(PropertyMapper.class);
		PropertyMapper.Source propertyMapperSourceMock = mock(PropertyMapper.Source.class);
		PropertyMapper.Source propertyMapperSourceMock2 = mock(PropertyMapper.Source.class);
		PropertyMapper.Source propertyMapperSourceMock3 = mock(PropertyMapper.Source.class);
		PropertyMapper.Source<Integer> propertyMapperSourceMock4 = mock(PropertyMapper.Source.class);
		PropertyMapper.Source propertyMapperSourceMock5 = mock(PropertyMapper.Source.class);
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<PropertyMapper> propertyMapper = mockStatic(PropertyMapper.class)) {
			propertyMapper.when(() -> PropertyMapper.get()).thenReturn(propertyMapperMock);
			doReturn(propertyMapperMock2).when(propertyMapperMock).alwaysApplyingWhenNonNull();
			doReturn(propertyMapperSourceMock).when(propertyMapperMock2).from(0);
			doNothing().when(propertyMapperSourceMock).to((Consumer) any());
			doReturn(propertyMapperSourceMock2).when(propertyMapperMock2).from(false);
			doNothing().when(propertyMapperSourceMock2).to((Consumer) any());
			doReturn(propertyMapperSourceMock3).when(propertyMapperMock2).from((Duration) any());
			doReturn(propertyMapperSourceMock4).when(propertyMapperSourceMock3).asInt((Function) any());
			doNothing().when(propertyMapperSourceMock4).to((Consumer) any());
			doReturn(propertyMapperSourceMock5).when(propertyMapperMock2).from("<value>");
			doNothing().when(propertyMapperSourceMock5).to((Consumer) any());
			collectionUtils.when(() -> CollectionUtils.isEmpty(anySet())).thenReturn(false);
			Duration duration = Duration.ofDays(0L);
			Set<ThreadPoolTaskSchedulerCustomizer> threadPoolTaskSchedulerCustomizerSet = new HashSet<>();
			ThreadPoolTaskSchedulerBuilder target = new ThreadPoolTaskSchedulerBuilder(0, false, duration, "<value>", threadPoolTaskSchedulerCustomizerSet);
			ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
			//Act Statement(s)
			ThreadPoolTaskScheduler result = target.configure(threadPoolTaskScheduler);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(threadPoolTaskScheduler));
				propertyMapper.verify(() -> PropertyMapper.get(), atLeast(1));
				verify(propertyMapperMock).alwaysApplyingWhenNonNull();
				verify(propertyMapperMock2).from(0);
				verify(propertyMapperSourceMock).to((Consumer) any());
				verify(propertyMapperMock2).from(false);
				verify(propertyMapperSourceMock2).to((Consumer) any());
				verify(propertyMapperMock2).from((Duration) any());
				verify(propertyMapperSourceMock3).asInt((Function) any());
				verify(propertyMapperSourceMock4).to((Consumer) any());
				verify(propertyMapperMock2).from("<value>");
				verify(propertyMapperSourceMock5).to((Consumer) any());
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anySet()));
			});
		}
	}
}
