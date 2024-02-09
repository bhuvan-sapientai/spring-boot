package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import io.undertow.server.handlers.resource.Resource;
import io.undertow.server.handlers.resource.ResourceChangeListener;
import io.undertow.server.handlers.resource.ResourceManager;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CompositeResourceManagerSapientGeneratedTest {

	private final ResourceChangeListener resourceChangeListenerMock = mock(ResourceChangeListener.class);

	private final ResourceManager resourceManagerMock = mock(ResourceManager.class);

	//Sapient generated method id: ${c52aa977-fb11-357b-afa4-9df9417cdbd7}
	@Test()
	void closeWhenThisResourceManagersIsNotEmpty() throws IOException {
		/* Branches:
		 * (for-each(this.resourceManagers)) : true
		 */
		//Arrange Statement(s)
		doNothing().when(resourceManagerMock).close();
		ResourceManager[] resourceManagerArray = new ResourceManager[] { resourceManagerMock };
		CompositeResourceManager target = new CompositeResourceManager(resourceManagerArray);
		//Act Statement(s)
		target.close();
		//Assert statement(s)
		assertAll("result", () -> verify(resourceManagerMock).close());
	}

	//Sapient generated method id: ${f0153368-b7ac-396a-8c84-2fa7b3ea8f04}
	@Test()
	void getResourceWhenResourceIsNotNull() throws IOException {
		/* Branches:
		 * (for-each(this.resourceManagers)) : true
		 * (resource != null) : true
		 */
		//Arrange Statement(s)
		Resource resourceMock = mock(Resource.class);
		doReturn(resourceMock).when(resourceManagerMock).getResource("path1");
		ResourceManager[] resourceManagerArray = new ResourceManager[] { resourceManagerMock };
		CompositeResourceManager target = new CompositeResourceManager(resourceManagerArray);
		//Act Statement(s)
		Resource result = target.getResource("path1");
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(resourceMock));
			verify(resourceManagerMock).getResource("path1");
		});
	}

	//Sapient generated method id: ${c6f5b4b8-67e1-3fff-ad08-2079394b3dba}
	@Test()
	void getResourceWhenResourceIsNull() throws IOException {
		/* Branches:
		 * (for-each(this.resourceManagers)) : true
		 * (resource != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(null).when(resourceManagerMock).getResource("path1");
		ResourceManager[] resourceManagerArray = new ResourceManager[] { resourceManagerMock };
		CompositeResourceManager target = new CompositeResourceManager(resourceManagerArray);
		//Act Statement(s)
		Resource result = target.getResource("path1");
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(resourceManagerMock).getResource("path1");
		});
	}

	//Sapient generated method id: ${a11289fc-5808-3dc1-9486-cab3203dc79d}
	@Test()
	void isResourceChangeListenerSupportedTest() {
		//Arrange Statement(s)
		ResourceManager[] resourceManagerArray = new ResourceManager[] {};
		CompositeResourceManager target = new CompositeResourceManager(resourceManagerArray);
		//Act Statement(s)
		boolean result = target.isResourceChangeListenerSupported();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${2636b3f1-a5b4-3b50-a630-de20e5024e81}
	@Test()
	void registerResourceChangeListenerThrowsIllegalArgumentException() {
		//Arrange Statement(s)
		ResourceManager[] resourceManagerArray = new ResourceManager[] {};
		CompositeResourceManager target = new CompositeResourceManager(resourceManagerArray);
		//Act Statement(s)
		final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
			target.registerResourceChangeListener(resourceChangeListenerMock);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${cd7bd26f-5fe4-38b0-97da-e84ed1fe469a}
	@Test()
	void removeResourceChangeListenerThrowsIllegalArgumentException() {
		//Arrange Statement(s)
		ResourceManager[] resourceManagerArray = new ResourceManager[] {};
		CompositeResourceManager target = new CompositeResourceManager(resourceManagerArray);
		//Act Statement(s)
		final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
			target.removeResourceChangeListener(resourceChangeListenerMock);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
