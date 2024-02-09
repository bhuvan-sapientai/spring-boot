package org.springframework.boot.web.server;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import java.net.BindException;

import org.mockito.MockedStatic;

import java.util.function.IntSupplier;
import java.util.function.Consumer;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PortInUseExceptionSapientGeneratedTest {

	//Sapient generated method id: ${eeec45fb-e3c7-3494-8faf-9684c0629800}
	@Test()
	void throwIfPortBindingExceptionTest() {
		//Arrange Statement(s)
		try (MockedStatic<PortInUseException> portInUseException = mockStatic(PortInUseException.class, CALLS_REAL_METHODS)) {
			Exception exception = new Exception();
			portInUseException.when(() -> PortInUseException.ifPortBindingException(eq(exception), (Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
			//TODO: Needs initialization with real value
			IntSupplier intSupplier = null;
			//Act Statement(s)
			PortInUseException.throwIfPortBindingException(exception, intSupplier);
			//Assert statement(s)
			assertAll("result", () -> portInUseException.verify(() -> PortInUseException.ifPortBindingException(eq(exception), (Consumer) any()), atLeast(1)));
		}
	}

	//Sapient generated method id: ${c774ab4b-e75f-350c-9e71-1a620689db7a}
	@Test()
	void ifPortBindingExceptionTest() {
		//Arrange Statement(s)
		try (MockedStatic<PortInUseException> portInUseException = mockStatic(PortInUseException.class, CALLS_REAL_METHODS)) {
			Exception exception = new Exception();
			portInUseException.when(() -> PortInUseException.ifCausedBy(eq(exception), eq(BindException.class), (Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
			//TODO: Needs initialization with real value
			Consumer consumer = null;
			//Act Statement(s)
			PortInUseException.ifPortBindingException(exception, consumer);
			//Assert statement(s)
			assertAll("result", () -> portInUseException.verify(() -> PortInUseException.ifCausedBy(eq(exception), eq(BindException.class), (Consumer) any()), atLeast(1)));
		}
	}

	//Sapient generated method id: ${55c69765-224e-3d51-88a9-f208e3e5ec97}
	@Test()
	void ifCausedByWhenCandidateIsNull() {
		/* Branches:
		 * (candidate != null) : false
		 */
		//Arrange Statement(s)
		Exception exception = null;
		//TODO: Needs initialization with real value
		Consumer consumer = null;
		//Act Statement(s)
		PortInUseException.ifCausedBy(exception, Exception.class, consumer);
	}

	//Sapient generated method id: ${21d79cb3-1408-38c9-b0b6-0597cd977518}
	@Test()
	void ifCausedByWhenCausedByIsInstanceCandidate() {
		/* Branches:
		 * (candidate != null) : true
		 * (causedBy.isInstance(candidate)) : true
		 */
		//Arrange Statement(s)
		Exception exception = new Exception();
		Consumer consumer = null;
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			PortInUseException.ifCausedBy(exception, Exception.class, consumer);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
