package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;

import org.mockito.stubbing.Answer;
import org.apache.commons.logging.Log;
import org.mockito.MockedStatic;

import org.springframework.boot.logging.DeferredLogFactory;
import org.springframework.boot.SpringApplication;

import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RandomValuePropertySourceEnvironmentPostProcessorSapientGeneratedTest {

	//Sapient generated method id: ${2bf0d88c-87ae-32ff-8715-263d7bb08637}
	@Test()
	void postProcessEnvironmentTest() {
		//Arrange Statement(s)
		DeferredLogFactory logFactoryMock = mock(DeferredLogFactory.class);
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		SpringApplication springApplicationMock = mock(SpringApplication.class);
		try (MockedStatic<RandomValuePropertySource> randomValuePropertySource = mockStatic(RandomValuePropertySource.class)) {
			//TODO: Needs to return real value
			doReturn(null).when(logFactoryMock).getLog(RandomValuePropertySourceEnvironmentPostProcessor.class);
			randomValuePropertySource.when(() -> RandomValuePropertySource.addToEnvironment(configurableEnvironmentMock, (Log) null)).thenAnswer((Answer<Void>) invocation -> null);
			RandomValuePropertySourceEnvironmentPostProcessor target = new RandomValuePropertySourceEnvironmentPostProcessor(logFactoryMock);
			//Act Statement(s)
			target.postProcessEnvironment(configurableEnvironmentMock, springApplicationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(logFactoryMock).getLog(RandomValuePropertySourceEnvironmentPostProcessor.class);
				randomValuePropertySource.verify(() -> RandomValuePropertySource.addToEnvironment(configurableEnvironmentMock, (Log) null), atLeast(1));
			});
		}
	}
}
