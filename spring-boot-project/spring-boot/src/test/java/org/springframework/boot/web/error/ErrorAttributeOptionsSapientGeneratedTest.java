package org.springframework.boot.web.error;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ErrorAttributeOptionsSapientGeneratedTest {

    private final ErrorAttributeOptions errorAttributeOptionsMock = mock(ErrorAttributeOptions.class);

    //Sapient generated method id: ${isIncludedWhenThisIncludesContainsInclude}, hash: E86FCB0E81B8A11E79FAE446DC99A953
    @Disabled()
    @Test()
    void isIncludedWhenThisIncludesContainsInclude() {
        /* Branches:
         * (this.includes.contains(include)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ErrorAttributeOptions> errorAttributeOptions = mockStatic(ErrorAttributeOptions.class)) {
            errorAttributeOptions.when(() -> ErrorAttributeOptions.of(anyList())).thenReturn(errorAttributeOptionsMock);
            ErrorAttributeOptions.Include[] includeArray = new ErrorAttributeOptions.Include[] {};
            ErrorAttributeOptions target = ErrorAttributeOptions.of(includeArray);
            //Act Statement(s)
            boolean result = target.isIncluded(ErrorAttributeOptions.Include.EXCEPTION);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                errorAttributeOptions.verify(() -> ErrorAttributeOptions.of(anyList()));
            });
        }
    }

    //Sapient generated method id: ${isIncludedWhenThisIncludesNotContainsInclude}, hash: F3FE2CF63CBDE49312426E7793E3EB86
    @Disabled()
    @Test()
    void isIncludedWhenThisIncludesNotContainsInclude() {
        /* Branches:
         * (this.includes.contains(include)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ErrorAttributeOptions> errorAttributeOptions = mockStatic(ErrorAttributeOptions.class)) {
            errorAttributeOptions.when(() -> ErrorAttributeOptions.of(anyList())).thenReturn(errorAttributeOptionsMock);
            ErrorAttributeOptions.Include[] includeArray = new ErrorAttributeOptions.Include[] {};
            ErrorAttributeOptions target = ErrorAttributeOptions.of(includeArray);
            //Act Statement(s)
            boolean result = target.isIncluded(ErrorAttributeOptions.Include.EXCEPTION);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                errorAttributeOptions.verify(() -> ErrorAttributeOptions.of(anyList()));
            });
        }
    }

    //Sapient generated method id: ${includingWhenThisIncludesIsEmpty}, hash: 92601C3539EAD8463F5F709D457642B2
    @Disabled()
    @Test()
    void includingWhenThisIncludesIsEmpty() {
        /* Branches:
         * (this.includes.isEmpty()) : true  #  inside copyIncludes method
         */
        //Arrange Statement(s)
        try (MockedStatic<ErrorAttributeOptions> errorAttributeOptions = mockStatic(ErrorAttributeOptions.class)) {
            errorAttributeOptions.when(() -> ErrorAttributeOptions.of(anyList())).thenReturn(errorAttributeOptionsMock);
            ErrorAttributeOptions.Include[] includeArray = new ErrorAttributeOptions.Include[] {};
            ErrorAttributeOptions target = ErrorAttributeOptions.of(includeArray);
            ErrorAttributeOptions.Include[] includeArray2 = new ErrorAttributeOptions.Include[] {};
            //Act Statement(s)
            ErrorAttributeOptions result = target.including(includeArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                errorAttributeOptions.verify(() -> ErrorAttributeOptions.of(anyList()));
            });
        }
    }

    //Sapient generated method id: ${excludingWhenThisIncludesIsEmpty}, hash: 5C6CE40E753CEE3488B30B35DF057066
    @Disabled()
    @Test()
    void excludingWhenThisIncludesIsEmpty() {
        /* Branches:
         * (this.includes.isEmpty()) : true  #  inside copyIncludes method
         */
        //Arrange Statement(s)
        try (MockedStatic<ErrorAttributeOptions> errorAttributeOptions = mockStatic(ErrorAttributeOptions.class)) {
            errorAttributeOptions.when(() -> ErrorAttributeOptions.of(anyList())).thenReturn(errorAttributeOptionsMock);
            ErrorAttributeOptions.Include[] includeArray = new ErrorAttributeOptions.Include[] {};
            ErrorAttributeOptions target = ErrorAttributeOptions.of(includeArray);
            ErrorAttributeOptions.Include[] includeArray2 = new ErrorAttributeOptions.Include[] {};
            //Act Statement(s)
            ErrorAttributeOptions result = target.excluding(includeArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                errorAttributeOptions.verify(() -> ErrorAttributeOptions.of(anyList()));
            });
        }
    }

    //Sapient generated method id: ${excludingWhenThisIncludesNotIsEmpty}, hash: C3B45CE17FCF5A58629EC0F94B30EEF6
    @Disabled()
    @Test()
    void excludingWhenThisIncludesNotIsEmpty() {
        /* Branches:
         * (this.includes.isEmpty()) : false  #  inside copyIncludes method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ErrorAttributeOptions> errorAttributeOptions = mockStatic(ErrorAttributeOptions.class)) {
            errorAttributeOptions.when(() -> ErrorAttributeOptions.of(anyList())).thenReturn(errorAttributeOptionsMock);
            ErrorAttributeOptions.Include[] includeArray = new ErrorAttributeOptions.Include[] { ErrorAttributeOptions.Include.EXCEPTION, ErrorAttributeOptions.Include.STACK_TRACE, ErrorAttributeOptions.Include.MESSAGE, ErrorAttributeOptions.Include.PATH };
            ErrorAttributeOptions target = ErrorAttributeOptions.of(includeArray);
            ErrorAttributeOptions.Include[] includeArray2 = new ErrorAttributeOptions.Include[] { ErrorAttributeOptions.Include.BINDING_ERRORS };
            //Act Statement(s)
            ErrorAttributeOptions result = target.excluding(includeArray2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                errorAttributeOptions.verify(() -> ErrorAttributeOptions.of(anyList()));
            });
        }
    }

    //Sapient generated method id: ${defaultsTest}, hash: 74B56E441C61D1A0BA980CC33F46D0AA
    @Test()
    void defaultsTest() {
        //Arrange Statement(s)
        try (MockedStatic<ErrorAttributeOptions> errorAttributeOptions = mockStatic(ErrorAttributeOptions.class, CALLS_REAL_METHODS)) {
            ErrorAttributeOptions.Include[] includeArray = new ErrorAttributeOptions.Include[] { ErrorAttributeOptions.Include.PATH };
            errorAttributeOptions.when(() -> ErrorAttributeOptions.of(includeArray)).thenReturn(errorAttributeOptionsMock);
            //Act Statement(s)
            ErrorAttributeOptions result = ErrorAttributeOptions.defaults();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(errorAttributeOptionsMock));
                errorAttributeOptions.verify(() -> ErrorAttributeOptions.of(includeArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${of1WhenIncludesIsEmpty}, hash: 4471AAC75F2286511194FB8BB1298D2B
    @Test()
    void of1WhenIncludesIsEmpty() {
        /* Branches:
         * (includes.isEmpty()) : true
         */
        //Arrange Statement(s)
        Collection<ErrorAttributeOptions.Include> collection = new ArrayList<>();
        //Act Statement(s)
        ErrorAttributeOptions result = ErrorAttributeOptions.of(collection);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${of1WhenIncludesNotIsEmpty}, hash: 6FD73341CD4F96AE98FBF880875108DB
    @Test()
    void of1WhenIncludesNotIsEmpty() {
        /* Branches:
         * (includes.isEmpty()) : false
         */
        //Arrange Statement(s)
        Collection<ErrorAttributeOptions.Include> collection = new ArrayList<>();
        collection.add(ErrorAttributeOptions.Include.EXCEPTION);
        //Act Statement(s)
        ErrorAttributeOptions result = ErrorAttributeOptions.of(collection);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(collection.size(), equalTo(1));
            assertThat(collection.iterator().next(), is(instanceOf(ErrorAttributeOptions.Include.class)));
        });
    }
}
