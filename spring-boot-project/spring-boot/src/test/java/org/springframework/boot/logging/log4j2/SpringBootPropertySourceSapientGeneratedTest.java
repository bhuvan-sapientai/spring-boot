package org.springframework.boot.logging.log4j2;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Collection;
import java.util.Set;

import org.apache.logging.log4j.util.BiConsumer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringBootPropertySourceSapientGeneratedTest {

	//Sapient generated method id: ${eaf48a4e-d2f2-3434-bc4f-1847fbe649f9}, hash: A3B13AA1F83EE7E03AE55AF68E01C250
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

	//Sapient generated method id: ${fc26885d-bceb-3d0c-a44a-45c6abfe5052}, hash: 9784B4E4A37B7711C76FAFD9B0C4563A
	@Disabled()
	@Test()
	void getNormalFormTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringBootPropertySource target = new SpringBootPropertySource();
		Iterable iterableMock = mock(Iterable.class);
		//Act Statement(s)
		CharSequence result = target.getNormalForm(iterableMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("log4j.getNormalForm_charSequence1")));
	}

	//Sapient generated method id: ${2662db8a-7513-3e23-abe0-a3f8c61b9e29}, hash: C6DFC052356131F40435D863FD8DF45D
	@Test()
	void getPriorityTest() {
		//Arrange Statement(s)
		SpringBootPropertySource target = new SpringBootPropertySource();
		//Act Statement(s)
		int result = target.getPriority();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(-200)));
	}

	//Sapient generated method id: ${ebf9d063-d15c-33a6-bbb2-427433abed69}, hash: 82D5C4C1BE86B9D70417CD34CBB1E631
	@Test()
	void getPropertyTest() {
		//Arrange Statement(s)
		SpringBootPropertySource target = new SpringBootPropertySource();
		//Act Statement(s)
		String result = target.getProperty("log4j.shutdownHookEnabled");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("false")));
	}

	//Sapient generated method id: ${e4baa1db-e7c4-39c9-adf6-6a1a40035646}, hash: BC91678177C6F445DE6AD7CA63A08A20
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

	//Sapient generated method id: ${c3e52535-97fc-325b-8244-03e8d448a009}, hash: C41A18068461C021A380A253B24DEFAE
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

	//Sapient generated method id: ${7686aea9-7c79-3229-813a-9395b64f0cd2}, hash: DE2B3F288FCDE00C3DC53B993B33D54B
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
