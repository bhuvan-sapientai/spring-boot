package org.springframework.boot.type.classreading;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.type.classreading.MetadataReader;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConcurrentReferenceCachingMetadataReaderFactorySapientGeneratedTest {

    private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class, "resourceLoader");

    private final Resource resourceMock = mock(Resource.class);

    //Sapient generated method id: ${getMetadataReader1WhenMetadataReaderIsNull}, hash: 5E011A1BC72DC4F389BF6822561C7827
    @Test()
    void getMetadataReader1WhenMetadataReaderIsNull() throws IOException {
        /* Branches:
         * (metadataReader == null) : true
         */
        //Arrange Statement(s)
        ConcurrentReferenceCachingMetadataReaderFactory target = spy(new ConcurrentReferenceCachingMetadataReaderFactory(resourceLoaderMock));
        MetadataReader metadataReaderMock = mock(MetadataReader.class);
        doReturn(metadataReaderMock).when(target).createMetadataReader(resourceMock);
        //Act Statement(s)
        MetadataReader result = target.getMetadataReader(resourceMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(metadataReaderMock));
            verify(target).createMetadataReader(resourceMock);
        });
    }

    //Sapient generated method id: ${createMetadataReaderTest}, hash: 163133D32CA455F5C4AB970A866214A6
    @Disabled()
    @Test()
    void createMetadataReaderTest() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.springframework.core.type.classreading.SimpleMetadataReader
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConcurrentReferenceCachingMetadataReaderFactory target = new ConcurrentReferenceCachingMetadataReaderFactory(resourceLoaderMock);
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        doReturn(classLoader).when(resourceLoaderMock).getClassLoader();
        //Act Statement(s)
        MetadataReader result = target.createMetadataReader(resourceMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(resourceLoaderMock).getClassLoader();
        });
    }

    //Sapient generated method id: ${clearCacheTest}, hash: CDDABAAD269AD3F565CD75D1394ED025
    @Test()
    void clearCacheTest() {
        //Arrange Statement(s)
        ConcurrentReferenceCachingMetadataReaderFactory target = new ConcurrentReferenceCachingMetadataReaderFactory(resourceLoaderMock);
        //Act Statement(s)
        target.clearCache();
    }
}
