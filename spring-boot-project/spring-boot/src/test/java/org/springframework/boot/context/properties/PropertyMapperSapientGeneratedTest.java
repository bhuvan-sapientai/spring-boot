package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.util.function.SingletonSupplier;
import org.springframework.util.Assert;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PropertyMapperSapientGeneratedTest {

	//Sapient generated method id: ${99f617df-0936-3513-991d-3fc77524d0cd}
	@Test()
	void alwaysApplyingWhenNonNullTest() {
		//Arrange Statement(s)
		PropertyMapper target = spy(PropertyMapper.get());
		PropertyMapper propertyMapperMock = mock(PropertyMapper.class);
		doReturn(propertyMapperMock).when(target).alwaysApplying((PropertyMapper.SourceOperator) any());
		//Act Statement(s)
		PropertyMapper result = target.alwaysApplyingWhenNonNull();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(propertyMapperMock));
			verify(target).alwaysApplying((PropertyMapper.SourceOperator) any());
		});
	}

	//Sapient generated method id: ${2e37e555-8fa5-3902-b7f6-74578dfd46db}
	@Test()
	void alwaysApplyingTest() {
		//Arrange Statement(s)
		PropertyMapper.SourceOperator propertyMapperSourceOperatorMock = mock(PropertyMapper.SourceOperator.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(propertyMapperSourceOperatorMock, "Operator must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper target = PropertyMapper.get();
			//Act Statement(s)
			PropertyMapper result = target.alwaysApplying(propertyMapperSourceOperatorMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(propertyMapperSourceOperatorMock, "Operator must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${68f1c17c-5392-37f0-8bed-31fd051e0dde}
	@Test()
	void fromWhenThisSourceOperatorIsNull() {
		/* Branches:
		 * (this.parent != null) : false  #  inside getSource method
		 * (this.sourceOperator != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SingletonSupplier<Object> singletonSupplierMock = mock(SingletonSupplier.class);
		try (MockedStatic<SingletonSupplier> singletonSupplier = mockStatic(SingletonSupplier.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Supplier) null, "Supplier must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			singletonSupplier.when(() -> SingletonSupplier.of((Supplier) null)).thenReturn(singletonSupplierMock);
			PropertyMapper target = PropertyMapper.get();
			//TODO: Needs initialization with real value
			Supplier supplier = null;
			//Act Statement(s)
			PropertyMapper.Source result = target.from(supplier);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Supplier) null, "Supplier must not be null"), atLeast(1));
				singletonSupplier.verify(() -> SingletonSupplier.of((Supplier) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4d14331c-3461-34d2-9c31-3612d7b953ef}
	@Test()
	void from1Test() {
		//Arrange Statement(s)
		PropertyMapper target = spy(PropertyMapper.get());
		PropertyMapper.Source propertyMapperSourceMock = mock(PropertyMapper.Source.class);
		doReturn(propertyMapperSourceMock).when(target).from((Supplier) any());
		Object object = new Object();
		//Act Statement(s)
		PropertyMapper.Source result = target.from(object);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(propertyMapperSourceMock));
			verify(target).from((Supplier) any());
		});
	}

	//Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}
	@Test()
	void getTest() {
		//Act Statement(s)
		PropertyMapper result = PropertyMapper.get();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
