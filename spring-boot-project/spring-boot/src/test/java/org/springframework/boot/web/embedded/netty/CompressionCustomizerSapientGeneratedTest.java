package org.springframework.boot.web.embedded.netty;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.util.MimeTypeUtils;

import org.mockito.MockedStatic;

import java.util.function.BiPredicate;

import org.springframework.util.unit.DataSize;
import org.springframework.util.MimeType;
import org.springframework.boot.web.server.Compression;
import org.springframework.util.ObjectUtils;

import reactor.netty.http.server.HttpServer;

import org.springframework.util.StringUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CompressionCustomizerSapientGeneratedTest {

	private final BiPredicate biPredicateMock = mock(BiPredicate.class);

	private final DataSize dataSizeMock = mock(DataSize.class);

	private final HttpServer httpServerMock = mock(HttpServer.class);

	private final HttpServer httpServerMock2 = mock(HttpServer.class);

	private final MimeType mimeTypeMock = mock(MimeType.class);

	private final HttpServer serverMock = mock(HttpServer.class);

	//Sapient generated method id: ${0263efdf-b2b2-3c4f-9608-2b5474d1095c}, hash: 45DDC847B3F3AE990477A752894507B2
	@Disabled()
	@Test()
	void applyWhenObjectUtilsIsEmptyExcludedUserAgents() {
		/* Branches:
		 * (!this.compression.getMinResponseSize().isNegative()) : true
		 * (ObjectUtils.isEmpty(mimeTypeValues)) : true  #  inside getMimeTypesPredicate method
		 * (ObjectUtils.isEmpty(excludedUserAgents)) : true  #  inside getExcludedUserAgentsPredicate method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(httpServerMock).when(serverMock).compress(0);
		doReturn(httpServerMock2).when(httpServerMock).compress(biPredicateMock);
		doReturn(false).when(dataSizeMock).isNegative();
		doReturn(0L).when(dataSizeMock).toBytes();
		String[] stringArray = new String[] {};
		String[] stringArray2 = new String[] {};
		Compression compression = new Compression();
		compression.setMinResponseSize(dataSizeMock);
		compression.setExcludedUserAgents(stringArray);
		compression.setMimeTypes(stringArray2);
		CompressionCustomizer target = new CompressionCustomizer(compression);
		//Act Statement(s)
		HttpServer result = target.apply(serverMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(httpServerMock2));
			verify(serverMock).compress(0);
			verify(httpServerMock).compress(biPredicateMock);
			verify(dataSizeMock).isNegative();
			verify(dataSizeMock).toBytes();
		});
	}

	//Sapient generated method id: ${955b9637-0678-382c-b30a-1e872fea7a40}, hash: 58799CE8DD6AF5A8FC151B8891B1C6C1
	@Disabled()
	@Test()
	void applyWhenArraysStreamExcludedUserAgentsNoneMatchHeadersContainsHttpHeaderNamesUSER_AGENTCandidateTrue() {
		/* Branches:
		 * (!this.compression.getMinResponseSize().isNegative()) : true
		 * (ObjectUtils.isEmpty(mimeTypeValues)) : true  #  inside getMimeTypesPredicate method
		 * (ObjectUtils.isEmpty(excludedUserAgents)) : false  #  inside getExcludedUserAgentsPredicate method
		 * (Arrays.stream(excludedUserAgents).noneMatch((candidate) -> headers.contains(HttpHeaderNames.USER_AGENT, candidate, true))) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
			doReturn(httpServerMock).when(serverMock).compress(0);
			doReturn(httpServerMock2).when(httpServerMock).compress(biPredicateMock);
			doReturn(false).when(dataSizeMock).isNegative();
			doReturn(0L).when(dataSizeMock).toBytes();
			String[] stringArray = new String[] {};
			objectUtils.when(() -> ObjectUtils.isEmpty(stringArray)).thenReturn(true);
			String[] stringArray2 = new String[] {};
			objectUtils.when(() -> ObjectUtils.isEmpty(stringArray2)).thenReturn(false);
			Compression compression = new Compression();
			compression.setMinResponseSize(dataSizeMock);
			compression.setExcludedUserAgents(stringArray2);
			compression.setMimeTypes(stringArray);
			CompressionCustomizer target = new CompressionCustomizer(compression);
			//Act Statement(s)
			HttpServer result = target.apply(serverMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(httpServerMock2));
				verify(serverMock).compress(0);
				verify(httpServerMock).compress(biPredicateMock);
				verify(dataSizeMock).isNegative();
				verify(dataSizeMock).toBytes();
				objectUtils.verify(() -> ObjectUtils.isEmpty(stringArray), atLeast(1));
				objectUtils.verify(() -> ObjectUtils.isEmpty(stringArray2), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e4103881-f17c-3166-9f39-f408c70f933c}, hash: 8DE6E743ED92B18673A6E7545F75F4AE
	@Disabled()
	@Test()
	void applyWhenStringUtilsNotHasLengthContentType() {
		/* Branches:
		 * (!this.compression.getMinResponseSize().isNegative()) : true
		 * (ObjectUtils.isEmpty(mimeTypeValues)) : false  #  inside getMimeTypesPredicate method
		 * (ObjectUtils.isEmpty(excludedUserAgents)) : false  #  inside getExcludedUserAgentsPredicate method
		 * (Arrays.stream(excludedUserAgents).noneMatch((candidate) -> headers.contains(HttpHeaderNames.USER_AGENT, candidate, true))) : false
		 * (!StringUtils.hasLength(contentType)) : true  #  inside lambda$getMimeTypesPredicate$2 method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
			doReturn(httpServerMock).when(serverMock).compress(0);
			doReturn(httpServerMock2).when(httpServerMock).compress(biPredicateMock);
			doReturn(false).when(dataSizeMock).isNegative();
			doReturn(0L).when(dataSizeMock).toBytes();
			String[] stringArray = new String[] {};
			objectUtils.when(() -> ObjectUtils.isEmpty(stringArray)).thenReturn(false);
			String[] stringArray2 = new String[] {};
			objectUtils.when(() -> ObjectUtils.isEmpty(stringArray2)).thenReturn(false);
			Compression compression = new Compression();
			compression.setMinResponseSize(dataSizeMock);
			compression.setExcludedUserAgents(stringArray2);
			compression.setMimeTypes(stringArray);
			CompressionCustomizer target = new CompressionCustomizer(compression);
			//Act Statement(s)
			HttpServer result = target.apply(serverMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(httpServerMock2));
				verify(serverMock).compress(0);
				verify(httpServerMock).compress(biPredicateMock);
				verify(dataSizeMock).isNegative();
				verify(dataSizeMock).toBytes();
				objectUtils.verify(() -> ObjectUtils.isEmpty(stringArray), atLeast(1));
				objectUtils.verify(() -> ObjectUtils.isEmpty(stringArray2), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ae89a5c9-1f5c-3e18-bc6d-ed2890f43d61}, hash: EAF0E228EEB57E70DCE31490F4E77C59
	@Disabled()
	@Test()
	void applyWhenMimeTypesStreamIsEmptyAnyMatchCandidateIsCompatibleWithContentMimeTypeIsEmpty() {
		/* Branches:
		 * (!this.compression.getMinResponseSize().isNegative()) : true
		 * (ObjectUtils.isEmpty(mimeTypeValues)) : false  #  inside getMimeTypesPredicate method
		 * (ObjectUtils.isEmpty(excludedUserAgents)) : false  #  inside getExcludedUserAgentsPredicate method
		 * (Arrays.stream(excludedUserAgents).noneMatch((candidate) -> headers.contains(HttpHeaderNames.USER_AGENT, candidate, true))) : false
		 * (!StringUtils.hasLength(contentType)) : false  #  inside lambda$getMimeTypesPredicate$2 method
		 * (mimeTypes.stream().anyMatch((candidate) -> candidate.isCompatibleWith(contentMimeType))) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MimeTypeUtils> mimeTypeUtils = mockStatic(MimeTypeUtils.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
			doReturn(httpServerMock).when(serverMock).compress(0);
			doReturn(httpServerMock2).when(httpServerMock).compress(biPredicateMock);
			doReturn(false).when(dataSizeMock).isNegative();
			doReturn(0L).when(dataSizeMock).toBytes();
			String[] stringArray = new String[] {};
			objectUtils.when(() -> ObjectUtils.isEmpty(stringArray)).thenReturn(false);
			String[] stringArray2 = new String[] {};
			objectUtils.when(() -> ObjectUtils.isEmpty(stringArray2)).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("")).thenReturn(true);
			mimeTypeUtils.when(() -> MimeTypeUtils.parseMimeType("")).thenReturn(mimeTypeMock);
			Compression compression = new Compression();
			compression.setMinResponseSize(dataSizeMock);
			compression.setExcludedUserAgents(stringArray2);
			compression.setMimeTypes(stringArray);
			CompressionCustomizer target = new CompressionCustomizer(compression);
			//Act Statement(s)
			HttpServer result = target.apply(serverMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(httpServerMock2));
				verify(serverMock).compress(0);
				verify(httpServerMock).compress(biPredicateMock);
				verify(dataSizeMock).isNegative();
				verify(dataSizeMock).toBytes();
				objectUtils.verify(() -> ObjectUtils.isEmpty(stringArray), atLeast(1));
				objectUtils.verify(() -> ObjectUtils.isEmpty(stringArray2), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength(""), atLeast(1));
				mimeTypeUtils.verify(() -> MimeTypeUtils.parseMimeType(""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${bb542f5c-741f-3b1e-9c2b-087478f1b2d1}, hash: 1E2FD73A9D5AA100DA3C67F99A706C81
	@Disabled()
	@Test()
	void applyWhenMimeTypesStreamIsEmptyAnyMatchCandidateIsCompatibleWithContentMimeType() {
		/* Branches:
		 * (!this.compression.getMinResponseSize().isNegative()) : true
		 * (ObjectUtils.isEmpty(mimeTypeValues)) : false  #  inside getMimeTypesPredicate method
		 * (ObjectUtils.isEmpty(excludedUserAgents)) : false  #  inside getExcludedUserAgentsPredicate method
		 * (Arrays.stream(excludedUserAgents).noneMatch((candidate) -> headers.contains(HttpHeaderNames.USER_AGENT, candidate, true))) : false
		 * (!StringUtils.hasLength(contentType)) : false  #  inside lambda$getMimeTypesPredicate$2 method
		 * (mimeTypes.stream().anyMatch((candidate) -> candidate.isCompatibleWith(contentMimeType))) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MimeTypeUtils> mimeTypeUtils = mockStatic(MimeTypeUtils.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
			doReturn(httpServerMock).when(serverMock).compress(0);
			doReturn(httpServerMock2).when(httpServerMock).compress(biPredicateMock);
			doReturn(false).when(dataSizeMock).isNegative();
			doReturn(0L).when(dataSizeMock).toBytes();
			String[] stringArray = new String[] {};
			objectUtils.when(() -> ObjectUtils.isEmpty(stringArray)).thenReturn(false);
			String[] stringArray2 = new String[] {};
			objectUtils.when(() -> ObjectUtils.isEmpty(stringArray2)).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("")).thenReturn(true);
			mimeTypeUtils.when(() -> MimeTypeUtils.parseMimeType("")).thenReturn(mimeTypeMock);
			Compression compression = new Compression();
			compression.setMinResponseSize(dataSizeMock);
			compression.setExcludedUserAgents(stringArray2);
			compression.setMimeTypes(stringArray);
			CompressionCustomizer target = new CompressionCustomizer(compression);
			//Act Statement(s)
			HttpServer result = target.apply(serverMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(httpServerMock2));
				verify(serverMock).compress(0);
				verify(httpServerMock).compress(biPredicateMock);
				verify(dataSizeMock).isNegative();
				verify(dataSizeMock).toBytes();
				objectUtils.verify(() -> ObjectUtils.isEmpty(stringArray), atLeast(1));
				objectUtils.verify(() -> ObjectUtils.isEmpty(stringArray2), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength(""), atLeast(1));
				mimeTypeUtils.verify(() -> MimeTypeUtils.parseMimeType(""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${91fb3902-65d9-3e08-8055-6f8f286de3f0}, hash: A3AA462BEA66F2080A77FB0925563F18
	@Disabled()
	@Test()
	void applyWhenCaughtInvalidMimeTypeException() {
		/* Branches:
		 * (!this.compression.getMinResponseSize().isNegative()) : true
		 * (ObjectUtils.isEmpty(mimeTypeValues)) : false  #  inside getMimeTypesPredicate method
		 * (ObjectUtils.isEmpty(excludedUserAgents)) : false  #  inside getExcludedUserAgentsPredicate method
		 * (Arrays.stream(excludedUserAgents).noneMatch((candidate) -> headers.contains(HttpHeaderNames.USER_AGENT, candidate, true))) : false
		 * (!StringUtils.hasLength(contentType)) : false  #  inside lambda$getMimeTypesPredicate$2 method
		 * (mimeTypes.stream().anyMatch((candidate) -> candidate.isCompatibleWith(contentMimeType))) : true
		 * (catch-exception (InvalidMimeTypeException)) : true  #  inside lambda$getMimeTypesPredicate$2 method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MimeTypeUtils> mimeTypeUtils = mockStatic(MimeTypeUtils.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
			doReturn(httpServerMock).when(serverMock).compress(0);
			doReturn(httpServerMock2).when(httpServerMock).compress(biPredicateMock);
			doReturn(false).when(dataSizeMock).isNegative();
			doReturn(0L).when(dataSizeMock).toBytes();
			String[] stringArray = new String[] {};
			objectUtils.when(() -> ObjectUtils.isEmpty(stringArray)).thenReturn(false);
			String[] stringArray2 = new String[] {};
			objectUtils.when(() -> ObjectUtils.isEmpty(stringArray2)).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("")).thenReturn(true);
			mimeTypeUtils.when(() -> MimeTypeUtils.parseMimeType("")).thenReturn(mimeTypeMock);
			Compression compression = new Compression();
			compression.setMinResponseSize(dataSizeMock);
			compression.setExcludedUserAgents(stringArray2);
			compression.setMimeTypes(stringArray);
			CompressionCustomizer target = new CompressionCustomizer(compression);
			//Act Statement(s)
			HttpServer result = target.apply(serverMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(httpServerMock2));
				verify(serverMock).compress(0);
				verify(httpServerMock).compress(biPredicateMock);
				verify(dataSizeMock).isNegative();
				verify(dataSizeMock).toBytes();
				objectUtils.verify(() -> ObjectUtils.isEmpty(stringArray), atLeast(1));
				objectUtils.verify(() -> ObjectUtils.isEmpty(stringArray2), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength(""), atLeast(1));
				mimeTypeUtils.verify(() -> MimeTypeUtils.parseMimeType(""), atLeast(1));
			});
		}
	}
}
