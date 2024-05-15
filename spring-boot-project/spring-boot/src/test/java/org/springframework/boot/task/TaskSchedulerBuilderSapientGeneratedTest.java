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

    //Sapient generated method id: ${poolSizeTest}, hash: E6C2EEDC6E16AE3224749F65FED94C5E
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

    //Sapient generated method id: ${awaitTerminationTest}, hash: F79DFED22209DCAC586C47CD405744A1
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

    //Sapient generated method id: ${awaitTerminationPeriodTest}, hash: 2D91CEBE4513AA1616672ED212A0C138
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

    //Sapient generated method id: ${threadNamePrefixTest}, hash: BC97C055894452973A210A7013B56F8B
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

    //Sapient generated method id: ${customizersTest}, hash: 22B6C8D882BE60C7C539838A52F4956B
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

    //Sapient generated method id: ${customizers1WhenSetIsNull}, hash: 45AACE2EED1FEE2560AC5F410B8A90B3
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

    //Sapient generated method id: ${additionalCustomizersTest}, hash: D8DA7A2CD862F0E7E6E16D3B8A7B8EC5
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

    //Sapient generated method id: ${additionalCustomizers1WhenSetIsNotNull}, hash: 4EEFDD6A028F3EE39798B21CB6928D29
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

    //Sapient generated method id: ${additionalCustomizers1WhenSetIsNull}, hash: 5BC410912D66AA016B09CC480BD566C1
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

    //Sapient generated method id: ${buildTest}, hash: 4BC1391214F817DB90C41FFE0A146F75
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

    //Sapient generated method id: ${configureWhenCollectionUtilsNotIsEmptyThisCustomizers}, hash: B9BFD81B0BDECB848AEC1EC6A522104B
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
        TaskSchedulerCustomizer customizerMock = mock(TaskSchedulerCustomizer.class);
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
            Set<TaskSchedulerCustomizer> taskSchedulerCustomizerSet = new HashSet<>();
            taskSchedulerCustomizerSet.add(customizerMock);
            TaskSchedulerBuilder target = new TaskSchedulerBuilder(1, false, duration, "threadNamePrefix1", taskSchedulerCustomizerSet);
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
