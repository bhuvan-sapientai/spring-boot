package org.springframework.boot.jackson;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.RegisteredBean;
import org.mockito.MockedStatic;
import java.util.function.UnaryOperator;
import org.springframework.beans.factory.aot.BeanRegistrationAotContribution;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JsonMixinModuleEntriesBeanRegistrationAotProcessorSapientGeneratedTest {

    private final RegisteredBean registeredBeanMock = mock(RegisteredBean.class);

    //Sapient generated method id: ${processAheadOfTimeWhenRegisteredBeanGetBeanClassEqualsJsonMixinModuleEntries}, hash: F597F051A0145241C902E229BAAFCC03
    @Disabled()
    @Test()
    void processAheadOfTimeWhenRegisteredBeanGetBeanClassEqualsJsonMixinModuleEntries() {
        /* Branches:
         * (registeredBean.getBeanClass().equals(JsonMixinModuleEntries.class)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BeanRegistrationAotContribution beanRegistrationAotContributionMock = mock(BeanRegistrationAotContribution.class);
        try (MockedStatic<BeanRegistrationAotContribution> beanRegistrationAotContribution = mockStatic(BeanRegistrationAotContribution.class)) {
            doReturn(Object.class).when(registeredBeanMock).getBeanClass();
            beanRegistrationAotContribution.when(() -> BeanRegistrationAotContribution.withCustomCodeFragments((UnaryOperator) any())).thenReturn(beanRegistrationAotContributionMock);
            JsonMixinModuleEntriesBeanRegistrationAotProcessor target = new JsonMixinModuleEntriesBeanRegistrationAotProcessor();
            //Act Statement(s)
            BeanRegistrationAotContribution result = target.processAheadOfTime(registeredBeanMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(beanRegistrationAotContributionMock));
                verify(registeredBeanMock).getBeanClass();
                beanRegistrationAotContribution.verify(() -> BeanRegistrationAotContribution.withCustomCodeFragments((UnaryOperator) any()));
            });
        }
    }

    //Sapient generated method id: ${processAheadOfTimeWhenRegisteredBeanGetBeanClassNotEqualsJsonMixinModuleEntries}, hash: 9E9C4E5802434E735ABC15428CF4EC92
    @Test()
    void processAheadOfTimeWhenRegisteredBeanGetBeanClassNotEqualsJsonMixinModuleEntries() {
        /* Branches:
         * (registeredBean.getBeanClass().equals(JsonMixinModuleEntries.class)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(Object.class).when(registeredBeanMock).getBeanClass();
        JsonMixinModuleEntriesBeanRegistrationAotProcessor target = new JsonMixinModuleEntriesBeanRegistrationAotProcessor();
        //Act Statement(s)
        BeanRegistrationAotContribution result = target.processAheadOfTime(registeredBeanMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(registeredBeanMock).getBeanClass();
        });
    }
}
