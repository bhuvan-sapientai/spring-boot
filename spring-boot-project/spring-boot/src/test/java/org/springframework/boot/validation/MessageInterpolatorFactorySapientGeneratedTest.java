package org.springframework.boot.validation;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.BeansException;
import org.springframework.util.ClassUtils;

import jakarta.validation.Validation;
import jakarta.validation.Configuration;

import org.springframework.context.MessageSource;

import jakarta.validation.ValidationException;
import jakarta.validation.bootstrap.GenericBootstrap;
import org.mockito.MockedStatic;

import org.springframework.beans.BeanUtils;

import jakarta.validation.MessageInterpolator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MessageInterpolatorFactorySapientGeneratedTest {

	private final Configuration<?> configurationMock = mock(Configuration.class);

	private final GenericBootstrap genericBootstrapMock = mock(GenericBootstrap.class);

	private final MessageInterpolator messageInterpolatorMock = mock(MessageInterpolator.class);

	private final MessageSource messageSourceMock = mock(MessageSource.class);

	//Sapient generated method id: ${1782af4c-ccb8-3e78-905a-96e079f16b13}, hash: CB89AD7E0462CE8C203986DAA739155E
	@Test()
	void getObjectWhenThisMessageSourceIsNotNull() throws Exception {
		/* Branches:
		 * (this.messageSource != null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Validation> validation = mockStatic(Validation.class)) {
			validation.when(() -> Validation.byDefaultProvider()).thenReturn(genericBootstrapMock);
			doReturn(configurationMock).when(genericBootstrapMock).configure();
			doReturn(messageInterpolatorMock).when(configurationMock).getDefaultMessageInterpolator();
			MessageInterpolatorFactory target = new MessageInterpolatorFactory(messageSourceMock);
			//Act Statement(s)
			MessageInterpolator result = target.getObject();
			//Assert statement(s)
			//TODO: Please implement equals method in MessageSourceMessageInterpolator for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				validation.verify(() -> Validation.byDefaultProvider(), atLeast(1));
				verify(genericBootstrapMock).configure();
				verify(configurationMock).getDefaultMessageInterpolator();
			});
		}
	}

	//Sapient generated method id: ${e7fd13fd-93d9-3e22-8c1e-ff7d5824a2be}, hash: 02FFF27AC04208156339EAF645C2F612
	@Test()
	void getObjectWhenThisMessageSourceIsNull() throws Exception {
		/* Branches:
		 * (this.messageSource != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Validation> validation = mockStatic(Validation.class)) {
			validation.when(() -> Validation.byDefaultProvider()).thenReturn(genericBootstrapMock);
			doReturn(configurationMock).when(genericBootstrapMock).configure();
			doReturn(messageInterpolatorMock).when(configurationMock).getDefaultMessageInterpolator();
			MessageInterpolatorFactory target = new MessageInterpolatorFactory((MessageSource) null);
			//Act Statement(s)
			MessageInterpolator result = target.getObject();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(messageInterpolatorMock));
				validation.verify(() -> Validation.byDefaultProvider(), atLeast(1));
				verify(genericBootstrapMock).configure();
				verify(configurationMock).getDefaultMessageInterpolator();
			});
		}
	}

	//Sapient generated method id: ${5d703e20-560c-3d37-aabd-81a6b0151648}, hash: 98BC376F7779E7EE7B755A9BB5452222
	@Test()
	void getObjectWhenFallbackIsNullThrowsValidationException() throws BeansException {
		/* Branches:
		 * (catch-exception (ValidationException)) : true  #  inside getMessageInterpolator method
		 * (for-each(FALLBACKS)) : true  #  inside getFallback method
		 * (fallback != null) : false  #  inside getMessageInterpolator method
		 */
		//Arrange Statement(s)
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.resolveClassName("org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator", null)).thenReturn(Object.class);
			beanUtils.when(() -> BeanUtils.instantiateClass(Object.class)).thenReturn(null);
			MessageInterpolatorFactory target = new MessageInterpolatorFactory(messageSourceMock);
			//Act Statement(s)
			final ValidationException result = assertThrows(ValidationException.class, () -> {
				target.getObject();
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				classUtils.verify(() -> ClassUtils.resolveClassName("org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator", null), atLeast(1));
				beanUtils.verify(() -> BeanUtils.instantiateClass(Object.class), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f993bd7c-cfd4-3573-b262-a3cccbfe7aa3}, hash: 57C0FB84220D26ECF3E736ABA4FA61A7
	@Test()
	void getObjectWhenFallbackIsNotNullAndThisMessageSourceIsNotNull() throws Exception {
		/* Branches:
		 * (catch-exception (ValidationException)) : true  #  inside getMessageInterpolator method
		 * (for-each(FALLBACKS)) : true  #  inside getFallback method
		 * (fallback != null) : true  #  inside getMessageInterpolator method
		 * (this.messageSource != null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.resolveClassName("org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator", null)).thenReturn(Object.class);
			beanUtils.when(() -> BeanUtils.instantiateClass(Object.class)).thenReturn(messageInterpolatorMock);
			MessageInterpolatorFactory target = new MessageInterpolatorFactory(messageSourceMock);
			//Act Statement(s)
			MessageInterpolator result = target.getObject();
			//Assert statement(s)
			//TODO: Please implement equals method in MessageSourceMessageInterpolator for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				classUtils.verify(() -> ClassUtils.resolveClassName("org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator", null), atLeast(1));
				beanUtils.verify(() -> BeanUtils.instantiateClass(Object.class), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${eca7e442-d657-30f0-89a4-bfb6118385f2}, hash: 8BF8E0CC92EDAE7FBEFB5AB4422622AF
	@Test()
	void getObjectWhenFallbackIsNotNullAndThisMessageSourceIsNull() throws Exception {
		/* Branches:
		 * (catch-exception (ValidationException)) : true  #  inside getMessageInterpolator method
		 * (for-each(FALLBACKS)) : true  #  inside getFallback method
		 * (fallback != null) : true  #  inside getMessageInterpolator method
		 * (this.messageSource != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.resolveClassName("org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator", null)).thenReturn(Object.class);
			beanUtils.when(() -> BeanUtils.instantiateClass(Object.class)).thenReturn(messageInterpolatorMock);
			MessageInterpolatorFactory target = new MessageInterpolatorFactory((MessageSource) null);
			//Act Statement(s)
			MessageInterpolator result = target.getObject();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(messageInterpolatorMock));
				classUtils.verify(() -> ClassUtils.resolveClassName("org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator", null), atLeast(1));
				beanUtils.verify(() -> BeanUtils.instantiateClass(Object.class), atLeast(1));
			});
		}
	}
}
