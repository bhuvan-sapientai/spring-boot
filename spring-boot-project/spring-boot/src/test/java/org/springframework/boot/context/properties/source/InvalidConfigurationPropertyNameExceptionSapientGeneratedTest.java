package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class InvalidConfigurationPropertyNameExceptionSapientGeneratedTest {

    //Sapient generated method id: ${throwIfHasInvalidCharsWhenInvalidCharactersNotIsEmptyThrowsInvalidConfigurationPropertyNameException}, hash: 0CF2845F2584145120D297715BFE2EBA
    @Test()
    void throwIfHasInvalidCharsWhenInvalidCharactersNotIsEmptyThrowsInvalidConfigurationPropertyNameException() {
        /* Branches:
         * (!invalidCharacters.isEmpty()) : true
         */
         //Arrange Statement(s)
        List<Character> characterList = new ArrayList<>();
        characterList.add('A');
        //Act Statement(s)
        final InvalidConfigurationPropertyNameException result = assertThrows(InvalidConfigurationPropertyNameException.class, () -> {
            InvalidConfigurationPropertyNameException.throwIfHasInvalidChars("name1", characterList);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${throwIfHasInvalidCharsWhenInvalidCharactersIsEmpty}, hash: EF6B83F71575E8C98E2795608308DCCB
    @Test()
    void throwIfHasInvalidCharsWhenInvalidCharactersIsEmpty() {
        /* Branches:
         * (!invalidCharacters.isEmpty()) : false
         */
         //Arrange Statement(s)
        List<Character> characterList = new ArrayList<>();
        
        //Act Statement(s)
        InvalidConfigurationPropertyNameException.throwIfHasInvalidChars("name1", characterList);
    }
}
