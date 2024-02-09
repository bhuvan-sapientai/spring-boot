package org.springframework.boot.validation.beanvalidation;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.util.ClassUtils;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.stream.Stream;

import org.springframework.util.function.SingletonSupplier;

import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FilteredMethodValidationPostProcessorSapientGeneratedTest {

	//Sapient generated method id: ${a1e3d830-abee-3fcd-84b8-da92369a5da4}
	@Disabled()
	@Test()
	void afterPropertiesSetTest() {
		/**
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: org.springframework.aop.support.ComposablePointcut
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SingletonSupplier singletonSupplierMock = mock(SingletonSupplier.class);
		try (MockedStatic<SingletonSupplier> singletonSupplier = mockStatic(SingletonSupplier.class)) {
			singletonSupplier.when(() -> SingletonSupplier.of((Supplier) any())).thenReturn(singletonSupplierMock);
			Stream stream = Stream.empty();
			FilteredMethodValidationPostProcessor target = new FilteredMethodValidationPostProcessor(stream);
			//Act Statement(s)
			target.afterPropertiesSet();
			//Assert statement(s)
			assertAll("result", () -> singletonSupplier.verify(() -> SingletonSupplier.of((Supplier) any())));
		}
	}
}
