package org.springframework.boot.web.servlet.context;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.Resource;

import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class XmlServletWebServerApplicationContextSapientGeneratedTest {

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private XmlServletWebServerApplicationContext target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${9fc3a2ff-e757-37e3-8b9a-697079d79662}
	@Disabled()
	@Test()
	void setValidatingTest() throws BeanDefinitionStoreException {
		/**
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: reader
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "resourceNamesItem1" };
		target = new XmlServletWebServerApplicationContext(Object.class, stringArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//Act Statement(s)
		target.setValidating(false);
	}

	//Sapient generated method id: ${62e170bc-1441-3662-bd95-fcc548180549}
	@Disabled()
	@Test()
	void setEnvironmentTest() throws BeanDefinitionStoreException {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "resourceNamesItem1" };
		target = new XmlServletWebServerApplicationContext(Object.class, stringArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		target.setEnvironment(configurableEnvironmentMock);
		ConfigurableEnvironment configurableEnvironmentMock2 = mock(ConfigurableEnvironment.class);
		//Act Statement(s)
		target.setEnvironment(configurableEnvironmentMock2);
	}

	//Sapient generated method id: ${ff42effe-8e08-33e3-9690-b409079214e3}
	@Disabled()
	@Test()
	void loadTest() throws BeanDefinitionStoreException {
		/**
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: reader
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "resourceNamesItem1" };
		target = new XmlServletWebServerApplicationContext(Object.class, stringArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		Resource[] resourceArray = new Resource[] {};
		//Act Statement(s)
		target.load(resourceArray);
	}

	//Sapient generated method id: ${fb700e60-95e4-3577-89b7-de3a92ca0615}
	@Disabled()
	@Test()
	void load1Test() throws BeanDefinitionStoreException {
		/**
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: reader
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "resourceNamesItem1" };
		target = new XmlServletWebServerApplicationContext(Object.class, stringArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		String[] stringArray2 = new String[] {};
		//Act Statement(s)
		target.load(stringArray2);
	}

	//Sapient generated method id: ${53297243-06ee-3a0c-8dac-cb4fe5a38ba5}
	@Disabled()
	@Test()
	void load2WhenILessThanResourceNamesLength() throws BeanDefinitionStoreException {
		/* Branches:
		 * (i < resourceNames.length) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: reader
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "resourceNamesItem1" };
		target = new XmlServletWebServerApplicationContext(Object.class, stringArray);
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		//Act Statement(s)
		target.load(Object.class, stringArray);
	}
}
