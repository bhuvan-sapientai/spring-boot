package org.springframework.boot.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.context.ConfigurableApplicationContext;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationWarningsApplicationContextInitializerSapientGeneratedTest {

	//Sapient generated method id: ${6900b201-d101-33a9-a69b-7a761e98aa93}, hash: 4E0AECC097681528402C70339A517F3B
	@Test()
	void initializeTest() {
		//Arrange Statement(s)
		ConfigurableApplicationContext contextMock = mock(ConfigurableApplicationContext.class);
		doNothing().when(contextMock).addBeanFactoryPostProcessor((ConfigurationWarningsApplicationContextInitializer.ConfigurationWarningsPostProcessor) any());
		ConfigurationWarningsApplicationContextInitializer target = spy(new ConfigurationWarningsApplicationContextInitializer());
		ConfigurationWarningsApplicationContextInitializer.Check[] checkArray = new ConfigurationWarningsApplicationContextInitializer.Check[] {};
		doReturn(checkArray).when(target).getChecks();

		//Act Statement(s)
		target.initialize(contextMock);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(contextMock).addBeanFactoryPostProcessor((ConfigurationWarningsApplicationContextInitializer.ConfigurationWarningsPostProcessor) any());
			verify(target).getChecks();
		});
	}

	//Sapient generated method id: ${ad008f60-d535-3494-abc5-28e276736026}, hash: 8A45E1F0B01EB671759BEC3B49C5009E
	@Test()
	void getChecksTest() {
		//Arrange Statement(s)
		ConfigurationWarningsApplicationContextInitializer target = new ConfigurationWarningsApplicationContextInitializer();

		//Act Statement(s)
		ConfigurationWarningsApplicationContextInitializer.Check[] result = target.getChecks();
		ConfigurationWarningsApplicationContextInitializer.ComponentScanPackageCheck configurationWarningsApplicationContextInitializerComponentScanPackageCheck = new ConfigurationWarningsApplicationContextInitializer.ComponentScanPackageCheck();
		ConfigurationWarningsApplicationContextInitializer.Check[] checkResultArray = new ConfigurationWarningsApplicationContextInitializer.Check[] { configurationWarningsApplicationContextInitializerComponentScanPackageCheck };

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(checkResultArray)));
	}
}
