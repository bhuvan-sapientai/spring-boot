package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.springframework.util.ResourceUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.DefaultResourceLoader;

import org.mockito.MockedStatic;

import java.io.File;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StringToFileConverterSapientGeneratedTest {

	//Sapient generated method id: ${22dc54f6-9f54-377c-8513-15ca2a08a072}, hash: 9D467CFBF7CE0CE73ED6C667DAC25189
	@Test()
	void convertWhenResourceUtilsIsUrlSource() throws IOException {
		/* Branches:
		 * (ResourceUtils.isUrl(source)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
			resourceUtils.when(() -> ResourceUtils.isUrl("A")).thenReturn(true);
			StringToFileConverter target = new StringToFileConverter();
			//Act Statement(s)
			File result = target.convert("A");
			DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader((ClassLoader) null);
			Resource resource = defaultResourceLoader.getResource("A");
			File file = resource.getFile();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(file));
				resourceUtils.verify(() -> ResourceUtils.isUrl("A"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${1b31dcc5-f24a-3459-9762-557f7894ce13}, hash: 19338878E024A676CEF0FC4D6C054740
	@Test()
	void convertWhenCaughtIOExceptionThrowsIllegalStateException() throws IOException {
		/* Branches:
		 * (ResourceUtils.isUrl(source)) : true
		 * (catch-exception (IOException)) : true  #  inside getFile method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
			resourceUtils.when(() -> ResourceUtils.isUrl("A")).thenReturn(true);
			StringToFileConverter target = new StringToFileConverter();
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.convert("A");
			});
			IllegalStateException illegalStateException = new IllegalStateException("Could not retrieve file for D: B");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				resourceUtils.verify(() -> ResourceUtils.isUrl("A"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${754d696f-d2cd-376b-a615-8393c9a8a224}, hash: 239F5163582558B02233AB46902BA5AB
	@Test()
	void convertWhenFileExists() throws IOException {
		/* Branches:
		 * (ResourceUtils.isUrl(source)) : false
		 * (file.exists()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: file
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		StringToFileConverter target = new StringToFileConverter();

		//Act Statement(s)
		File result = target.convert("A");
		File file = new File("A");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(file)));
	}

	//Sapient generated method id: ${03d8f555-1dd9-38a9-b897-7a2e2e1a9054}, hash: AFD7DF8E88A9080A4001AF4AB0C06D49
	@Test()
	void convertWhenResourceExists() throws IOException {
		/* Branches:
		 * (ResourceUtils.isUrl(source)) : false
		 * (file.exists()) : false
		 * (resource.exists()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: file
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		StringToFileConverter target = new StringToFileConverter();

		//Act Statement(s)
		File result = target.convert("source1");
		DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader((ClassLoader) null);
		Resource resource = defaultResourceLoader.getResource("source1");
		File file = resource.getFile();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(file)));
	}

	//Sapient generated method id: ${13bbfd1c-0f8c-32d7-bd4f-49ef55997d7c}, hash: 27928C3BD1395A20C5DC3E6DF243563F
	@Test()
	void convertWhenResourceNotExists() throws IOException {
		/* Branches:
		 * (ResourceUtils.isUrl(source)) : false
		 * (file.exists()) : false
		 * (resource.exists()) : false
		 */
		//Arrange Statement(s)
		StringToFileConverter target = new StringToFileConverter();

		//Act Statement(s)
		File result = target.convert("A");
		File file = new File("A");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(file)));
	}

	//Sapient generated method id: ${948c567c-eeea-3afd-a332-081877576f13}, hash: D3CA12C123FC1B29EBCDBBB92772C90E
	@Test()
	void convertWhenResourceExistsAndCaughtIOExceptionThrowsIllegalStateException() throws IOException {
		/* Branches:
		 * (ResourceUtils.isUrl(source)) : false
		 * (file.exists()) : false
		 * (resource.exists()) : true
		 * (catch-exception (IOException)) : true  #  inside getFile method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: file
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		StringToFileConverter target = new StringToFileConverter();
		IllegalStateException illegalStateException = new IllegalStateException("s1");
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			target.convert("source1");
		});

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
		});
	}
}
