package org.springframework.boot.logging.log4j2;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Set;
import org.apache.logging.log4j.util.BiConsumer;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringBootPropertySourceSapientGeneratedTest {

    //Sapient generated method id: ${forEachTest}, hash: A3B13AA1F83EE7E03AE55AF68E01C250
    @Test()
    void forEachTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SpringBootPropertySource target = new SpringBootPropertySource();
        BiConsumer biConsumerMock = mock(BiConsumer.class);
        //Act Statement(s)
        target.forEach(biConsumerMock);
    }

    //Sapient generated method id: ${getNormalFormTest}, hash: 75ECC9DBD34DEC2039D6F57274F9CC52
    @Test()
    void getNormalFormTest() {
        //Arrange Statement(s)
        SpringBootPropertySource target = new SpringBootPropertySource();
        Iterable<CharSequence> iterable = new ArrayList<>();
        //Act Statement(s)
        CharSequence result = target.getNormalForm(iterable);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("log4j.")));
    }

    //Sapient generated method id: ${getPriorityTest}, hash: C6DFC052356131F40435D863FD8DF45D
    @Test()
    void getPriorityTest() {
        //Arrange Statement(s)
        SpringBootPropertySource target = new SpringBootPropertySource();
        //Act Statement(s)
        int result = target.getPriority();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-200)));
    }

    //Sapient generated method id: ${getPropertyTest}, hash: 82D5C4C1BE86B9D70417CD34CBB1E631
    @Test()
    void getPropertyTest() {
        //Arrange Statement(s)
        SpringBootPropertySource target = new SpringBootPropertySource();
        //Act Statement(s)
        String result = target.getProperty("log4j.shutdownHookEnabled");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("false")));
    }

    //Sapient generated method id: ${containsPropertyWhenThisPropertiesContainsKeyKey}, hash: BC91678177C6F445DE6AD7CA63A08A20
    @Test()
    void containsPropertyWhenThisPropertiesContainsKeyKey() {
        /* Branches:
         * (this.properties.containsKey(key)) : true
         */
        //Arrange Statement(s)
        SpringBootPropertySource target = new SpringBootPropertySource();
        //Act Statement(s)
        boolean result = target.containsProperty("log4j.shutdownHookEnabled");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${containsPropertyWhenThisPropertiesNotContainsKeyKey}, hash: C41A18068461C021A380A253B24DEFAE
    @Test()
    void containsPropertyWhenThisPropertiesNotContainsKeyKey() {
        /* Branches:
         * (this.properties.containsKey(key)) : false
         */
        //Arrange Statement(s)
        SpringBootPropertySource target = new SpringBootPropertySource();
        //Act Statement(s)
        boolean result = target.containsProperty("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${getPropertyNamesTest}, hash: DE2B3F288FCDE00C3DC53B993B33D54B
    @Test()
    void getPropertyNamesTest() {
        //Arrange Statement(s)
        SpringBootPropertySource target = new SpringBootPropertySource();
        //Act Statement(s)
        Collection<String> result = target.getPropertyNames();
        Set<String> stringResultSet = new HashSet<>(Set.of("log4j.shutdownHookEnabled"));
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result, containsInAnyOrder(stringResultSet.toArray()));
        });
    }
}
