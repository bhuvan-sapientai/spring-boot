package org.springframework.boot.context.properties.bind.handler;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.boot.context.properties.bind.BindContext;
import org.springframework.util.Assert;
import org.springframework.boot.context.properties.bind.Bindable;

import org.mockito.MockedStatic;

import org.springframework.boot.context.properties.bind.BindHandler;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class IgnoreErrorsBindHandlerSapientGeneratedTest {

	private final BindContext bindContextMock = mock(BindContext.class);

	private final BindHandler bindHandlerMock = mock(BindHandler.class);

	//Sapient generated method id: ${57ee638d-d52e-33c5-a86e-20fbc238e620}, hash: 30BFE6EF26C37CCEFC5D926F88DCCD06
	@Test()
	void onFailureWhenTargetGetValueIsNotNull() throws Exception {
		/* Branches:
		 * (target.getValue() != null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(bindHandlerMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			IgnoreErrorsBindHandler target = new IgnoreErrorsBindHandler(bindHandlerMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("onFailure_configurationPropertyName1-name1");
			Object object = new Object();
			Bindable bindable = Bindable.ofInstance(object);
			Exception exception = new Exception();
			//Act Statement(s)
			Object result = target.onFailure(configurationPropertyName, bindable, bindContextMock, exception);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(bindHandlerMock, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a055160a-1f84-37f3-b574-95d5d285d1bc}, hash: 22C499E7F3DE38E6EA45057F53750CB9
	@Test()
	void onFailureWhenTargetGetValueIsNull() throws Exception {
		/* Branches:
		 * (target.getValue() != null) : false
		 */
		//Arrange Statement(s)
		Bindable<?> targetMock = mock(Bindable.class);
		ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(null).when(targetMock).getValue();
			_assert.when(() -> Assert.notNull(bindHandlerMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			IgnoreErrorsBindHandler target = new IgnoreErrorsBindHandler(bindHandlerMock);
			Exception exception = new Exception();
			//Act Statement(s)
			Object result = target.onFailure(configurationPropertyNameMock, targetMock, bindContextMock, exception);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(targetMock).getValue();
				_assert.verify(() -> Assert.notNull(bindHandlerMock, "Parent must not be null"), atLeast(1));
			});
		}
	}
}
