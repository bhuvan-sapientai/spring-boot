package org.springframework.boot.web.reactive.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.FileNotFoundException;
import org.springframework.core.io.Resource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FilteredReactiveWebContextResourceSapientGeneratedTest {

    //Sapient generated method id: ${existsTest}, hash: 648A4555F4245983203013999AFDF3C5
    @Test()
    void existsTest() {
        //Arrange Statement(s)
        FilteredReactiveWebContextResource target = new FilteredReactiveWebContextResource("path1");
        
        //Act Statement(s)
        boolean result = target.exists();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${createRelativeTest}, hash: E9A9B26F0F78DA197233E6BE8F9244D5
    @Test()
    void createRelativeTest() throws IOException {
        //Arrange Statement(s)
        FilteredReactiveWebContextResource target = new FilteredReactiveWebContextResource("A");
        
        //Act Statement(s)
        Resource result = target.createRelative("B");
        FilteredReactiveWebContextResource filteredReactiveWebContextResource = new FilteredReactiveWebContextResource("B");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(filteredReactiveWebContextResource)));
    }

    //Sapient generated method id: ${getDescriptionTest}, hash: 153251C7160CFAA8BAE4AF0505C8AAF4
    @Test()
    void getDescriptionTest() {
        //Arrange Statement(s)
        FilteredReactiveWebContextResource target = new FilteredReactiveWebContextResource("A");
        
        //Act Statement(s)
        String result = target.getDescription();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("ReactiveWebContext resource [A]")));
    }

    //Sapient generated method id: ${getInputStreamThrowsFileNotFoundException}, hash: FCC2B52EABC3BC263A3AE5381822AAF6
    @Test()
    void getInputStreamThrowsFileNotFoundException() throws IOException {
        //Arrange Statement(s)
        FilteredReactiveWebContextResource target = new FilteredReactiveWebContextResource("A");
        FileNotFoundException fileNotFoundException = new FileNotFoundException("ReactiveWebContext resource [A] cannot be opened because it does not exist");
        //Act Statement(s)
        final FileNotFoundException result = assertThrows(FileNotFoundException.class, () -> {
            target.getInputStream();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(fileNotFoundException.getMessage()));
        });
    }
}
