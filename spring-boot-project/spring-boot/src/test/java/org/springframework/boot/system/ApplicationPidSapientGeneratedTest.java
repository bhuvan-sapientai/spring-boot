package org.springframework.boot.system;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.LinkOption;
import org.mockito.stubbing.Answer;
import java.io.FileNotFoundException;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.Files;
import java.util.Set;
import org.springframework.util.Assert;
import java.nio.file.Path;
import java.util.HashSet;
import org.mockito.MockedStatic;
import java.io.File;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ApplicationPidSapientGeneratedTest {

    //Sapient generated method id: ${toStringWhenThisPidIsNotNull}, hash: C6F830FBAADB83C202A478A3E76AE078
    @Test()
    void toStringWhenThisPidIsNotNull() {
        /* Branches:
         * (this.pid != null) : true
         */
        //Arrange Statement(s)
        ApplicationPid target = new ApplicationPid("pid1");
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("pid1")));
    }

    //Sapient generated method id: ${toStringWhenThisPidIsNull}, hash: 92C6C341B6A15437411EF696E32E6B71
    @Test()
    void toStringWhenThisPidIsNull() {
        /* Branches:
         * (this.pid != null) : false
         */
        //Arrange Statement(s)
        ApplicationPid target = new ApplicationPid((String) null);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("???")));
    }

    //Sapient generated method id: ${writeWhenFileExistsAndFileNotCanWriteThrowsFileNotFoundException}, hash: 0A3001333DBAA62BBA0CEA9587B824A1
    @Disabled()
    @Test()
    void writeWhenFileExistsAndFileNotCanWriteThrowsFileNotFoundException() throws IOException {
        /* Branches:
         * (this.pid != null) : false
         * (parent != null) : false  #  inside createParentDirectory method
         * (file.exists()) : true
         * (!file.canWrite()) : true  #  inside assertCanOverwrite method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.state(false, "No PID available")).thenAnswer((Answer<Void>) invocation -> null);
            ApplicationPid target = new ApplicationPid((String) null);
            File file = new File("pathname1");
            //Act Statement(s)
            final FileNotFoundException result = assertThrows(FileNotFoundException.class, () -> {
                target.write(file);
            });
            FileNotFoundException fileNotFoundException = new FileNotFoundException("file (permission denied)");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(fileNotFoundException.getMessage()));
                _assert.verify(() -> Assert.state(false, "No PID available"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${writeWhenFileNotExistsAndDefaultBranchThrowsThrowable}, hash: E51DCFEB6467FBEBE96D7C1FA9049AAE
    @Disabled()
    @Test()
    void writeWhenFileNotExistsAndDefaultBranchThrowsThrowable() throws IOException {
        /* Branches:
         * (this.pid != null) : false
         * (parent != null) : false  #  inside createParentDirectory method
         * (file.exists()) : false
         * (branch expression (line 93)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.state(false, "No PID available")).thenAnswer((Answer<Void>) invocation -> null);
            ApplicationPid target = new ApplicationPid((String) null);
            File file = new File("pathname1");
            //Act Statement(s)
            final Throwable result = assertThrows(Throwable.class, () -> {
                target.write(file);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.state(false, "No PID available"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${writeWhenCanWritePosixFileFile}, hash: D831E80E1349A27019D15867C09090B8
    @Test()
    void writeWhenCanWritePosixFileFile() throws Throwable {
        /* Branches:
         * (this.pid != null) : true
         * (parent != null) : true  #  inside createParentDirectory method
         * (file.exists()) : true
         * (!file.canWrite()) : false  #  inside assertCanOverwrite method
         * (for-each(WRITE_PERMISSIONS)) : true  #  inside canWritePosixFile method
         * (permissions.contains(permission)) : true  #  inside canWritePosixFile method
         * (!canWritePosixFile(file)) : false  #  inside assertCanOverwrite method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ApplicationPid target = new ApplicationPid("pid1");
        File file = new File("pathname1");
        //Act Statement(s)
        target.write(file);
    }

    //Sapient generated method id: ${writeWhenCanWritePosixFileNotFileThrowsFileNotFoundException}, hash: C313DAFE7AD420FC3995D1A739680055
    @Disabled()
    @Test()
    void writeWhenCanWritePosixFileNotFileThrowsFileNotFoundException() throws IOException {
        /* Branches:
         * (this.pid != null) : true
         * (parent != null) : true  #  inside createParentDirectory method
         * (file.exists()) : true
         * (!file.canWrite()) : false  #  inside assertCanOverwrite method
         * (for-each(WRITE_PERMISSIONS)) : true  #  inside canWritePosixFile method
         * (permissions.contains(permission)) : false  #  inside canWritePosixFile method
         * (!canWritePosixFile(file)) : true  #  inside assertCanOverwrite method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ApplicationPid target = new ApplicationPid("pid1");
        File file = new File("pathname1");
        FileNotFoundException fileNotFoundException = new FileNotFoundException("file (permission denied)");
        //Act Statement(s)
        final FileNotFoundException result = assertThrows(FileNotFoundException.class, () -> {
            target.write(file);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(fileNotFoundException.getMessage()));
        });
    }

    //Sapient generated method id: ${writeWhenCaughtUnsupportedOperationExceptionAndCanWritePosixFileFile}, hash: 1E53CA432AC2B7BF11DCB0228306C464
    @Disabled()
    @Test()
    void writeWhenCaughtUnsupportedOperationExceptionAndCanWritePosixFileFile() throws Throwable {
        /* Branches:
         * (this.pid != null) : true
         * (parent != null) : true  #  inside createParentDirectory method
         * (file.exists()) : true
         * (!file.canWrite()) : false  #  inside assertCanOverwrite method
         * (for-each(WRITE_PERMISSIONS)) : true  #  inside canWritePosixFile method
         * (permissions.contains(permission)) : true  #  inside canWritePosixFile method
         * (catch-exception (UnsupportedOperationException)) : true  #  inside canWritePosixFile method
         * (!canWritePosixFile(file)) : false  #  inside assertCanOverwrite method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Path pathMock = mock(Path.class);
        try (MockedStatic<Files> files = mockStatic(Files.class)) {
            Set<PosixFilePermission> posixFilePermissionSet = new HashSet<>();
            posixFilePermissionSet.add(PosixFilePermission.OWNER_WRITE);
            LinkOption[] linkOptionArray = new LinkOption[] {};
            files.when(() -> Files.getPosixFilePermissions(pathMock, linkOptionArray)).thenReturn(posixFilePermissionSet);
            ApplicationPid target = new ApplicationPid("pid1");
            File file = new File("pathname1");
            //Act Statement(s)
            target.write(file);
            //Assert statement(s)
            assertAll("result", () -> files.verify(() -> Files.getPosixFilePermissions(pathMock, linkOptionArray), atLeast(1)));
        }
    }
}
