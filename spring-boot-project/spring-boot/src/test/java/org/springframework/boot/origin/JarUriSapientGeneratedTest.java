package org.springframework.boot.origin;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.net.URI;

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
class JarUriSapientGeneratedTest {

	private final JarUri jarUriMock = mock(JarUri.class);

	//Sapient generated method id: ${46267df3-cfc0-3d4a-aef4-4b72c4a0138b}
	@Disabled()
	@Test()
	void getDescription1Test() {
		//Arrange Statement(s)
		try (MockedStatic<JarUri> jarUri = mockStatic(JarUri.class)) {
			jarUri.when(() -> JarUri.from("str1")).thenReturn(jarUriMock);
			URI uRI = URI.create("str1");
			JarUri target = JarUri.from(uRI);
			//Act Statement(s)
			String result = target.getDescription("A");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("A from null"));
				jarUri.verify(() -> JarUri.from("str1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}
	@Disabled()
	@Test()
	void toStringTest() {
		//Arrange Statement(s)
		try (MockedStatic<JarUri> jarUri = mockStatic(JarUri.class)) {
			jarUri.when(() -> JarUri.from("str1")).thenReturn(jarUriMock);
			URI uRI = URI.create("str1");
			JarUri target = JarUri.from(uRI);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				jarUri.verify(() -> JarUri.from("str1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${75b57cb1-444a-3fb9-bd56-a8c3b1a5a77c}
	@Test()
	void fromTest() {
		//Arrange Statement(s)
		try (MockedStatic<JarUri> jarUri = mockStatic(JarUri.class, CALLS_REAL_METHODS)) {
			jarUri.when(() -> JarUri.from("str1")).thenReturn(jarUriMock);
			URI uRI = URI.create("str1");
			//Act Statement(s)
			JarUri result = JarUri.from(uRI);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(jarUriMock));
				jarUri.verify(() -> JarUri.from("str1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${72855e9c-5fd0-38f6-bd15-7d6f21bddb99}
	@Test()
	void from1WhenUriNotContainsJAR_EXTENSION() {
		/* Branches:
		 * (uri.startsWith(JAR_SCHEME)) : true
		 * (uri.contains(JAR_EXTENSION)) : false
		 */
		//Act Statement(s)
		JarUri result = JarUri.from("jar:");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${afec6a9a-42e4-3a4d-a4bd-9db1f75d4de7}
	@Test()
	void from1WhenLastDotJarEqualsMinus1() {
		/* Branches:
		 * (uri.startsWith(JAR_SCHEME)) : true
		 * (uri.contains(JAR_EXTENSION)) : true
		 * (lastSlash == -1) : true  #  inside getFilename method
		 * (lastDotJar == -1) : true  #  inside extractDescription method
		 */
		//Act Statement(s)
		JarUri result = JarUri.from("jar:.jarA");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${d7a8654b-9090-3412-88cc-ed7b6c9c278f}
	@Disabled()
	@Test()
	void from1WhenLastSlashNotEqualsMinus1AndLastDotJarNotEqualsMinus1() {
		/* Branches:
		 * (uri.startsWith(JAR_SCHEME)) : true
		 * (uri.contains(JAR_EXTENSION)) : true
		 * (lastSlash == -1) : false  #  inside getFilename method
		 * (lastDotJar == -1) : false  #  inside extractDescription method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		JarUri result = JarUri.from("uri1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
