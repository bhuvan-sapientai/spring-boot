package org.springframework.boot.web.client;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpHeaders;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import java.nio.charset.Charset;
import org.springframework.util.Assert;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BasicAuthenticationSapientGeneratedTest {

    //Sapient generated method id: ${applyToWhenHeadersNotContainsKeyHttpHeadersAUTHORIZATION}, hash: 9FFEFD7B35EE11865AA59365A1F7321C
    @Test()
    void applyToWhenHeadersNotContainsKeyHttpHeadersAUTHORIZATION() {
        /* Branches:
         * (!headers.containsKey(HttpHeaders.AUTHORIZATION)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("A", "Username must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull("B", "Password must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Charset charset = Charset.defaultCharset();
            BasicAuthentication target = new BasicAuthentication("A", "B", charset);
            HttpHeaders httpHeaders = new HttpHeaders();
            //Act Statement(s)
            target.applyTo(httpHeaders);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull("A", "Username must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull("B", "Password must not be null"), atLeast(1));
            });
        }
    }
}
