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

	private final MessageInterpolator messageInterpolatorMock = mock(MessageInterpolator.class, "null");

	private final MessageSource messageSourceMock = mock(MessageSource.class, "null");

	private final MessageInterpolator.Context messageInterpolatorContextMock = mock(MessageInterpolator.Context.class);

	//Sapient generated method id: ${3913c63a-cd3f-3956-b8a8-e4f1da039008}, hash: 7D9F0FDB66569B024E956A2E093575FF
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

	//Sapient generated method id: ${f40604cd-a968-3a70-bb3d-965fe146fc3d}, hash: 1280B48A725BBC023FE036E97D1DD22E
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
		MessageInterpolator.Context messageInterpolatorContextMock = mock(MessageInterpolator.Context.class, "null");
		Locale locale = new Locale("language1");
		doReturn("return_of_interpolate1").when(messageInterpolatorMock).interpolate("Hello {name}, your age is {age}.", messageInterpolatorContextMock, locale);
		//Act Statement(s)
		String result = target.interpolate("Hello {name}, your age is {age}.", messageInterpolatorContextMock, locale);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("return_of_interpolate1"));
			verify(messageInterpolatorMock).interpolate("Hello {name}, your age is {age}.", messageInterpolatorContextMock, locale);
		});
	}

	//Sapient generated method id: ${f08ccbd1-e361-3f99-98e5-201bdd42d9cc}, hash: B0A3105BBBC7E60293270DEFC9F0FB78
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
		doReturn("<String>").when(messageSourceMock).getMessage("<String>", null, null, locale);
		doReturn("return_of_interpolate1").when(messageInterpolatorMock).interpolate("<value>", messageInterpolatorContextMock, locale);
		//Act Statement(s)
		String result = target.interpolate("<value>", messageInterpolatorContextMock, locale);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("return_of_interpolate1"));
			verify(messageSourceMock).getMessage("<String>", null, null, locale);
			verify(messageInterpolatorMock).interpolate("<value>", messageInterpolatorContextMock, locale);
		});
	}

	//Sapient generated method id: ${1a7f664c-effc-3b6f-8c26-92ad70cbd7ff}, hash: 1F2ECDC2E55352AFD4D5C169C2067C2E
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
		doReturn("<String>").when(messageSourceMock).getMessage("C", null, null, locale);
		doReturn("return_of_interpolate1").when(messageInterpolatorMock).interpolate("<value>", messageInterpolatorContextMock, locale);
		//Act Statement(s)
		String result = target.interpolate("<value>", messageInterpolatorContextMock, locale);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("return_of_interpolate1"));
			verify(messageSourceMock).getMessage("C", null, null, locale);
			verify(messageInterpolatorMock).interpolate("<value>", messageInterpolatorContextMock, locale);
		});
	}
}
