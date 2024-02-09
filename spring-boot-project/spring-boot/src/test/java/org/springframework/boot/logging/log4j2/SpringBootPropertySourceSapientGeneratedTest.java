package org.springframework.boot.logging.log4j2;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Collection;
import java.util.Set;

import org.apache.logging.log4j.util.BiConsumer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringBootPropertySourceSapientGeneratedTest {

	//Sapient generated method id: ${eaf48a4e-d2f2-3434-bc4f-1847fbe649f9}
	@Test()
	void forEachTest() {
		//Arrange Statement(s)
		SpringBootPropertySource target = new SpringBootPropertySource();
		BiConsumer<String, String> biConsumer = null;
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			target.forEach(biConsumer);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${fc26885d-bceb-3d0c-a44a-45c6abfe5052}
	@Disabled()
	@Test()
	void getNormalFormTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringBootPropertySource target = new SpringBootPropertySource();
		//TODO: Needs initialization with real value
		Iterable iterable = null;
		//Act Statement(s)
		CharSequence result = target.getNormalForm(iterable);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("log4j.getNormalForm_charSequence1")));
	}

	//Sapient generated method id: ${2662db8a-7513-3e23-abe0-a3f8c61b9e29}
	@Test()
	void getPriorityTest() {
		//Arrange Statement(s)
		SpringBootPropertySource target = new SpringBootPropertySource();
		//Act Statement(s)
		int result = target.getPriority();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(-200)));
	}

	//Sapient generated method id: ${ebf9d063-d15c-33a6-bbb2-427433abed69}
	@Test()
	void getPropertyTest() {
		//Arrange Statement(s)
		SpringBootPropertySource target = new SpringBootPropertySource();
		//Act Statement(s)
		String result = target.getProperty("log4j.shutdownHookEnabled");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("false")));
	}

	//Sapient generated method id: ${e4baa1db-e7c4-39c9-adf6-6a1a40035646}
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

	//Sapient generated method id: ${c3e52535-97fc-325b-8244-03e8d448a009}
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

	//Sapient generated method id: ${7686aea9-7c79-3229-813a-9395b64f0cd2}
	@Test()
	void getPropertyNamesTest() {
		//Arrange Statement(s)
		SpringBootPropertySource target = new SpringBootPropertySource();
		//Act Statement(s)
		Collection<String> result = target.getPropertyNames();
		Set<String> stringResultSet = new HashSet<>(Set.of("log4j.shutdownHookEnabled"));
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(stringResultSet.size()));
			assertThat(result, containsInAnyOrder(stringResultSet.toArray()));
		});
	}
}
