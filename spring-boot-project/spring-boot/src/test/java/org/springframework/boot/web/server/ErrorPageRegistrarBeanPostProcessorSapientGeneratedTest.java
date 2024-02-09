package org.springframework.boot.web.server;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.BeansException;

import org.mockito.stubbing.Answer;
import org.mockito.MockitoAnnotations;

import org.springframework.util.Assert;

import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.ListableBeanFactory;

import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ErrorPageRegistrarBeanPostProcessorSapientGeneratedTest {

	private final ListableBeanFactory beanFactoryMock = mock(ListableBeanFactory.class, "beanFactory");

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private ErrorPageRegistrarBeanPostProcessor target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${6a498d31-c29e-3164-874e-02924a8e16ac}
	@Test()
	void setBeanFactoryTest() {
		//Arrange Statement(s)
		ListableBeanFactory listableBeanFactoryMock = mock(ListableBeanFactory.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.isInstanceOf(ListableBeanFactory.class, listableBeanFactoryMock, "ErrorPageRegistrarBeanPostProcessor can only be used with a ListableBeanFactory")).thenAnswer((Answer<Void>) invocation -> null);
			target = new ErrorPageRegistrarBeanPostProcessor();
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			//Act Statement(s)
			target.setBeanFactory(listableBeanFactoryMock);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.isInstanceOf(ListableBeanFactory.class, listableBeanFactoryMock, "ErrorPageRegistrarBeanPostProcessor can only be used with a ListableBeanFactory"), atLeast(1)));
		}
	}

	//Sapient generated method id: ${046a55f8-72ca-3fc9-b1e9-f87be879d206}
	@Test()
	void postProcessBeforeInitializationWhenGetRegistrarsIsEmpty() throws BeansException {
		/* Branches:
		 * (bean instanceof ErrorPageRegistry errorPageRegistry) : true
		 * (this.registrars == null) : true  #  inside getRegistrars method
		 * (for-each(getRegistrars())) : false  #  inside postProcessBeforeInitialization method
		 */
		//Arrange Statement(s)
		target = new ErrorPageRegistrarBeanPostProcessor();
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Map<String, Object> stringObjectMap = new HashMap<>();
		doReturn(stringObjectMap).when(beanFactoryMock).getBeansOfType(ErrorPageRegistrar.class, false, false);
		ErrorPageRegistry errorPageRegistryMock = mock(ErrorPageRegistry.class, "ErrorPageRegistry");

		//Act Statement(s)
		Object result = target.postProcessBeforeInitialization((Object) errorPageRegistryMock, "beanName");

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(errorPageRegistryMock));
			verify(beanFactoryMock).getBeansOfType(ErrorPageRegistrar.class, false, false);
		});
	}

	//Sapient generated method id: ${4cfb5025-dae0-38fb-9400-154ec4849360}
	@Test()
	void postProcessAfterInitializationTest() throws BeansException {
		//Arrange Statement(s)
		target = new ErrorPageRegistrarBeanPostProcessor();
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Object object = new Object();

		//Act Statement(s)
		Object result = target.postProcessAfterInitialization(object, "beanName1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(object)));
	}
}
