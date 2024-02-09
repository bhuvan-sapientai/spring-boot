package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.util.Assert;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DefaultBootstrapContextSapientGeneratedTest {

	private final BootstrapRegistry.InstanceSupplier<Object> bootstrapRegistryInstanceSupplierMock = mock(BootstrapRegistry.InstanceSupplier.class);

	//Sapient generated method id: ${7e76a5e1-6ec4-32e6-bd68-c9e860660341}
	@Disabled()
	@Test()
	void registerWhenTypeGetNameNotPlus_has_already_been_created() {
		/* Branches:
		 * (replaceExisting) : true  #  inside register method
		 * (type.getName() + " has already been created") : false  #  inside register method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(Object.class, "Type must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bootstrapRegistryInstanceSupplierMock, "InstanceSupplier must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			DefaultBootstrapContext target = new DefaultBootstrapContext();
			//Act Statement(s)
			target.register(Object.class, bootstrapRegistryInstanceSupplierMock);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(Object.class, "Type must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bootstrapRegistryInstanceSupplierMock, "InstanceSupplier must not be null"), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${403cec47-d783-3f65-b37f-813f11425825}
	@Disabled()
	@Test()
	void registerIfAbsentWhenTypeGetNameNotPlus_has_already_been_created() {
		/* Branches:
		 * (replaceExisting) : false  #  inside register method
		 * (!alreadyRegistered) : true  #  inside register method
		 * (type.getName() + " has already been created") : false  #  inside register method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(Object.class, "Type must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(bootstrapRegistryInstanceSupplierMock, "InstanceSupplier must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			DefaultBootstrapContext target = new DefaultBootstrapContext();
			//Act Statement(s)
			target.registerIfAbsent(Object.class, bootstrapRegistryInstanceSupplierMock);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(Object.class, "Type must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(bootstrapRegistryInstanceSupplierMock, "InstanceSupplier must not be null"), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${e1267394-9f05-3468-a5c7-13571afb35a2}
	@Test()
	void isRegisteredTest() {
		//Arrange Statement(s)
		DefaultBootstrapContext target = new DefaultBootstrapContext();
		//Act Statement(s)
		boolean result = target.isRegistered(Object.class);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${6b1e53e5-e8ea-3972-93ed-db80c4db0e25}
	@Test()
	void getRegisteredInstanceSupplierTest() {
		//Arrange Statement(s)
		DefaultBootstrapContext target = new DefaultBootstrapContext();
		//Act Statement(s)
		BootstrapRegistry.InstanceSupplier result = target.getRegisteredInstanceSupplier(Object.class);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${c45260c5-09ec-3101-996f-742b4d9f2509}
	@Test()
	void addCloseListenerTest() {
		/**
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: events
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultBootstrapContext target = new DefaultBootstrapContext();
		ApplicationListener<BootstrapContextClosedEvent> applicationListenerMock = mock(ApplicationListener.class);
		//Act Statement(s)
		target.addCloseListener(applicationListenerMock);
	}

	//Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}
	@Test()
	void getTest() throws Throwable {
		//Arrange Statement(s)
		DefaultBootstrapContext target = spy(new DefaultBootstrapContext());
		Object object = new Object();
		doReturn(object).when(target).getOrElseThrow(eq(Object.class), (Supplier) any());
		//Act Statement(s)
		Object result = target.get(Object.class);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(object));
			verify(target).getOrElseThrow(eq(Object.class), (Supplier) any());
		});
	}

	//Sapient generated method id: ${dc89f727-7530-3a48-9a76-3aac5810c58a}
	@Test()
	void getOrElseTest() {
		//Arrange Statement(s)
		DefaultBootstrapContext target = spy(new DefaultBootstrapContext());
		Object object = new Object();
		doReturn(object).when(target).getOrElseSupply(eq(Object.class), (Supplier) any());
		Object object2 = new Object();
		//Act Statement(s)
		Object result = target.getOrElse(Object.class, object2);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(object));
			verify(target).getOrElseSupply(eq(Object.class), (Supplier) any());
		});
	}

	//Sapient generated method id: ${b5b6946b-0b8b-3fb0-9d85-e0b9cbd24cb2}
	@Test()
	void getOrElseSupplyWhenInstanceSupplierIsNull() {
		/* Branches:
		 * (instanceSupplier != null) : false
		 */
		//Arrange Statement(s)
		DefaultBootstrapContext target = new DefaultBootstrapContext();
		Supplier supplier = null;
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			target.getOrElseSupply(Object.class, supplier);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${09e6dfec-ee28-31a7-8bff-00559945209c}
	@Test()
	void getOrElseThrowWhenInstanceSupplierIsNullThrowsThrowable() throws Throwable {
		/* Branches:
		 * (instanceSupplier == null) : true
		 */
		//Arrange Statement(s)
		DefaultBootstrapContext target = new DefaultBootstrapContext();
		Supplier supplier = null;
		//Act Statement(s)
		final Throwable result = assertThrows(Throwable.class, () -> {
			target.getOrElseThrow(Object.class, supplier);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${4338ea80-df41-3c09-b3eb-b0476a460c1f}
	@Test()
	void closeTest() {
		/**
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: events
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DefaultBootstrapContext target = new DefaultBootstrapContext();
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		//Act Statement(s)
		target.close(configurableApplicationContextMock);
	}
}
