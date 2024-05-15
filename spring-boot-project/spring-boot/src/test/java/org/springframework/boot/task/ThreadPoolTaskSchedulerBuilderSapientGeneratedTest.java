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
class ThreadPoolTaskSchedulerBuilderSapientGeneratedTest {

    private final ThreadPoolTaskSchedulerBuilder threadPoolTaskSchedulerBuilderMock = mock(ThreadPoolTaskSchedulerBuilder.class);

    private final ThreadPoolTaskSchedulerCustomizer threadPoolTaskSchedulerCustomizerMock = mock(ThreadPoolTaskSchedulerCustomizer.class);

    //Sapient generated method id: ${poolSizeTest}, hash: 5BE1A092C2D4ECEB9885D992A1FEEC00
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

    //Sapient generated method id: ${awaitTerminationTest}, hash: C2712EA2A70CBF01E7DD99723F62DB28
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

    //Sapient generated method id: ${awaitTerminationPeriodTest}, hash: 1465A743DAB20E781E87CD6BE967BD66
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

    //Sapient generated method id: ${threadNamePrefixTest}, hash: B4593F7CC94A1520DBFBA0AE104E5DC5
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

    //Sapient generated method id: ${customizersTest}, hash: 89C03BEC581741457DBBBEEEBC5EC420
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

    //Sapient generated method id: ${customizers1WhenSetIsNull}, hash: B5B5868A76684B388234DDD02BBEF31C
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

    //Sapient generated method id: ${additionalCustomizersTest}, hash: 282EA59051B1CFCA2FF596FF3966D64D
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

    //Sapient generated method id: ${additionalCustomizers1WhenSetIsNotNull}, hash: C44B701F3AB01EEBAC5F6EEA88421817
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

    //Sapient generated method id: ${additionalCustomizers1WhenSetIsNull}, hash: 5E66A68A99CA558391112B62F95272D7
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

    //Sapient generated method id: ${buildTest}, hash: 2A005BE7B0469DDD0665F5E30292A484
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

    //Sapient generated method id: ${configureWhenCollectionUtilsNotIsEmptyThisCustomizers}, hash: E781FCA5B5BD2FFC38527843885776B6
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
        ThreadPoolTaskScheduler taskSchedulerMock = mock(ThreadPoolTaskScheduler.class);
        ThreadPoolTaskSchedulerCustomizer customizerMock = mock(ThreadPoolTaskSchedulerCustomizer.class);
        PropertyMapper propertyMapperMock = mock(PropertyMapper.class);
        PropertyMapper propertyMapperMock2 = mock(PropertyMapper.class);
        PropertyMapper.Source propertyMapperSourceMock = mock(PropertyMapper.Source.class);
        PropertyMapper.Source propertyMapperSourceMock2 = mock(PropertyMapper.Source.class);
        PropertyMapper.Source<Integer> propertyMapperSourceMock3 = mock(PropertyMapper.Source.class);
        PropertyMapper.Source propertyMapperSourceMock4 = mock(PropertyMapper.Source.class);
        try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
            MockedStatic<PropertyMapper> propertyMapper = mockStatic(PropertyMapper.class)) {
            doNothing().when(taskSchedulerMock).setWaitForTasksToCompleteOnShutdown(false);
            doNothing().when(taskSchedulerMock).setAwaitTerminationSeconds(0);
            doNothing().when(taskSchedulerMock).setThreadNamePrefix("string1");
            doNothing().when(customizerMock).customize(taskSchedulerMock);
            propertyMapper.when(() -> PropertyMapper.get()).thenReturn(propertyMapperMock);
            doReturn(propertyMapperMock2).when(propertyMapperMock).alwaysApplyingWhenNonNull();
            PropertyMapper.Source source = propertyMapperMock2.from(1);
            doReturn(source).when(propertyMapperMock2).from(1);
            doReturn(propertyMapperSourceMock).when(propertyMapperMock2).from(false);
            doNothing().when(propertyMapperSourceMock).to((Consumer) any());
            doReturn(propertyMapperSourceMock2).when(propertyMapperMock2).from((Duration) any());
            doReturn(propertyMapperSourceMock3).when(propertyMapperSourceMock2).asInt((Function) any());
            doNothing().when(propertyMapperSourceMock3).to((Consumer) any());
            doReturn(propertyMapperSourceMock4).when(propertyMapperMock2).from("threadNamePrefix1");
            doNothing().when(propertyMapperSourceMock4).to((Consumer) any());
            collectionUtils.when(() -> CollectionUtils.isEmpty(anySet())).thenReturn(false);
            Duration duration = Duration.ofDays(0L);
            Set<ThreadPoolTaskSchedulerCustomizer> threadPoolTaskSchedulerCustomizerSet = new HashSet<>();
            threadPoolTaskSchedulerCustomizerSet.add(customizerMock);
            ThreadPoolTaskSchedulerBuilder target = new ThreadPoolTaskSchedulerBuilder(1, false, duration, "threadNamePrefix1", threadPoolTaskSchedulerCustomizerSet);
            //Act Statement(s)
            ThreadPoolTaskScheduler result = target.configure(taskSchedulerMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(taskSchedulerMock));
                verify(taskSchedulerMock, atLeast(1)).setWaitForTasksToCompleteOnShutdown(false);
                verify(taskSchedulerMock, atLeast(1)).setAwaitTerminationSeconds(0);
                verify(taskSchedulerMock, atLeast(1)).setThreadNamePrefix("string1");
                verify(customizerMock).customize(taskSchedulerMock);
                propertyMapper.verify(() -> PropertyMapper.get(), atLeast(1));
                verify(propertyMapperMock).alwaysApplyingWhenNonNull();
                verify(propertyMapperMock2).from(1);
                verify(propertyMapperMock2).from(false);
                verify(propertyMapperSourceMock).to((Consumer) any());
                verify(propertyMapperMock2).from((Duration) any());
                verify(propertyMapperSourceMock2).asInt((Function) any());
                verify(propertyMapperSourceMock3).to((Consumer) any());
                verify(propertyMapperMock2).from("threadNamePrefix1");
                verify(propertyMapperSourceMock4).to((Consumer) any());
                collectionUtils.verify(() -> CollectionUtils.isEmpty(anySet()));
            });
        }
    }
}
