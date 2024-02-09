package org.springframework.boot.origin;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import org.springframework.core.env.PropertySource;
import org.springframework.util.Assert;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PropertySourceOriginSapientGeneratedTest {

	private final PropertySource<?> propertySourceMock = mock(PropertySource.class);

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
	@Test()
	void toStringTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((PropertySource) any(), eq("PropertySource must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.hasLength("A", "PropertyName must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			PropertySource propertySource = PropertySource.named("B");
			PropertySourceOrigin target = new PropertySourceOrigin(propertySource, "A");
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("\"A\" from property source \"B\""));
				_assert.verify(() -> Assert.notNull((PropertySource) any(), eq("PropertySource must not be null")));
				_assert.verify(() -> Assert.hasLength("A", "PropertyName must not be empty"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${390e7c3b-0877-3f94-963d-bcbe83eb41f3}
	@Test()
	void getWhenOriginIsNotNull() {
		/* Branches:
		 * (origin != null) : true
		 */
		//Arrange Statement(s)
		Origin originMock = mock(Origin.class);
		try (MockedStatic<OriginLookup> originLookup = mockStatic(OriginLookup.class)) {
			originLookup.when(() -> OriginLookup.getOrigin(propertySourceMock, "name1")).thenReturn(originMock);
			//Act Statement(s)
			Origin result = PropertySourceOrigin.get(propertySourceMock, "name1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(originMock));
				originLookup.verify(() -> OriginLookup.getOrigin(propertySourceMock, "name1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${388ad125-caed-3766-a52b-ef6045017abc}
	@Disabled()
	@Test()
	void getWhenOriginIsNull() {
		/* Branches:
		 * (origin != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<OriginLookup> originLookup = mockStatic(OriginLookup.class)) {
			originLookup.when(() -> OriginLookup.getOrigin(propertySourceMock, "A")).thenReturn(null);
			_assert.when(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.hasLength("A", "PropertyName must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			Origin result = PropertySourceOrigin.get(propertySourceMock, "A");
			PropertySourceOrigin propertySourceOrigin = new PropertySourceOrigin(propertySourceMock, "A");
			//Assert statement(s)
			//TODO: Please implement equals method in PropertySourceOrigin for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(propertySourceOrigin));
				originLookup.verify(() -> OriginLookup.getOrigin(propertySourceMock, "A"), atLeast(1));
				_assert.verify(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null"), atLeast(1));
				_assert.verify(() -> Assert.hasLength("A", "PropertyName must not be empty"), atLeast(1));
			});
		}
	}
}
