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
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CorrelationIdFormatterSapientGeneratedTest {

	private final CorrelationIdFormatter correlationIdFormatterMock = mock(CorrelationIdFormatter.class);

	//Sapient generated method id: ${d2023724-fb02-31bf-8f56-c852070520c4}
	@Disabled()
	@Test()
	void formatTest() throws IOException {
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("E")).thenReturn(false);
			CorrelationIdFormatter target = spy(CorrelationIdFormatter.of("E"));
			StringBuilder stringBuilder = new StringBuilder();
			doNothing().when(target).formatTo((UnaryOperator) null, stringBuilder);
			//TODO: Needs initialization with real value
			UnaryOperator unaryOperator = null;
			//Act Statement(s)
			String result = target.format(unaryOperator);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(""));
				stringUtils.verify(() -> StringUtils.hasText("E"), atLeast(1));
				verify(target).formatTo((UnaryOperator) null, stringBuilder);
			});
		}
	}

	//Sapient generated method id: ${83c88c60-ab14-31cc-bc14-58c76a26baa1}
	@Disabled()
	@Test()
	void formatToWhenThisPartsStreamIsEmptyAnyMatchCanResolve() throws IOException {
		/* Branches:
		 * (branch expression (line 100)) : false
		 * (this.parts.stream().anyMatch(canResolve)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("C")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("D")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("E")).thenReturn(false);
			CorrelationIdFormatter target = CorrelationIdFormatter.of("C");
			//TODO: Needs initialization with real value
			UnaryOperator unaryOperator = null;
			//TODO: Needs initialization with real value
			Appendable appendable = null;
			//Act Statement(s)
			target.formatTo(unaryOperator, appendable);
			//Assert statement(s)
			assertAll("result", () -> {
				stringUtils.verify(() -> StringUtils.hasText("C"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("D"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("E"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${82d974c4-f951-3f10-b629-2121282233e6}
	@Disabled()
	@Test()
	void formatToWhenCaughtIOExceptionThrowsUncheckedIOException() throws IOException {
		/* Branches:
		 * (branch expression (line 100)) : false
		 * (this.parts.stream().anyMatch(canResolve)) : false
		 * (catch-exception (IOException)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("C")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("D")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("E")).thenReturn(false);
			CorrelationIdFormatter target = CorrelationIdFormatter.of("C");
			//TODO: Needs initialization with real value
			UnaryOperator unaryOperator = null;
			//TODO: Needs initialization with real value
			Appendable appendable = null;
			//Act Statement(s)
			final UncheckedIOException result = assertThrows(UncheckedIOException.class, () -> {
				target.formatTo(unaryOperator, appendable);
			});
			IOException iOException = new IOException();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
				stringUtils.verify(() -> StringUtils.hasText("C"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("D"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("E"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${1fcb0a7a-83fc-3167-9ab2-07cd36eb76a1}
	@Disabled()
	@Test()
	void formatToWhenIteratorHasNext() throws IOException {
		/* Branches:
		 * (branch expression (line 100)) : true
		 * (this.parts.stream().anyMatch(canResolve)) : true
		 * (iterator.hasNext()) : true
		 * (iterator.hasNext()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class, CALLS_REAL_METHODS)) {
			stringUtils.when(() -> StringUtils.hasText("E")).thenReturn(false);
			CorrelationIdFormatter target = CorrelationIdFormatter.of("E");
			//TODO: Needs initialization with real value
			UnaryOperator unaryOperator = null;
			//TODO: Needs initialization with real value
			Appendable appendable = null;
			//Act Statement(s)
			target.formatTo(unaryOperator, appendable);
			//Assert statement(s)
			assertAll("result", () -> stringUtils.verify(() -> StringUtils.hasText("E"), atLeast(1)));
		}
	}

	//Sapient generated method id: ${6d9cf4a0-6aaa-30f1-b831-613f596f3994}
	@Disabled()
	@Test()
	void formatToWhenIteratorHasNextAndCaughtIOExceptionThrowsUncheckedIOException() throws IOException {
		/* Branches:
		 * (branch expression (line 100)) : true
		 * (this.parts.stream().anyMatch(canResolve)) : true
		 * (iterator.hasNext()) : true
		 * (iterator.hasNext()) : true
		 * (catch-exception (IOException)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class, CALLS_REAL_METHODS)) {
			stringUtils.when(() -> StringUtils.hasText("E")).thenReturn(false);
			CorrelationIdFormatter target = CorrelationIdFormatter.of("E");
			//TODO: Needs initialization with real value
			UnaryOperator unaryOperator = null;
			//TODO: Needs initialization with real value
			Appendable appendable = null;
			//Act Statement(s)
			final UncheckedIOException result = assertThrows(UncheckedIOException.class, () -> {
				target.formatTo(unaryOperator, appendable);
			});
			IOException iOException = new IOException();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
				stringUtils.verify(() -> StringUtils.hasText("E"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
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

	//Sapient generated method id: ${f3ba60e9-cbe8-3cbb-9d8f-74659126a903}
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

	//Sapient generated method id: ${2c025d1b-adcb-37ae-a89b-60faac205523}
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

	//Sapient generated method id: ${3a1a496c-b455-3b5e-8cce-bcf9bee59a5b}
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

	//Sapient generated method id: ${f6fce22c-d0c8-35df-8d25-b28310236dca}
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

	//Sapient generated method id: ${4e427c62-52ad-38b5-a382-6a79d0f67690}
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
				verify(correlationIdFormatterPartMock).blank();
				correlationIdFormatterPart.verify(() -> CorrelationIdFormatter.Part.of("spanId(16)"), atLeast(1));
				verify(correlationIdFormatterPartMock2).blank();
			});
		}
	}
}
