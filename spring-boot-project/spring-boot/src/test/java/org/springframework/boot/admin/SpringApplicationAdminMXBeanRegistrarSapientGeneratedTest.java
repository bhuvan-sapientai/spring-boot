package org.springframework.boot.admin;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.BeansException;

import javax.management.MalformedObjectNameException;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.core.ResolvableType;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringApplicationAdminMXBeanRegistrarSapientGeneratedTest {

	private final ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);

	private final ResolvableType eventTypeMock = mock(ResolvableType.class);

	//Sapient generated method id: ${8965c77a-005e-3a50-b8bb-0a78bd407600}
	@Disabled()
	@Test()
	void setApplicationContextTest() throws BeansException, MalformedObjectNameException {
		//Arrange Statement(s)
		SpringApplicationAdminMXBeanRegistrar target = new SpringApplicationAdminMXBeanRegistrar("name1");
		//Act Statement(s)
		target.setApplicationContext(configurableApplicationContextMock);
	}

	//Sapient generated method id: ${34811332-9f1e-3299-9053-9889102380f6}
	@Disabled()
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

	//Sapient generated method id: ${2b6ba708-ef5f-3afc-ba2e-fdd6e49c2982}
	@Disabled()
	@Test()
	void supportsEventTypeWhenWebServerInitializedEventIsAssignableFromType() throws MalformedObjectNameException {
		/* Branches:
		 * (type == null) : false
		 * (ApplicationReadyEvent.class.isAssignableFrom(type)) : false
		 * (WebServerInitializedEvent.class.isAssignableFrom(type)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

	//Sapient generated method id: ${25276624-a93b-33b7-981f-506c5ac36042}
	@Disabled()
	@Test()
	void supportsEventTypeWhenWebServerInitializedEventNotIsAssignableFromType() throws MalformedObjectNameException {
		/* Branches:
		 * (type == null) : false
		 * (ApplicationReadyEvent.class.isAssignableFrom(type)) : false
		 * (WebServerInitializedEvent.class.isAssignableFrom(type)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

	//Sapient generated method id: ${70b9b3d9-c047-3af9-8d3a-f4dd5a0efcb0}
	@Disabled()
	@Test()
	void supportsSourceTypeTest() throws MalformedObjectNameException {
		//Arrange Statement(s)
		SpringApplicationAdminMXBeanRegistrar target = new SpringApplicationAdminMXBeanRegistrar("name1");
		//Act Statement(s)
		boolean result = target.supportsSourceType(Object.class);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${baad31e7-bd13-34f7-b6c5-965196e7d669}
	@Disabled()
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

	//Sapient generated method id: ${313fc74a-87c2-3f00-8f44-e20b5061874e}
	@Disabled()
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

	//Sapient generated method id: ${4333ca59-f65f-3c9a-8f2b-ce3fb89303fc}
	@Disabled()
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

	//Sapient generated method id: ${120c298f-acf8-370b-b520-c705c08070c5}
	@Disabled()
	@Test()
	void onWebServerInitializedEventWhenThisApplicationContextEqualsEventGetApplicationContext() throws MalformedObjectNameException {
		/* Branches:
		 * (this.applicationContext.equals(event.getApplicationContext())) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

	//Sapient generated method id: ${09b1b803-de86-31c2-bf4d-87adb9044ea5}
	@Disabled()
	@Test()
	void afterPropertiesSetWhenLoggerIsDebugEnabled() throws Exception, MalformedObjectNameException {
		/* Branches:
		 * (logger.isDebugEnabled()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplicationAdminMXBeanRegistrar target = new SpringApplicationAdminMXBeanRegistrar("name1");
		//Act Statement(s)
		target.afterPropertiesSet();
	}

	//Sapient generated method id: ${55bedf20-e502-313f-adac-b98311a330e0}
	@Disabled()
	@Test()
	void destroyTest() throws Exception, MalformedObjectNameException {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringApplicationAdminMXBeanRegistrar target = new SpringApplicationAdminMXBeanRegistrar("name1");
		//Act Statement(s)
		target.destroy();
	}
}
