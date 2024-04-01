package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.boot.origin.Origin;
import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.util.function.Consumer;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BoundPropertiesTrackingBindHandlerSapientGeneratedTest {

	private final Consumer consumerMock = mock(Consumer.class, "consumer");

	//Sapient generated method id: ${16f9706f-ab77-3149-a783-73708e126a86}, hash: B708F6E174B7C6201666D582E78AF529
	@Disabled()
	@Test()
	void onSuccessWhenNameEqualsContextGetConfigurationPropertyGetName() {
		/* Branches:
		 * (context.getConfigurationProperty() != null) : true
		 * (name.equals(context.getConfigurationProperty().getName())) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: name
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		BindContext contextMock = mock(BindContext.class);
		ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);
		ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);
		Origin originMock = mock(Origin.class);
		ConfigurationProperty configurationPropertyMock2 = mock(ConfigurationProperty.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, object, originMock);
			doReturn(configurationPropertyMock, configurationProperty, configurationPropertyMock2).when(contextMock).getConfigurationProperty();
			_assert.when(() -> Assert.notNull(consumerMock, "Consumer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			BoundPropertiesTrackingBindHandler target = new BoundPropertiesTrackingBindHandler(consumerMock);
			doNothing().when(consumerMock).accept(configurationPropertyMock2);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("onSuccess_configurationPropertyName1-name1");
			Object object2 = new Object();
			Bindable bindable = Bindable.ofInstance(object2);
			Object object3 = new Object();
			//Act Statement(s)
			Object result = target.onSuccess(configurationPropertyName, bindable, contextMock, object3);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(contextMock, atLeast(3)).getConfigurationProperty();
				_assert.verify(() -> Assert.notNull(consumerMock, "Consumer must not be null"), atLeast(1));
				verify(consumerMock, atLeast(1)).accept(configurationPropertyMock2);
			});
		}
	}
}
