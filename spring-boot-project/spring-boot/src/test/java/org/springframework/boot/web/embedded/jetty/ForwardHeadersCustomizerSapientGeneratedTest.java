package org.springframework.boot.web.embedded.jetty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import org.eclipse.jetty.server.ConnectionFactory;
import org.eclipse.jetty.server.Connector;

import java.util.ArrayList;

import org.eclipse.jetty.server.Server;

import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ForwardHeadersCustomizerSapientGeneratedTest {

	//Sapient generated method id: ${c10efb65-3e4e-3fa4-8e45-cc67c522ebbf}, hash: 50DD05225BC327431C8D33BA832524F7
	@Test()
	void customizeWhenConnectionFactoryNotInstanceOfHttpConfigurationConnectionFactory() {
		/* Branches:
		 * (for-each(server.getConnectors())) : true
		 * (for-each(connector.getConnectionFactories())) : true
		 * (connectionFactory instanceof HttpConfiguration.ConnectionFactory) : false
		 */
		//Arrange Statement(s)
		Server serverMock = mock(Server.class);
		Connector connectorMock = mock(Connector.class);
		Connector[] connectorArray = new Connector[] { connectorMock };
		doReturn(connectorArray).when(serverMock).getConnectors();
		ConnectionFactory connectionFactoryMock = mock(ConnectionFactory.class);
		Collection<ConnectionFactory> collection = new ArrayList<>();
		collection.add(connectionFactoryMock);
		doReturn(collection).when(connectorMock).getConnectionFactories();
		ForwardHeadersCustomizer target = new ForwardHeadersCustomizer();

		//Act Statement(s)
		target.customize(serverMock);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(serverMock).getConnectors();
			verify(connectorMock).getConnectionFactories();
		});
	}
}
