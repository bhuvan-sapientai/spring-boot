package org.springframework.boot.web.reactive.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.core.env.ConfigurableEnvironment;
import org.mockito.stubbing.Answer;
import org.springframework.core.io.Resource;
import org.mockito.MockedStatic;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.Assert;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AnnotationConfigReactiveWebApplicationContextSapientGeneratedTest {

    private final DefaultListableBeanFactory defaultListableBeanFactoryMock = mock(DefaultListableBeanFactory.class);

    //Sapient generated method id: ${createEnvironmentTest}, hash: 5B856D99F4CD651463B65B589E544DF1
    @Test()
    void createEnvironmentTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigReactiveWebApplicationContext target = new AnnotationConfigReactiveWebApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            ConfigurableEnvironment result = target.createEnvironment();
            //Assert statement(s)
            //TODO: Please implement equals method in StandardReactiveWebEnvironment for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getResourceByPathTest}, hash: E99792A774F819AADD864A734E5418FE
    @Test()
    void getResourceByPathTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            AnnotationConfigReactiveWebApplicationContext target = new AnnotationConfigReactiveWebApplicationContext(defaultListableBeanFactoryMock);
            //Act Statement(s)
            Resource result = target.getResourceByPath("path1");
            FilteredReactiveWebContextResource filteredReactiveWebContextResource = new FilteredReactiveWebContextResource("path1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(filteredReactiveWebContextResource));
                _assert.verify(() -> Assert.notNull(defaultListableBeanFactoryMock, "BeanFactory must not be null"), atLeast(1));
            });
        }
    }
}
