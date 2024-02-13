package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.boot.origin.Origin;

import org.mockito.MockitoAnnotations;

import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.util.function.Consumer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BoundPropertiesTrackingBindHandlerSapientGeneratedTest {

	private final BindHandler parentMock = mock(BindHandler.class, "parent");

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private BoundPropertiesTrackingBindHandler target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${16f9706f-ab77-3149-a783-73708e126a86}
	@Disabled()
	@Test()
	void onSuccessWhenNameEqualsContextGetConfigurationPropertyGetName() {
		/* Branches:
		 * (context.getConfigurationProperty() != null) : true
		 * (name.equals(context.getConfigurationProperty().getName())) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		BindContext contextMock = mock(BindContext.class);
		ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);
		ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);
		Origin originMock = mock(Origin.class);
		ConfigurationProperty configurationPropertyMock2 = mock(ConfigurationProperty.class);
		Bindable<?> bindableMock = mock(Bindable.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, object, originMock);
			doReturn(configurationPropertyMock, configurationProperty, configurationPropertyMock2).when(contextMock).getConfigurationProperty();
			_assert.when(() -> Assert.notNull((Consumer) null, "Consumer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			target = new BoundPropertiesTrackingBindHandler((Consumer) null);
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			Object object3 = new Object();
			Object object2 = parentMock.onSuccess(configurationPropertyNameMock, bindableMock, contextMock, object3);
			doReturn(object2).when(parentMock).onSuccess(configurationPropertyNameMock, bindableMock, contextMock, object3);
			//Act Statement(s)
			Object result = target.onSuccess(configurationPropertyNameMock, bindableMock, contextMock, object3);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object2));
				verify(contextMock, times(3)).getConfigurationProperty();
				_assert.verify(() -> Assert.notNull((Consumer) null, "Consumer must not be null"), atLeast(1));
				verify(parentMock, atLeast(1)).onSuccess(configurationPropertyNameMock, bindableMock, contextMock, object3);
			});
		}
	}
}
