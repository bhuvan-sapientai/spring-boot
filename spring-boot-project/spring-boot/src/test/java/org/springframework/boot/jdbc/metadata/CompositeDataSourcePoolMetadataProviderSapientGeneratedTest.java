package org.springframework.boot.jdbc.metadata;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import javax.sql.DataSource;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CompositeDataSourcePoolMetadataProviderSapientGeneratedTest {

	//Sapient generated method id: ${2fe3127a-801a-36dd-96bd-a3dc447b1f93}
	@Test()
	void getDataSourcePoolMetadataWhenThisProvidersIsEmpty() {
		/* Branches:
		 * (for-each(this.providers)) : false
		 */
		//Arrange Statement(s)
		Collection<DataSourcePoolMetadataProvider> collection = new ArrayList<>();
		CompositeDataSourcePoolMetadataProvider target = new CompositeDataSourcePoolMetadataProvider(collection);
		//TODO: Needs initialization with real value
		DataSource dataSource = null;
		//Act Statement(s)
		DataSourcePoolMetadata result = target.getDataSourcePoolMetadata(dataSource);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}
}
