package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import org.springframework.util.ResourceUtils;
import org.mockito.MockedStatic;
import java.io.File;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StringToFileConverterSapientGeneratedTest {

    //Sapient generated method id: ${convertWhenResourceUtilsIsUrlSource}, hash: B7C775F4D246DFFD109216574C8F4EC6
    @Disabled()
    @Test()
    void convertWhenResourceUtilsIsUrlSource() throws IOException {
        /* Branches:
         * (ResourceUtils.isUrl(source)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
            resourceUtils.when(() -> ResourceUtils.isUrl("A")).thenReturn(true);
            StringToFileConverter target = new StringToFileConverter();
            //Act Statement(s)
            File result = target.convert("A");
            File file = new File("pathname1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(file));
                resourceUtils.verify(() -> ResourceUtils.isUrl("A"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${convertWhenCaughtIOExceptionThrowsIllegalStateException}, hash: 19338878E024A676CEF0FC4D6C054740
    @Disabled()
    @Test()
    void convertWhenCaughtIOExceptionThrowsIllegalStateException() throws IOException {
        /* Branches:
         * (ResourceUtils.isUrl(source)) : true
         * (catch-exception (IOException)) : true  #  inside getFile method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
            resourceUtils.when(() -> ResourceUtils.isUrl("A")).thenReturn(true);
            StringToFileConverter target = new StringToFileConverter();
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.convert("A");
            });
            IllegalStateException illegalStateException = new IllegalStateException("Could not retrieve file for D: B");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                resourceUtils.verify(() -> ResourceUtils.isUrl("A"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${convertWhenFileExists}, hash: 239F5163582558B02233AB46902BA5AB
    @Test()
    void convertWhenFileExists() throws IOException {
        /* Branches:
         * (ResourceUtils.isUrl(source)) : false
         * (file.exists()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: file - Method: exists
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StringToFileConverter target = new StringToFileConverter();
        //Act Statement(s)
        File result = target.convert("A");
        File file = new File("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(file)));
    }

    //Sapient generated method id: ${convertWhenResourceExists}, hash: 084AF7C6CE58B150CF2235FD5B051C0A
    @Disabled()
    @Test()
    void convertWhenResourceExists() throws IOException {
        /* Branches:
         * (ResourceUtils.isUrl(source)) : false
         * (file.exists()) : false
         * (resource.exists()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: file - Method: exists
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StringToFileConverter target = new StringToFileConverter();
        //Act Statement(s)
        File result = target.convert("source1");
        File file = new File("pathname1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(file)));
    }

    //Sapient generated method id: ${convertWhenResourceNotExists}, hash: 27928C3BD1395A20C5DC3E6DF243563F
    @Test()
    void convertWhenResourceNotExists() throws IOException {
        /* Branches:
         * (ResourceUtils.isUrl(source)) : false
         * (file.exists()) : false
         * (resource.exists()) : false
         */
        //Arrange Statement(s)
        StringToFileConverter target = new StringToFileConverter();
        //Act Statement(s)
        File result = target.convert("A");
        File file = new File("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(file)));
    }

    //Sapient generated method id: ${convertWhenResourceExistsAndCaughtIOExceptionThrowsIllegalStateException}, hash: D3CA12C123FC1B29EBCDBBB92772C90E
    @Disabled()
    @Test()
    void convertWhenResourceExistsAndCaughtIOExceptionThrowsIllegalStateException() throws IOException {
        /* Branches:
         * (ResourceUtils.isUrl(source)) : false
         * (file.exists()) : false
         * (resource.exists()) : true
         * (catch-exception (IOException)) : true  #  inside getFile method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: file - Method: exists
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StringToFileConverter target = new StringToFileConverter();
        IllegalStateException illegalStateException = new IllegalStateException("s1");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.convert("source1");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }
}
