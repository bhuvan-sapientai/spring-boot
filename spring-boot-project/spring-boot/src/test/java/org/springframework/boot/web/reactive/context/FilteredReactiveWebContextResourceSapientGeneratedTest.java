package org.springframework.boot.web.reactive.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.FileNotFoundException;

import org.springframework.core.io.Resource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FilteredReactiveWebContextResourceSapientGeneratedTest {

	//Sapient generated method id: ${e5d31dbe-d9f3-3783-8560-497f1516a831}
	@Test()
	void existsTest() {
		//Arrange Statement(s)
		FilteredReactiveWebContextResource target = new FilteredReactiveWebContextResource("path1");

		//Act Statement(s)
		boolean result = target.exists();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${70eb2d6d-5b78-30d7-a381-b62e270672dd}
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

	//Sapient generated method id: ${c72539b8-9295-34c2-830f-8d27a3760c57}
	@Test()
	void getDescriptionTest() {
		//Arrange Statement(s)
		FilteredReactiveWebContextResource target = new FilteredReactiveWebContextResource("A");

		//Act Statement(s)
		String result = target.getDescription();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("ReactiveWebContext resource [A]")));
	}

	//Sapient generated method id: ${d93fa212-ad75-315c-8b6e-865cfae042f3}
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
