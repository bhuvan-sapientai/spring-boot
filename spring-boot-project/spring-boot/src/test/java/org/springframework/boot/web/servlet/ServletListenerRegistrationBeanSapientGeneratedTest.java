package org.springframework.boot.web.servlet;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import java.util.Set;
import jakarta.servlet.ServletContext;
import org.springframework.util.Assert;
import org.mockito.MockedStatic;
import java.util.EventListener;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ServletListenerRegistrationBeanSapientGeneratedTest {

    private final EventListener eventListenerMock = mock(EventListener.class);

    private final ServletContext servletContextMock = mock(ServletContext.class);

    //Sapient generated method id: ${setListenerTest}, hash: AE877B4453204ECD9E82C0FA0BD00E5C
    @Test()
    void setListenerTest() {
        //Arrange Statement(s)
        EventListener eventListenerMock2 = mock(EventListener.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ServletListenerRegistrationBean> servletListenerRegistrationBean = mockStatic(ServletListenerRegistrationBean.class, CALLS_REAL_METHODS)) {
            _assert.when(() -> Assert.notNull(eventListenerMock, "Listener must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(false, "Listener is not of a supported type")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(eventListenerMock2, "Listener must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            servletListenerRegistrationBean.when(() -> ServletListenerRegistrationBean.isSupportedType(eventListenerMock2)).thenReturn(false);
            ServletListenerRegistrationBean<EventListener> target = new ServletListenerRegistrationBean<>(eventListenerMock);
            //Act Statement(s)
            target.setListener(eventListenerMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(target.getListener(), is(notNullValue()));
                _assert.verify(() -> Assert.notNull(eventListenerMock, "Listener must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(false, "Listener is not of a supported type"), atLeast(2));
                _assert.verify(() -> Assert.notNull(eventListenerMock2, "Listener must not be null"), atLeast(1));
                servletListenerRegistrationBean.verify(() -> ServletListenerRegistrationBean.isSupportedType(eventListenerMock2), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getDescriptionTest}, hash: DA06A1D0FF7476B5CD149E9DEF50A0DC
    @Test()
    void getDescriptionTest() {
        //Arrange Statement(s)
        EventListener eventListenerMock = mock(EventListener.class, "listener");
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(eventListenerMock, "Listener must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(false, "Listener is not of a supported type")).thenAnswer((Answer<Void>) invocation -> null);
            ServletListenerRegistrationBean<EventListener> target = new ServletListenerRegistrationBean<>(eventListenerMock);
            //Act Statement(s)
            String result = target.getDescription();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("listener listener"));
                _assert.verify(() -> Assert.notNull(eventListenerMock, "Listener must not be null"), atLeast(2));
                _assert.verify(() -> Assert.isTrue(false, "Listener is not of a supported type"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${registerTest}, hash: EEE0954E85E40545E5936FCD9F20E98C
    @Test()
    void registerTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doNothing().when(servletContextMock).addListener(eventListenerMock);
            _assert.when(() -> Assert.notNull(eventListenerMock, "Listener must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(false, "Listener is not of a supported type")).thenAnswer((Answer<Void>) invocation -> null);
            ServletListenerRegistrationBean<EventListener> target = new ServletListenerRegistrationBean<>(eventListenerMock);
            //Act Statement(s)
            target.register("description1", servletContextMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(servletContextMock).addListener(eventListenerMock);
                _assert.verify(() -> Assert.notNull(eventListenerMock, "Listener must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(false, "Listener is not of a supported type"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${registerWhenCaughtRuntimeExceptionThrowsIllegalStateException}, hash: A6323C55350C07E3D236177C28279139
    @Disabled()
    @Test()
    void registerWhenCaughtRuntimeExceptionThrowsIllegalStateException() {
        /* Branches:
         * (catch-exception (RuntimeException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EventListener eventListenerMock = mock(EventListener.class, "listener");
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doNothing().when(servletContextMock).addListener(eventListenerMock);
            _assert.when(() -> Assert.notNull(eventListenerMock, "Listener must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isTrue(false, "Listener is not of a supported type")).thenAnswer((Answer<Void>) invocation -> null);
            ServletListenerRegistrationBean<EventListener> target = new ServletListenerRegistrationBean<>(eventListenerMock);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.register("description1", servletContextMock);
            });
            RuntimeException runtimeException = new RuntimeException();
            IllegalStateException illegalStateException = new IllegalStateException("Failed to add listener 'listener' to servlet context", runtimeException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
                verify(servletContextMock).addListener(eventListenerMock);
                _assert.verify(() -> Assert.notNull(eventListenerMock, "Listener must not be null"), atLeast(1));
                _assert.verify(() -> Assert.isTrue(false, "Listener is not of a supported type"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isSupportedTypeWhenSUPPORTED_TYPESIsEmpty}, hash: 9E4036386274798CDE8C687201CBA243
    @Test()
    void isSupportedTypeWhenSUPPORTED_TYPESIsEmpty() {
        /* Branches:
         * (for-each(SUPPORTED_TYPES)) : false
         */
        //Act Statement(s)
        boolean result = ServletListenerRegistrationBean.isSupportedType(eventListenerMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${getSupportedTypesTest}, hash: 8D548FCEADB97B35D2A663BD2EBD87BF
    @Disabled()
    @Test()
    void getSupportedTypesTest() {
        //Act Statement(s)
        Set<Class<?>> result = ServletListenerRegistrationBean.getSupportedTypes();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }
}
