package org.springframework.boot.logging.log4j2;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.boot.ansi.AnsiElement;
import org.mockito.MockedStatic;
import org.apache.logging.log4j.core.config.DefaultConfiguration;
import org.springframework.boot.ansi.AnsiOutput;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ColorConverterSapientGeneratedTest {

    //Sapient generated method id: ${newInstanceWhenOptionsLengthLessThan1}, hash: 13D949A4F0632854C0C10572B9FBE768
    @Test()
    void newInstanceWhenOptionsLengthLessThan1() {
        /* Branches:
         * (options.length < 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
        String[] stringArray = new String[] {};
        //Act Statement(s)
        ColorConverter result = ColorConverter.newInstance(defaultConfiguration, stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${newInstanceWhen0IndexOfOptionsIsNull}, hash: A4F20AEF5A603C5E96F0F39671216777
    @Test()
    void newInstanceWhen0IndexOfOptionsIsNull() {
        /* Branches:
         * (options.length < 1) : false
         * (options[0] == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
        String[] stringArray = new String[] { (String) null };
        //Act Statement(s)
        ColorConverter result = ColorConverter.newInstance(defaultConfiguration, stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${newInstanceWhenOptionsLengthNotEquals1}, hash: 52886367892503F6E7468897F5C0572E
    @Disabled()
    @Test()
    void newInstanceWhenOptionsLengthNotEquals1() {
        /* Branches:
         * (options.length < 1) : false
         * (options[0] == null) : false
         * (options.length != 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
        String[] stringArray = new String[] {};
        //Act Statement(s)
        ColorConverter result = ColorConverter.newInstance(defaultConfiguration, stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${newInstanceWhenOptionsLengthEquals1}, hash: 43F1D8601112A165DCC3EE8DBC8A1B34
    @Test()
    void newInstanceWhenOptionsLengthEquals1() {
        /* Branches:
         * (options.length < 1) : false
         * (options[0] == null) : false
         * (options.length != 1) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
        String[] stringArray = new String[] { "optionsItem1" };
        //Act Statement(s)
        ColorConverter result = ColorConverter.newInstance(defaultConfiguration, stringArray);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${handlesThrowableWhenFormatterHandlesThrowable}, hash: 2C5441ECE0C75D288C4DE89C4578EFD5
    @Disabled()
    @Test()
    void handlesThrowableWhenFormatterHandlesThrowable() {
        /* Branches:
         * (for-each(this.formatters)) : true
         * (formatter.handlesThrowable()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
        String[] stringArray = new String[] {};
        ColorConverter target = ColorConverter.newInstance(defaultConfiguration, stringArray);
        //Act Statement(s)
        boolean result = target.handlesThrowable();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${handlesThrowableWhenFormatterNotHandlesThrowable}, hash: 27E18A3500D7E92436D6FE2562B0DDE2
    @Disabled()
    @Test()
    void handlesThrowableWhenFormatterNotHandlesThrowable() {
        /* Branches:
         * (for-each(this.formatters)) : true
         * (formatter.handlesThrowable()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
        String[] stringArray = new String[] {};
        ColorConverter target = ColorConverter.newInstance(defaultConfiguration, stringArray);
        //Act Statement(s)
        boolean result = target.handlesThrowable();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${appendAnsiStringTest}, hash: DAC3E971020767714F7DFEBE3A0FF556
    @Disabled()
    @Test()
    void appendAnsiStringTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AnsiElement ansiElementMock = mock(AnsiElement.class);
        try (MockedStatic<AnsiOutput> ansiOutput = mockStatic(AnsiOutput.class)) {
            Object[] objectArray = new Object[] { ansiElementMock, "in1" };
            ansiOutput.when(() -> AnsiOutput.toString(objectArray)).thenReturn("return_of_toString1");
            DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
            String[] stringArray = new String[] {};
            ColorConverter target = ColorConverter.newInstance(defaultConfiguration, stringArray);
            StringBuilder stringBuilder = new StringBuilder();
            //Act Statement(s)
            target.appendAnsiString(stringBuilder, "in1", ansiElementMock);
            //Assert statement(s)
            assertAll("result", () -> ansiOutput.verify(() -> AnsiOutput.toString(objectArray), atLeast(1)));
        }
    }
}
