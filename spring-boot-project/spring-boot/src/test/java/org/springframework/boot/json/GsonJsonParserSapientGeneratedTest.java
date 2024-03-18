package org.springframework.boot.json;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.concurrent.Callable;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GsonJsonParserSapientGeneratedTest {

	//Sapient generated method id: ${0a24f3b1-c66c-3322-b263-0c2288281986}, hash: 4E466EF7315250560D54217F0CBB5ADA
	@Test()
	void parseMap1Test() throws Exception {
		//Arrange Statement(s)
		GsonJsonParser target = spy(new GsonJsonParser());
		Map map = new HashMap<>();
		doReturn(map).when(target).tryParse((Callable) any(), eq(Exception.class));

		//Act Statement(s)
		Map<String, Object> result = target.parseMap("json1");

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(map));
			verify(target).tryParse((Callable) any(), eq(Exception.class));
		});
	}

	//Sapient generated method id: ${daf64ffc-fc88-36dc-9390-d144f4f90b2b}, hash: 5D711C092F95D2AB62E654A7AFF44513
	@Test()
	void parseList1Test() throws Exception {
		//Arrange Statement(s)
		GsonJsonParser target = spy(new GsonJsonParser());
		List list = new ArrayList<>();
		doReturn(list).when(target).tryParse((Callable) any(), eq(Exception.class));

		//Act Statement(s)
		List<Object> result = target.parseList("json1");

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(list));
			verify(target).tryParse((Callable) any(), eq(Exception.class));
		});
	}
}
