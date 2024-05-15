package org.springframework.boot.validation;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import jakarta.validation.MessageInterpolator;
import java.util.Locale;
import org.springframework.context.MessageSource;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MessageSourceMessageInterpolatorSapientGeneratedTest {

    private final MessageInterpolator messageInterpolatorMock = mock(MessageInterpolator.class, "messageInterpolator");

    private final MessageSource messageSourceMock = mock(MessageSource.class, "messageSource");

    private final MessageInterpolator.Context messageInterpolatorContextMock = mock(MessageInterpolator.Context.class);

    //Sapient generated method id: ${interpolateTest}, hash: 7D9F0FDB66569B024E956A2E093575FF
    @Test()
    void interpolateTest() {
        //Arrange Statement(s)
        MessageSourceMessageInterpolator target = spy(new MessageSourceMessageInterpolator(messageSourceMock, messageInterpolatorMock));
        doReturn("return_of_interpolate1").when(target).interpolate(eq("messageTemplate1"), eq(messageInterpolatorContextMock), (Locale) any());
        //Act Statement(s)
        String result = target.interpolate("messageTemplate1", messageInterpolatorContextMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_interpolate1"));
            verify(target).interpolate(eq("messageTemplate1"), eq(messageInterpolatorContextMock), (Locale) any());
        });
    }

    //Sapient generated method id: ${interpolate1WhenParenthesesNotEquals0}, hash: E5286CA91D807C1321E5C29D6A385EAE
    @Test()
    void interpolate1WhenParenthesesNotEquals0() {
        /* Branches:
         * (i < buf.length()) : true  #  inside replaceParameters method
         * (buf.charAt(i) == ESCAPE) : false  #  inside replaceParameters method
         * (buf.charAt(i) == PREFIX) : true  #  inside replaceParameters method
         * (startIndex == -1) : true  #  inside replaceParameters method
         * (parentheses == 0) : false  #  inside replaceParameters method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MessageSourceMessageInterpolator target = new MessageSourceMessageInterpolator(messageSourceMock, messageInterpolatorMock);
        Locale locale = new Locale("language1");
        doReturn("return_of_interpolate1").when(messageInterpolatorMock).interpolate("B", messageInterpolatorContextMock, locale);
        //Act Statement(s)
        String result = target.interpolate("B", messageInterpolatorContextMock, locale);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_interpolate1"));
            verify(messageInterpolatorMock).interpolate("B", messageInterpolatorContextMock, locale);
        });
    }

    //Sapient generated method id: ${interpolate1WhenIsUsingCodeAsDefaultMessageValueParameterAndValueIsNull}, hash: 23CAD01529675D011A1EF25F35F2CCAB
    @Disabled()
    @Test()
    void interpolate1WhenIsUsingCodeAsDefaultMessageValueParameterAndValueIsNull() {
        /* Branches:
         * (i < buf.length()) : true  #  inside replaceParameters method
         * (buf.charAt(i) == ESCAPE) : false  #  inside replaceParameters method
         * (buf.charAt(i) == PREFIX) : false  #  inside replaceParameters method
         * (buf.charAt(i) == SUFFIX) : true  #  inside replaceParameters method
         * (parentheses > 0) : false  #  inside replaceParameters method
         * (parentheses == 0) : true  #  inside replaceParameters method
         * (startIndex < endIndex) : true  #  inside replaceParameters method
         * (!visitedParameters.add(parameter)) : false  #  inside replaceParameters method
         * (value != null) : true  #  inside replaceParameter method
         * (value.equals(parameter)) : true  #  inside isUsingCodeAsDefaultMessage method
         * (!isUsingCodeAsDefaultMessage(value, parameter)) : false  #  inside replaceParameter method
         * (value != null) : false  #  inside replaceParameters method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MessageSourceMessageInterpolator target = new MessageSourceMessageInterpolator(messageSourceMock, messageInterpolatorMock);
        Locale locale = new Locale("language1");
        doReturn("D").when(messageSourceMock).getMessage("D", null, null, locale);
        doReturn("return_of_interpolate1").when(messageInterpolatorMock).interpolate("C", messageInterpolatorContextMock, locale);
        //Act Statement(s)
        String result = target.interpolate("C", messageInterpolatorContextMock, locale);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_interpolate1"));
            verify(messageSourceMock).getMessage("D", null, null, locale);
            verify(messageInterpolatorMock).interpolate("C", messageInterpolatorContextMock, locale);
        });
    }

    //Sapient generated method id: ${interpolate1WhenIsUsingCodeAsDefaultMessageNotValueParameterAndValueIsNull}, hash: 98D75C14B53361B3822E0722E7316198
    @Disabled()
    @Test()
    void interpolate1WhenIsUsingCodeAsDefaultMessageNotValueParameterAndValueIsNull() {
        /* Branches:
         * (i < buf.length()) : true  #  inside replaceParameters method
         * (buf.charAt(i) == ESCAPE) : false  #  inside replaceParameters method
         * (buf.charAt(i) == PREFIX) : false  #  inside replaceParameters method
         * (buf.charAt(i) == SUFFIX) : true  #  inside replaceParameters method
         * (parentheses > 0) : false  #  inside replaceParameters method
         * (parentheses == 0) : true  #  inside replaceParameters method
         * (startIndex < endIndex) : true  #  inside replaceParameters method
         * (!visitedParameters.add(parameter)) : false  #  inside replaceParameters method
         * (value != null) : true  #  inside replaceParameter method
         * (value.equals(parameter)) : false  #  inside isUsingCodeAsDefaultMessage method
         * (!isUsingCodeAsDefaultMessage(value, parameter)) : true  #  inside replaceParameter method
         * (value != null) : false  #  inside replaceParameters method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MessageSourceMessageInterpolator target = new MessageSourceMessageInterpolator(messageSourceMock, messageInterpolatorMock);
        Locale locale = new Locale("language1");
        doReturn("M").when(messageSourceMock).getMessage("N", null, null, locale);
        doReturn("return_of_interpolate1").when(messageInterpolatorMock).interpolate("CDEFGHIJKL", messageInterpolatorContextMock, locale);
        //Act Statement(s)
        String result = target.interpolate("CDEFGHIJKL", messageInterpolatorContextMock, locale);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_interpolate1"));
            verify(messageSourceMock).getMessage("N", null, null, locale);
            verify(messageInterpolatorMock).interpolate("CDEFGHIJKL", messageInterpolatorContextMock, locale);
        });
    }
}
