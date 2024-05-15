package org.springframework.boot.task;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.springframework.scheduling.concurrent.SimpleAsyncTaskScheduler;
import org.mockito.stubbing.Answer;
import org.springframework.boot.context.properties.PropertyMapper;
import org.springframework.util.CollectionUtils;
import org.springframework.util.Assert;
import java.time.Duration;
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
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SimpleAsyncTaskSchedulerBuilderSapientGeneratedTest {

    private final SimpleAsyncTaskSchedulerBuilder simpleAsyncTaskSchedulerBuilderMock = mock(SimpleAsyncTaskSchedulerBuilder.class);

    private final SimpleAsyncTaskSchedulerCustomizer simpleAsyncTaskSchedulerCustomizerMock = mock(SimpleAsyncTaskSchedulerCustomizer.class);

    private final SimpleAsyncTaskScheduler simpleAsyncTaskSchedulerMock = mock(SimpleAsyncTaskScheduler.class);

    //Sapient generated method id: ${threadNamePrefixTest}, hash: ABF7F6B5F760958DBC01F25FFD04CFB7
    @Test()
    void threadNamePrefixTest() {
        //Arrange Statement(s)
        SimpleAsyncTaskSchedulerBuilder target = new SimpleAsyncTaskSchedulerBuilder();
        //Act Statement(s)
        SimpleAsyncTaskSchedulerBuilder result = target.threadNamePrefix("threadNamePrefix1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${concurrencyLimitTest}, hash: A2838663CC70641A57206242ACF48073
    @Test()
    void concurrencyLimitTest() {
        //Arrange Statement(s)
        SimpleAsyncTaskSchedulerBuilder target = new SimpleAsyncTaskSchedulerBuilder();
        //Act Statement(s)
        SimpleAsyncTaskSchedulerBuilder result = target.concurrencyLimit(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${virtualThreadsTest}, hash: EA73E36574BAC90F0B7898A2AD247F25
    @Test()
    void virtualThreadsTest() {
        //Arrange Statement(s)
        SimpleAsyncTaskSchedulerBuilder target = new SimpleAsyncTaskSchedulerBuilder();
        //Act Statement(s)
        SimpleAsyncTaskSchedulerBuilder result = target.virtualThreads(false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${taskTerminationTimeoutTest}, hash: 7EF44D12C689766BA8BD9EA3D941546C
    @Test()
    void taskTerminationTimeoutTest() {
        //Arrange Statement(s)
        SimpleAsyncTaskSchedulerBuilder target = new SimpleAsyncTaskSchedulerBuilder();
        Duration duration = Duration.ofDays(0L);
        //Act Statement(s)
        SimpleAsyncTaskSchedulerBuilder result = target.taskTerminationTimeout(duration);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${customizersTest}, hash: 3F890E2F7501FE33F1C7F4F964A7287B
    @Test()
    void customizersTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            SimpleAsyncTaskSchedulerCustomizer[] simpleAsyncTaskSchedulerCustomizerArray = new SimpleAsyncTaskSchedulerCustomizer[] {};
            _assert.when(() -> Assert.notNull(simpleAsyncTaskSchedulerCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            SimpleAsyncTaskSchedulerBuilder target = spy(new SimpleAsyncTaskSchedulerBuilder());
            List<SimpleAsyncTaskSchedulerCustomizer> simpleAsyncTaskSchedulerCustomizerList = new ArrayList<>();
            doReturn(simpleAsyncTaskSchedulerBuilderMock).when(target).customizers(simpleAsyncTaskSchedulerCustomizerList);
            //Act Statement(s)
            SimpleAsyncTaskSchedulerBuilder result = target.customizers(simpleAsyncTaskSchedulerCustomizerArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(simpleAsyncTaskSchedulerBuilderMock));
                _assert.verify(() -> Assert.notNull(simpleAsyncTaskSchedulerCustomizerArray, "Customizers must not be null"), atLeast(1));
                verify(target).customizers(simpleAsyncTaskSchedulerCustomizerList);
            });
        }
    }

    //Sapient generated method id: ${customizers1WhenSetIsNull}, hash: 1009E73F4A10DC4D41E564D33C806106
    @Test()
    void customizers1WhenSetIsNull() {
        /* Branches:
         * (set != null) : false  #  inside append method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            SimpleAsyncTaskSchedulerBuilder target = new SimpleAsyncTaskSchedulerBuilder();
            Iterable<SimpleAsyncTaskSchedulerCustomizer> iterable = new ArrayList<>(List.of(simpleAsyncTaskSchedulerCustomizerMock));
            //Act Statement(s)
            SimpleAsyncTaskSchedulerBuilder result = target.customizers(iterable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null")));
            });
        }
    }

    //Sapient generated method id: ${additionalCustomizersTest}, hash: C504E365956CDAA001FBDAB23B839ACA
    @Test()
    void additionalCustomizersTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            SimpleAsyncTaskSchedulerCustomizer[] simpleAsyncTaskSchedulerCustomizerArray = new SimpleAsyncTaskSchedulerCustomizer[] {};
            _assert.when(() -> Assert.notNull(simpleAsyncTaskSchedulerCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            SimpleAsyncTaskSchedulerBuilder target = spy(new SimpleAsyncTaskSchedulerBuilder());
            List<SimpleAsyncTaskSchedulerCustomizer> simpleAsyncTaskSchedulerCustomizerList = new ArrayList<>();
            doReturn(simpleAsyncTaskSchedulerBuilderMock).when(target).additionalCustomizers(simpleAsyncTaskSchedulerCustomizerList);
            //Act Statement(s)
            SimpleAsyncTaskSchedulerBuilder result = target.additionalCustomizers(simpleAsyncTaskSchedulerCustomizerArray);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(simpleAsyncTaskSchedulerBuilderMock));
                _assert.verify(() -> Assert.notNull(simpleAsyncTaskSchedulerCustomizerArray, "Customizers must not be null"), atLeast(1));
                verify(target).additionalCustomizers(simpleAsyncTaskSchedulerCustomizerList);
            });
        }
    }

    //Sapient generated method id: ${additionalCustomizers1WhenSetIsNull}, hash: 923490B1DF8CEF95CF47E0DA2FF954B8
    @Test()
    void additionalCustomizers1WhenSetIsNull() {
        /* Branches:
         * (set != null) : false  #  inside append method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            SimpleAsyncTaskSchedulerBuilder target = new SimpleAsyncTaskSchedulerBuilder();
            Iterable<SimpleAsyncTaskSchedulerCustomizer> iterable = new ArrayList<>(List.of(simpleAsyncTaskSchedulerCustomizerMock));
            //Act Statement(s)
            SimpleAsyncTaskSchedulerBuilder result = target.additionalCustomizers(iterable);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Customizers must not be null")));
            });
        }
    }

    //Sapient generated method id: ${buildTest}, hash: FCEE250AFCC0C174553783986468C09D
    @Test()
    void buildTest() {
        //Arrange Statement(s)
        SimpleAsyncTaskSchedulerBuilder target = spy(new SimpleAsyncTaskSchedulerBuilder());
        doReturn(simpleAsyncTaskSchedulerMock).when(target).configure((SimpleAsyncTaskScheduler) any());
        //Act Statement(s)
        SimpleAsyncTaskScheduler result = target.build();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(simpleAsyncTaskSchedulerMock));
            verify(target).configure((SimpleAsyncTaskScheduler) any());
        });
    }

    //Sapient generated method id: ${configureWhenCollectionUtilsIsEmptyThisCustomizers}, hash: B611D52D3C898A3DAEE4D132EDFA62D0
    @Disabled()
    @Test()
    void configureWhenCollectionUtilsIsEmptyThisCustomizers() {
        /* Branches:
         * (!CollectionUtils.isEmpty(this.customizers)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type PropertyMapper.Source - Method: to
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
            doReturn(propertyMapperSourceMock).when(propertyMapperMock2).from((String) null);
            doNothing().when(propertyMapperSourceMock).to((Consumer) any());
            PropertyMapper.Source source = propertyMapperMock2.from((Integer) null);
            doReturn(source).when(propertyMapperMock2).from((Integer) null);
            PropertyMapper.Source source2 = propertyMapperMock2.from((Boolean) null);
            doReturn(source2).when(propertyMapperMock2).from((Boolean) null);
            PropertyMapper.Source source3 = propertyMapperMock2.from((Duration) null);
            doReturn(source3).when(propertyMapperMock2).from((Duration) null);
            SimpleAsyncTaskSchedulerBuilder target = new SimpleAsyncTaskSchedulerBuilder();
            //Act Statement(s)
            SimpleAsyncTaskScheduler result = target.configure(simpleAsyncTaskSchedulerMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(simpleAsyncTaskSchedulerMock));
                propertyMapper.verify(() -> PropertyMapper.get(), atLeast(1));
                verify(propertyMapperMock).alwaysApplyingWhenNonNull();
                verify(propertyMapperMock2).from((String) null);
                verify(propertyMapperSourceMock).to((Consumer) any());
                verify(propertyMapperMock2).from((Integer) null);
                verify(propertyMapperMock2).from((Boolean) null);
                verify(propertyMapperMock2).from((Duration) null);
            });
        }
    }
}
