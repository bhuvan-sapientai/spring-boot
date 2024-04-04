package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import io.undertow.predicate.Predicates;
import io.undertow.attribute.ExchangeAttribute;
import io.undertow.predicate.Predicate;
import org.mockito.MockedStatic;

import org.springframework.util.unit.DataSize;
import org.springframework.boot.web.server.Compression;

import io.undertow.server.HttpHandler;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CompressionHttpHandlerFactorySapientGeneratedTest {

	private final HttpHandler httpHandlerMock = mock(HttpHandler.class);

	//Sapient generated method id: ${4d2dfd2c-fa93-3fb7-b24b-408fe7e662c0}, hash: 7908E1C432D328B0DA1593DDFDCC17CD
	@Test()
	void getHandlerWhenThisCompressionNotGetEnabled() {
		/* Branches:
		 * (!this.compression.getEnabled()) : true
		 */
		//Arrange Statement(s)
		Compression compression = new Compression();
		compression.setEnabled(false);
		CompressionHttpHandlerFactory target = new CompressionHttpHandlerFactory(compression);

		//Act Statement(s)
		HttpHandler result = target.getHandler(httpHandlerMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(httpHandlerMock)));
	}

	//Sapient generated method id: ${f2eddcf4-047f-3e4d-a740-fdab8d20e36e}, hash: 5D44E7C9556DCBD9ACD12A46AD2D61B1
	@Test()
	void getHandlerWhenCompressionGetExcludedUserAgentsIsNotEmpty() {
		/* Branches:
		 * (!this.compression.getEnabled()) : false
		 * (compression.getExcludedUserAgents() != null) : true  #  inside getCompressionPredicates method
		 * (for-each(compression.getExcludedUserAgents())) : true  #  inside getCompressionPredicates method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type EncodingHandler, repository
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DataSize dataSizeMock = mock(DataSize.class);
		Predicate predicateMock = mock(Predicate.class);
		Predicate predicateMock2 = mock(Predicate.class);
		Predicate predicateMock3 = mock(Predicate.class);
		try (MockedStatic<Predicates> predicates = mockStatic(Predicates.class)) {
			doReturn(1L).when(dataSizeMock).toBytes();
			predicates.when(() -> Predicates.regex((ExchangeAttribute) any(), eq("excludedUserAgentsItem1"))).thenReturn(predicateMock);
			predicates.when(() -> Predicates.not(predicateMock)).thenReturn(predicateMock2);
			Predicate[] predicateArray = new Predicate[] { null, null, predicateMock2 };
			predicates.when(() -> Predicates.and(predicateArray)).thenReturn(predicateMock3);
			String[] stringArray = new String[] { "excludedUserAgentsItem1" };
			String[] stringArray2 = new String[] {};
			Compression compression = new Compression();
			compression.setMinResponseSize(dataSizeMock);
			compression.setExcludedUserAgents(stringArray);
			compression.setMimeTypes(stringArray2);
			compression.setEnabled(true);
			CompressionHttpHandlerFactory target = new CompressionHttpHandlerFactory(compression);
			//Act Statement(s)
			HttpHandler result = target.getHandler(httpHandlerMock);
			//Assert statement(s)
			//TODO: Please implement equals method in EncodingHandler for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(dataSizeMock).toBytes();
				predicates.verify(() -> Predicates.regex((ExchangeAttribute) any(), eq("excludedUserAgentsItem1")));
				predicates.verify(() -> Predicates.not(predicateMock), atLeast(1));
				predicates.verify(() -> Predicates.and(predicateArray), atLeast(1));
			});
		}
	}
}
