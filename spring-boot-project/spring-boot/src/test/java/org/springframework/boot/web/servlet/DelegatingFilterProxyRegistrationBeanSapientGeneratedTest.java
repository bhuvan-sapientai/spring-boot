package org.springframework.boot.web.servlet;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.util.Assert;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DelegatingFilterProxyRegistrationBeanSapientGeneratedTest {

    //Sapient generated method id: ${getFilter1Test}, hash: 0F661E854189825A25BEFC0310F6452D
    @Test()
    void getFilter1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            ServletRegistrationBean<?>[] servletRegistrationBeanArray = new ServletRegistrationBean[] {};
            _assert.when(() -> Assert.notNull(servletRegistrationBeanArray, "ServletRegistrationBeans must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.hasLength("A", "TargetBeanName must not be null or empty")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.hasLength("A", "Name must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull((WebApplicationContext) null, "ApplicationContext be injected")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.isInstanceOf(WebApplicationContext.class, (WebApplicationContext) null)).thenAnswer((Answer<Void>) invocation -> null);
            DelegatingFilterProxyRegistrationBean target = new DelegatingFilterProxyRegistrationBean("A", servletRegistrationBeanArray);
            //Act Statement(s)
            DelegatingFilterProxy result = target.getFilter();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(servletRegistrationBeanArray, "ServletRegistrationBeans must not be null"), atLeast(1));
                _assert.verify(() -> Assert.hasLength("A", "TargetBeanName must not be null or empty"), atLeast(1));
                _assert.verify(() -> Assert.hasLength("A", "Name must not be empty"), atLeast(1));
                _assert.verify(() -> Assert.notNull((WebApplicationContext) null, "ApplicationContext be injected"), atLeast(1));
                _assert.verify(() -> Assert.isInstanceOf(WebApplicationContext.class, (WebApplicationContext) null), atLeast(1));
            });
        }
    }
}
