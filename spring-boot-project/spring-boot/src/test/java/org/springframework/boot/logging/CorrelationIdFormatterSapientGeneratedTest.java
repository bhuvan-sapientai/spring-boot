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

    private final CorrelationIdFormatter correlationIdFormatterMock = mock(CorrelationIdFormatter.class);

    private final UnaryOperator unaryOperatorMock = mock(UnaryOperator.class);

    //Sapient generated method id: ${formatTest}, hash: CC608D017C406F22D27DFE9162B673E7
    @Disabled()
    @Test()
    void formatTest() throws IOException {
        //Arrange Statement(s)
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

    //Sapient generated method id: ${formatToWhenThisPartsStreamIsEmptyAnyMatchCanResolve}, hash: C9DE7F10FBA12B0CCA0C151134185E60
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
            //Act Statement(s)
            target.formatTo(unaryOperatorMock, appendableMock);
            //Assert statement(s)
            assertAll("result", () -> {
                stringUtils.verify(() -> StringUtils.hasText("C"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasLength("D"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasLength("E"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${formatToWhenCaughtIOExceptionThrowsUncheckedIOException}, hash: 3B5B4ED6CBED005562F0A8ED3E69D40D
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
            doReturn(appendableMock2).when(appendableMock).append((String) null);
            stringUtils.when(() -> StringUtils.hasText("C")).thenReturn(false);
            stringUtils.when(() -> StringUtils.hasLength("D")).thenReturn(false);
            stringUtils.when(() -> StringUtils.hasLength("E")).thenReturn(false);
            CorrelationIdFormatter target = CorrelationIdFormatter.of("C");
            //Act Statement(s)
            final UncheckedIOException result = assertThrows(UncheckedIOException.class, () -> {
                target.formatTo(unaryOperatorMock, appendableMock);
            });
            IOException iOException = new IOException();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                verify(appendableMock).append((String) null);
                stringUtils.verify(() -> StringUtils.hasText("C"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasLength("D"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasLength("E"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${formatToWhenIteratorHasNext}, hash: BCCBF438B4ACA411CDFD038068F48114
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
            //Act Statement(s)
            target.formatTo(unaryOperatorMock, appendableMock);
            //Assert statement(s)
            assertAll("result", () -> stringUtils.verify(() -> StringUtils.hasText("E"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${formatToWhenIteratorHasNextAndCaughtIOExceptionThrowsUncheckedIOException}, hash: FE6B1446EE1BD85BCE8E587BE581CC59
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
        Appendable appendableMock3 = mock(Appendable.class);
        Appendable appendableMock4 = mock(Appendable.class);
        Appendable appendableMock5 = mock(Appendable.class);
        Appendable appendableMock6 = mock(Appendable.class);
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class, CALLS_REAL_METHODS)) {
            doReturn(appendableMock2).when(appendableMock).append('[');
            doReturn(appendableMock4).when(appendableMock).append('-');
            doReturn(appendableMock3, appendableMock5).when(appendableMock).append("return_of_resolve1");
            doReturn(appendableMock6).when(appendableMock).append("] ");
            stringUtils.when(() -> StringUtils.hasText("E")).thenReturn(false);
            CorrelationIdFormatter target = CorrelationIdFormatter.of("E");
            //Act Statement(s)
            final UncheckedIOException result = assertThrows(UncheckedIOException.class, () -> {
                target.formatTo(unaryOperatorMock, appendableMock);
            });
            IOException iOException = new IOException();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                verify(appendableMock, atLeast(1)).append('[');
                verify(appendableMock, times(2)).append("return_of_resolve1");
                verify(appendableMock, atLeast(1)).append('-');
                verify(appendableMock, atLeast(1)).append("] ");
                stringUtils.verify(() -> StringUtils.hasText("E"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toStringTest}, hash: D27CE17A3B3F6E14A1FA538DFFA60FFC
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
                assertThat(result, equalTo("correlationIdFormatter.Part,correlationIdFormatter.Part2"));
                stringUtils.verify(() -> StringUtils.hasText("E"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ofWhenStringUtilsHasTextSpec}, hash: 3AE82F86CF8947BDDE34C06F37ACB797
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

    //Sapient generated method id: ${ofWhenCaughtExceptionThrowsIllegalStateException}, hash: 1C3E8DA5D71D1E86C5CE96B8D4F3D06D
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

    //Sapient generated method id: ${of1WhenSpecIsNotNull}, hash: 9D840AC38FA9812F70D2BD2C827B84C1
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

    //Sapient generated method id: ${of1WhenSpecIsNull}, hash: EFBD7E59DAD7BD71BAD925EE70953007
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

    //Sapient generated method id: ${of2WhenCollectionUtilsNotIsEmptySpec}, hash: CBF269D808CFE24B120DD84ECB6F1915
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
