package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.core.env.Environment;
import org.springframework.boot.ansi.AnsiColor;
import org.springframework.boot.ansi.AnsiOutput;
import java.io.OutputStream;
import org.springframework.boot.ansi.AnsiStyle;
import java.io.PrintStream;
import org.mockito.MockedStatic;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringBootBannerSapientGeneratedTest {

    //Sapient generated method id: ${printBannerWhenPaddingLengthLessThanSTRAP_LINE_SIZEMinusVersionLengthPlusSPRING_BOOTLength}, hash: 05D49513157749A5064AF583F3F43D27
    @Disabled()
    @Test()
    void printBannerWhenPaddingLengthLessThanSTRAP_LINE_SIZEMinusVersionLengthPlusSPRING_BOOTLength() {
        /* Branches:
         * (for-each(BANNER)) : true
         * (version != null) : true
         * (padding.length() < STRAP_LINE_SIZE - (version.length() + SPRING_BOOT.length())) : true
         */
        //Arrange Statement(s)
        Environment environmentMock = mock(Environment.class);
        try (MockedStatic<AnsiOutput> ansiOutput = mockStatic(AnsiOutput.class)) {
            Object[] objectArray = new Object[] { AnsiColor.GREEN, " :: Spring Boot :: ", AnsiColor.DEFAULT, " ", AnsiStyle.FAINT, " (v3.3.0-SNAPSHOT)" };
            ansiOutput.when(() -> AnsiOutput.toString(objectArray)).thenReturn("return_of_toString1");
            SpringBootBanner target = new SpringBootBanner();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(byteArrayOutputStream);
            //Act Statement(s)
            target.printBanner(environmentMock, Object.class, printStream);
            //Assert statement(s)
            assertAll("result", () -> ansiOutput.verify(() -> AnsiOutput.toString(objectArray), atLeast(1)));
        }
    }
}
