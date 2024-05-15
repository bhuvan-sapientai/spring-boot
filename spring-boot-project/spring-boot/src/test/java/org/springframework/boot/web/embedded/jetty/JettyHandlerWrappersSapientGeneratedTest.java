package org.springframework.boot.web.embedded.jetty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.util.unit.DataSize;
import org.eclipse.jetty.server.Handler;
import org.springframework.boot.web.server.Compression;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JettyHandlerWrappersSapientGeneratedTest {

    //Sapient generated method id: ${createGzipHandlerWrapperWhenHttpMethodValuesIsNotEmpty}, hash: B4EE0FF2D9DE2332DB41BAA88ADC7DEB
    @Test()
    void createGzipHandlerWrapperWhenHttpMethodValuesIsNotEmpty() {
        /* Branches:
         * (for-each(HttpMethod.values())) : true
         */
         //Arrange Statement(s)
        DataSize dataSizeMock = mock(DataSize.class);
        doReturn(1L).when(dataSizeMock).toBytes();
        String[] stringArray = new String[] {};
        Compression compression = new Compression();
        compression.setMinResponseSize(dataSizeMock);
        compression.setMimeTypes(stringArray);
        
        //Act Statement(s)
        Handler.Wrapper result = JettyHandlerWrappers.createGzipHandlerWrapper(compression);
        
        //Assert statement(s)
        //TODO: Please implement equals method in GzipHandler for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(dataSizeMock).toBytes();
        });
    }

    //Sapient generated method id: ${createServerHeaderHandlerWrapperTest}, hash: 267D5CF3426DBEC4D5B8BD881BDCB9DC
    @Test()
    void createServerHeaderHandlerWrapperTest() {
        
        //Act Statement(s)
        Handler.Wrapper result = JettyHandlerWrappers.createServerHeaderHandlerWrapper("header1");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
