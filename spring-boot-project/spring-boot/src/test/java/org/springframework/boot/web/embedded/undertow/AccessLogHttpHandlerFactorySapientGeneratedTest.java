package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.mockito.stubbing.Answer;
import org.xnio.Xnio;
import io.undertow.server.HttpHandler;

import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import java.io.File;

import org.xnio.OptionMap;
import org.xnio.XnioWorker;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AccessLogHttpHandlerFactorySapientGeneratedTest {

	private final HttpHandler httpHandlerMock = mock(HttpHandler.class);

	private final OptionMap optionMapMock = mock(OptionMap.class);

	private final Xnio xnioMock = mock(Xnio.class);

	private final XnioWorker xnioWorkerMock = mock(XnioWorker.class);

	//Sapient generated method id: ${22ad12ed-eff6-332d-910d-1e1de402d622}
	@Disabled()
	@Test()
	void getHandlerWhenThisDirectoryNotIsDirectoryAndThisDirectoryNotMkdirsThrowsIllegalStateException() {
		/* Branches:
		 * (this.directory != null) : false  #  inside createAccessLogDirectoryIfNecessary method
		 * (!this.directory.isDirectory()) : true  #  inside createAccessLogDirectoryIfNecessary method
		 * (!this.directory.mkdirs()) : true  #  inside createAccessLogDirectoryIfNecessary method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(false, "Access log directory is not set")).thenAnswer((Answer<Void>) invocation -> null);
			File file = new File("pathname1");
			AccessLogHttpHandlerFactory target = new AccessLogHttpHandlerFactory(file, "pattern1", "prefix1", "suffix1", false);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.getHandler(httpHandlerMock);
			});
			IllegalStateException illegalStateException = new IllegalStateException("Failed to create access log directory '<init>_file1'");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				_assert.verify(() -> Assert.state(false, "Access log directory is not set"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d42715f4-3b23-304a-ae0d-1f1030249d3c}
	@Disabled()
	@Test()
	void getHandlerWhenThisPatternIsNotNull() throws IOException, IllegalArgumentException {
		/* Branches:
		 * (this.directory != null) : true  #  inside createAccessLogDirectoryIfNecessary method
		 * (!this.directory.isDirectory()) : true  #  inside createAccessLogDirectoryIfNecessary method
		 * (!this.directory.mkdirs()) : false  #  inside createAccessLogDirectoryIfNecessary method
		 * (this.prefix != null) : true
		 * (this.pattern != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Xnio> xnio = mockStatic(Xnio.class)) {
			xnio.when(() -> Xnio.getInstance((ClassLoader) any())).thenReturn(xnioMock);
			doReturn(xnioWorkerMock).when(xnioMock).createWorker(optionMapMock);
			File file = new File("pathname1");
			AccessLogHttpHandlerFactory target = new AccessLogHttpHandlerFactory(file, "pattern1", "prefix1", "suffix1", false);
			//Act Statement(s)
			HttpHandler result = target.getHandler(httpHandlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				xnio.verify(() -> Xnio.getInstance((ClassLoader) any()));
				verify(xnioMock).createWorker(optionMapMock);
			});
		}
	}

	//Sapient generated method id: ${16d98ffc-9672-33b9-b4f7-e2a62d07dad2}
	@Disabled()
	@Test()
	void getHandlerWhenThisPrefixIsNullAndThisPatternIsNull() throws IOException, IllegalArgumentException {
		/* Branches:
		 * (this.directory != null) : true  #  inside createAccessLogDirectoryIfNecessary method
		 * (!this.directory.isDirectory()) : true  #  inside createAccessLogDirectoryIfNecessary method
		 * (!this.directory.mkdirs()) : false  #  inside createAccessLogDirectoryIfNecessary method
		 * (this.prefix != null) : false
		 * (this.pattern != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Xnio> xnio = mockStatic(Xnio.class)) {
			xnio.when(() -> Xnio.getInstance((ClassLoader) any())).thenReturn(xnioMock);
			doReturn(xnioWorkerMock).when(xnioMock).createWorker(optionMapMock);
			File file = new File("pathname1");
			AccessLogHttpHandlerFactory target = new AccessLogHttpHandlerFactory(file, (String) null, (String) null, "suffix1", false);
			//Act Statement(s)
			HttpHandler result = target.getHandler(httpHandlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				xnio.verify(() -> Xnio.getInstance((ClassLoader) any()));
				verify(xnioMock).createWorker(optionMapMock);
			});
		}
	}

	//Sapient generated method id: ${bd67e6a6-d7e7-3ab0-a534-a8fbb6f3dcb3}
	@Disabled()
	@Test()
	void getHandlerWhenCaughtIOExceptionThrowsIllegalStateException() throws IOException, IllegalArgumentException {
		/* Branches:
		 * (this.directory != null) : true  #  inside createAccessLogDirectoryIfNecessary method
		 * (!this.directory.isDirectory()) : true  #  inside createAccessLogDirectoryIfNecessary method
		 * (!this.directory.mkdirs()) : false  #  inside createAccessLogDirectoryIfNecessary method
		 * (this.prefix != null) : true
		 * (this.pattern != null) : true
		 * (catch-exception (IOException)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Xnio> xnio = mockStatic(Xnio.class)) {
			xnio.when(() -> Xnio.getInstance((ClassLoader) any())).thenReturn(xnioMock);
			doReturn(xnioWorkerMock).when(xnioMock).createWorker(optionMapMock);
			File file = new File("pathname1");
			AccessLogHttpHandlerFactory target = new AccessLogHttpHandlerFactory(file, "pattern1", "prefix1", "suffix1", false);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.getHandler(httpHandlerMock);
			});
			IOException iOException = new IOException();
			IllegalStateException illegalStateException = new IllegalStateException("Failed to create AccessLogHandler", iOException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
				xnio.verify(() -> Xnio.getInstance((ClassLoader) any()));
				verify(xnioMock).createWorker(optionMapMock);
			});
		}
	}
}
