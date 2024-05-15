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

    private final Path pathMock = mock(Path.class);

    private final PemContent pemContentMock = mock(PemContent.class);

    private final PrivateKey privateKeyMock = mock(PrivateKey.class);

    //Sapient generated method id: ${getCertificatesTest}, hash: 6F9E95F91B89F66F7CBD71D2801F0805
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

    //Sapient generated method id: ${getPrivateKeyTest}, hash: 1B95337BA65D1A03C9BEE79F75E5623A
    @Test()
    void getPrivateKeyTest() {
        //Arrange Statement(s)
        try (MockedStatic<PemPrivateKeyParser> pemPrivateKeyParser = mockStatic(PemPrivateKeyParser.class)) {
            pemPrivateKeyParser.when(() -> PemPrivateKeyParser.parse("A", (String) null)).thenReturn(privateKeyMock);
            PemContent target = PemContent.of("A");
            //Act Statement(s)
            PrivateKey result = target.getPrivateKey();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(privateKeyMock));
                pemPrivateKeyParser.verify(() -> PemPrivateKeyParser.parse("A", (String) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getPrivateKey1Test}, hash: D6EE6D3B702FD7BB7D5133B440813161
    @Test()
    void getPrivateKey1Test() {
        //Arrange Statement(s)
        try (MockedStatic<PemPrivateKeyParser> pemPrivateKeyParser = mockStatic(PemPrivateKeyParser.class)) {
            pemPrivateKeyParser.when(() -> PemPrivateKeyParser.parse("A", "B")).thenReturn(privateKeyMock);
            PemContent target = PemContent.of("A");
            //Act Statement(s)
            PrivateKey result = target.getPrivateKey("B");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(privateKeyMock));
                pemPrivateKeyParser.verify(() -> PemPrivateKeyParser.parse("A", "B"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toStringTest}, hash: 9204AB2EBA9C04AB3E94E393B00FCDE0
    @Test()
    void toStringTest() {
        //Arrange Statement(s)
        PemContent target = PemContent.of("text1");
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("text1")));
    }

    //Sapient generated method id: ${loadWhenContentIsNull}, hash: F4E40EA098394E3F92247E464D8C2F63
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

    //Sapient generated method id: ${loadWhenIsPresentInTextContent}, hash: A3C9F4E096BB96073B6FC735B7A3B283
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

    //Sapient generated method id: ${loadWhenDefaultBranchThrowsThrowable}, hash: 4ED649F251F9310927D8E54B9C3224C4
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
        try (MockedStatic<PemContent> pemContent = mockStatic(PemContent.class, CALLS_REAL_METHODS);
            MockedStatic<StreamUtils> streamUtils = mockStatic(StreamUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
            pemContent.when(() -> PemContent.isPresentInText("some_content")).thenReturn(false);
            URL uRL = ResourceUtils.getURL("A");
            resourceUtils.when(() -> ResourceUtils.getURL("some_content")).thenReturn(uRL);
            _assert.when(() -> Assert.notNull((URL) any(), eq("Url must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Charset charset = StandardCharsets.UTF_8;
            streamUtils.when(() -> StreamUtils.copyToString(inputStream, charset)).thenReturn("return_of_copyToString1");
            pemContent.when(() -> PemContent.of("return_of_copyToString1")).thenReturn(pemContentMock);
            //Act Statement(s)
            final Throwable result = assertThrows(Throwable.class, () -> {
                PemContent.load("some_content");
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                pemContent.verify(() -> PemContent.isPresentInText("some_content"), atLeast(1));
                resourceUtils.verify(() -> ResourceUtils.getURL("some_content"), atLeast(1));
                _assert.verify(() -> Assert.notNull((URL) any(), eq("Url must not be null")), atLeast(1));
                streamUtils.verify(() -> StreamUtils.copyToString(inputStream, charset), atLeast(1));
                pemContent.verify(() -> PemContent.of("return_of_copyToString1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadWhenDefaultBranch}, hash: 48CADC2F8BC66E17FC7124F03DB88522
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
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
            pemContent.when(() -> PemContent.isPresentInText("{value=URL}")).thenReturn(false);
            URL uRL = ResourceUtils.getURL("A");
            resourceUtils.when(() -> ResourceUtils.getURL("{value=URL}")).thenReturn(uRL);
            _assert.when(() -> Assert.notNull((URL) any(), eq("Url must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Charset charset = StandardCharsets.UTF_8;
            streamUtils.when(() -> StreamUtils.copyToString(inputStream, charset)).thenReturn("return_of_copyToString1");
            pemContent.when(() -> PemContent.of("return_of_copyToString1")).thenReturn(pemContentMock);
            //Act Statement(s)
            PemContent result = PemContent.load("{value=URL}");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(pemContentMock));
                pemContent.verify(() -> PemContent.isPresentInText("{value=URL}"), atLeast(1));
                resourceUtils.verify(() -> ResourceUtils.getURL("{value=URL}"), atLeast(1));
                _assert.verify(() -> Assert.notNull((URL) any(), eq("Url must not be null")), atLeast(1));
                streamUtils.verify(() -> StreamUtils.copyToString(inputStream, charset), atLeast(1));
                pemContent.verify(() -> PemContent.of("return_of_copyToString1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadWhenCaughtIOExceptionOrUncheckedIOExceptionThrowsIOException}, hash: C7F99756286234AB555E615E2A6C6EDF
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
            MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
            pemContent.when(() -> PemContent.isPresentInText("{value=URL}")).thenReturn(false);
            URL uRL = ResourceUtils.getURL("A");
            resourceUtils.when(() -> ResourceUtils.getURL("{value=URL}")).thenReturn(uRL);
            _assert.when(() -> Assert.notNull((URL) any(), eq("Url must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Charset charset = StandardCharsets.UTF_8;
            streamUtils.when(() -> StreamUtils.copyToString(inputStream, charset)).thenReturn("return_of_copyToString1");
            pemContent.when(() -> PemContent.of("return_of_copyToString1")).thenReturn(pemContentMock);
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
                _assert.verify(() -> Assert.notNull((URL) any(), eq("Url must not be null")), atLeast(1));
                streamUtils.verify(() -> StreamUtils.copyToString(inputStream, charset), atLeast(1));
                pemContent.verify(() -> PemContent.of("return_of_copyToString1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${load1WhenDefaultBranchThrowsThrowable}, hash: 16B8E691F2EB83B10417BCE898BD07AA
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
            _assert.when(() -> Assert.notNull(pathMock, "Path must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            OpenOption[] openOptionArray = new OpenOption[] { StandardOpenOption.READ };
            files.when(() -> Files.newInputStream(pathMock, openOptionArray)).thenReturn(null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Charset charset = StandardCharsets.UTF_8;
            streamUtils.when(() -> StreamUtils.copyToString(inputStream, charset)).thenReturn("return_of_copyToString1");
            pemContent.when(() -> PemContent.of("return_of_copyToString1")).thenReturn(pemContentMock);
            //Act Statement(s)
            final Throwable result = assertThrows(Throwable.class, () -> {
                PemContent.load(pathMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(pathMock, "Path must not be null"), atLeast(1));
                files.verify(() -> Files.newInputStream(pathMock, openOptionArray), atLeast(1));
                streamUtils.verify(() -> StreamUtils.copyToString(inputStream, charset), atLeast(1));
                pemContent.verify(() -> PemContent.of("return_of_copyToString1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${load1WhenDefaultBranch}, hash: F54BC3EADE9D8D2B7BFFE26A7E7E6F47
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
            _assert.when(() -> Assert.notNull(pathMock, "Path must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            Charset charset = StandardCharsets.UTF_8;
            streamUtils.when(() -> StreamUtils.copyToString(inputStream, charset)).thenReturn("return_of_copyToString1");
            pemContent.when(() -> PemContent.of("return_of_copyToString1")).thenReturn(pemContentMock);
            //Act Statement(s)
            PemContent result = PemContent.load(pathMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(pemContentMock));
                _assert.verify(() -> Assert.notNull(pathMock, "Path must not be null"), atLeast(1));
                streamUtils.verify(() -> StreamUtils.copyToString(inputStream, charset), atLeast(1));
                pemContent.verify(() -> PemContent.of("return_of_copyToString1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ofWhenTextIsNotNull}, hash: 22692882B9488AC6AA2517E079F2AAB4
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

    //Sapient generated method id: ${ofWhenTextIsNull}, hash: E28B72B5DF5389BC27D68405D7F92622
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

    //Sapient generated method id: ${isPresentInTextWhenPEM_FOOTERMatcherTextFind}, hash: C2546E95EDF4A24E3CCCD87C7AFD9F6B
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

    //Sapient generated method id: ${isPresentInTextWhenPEM_FOOTERMatcherTextNotFind}, hash: 701D61C8A2F7725CFC93D9BBBC7C1053
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
