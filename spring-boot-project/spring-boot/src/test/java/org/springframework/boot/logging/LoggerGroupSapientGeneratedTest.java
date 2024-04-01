package org.springframework.boot.logging;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;
import java.util.function.BiConsumer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LoggerGroupSapientGeneratedTest {

	//Sapient generated method id: ${e7ff559b-73f6-331e-85c9-d89a1492789f}, hash: 65C9AEE7FF555DF8C02375032C0CE9FB
	@Test()
	void hasMembersWhenThisMembersNotIsEmpty() {
		/* Branches:
		 * (!this.members.isEmpty()) : true
		 */
		//Arrange Statement(s)
		List<String> stringList = new ArrayList<>();
		stringList.add(null);
		LoggerGroup target = new LoggerGroup("name1", stringList);

		//Act Statement(s)
		boolean result = target.hasMembers();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${12b52f16-987d-3b50-969d-d17faa67975a}, hash: 86D0F08C3250F24F697325823999AA6D
	@Test()
	void hasMembersWhenThisMembersIsEmpty() {
		/* Branches:
		 * (!this.members.isEmpty()) : false
		 */
		//Arrange Statement(s)
		List<String> stringList = new ArrayList<>();
		LoggerGroup target = new LoggerGroup("name1", stringList);

		//Act Statement(s)
		boolean result = target.hasMembers();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${28470cd7-b5f2-3c8f-9450-0b7ddfc7cc61}, hash: 10732FF3A807055F425B4306DF5144C4
	@Test()
	void configureLogLevelTest() {
		//Arrange Statement(s)
		List<String> stringList = new ArrayList<>();
		stringList.add(null);
		LoggerGroup target = new LoggerGroup("name1", stringList);
		BiConsumer biConsumerMock = mock(BiConsumer.class);

		//Act Statement(s)
		target.configureLogLevel(LogLevel.TRACE, biConsumerMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(target.getConfiguredLevel(), equalTo(LogLevel.TRACE)));
	}
}
