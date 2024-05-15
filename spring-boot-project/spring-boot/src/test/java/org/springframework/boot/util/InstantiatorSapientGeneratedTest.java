package org.springframework.boot.util;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.mockito.stubbing.Answer;
import org.springframework.util.Assert;
import java.util.Collection;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.springframework.util.ReflectionUtils;
import java.lang.reflect.Constructor;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class InstantiatorSapientGeneratedTest {

    private final Instantiator.FailureHandler failureHandlerMock = mock(Instantiator.FailureHandler.class, "failureHandler");

    private final Constructor constructorMock = mock(Constructor.class);

    private final Consumer consumerMock = mock(Consumer.class);

    //Sapient generated method id: ${instantiateTest}, hash: BE6F623C1C98C8828E81F2A26E778495
    @Test()
    void instantiateTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Instantiator<Object> target = spy(new Instantiator(Object.class, consumerMock, failureHandlerMock));
        List<Object> objectList = new ArrayList<>();
        Collection<String> collection = new ArrayList<>();
        doReturn(objectList).when(target).instantiate((ClassLoader) null, collection);
        //Act Statement(s)
        List<Object> result = target.instantiate(collection);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(objectList));
            verify(target).instantiate((ClassLoader) null, collection);
        });
    }

    //Sapient generated method id: ${instantiate1WhenArgsIsNotNull}, hash: 4D03410C879E2891D8373EB12073220C
    @Disabled()
    @Test()
    void instantiate1WhenArgsIsNotNull() {
        /* Branches:
         * (for-each(constructors)) : true  #  inside instantiate method
         * (i < parameterTypes.length) : false  #  inside getArgs method
         * (args != null) : true  #  inside instantiate method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(anyCollection(), eq("Names must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isAssignable(Object.class, Object.class)).thenAnswer((Answer<Void>) invocation -> null);
            reflectionUtils.when(() -> ReflectionUtils.makeAccessible(constructorMock)).thenAnswer((Answer<Void>) invocation -> null);
            Instantiator<Object> target = new Instantiator(Object.class, consumerMock, failureHandlerMock);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Collection<String> collection = new ArrayList<>();
            collection.add("namesItem1");
            //Act Statement(s)
            List<Object> result = target.instantiate(classLoader, collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(anyCollection(), eq("Names must not be null")));
                _assert.verify(() -> Assert.isAssignable(Object.class, Object.class), atLeast(1));
                reflectionUtils.verify(() -> ReflectionUtils.makeAccessible(constructorMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${instantiate1WhenParameterIsNullAndArgsIsNull}, hash: 43E445CE4911227C9794EF3C33A42886
    @Disabled()
    @Test()
    void instantiate1WhenParameterIsNullAndArgsIsNull() {
        /* Branches:
         * (for-each(constructors)) : true  #  inside instantiate method
         * (i < parameterTypes.length) : true  #  inside getArgs method
         * (for-each(this.availableParameters.entrySet())) : false  #  inside getAvailableParameter method
         * (parameter == null) : true  #  inside getArgs method
         * (args != null) : false  #  inside instantiate method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(anyCollection(), eq("Names must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isAssignable(Object.class, Object.class)).thenAnswer((Answer<Void>) invocation -> null);
            Instantiator<Object> target = new Instantiator(Object.class, consumerMock, failureHandlerMock);
            Throwable throwable = new Throwable();
            doNothing().when(failureHandlerMock).handleFailure(Object.class, "implementationName1", throwable);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            Collection<String> collection = new ArrayList<>();
            collection.add("namesItem1");
            //Act Statement(s)
            List<Object> result = target.instantiate(classLoader, collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(anyCollection(), eq("Names must not be null")));
                _assert.verify(() -> Assert.isAssignable(Object.class, Object.class), atLeast(1));
                verify(failureHandlerMock).handleFailure(Object.class, "implementationName1", throwable);
            });
        }
    }

    //Sapient generated method id: ${instantiateTypesWhenArgsIsNotNull}, hash: 2409A8CB2EC2992325B1F332631E92AF
    @Disabled()
    @Test()
    void instantiateTypesWhenArgsIsNotNull() {
        /* Branches:
         * (for-each(constructors)) : true  #  inside instantiate method
         * (i < parameterTypes.length) : false  #  inside getArgs method
         * (args != null) : true  #  inside instantiate method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ReflectionUtils> reflectionUtils = mockStatic(ReflectionUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(anyCollection(), eq("Types must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isAssignable(Object.class, Object.class)).thenAnswer((Answer<Void>) invocation -> null);
            reflectionUtils.when(() -> ReflectionUtils.makeAccessible(constructorMock)).thenAnswer((Answer<Void>) invocation -> null);
            Instantiator<Object> target = new Instantiator(Object.class, consumerMock, failureHandlerMock);
            Collection<Class<?>> collection = new ArrayList<>();
            collection.add(Object.class);
            //Act Statement(s)
            List<Object> result = target.instantiateTypes(collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(anyCollection(), eq("Types must not be null")));
                _assert.verify(() -> Assert.isAssignable(Object.class, Object.class), atLeast(1));
                reflectionUtils.verify(() -> ReflectionUtils.makeAccessible(constructorMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${instantiateTypesWhenParameterIsNullAndArgsIsNull}, hash: 3A9E63CCDDB6B93D9999886A93AC2B32
    @Disabled()
    @Test()
    void instantiateTypesWhenParameterIsNullAndArgsIsNull() {
        /* Branches:
         * (for-each(constructors)) : true  #  inside instantiate method
         * (i < parameterTypes.length) : true  #  inside getArgs method
         * (for-each(this.availableParameters.entrySet())) : false  #  inside getAvailableParameter method
         * (parameter == null) : true  #  inside getArgs method
         * (args != null) : false  #  inside instantiate method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(anyCollection(), eq("Types must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isAssignable(Object.class, Object.class)).thenAnswer((Answer<Void>) invocation -> null);
            Instantiator<Object> target = new Instantiator(Object.class, consumerMock, failureHandlerMock);
            Throwable throwable = new Throwable();
            doNothing().when(failureHandlerMock).handleFailure(Object.class, "implementationName1", throwable);
            Collection<Class<?>> collection = new ArrayList<>();
            collection.add(Object.class);
            //Act Statement(s)
            List<Object> result = target.instantiateTypes(collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(anyCollection(), eq("Types must not be null")));
                _assert.verify(() -> Assert.isAssignable(Object.class, Object.class), atLeast(1));
                verify(failureHandlerMock).handleFailure(Object.class, "implementationName1", throwable);
            });
        }
    }
}
