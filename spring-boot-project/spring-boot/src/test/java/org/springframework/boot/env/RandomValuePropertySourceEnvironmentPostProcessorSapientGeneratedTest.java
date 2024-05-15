package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.core.env.ConfigurableEnvironment;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import org.apache.commons.logging.impl.NoOpLog;
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

    //Sapient generated method id: ${postProcessEnvironmentTest}, hash: 7CE607943A4185C9BCF2A1325C1E93D2
    @Test()
    void postProcessEnvironmentTest() {
        //Arrange Statement(s)
        DeferredLogFactory logFactoryMock = mock(DeferredLogFactory.class);
        ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
        SpringApplication springApplicationMock = mock(SpringApplication.class);
        try (MockedStatic<RandomValuePropertySource> randomValuePropertySource = mockStatic(RandomValuePropertySource.class)) {
            NoOpLog noOpLog = new NoOpLog();
            doReturn(noOpLog).when(logFactoryMock).getLog(RandomValuePropertySourceEnvironmentPostProcessor.class);
            randomValuePropertySource.when(() -> RandomValuePropertySource.addToEnvironment(configurableEnvironmentMock, noOpLog)).thenAnswer((Answer<Void>) invocation -> null);
            RandomValuePropertySourceEnvironmentPostProcessor target = new RandomValuePropertySourceEnvironmentPostProcessor(logFactoryMock);
            //Act Statement(s)
            target.postProcessEnvironment(configurableEnvironmentMock, springApplicationMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(logFactoryMock).getLog(RandomValuePropertySourceEnvironmentPostProcessor.class);
                randomValuePropertySource.verify(() -> RandomValuePropertySource.addToEnvironment(configurableEnvironmentMock, noOpLog), atLeast(1));
            });
        }
    }
}
