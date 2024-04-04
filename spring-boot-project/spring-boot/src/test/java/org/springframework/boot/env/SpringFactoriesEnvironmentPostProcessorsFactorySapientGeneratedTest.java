package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.boot.BootstrapContext;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.boot.ConfigurableBootstrapContext;

import org.mockito.MockedStatic;

import org.springframework.boot.logging.DeferredLogFactory;

import java.util.ArrayList;

import org.springframework.boot.BootstrapRegistry;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringFactoriesEnvironmentPostProcessorsFactorySapientGeneratedTest {

	private final SpringFactoriesLoader loaderMock = mock(SpringFactoriesLoader.class, "loader");

	//Sapient generated method id: ${12688756-c3ba-301b-928b-5d81f13420fd}, hash: 79CBCB6CE6CC0664DBD4A987A200C6DD
	@Test()
	void getEnvironmentPostProcessorsTest() {
		//Arrange Statement(s)
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);
		DeferredLogFactory deferredLogFactoryMock = mock(DeferredLogFactory.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);
		ConfigurableBootstrapContext configurableBootstrapContextMock = mock(ConfigurableBootstrapContext.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock3 = mock(SpringFactoriesLoader.ArgumentResolver.class);
		SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock4 = mock(SpringFactoriesLoader.ArgumentResolver.class);
		try (MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class)) {
			springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(DeferredLogFactory.class, deferredLogFactoryMock)).thenReturn(springFactoriesLoaderArgumentResolverMock);
			doReturn(springFactoriesLoaderArgumentResolverMock2).when(springFactoriesLoaderArgumentResolverMock).and(ConfigurableBootstrapContext.class, configurableBootstrapContextMock);
			doReturn(springFactoriesLoaderArgumentResolverMock3).when(springFactoriesLoaderArgumentResolverMock2).and(BootstrapContext.class, configurableBootstrapContextMock);
			doReturn(springFactoriesLoaderArgumentResolverMock4).when(springFactoriesLoaderArgumentResolverMock3).and(BootstrapRegistry.class, configurableBootstrapContextMock);
			SpringFactoriesEnvironmentPostProcessorsFactory target = new SpringFactoriesEnvironmentPostProcessorsFactory(loaderMock);
			List<EnvironmentPostProcessor> environmentPostProcessorList = new ArrayList<>();
			doReturn(environmentPostProcessorList).when(loaderMock).load(EnvironmentPostProcessor.class, springFactoriesLoaderArgumentResolverMock4);
			//Act Statement(s)
			List<EnvironmentPostProcessor> result = target.getEnvironmentPostProcessors(deferredLogFactoryMock, configurableBootstrapContextMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(environmentPostProcessorList));
				springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(DeferredLogFactory.class, deferredLogFactoryMock), atLeast(1));
				verify(springFactoriesLoaderArgumentResolverMock).and(ConfigurableBootstrapContext.class, configurableBootstrapContextMock);
				verify(springFactoriesLoaderArgumentResolverMock2).and(BootstrapContext.class, configurableBootstrapContextMock);
				verify(springFactoriesLoaderArgumentResolverMock3).and(BootstrapRegistry.class, configurableBootstrapContextMock);
				verify(loaderMock).load(EnvironmentPostProcessor.class, springFactoriesLoaderArgumentResolverMock4);
			});
		}
	}
}
