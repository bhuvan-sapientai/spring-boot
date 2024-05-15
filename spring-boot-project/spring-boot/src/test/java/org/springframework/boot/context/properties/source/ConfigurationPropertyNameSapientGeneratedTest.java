package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;
import java.util.function.Function;
import org.mockito.MockedStatic;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertyNameSapientGeneratedTest {

    private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

    private final Function functionMock = mock(Function.class);

    private final ConfigurationPropertyName n2Mock = mock(ConfigurationPropertyName.class);

    private final ConfigurationPropertyName nameMock = mock(ConfigurationPropertyName.class);

    //Sapient generated method id: ${isEmptyWhenThisElementsGetSizeEquals0}, hash: FE7C6A37CB2CC7D7F38A8F5A2F8A8221
    @Test()
    void isEmptyWhenThisElementsGetSizeEquals0() {
        /* Branches:
         * (this.elements.getSize() == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            boolean result = target.isEmpty();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isEmptyWhenThisElementsGetSizeNotEquals0}, hash: F924A8511D0D2CDE4168C5EA60922835
    @Disabled()
    @Test()
    void isEmptyWhenThisElementsGetSizeNotEquals0() {
        /* Branches:
         * (this.elements.getSize() == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            boolean result = target.isEmpty();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isLastElementIndexedWhenIsIndexedSizeMinus1}, hash: 4244957C4AE41B17F8472561779446E8
    @Disabled()
    @Test()
    void isLastElementIndexedWhenIsIndexedSizeMinus1() {
        /* Branches:
         * (size > 0) : true
         * (isIndexed(size - 1)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
            doReturn(true).when(target).isIndexed(0);
            //Act Statement(s)
            boolean result = target.isLastElementIndexed();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
                verify(target).isIndexed(0);
            });
        }
    }

    //Sapient generated method id: ${isLastElementIndexedWhenIsIndexedNotSizeMinus1}, hash: 50D27D1EC0F6D4140A949507AADB27CA
    @Disabled()
    @Test()
    void isLastElementIndexedWhenIsIndexedNotSizeMinus1() {
        /* Branches:
         * (size > 0) : true
         * (isIndexed(size - 1)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
            doReturn(false).when(target).isIndexed(0);
            //Act Statement(s)
            boolean result = target.isLastElementIndexed();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
                verify(target).isIndexed(0);
            });
        }
    }

    //Sapient generated method id: ${hasIndexedElementWhenIsIndexedI}, hash: 1FF1013B2B6D131BDD9E8680A6223C77
    @Disabled()
    @Test()
    void hasIndexedElementWhenIsIndexedI() {
        /* Branches:
         * (i < getNumberOfElements()) : true
         * (isIndexed(i)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
            doReturn(true).when(target).isIndexed(0);
            //Act Statement(s)
            boolean result = target.hasIndexedElement();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
                verify(target).isIndexed(0);
            });
        }
    }

    //Sapient generated method id: ${hasIndexedElementWhenIsIndexedNotI}, hash: 2DD900E8BF5EF5846109FB98235A9055
    @Disabled()
    @Test()
    void hasIndexedElementWhenIsIndexedNotI() {
        /* Branches:
         * (i < getNumberOfElements()) : true
         * (isIndexed(i)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
            doReturn(false).when(target).isIndexed(0);
            //Act Statement(s)
            boolean result = target.hasIndexedElement();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
                verify(target).isIndexed(0);
            });
        }
    }

    //Sapient generated method id: ${isIndexedWhenThisElementsGetTypeElementIndexIsIndexed}, hash: EEDB7F0337A0F34441113EEF10ACE178
    @Disabled()
    @Test()
    void isIndexedWhenThisElementsGetTypeElementIndexIsIndexed() {
        /* Branches:
         * (this.elements.getType(elementIndex).isIndexed()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            boolean result = target.isIndexed(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isIndexedWhenThisElementsGetTypeElementIndexNotIsIndexed}, hash: A4588263A8CF0AA1262C21000A55F450
    @Disabled()
    @Test()
    void isIndexedWhenThisElementsGetTypeElementIndexNotIsIndexed() {
        /* Branches:
         * (this.elements.getType(elementIndex).isIndexed()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            boolean result = target.isIndexed(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isNumericIndexWhenThisElementsGetTypeElementIndexEqualsElementTypeNUMERICALLY_INDEXED}, hash: 695941DFFAF79A56B1A0AD6940378966
    @Disabled()
    @Test()
    void isNumericIndexWhenThisElementsGetTypeElementIndexEqualsElementTypeNUMERICALLY_INDEXED() {
        /* Branches:
         * (this.elements.getType(elementIndex) == ElementType.NUMERICALLY_INDEXED) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            boolean result = target.isNumericIndex(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isNumericIndexWhenThisElementsGetTypeElementIndexNotEqualsElementTypeNUMERICALLY_INDEXED}, hash: 0AB5E77E928715407FA4DA7246082C57
    @Disabled()
    @Test()
    void isNumericIndexWhenThisElementsGetTypeElementIndexNotEqualsElementTypeNUMERICALLY_INDEXED() {
        /* Branches:
         * (this.elements.getType(elementIndex) == ElementType.NUMERICALLY_INDEXED) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            boolean result = target.isNumericIndex(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getLastElementWhenSizeNotEquals0}, hash: CBD755FAC9E39AF08BF08B650EC60F8A
    @Disabled()
    @Test()
    void getLastElementWhenSizeNotEquals0() {
        /* Branches:
         * (size != 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
            doReturn("return_of_getElement1").when(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
            //Act Statement(s)
            String result = target.getLastElement(ConfigurationPropertyName.Form.ORIGINAL);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getElement1"));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
                verify(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
            });
        }
    }

    //Sapient generated method id: ${getLastElementWhenSizeEquals0}, hash: EDBD2F0CC980D498BD690B2715C36529
    @Test()
    void getLastElementWhenSizeEquals0() {
        /* Branches:
         * (size != 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            String result = target.getLastElement(ConfigurationPropertyName.Form.ORIGINAL);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getElementWhenTypeIsIndexed}, hash: 681EFF68C47ED533D9BDCF70EC56B198
    @Disabled()
    @Test()
    void getElementWhenTypeIsIndexed() {
        /* Branches:
         * (type.isIndexed()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            String result = target.getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("charSequence"));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getElementWhenTypeNotEqualsElementTypeNON_UNIFORM}, hash: 521947FEFCD853A8EAA02FF168376A54
    @Disabled()
    @Test()
    void getElementWhenTypeNotEqualsElementTypeNON_UNIFORM() {
        /* Branches:
         * (type.isIndexed()) : false
         * (form == Form.ORIGINAL) : true
         * (type != ElementType.NON_UNIFORM) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            String result = target.getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("charSequence"));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getElementWhenTypeEqualsElementTypeDASHED}, hash: 55F26BD55CDCD08A8F03568503418408
    @Disabled()
    @Test()
    void getElementWhenTypeEqualsElementTypeDASHED() {
        /* Branches:
         * (type.isIndexed()) : false
         * (form == Form.ORIGINAL) : false
         * (form == Form.DASHED) : true
         * (type == ElementType.UNIFORM) : false
         * (type == ElementType.DASHED) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            String result = target.getElement(0, ConfigurationPropertyName.Form.DASHED);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("charSequence"));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getElementWhenTypeEqualsElementTypeUNIFORM}, hash: 09D0AB96DD1D2C945AD5645E8265ABF1
    @Disabled()
    @Test()
    void getElementWhenTypeEqualsElementTypeUNIFORM() {
        /* Branches:
         * (type.isIndexed()) : false
         * (form == Form.ORIGINAL) : false
         * (form == Form.DASHED) : false
         * (uniformElement == null) : true
         * (type != ElementType.UNIFORM) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            String result = target.getElement(0, ConfigurationPropertyName.Form.UNIFORM);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("charSequence"));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getElementWhenFilterTestChI}, hash: 73FB49B0C32BA99EE7050F22ED50067B
    @Disabled()
    @Test()
    void getElementWhenFilterTestChI() {
        /* Branches:
         * (type.isIndexed()) : false
         * (form == Form.ORIGINAL) : true
         * (type != ElementType.NON_UNIFORM) : false
         * (i < element.length()) : true  #  inside convertElement method
         * (lowercase) : false  #  inside convertElement method
         * (filter.test(ch, i)) : true  #  inside convertElement method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            String result = target.getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("B"));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getElementWhenLowercaseAndFilterTestChI}, hash: 4493B3A4F2BAFCB0796015035DB9CBEA
    @Disabled()
    @Test()
    void getElementWhenLowercaseAndFilterTestChI() {
        /* Branches:
         * (type.isIndexed()) : false
         * (form == Form.ORIGINAL) : false
         * (form == Form.DASHED) : true
         * (type == ElementType.UNIFORM) : false
         * (type == ElementType.DASHED) : false
         * (i < element.length()) : true  #  inside convertElement method
         * (lowercase) : true  #  inside convertElement method
         * (filter.test(ch, i)) : true  #  inside convertElement method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            String result = target.getElement(0, ConfigurationPropertyName.Form.DASHED);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("a"));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getElementWhenILessThanElementLengthAndLowercaseAndFilterTestChI}, hash: 5E63FE591E1FB00E3478D2F68806FDB7
    @Disabled()
    @Test()
    void getElementWhenILessThanElementLengthAndLowercaseAndFilterTestChI() {
        /* Branches:
         * (type.isIndexed()) : false
         * (form == Form.ORIGINAL) : false
         * (form == Form.DASHED) : false
         * (uniformElement == null) : true
         * (type != ElementType.UNIFORM) : true
         * (i < element.length()) : true  #  inside convertElement method
         * (lowercase) : true  #  inside convertElement method
         * (filter.test(ch, i)) : true  #  inside convertElement method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            String result = target.getElement(0, ConfigurationPropertyName.Form.UNIFORM);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getNumberOfElementsTest}, hash: B706E692DA30E4B296400A475D4958A2
    @Test()
    void getNumberOfElementsTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            int result = target.getNumberOfElements();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${appendWhenStringUtilsNotHasLengthSuffix}, hash: 875373D82952044D6EC3E816D1C33F1C
    @Test()
    void appendWhenStringUtilsNotHasLengthSuffix() {
        /* Branches:
         * (!StringUtils.hasLength(suffix)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            ConfigurationPropertyName result = target.append("");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(target));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${appendWhenNameIsNull}, hash: 4925AC4941DB6C7F9DE330A1FE3FD925
    @Disabled()
    @Test()
    void appendWhenNameIsNull() {
        /* Branches:
         * (!StringUtils.hasLength(suffix)) : false
         * (name == null) : true  #  inside elementsOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.hasLength((String) null)).thenReturn(true);
            _assert.when(() -> Assert.isTrue(false, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            ConfigurationPropertyName result = target.append((String) null);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasLength((String) null), atLeast(1));
                _assert.verify(() -> Assert.isTrue(false, "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${appendWhenNameIsEmpty}, hash: FF84FD1F61F6F6485154B2F27077966E
    @Test()
    void appendWhenNameIsEmpty() {
        /* Branches:
         * (!StringUtils.hasLength(suffix)) : false
         * (name == null) : false  #  inside elementsOf method
         * (name.isEmpty()) : true  #  inside elementsOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            stringUtils.when(() -> StringUtils.hasLength("")).thenReturn(true);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            ConfigurationPropertyName result = target.append("");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasLength(""), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${appendWhenNotReturnNullIfInvalidThrowsInvalidConfigurationPropertyNameException}, hash: C1B5A937CEF224516EE8D03FD754F2F9
    @Disabled()
    @Test()
    void appendWhenNotReturnNullIfInvalidThrowsInvalidConfigurationPropertyNameException() {
        /* Branches:
         * (!StringUtils.hasLength(suffix)) : false
         * (name == null) : false  #  inside elementsOf method
         * (name.isEmpty()) : false  #  inside elementsOf method
         * (name.charAt(0) == '.') : false  #  inside elementsOf method
         * (name.charAt(name.length() - 1) == '.') : true  #  inside elementsOf method
         * (returnNullIfInvalid) : false  #  inside elementsOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("name1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("name1", 'A', functionMock);
            //Act Statement(s)
            final InvalidConfigurationPropertyNameException result = assertThrows(InvalidConfigurationPropertyNameException.class, () -> {
                target.append("suffix1");
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull("name1", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${appendWhenElementsGetTypeINotEqualsElementTypeNON_UNIFORM}, hash: F5C7056E823078431CFEDD3D39D821CB
    @Disabled()
    @Test()
    void appendWhenElementsGetTypeINotEqualsElementTypeNON_UNIFORM() {
        /* Branches:
         * (!StringUtils.hasLength(suffix)) : false
         * (name == null) : false  #  inside elementsOf method
         * (name.isEmpty()) : false  #  inside elementsOf method
         * (name.charAt(0) == '.') : false  #  inside elementsOf method
         * (name.charAt(name.length() - 1) == '.') : false  #  inside elementsOf method
         * (i < elements.getSize()) : true  #  inside elementsOf method
         * (elements.getType(i) == ElementType.NON_UNIFORM) : false  #  inside elementsOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            ConfigurationPropertyName result = target.append("KQ");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${appendWhenElementsParserNotIsValidCharChCharIndexThrowsInvalidConfigurationPropertyNameException}, hash: B946D27CC98EAE71E238101758EB5D31
    @Test()
    void appendWhenElementsParserNotIsValidCharChCharIndexThrowsInvalidConfigurationPropertyNameException() {
        /* Branches:
         * (!StringUtils.hasLength(suffix)) : false
         * (name == null) : false  #  inside elementsOf method
         * (name.isEmpty()) : false  #  inside elementsOf method
         * (name.charAt(0) == '.') : false  #  inside elementsOf method
         * (name.charAt(name.length() - 1) == '.') : false  #  inside elementsOf method
         * (i < elements.getSize()) : true  #  inside elementsOf method
         * (elements.getType(i) == ElementType.NON_UNIFORM) : true  #  inside elementsOf method
         * (returnNullIfInvalid) : false  #  inside elementsOf method
         * (charIndex < elements.getLength(index)) : true  #  inside getInvalidChars method
         * (!ElementsParser.isValidChar(ch, charIndex)) : true  #  inside getInvalidChars method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            final InvalidConfigurationPropertyNameException result = assertThrows(InvalidConfigurationPropertyNameException.class, () -> {
                target.append("DE");
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${append1WhenSuffixIsNull}, hash: AFBE5466AEF4037B9D53A0E793A05873
    @Test()
    void append1WhenSuffixIsNull() {
        /* Branches:
         * (suffix == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            ConfigurationPropertyName configurationPropertyName = null;
            //Act Statement(s)
            ConfigurationPropertyName result = target.append(configurationPropertyName);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(target));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${append1WhenSuffixIsNotNull}, hash: 3444D59AF7B82F27824AEBEF64659420
    @Test()
    void append1WhenSuffixIsNotNull() {
        /* Branches:
         * (suffix == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("suffix-name1");
            //Act Statement(s)
            ConfigurationPropertyName result = target.append(configurationPropertyName);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getParentWhenNumberOfElementsLessThanOrEqualsTo1}, hash: 0A38608900D3BB65B918F9F7098353E7
    @Test()
    void getParentWhenNumberOfElementsLessThanOrEqualsTo1() {
        /* Branches:
         * (numberOfElements <= 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            ConfigurationPropertyName result = target.getParent();
            ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.EMPTY;
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configurationPropertyName));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getParentWhenNumberOfElementsGreaterThan1}, hash: 0499033C875A0F86672DDBE260270F22
    @Disabled()
    @Test()
    void getParentWhenNumberOfElementsGreaterThan1() {
        /* Branches:
         * (numberOfElements <= 1) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
            doReturn(configurationPropertyNameMock).when(target).chop(1);
            //Act Statement(s)
            ConfigurationPropertyName result = target.getParent();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configurationPropertyNameMock));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
                verify(target).chop(1);
            });
        }
    }

    //Sapient generated method id: ${chopWhenSizeGreaterThanOrEqualsToGetNumberOfElements}, hash: 771476C3907330DB98563E83362FEBBC
    @Test()
    void chopWhenSizeGreaterThanOrEqualsToGetNumberOfElements() {
        /* Branches:
         * (size >= getNumberOfElements()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            ConfigurationPropertyName result = target.chop(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(target));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${chopWhenSizeLessThanGetNumberOfElements}, hash: CF1BABBA7622E24B6748571C5776A0DC
    @Test()
    void chopWhenSizeLessThanGetNumberOfElements() {
        /* Branches:
         * (size >= getNumberOfElements()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            ConfigurationPropertyName result = target.chop(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${subNameWhenOffsetEquals0}, hash: 14A6B53C92F7C10A1239290A68A84D09
    @Test()
    void subNameWhenOffsetEquals0() {
        /* Branches:
         * (offset == 0) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            ConfigurationPropertyName result = target.subName(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(target));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${subNameWhenOffsetEqualsGetNumberOfElements}, hash: 4633FBB133D83C108980FC1960A04DED
    @Disabled()
    @Test()
    void subNameWhenOffsetEqualsGetNumberOfElements() {
        /* Branches:
         * (offset == 0) : false
         * (offset == getNumberOfElements()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            ConfigurationPropertyName result = target.subName(1);
            ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.EMPTY;
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configurationPropertyName));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${subNameWhenOffsetGreaterThanGetNumberOfElementsThrowsIndexOutOfBoundsException}, hash: 7C09BB85CF1D8FB139478AE7F6253DA2
    @Disabled()
    @Test()
    void subNameWhenOffsetGreaterThanGetNumberOfElementsThrowsIndexOutOfBoundsException() {
        /* Branches:
         * (offset == 0) : false
         * (offset == getNumberOfElements()) : false
         * (offset < 0) : false
         * (offset > getNumberOfElements()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
                target.subName(2);
            });
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Offset: 2, NumberOfElements: 2");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${subNameWhenOffsetNotGreaterThanGetNumberOfElements}, hash: 7ED12F808F4D5A1B97CD1BFAAE5ED5E8
    @Disabled()
    @Test()
    void subNameWhenOffsetNotGreaterThanGetNumberOfElements() {
        /* Branches:
         * (offset == 0) : false
         * (offset == getNumberOfElements()) : false
         * (offset < 0) : false
         * (offset > getNumberOfElements()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            ConfigurationPropertyName result = target.subName(1);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isParentOfWhenGetNumberOfElementsNotEqualsNameGetNumberOfElementsMinus1}, hash: 76CC69F4C43E09BD5876F07966A5D0AD
    @Test()
    void isParentOfWhenGetNumberOfElementsNotEqualsNameGetNumberOfElementsMinus1() {
        /* Branches:
         * (getNumberOfElements() != name.getNumberOfElements() - 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(0).when(nameMock).getNumberOfElements();
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            boolean result = target.isParentOf(nameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                verify(nameMock).getNumberOfElements();
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isParentOfWhenIsAncestorOfName}, hash: B599ABB6156B3B3B9B52092E0A173F8A
    @Test()
    void isParentOfWhenIsAncestorOfName() {
        /* Branches:
         * (getNumberOfElements() != name.getNumberOfElements() - 1) : false
         * (isAncestorOf(name)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(1).when(nameMock).getNumberOfElements();
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
            doReturn(true).when(target).isAncestorOf(nameMock);
            //Act Statement(s)
            boolean result = target.isParentOf(nameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                verify(nameMock).getNumberOfElements();
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
                verify(target).isAncestorOf(nameMock);
            });
        }
    }

    //Sapient generated method id: ${isParentOfWhenIsAncestorOfNotName}, hash: 66947C44A2A784D860D74264A44480DF
    @Test()
    void isParentOfWhenIsAncestorOfNotName() {
        /* Branches:
         * (getNumberOfElements() != name.getNumberOfElements() - 1) : false
         * (isAncestorOf(name)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(1).when(nameMock).getNumberOfElements();
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
            doReturn(false).when(target).isAncestorOf(nameMock);
            //Act Statement(s)
            boolean result = target.isParentOf(nameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                verify(nameMock).getNumberOfElements();
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
                verify(target).isAncestorOf(nameMock);
            });
        }
    }

    //Sapient generated method id: ${isAncestorOfWhenGetNumberOfElementsGreaterThanOrEqualsToNameGetNumberOfElements}, hash: 86F16DDAD66A248288280440B826C86B
    @Test()
    void isAncestorOfWhenGetNumberOfElementsGreaterThanOrEqualsToNameGetNumberOfElements() {
        /* Branches:
         * (getNumberOfElements() >= name.getNumberOfElements()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(0).when(nameMock).getNumberOfElements();
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            boolean result = target.isAncestorOf(nameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                verify(nameMock).getNumberOfElements();
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isAncestorOfWhenIGreaterThanOrEqualsTo0ThrowsNullPointerException}, hash: A359F2AB21F2F8E0E91189581A9E476E
    @Disabled()
    @Test()
    void isAncestorOfWhenIGreaterThanOrEqualsTo0ThrowsNullPointerException() {
        /* Branches:
         * (getNumberOfElements() >= name.getNumberOfElements()) : false
         * (i >= 0) : true  #  inside elementsEqual method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(1).when(nameMock).getNumberOfElements();
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            final NullPointerException result = assertThrows(NullPointerException.class, () -> {
                target.isAncestorOf(nameMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(nameMock).getNumberOfElements();
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isAncestorOfWhenILessThan0}, hash: 20942DF515AFFFC7F3680328912DFA6E
    @Test()
    void isAncestorOfWhenILessThan0() {
        /* Branches:
         * (getNumberOfElements() >= name.getNumberOfElements()) : false
         * (i >= 0) : false  #  inside elementsEqual method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(1).when(nameMock).getNumberOfElements();
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            boolean result = target.isAncestorOf(nameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                verify(nameMock).getNumberOfElements();
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${compareToWhenI2NotLessThanL2}, hash: 89945C582A085086A254C94DD8A6556C
    @Test()
    void compareToWhenI2NotLessThanL2() {
        /* Branches:
         * (i1 < l1) : false  #  inside compare method
         * (i2 < l2) : false  #  inside compare method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(0).when(n2Mock).getNumberOfElements();
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            int result = target.compareTo(n2Mock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                verify(n2Mock).getNumberOfElements();
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${compareToWhenI1NotLessThanL1AndI2LessThanL2ThrowsNullPointerException}, hash: 70C46C642CBB31C74C4B768C2F4DD3A1
    @Test()
    void compareToWhenI1NotLessThanL1AndI2LessThanL2ThrowsNullPointerException() {
        /* Branches:
         * (i1 < l1) : false  #  inside compare method
         * (i2 < l2) : true  #  inside compare method
         * (i1 < l1) : false  #  inside compare method
         * (i2 < l2) : true  #  inside compare method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(1).when(n2Mock).getNumberOfElements();
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            final NullPointerException result = assertThrows(NullPointerException.class, () -> {
                target.compareTo(n2Mock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(n2Mock).getNumberOfElements();
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${compareToWhenResultNotEquals0}, hash: 412A34BFF6E9FC339D63333D203B084E
    @Disabled()
    @Test()
    void compareToWhenResultNotEquals0() {
        /* Branches:
         * (i1 < l1) : true  #  inside compare method
         * (i1 < l1) : true  #  inside compare method
         * (i2 < l2) : false  #  inside compare method
         * (i1 < l1) : true  #  inside compare method
         * (i2 < l2) : false  #  inside compare method
         * (e1 == null) : true  #  inside compare method
         * (result != 0) : true  #  inside compare method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(0).when(n2Mock).getNumberOfElements();
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            int result = target.compareTo(n2Mock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(-1));
                verify(n2Mock).getNumberOfElements();
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${compareToWhenCaughtArrayIndexOutOfBoundsExceptionThrowsRuntimeException}, hash: 783B6F27688816BA54FD5A025E1D0386
    @Disabled()
    @Test()
    void compareToWhenCaughtArrayIndexOutOfBoundsExceptionThrowsRuntimeException() {
        /* Branches:
         * (i1 < l1) : true  #  inside compare method
         * (i1 < l1) : true  #  inside compare method
         * (i2 < l2) : false  #  inside compare method
         * (i1 < l1) : true  #  inside compare method
         * (i2 < l2) : false  #  inside compare method
         * (e1 == null) : true  #  inside compare method
         * (result != 0) : true  #  inside compare method
         * (catch-exception (ArrayIndexOutOfBoundsException)) : true  #  inside compare method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(0).when(n2Mock).getNumberOfElements();
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                target.compareTo(n2Mock);
            });
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getCause(), is(instanceOf(arrayIndexOutOfBoundsException.getClass())));
                verify(n2Mock).getNumberOfElements();
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${compareToWhenE2IsNullAndResultNotEquals0}, hash: 5EEA9AAE48F538091BA74C51279ED55A
    @Disabled()
    @Test()
    void compareToWhenE2IsNullAndResultNotEquals0() {
        /* Branches:
         * (i1 < l1) : true  #  inside compare method
         * (i1 < l1) : true  #  inside compare method
         * (i2 < l2) : false  #  inside compare method
         * (i1 < l1) : true  #  inside compare method
         * (i2 < l2) : false  #  inside compare method
         * (e1 == null) : false  #  inside compare method
         * (e2 == null) : true  #  inside compare method
         * (result != 0) : true  #  inside compare method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(0).when(n2Mock).getNumberOfElements();
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            int result = target.compareTo(n2Mock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(1));
                verify(n2Mock).getNumberOfElements();
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toStringWhenThisElementsCanShortcutWithSourceElementTypeUNIFORMElementTypeDASHED}, hash: CC6D0ABE5E12F597A64184D6E7B9B4FD
    @Disabled()
    @Test()
    void toStringWhenThisElementsCanShortcutWithSourceElementTypeUNIFORMElementTypeDASHED() {
        /* Branches:
         * (this.string == null) : true
         * (this.elements.canShortcutWithSource(ElementType.UNIFORM, ElementType.DASHED)) : true  #  inside buildToString method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("charSequence"));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toStringWhenIndexed}, hash: A96EF1A98AE7A3ADBB1323C4D975FE74
    @Disabled()
    @Test()
    void toStringWhenIndexed() {
        /* Branches:
         * (this.string == null) : true
         * (this.elements.canShortcutWithSource(ElementType.UNIFORM, ElementType.DASHED)) : false  #  inside buildToString method
         * (i < elements) : true  #  inside buildToString method
         * (!result.isEmpty()) : false  #  inside buildToString method
         * (indexed) : true  #  inside buildToString method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
            doReturn(true).when(target).isIndexed(0);
            doReturn("").when(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("[]"));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
                verify(target).isIndexed(0);
                verify(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
            });
        }
    }

    //Sapient generated method id: ${toStringWhenNotIndexed}, hash: A2A40C00B7647685F36197C47F04B3A5
    @Disabled()
    @Test()
    void toStringWhenNotIndexed() {
        /* Branches:
         * (this.string == null) : true
         * (this.elements.canShortcutWithSource(ElementType.UNIFORM, ElementType.DASHED)) : false  #  inside buildToString method
         * (i < elements) : true  #  inside buildToString method
         * (!result.isEmpty()) : false  #  inside buildToString method
         * (indexed) : false  #  inside buildToString method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
            doReturn(false).when(target).isIndexed(0);
            doReturn("").when(target).getElement(0, ConfigurationPropertyName.Form.DASHED);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(""));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
                verify(target).isIndexed(0);
                verify(target).getElement(0, ConfigurationPropertyName.Form.DASHED);
            });
        }
    }

    //Sapient generated method id: ${isValidWhenOfNameTrueIsNotNull}, hash: ECBF139F1E46FA2B9E0655A758FAFD4E
    @Test()
    void isValidWhenOfNameTrueIsNotNull() {
        /* Branches:
         * (of(name, true) != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class, CALLS_REAL_METHODS)) {
            configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(configurationPropertyNameMock);
            //Act Statement(s)
            boolean result = ConfigurationPropertyName.isValid("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isValidWhenOfNameTrueIsNull}, hash: 18A00DE52973278F7299EF19663EFD06
    @Test()
    void isValidWhenOfNameTrueIsNull() {
        /* Branches:
         * (of(name, true) != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class, CALLS_REAL_METHODS)) {
            configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(null);
            //Act Statement(s)
            boolean result = ConfigurationPropertyName.isValid("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ofTest}, hash: C58D1DA32F0E5F0831D21059B0D5A44C
    @Test()
    void ofTest() {
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class, CALLS_REAL_METHODS)) {
            configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", false)).thenReturn(configurationPropertyNameMock);
            //Act Statement(s)
            ConfigurationPropertyName result = ConfigurationPropertyName.of("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configurationPropertyNameMock));
                configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${ofIfValidTest}, hash: 953410A434F751E0831F0464EED9E6A1
    @Test()
    void ofIfValidTest() {
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class, CALLS_REAL_METHODS)) {
            configurationPropertyName.when(() -> ConfigurationPropertyName.of("name1", true)).thenReturn(configurationPropertyNameMock);
            //Act Statement(s)
            ConfigurationPropertyName result = ConfigurationPropertyName.ofIfValid("name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configurationPropertyNameMock));
                configurationPropertyName.verify(() -> ConfigurationPropertyName.of("name1", true), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${of1WhenElementsIsNull}, hash: E7200D38645C9B888E6ACBA47132B31E
    @Test()
    void of1WhenElementsIsNull() {
        /* Branches:
         * (name == null) : true  #  inside elementsOf method
         * (elements != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isTrue(false, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            CharSequence charSequence = null;
            //Act Statement(s)
            ConfigurationPropertyName result = ConfigurationPropertyName.of(charSequence, false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.isTrue(false, "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${of1WhenElementsIsNotNull}, hash: 15F3743A990808ED51B8700AA986D91D
    @Test()
    void of1WhenElementsIsNotNull() {
        /* Branches:
         * (name == null) : false  #  inside elementsOf method
         * (name.isEmpty()) : true  #  inside elementsOf method
         * (elements != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        ConfigurationPropertyName result = ConfigurationPropertyName.of((CharSequence) "", false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${of1WhenNotReturnNullIfInvalidThrowsInvalidConfigurationPropertyNameException}, hash: 52C44414C44B89C05A4A4DBF865C1EB6
    @Disabled()
    @Test()
    void of1WhenNotReturnNullIfInvalidThrowsInvalidConfigurationPropertyNameException() {
        /* Branches:
         * (name == null) : false  #  inside elementsOf method
         * (name.isEmpty()) : false  #  inside elementsOf method
         * (name.charAt(0) == '.') : false  #  inside elementsOf method
         * (name.charAt(name.length() - 1) == '.') : true  #  inside elementsOf method
         * (returnNullIfInvalid) : false  #  inside elementsOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        final InvalidConfigurationPropertyNameException result = assertThrows(InvalidConfigurationPropertyNameException.class, () -> {
            ConfigurationPropertyName.of((CharSequence) "name1", false);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${of1WhenReturnNullIfInvalidAndElementsIsNull}, hash: F74DC21624A901C33016BA9094289B0B
    @Test()
    void of1WhenReturnNullIfInvalidAndElementsIsNull() {
        /* Branches:
         * (name == null) : false  #  inside elementsOf method
         * (name.isEmpty()) : false  #  inside elementsOf method
         * (name.charAt(0) == '.') : false  #  inside elementsOf method
         * (name.charAt(name.length() - 1) == '.') : true  #  inside elementsOf method
         * (returnNullIfInvalid) : true  #  inside elementsOf method
         * (elements != null) : false
         */
        //Act Statement(s)
        ConfigurationPropertyName result = ConfigurationPropertyName.of((CharSequence) "example.", true);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${of1WhenElementsGetTypeINotEqualsElementTypeNON_UNIFORMAndElementsIsNotNull}, hash: B7F6046CC9277B1F7DA8E3A377764D90
    @Disabled()
    @Test()
    void of1WhenElementsGetTypeINotEqualsElementTypeNON_UNIFORMAndElementsIsNotNull() {
        /* Branches:
         * (name == null) : false  #  inside elementsOf method
         * (name.isEmpty()) : false  #  inside elementsOf method
         * (name.charAt(0) == '.') : false  #  inside elementsOf method
         * (name.charAt(name.length() - 1) == '.') : false  #  inside elementsOf method
         * (i < elements.getSize()) : true  #  inside elementsOf method
         * (elements.getType(i) == ElementType.NON_UNIFORM) : false  #  inside elementsOf method
         * (elements != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        ConfigurationPropertyName result = ConfigurationPropertyName.of((CharSequence) "J", false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${of1WhenElementsGetTypeIEqualsElementTypeNON_UNIFORMAndReturnNullIfInvalidAndElementsIsNull}, hash: C35257EA574EB84C0687C4949BFD65D2
    @Test()
    void of1WhenElementsGetTypeIEqualsElementTypeNON_UNIFORMAndReturnNullIfInvalidAndElementsIsNull() {
        /* Branches:
         * (name == null) : false  #  inside elementsOf method
         * (name.isEmpty()) : false  #  inside elementsOf method
         * (name.charAt(0) == '.') : false  #  inside elementsOf method
         * (name.charAt(name.length() - 1) == '.') : false  #  inside elementsOf method
         * (i < elements.getSize()) : true  #  inside elementsOf method
         * (elements.getType(i) == ElementType.NON_UNIFORM) : true  #  inside elementsOf method
         * (returnNullIfInvalid) : true  #  inside elementsOf method
         * (elements != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type ConfigurationPropertyName.ElementsParser - Method: parse
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        ConfigurationPropertyName result = ConfigurationPropertyName.of((CharSequence) "exampleName", true);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${of1WhenElementsParserNotIsValidCharChCharIndexThrowsInvalidConfigurationPropertyNameException}, hash: 950AD3EB3871F01F609C211E838536AC
    @Test()
    void of1WhenElementsParserNotIsValidCharChCharIndexThrowsInvalidConfigurationPropertyNameException() {
        /* Branches:
         * (name == null) : false  #  inside elementsOf method
         * (name.isEmpty()) : false  #  inside elementsOf method
         * (name.charAt(0) == '.') : false  #  inside elementsOf method
         * (name.charAt(name.length() - 1) == '.') : false  #  inside elementsOf method
         * (i < elements.getSize()) : true  #  inside elementsOf method
         * (elements.getType(i) == ElementType.NON_UNIFORM) : true  #  inside elementsOf method
         * (returnNullIfInvalid) : false  #  inside elementsOf method
         * (charIndex < elements.getLength(index)) : true  #  inside getInvalidChars method
         * (!ElementsParser.isValidChar(ch, charIndex)) : true  #  inside getInvalidChars method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type ConfigurationPropertyName.ElementsParser - Method: parse
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        final InvalidConfigurationPropertyNameException result = assertThrows(InvalidConfigurationPropertyNameException.class, () -> {
            ConfigurationPropertyName.of((CharSequence) "exampleName", false);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${adaptTest}, hash: 1C6B62856F154B6B30E9C4C22B298485
    @Test()
    void adaptTest() {
        //Arrange Statement(s)
        try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class, CALLS_REAL_METHODS)) {
            configurationPropertyName.when(() -> ConfigurationPropertyName.adapt("name1", 'A', (Function) null)).thenReturn(configurationPropertyNameMock);
            //Act Statement(s)
            ConfigurationPropertyName result = ConfigurationPropertyName.adapt("name1", 'A');
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configurationPropertyNameMock));
                configurationPropertyName.verify(() -> ConfigurationPropertyName.adapt("name1", 'A', (Function) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${adapt1WhenNameIsEmpty}, hash: 7312F5CDAEF517421138887F4D0770F8
    @Test()
    void adapt1WhenNameIsEmpty() {
        /* Branches:
         * (name.isEmpty()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ConfigurationPropertyName result = ConfigurationPropertyName.adapt((CharSequence) "", 'A', functionMock);
            ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.EMPTY;
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configurationPropertyName));
                _assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${adapt1WhenElementsGetSizeEquals0}, hash: DCBB9873D1E44C091A0494E3DBC07767
    @Test()
    void adapt1WhenElementsGetSizeEquals0() {
        /* Branches:
         * (name.isEmpty()) : false
         * (elements.getSize() == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("A", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ConfigurationPropertyName result = ConfigurationPropertyName.adapt((CharSequence) "A", 'A', functionMock);
            ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.EMPTY;
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configurationPropertyName));
                _assert.verify(() -> Assert.notNull("A", "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${adapt1WhenElementsGetSizeNotEquals0}, hash: 00CEF43273C3F63DAAA1F45DC32D10C7
    @Test()
    void adapt1WhenElementsGetSizeNotEquals0() {
        /* Branches:
         * (name.isEmpty()) : false
         * (elements.getSize() == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull("A", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ConfigurationPropertyName result = ConfigurationPropertyName.adapt((CharSequence) "A", 'A', functionMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull("A", "Name must not be null"), atLeast(1));
            });
        }
    }
}
