package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.env.PropertySourceLoader;

import org.mockito.MockedStatic;

import org.springframework.util.StringUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StandardConfigDataReferenceSapientGeneratedTest {

	private final ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class, "configDataLocation");

	private final PropertySourceLoader propertySourceLoaderMock = mock(PropertySourceLoader.class);

	//Sapient generated method id: ${4949dc69-4738-3b4e-b2db-10fb02ae170b}, hash: 720D50172DC7D81C4E1038FC56844FE9
	@Test()
	void isMandatoryDirectoryWhenThisDirectoryIsNotNull() {
		/* Branches:
		 * (!this.configDataLocation.isOptional()) : true
		 * (this.directory != null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(true);
			StandardConfigDataReference target = new StandardConfigDataReference(configDataLocationMock, "directory1", "C", "A", "B", propertySourceLoaderMock);
			doReturn(false).when(configDataLocationMock).isOptional();
			//Act Statement(s)
			boolean result = target.isMandatoryDirectory();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
				verify(configDataLocationMock).isOptional();
			});
		}
	}

	//Sapient generated method id: ${47b214d9-a0ff-3e67-95b6-c8bfb51d2c5b}, hash: 86A89D31B34388E42147657BA79C0117
	@Test()
	void isMandatoryDirectoryWhenThisDirectoryIsNull() {
		/* Branches:
		 * (!this.configDataLocation.isOptional()) : true
		 * (this.directory != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(true);
			StandardConfigDataReference target = new StandardConfigDataReference(configDataLocationMock, (String) null, "C", "A", "B", propertySourceLoaderMock);
			doReturn(false).when(configDataLocationMock).isOptional();
			//Act Statement(s)
			boolean result = target.isMandatoryDirectory();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
				verify(configDataLocationMock).isOptional();
			});
		}
	}

	//Sapient generated method id: ${faa0e684-2865-3735-9717-f56bbd1524bd}, hash: 1B3AA8A83B4C5C265115AFD9CA05AEB1
	@Test()
	void isSkippableWhenThisProfileIsNotNull() {
		/* Branches:
		 * (this.configDataLocation.isOptional()) : false
		 * (this.directory != null) : false
		 * (this.profile != null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(true);
			StandardConfigDataReference target = new StandardConfigDataReference(configDataLocationMock, (String) null, "C", "A", "B", propertySourceLoaderMock);
			doReturn(false).when(configDataLocationMock).isOptional();
			//Act Statement(s)
			boolean result = target.isSkippable();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
				verify(configDataLocationMock).isOptional();
			});
		}
	}

	//Sapient generated method id: ${30d89b15-ceef-3b14-929f-485720ecbf8a}, hash: 12202674078FFC558982F8C51C5B825D
	@Test()
	void isSkippableWhenThisProfileIsNull() {
		/* Branches:
		 * (this.configDataLocation.isOptional()) : false
		 * (this.directory != null) : false
		 * (this.profile != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText((String) null)).thenReturn(true);
			StandardConfigDataReference target = new StandardConfigDataReference(configDataLocationMock, (String) null, "C", (String) null, "B", propertySourceLoaderMock);
			doReturn(false).when(configDataLocationMock).isOptional();
			//Act Statement(s)
			boolean result = target.isSkippable();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				stringUtils.verify(() -> StringUtils.hasText((String) null), atLeast(1));
				verify(configDataLocationMock).isOptional();
			});
		}
	}

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: E74B84BF9A19F7DA5D8796D9D49715EC
	@Test()
	void toStringTest() {
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(true);
			StandardConfigDataReference target = new StandardConfigDataReference(configDataLocationMock, "directory1", "C", "A", "B", propertySourceLoaderMock);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("C-A.B"));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
			});
		}
	}
}
