package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.util.Locale;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CharArrayFormatterSapientGeneratedTest {

    //Sapient generated method id: ${printTest}, hash: 62F08C31808ABC8CCBD52F0B6E6E8FCA
    @Test()
    void printTest() {
        //Arrange Statement(s)
        CharArrayFormatter target = new CharArrayFormatter();
        char[] charArray = new char[] { 'A' };
        Locale locale = new Locale("language1");
        
        //Act Statement(s)
        String result = target.print(charArray, locale);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("A")));
    }

    //Sapient generated method id: ${parseTest}, hash: 45254FAD2A79A9E4907D468AC9964513
    @Test()
    void parseTest() throws ParseException {
        //Arrange Statement(s)
        CharArrayFormatter target = new CharArrayFormatter();
        Locale locale = new Locale("language1");
        
        //Act Statement(s)
        char[] result = target.parse("A", locale);
        char[] charResultArray = new char[] { 'A' };
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(charResultArray)));
    }
}
