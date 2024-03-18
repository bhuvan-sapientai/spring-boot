package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.coyote.http11.AbstractHttp11Protocol;

import org.springframework.util.unit.DataSize;
import org.springframework.boot.web.server.Compression;

import org.apache.catalina.connector.Connector;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CompressionConnectorCustomizerSapientGeneratedTest {

	//Sapient generated method id: ${3f29487e-8d09-3c1a-bd25-2d1aca98659f}, hash: 52D2DA193A4DD4C782BBB449586195F6
	@Test()
	void customizeWhenThisCompressionGetExcludedUserAgentsIsNotNull() {
		/* Branches:
		 * (this.compression != null) : true
		 * (this.compression.getEnabled()) : true
		 * (handler instanceof AbstractHttp11Protocol) : true
		 * (this.compression.getExcludedUserAgents() != null) : true  #  inside customize method
		 */
		//Arrange Statement(s)
		AbstractHttp11Protocol protocolMock = mock(AbstractHttp11Protocol.class);
		doNothing().when(protocolMock).setCompression("on");
		doNothing().when(protocolMock).setCompressionMinSize(0);
		doNothing().when(protocolMock).setCompressibleMimeType("");
		doNothing().when(protocolMock).setNoCompressionUserAgents("");
		DataSize dataSizeMock = mock(DataSize.class);
		doReturn(0L).when(dataSizeMock).toBytes();
		String[] stringArray = new String[] {};
		String[] stringArray2 = new String[] {};
		Compression compression = new Compression();
		compression.setMinResponseSize(dataSizeMock);
		compression.setExcludedUserAgents(stringArray);
		compression.setMimeTypes(stringArray2);
		compression.setEnabled(true);
		CompressionConnectorCustomizer target = new CompressionConnectorCustomizer(compression);
		Connector connector = new Connector(protocolMock);

		//Act Statement(s)
		target.customize(connector);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(protocolMock).setCompression("on");
			verify(protocolMock).setCompressionMinSize(0);
			verify(protocolMock).setCompressibleMimeType("");
			verify(protocolMock).setNoCompressionUserAgents("");
			verify(dataSizeMock).toBytes();
		});
	}
}
