package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.time.OffsetDateTime;
import java.util.Locale;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class IsoOffsetFormatterSapientGeneratedTest {

    //Sapient generated method id: ${printTest}, hash: F4CD9D84AAEA7B21BAEB1EC5A1AE73A5
    @Disabled()
    @Test()
    void printTest() {
        //Arrange Statement(s)
        IsoOffsetFormatter target = new IsoOffsetFormatter();
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        Locale locale = new Locale("language1");
        //Act Statement(s)
        String result = target.print(offsetDateTime, locale);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("2024-05-15T15:36:23.046939+05:30")));
    }

    //Sapient generated method id: ${parseTest}, hash: 886182F27F17A8F1929DB3732B42663B
    @Disabled()
    @Test()
    void parseTest() throws ParseException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IsoOffsetFormatter target = new IsoOffsetFormatter();
        Locale locale = new Locale("language1");
        //Act Statement(s)
        OffsetDateTime result = target.parse("text1", locale);
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(offsetDateTime)));
    }
}
