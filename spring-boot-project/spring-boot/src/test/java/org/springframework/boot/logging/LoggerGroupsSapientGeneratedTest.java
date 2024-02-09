package org.springframework.boot.logging;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.Spliterators;
import java.util.ArrayList;
import java.util.stream.StreamSupport;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LoggerGroupsSapientGeneratedTest {

	//Sapient generated method id: ${2bbc6922-a600-334f-8353-150bbd738316}
	@Test()
	void putAllTest() {
		//Arrange Statement(s)
		List<String> stringList = new ArrayList<>();
		Map<String, List<String>> stringListStringMap = new HashMap<>();
		stringListStringMap.put("namesAndMembersItem1Key1", stringList);
		LoggerGroups target = new LoggerGroups(stringListStringMap);
		//Act Statement(s)
		target.putAll(stringListStringMap);
	}

	//Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}
	@Test()
	void getTest() {
		//Arrange Statement(s)
		//Map<String, List<String>> stringListStringMap = new HashMap<>();
		//LoggerGroups target = new LoggerGroups(stringListStringMap);
		//Act Statement(s)
		//LoggerGroup result = target.get("name1");
		//Assert statement(s)
		//assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}
	@Test()
	void iteratorTest() {
		//Arrange Statement(s)
		//List<String> stringList = new ArrayList<>();
		//Map<String, List<String>> stringListStringMap = new HashMap<>();
		//stringListStringMap.put("namesAndMembersItem1Key1", stringList);
		//LoggerGroups target = new LoggerGroups(stringListStringMap);
		//Act Statement(s)
		//Iterator<LoggerGroup> result = target.iterator();
		//LoggerGroup loggerGroup = new LoggerGroup("namesAndMembersItem1Key1", stringList);
		//Collection collection = new Collection<>();
		//collection.put(loggerGroup);
		//Iterator<LoggerGroup> iteratorResult = collection.iterator();
		//Assert statement(s)
		//assertAll("result", () -> assertThat(StreamSupport.stream(Spliterators.spliteratorUnknownSize(result, 0), false).toArray(), equalTo(StreamSupport.stream(Spliterators.spliteratorUnknownSize(iteratorResult, 0), false).toArray())));
	}
}
