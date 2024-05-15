package org.springframework.boot.jdbc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import org.mockito.stubbing.Answer;
import java.util.Collection;
import org.mockito.MockedStatic;
import java.util.Set;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DatabaseDriverSapientGeneratedTest {

    //Sapient generated method id: ${getIdTest}, hash: A00322FB3FBEB190D5FDC00BCA2F5183
    @Disabled()
    @Test()
    void getIdTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DatabaseDriver target = DatabaseDriver.valueOf("H2");
        //Act Statement(s)
        String result = target.getId();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }

    //Sapient generated method id: ${getUrlPrefixesTest}, hash: 1E04FFB81C6E00D160526C7799236AD7
    @Disabled()
    @Test()
    void getUrlPrefixesTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DatabaseDriver target = DatabaseDriver.valueOf("H2");
        //Act Statement(s)
        Collection<String> result = target.getUrlPrefixes();
        Set<String> stringResultSet = new HashSet<>(Set.of(""));
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result, containsInAnyOrder(stringResultSet.toArray()));
        });
    }

    //Sapient generated method id: ${matchProductNameWhenThisProductNameIsNull}, hash: D4BFBBF165D978B6DCA9CC16ADA54DE5
    @Test()
    void matchProductNameWhenThisProductNameIsNull() {
        /* Branches:
         * (this.productName != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DatabaseDriver target = DatabaseDriver.valueOf("H2");
        //Act Statement(s)
        boolean result = target.matchProductName("productName1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${fromJdbcUrlWhenUrlWithoutPrefixStartsWithPrefix}, hash: A7B0207600ADFE3D68BDDEE16FBBA56A
    @Test()
    void fromJdbcUrlWhenUrlWithoutPrefixStartsWithPrefix() {
        /* Branches:
         * (StringUtils.hasLength(url)) : true
         * (for-each(values())) : true
         * (for-each(driver.getUrlPrefixes())) : true
         * (driver != UNKNOWN) : true
         * (urlWithoutPrefix.startsWith(prefix)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isTrue(false, "URL must start with 'jdbc'")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            DatabaseDriver result = DatabaseDriver.fromJdbcUrl("url1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(DatabaseDriver.UNKNOWN));
                _assert.verify(() -> Assert.isTrue(false, "URL must start with 'jdbc'"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fromJdbcUrlWhenUrlWithoutPrefixNotStartsWithPrefix}, hash: 87E668AA0758AC943F895D16DB802E29
    @Test()
    void fromJdbcUrlWhenUrlWithoutPrefixNotStartsWithPrefix() {
        /* Branches:
         * (StringUtils.hasLength(url)) : true
         * (for-each(values())) : true
         * (for-each(driver.getUrlPrefixes())) : true
         * (driver != UNKNOWN) : true
         * (urlWithoutPrefix.startsWith(prefix)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isTrue(false, "URL must start with 'jdbc'")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            DatabaseDriver result = DatabaseDriver.fromJdbcUrl("ABCDE");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(DatabaseDriver.UNKNOWN));
                _assert.verify(() -> Assert.isTrue(false, "URL must start with 'jdbc'"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fromProductNameWhenCandidateMatchProductNameProductName}, hash: 7FD7575AB008A1047B3AD87949228D53
    @Test()
    void fromProductNameWhenCandidateMatchProductNameProductName() {
        /* Branches:
         * (StringUtils.hasLength(productName)) : true
         * (for-each(values())) : true
         * (candidate.matchProductName(productName)) : true
         */
        //Act Statement(s)
        DatabaseDriver result = DatabaseDriver.fromProductName("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(DatabaseDriver.UNKNOWN)));
    }

    //Sapient generated method id: ${fromProductNameWhenCandidateNotMatchProductNameProductName}, hash: 0E379CA8F7B04C9126F90DEB67E4AAD4
    @Test()
    void fromProductNameWhenCandidateNotMatchProductNameProductName() {
        /* Branches:
         * (StringUtils.hasLength(productName)) : true
         * (for-each(values())) : true
         * (candidate.matchProductName(productName)) : false
         */
        //Act Statement(s)
        DatabaseDriver result = DatabaseDriver.fromProductName("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(DatabaseDriver.UNKNOWN)));
    }
}
