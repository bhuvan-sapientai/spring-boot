package org.springframework.boot.web.servlet;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import jakarta.servlet.Filter;
import org.springframework.util.Assert;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FilterRegistrationBeanSapientGeneratedTest {

    //Sapient generated method id: ${setFilterTest}, hash: 2CA9600ABA4E14AB3F9E3DA3ADB8452D
    @Test()
    void setFilterTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Filter filterMock = mock(Filter.class);
        Filter filterMock2 = mock(Filter.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            ServletRegistrationBean<?>[] servletRegistrationBeanArray = new ServletRegistrationBean[] {};
            _assert.when(() -> Assert.notNull(servletRegistrationBeanArray, "ServletRegistrationBeans must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(filterMock, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(filterMock2, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            FilterRegistrationBean target = new FilterRegistrationBean(filterMock, servletRegistrationBeanArray);
            //Act Statement(s)
            target.setFilter(filterMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(servletRegistrationBeanArray, "ServletRegistrationBeans must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(filterMock, "Filter must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(filterMock2, "Filter must not be null"), atLeast(1));
            });
        }
    }
}
