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

	//Sapient generated method id: ${1f086ad3-0e19-3b9f-8b76-522fc39272f9}, hash: C6F830FBAADB83C202A478A3E76AE078
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

	//Sapient generated method id: ${f2e3978a-a93d-340b-bcb3-16b966527273}, hash: 92C6C341B6A15437411EF696E32E6B71
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

	//Sapient generated method id: ${9a9c6dde-df33-3507-acd9-a8520553502b}, hash: 870F5A130E15BE67DA5B1A2DC193EDBC
	@Disabled()
	@Test()
	void writeWhenDefaultBranchThrowsThrowable() throws IOException {
		/* Branches:
		 * (this.pid != null) : true
		 * (parent != null) : true  #  inside createParentDirectory method
		 * (file.exists()) : false
		 * (branch expression (line 93)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: writer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ApplicationPid target = new ApplicationPid("1234");
		File file = new File("pathname1");
		//Act Statement(s)
		final Throwable result = assertThrows(Throwable.class, () -> {
			target.write(file);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${0f3b2e0a-65a5-3e63-91dc-0e7873a33ca2}, hash: 22E3A5C30C225DF05B124FD3FBD2DF7E
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
			FileNotFoundException fileNotFoundException = new FileNotFoundException("write_file1 (permission denied)");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(fileNotFoundException.getMessage()));
				_assert.verify(() -> Assert.state(false, "No PID available"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${91cd37bb-3a3f-3516-9748-a67546b79a59}, hash: D831E80E1349A27019D15867C09090B8
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
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: writer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ApplicationPid target = new ApplicationPid("pid1");
		File file = new File("pathname1");
		//Act Statement(s)
		target.write(file);
	}

	//Sapient generated method id: ${824ae2cd-1252-3b81-b1ff-948607246b85}, hash: 0B9D950D0AEC99E00545A13BE1D125FB
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
		FileNotFoundException fileNotFoundException = new FileNotFoundException("write_file1 (permission denied)");
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

	//Sapient generated method id: ${42b10ac1-f960-3d39-b8e5-9de93c41e390}, hash: 1E53CA432AC2B7BF11DCB0228306C464
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
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: writer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
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
