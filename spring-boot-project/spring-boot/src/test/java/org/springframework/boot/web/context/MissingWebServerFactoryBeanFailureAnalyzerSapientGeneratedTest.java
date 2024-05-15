package org.springframework.boot.web.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.WebApplicationType;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MissingWebServerFactoryBeanFailureAnalyzerSapientGeneratedTest {

    //Sapient generated method id: ${analyze2Test}, hash: 5B51DBD13C2A3CAF517CB7CEA984C13C
    @Test()
    void analyze2Test() {
        //Arrange Statement(s)
        MissingWebServerFactoryBeanException causeMock = mock(MissingWebServerFactoryBeanException.class);
        doReturn(Object.class).when(causeMock).getBeanType();
        doReturn(WebApplicationType.NONE).when(causeMock).getWebApplicationType();
        MissingWebServerFactoryBeanFailureAnalyzer target = new MissingWebServerFactoryBeanFailureAnalyzer();
        Throwable throwable = new Throwable();
        
        //Act Statement(s)
        FailureAnalysis result = target.analyze(throwable, causeMock);
        
        //Assert statement(s)
        //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(causeMock, atLeast(1)).getBeanType();
            verify(causeMock, atLeast(1)).getWebApplicationType();
        });
    }
}
