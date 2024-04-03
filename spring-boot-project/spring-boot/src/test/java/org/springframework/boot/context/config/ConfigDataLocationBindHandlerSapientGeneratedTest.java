package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.boot.context.properties.bind.BindContext;

import org.mockito.stubbing.Answer;

import org.springframework.boot.origin.Origin;
import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.util.Assert;
import org.springframework.boot.context.properties.bind.Bindable;

import org.mockito.MockedStatic;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.boot.context.properties.bind.BindHandler;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataLocationBindHandlerSapientGeneratedTest {

	private final BindContext bindContextMock = mock(BindContext.class);

	private final Bindable<?> bindableMock = mock(Bindable.class);

	private final ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class);

	private final ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final BindContext contextMock = mock(BindContext.class);

	private final Origin originMock = mock(Origin.class);

	private final ConfigDataLocation resultMock = mock(ConfigDataLocation.class);

	//Sapient generated method id: ${6eedb967-f586-3173-b97a-0d19567e5214}, hash: 9939C6C201BF6FEA622B5A6BFD1807F4
	@Test()
	void onSuccessWhenResultGetOriginIsNotNull() {
		/* Branches:
		 * (result instanceof ConfigDataLocation location) : true
		 * (result.getOrigin() != null) : true  #  inside withOrigin method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(originMock).when(resultMock).getOrigin();
			BindHandler bindHandler = BindHandler.DEFAULT;
			_assert.when(() -> Assert.notNull(bindHandler, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigDataLocationBindHandler target = new ConfigDataLocationBindHandler();
			//Act Statement(s)
			Object result = target.onSuccess(configurationPropertyNameMock, bindableMock, bindContextMock, resultMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(resultMock));
				verify(resultMock, atLeast(1)).getOrigin();
				_assert.verify(() -> Assert.notNull(bindHandler, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c1747cdb-cfa5-3814-9b27-1c2705e19c83}, hash: 29D5FEC7FC06844D9C0E613B0CA4ADE2
	@Test()
	void onSuccessWhenResultGetOriginIsNull() {
		/* Branches:
		 * (result instanceof ConfigDataLocation location) : true
		 * (result.getOrigin() != null) : false  #  inside withOrigin method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Origin> origin = mockStatic(Origin.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(configurationPropertyMock).when(contextMock).getConfigurationProperty();
			doReturn(null).when(resultMock).getOrigin();
			doReturn(configDataLocationMock).when(resultMock).withOrigin(originMock);
			BindHandler bindHandler = BindHandler.DEFAULT;
			_assert.when(() -> Assert.notNull(bindHandler, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			origin.when(() -> Origin.from(configurationPropertyMock)).thenReturn(originMock);
			ConfigDataLocationBindHandler target = new ConfigDataLocationBindHandler();
			//Act Statement(s)
			Object result = target.onSuccess(configurationPropertyNameMock, bindableMock, contextMock, resultMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configDataLocationMock));
				verify(contextMock).getConfigurationProperty();
				verify(resultMock).getOrigin();
				verify(resultMock).withOrigin(originMock);
				_assert.verify(() -> Assert.notNull(bindHandler, "Parent must not be null"), atLeast(1));
				origin.verify(() -> Origin.from(configurationPropertyMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${479edc22-1303-388d-815e-7e24e9773547}, hash: 2307B4F7F54976B351BB61CAD01604F7
	@Test()
	void onSuccessWhenElementNotInstanceOfConfigDataLocation() {
		/* Branches:
		 * (result instanceof ConfigDataLocation location) : false
		 * (result instanceof List<?> list) : true
		 * (element instanceof ConfigDataLocation location) : false  #  inside lambda$onSuccess$0 method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			BindHandler bindHandler = BindHandler.DEFAULT;
			_assert.when(() -> Assert.notNull(bindHandler, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigDataLocationBindHandler target = new ConfigDataLocationBindHandler();
			Object object = new Object();
			List<Object> anyList = new ArrayList<>();
			anyList.add(object);
			//Act Statement(s)
			Object result = target.onSuccess(configurationPropertyNameMock, bindableMock, bindContextMock, anyList);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(bindHandler, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${28dab3de-a044-3f7b-ae11-f48f4b19735f}, hash: 3F6B3C1579EDFAF116A45FCAB4378F3C
	@Test()
	void onSuccessWhenResultInstanceOfConfigDataLocationArray() {
		/* Branches:
		 * (result instanceof ConfigDataLocation location) : false
		 * (result instanceof List<?> list) : false
		 * (result instanceof ConfigDataLocation[] unfilteredLocations) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			BindHandler bindHandler = BindHandler.DEFAULT;
			_assert.when(() -> Assert.notNull(bindHandler, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigDataLocationBindHandler target = new ConfigDataLocationBindHandler();
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			//Act Statement(s)
			Object result = target.onSuccess(configurationPropertyNameMock, bindableMock, bindContextMock, configDataLocationArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(bindHandler, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${976e011e-2dfb-32a6-aad0-08e064c5bcb1}, hash: 82858262BDBAC1677DC682DEE6AC4E96
	@Test()
	void onSuccessWhenResultNotInstanceOfConfigDataLocationArray() {
		/* Branches:
		 * (result instanceof ConfigDataLocation location) : false
		 * (result instanceof List<?> list) : false
		 * (result instanceof ConfigDataLocation[] unfilteredLocations) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			BindHandler bindHandler = BindHandler.DEFAULT;
			_assert.when(() -> Assert.notNull(bindHandler, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigDataLocationBindHandler target = new ConfigDataLocationBindHandler();
			Object object = new Object();
			//Act Statement(s)
			Object result = target.onSuccess(configurationPropertyNameMock, bindableMock, bindContextMock, object);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object));
				_assert.verify(() -> Assert.notNull(bindHandler, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f33e4889-ecfa-3a4c-b9fc-4faa32df4ab3}, hash: 585450BA4E13CAC0166F339734287242
	@Test()
	void onSuccessWhenElementInstanceOfConfigDataLocationAndResultGetOriginIsNotNull() {
		/* Branches:
		 * (result instanceof ConfigDataLocation location) : false
		 * (result instanceof List<?> list) : true
		 * (element instanceof ConfigDataLocation location) : true  #  inside lambda$onSuccess$0 method
		 * (result.getOrigin() != null) : true  #  inside withOrigin method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(originMock).when(resultMock).getOrigin();
			BindHandler bindHandler = BindHandler.DEFAULT;
			_assert.when(() -> Assert.notNull(bindHandler, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigDataLocationBindHandler target = new ConfigDataLocationBindHandler();
			List<Object> anyList = new ArrayList<>();
			anyList.add(resultMock);
			//Act Statement(s)
			Object result = target.onSuccess(configurationPropertyNameMock, bindableMock, bindContextMock, anyList);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(resultMock, atLeast(1)).getOrigin();
				_assert.verify(() -> Assert.notNull(bindHandler, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${62f5beb5-b5bd-34dd-a481-891b92eaa275}, hash: F8AF05772D90527BAB7178BD601C6634
	@Test()
	void onSuccessWhenElementInstanceOfConfigDataLocationAndResultGetOriginIsNull() {
		/* Branches:
		 * (result instanceof ConfigDataLocation location) : false
		 * (result instanceof List<?> list) : true
		 * (element instanceof ConfigDataLocation location) : true  #  inside lambda$onSuccess$0 method
		 * (result.getOrigin() != null) : false  #  inside withOrigin method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Origin> origin = mockStatic(Origin.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(configurationPropertyMock).when(contextMock).getConfigurationProperty();
			doReturn(null).when(resultMock).getOrigin();
			doReturn(configDataLocationMock).when(resultMock).withOrigin(originMock);
			BindHandler bindHandler = BindHandler.DEFAULT;
			_assert.when(() -> Assert.notNull(bindHandler, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			origin.when(() -> Origin.from(configurationPropertyMock)).thenReturn(originMock);
			ConfigDataLocationBindHandler target = new ConfigDataLocationBindHandler();
			List<Object> anyList = new ArrayList<>();
			anyList.add(resultMock);
			//Act Statement(s)
			Object result = target.onSuccess(configurationPropertyNameMock, bindableMock, contextMock, anyList);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(contextMock).getConfigurationProperty();
				verify(resultMock).getOrigin();
				verify(resultMock).withOrigin(originMock);
				_assert.verify(() -> Assert.notNull(bindHandler, "Parent must not be null"), atLeast(1));
				origin.verify(() -> Origin.from(configurationPropertyMock), atLeast(1));
			});
		}
	}
}
