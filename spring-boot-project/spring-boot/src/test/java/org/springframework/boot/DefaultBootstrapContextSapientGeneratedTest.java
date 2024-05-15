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

    private final Supplier supplierMock = mock(Supplier.class);

    //Sapient generated method id: ${registerWhenTypeGetNameNotPlus_has_already_been_created}, hash: 001C6E0748B737D0DA5FBC31B3AFA78C
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
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            DefaultBootstrapContext target = new DefaultBootstrapContext();
            //Act Statement(s)
            target.register(Object.class, bootstrapRegistryInstanceSupplierMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(Object.class, "Type must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(bootstrapRegistryInstanceSupplierMock, "InstanceSupplier must not be null"), atLeast(1));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
            });
        }
    }

    //Sapient generated method id: ${registerIfAbsentWhenTypeGetNameNotPlus_has_already_been_created}, hash: CFE90AA6C8F16668DFE8B287ECF2B16F
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
            _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            DefaultBootstrapContext target = new DefaultBootstrapContext();
            //Act Statement(s)
            target.registerIfAbsent(Object.class, bootstrapRegistryInstanceSupplierMock);
            //Assert statement(s)
            assertAll("result", () -> {
                _assert.verify(() -> Assert.notNull(Object.class, "Type must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(bootstrapRegistryInstanceSupplierMock, "InstanceSupplier must not be null"), atLeast(1));
                _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
            });
        }
    }

    //Sapient generated method id: ${isRegisteredTest}, hash: 25E12B4C7BC861DFE021AC399ACD1A54
    @Test()
    void isRegisteredTest() {
        //Arrange Statement(s)
        DefaultBootstrapContext target = new DefaultBootstrapContext();
        //Act Statement(s)
        boolean result = target.isRegistered(Object.class);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${getRegisteredInstanceSupplierTest}, hash: AE2B056808B49F85306F68743BEDF07A
    @Test()
    void getRegisteredInstanceSupplierTest() {
        //Arrange Statement(s)
        DefaultBootstrapContext target = new DefaultBootstrapContext();
        //Act Statement(s)
        BootstrapRegistry.InstanceSupplier result = target.getRegisteredInstanceSupplier(Object.class);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${addCloseListenerTest}, hash: CE4C1BCB8C2908B4221D476A577982A5
    @Test()
    void addCloseListenerTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: events - Method: addApplicationListener
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultBootstrapContext target = new DefaultBootstrapContext();
        ApplicationListener<BootstrapContextClosedEvent> applicationListenerMock = mock(ApplicationListener.class);
        //Act Statement(s)
        target.addCloseListener(applicationListenerMock);
    }

    //Sapient generated method id: ${getTest}, hash: FFE74E9DB205568607A48CFB9769D3A0
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

    //Sapient generated method id: ${getOrElseTest}, hash: F5563E981AB43949BCFDA8BAA56CFB90
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

    //Sapient generated method id: ${getOrElseSupplyWhenInstanceSupplierIsNull}, hash: 1D72913BF6E8A2721798ABDD1670CC87
    @Disabled()
    @Test()
    void getOrElseSupplyWhenInstanceSupplierIsNull() {
        /* Branches:
         * (instanceSupplier != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultBootstrapContext target = new DefaultBootstrapContext();
        //Act Statement(s)
        Object result = target.getOrElseSupply(Object.class, supplierMock);
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getOrElseThrowWhenInstanceSupplierIsNullThrowsThrowable}, hash: 729FEB5BD503C3A9AF8112CF92CEF1FD
    @Test()
    void getOrElseThrowWhenInstanceSupplierIsNullThrowsThrowable() throws Throwable {
        /* Branches:
         * (instanceSupplier == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultBootstrapContext target = new DefaultBootstrapContext();
        //Act Statement(s)
        final Throwable result = assertThrows(Throwable.class, () -> {
            target.getOrElseThrow(Object.class, supplierMock);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${closeTest}, hash: 7EB8D7EDBF066FED0D697811F45B7E58
    @Test()
    void closeTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: events - Method: multicastEvent
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultBootstrapContext target = new DefaultBootstrapContext();
        ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
        //Act Statement(s)
        target.close(configurableApplicationContextMock);
    }
}
