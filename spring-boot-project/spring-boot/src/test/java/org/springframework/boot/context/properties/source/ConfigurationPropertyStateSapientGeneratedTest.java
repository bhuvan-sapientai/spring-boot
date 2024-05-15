package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import org.springframework.util.Assert;
import java.util.function.Predicate;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertyStateSapientGeneratedTest {

    private final Predicate predicateMock = mock(Predicate.class);

    //Sapient generated method id: ${searchWhenPredicateTestItem}, hash: C8476AFBB9DB861D874B15E20E52ADC8
    @Disabled()
    @Test()
    void searchWhenPredicateTestItem() {
        /* Branches:
         * (for-each(source)) : true
         * (predicate.test(item)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(predicateMock, "Predicate must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            Iterable<Object> iterable = new ArrayList<>(List.of(object));
            //Act Statement(s)
            ConfigurationPropertyState result = ConfigurationPropertyState.search(iterable, predicateMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Source must not be null")));
                _assert.verify(() -> Assert.notNull(predicateMock, "Predicate must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${searchWhenPredicateNotTestItem}, hash: 2703BD558938A952F3F8352B63B7079A
    @Test()
    void searchWhenPredicateNotTestItem() {
        /* Branches:
         * (for-each(source)) : true
         * (predicate.test(item)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull((Iterable) any(), eq("Source must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(predicateMock, "Predicate must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Object object = new Object();
            Iterable<Object> iterable = new ArrayList<>(List.of(object));
            //Act Statement(s)
            ConfigurationPropertyState result = ConfigurationPropertyState.search(iterable, predicateMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
                _assert.verify(() -> Assert.notNull((Iterable) any(), eq("Source must not be null")));
                _assert.verify(() -> Assert.notNull(predicateMock, "Predicate must not be null"), atLeast(1));
            });
        }
    }
}
