package org.springframework.boot.ssl.pem;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.List;
import java.nio.file.OpenOption;
import java.io.ByteArrayInputStream;

import org.springframework.util.Assert;

import java.nio.charset.Charset;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.io.InputStream;

import org.mockito.stubbing.Answer;

import java.security.PrivateKey;

import org.springframework.util.StreamUtils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import org.springframework.util.ResourceUtils;

import java.net.URL;

import org.mockito.MockedStatic;

import java.nio.charset.StandardCharsets;
import java.io.ByteArrayOutputStream;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
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
class PemContentSapientGeneratedTest {

	//Sapient generated method id: ${784690c2-193a-38a6-bd7b-0f21625d7dee}
	@Test()
	void getCertificatesTest() {
		//Arrange Statement(s)
		try (MockedStatic<PemCertificateParser> pemCertificateParser = mockStatic(PemCertificateParser.class)) {
			List<X509Certificate> x509CertificateList = new ArrayList<>();
			pemCertificateParser.when(() -> PemCertificateParser.parse("text1")).thenReturn(x509CertificateList);
			PemContent target = PemContent.of("text1");
			//Act Statement(s)
			List<X509Certificate> result = target.getCertificates();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(x509CertificateList));
				pemCertificateParser.verify(() -> PemCertificateParser.parse("text1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${568d42ec-7033-38e1-9013-bc9b392e785f}
	@Test()
	void getPrivateKeyTest() {
		//Arrange Statement(s)
		try (MockedStatic<PemPrivateKeyParser> pemPrivateKeyParser = mockStatic(PemPrivateKeyParser.class)) {
			//TODO: Needs to return real value
			pemPrivateKeyParser.when(() -> PemPrivateKeyParser.parse("A", (String) null)).thenReturn(null);
			PemContent target = PemContent.of("A");
			//Act Statement(s)
			PrivateKey result = target.getPrivateKey();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				pemPrivateKeyParser.verify(() -> PemPrivateKeyParser.parse("A", (String) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${31d14968-f79b-38f5-a680-78a78287d470}
	@Test()
	void getPrivateKey1Test() {
		//Arrange Statement(s)
		try (MockedStatic<PemPrivateKeyParser> pemPrivateKeyParser = mockStatic(PemPrivateKeyParser.class)) {
			//TODO: Needs to return real value
			pemPrivateKeyParser.when(() -> PemPrivateKeyParser.parse("A", "B")).thenReturn(null);
			PemContent target = PemContent.of("A");
			//Act Statement(s)
			PrivateKey result = target.getPrivateKey("B");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				pemPrivateKeyParser.verify(() -> PemPrivateKeyParser.parse("A", "B"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
	@Test()
	void toStringTest() {
		//Arrange Statement(s)
		PemContent target = PemContent.of("text1");
		//Act Statement(s)
		String result = target.toString();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("text1")));
	}

	//Sapient generated method id: ${c5f3e32a-94f0-3818-9c89-b69dcba35533}
	@Test()
	void loadWhenContentIsNull() throws Throwable, IOException {
		/* Branches:
		 * (content == null) : true
		 */
		//Act Statement(s)
		PemContent result = PemContent.load((String) null);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${7461d2b9-0b42-3a4f-b648-2a8823075688}
	@Test()
	void loadWhenIsPresentInTextContent() throws Throwable, IOException {
		/* Branches:
		 * (content == null) : false
		 * (isPresentInText(content)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<PemContent> pemContent = mockStatic(PemContent.class, CALLS_REAL_METHODS)) {
			pemContent.when(() -> PemContent.isPresentInText("content1")).thenReturn(true);
			//Act Statement(s)
			PemContent result = PemContent.load("content1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				pemContent.verify(() -> PemContent.isPresentInText("content1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2b216bd1-213c-3ae7-8203-1ee6c92eb640}
	@Disabled()
	@Test()
	void loadWhenDefaultBranchThrowsThrowable() throws IOException, FileNotFoundException {
		/* Branches:
		 * (content == null) : false
		 * (isPresentInText(content)) : false
		 * (branch expression (line 144)) : true  #  inside load method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		PemContent pemContentMock = mock(PemContent.class);
		try (MockedStatic<PemContent> pemContent = mockStatic(PemContent.class, CALLS_REAL_METHODS);
			 MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
			pemContent.when(() -> PemContent.isPresentInText("value")).thenReturn(false);
			URL uRL = ResourceUtils.getURL("A");
			resourceUtils.when(() -> ResourceUtils.getURL("value")).thenReturn(uRL);
			_assert.when(() -> Assert.notNull((URL) any(), eq("Url must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
			Charset charset = StandardCharsets.UTF_8;
			streamUtils.when(() -> StreamUtils.copyToString(inputStream, charset)).thenReturn("return_of_copyToString1");
			pemContent.when(() -> PemContent.of("return_of_copyToString1")).thenReturn(pemContentMock);
			//Act Statement(s)
			final Throwable result = assertThrows(Throwable.class, () -> {
				PemContent.load("value");
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				pemContent.verify(() -> PemContent.isPresentInText("value"), atLeast(1));
				resourceUtils.verify(() -> ResourceUtils.getURL("value"), atLeast(1));
				_assert.verify(() -> Assert.notNull((URL) any(), eq("Url must not be null")), atLeast(1));
				streamUtils.verify(() -> StreamUtils.copyToString(inputStream, charset), atLeast(1));
				pemContent.verify(() -> PemContent.of("return_of_copyToString1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${905884fe-b108-3f80-b108-d8f417ad4b2e}
	@Disabled()
	@Test()
	void loadWhenDefaultBranch() throws Throwable, IOException {
		/* Branches:
		 * (content == null) : false
		 * (isPresentInText(content)) : false
		 * (branch expression (line 146)) : false  #  inside load method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<PemContent> pemContent = mockStatic(PemContent.class, CALLS_REAL_METHODS);
			 MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
			 MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
			pemContent.when(() -> PemContent.isPresentInText("{value=URL}")).thenReturn(false);
			URL uRL = ResourceUtils.getURL("A");
			resourceUtils.when(() -> ResourceUtils.getURL("{value=URL}")).thenReturn(uRL);
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
			Charset charset = StandardCharsets.UTF_8;
			streamUtils.when(() -> StreamUtils.copyToString(inputStream, charset)).thenReturn("return_of_copyToString1");
			PemContent pemContent2 = PemContent.of("text1");
			pemContent.when(() -> PemContent.of("return_of_copyToString1")).thenReturn(pemContent2);
			//Act Statement(s)
			PemContent result = PemContent.load("{value=URL}");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(pemContent2));
				pemContent.verify(() -> PemContent.isPresentInText("{value=URL}"), atLeast(1));
				resourceUtils.verify(() -> ResourceUtils.getURL("{value=URL}"), atLeast(1));
				streamUtils.verify(() -> StreamUtils.copyToString(inputStream, charset), atLeast(1));
				pemContent.verify(() -> PemContent.of("return_of_copyToString1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${072deebc-18b6-33aa-a10c-cfb9962572f8}
	@Disabled()
	@Test()
	void loadWhenCaughtIOExceptionOrUncheckedIOExceptionThrowsIOException() throws IOException, FileNotFoundException {
		/* Branches:
		 * (content == null) : false
		 * (isPresentInText(content)) : false
		 * (branch expression (line 146)) : false  #  inside load method
		 * (catch-exception (IOException | UncheckedIOException)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<PemContent> pemContent = mockStatic(PemContent.class, CALLS_REAL_METHODS);
			 MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
			 MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
			pemContent.when(() -> PemContent.isPresentInText("{value=URL}")).thenReturn(false);
			URL uRL = ResourceUtils.getURL("A");
			resourceUtils.when(() -> ResourceUtils.getURL("{value=URL}")).thenReturn(uRL);
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
			Charset charset = StandardCharsets.UTF_8;
			streamUtils.when(() -> StreamUtils.copyToString(inputStream, charset)).thenReturn("return_of_copyToString1");
			PemContent pemContent2 = PemContent.of("text1");
			pemContent.when(() -> PemContent.of("return_of_copyToString1")).thenReturn(pemContent2);
			//Act Statement(s)
			final IOException result = assertThrows(IOException.class, () -> {
				PemContent.load("{value=URL}");
			});
			Exception exception = new Exception();
			IOException iOException = new IOException("Error reading certificate or key from file '{value=URL}'", exception);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(iOException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(exception.getClass())));
				pemContent.verify(() -> PemContent.isPresentInText("{value=URL}"), atLeast(1));
				resourceUtils.verify(() -> ResourceUtils.getURL("{value=URL}"), atLeast(1));
				streamUtils.verify(() -> StreamUtils.copyToString(inputStream, charset), atLeast(1));
				pemContent.verify(() -> PemContent.of("return_of_copyToString1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c83c7811-7820-3ee5-950a-530af572021c}
	@Disabled()
	@Test()
	void load1WhenDefaultBranchThrowsThrowable() throws IOException {
		/* Branches:
		 * (branch expression (line 137)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<PemContent> pemContent = mockStatic(PemContent.class, CALLS_REAL_METHODS);
			 MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
			 MockedStatic<Files> files = mockStatic(Files.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Path) null, "Path must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OpenOption[] openOptionArray = new OpenOption[] { StandardOpenOption.READ };
			files.when(() -> Files.newInputStream((Path) null, openOptionArray)).thenReturn(null);
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
			Charset charset = StandardCharsets.UTF_8;
			streamUtils.when(() -> StreamUtils.copyToString(inputStream, charset)).thenReturn("return_of_copyToString1");
			PemContent pemContent2 = PemContent.of("text1");
			pemContent.when(() -> PemContent.of("return_of_copyToString1")).thenReturn(pemContent2);
			//TODO: Needs initialization with real value
			Path path = null;
			//Act Statement(s)
			final Throwable result = assertThrows(Throwable.class, () -> {
				PemContent.load(path);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((Path) null, "Path must not be null"), atLeast(1));
				files.verify(() -> Files.newInputStream((Path) null, openOptionArray), atLeast(1));
				streamUtils.verify(() -> StreamUtils.copyToString(inputStream, charset), atLeast(1));
				pemContent.verify(() -> PemContent.of("return_of_copyToString1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${20714769-25ee-37a8-a731-fabf2cb713e4}
	@Disabled()
	@Test()
	void load1WhenDefaultBranch() throws Throwable {
		/* Branches:
		 * (branch expression (line 139)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<PemContent> pemContent = mockStatic(PemContent.class, CALLS_REAL_METHODS);
			 MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Path) null, "Path must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
			Charset charset = StandardCharsets.UTF_8;
			streamUtils.when(() -> StreamUtils.copyToString(inputStream, charset)).thenReturn("return_of_copyToString1");
			PemContent pemContent2 = PemContent.of("text1");
			pemContent.when(() -> PemContent.of("return_of_copyToString1")).thenReturn(pemContent2);
			//TODO: Needs initialization with real value
			Path path = null;
			//Act Statement(s)
			PemContent result = PemContent.load(path);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(pemContent2));
				_assert.verify(() -> Assert.notNull((Path) null, "Path must not be null"), atLeast(1));
				streamUtils.verify(() -> StreamUtils.copyToString(inputStream, charset), atLeast(1));
				pemContent.verify(() -> PemContent.of("return_of_copyToString1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${08a145e6-9e16-39b7-bc7d-f9af1cc5fd2c}
	@Test()
	void ofWhenTextIsNotNull() {
		/* Branches:
		 * (text != null) : true
		 */
		//Act Statement(s)
		PemContent result = PemContent.of("text1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${3d935dad-31d7-32d6-9b1d-84855563b212}
	@Test()
	void ofWhenTextIsNull() {
		/* Branches:
		 * (text != null) : false
		 */
		//Act Statement(s)
		PemContent result = PemContent.of((String) null);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${fab7ba8a-ac1d-3853-8ea1-0aff41180509}
	@Disabled()
	@Test()
	void isPresentInTextWhenPEM_FOOTERMatcherTextFind() {
		/* Branches:
		 * (text != null) : true
		 * (PEM_HEADER.matcher(text).find()) : true
		 * (PEM_FOOTER.matcher(text).find()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		boolean result = PemContent.isPresentInText("text1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${914a108d-7d78-3053-a1b5-8b2eda000897}
	@Test()
	void isPresentInTextWhenPEM_FOOTERMatcherTextNotFind() {
		/* Branches:
		 * (text != null) : true
		 * (PEM_HEADER.matcher(text).find()) : true
		 * (PEM_FOOTER.matcher(text).find()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		boolean result = PemContent.isPresentInText("text1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}
}
