package org.springframework.boot.r2dbc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import io.r2dbc.spi.ConnectionFactoryOptions;
import io.r2dbc.spi.Connection;
import io.r2dbc.spi.ConnectionFactoryMetadata;
import org.reactivestreams.Publisher;
import io.r2dbc.spi.ConnectionFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class OptionsCapableConnectionFactorySapientGeneratedTest {

	private final ConnectionFactory delegateMock = mock(ConnectionFactory.class, "delegate");

	private final ConnectionFactoryOptions connectionFactoryOptionsMock = mock(ConnectionFactoryOptions.class);

	//Sapient generated method id: ${2284fc3d-473b-3992-886d-8fe431bd702d}, hash: 232D80B2317DA28DED01EC63E8FF32AB
	@Test()
	void createTest() {
		//Arrange Statement(s)
		OptionsCapableConnectionFactory target = new OptionsCapableConnectionFactory(connectionFactoryOptionsMock, delegateMock);
		Publisher<Connection> publisherMock = mock(Publisher.class);
		doReturn(publisherMock).when(delegateMock).create();

		//Act Statement(s)
		Publisher<? extends Connection> result = target.create();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(publisherMock));
			verify(delegateMock).create();
		});
	}

	//Sapient generated method id: ${5bd3d451-62d1-3608-a3d6-3009dd03b48e}, hash: 7E76D5FD8D1FCA07F5D4B041009D999D
	@Test()
	void getMetadataTest() {
		//Arrange Statement(s)
		OptionsCapableConnectionFactory target = new OptionsCapableConnectionFactory(connectionFactoryOptionsMock, delegateMock);
		ConnectionFactoryMetadata connectionFactoryMetadataMock = mock(ConnectionFactoryMetadata.class);
		doReturn(connectionFactoryMetadataMock).when(delegateMock).getMetadata();

		//Act Statement(s)
		ConnectionFactoryMetadata result = target.getMetadata();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(connectionFactoryMetadataMock));
			verify(delegateMock).getMetadata();
		});
	}

	//Sapient generated method id: ${c9caae7f-b2ba-380a-8b24-210edca9aa59}, hash: 7874A0E6F7A4188CB27559B7D5473974
	@Test()
	void unwrapTest() {
		//Arrange Statement(s)
		OptionsCapableConnectionFactory target = new OptionsCapableConnectionFactory(connectionFactoryOptionsMock, delegateMock);

		//Act Statement(s)
		ConnectionFactory result = target.unwrap();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(delegateMock)));
	}

	//Sapient generated method id: ${1d9aafa3-6f25-3eab-9b01-29956e8b617c}, hash: FD341FE73AF925F4A95AB450029E3857
	@Test()
	void unwrapFromWhenConnectionFactoryInstanceOfOptionsCapableConnectionFactory() {
		/* Branches:
		 * (connectionFactory instanceof OptionsCapableConnectionFactory) : true
		 */
		//Arrange Statement(s)
		OptionsCapableConnectionFactory optionsCapableConnectionFactoryMock = mock(OptionsCapableConnectionFactory.class);

		//Act Statement(s)
		OptionsCapableConnectionFactory result = OptionsCapableConnectionFactory.unwrapFrom(optionsCapableConnectionFactoryMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(optionsCapableConnectionFactoryMock)));
	}

	//Sapient generated method id: ${87d76a9a-2c77-3a3e-b1dd-85b52ccae1f9}, hash: 2614302CA5FCBE88E585D6C581F61ADF
	@Test()
	void unwrapFromWhenConnectionFactoryNotInstanceOfWrapped() {
		/* Branches:
		 * (connectionFactory instanceof OptionsCapableConnectionFactory) : false
		 * (connectionFactory instanceof Wrapped) : false
		 */
		//Arrange Statement(s)
		ConnectionFactory connectionFactoryMock = mock(ConnectionFactory.class);

		//Act Statement(s)
		OptionsCapableConnectionFactory result = OptionsCapableConnectionFactory.unwrapFrom(connectionFactoryMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}
}
