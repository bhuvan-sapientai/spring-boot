package org.springframework.boot.origin;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class OriginTrackedValueSapientGeneratedTest {

	private final Origin originMock = mock(Origin.class);

	//Sapient generated method id: ${71eb015a-95ed-3787-b890-7174d4d99f79}
	@Disabled()
	@Test()
	void toStringWhenThisValueIsNull() {
		/* Branches:
		 * (this.value != null) : false
		 */
		//Arrange Statement(s)
		OriginTrackedValue target = OriginTrackedValue.of((Object) null, originMock);
		//Act Statement(s)
		String result = target.toString();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}
	@Test()
	void ofTest() {
		//Arrange Statement(s)
		OriginTrackedValue originTrackedValueMock = mock(OriginTrackedValue.class);
		try (MockedStatic<OriginTrackedValue> originTrackedValue = mockStatic(OriginTrackedValue.class, CALLS_REAL_METHODS)) {
			Object object = new Object();
			originTrackedValue.when(() -> OriginTrackedValue.of(object, (Origin) null)).thenReturn(originTrackedValueMock);
			//Act Statement(s)
			OriginTrackedValue result = OriginTrackedValue.of(object);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(originTrackedValueMock));
				originTrackedValue.verify(() -> OriginTrackedValue.of(object, (Origin) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c4585d80-4f7e-33da-8df7-5ac9d20b2bd9}
	@Test()
	void of1WhenValueIsNull() {
		/* Branches:
		 * (value == null) : true
		 */
		//Arrange Statement(s)
		Object object = null;
		//Act Statement(s)
		OriginTrackedValue result = OriginTrackedValue.of(object, originMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${3037ebf6-38af-337d-ae19-6f4c666b8c4f}
	@Test()
	void of1WhenValueInstanceOfCharSequence() {
		/* Branches:
		 * (value == null) : false
		 * (value instanceof CharSequence charSequence) : true
		 */
		//Arrange Statement(s)
		Origin originMock = mock(Origin.class, "testOrigin");
		//Act Statement(s)
		OriginTrackedValue result = OriginTrackedValue.of((Object) "of_object1", originMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${dce1949d-9a79-3f3b-a48b-16e7c826f3ae}
	@Test()
	void of1WhenValueNotInstanceOfCharSequence() {
		/* Branches:
		 * (value == null) : false
		 * (value instanceof CharSequence charSequence) : false
		 */
		//Arrange Statement(s)
		Object object = new Object();
		//Act Statement(s)
		OriginTrackedValue result = OriginTrackedValue.of(object, originMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
