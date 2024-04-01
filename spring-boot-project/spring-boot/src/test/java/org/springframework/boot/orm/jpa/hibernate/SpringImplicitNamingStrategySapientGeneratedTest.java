package org.springframework.boot.orm.jpa.hibernate;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.hibernate.engine.jdbc.env.spi.IdentifierHelper;
import org.hibernate.boot.spi.MetadataBuildingContext;
import org.hibernate.boot.model.source.spi.AttributePath;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.hibernate.boot.spi.InFlightMetadataCollector;
import org.hibernate.boot.model.naming.ImplicitJoinTableNameSource;
import org.hibernate.boot.model.relational.Database;
import org.hibernate.boot.model.naming.Identifier;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringImplicitNamingStrategySapientGeneratedTest {

	//Sapient generated method id: ${0893bfcc-b478-320e-8689-9707b05bcb50}, hash: D522A5D86D813B2A7C574DB395B6A899
	@Test()
	void determineJoinTableNameTest() {
		//Arrange Statement(s)
		ImplicitJoinTableNameSource sourceMock = mock(ImplicitJoinTableNameSource.class);
		doReturn("A").when(sourceMock).getOwningPhysicalTableName();
		AttributePath attributePathMock = mock(AttributePath.class);
		AttributePath attributePath = new AttributePath(attributePathMock, "B");
		doReturn(attributePath).when(sourceMock).getAssociationOwningAttributePath();
		MetadataBuildingContext metadataBuildingContextMock = mock(MetadataBuildingContext.class);
		doReturn(metadataBuildingContextMock).when(sourceMock).getBuildingContext();
		InFlightMetadataCollector inFlightMetadataCollectorMock = mock(InFlightMetadataCollector.class);
		doReturn(inFlightMetadataCollectorMock).when(metadataBuildingContextMock).getMetadataCollector();
		Database databaseMock = mock(Database.class);
		doReturn(databaseMock).when(inFlightMetadataCollectorMock).getDatabase();
		JdbcEnvironment jdbcEnvironmentMock = mock(JdbcEnvironment.class);
		doReturn(jdbcEnvironmentMock).when(databaseMock).getJdbcEnvironment();
		IdentifierHelper identifierHelperMock = mock(IdentifierHelper.class);
		doReturn(identifierHelperMock).when(jdbcEnvironmentMock).getIdentifierHelper();
		Identifier identifierMock = mock(Identifier.class);
		doReturn(identifierMock).when(identifierHelperMock).toIdentifier("A_B");
		SpringImplicitNamingStrategy target = new SpringImplicitNamingStrategy();

		//Act Statement(s)
		Identifier result = target.determineJoinTableName(sourceMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(identifierMock));
			verify(sourceMock).getOwningPhysicalTableName();
			verify(sourceMock).getAssociationOwningAttributePath();
			verify(sourceMock).getBuildingContext();
			verify(metadataBuildingContextMock).getMetadataCollector();
			verify(inFlightMetadataCollectorMock).getDatabase();
			verify(databaseMock).getJdbcEnvironment();
			verify(jdbcEnvironmentMock).getIdentifierHelper();
			verify(identifierHelperMock).toIdentifier("A_B");
		});
	}
}
