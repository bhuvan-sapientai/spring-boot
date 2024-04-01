package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.time.Instant;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SoftReferenceConfigurationPropertyCacheSapientGeneratedTest {

	private final Supplier supplierMock = mock(Supplier.class);

	private final UnaryOperator unaryOperatorMock = mock(UnaryOperator.class);

	//Sapient generated method id: ${6f30b95c-0a90-385e-9819-f7d536f98ba9}, hash: 8A880FCDE2E122CEAF672E26D41806FE
	@Test()
	void enableTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.time.Instant::now has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);

		//Act Statement(s)
		target.enable();
	}

	//Sapient generated method id: ${554a8a8b-69d2-3a44-a705-2fb9e6b48b55}, hash: 4B1DBFD09D5A328B2E2B6560F934A6C0
	@Test()
	void disableTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.time.Instant::now has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);

		//Act Statement(s)
		target.disable();
	}

	//Sapient generated method id: ${272d1d94-dec9-3d14-9126-49dbdd4c271f}, hash: E70D796A75CBD923B67D1BEA70A7D00D
	@Test()
	void setTimeToLiveWhenTimeToLiveIsZero() {
		/* Branches:
		 * (timeToLive == null) : false
		 * (timeToLive.isZero()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.time.Instant::now has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);
		Duration duration = Duration.ofDays(0L);

		//Act Statement(s)
		target.setTimeToLive(duration);
	}

	//Sapient generated method id: ${44d7d8d6-bf4a-3f14-9c90-fcb97adadc11}, hash: B3A1633CDC795C3146BE44672680881A
	@Test()
	void setTimeToLiveWhenTimeToLiveNotIsZero() {
		/* Branches:
		 * (timeToLive == null) : false
		 * (timeToLive.isZero()) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.time.Instant::now has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);
		Duration duration = Duration.ofDays(0L);

		//Act Statement(s)
		target.setTimeToLive(duration);
	}

	//Sapient generated method id: ${53c00396-4771-38ed-8731-096091c47b7f}, hash: 210FDD64C0CD99973538C19547CB5E78
	@Test()
	void clearTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.time.Instant::now has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);

		//Act Statement(s)
		target.clear();
	}

	//Sapient generated method id: ${bc6337cc-3a13-399e-8bee-bef738be5fd5}, hash: 41FA8AFCBF16EDA2E30B1B38E7918797
	@Test()
	void getWhenThisNotNeverExpire() {
		/* Branches:
		 * (value == null) : true
		 * (!this.neverExpire) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.time.Instant::now has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = spy(new SoftReferenceConfigurationPropertyCache(false));
		Object object = new Object();
		doNothing().when(target).setValue(object);

		//Act Statement(s)
		Object result = target.get(supplierMock, unaryOperatorMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(object));
			verify(target).setValue(object);
		});
	}

	//Sapient generated method id: ${b279c0be-e03c-36ee-9763-2fa404619786}, hash: 5072B47497799804164BB917CBA73DB2
	@Test()
	void getWhenHasExpiredNotAndThisNeverExpire() {
		/* Branches:
		 * (value == null) : false
		 * (this.neverExpire) : true  #  inside hasExpired method
		 * (hasExpired()) : false
		 * (!this.neverExpire) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.time.Instant::now has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(true);

		//Act Statement(s)
		Object result = target.get(supplierMock, unaryOperatorMock);

		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${a486cc72-d244-3c85-b976-49089cc5e5a2}, hash: 4917A39677393E841A850F85EC2B14D0
	@Test()
	void getWhenHasExpiredAndThisNotNeverExpire() {
		/* Branches:
		 * (value == null) : false
		 * (this.neverExpire) : false  #  inside hasExpired method
		 * (timeToLive == null) : true  #  inside hasExpired method
		 * (hasExpired()) : true
		 * (!this.neverExpire) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.time.Instant::now has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = spy(new SoftReferenceConfigurationPropertyCache(false));
		Object object = new Object();
		doNothing().when(target).setValue(object);

		//Act Statement(s)
		Object result = target.get(supplierMock, unaryOperatorMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(object));
			verify(target).setValue(object);
		});
	}

	//Sapient generated method id: ${86537c06-be77-3500-98a1-86707e1ef0cd}, hash: 0AC888AE8775DD5AC2D08A6BDAF8E93A
	@Test()
	void nowTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.time.Instant::now has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);

		//Act Statement(s)
		Instant result = target.now();
		Instant instant = Instant.ofEpochSecond(1700000000);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(instant)));
	}

	//Sapient generated method id: ${b0d20fa9-e250-397e-b581-b3faccc5922b}, hash: D439F8EFB73D3E4CE40AACC0C335D573
	@Test()
	void getValueTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.time.Instant::now has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);

		//Act Statement(s)
		Object result = target.getValue();

		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${caf82ae3-0e98-3057-9861-2dae5125f309}, hash: 87FEF0773A666667887312D279507D85
	@Test()
	void setValueTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.time.Instant::now has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);
		Object object = new Object();

		//Act Statement(s)
		target.setValue(object);
	}
}
