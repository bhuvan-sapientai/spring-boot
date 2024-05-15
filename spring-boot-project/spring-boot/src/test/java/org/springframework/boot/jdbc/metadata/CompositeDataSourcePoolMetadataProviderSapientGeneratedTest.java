package org.springframework.boot.jdbc.metadata;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import javax.sql.DataSource;
import java.util.ArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CompositeDataSourcePoolMetadataProviderSapientGeneratedTest {

    //Sapient generated method id: ${getDataSourcePoolMetadataWhenThisProvidersIsEmpty}, hash: F3C034724BCF1004756B2538B2E3D159
    @Test()
    void getDataSourcePoolMetadataWhenThisProvidersIsEmpty() {
        /* Branches:
         * (for-each(this.providers)) : false
         */
         //Arrange Statement(s)
        Collection<DataSourcePoolMetadataProvider> collection = new ArrayList<>();
        CompositeDataSourcePoolMetadataProvider target = new CompositeDataSourcePoolMetadataProvider(collection);
        DataSource dataSourceMock = mock(DataSource.class);
        
        //Act Statement(s)
        DataSourcePoolMetadata result = target.getDataSourcePoolMetadata(dataSourceMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }
}
