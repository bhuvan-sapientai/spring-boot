package org.springframework.boot.admin;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.BeansException;

import javax.management.MalformedObjectNameException;

import org.mockito.stubbing.Answer;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.core.ResolvableType;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringApplicationAdminMXBeanRegistrarSapientGeneratedTest {

	private final ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);

	private final ResolvableType eventTypeMock = mock(ResolvableType.class);

	//Sapient generated method id: ${8965c77a-005e-3a50-b8bb-0a78bd407600}, hash: AA100954A0D977AC292108E2594B6D68
	@Test()
	void setApplicationContextTest() throws BeansException, MalformedObjectNameException {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(true, "ApplicationContext does not implement ConfigurableApplicationContext")).thenAnswer((Answer<Void>) invocation -> null);
			SpringApplicationAdminMXBeanRegistrar target = new SpringApplicationAdminMXBeanRegistrar("name1");
			//Act Statement(s)
			target.setApplicationContext(configurableApplicationContextMock);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.state(true, "ApplicationContext does not implement ConfigurableApplicationContext"), atLeast(1)));
		}
	}

	//Sapient generated method id: ${34811332-9f1e-3299-9053-9889102380f6}, hash: 71592EEADE936E4EB9F9779F9B10436B
	@Test()
	void supportsEventTypeWhenTypeIsNull() throws MalformedObjectNameException {
		/* Branches:
		 * (type == null) : true
		 */
		//Arrange Statement(s)
		doReturn(null).when(eventTypeMock).getRawClass();
		SpringApplicationAdminMXBeanRegistrar target = new SpringApplicationAdminMXBeanRegistrar("name1");

		//Act Statement(s)
		boolean result = target.supportsEventType(eventTypeMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(eventTypeMock).getRawClass();
		});
	}

	//Sapient generated method id: ${2b6ba708-ef5f-3afc-ba2e-fdd6e49c2982}, hash: 65C746C9B1AE85259E703E5D27475C06
	@Test()
	void supportsEventTypeWhenWebServerInitializedEventIsAssignableFromType() throws MalformedObjectNameException {
		/* Branches:
		 * (type == null) : false
		 * (ApplicationReadyEvent.class.isAssignableFrom(type)) : false
		 * (WebServerInitializedEvent.class.isAssignableFrom(type)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class javax.management.ObjectName
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(Object.class).when(eventTypeMock).getRawClass();
		SpringApplicationAdminMXBeanRegistrar target = new SpringApplicationAdminMXBeanRegistrar("name1");

		//Act Statement(s)
		boolean result = target.supportsEventType(eventTypeMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(eventTypeMock).getRawClass();
		});
	}

	//Sapient generated method id: ${25276624-a93b-33b7-981f-506c5ac36042}, hash: 7D27B097A6F702574BE6AB1232017DE8
	@Test()
	void supportsEventTypeWhenWebServerInitializedEventNotIsAssignableFromType() throws MalformedObjectNameException {
		/* Branches:
		 * (type == null) : false
		 * (ApplicationReadyEvent.class.isAssignableFrom(type)) : false
		 * (WebServerInitializedEvent.class.isAssignableFrom(type)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class javax.management.ObjectName
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(Object.class).when(eventTypeMock).getRawClass();
		SpringApplicationAdminMXBeanRegistrar target = new SpringApplicationAdminMXBeanRegistrar("name1");

		//Act Statement(s)
		boolean result = target.supportsEventType(eventTypeMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(eventTypeMock).getRawClass();
		});
	}

	//Sapient generated method id: ${70b9b3d9-c047-3af9-8d3a-f4dd5a0efcb0}, hash: FC1ACEE30A92D303DB2999C4228B8B3B
	@Test()
	void supportsSourceTypeTest() throws MalformedObjectNameException {
		//Arrange Statement(s)
		SpringApplicationAdminMXBeanRegistrar target = new SpringApplicationAdminMXBeanRegistrar("name1");

		//Act Statement(s)
		boolean result = target.supportsSourceType(Object.class);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${baad31e7-bd13-34f7-b6c5-965196e7d669}, hash: 6AB449AB90367EC31E2A612D67EC77F6
	@Test()
	void onApplicationEventWhenEventNotInstanceOfWebServerInitializedEvent() throws MalformedObjectNameException {
		/* Branches:
		 * (event instanceof ApplicationReadyEvent readyEvent) : true
		 * (event instanceof WebServerInitializedEvent initializedEvent) : false
		 */
		//Arrange Statement(s)
		SpringApplicationAdminMXBeanRegistrar target = spy(new SpringApplicationAdminMXBeanRegistrar("name1"));
		ApplicationReadyEvent applicationReadyEventMock = mock(ApplicationReadyEvent.class);
		doNothing().when(target).onApplicationReadyEvent(applicationReadyEventMock);

		//Act Statement(s)
		target.onApplicationEvent(applicationReadyEventMock);

		//Assert statement(s)
		assertAll("result", () -> verify(target).onApplicationReadyEvent(applicationReadyEventMock));
	}

	//Sapient generated method id: ${313fc74a-87c2-3f00-8f44-e20b5061874e}, hash: 618BB609C60905117AF3C883DF60646C
	@Test()
	void onApplicationEventWhenEventInstanceOfWebServerInitializedEvent() throws MalformedObjectNameException {
		/* Branches:
		 * (event instanceof ApplicationReadyEvent readyEvent) : false
		 * (event instanceof WebServerInitializedEvent initializedEvent) : true
		 */
		//Arrange Statement(s)
		SpringApplicationAdminMXBeanRegistrar target = spy(new SpringApplicationAdminMXBeanRegistrar("name1"));
		WebServerInitializedEvent webServerInitializedEventMock = mock(WebServerInitializedEvent.class);
		doNothing().when(target).onWebServerInitializedEvent(webServerInitializedEventMock);

		//Act Statement(s)
		target.onApplicationEvent(webServerInitializedEventMock);

		//Assert statement(s)
		assertAll("result", () -> verify(target).onWebServerInitializedEvent(webServerInitializedEventMock));
	}

	//Sapient generated method id: ${4333ca59-f65f-3c9a-8f2b-ce3fb89303fc}, hash: 63C9E3A0848D2EC81A087D106CE3410A
	@Test()
	void onApplicationReadyEventWhenThisApplicationContextEqualsEventGetApplicationContext() throws MalformedObjectNameException {
		/* Branches:
		 * (this.applicationContext.equals(event.getApplicationContext())) : true
		 */
		//Arrange Statement(s)
		ApplicationReadyEvent eventMock = mock(ApplicationReadyEvent.class);
		doReturn(configurableApplicationContextMock).when(eventMock).getApplicationContext();
		SpringApplicationAdminMXBeanRegistrar target = new SpringApplicationAdminMXBeanRegistrar("name1");

		//Act Statement(s)
		target.onApplicationReadyEvent(eventMock);

		//Assert statement(s)
		assertAll("result", () -> verify(eventMock).getApplicationContext());
	}

	//Sapient generated method id: ${120c298f-acf8-370b-b520-c705c08070c5}, hash: 8408547E690C1BD3C98E29CC057536BE
	@Test()
	void onWebServerInitializedEventWhenThisApplicationContextEqualsEventGetApplicationContext() throws MalformedObjectNameException {
		/* Branches:
		 * (this.applicationContext.equals(event.getApplicationContext())) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class javax.management.ObjectName
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		WebServerInitializedEvent eventMock = mock(WebServerInitializedEvent.class);
		WebServerApplicationContext webServerApplicationContextMock = mock(WebServerApplicationContext.class);
		doReturn(webServerApplicationContextMock).when(eventMock).getApplicationContext();
		SpringApplicationAdminMXBeanRegistrar target = new SpringApplicationAdminMXBeanRegistrar("name1");

		//Act Statement(s)
		target.onWebServerInitializedEvent(eventMock);

		//Assert statement(s)
		assertAll("result", () -> verify(eventMock).getApplicationContext());
	}

	//Sapient generated method id: ${09b1b803-de86-31c2-bf4d-87adb9044ea5}, hash: F6B71161215BC0284CF82AB38917D8B0
	@Test()
	void afterPropertiesSetWhenLoggerIsDebugEnabled() throws Exception, MalformedObjectNameException {
		/* Branches:
		 * (logger.isDebugEnabled()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class javax.management.ObjectName
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplicationAdminMXBeanRegistrar target = new SpringApplicationAdminMXBeanRegistrar("name1");

		//Act Statement(s)
		target.afterPropertiesSet();
	}

	//Sapient generated method id: ${55bedf20-e502-313f-adac-b98311a330e0}, hash: 2BC0D205A2C58FDB617468CEFF8264A2
	@Test()
	void destroyTest() throws Exception, MalformedObjectNameException {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class javax.management.ObjectName
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplicationAdminMXBeanRegistrar target = new SpringApplicationAdminMXBeanRegistrar("name1");

		//Act Statement(s)
		target.destroy();
	}
}
