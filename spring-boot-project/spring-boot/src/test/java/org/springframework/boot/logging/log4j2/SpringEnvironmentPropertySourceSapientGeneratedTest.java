package org.springframework.boot.logging.log4j2;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.springframework.core.env.Environment;
import org.mockito.MockedStatic;
import org.springframework.util.Assert;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringEnvironmentPropertySourceSapientGeneratedTest {

    private final Environment environmentMock = mock(Environment.class, "environment");

    //Sapient generated method id: ${getPropertyTest}, hash: A08C48E7031F12939567733001415151
    @Test()
    void getPropertyTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            SpringEnvironmentPropertySource target = new SpringEnvironmentPropertySource(environmentMock);
            doReturn("return_of_getProperty1").when(environmentMock).getProperty("key1");
            //Act Statement(s)
            String result = target.getProperty("key1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProperty1"));
                _assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
                verify(environmentMock).getProperty("key1");
            });
        }
    }

    //Sapient generated method id: ${containsPropertyWhenThisEnvironmentContainsPropertyKey}, hash: 183E75997D76079BE0208C65A163477E
    @Test()
    void containsPropertyWhenThisEnvironmentContainsPropertyKey() {
        /* Branches:
         * (this.environment.containsProperty(key)) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            SpringEnvironmentPropertySource target = new SpringEnvironmentPropertySource(environmentMock);
            doReturn(true).when(environmentMock).containsProperty("key1");
            //Act Statement(s)
            boolean result = target.containsProperty("key1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                _assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
                verify(environmentMock).containsProperty("key1");
            });
        }
    }

    //Sapient generated method id: ${containsPropertyWhenThisEnvironmentNotContainsPropertyKey}, hash: 5DF908C46573A91CF16C60980A7EB40C
    @Test()
    void containsPropertyWhenThisEnvironmentNotContainsPropertyKey() {
        /* Branches:
         * (this.environment.containsProperty(key)) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(environmentMock, "Environment must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            SpringEnvironmentPropertySource target = new SpringEnvironmentPropertySource(environmentMock);
            doReturn(false).when(environmentMock).containsProperty("key1");
            //Act Statement(s)
            boolean result = target.containsProperty("key1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                _assert.verify(() -> Assert.notNull(environmentMock, "Environment must not be null"), atLeast(1));
                verify(environmentMock).containsProperty("key1");
            });
        }
    }
}
