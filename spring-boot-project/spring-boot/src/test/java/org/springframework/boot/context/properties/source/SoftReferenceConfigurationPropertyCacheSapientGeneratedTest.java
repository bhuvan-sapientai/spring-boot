package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import java.util.function.Supplier;
import org.mockito.MockedStatic;
import java.util.function.UnaryOperator;
import java.time.Instant;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SoftReferenceConfigurationPropertyCacheSapientGeneratedTest {

    private final Supplier supplierMock = mock(Supplier.class);

    private final UnaryOperator unaryOperatorMock = mock(UnaryOperator.class);

    //Sapient generated method id: ${enableTest}, hash: 1B130FD460701156CC3CCA592C294C42
    @Test()
    void enableTest() {
        //Arrange Statement(s)
        try (MockedStatic<Instant> instant = mockStatic(Instant.class)) {
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            instant.when(() -> Instant.now()).thenReturn(instant2);
            SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);
            //Act Statement(s)
            target.enable();
            //Assert statement(s)
            assertAll("result", () -> instant.verify(() -> Instant.now(), atLeast(1)));
        }
    }

    //Sapient generated method id: ${disableTest}, hash: 4FFCA743D427DF659F18EC4C3C8333F5
    @Test()
    void disableTest() {
        //Arrange Statement(s)
        try (MockedStatic<Instant> instant = mockStatic(Instant.class)) {
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            instant.when(() -> Instant.now()).thenReturn(instant2);
            SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);
            //Act Statement(s)
            target.disable();
            //Assert statement(s)
            assertAll("result", () -> instant.verify(() -> Instant.now(), atLeast(1)));
        }
    }

    //Sapient generated method id: ${setTimeToLiveWhenTimeToLiveIsZero}, hash: BB8E2C0818CF20A26FC89E6DC73B0C39
    @Test()
    void setTimeToLiveWhenTimeToLiveIsZero() {
        /* Branches:
         * (timeToLive == null) : false
         * (timeToLive.isZero()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Instant> instant = mockStatic(Instant.class)) {
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            instant.when(() -> Instant.now()).thenReturn(instant2);
            SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);
            Duration duration = Duration.ofDays(0L);
            //Act Statement(s)
            target.setTimeToLive(duration);
            //Assert statement(s)
            assertAll("result", () -> instant.verify(() -> Instant.now(), atLeast(1)));
        }
    }

    //Sapient generated method id: ${clearTest}, hash: F5D1ADDB0D2FC087791F3C82D9E0974A
    @Test()
    void clearTest() {
        //Arrange Statement(s)
        try (MockedStatic<Instant> instant = mockStatic(Instant.class)) {
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            instant.when(() -> Instant.now()).thenReturn(instant2);
            SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);
            //Act Statement(s)
            target.clear();
            //Assert statement(s)
            assertAll("result", () -> instant.verify(() -> Instant.now(), atLeast(1)));
        }
    }

    //Sapient generated method id: ${getWhenThisNeverExpire}, hash: B15C3C34C29C7F055AF5EA2AC7B78CEE
    @Disabled()
    @Test()
    void getWhenThisNeverExpire() {
        /* Branches:
         * (value == null) : false
         * (this.neverExpire) : true  #  inside hasExpired method
         * (hasExpired()) : false
         * (!this.neverExpire) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Instant> instant = mockStatic(Instant.class)) {
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            instant.when(() -> Instant.now()).thenReturn(instant2);
            SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(true);
            //Act Statement(s)
            Object result = target.get(supplierMock, unaryOperatorMock);
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                instant.verify(() -> Instant.now(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getWhenThisNotNeverExpire}, hash: C5F049AD2EAD7B49C0533D2AB313193E
    @Disabled()
    @Test()
    void getWhenThisNotNeverExpire() {
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
        try (MockedStatic<Instant> instant = mockStatic(Instant.class)) {
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            Instant instant3 = Instant.ofEpochSecond(1700000000);
            instant.when(() -> Instant.now()).thenReturn(instant2).thenReturn(instant3);
            SoftReferenceConfigurationPropertyCache<Object> target = spy(new SoftReferenceConfigurationPropertyCache(false));
            Object object = new Object();
            doNothing().when(target).setValue(object);
            //Act Statement(s)
            Object result = target.get(supplierMock, unaryOperatorMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                instant.verify(() -> Instant.now(), atLeast(2));
                verify(target).setValue(object);
            });
        }
    }

    //Sapient generated method id: ${nowTest}, hash: 0A6250030E305E0B167ACACC110D345C
    @Test()
    void nowTest() {
        //Arrange Statement(s)
        try (MockedStatic<Instant> instant = mockStatic(Instant.class)) {
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            Instant instant3 = Instant.ofEpochSecond(1700000000);
            instant.when(() -> Instant.now()).thenReturn(instant2).thenReturn(instant3);
            SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);
            //Act Statement(s)
            Instant result = target.now();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(instant3));
                instant.verify(() -> Instant.now(), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${getValueTest}, hash: 5969F74BF0462AEA37B7DA36459DF517
    @Disabled()
    @Test()
    void getValueTest() {
        //Arrange Statement(s)
        try (MockedStatic<Instant> instant = mockStatic(Instant.class)) {
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            instant.when(() -> Instant.now()).thenReturn(instant2);
            SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);
            //Act Statement(s)
            Object result = target.getValue();
            //Assert statement(s)
            //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                instant.verify(() -> Instant.now(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setValueTest}, hash: BA3CCA9FDEDC0B5E110201AF844B6259
    @Test()
    void setValueTest() {
        //Arrange Statement(s)
        try (MockedStatic<Instant> instant = mockStatic(Instant.class)) {
            Instant instant2 = Instant.ofEpochSecond(1700000000);
            instant.when(() -> Instant.now()).thenReturn(instant2);
            SoftReferenceConfigurationPropertyCache<Object> target = new SoftReferenceConfigurationPropertyCache(false);
            Object object = new Object();
            //Act Statement(s)
            target.setValue(object);
            //Assert statement(s)
            assertAll("result", () -> instant.verify(() -> Instant.now(), atLeast(1)));
        }
    }
}
