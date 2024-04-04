package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import io.undertow.server.HttpHandler;
import io.undertow.servlet.api.DeploymentManager;

import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DeploymentManagerHttpHandlerFactorySapientGeneratedTest {

	private final DeploymentManager deploymentManagerMock = mock(DeploymentManager.class);

	//Sapient generated method id: ${12125328-09ad-3ad9-a3d7-194e6ef02de9}, hash: 24CA0B96ADEB26172D4D96DC9FBB0969
	@Test()
	void getHandlerWhenNextIsNull() {
		/* Branches:
		 * (next == null) : true
		 */
		//Arrange Statement(s)
		DeploymentManagerHttpHandlerFactory target = new DeploymentManagerHttpHandlerFactory(deploymentManagerMock);
		HttpHandler httpHandler = null;

		//Act Statement(s)
		HttpHandler result = target.getHandler(httpHandler);

		//Assert statement(s)
		//TODO: Please implement equals method in DeploymentManagerHandler for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${f54a3c50-c61c-392f-bc80-e45cb3f284ab}, hash: 02A765B6B6D09DAE5B59F08E98A4CD5D
	@Test()
	void getHandlerWhenNextIsNotNull() {
		/* Branches:
		 * (next == null) : false
		 */
		//Arrange Statement(s)
		HttpHandler httpHandlerMock = mock(HttpHandler.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(false, "DeploymentManagerHttpHandlerFactory must be first")).thenAnswer((Answer<Void>) invocation -> null);
			DeploymentManagerHttpHandlerFactory target = new DeploymentManagerHttpHandlerFactory(deploymentManagerMock);
			//Act Statement(s)
			HttpHandler result = target.getHandler(httpHandlerMock);
			//Assert statement(s)
			//TODO: Please implement equals method in DeploymentManagerHandler for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.state(false, "DeploymentManagerHttpHandlerFactory must be first"), atLeast(1));
			});
		}
	}
}
