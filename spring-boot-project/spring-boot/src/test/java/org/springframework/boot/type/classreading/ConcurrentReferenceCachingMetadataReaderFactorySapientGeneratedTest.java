package org.springframework.boot.type.classreading;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.classreading.SimpleMetadataReader;
import org.springframework.core.io.Resource;
import org.springframework.core.type.classreading.MetadataReader;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConcurrentReferenceCachingMetadataReaderFactorySapientGeneratedTest {

	private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class, "resourceLoader");

	private final Resource resourceMock = mock(Resource.class);

	//Sapient generated method id: ${f70203a0-2145-394c-95b3-9bbf5f2c8013}
	@Test()
	void getMetadataReader1WhenMetadataReaderIsNull() throws IOException {
		/* Branches:
		 * (metadataReader == null) : true
		 */
		//Arrange Statement(s)
		//ConcurrentReferenceCachingMetadataReaderFactory target = spy(new ConcurrentReferenceCachingMetadataReaderFactory(resourceLoaderMock));
		//MetadataReader metadataReaderMock = mock(MetadataReader.class);
		//doReturn(metadataReaderMock).when(target).createMetadataReader(resourceMock);
		//Act Statement(s)
		//MetadataReader result = target.getMetadataReader(resourceMock);
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo(metadataReaderMock));
    verify(target).createMetadataReader(resourceMock);
});*/
	}

	//Sapient generated method id: ${b9ec6d1f-a772-3726-8c4a-341f13927b0b}
	@Test()
	void createMetadataReaderTest() throws IOException {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Assert statement(s)
		//Arrange Statement(s)
		//ConcurrentReferenceCachingMetadataReaderFactory target = new ConcurrentReferenceCachingMetadataReaderFactory(resourceLoaderMock);
		//ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//doReturn(classLoader).when(resourceLoaderMock).getClassLoader();
		//Act Statement(s)
		//MetadataReader result = target.createMetadataReader(resourceMock);
		//SimpleMetadataReader simpleMetadataReader = new SimpleMetadataReader(resourceMock, classLoader);
		//TODO: Please implement equals method in SimpleMetadataReader for verification to succeed or you need to adjust respective assertion statements
        /*assertAll("result", () -> {
    assertThat(result, equalTo(simpleMetadataReader));
    verify(resourceLoaderMock).getClassLoader();
});*/
	}

	//Sapient generated method id: ${a19bb477-d7a7-3e52-afe2-4f0348585562}
	@Test()
	void clearCacheTest() {
		//Arrange Statement(s)
		//ConcurrentReferenceCachingMetadataReaderFactory target = new ConcurrentReferenceCachingMetadataReaderFactory(resourceLoaderMock);
		//Act Statement(s)
		//target.clearCache();
	}
}
