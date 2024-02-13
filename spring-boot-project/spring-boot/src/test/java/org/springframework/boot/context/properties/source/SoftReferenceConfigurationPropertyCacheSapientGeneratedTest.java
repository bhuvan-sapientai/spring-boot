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
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SoftReferenceConfigurationPropertyCacheSapientGeneratedTest {

	//Sapient generated method id: ${6f30b95c-0a90-385e-9819-f7d536f98ba9}
	@Test()
	void enableTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);
		//Act Statement(s)
		target.enable();
	}

	//Sapient generated method id: ${554a8a8b-69d2-3a44-a705-2fb9e6b48b55}
	@Test()
	void disableTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);
		//Act Statement(s)
		target.disable();
	}

	//Sapient generated method id: ${272d1d94-dec9-3d14-9126-49dbdd4c271f}
	@Test()
	void setTimeToLiveWhenTimeToLiveIsZero() {
		/* Branches:
		 * (timeToLive == null) : false
		 * (timeToLive.isZero()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);
		Duration duration = Duration.ofDays(0L);
		//Act Statement(s)
		target.setTimeToLive(duration);
	}

	//Sapient generated method id: ${44d7d8d6-bf4a-3f14-9c90-fcb97adadc11}
	@Test()
	void setTimeToLiveWhenTimeToLiveNotIsZero() {
		/* Branches:
		 * (timeToLive == null) : false
		 * (timeToLive.isZero()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);
		Duration duration = Duration.ofDays(0L);
		//Act Statement(s)
		target.setTimeToLive(duration);
	}

	//Sapient generated method id: ${53c00396-4771-38ed-8731-096091c47b7f}
	@Test()
	void clearTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);
		//Act Statement(s)
		target.clear();
	}

	//Sapient generated method id: ${bc6337cc-3a13-399e-8bee-bef738be5fd5}
	@Disabled()
	@Test()
	void getWhenThisNotNeverExpire() {
		/* Branches:
		 * (value == null) : true
		 * (!this.neverExpire) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = spy(new SoftReferenceConfigurationPropertyCache(false));
		Object object = new Object();
		doNothing().when(target).setValue(object);
		//TODO: Needs initialization with real value
		Supplier supplier = null;
		//TODO: Needs initialization with real value
		UnaryOperator unaryOperator = null;
		//Act Statement(s)
		Object result = target.get(supplier, unaryOperator);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(object));
			verify(target).setValue(object);
		});
	}

	//Sapient generated method id: ${b279c0be-e03c-36ee-9763-2fa404619786}
	@Disabled()
	@Test()
	void getWhenHasExpiredNotAndThisNeverExpire() {
		/* Branches:
		 * (value == null) : false
		 * (this.neverExpire) : true  #  inside hasExpired method
		 * (hasExpired()) : false
		 * (!this.neverExpire) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(true);
		//TODO: Needs initialization with real value
		Supplier supplier = null;
		//TODO: Needs initialization with real value
		UnaryOperator unaryOperator = null;
		//Act Statement(s)
		Object result = target.get(supplier, unaryOperator);
		Object object = new Object();
		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(object)));
	}

	//Sapient generated method id: ${a486cc72-d244-3c85-b976-49089cc5e5a2}
	@Disabled()
	@Test()
	void getWhenHasExpiredAndThisNotNeverExpire() {
		/* Branches:
		 * (value == null) : false
		 * (this.neverExpire) : false  #  inside hasExpired method
		 * (timeToLive == null) : true  #  inside hasExpired method
		 * (hasExpired()) : true
		 * (!this.neverExpire) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = spy(new SoftReferenceConfigurationPropertyCache(false));
		Object object = new Object();
		doNothing().when(target).setValue(object);
		//TODO: Needs initialization with real value
		Supplier supplier = null;
		//TODO: Needs initialization with real value
		UnaryOperator unaryOperator = null;
		//Act Statement(s)
		Object result = target.get(supplier, unaryOperator);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(object));
			verify(target).setValue(object);
		});
	}

	//Sapient generated method id: ${86537c06-be77-3500-98a1-86707e1ef0cd}
	@Disabled()
	@Test()
	void nowTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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

	//Sapient generated method id: ${b0d20fa9-e250-397e-b581-b3faccc5922b}
	@Disabled()
	@Test()
	void getValueTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);
		//Act Statement(s)
		Object result = target.getValue();
		Object object = new Object();
		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(object)));
	}

	//Sapient generated method id: ${caf82ae3-0e98-3057-9861-2dae5125f309}
	@Test()
	void setValueTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);
		Object object = new Object();
		//Act Statement(s)
		target.setValue(object);
	}
}
