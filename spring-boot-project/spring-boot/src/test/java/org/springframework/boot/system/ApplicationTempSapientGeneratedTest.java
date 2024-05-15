package org.springframework.boot.system;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;
import org.mockito.stubbing.Answer;
import java.util.EnumSet;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.Files;
import java.util.Set;
import java.nio.file.Paths;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFilePermissions;
import java.security.MessageDigest;
import java.util.function.Supplier;
import org.mockito.MockedStatic;
import java.io.File;
import java.nio.file.attribute.FileAttribute;
import static org.hamcrest.Matchers.equalTo;
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
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ApplicationTempSapientGeneratedTest {

    private final Path pathMock = mock(Path.class);

    //Sapient generated method id: ${toStringTest}, hash: C77623BD14BDB43D98F9A84A4F85842F
    @Disabled()
    @Test()
    void toStringTest() throws Exception {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ApplicationTemp target = spy(new ApplicationTemp(Object.class));
        File file = new File("pathname1");
        doReturn(file).when(target).getDir();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(target).getDir();
        });
    }

    //Sapient generated method id: ${getDirWhenCaughtExceptionThrowsIllegalStateException}, hash: 5AFC13F9ABAA02E9691FD9B369CD514A
    @Test()
    void getDirWhenCaughtExceptionThrowsIllegalStateException() throws NoSuchAlgorithmException {
        /* Branches:
         * (this.path == null) : true  #  inside getPath method
         * (this.path == null) : true  #  inside getPath method
         * (source != null) : true  #  inside update method
         * (source instanceof File file) : true  #  inside getUpdateSourceBytes method
         * (catch-exception (Exception)) : true  #  inside generateHash method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: home - Method: getSource
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MessageDigest> messageDigest = mockStatic(MessageDigest.class)) {
            MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-1");
            messageDigest.when(() -> MessageDigest.getInstance("SHA-1")).thenReturn(messageDigest2);
            ApplicationTemp target = new ApplicationTemp(Object.class);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.getDir();
            });
            Exception exception = new Exception();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getCause(), is(instanceOf(exception.getClass())));
                messageDigest.verify(() -> MessageDigest.getInstance("SHA-1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getDirWhenFileSystemSupportedFileAttributeViewsContainsPosix}, hash: D3D5D59573A690D75822E24BA78B24A7
    @Disabled()
    @Test()
    void getDirWhenFileSystemSupportedFileAttributeViewsContainsPosix() throws Exception {
        /* Branches:
         * (this.path == null) : true  #  inside getPath method
         * (this.path == null) : true  #  inside getPath method
         * (source != null) : true  #  inside update method
         * (source instanceof File file) : true  #  inside getUpdateSourceBytes method
         * (!Files.exists(path)) : true  #  inside createDirectory method
         * (!fileSystem.supportedFileAttributeViews().contains("posix")) : false  #  inside getFileAttributes method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: home - Method: getSource
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.state(true, "No 'java.io.tmpdir' property set")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ApplicationTemp target = new ApplicationTemp(Object.class);
            //Act Statement(s)
            File result = target.getDir();
            String[] stringArray = new String[] {};
            Path path = Paths.get("E", stringArray);
            Path path2 = path.resolve("CF227A74CBB3471A6228495F554CA05042C3D3BB");
            File file = path2.toFile();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(file));
                _assert.verify(() -> Assert.state(true, "No 'java.io.tmpdir' property set"), atLeast(1));
                _assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${getDirWhenCaughtIOExceptionThrowsIllegalStateException}, hash: D2D84AB3932988BD657B062926A12E45
    @Disabled()
    @Test()
    void getDirWhenCaughtIOExceptionThrowsIllegalStateException() throws IOException {
        /* Branches:
         * (this.path == null) : true  #  inside getPath method
         * (this.path == null) : true  #  inside getPath method
         * (source != null) : true  #  inside update method
         * (source instanceof File file) : true  #  inside getUpdateSourceBytes method
         * (!Files.exists(path)) : true  #  inside createDirectory method
         * (!fileSystem.supportedFileAttributeViews().contains("posix")) : true  #  inside getFileAttributes method
         * (catch-exception (IOException)) : true  #  inside createDirectory method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: home - Method: getSource
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Files> files = mockStatic(Files.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.state(false, "No 'java.io.tmpdir' property set")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            FileAttribute[] fileAttributeArray = new FileAttribute[] {};
            files.when(() -> Files.createDirectory((Path) any(), eq(fileAttributeArray))).thenReturn(pathMock);
            ApplicationTemp target = new ApplicationTemp(Object.class);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.getDir();
            });
            IOException iOException = new IOException();
            IllegalStateException illegalStateException = new IllegalStateException("Unable to create application temp directory path2", iOException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                _assert.verify(() -> Assert.state(false, "No 'java.io.tmpdir' property set"), atLeast(1));
                _assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
                files.verify(() -> Files.createDirectory((Path) any(), eq(fileAttributeArray)));
            });
        }
    }

    //Sapient generated method id: ${getDir1WhenCaughtExceptionThrowsIllegalStateException}, hash: 2F00B3C09850AD11ED49CC2FCF2C4793
    @Test()
    void getDir1WhenCaughtExceptionThrowsIllegalStateException() throws NoSuchAlgorithmException {
        /* Branches:
         * (this.path == null) : true  #  inside getPath method
         * (this.path == null) : true  #  inside getPath method
         * (source != null) : true  #  inside update method
         * (source instanceof File file) : true  #  inside getUpdateSourceBytes method
         * (catch-exception (Exception)) : true  #  inside generateHash method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: home - Method: getSource
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MessageDigest> messageDigest = mockStatic(MessageDigest.class)) {
            MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-1");
            messageDigest.when(() -> MessageDigest.getInstance("SHA-1")).thenReturn(messageDigest2);
            ApplicationTemp target = new ApplicationTemp(Object.class);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.getDir("subDir1");
            });
            Exception exception = new Exception();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getCause(), is(instanceOf(exception.getClass())));
                messageDigest.verify(() -> MessageDigest.getInstance("SHA-1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getDir1WhenFileSystemSupportedFileAttributeViewsNotContainsPosix}, hash: 0DCB30BF3BF6E946D858FFC2FF48DEE3
    @Disabled()
    @Test()
    void getDir1WhenFileSystemSupportedFileAttributeViewsNotContainsPosix() throws Exception {
        /* Branches:
         * (this.path == null) : true  #  inside getPath method
         * (this.path == null) : true  #  inside getPath method
         * (source != null) : true  #  inside update method
         * (source instanceof File file) : true  #  inside getUpdateSourceBytes method
         * (!Files.exists(path)) : true  #  inside createDirectory method
         * (!fileSystem.supportedFileAttributeViews().contains("posix")) : true  #  inside getFileAttributes method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: home - Method: getSource
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.state(true, "No 'java.io.tmpdir' property set")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ApplicationTemp target = new ApplicationTemp(Object.class);
            //Act Statement(s)
            File result = target.getDir("");
            String[] stringArray = new String[] {};
            Path path = Paths.get("G", stringArray);
            Path path2 = path.resolve("48A0E79EBFEAD234B3831630A8F4CBE2E1C7B482");
            Path path3 = path2.resolve("");
            File file = path3.toFile();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(file));
                _assert.verify(() -> Assert.state(true, "No 'java.io.tmpdir' property set"), atLeast(1));
                _assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${getDir1WhenSourceInstanceOfFileAndFilesNotExistsPathAndFileSystemSupportedFileAttributeViewsNotContainsPosix}, hash: 5A94203DD923F46561A1725B489B0EF3
    @Disabled()
    @Test()
    void getDir1WhenSourceInstanceOfFileAndFilesNotExistsPathAndFileSystemSupportedFileAttributeViewsNotContainsPosix() throws Exception {
        /* Branches:
         * (this.path == null) : true  #  inside getPath method
         * (this.path == null) : true  #  inside getPath method
         * (source != null) : true  #  inside update method
         * (source instanceof File file) : true  #  inside getUpdateSourceBytes method
         * (!Files.exists(path)) : true  #  inside createDirectory method
         * (!fileSystem.supportedFileAttributeViews().contains("posix")) : true  #  inside getFileAttributes method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: home - Method: getSource
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.state(true, "No 'java.io.tmpdir' property set")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ApplicationTemp target = new ApplicationTemp(Object.class);
            //Act Statement(s)
            File result = target.getDir("I");
            String[] stringArray = new String[] {};
            Path path = Paths.get("G", stringArray);
            Path path2 = path.resolve("48A0E79EBFEAD234B3831630A8F4CBE2E1C7B482");
            Path path3 = path2.resolve("I");
            File file = path3.toFile();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(file));
                _assert.verify(() -> Assert.state(true, "No 'java.io.tmpdir' property set"), atLeast(1));
                _assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${getDir1WhenFileSystemSupportedFileAttributeViewsContainsPosix}, hash: 522609060BB3195660726A3ADE7160CB
    @Disabled()
    @Test()
    void getDir1WhenFileSystemSupportedFileAttributeViewsContainsPosix() throws Exception {
        /* Branches:
         * (this.path == null) : true  #  inside getPath method
         * (this.path == null) : true  #  inside getPath method
         * (source != null) : true  #  inside update method
         * (source instanceof File file) : true  #  inside getUpdateSourceBytes method
         * (!Files.exists(path)) : true  #  inside createDirectory method
         * (!fileSystem.supportedFileAttributeViews().contains("posix")) : false  #  inside getFileAttributes method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: home - Method: getSource
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.state(true, "No 'java.io.tmpdir' property set")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            ApplicationTemp target = new ApplicationTemp(Object.class);
            //Act Statement(s)
            File result = target.getDir("J");
            String[] stringArray = new String[] {};
            Path path = Paths.get("I", stringArray);
            Path path2 = path.resolve("BC83D506D801D15C24FA977D5EB9E3F48202F98E");
            Path path3 = path2.resolve("J");
            File file = path3.toFile();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(file));
                _assert.verify(() -> Assert.state(true, "No 'java.io.tmpdir' property set"), atLeast(1));
                _assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${getDir1WhenCaughtIOExceptionThrowsIllegalStateException}, hash: 1B5A65B03FF7981E2DE4929F9436E5C4
    @Disabled()
    @Test()
    void getDir1WhenCaughtIOExceptionThrowsIllegalStateException() throws IOException {
        /* Branches:
         * (this.path == null) : true  #  inside getPath method
         * (this.path == null) : true  #  inside getPath method
         * (source != null) : true  #  inside update method
         * (source instanceof File file) : true  #  inside getUpdateSourceBytes method
         * (!Files.exists(path)) : true  #  inside createDirectory method
         * (!fileSystem.supportedFileAttributeViews().contains("posix")) : true  #  inside getFileAttributes method
         * (catch-exception (IOException)) : true  #  inside createDirectory method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: home - Method: getSource
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Files> files = mockStatic(Files.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.state(false, "No 'java.io.tmpdir' property set")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            FileAttribute[] fileAttributeArray = new FileAttribute[] {};
            files.when(() -> Files.createDirectory((Path) any(), eq(fileAttributeArray))).thenReturn(pathMock);
            ApplicationTemp target = new ApplicationTemp(Object.class);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.getDir("subDir1");
            });
            IOException iOException = new IOException();
            IllegalStateException illegalStateException = new IllegalStateException("Unable to create application temp directory path2", iOException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                _assert.verify(() -> Assert.state(false, "No 'java.io.tmpdir' property set"), atLeast(1));
                _assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
                files.verify(() -> Files.createDirectory((Path) any(), eq(fileAttributeArray)));
            });
        }
    }

    //Sapient generated method id: ${getDir1WhenFileSystemSupportedFileAttributeViewsNotContainsPosixAndCaughtIOExceptionThrowsIllegalStateException}, hash: 087683D558ADE02C4B4DF68C626FD498
    @Disabled()
    @Test()
    void getDir1WhenFileSystemSupportedFileAttributeViewsNotContainsPosixAndCaughtIOExceptionThrowsIllegalStateException() throws IOException {
        /* Branches:
         * (this.path == null) : true  #  inside getPath method
         * (this.path == null) : true  #  inside getPath method
         * (source != null) : true  #  inside update method
         * (source instanceof File file) : true  #  inside getUpdateSourceBytes method
         * (!Files.exists(path)) : false  #  inside createDirectory method
         * (!fileSystem.supportedFileAttributeViews().contains("posix")) : true  #  inside getFileAttributes method
         * (catch-exception (IOException)) : true  #  inside createDirectory method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: home - Method: getSource
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Files> files = mockStatic(Files.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.state(true, "No 'java.io.tmpdir' property set")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            FileAttribute[] fileAttributeArray = new FileAttribute[] {};
            files.when(() -> Files.createDirectory((Path) any(), eq(fileAttributeArray))).thenReturn(pathMock);
            ApplicationTemp target = new ApplicationTemp(Object.class);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.getDir("H");
            });
            IOException iOException = new IOException();
            IllegalStateException illegalStateException = new IllegalStateException("Unable to create application temp directory path3", iOException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                _assert.verify(() -> Assert.state(true, "No 'java.io.tmpdir' property set"), atLeast(1));
                _assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
                files.verify(() -> Files.createDirectory((Path) any(), eq(fileAttributeArray)));
            });
        }
    }

    //Sapient generated method id: ${getDir1WhenFileSystemSupportedFileAttributeViewsContainsPosixAndCaughtIOExceptionThrowsIllegalStateException}, hash: AFD08EA23BE0B229D7B3C5505CB57779
    @Disabled()
    @Test()
    void getDir1WhenFileSystemSupportedFileAttributeViewsContainsPosixAndCaughtIOExceptionThrowsIllegalStateException() throws IOException {
        /* Branches:
         * (this.path == null) : true  #  inside getPath method
         * (this.path == null) : true  #  inside getPath method
         * (source != null) : true  #  inside update method
         * (source instanceof File file) : true  #  inside getUpdateSourceBytes method
         * (!Files.exists(path)) : false  #  inside createDirectory method
         * (!fileSystem.supportedFileAttributeViews().contains("posix")) : false  #  inside getFileAttributes method
         * (catch-exception (IOException)) : true  #  inside createDirectory method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: home - Method: getSource
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Files> files = mockStatic(Files.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.state(false, "No 'java.io.tmpdir' property set")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
            EnumSet<PosixFilePermission> posixFilePermissionSet = EnumSet.noneOf(PosixFilePermission.class);
            posixFilePermissionSet.add(PosixFilePermission.OWNER_READ);
            posixFilePermissionSet.add(PosixFilePermission.OWNER_WRITE);
            posixFilePermissionSet.add(PosixFilePermission.OWNER_EXECUTE);
            FileAttribute<Set<PosixFilePermission>> fileAttribute = PosixFilePermissions.asFileAttribute(posixFilePermissionSet);
            FileAttribute<Set<PosixFilePermission>>[] fileAttributeArray = new FileAttribute[] { fileAttribute };
            files.when(() -> Files.createDirectory((Path) any(), eq(fileAttributeArray))).thenReturn(pathMock);
            ApplicationTemp target = new ApplicationTemp(Object.class);
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.getDir("");
            });
            IOException iOException = new IOException();
            IllegalStateException illegalStateException = new IllegalStateException("Unable to create application temp directory path3", iOException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                _assert.verify(() -> Assert.state(false, "No 'java.io.tmpdir' property set"), atLeast(1));
                _assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
                files.verify(() -> Files.createDirectory((Path) any(), eq(fileAttributeArray)));
            });
        }
    }
}
