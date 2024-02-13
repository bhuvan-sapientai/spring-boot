package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

import org.mockito.MockedStatic;

import org.springframework.beans.factory.InjectionPoint;
import org.springframework.boot.context.properties.bind.BindMethod;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NotConstructorBoundInjectionFailureAnalyzerSapientGeneratedTest {

	private final InjectionPoint injectionPointMock = mock(InjectionPoint.class);

	private final MergedAnnotations mergedAnnotationsMock = mock(MergedAnnotations.class);

	private final NoSuchBeanDefinitionException noSuchBeanDefinitionExceptionMock = mock(NoSuchBeanDefinitionException.class);

	//Sapient generated method id: ${c0bb632e-c120-35d3-9fe3-7fc42c801bce}
	@Test()
	void getOrderTest() {
		//Arrange Statement(s)
		NotConstructorBoundInjectionFailureAnalyzer target = new NotConstructorBoundInjectionFailureAnalyzer();
		//Act Statement(s)
		int result = target.getOrder();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(0)));
	}

	//Sapient generated method id: ${ba610d9d-b1af-383f-af9a-689a624cef1e}
	@Test()
	void analyze3WhenIsConstructorBindingConfigurationPropertiesNotConstructorAndIsConstructorBindingConfigurationPropertiesNotI2() {
		/* Branches:
		 * (failure != null) : true  #  inside findCause method
		 * (type.isInstance(failure)) : false  #  inside findCause method
		 * (unsatisfiedDependencyException == null) : true  #  inside findInjectionPoint method
		 * (isConstructorBindingConfigurationProperties(constructor)) : false  #  inside isConstructorBindingConfigurationProperties method
		 * (isConstructorBindingConfigurationProperties(injectionPoint)) : false
		 */
		//Arrange Statement(s)
		NotConstructorBoundInjectionFailureAnalyzer target = new NotConstructorBoundInjectionFailureAnalyzer();
		Throwable throwable = new Throwable();
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, noSuchBeanDefinitionExceptionMock, "description1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${77164c51-d227-33be-a051-155949f82382}
	@Disabled()
	@Test()
	void analyze3WhenIsConstructorBindingConfigurationPropertiesInjectionPoint() {
		/* Branches:
		 * (failure != null) : true  #  inside findCause method
		 * (type.isInstance(failure)) : true  #  inside findCause method
		 * (unsatisfiedDependencyException == null) : false  #  inside findInjectionPoint method
		 * (isConstructorBindingConfigurationProperties(constructor)) : false  #  inside isConstructorBindingConfigurationProperties method
		 * (injectionPoint != null) : true  #  inside isConstructorBindingConfigurationProperties method
		 * (bindMethod == BindMethod.VALUE_OBJECT) : false  #  inside isConstructorBindingConfigurationProperties method
		 * (MergedAnnotations.from(declaringClass, SearchStrategy.TYPE_HIERARCHY).isPresent(ConfigurationProperties.class)) : false  #  inside isConstructorBindingConfigurationProperties method
		 * (isConstructorBindingConfigurationProperties(injectionPoint)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<ConfigurationPropertiesBean> configurationPropertiesBean = mockStatic(ConfigurationPropertiesBean.class)) {
			//TODO: Needs to return real value
			doReturn(null).when(injectionPointMock).getMember();
			configurationPropertiesBean.when(() -> ConfigurationPropertiesBean.deduceBindMethod(Object.class)).thenReturn(BindMethod.VALUE_OBJECT);
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock);
			doReturn(true).when(mergedAnnotationsMock).isPresent(ConfigurationProperties.class);
			NotConstructorBoundInjectionFailureAnalyzer target = new NotConstructorBoundInjectionFailureAnalyzer();
			UnsatisfiedDependencyException unsatisfiedDependencyException = new UnsatisfiedDependencyException("resourceDescription1", "beanName1", injectionPointMock, "msg1");
			//Act Statement(s)
			FailureAnalysis result = target.analyze((Throwable) unsatisfiedDependencyException, noSuchBeanDefinitionExceptionMock, "description1");
			FailureAnalysis failureAnalysis = new FailureAnalysis("Object is annotated with @ConstructorBinding but it is defined as a regular bean which caused dependency injection to fail.", "Update your configuration so that Object is defined via @ConfigurationPropertiesScan or @EnableConfigurationProperties.", noSuchBeanDefinitionExceptionMock);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(failureAnalysis));
				verify(injectionPointMock, times(2)).getMember();
				configurationPropertiesBean.verify(() -> ConfigurationPropertiesBean.deduceBindMethod(Object.class), atLeast(1));
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(1));
				verify(mergedAnnotationsMock).isPresent(ConfigurationProperties.class);
			});
		}
	}

	//Sapient generated method id: ${fc9f6b87-fd74-33ec-8c40-6ffd4eb5f134}
	@Disabled()
	@Test()
	void analyze3WhenMergedAnnotationsFromDeclaringClassSearchStrategyTYPE_HIERARCHYNotIsPresentConfigurationPropertiesAndIsCons() {
		/* Branches:
		 * (failure != null) : true  #  inside findCause method
		 * (type.isInstance(failure)) : true  #  inside findCause method
		 * (unsatisfiedDependencyException == null) : false  #  inside findInjectionPoint method
		 * (isConstructorBindingConfigurationProperties(constructor)) : false  #  inside isConstructorBindingConfigurationProperties method
		 * (injectionPoint != null) : true  #  inside isConstructorBindingConfigurationProperties method
		 * (bindMethod == BindMethod.VALUE_OBJECT) : false  #  inside isConstructorBindingConfigurationProperties method
		 * (MergedAnnotations.from(declaringClass, SearchStrategy.TYPE_HIERARCHY).isPresent(ConfigurationProperties.class)) : false  #  inside isConstructorBindingConfigurationProperties method
		 * (isConstructorBindingConfigurationProperties(injectionPoint)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<ConfigurationPropertiesBean> configurationPropertiesBean = mockStatic(ConfigurationPropertiesBean.class)) {
			//TODO: Needs to return real value
			doReturn(null).when(injectionPointMock).getMember();
			configurationPropertiesBean.when(() -> ConfigurationPropertiesBean.deduceBindMethod(Object.class)).thenReturn(BindMethod.JAVA_BEAN);
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock);
			doReturn(true).when(mergedAnnotationsMock).isPresent(ConfigurationProperties.class);
			NotConstructorBoundInjectionFailureAnalyzer target = new NotConstructorBoundInjectionFailureAnalyzer();
			UnsatisfiedDependencyException unsatisfiedDependencyException = new UnsatisfiedDependencyException("resourceDescription1", "beanName1", injectionPointMock, "msg1");
			//Act Statement(s)
			FailureAnalysis result = target.analyze((Throwable) unsatisfiedDependencyException, noSuchBeanDefinitionExceptionMock, "description1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(injectionPointMock).getMember();
				configurationPropertiesBean.verify(() -> ConfigurationPropertiesBean.deduceBindMethod(Object.class), atLeast(1));
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(1));
				verify(mergedAnnotationsMock).isPresent(ConfigurationProperties.class);
			});
		}
	}
}
