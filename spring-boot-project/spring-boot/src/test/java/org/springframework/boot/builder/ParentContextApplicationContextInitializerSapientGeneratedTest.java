package org.springframework.boot.builder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ParentContextApplicationContextInitializerSapientGeneratedTest {

	//Sapient generated method id: ${f1cdb3aa-75b4-3cdc-be5b-8865eaa45da8}, hash: BFC4DBEA91FCBB6642797DD8B97FBA12
	@Test()
	void initializeWhenApplicationContextNotEqualsThisParent() {
		/* Branches:
		 * (applicationContext != this.parent) : true
		 */
		//Arrange Statement(s)
		//ConfigurableApplicationContext applicationContextMock = mock(ConfigurableApplicationContext.class);
		//ApplicationContext applicationContextMock2 = mock(ApplicationContext.class);
		//doNothing().when(applicationContextMock).setParent(applicationContextMock2);
		//TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
		//ParentContextApplicationContextInitializer.EventPublisher parentContextApplicationContextInitializerEventPublisherMock = mock(ParentContextApplicationContextInitializer.EventPublisher.class);
		//TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
		//doNothing().when(applicationContextMock).addApplicationListener(parentContextApplicationContextInitializerEventPublisherMock);
		//ParentContextApplicationContextInitializer target = new ParentContextApplicationContextInitializer(applicationContextMock2);
		//Act Statement(s)
		//target.initialize(applicationContextMock);
		//Assert statement(s)
		//assertAll("result", () -> {    verify(applicationContextMock).setParent(applicationContextMock2);    verify(applicationContextMock).addApplicationListener(parentContextApplicationContextInitializerEventPublisherMock);});
	}
}
