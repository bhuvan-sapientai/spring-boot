package org.springframework.boot.logging;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import org.springframework.util.StringUtils;
import org.springframework.util.Assert;
import org.springframework.core.env.PropertyResolver;

import java.util.Properties;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LogFileSapientGeneratedTest {

	private final PropertyResolver propertyResolverMock = mock(PropertyResolver.class);

	//Sapient generated method id: ${43395ca7-7628-3964-8375-c51a1fb3b330}
	@Disabled()
	@Test()
	void applyToSystemPropertiesTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("B")).thenReturn(true);
			LogFile target = spy(new LogFile("A", "B"));
			Properties properties = new Properties();
			doNothing().when(target).applyTo(eq(properties));
			//Act Statement(s)
			target.applyToSystemProperties();
			//Assert statement(s)
			assertAll("result", () -> {
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(1));
				verify(target).applyTo(eq(properties));
			});
		}
	}

	//Sapient generated method id: ${3b42ee2c-e708-3022-9b75-4a723de17a7c}
	@Disabled()
	@Test()
	void applyToWhenStringUtilsHasLengthValue() {
		/* Branches:
		 * (StringUtils.hasLength(value)) : true  #  inside put method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("B")).thenReturn(true);
			stringUtils.when(() -> StringUtils.hasLength("C")).thenReturn(true);
			LogFile target = new LogFile("A", "B");
			Properties properties = new Properties();
			//Act Statement(s)
			target.applyTo(properties);
			Properties propertiesProperties = new Properties();
			propertiesProperties.put("LOG_PATH", "B");
			propertiesProperties.put("LOG_FILE", "C");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(properties, equalTo(propertiesProperties));
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(2));
				stringUtils.verify(() -> StringUtils.hasLength("C"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${8ec646ae-173c-3d46-91b8-0c0bd960b592}
	@Test()
	void toStringWhenStringUtilsHasLengthThisFile() {
		/* Branches:
		 * (StringUtils.hasLength(this.file)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasLength("B")).thenReturn(true);
			stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false).thenReturn(true);
			LogFile target = new LogFile("A", "B");
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("A"));
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(2));
				stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${1ff2cb64-1a73-3a92-a373-a219ed0cc5e2}
	@Disabled()
	@Test()
	void toStringWhenStringUtilsNotHasLengthThisFile() {
		/* Branches:
		 * (StringUtils.hasLength(this.file)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("B")).thenReturn(true);
			LogFile target = new LogFile("A", "B");
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("result1"));
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(2));
				stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${cf4e5e21-d070-37e6-a33b-a23ade715e22}
	@Test()
	void getWhenStringUtilsNotHasLengthPath() {
		/* Branches:
		 * (StringUtils.hasLength(file)) : false
		 * (StringUtils.hasLength(path)) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("A").when(propertyResolverMock).getProperty("logging.file.name");
			doReturn("B").when(propertyResolverMock).getProperty("logging.file.path");
			stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("B")).thenReturn(false);
			//Act Statement(s)
			LogFile result = LogFile.get(propertyResolverMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(propertyResolverMock).getProperty("logging.file.name");
				verify(propertyResolverMock).getProperty("logging.file.path");
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d711b501-1632-386f-af9e-ec5f3af575f2}
	@Disabled()
	@Test()
	void getWhenStringUtilsNotHasLengthFileAndStringUtilsHasLengthPathAndDefaultBranch() {
		/* Branches:
		 * (StringUtils.hasLength(file)) : false
		 * (StringUtils.hasLength(path)) : true
		 * (branch expression (line 72)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("A").when(propertyResolverMock).getProperty("logging.file.name");
			doReturn("B").when(propertyResolverMock).getProperty("logging.file.path");
			stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("B")).thenReturn(true);
			//Act Statement(s)
			LogFile result = LogFile.get(propertyResolverMock);
			LogFile logFile = new LogFile("A", "B");
			//Assert statement(s)
			//TODO: Please implement equals method in LogFile for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(logFile));
				verify(propertyResolverMock).getProperty("logging.file.name");
				verify(propertyResolverMock).getProperty("logging.file.path");
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(2));
				stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(2));
			});
		}
	}

	//Sapient generated method id: ${5fb01c5d-f747-3955-8002-63be8cff9ef1}
	@Disabled()
	@Test()
	void getWhenStringUtilsNotHasLengthFileAndStringUtilsHasLengthPathAndDefaultBranch2() {
		/* Branches:
		 * (StringUtils.hasLength(file)) : false
		 * (StringUtils.hasLength(path)) : true
		 * (branch expression (line 72)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("A").when(propertyResolverMock).getProperty("logging.file.name");
			doReturn("B").when(propertyResolverMock).getProperty("logging.file.path");
			stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
			stringUtils.when(() -> StringUtils.hasLength("B")).thenReturn(true).thenReturn(false);
			_assert.when(() -> Assert.isTrue(false, "File or Path must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			LogFile result = LogFile.get(propertyResolverMock);
			LogFile logFile = new LogFile("A", "B");
			//Assert statement(s)
			//TODO: Please implement equals method in LogFile for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(logFile));
				verify(propertyResolverMock).getProperty("logging.file.name");
				verify(propertyResolverMock).getProperty("logging.file.path");
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(2));
				stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(2));
				_assert.verify(() -> Assert.isTrue(false, "File or Path must not be empty"), atLeast(1));
			});
		}
	}
}
