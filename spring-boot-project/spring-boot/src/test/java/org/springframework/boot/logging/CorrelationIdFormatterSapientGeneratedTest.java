package org.springframework.boot.logging;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.io.UncheckedIOException;

import org.springframework.util.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.function.UnaryOperator;
import java.util.Collection;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.doThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CorrelationIdFormatterSapientGeneratedTest {

	private final Appendable appendableMock = mock(Appendable.class);

	private final Appendable appendableMock2 = mock(Appendable.class);

	private final Appendable appendableMock3 = mock(Appendable.class);

	private final Appendable appendableMock4 = mock(Appendable.class);

	private final Appendable appendableMock5 = mock(Appendable.class);

	private final CorrelationIdFormatter correlationIdFormatterMock = mock(CorrelationIdFormatter.class);

	private final IOException iOExceptionMock = mock(IOException.class);

	private final UnaryOperator resolverMock = mock(UnaryOperator.class);

	//Sapient generated method id: ${d2023724-fb02-31bf-8f56-c852070520c4}, hash: 7D04D6EFE3CA6FCB0E9997BD47BF899F
	@Disabled()
	@Test()
	void formatTest() throws IOException {
		//Arrange Statement(s)
		UnaryOperator unaryOperatorMock = mock(UnaryOperator.class);
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("E")).thenReturn(false);
			CorrelationIdFormatter target = spy(CorrelationIdFormatter.of("E"));
			StringBuilder stringBuilder = new StringBuilder();
			doNothing().when(target).formatTo(unaryOperatorMock, stringBuilder);
			//Act Statement(s)
			String result = target.format(unaryOperatorMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(""));
				stringUtils.verify(() -> StringUtils.hasText("E"), atLeast(1));
				verify(target).formatTo(unaryOperatorMock, stringBuilder);
			});
		}
	}

	//Sapient generated method id: ${83c88c60-ab14-31cc-bc14-58c76a26baa1}, hash: 2055D98072C7AF4E092B46FD8FC3C35D
	@Disabled()
	@Test()
	void formatToWhenThisPartsStreamIsEmptyAnyMatchCanResolve() throws IOException {
		/* Branches:
		 * (branch expression (line 100)) : false
		 * (this.parts.stream().anyMatch(canResolve)) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("E").when(resolverMock).apply("return_of_name1");
			doReturn("F").when(resolverMock).apply("<String value>");
			doReturn(appendableMock2).when(appendableMock).append((String) null);
			stringUtils.when(() -> StringUtils.hasText("<String value>")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("E")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("F")).thenReturn(false);
			CorrelationIdFormatter target = CorrelationIdFormatter.of("<String value>");
			//Act Statement(s)
			target.formatTo(resolverMock, appendableMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(resolverMock).apply("return_of_name1");
				verify(resolverMock).apply("<String value>");
				verify(appendableMock).append((String) null);
				stringUtils.verify(() -> StringUtils.hasText("<String value>"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("E"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("F"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${82d974c4-f951-3f10-b629-2121282233e6}, hash: C9237D661EC6FC6A55262581FF93D930
	@Disabled()
	@Test()
	void formatToWhenCaughtIOExceptionThrowsUncheckedIOException() throws IOException {
		/* Branches:
		 * (branch expression (line 100)) : false
		 * (this.parts.stream().anyMatch(canResolve)) : false
		 * (catch-exception (IOException)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("E").when(resolverMock).apply("return_of_name1");
			doReturn("F").when(resolverMock).apply("<String value>");
			doThrow(iOExceptionMock).when(appendableMock).append((String) null);
			stringUtils.when(() -> StringUtils.hasText("<String value>")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("E")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("F")).thenReturn(false);
			CorrelationIdFormatter target = CorrelationIdFormatter.of("<String value>");
			//Act Statement(s)
			final UncheckedIOException result = assertThrows(UncheckedIOException.class, () -> {
				target.formatTo(resolverMock, appendableMock);
			});
			IOException iOException = new IOException();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
				verify(resolverMock).apply("return_of_name1");
				verify(resolverMock).apply("<String value>");
				verify(appendableMock).append((String) null);
				stringUtils.verify(() -> StringUtils.hasText("<String value>"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("E"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("F"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${1fcb0a7a-83fc-3167-9ab2-07cd36eb76a1}, hash: 50D2E7D21CE5E8D8ED10740FF3685443
	@Disabled()
	@Test()
	void formatToWhenIteratorHasNext() throws IOException {
		/* Branches:
		 * (branch expression (line 100)) : true
		 * (this.parts.stream().anyMatch(canResolve)) : true
		 * (iterator.hasNext()) : true
		 * (iterator.hasNext()) : true
		 */
		//Arrange Statement(s)
		Appendable appendableMock6 = mock(Appendable.class);
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class, CALLS_REAL_METHODS)) {
			doReturn("E").when(resolverMock).apply("<String value>");
			doReturn(appendableMock2).when(appendableMock).append('[');
			doReturn(appendableMock3).when(appendableMock).append("return_of_resolve1");
			doReturn(appendableMock4).when(appendableMock).append('-');
			doReturn(appendableMock5).when(appendableMock).append("<String value>");
			doReturn(appendableMock6).when(appendableMock).append("] ");
			stringUtils.when(() -> StringUtils.hasText("<String value>")).thenReturn(false);
			CorrelationIdFormatter target = CorrelationIdFormatter.of("<String value>");
			//Act Statement(s)
			target.formatTo(resolverMock, appendableMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(resolverMock, atLeast(1)).apply("<String value>");
				verify(appendableMock, atLeast(1)).append('[');
				verify(appendableMock, atLeast(1)).append("return_of_resolve1");
				verify(appendableMock, atLeast(1)).append('-');
				verify(appendableMock, atLeast(1)).append("<String value>");
				verify(appendableMock, atLeast(1)).append("] ");
				stringUtils.verify(() -> StringUtils.hasText("<String value>"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${6d9cf4a0-6aaa-30f1-b831-613f596f3994}, hash: F0428C7D1F94B67A6D6303E161950B42
	@Disabled()
	@Test()
	void formatToWhenIteratorHasNextAndCaughtIOExceptionThrowsUncheckedIOException() throws IOException {
		/* Branches:
		 * (branch expression (line 100)) : true
		 * (this.parts.stream().anyMatch(canResolve)) : true
		 * (iterator.hasNext()) : true
		 * (iterator.hasNext()) : true
		 * (catch-exception (IOException)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class, CALLS_REAL_METHODS)) {
			doReturn("E").when(resolverMock).apply("<String value>");
			doThrow(iOExceptionMock).when(appendableMock).append('[');
			doReturn(appendableMock3).when(appendableMock).append('-');
			doReturn(appendableMock2, appendableMock4).when(appendableMock).append("return_of_resolve1");
			doReturn(appendableMock5).when(appendableMock).append("] ");
			stringUtils.when(() -> StringUtils.hasText("<String value>")).thenReturn(false);
			CorrelationIdFormatter target = CorrelationIdFormatter.of("<String value>");
			//Act Statement(s)
			final UncheckedIOException result = assertThrows(UncheckedIOException.class, () -> {
				target.formatTo(resolverMock, appendableMock);
			});
			IOException iOException = new IOException();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
				verify(resolverMock, atLeast(1)).apply("<String value>");
				verify(appendableMock, atLeast(1)).append('[');
				verify(appendableMock, times(2)).append("return_of_resolve1");
				verify(appendableMock, atLeast(1)).append('-');
				verify(appendableMock, atLeast(1)).append("] ");
				stringUtils.verify(() -> StringUtils.hasText("<String value>"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 27E8680D32A35951088C9982C5D3F7FF
	@Disabled()
	@Test()
	void toStringTest() {
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("E")).thenReturn(false);
			CorrelationIdFormatter target = CorrelationIdFormatter.of("E");
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("of_correlationIdFormatter.Part1,of_correlationIdFormatter.Part2"));
				stringUtils.verify(() -> StringUtils.hasText("E"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f3ba60e9-cbe8-3cbb-9d8f-74659126a903}, hash: 3AE82F86CF8947BDDE34C06F37ACB797
	@Test()
	void ofWhenStringUtilsHasTextSpec() throws Exception {
		/* Branches:
		 * (!StringUtils.hasText(spec)) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<CorrelationIdFormatter> correlationIdFormatter = mockStatic(CorrelationIdFormatter.class, CALLS_REAL_METHODS)) {
			correlationIdFormatter.when(() -> CorrelationIdFormatter.of(anyList())).thenReturn(correlationIdFormatterMock);
			//Act Statement(s)
			CorrelationIdFormatter result = CorrelationIdFormatter.of("traceId(32),spanId(16)");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(correlationIdFormatterMock));
				correlationIdFormatter.verify(() -> CorrelationIdFormatter.of(anyList()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2c025d1b-adcb-37ae-a89b-60faac205523}, hash: 1C3E8DA5D71D1E86C5CE96B8D4F3D06D
	@Test()
	void ofWhenCaughtExceptionThrowsIllegalStateException() {
		/* Branches:
		 * (!StringUtils.hasText(spec)) : false
		 * (catch-exception (Exception)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<CorrelationIdFormatter> correlationIdFormatter = mockStatic(CorrelationIdFormatter.class, CALLS_REAL_METHODS)) {
			RuntimeException runtimeException = new RuntimeException();
			correlationIdFormatter.when(() -> CorrelationIdFormatter.of(anyList())).thenThrow(runtimeException);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				CorrelationIdFormatter.of("traceId(32),spanId(16)");
			});
			IllegalStateException illegalStateException = new IllegalStateException("Unable to parse correlation formatter spec 'traceId(32),spanId(16)'", runtimeException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
				correlationIdFormatter.verify(() -> CorrelationIdFormatter.of(anyList()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3a1a496c-b455-3b5e-8cce-bcf9bee59a5b}, hash: 9D840AC38FA9812F70D2BD2C827B84C1
	@Test()
	void of1WhenSpecIsNotNull() {
		/* Branches:
		 * (spec != null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<CorrelationIdFormatter> correlationIdFormatter = mockStatic(CorrelationIdFormatter.class, CALLS_REAL_METHODS)) {
			correlationIdFormatter.when(() -> CorrelationIdFormatter.of(anyList())).thenReturn(correlationIdFormatterMock);
			String[] stringArray = new String[] {};
			//Act Statement(s)
			CorrelationIdFormatter result = CorrelationIdFormatter.of(stringArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(correlationIdFormatterMock));
				correlationIdFormatter.verify(() -> CorrelationIdFormatter.of(anyList()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f6fce22c-d0c8-35df-8d25-b28310236dca}, hash: EFBD7E59DAD7BD71BAD925EE70953007
	@Test()
	void of1WhenSpecIsNull() {
		/* Branches:
		 * (spec != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<CorrelationIdFormatter> correlationIdFormatter = mockStatic(CorrelationIdFormatter.class, CALLS_REAL_METHODS)) {
			correlationIdFormatter.when(() -> CorrelationIdFormatter.of(anyList())).thenReturn(correlationIdFormatterMock);
			String[] string = null;
			//Act Statement(s)
			CorrelationIdFormatter result = CorrelationIdFormatter.of(string);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(correlationIdFormatterMock));
				correlationIdFormatter.verify(() -> CorrelationIdFormatter.of(anyList()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4e427c62-52ad-38b5-a382-6a79d0f67690}, hash: CBF269D808CFE24B120DD84ECB6F1915
	@Test()
	void of2WhenCollectionUtilsNotIsEmptySpec() {
		/* Branches:
		 * (CollectionUtils.isEmpty(spec)) : false
		 */
		//Arrange Statement(s)
		CorrelationIdFormatter.Part correlationIdFormatterPartMock = mock(CorrelationIdFormatter.Part.class);
		CorrelationIdFormatter.Part correlationIdFormatterPartMock2 = mock(CorrelationIdFormatter.Part.class);
		try (MockedStatic<CorrelationIdFormatter.Part> correlationIdFormatterPart = mockStatic(CorrelationIdFormatter.Part.class)) {
			correlationIdFormatterPart.when(() -> CorrelationIdFormatter.Part.of("traceId(32)")).thenReturn(correlationIdFormatterPartMock);
			doReturn("C").when(correlationIdFormatterPartMock).blank();
			correlationIdFormatterPart.when(() -> CorrelationIdFormatter.Part.of("spanId(16)")).thenReturn(correlationIdFormatterPartMock2);
			doReturn("D").when(correlationIdFormatterPartMock2).blank();
			List<String> stringList = new ArrayList<>(List.of("traceId(32)", "spanId(16)"));
			//Act Statement(s)
			CorrelationIdFormatter result = CorrelationIdFormatter.of((Collection) stringList);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				correlationIdFormatterPart.verify(() -> CorrelationIdFormatter.Part.of("traceId(32)"), atLeast(1));
				verify(correlationIdFormatterPartMock, atLeast(1)).blank();
				correlationIdFormatterPart.verify(() -> CorrelationIdFormatter.Part.of("spanId(16)"), atLeast(1));
				verify(correlationIdFormatterPartMock2, atLeast(1)).blank();
			});
		}
	}
}
