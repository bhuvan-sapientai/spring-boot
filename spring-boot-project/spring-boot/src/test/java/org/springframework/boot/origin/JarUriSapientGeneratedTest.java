package org.springframework.boot.origin;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.net.URI;
import org.mockito.MockedStatic;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JarUriSapientGeneratedTest {

    private final JarUri jarUriMock = mock(JarUri.class);

    //Sapient generated method id: ${getDescription1Test}, hash: 04533311C1D3AA9D5B99F5BD0AEB058E
    @Disabled()
    @Test()
    void getDescription1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<JarUri> jarUri = mockStatic(JarUri.class)) {
            jarUri.when(() -> JarUri.from("uri")).thenReturn(jarUriMock);
            URI uRI = URI.create("str1");
            JarUri target = JarUri.from(uRI);
            //Act Statement(s)
            String result = target.getDescription("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("A from null"));
                jarUri.verify(() -> JarUri.from("uri"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toStringTest}, hash: B642764860509AEB4D4E0278ECF2EE1B
    @Disabled()
    @Test()
    void toStringTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<JarUri> jarUri = mockStatic(JarUri.class)) {
            jarUri.when(() -> JarUri.from("uri")).thenReturn(jarUriMock);
            URI uRI = URI.create("str1");
            JarUri target = JarUri.from(uRI);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                jarUri.verify(() -> JarUri.from("uri"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fromTest}, hash: 231646FFB9E471B5263B8143002D8306
    @Test()
    void fromTest() {
        //Arrange Statement(s)
        try (MockedStatic<JarUri> jarUri = mockStatic(JarUri.class, CALLS_REAL_METHODS)) {
            jarUri.when(() -> JarUri.from("str1")).thenReturn(jarUriMock);
            URI uRI = URI.create("str1");
            //Act Statement(s)
            JarUri result = JarUri.from(uRI);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(jarUriMock));
                jarUri.verify(() -> JarUri.from("str1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${from1WhenUriNotContainsJAR_EXTENSION}, hash: 4C753B7C4535F1017534DB7910391C51
    @Test()
    void from1WhenUriNotContainsJAR_EXTENSION() {
        /* Branches:
         * (uri.startsWith(JAR_SCHEME)) : true
         * (uri.contains(JAR_EXTENSION)) : false
         */
        //Act Statement(s)
        JarUri result = JarUri.from("jar:");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${from1WhenLastDotJarEqualsMinus1}, hash: 120EE71D4E3DC49FA553AE2421A6D42B
    @Test()
    void from1WhenLastDotJarEqualsMinus1() {
        /* Branches:
         * (uri.startsWith(JAR_SCHEME)) : true
         * (uri.contains(JAR_EXTENSION)) : true
         * (lastSlash == -1) : true  #  inside getFilename method
         * (lastDotJar == -1) : true  #  inside extractDescription method
         */
        //Act Statement(s)
        JarUri result = JarUri.from("jar:.jarC");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${from1WhenLastSlashNotEqualsMinus1AndLastDotJarNotEqualsMinus1}, hash: CD10DBF89D192157E1E65D8130BECD2C
    @Disabled()
    @Test()
    void from1WhenLastSlashNotEqualsMinus1AndLastDotJarNotEqualsMinus1() {
        /* Branches:
         * (uri.startsWith(JAR_SCHEME)) : true
         * (uri.contains(JAR_EXTENSION)) : true
         * (lastSlash == -1) : false  #  inside getFilename method
         * (lastDotJar == -1) : false  #  inside extractDescription method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        JarUri result = JarUri.from("uri1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
