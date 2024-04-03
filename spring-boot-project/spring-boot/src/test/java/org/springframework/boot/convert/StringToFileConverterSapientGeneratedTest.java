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

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StringToFileConverterSapientGeneratedTest {

	//Sapient generated method id: ${22dc54f6-9f54-377c-8513-15ca2a08a072}, hash: C53DDB2CACE2260B29AD668F723D9E6E
	@Disabled()
	@Test()
	void convertWhenResourceUtilsIsUrlSource() throws IOException {
		/* Branches:
		 * (ResourceUtils.isUrl(source)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: resourceLoader
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
			resourceUtils.when(() -> ResourceUtils.isUrl("source1")).thenReturn(true);
			StringToFileConverter target = new StringToFileConverter();
			//Act Statement(s)
			File result = target.convert("source1");
			DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader((ClassLoader) null);
			Resource resource = defaultResourceLoader.getResource("source1");
			File file = resource.getFile();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(file));
				resourceUtils.verify(() -> ResourceUtils.isUrl("source1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${1b31dcc5-f24a-3459-9762-557f7894ce13}, hash: AEDC6802BCA312CBD949A21177EA3FBD
	@Disabled()
	@Test()
	void convertWhenCaughtIOExceptionThrowsIllegalStateException() throws IOException {
		/* Branches:
		 * (ResourceUtils.isUrl(source)) : true
		 * (catch-exception (IOException)) : true  #  inside getFile method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: resourceLoader
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
			resourceUtils.when(() -> ResourceUtils.isUrl("source1")).thenReturn(true);
			StringToFileConverter target = new StringToFileConverter();
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.convert("source1");
			});
			IllegalStateException illegalStateException = new IllegalStateException("Could not retrieve file for A: B");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				resourceUtils.verify(() -> ResourceUtils.isUrl("source1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${754d696f-d2cd-376b-a615-8393c9a8a224}, hash: B9C2993F258B5BA853667E0984044C11
	@Disabled()
	@Test()
	void convertWhenFileExists() throws IOException {
		/* Branches:
		 * (ResourceUtils.isUrl(source)) : false
		 * (file.exists()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
			resourceUtils.when(() -> ResourceUtils.isUrl("<value>")).thenReturn(false);
			StringToFileConverter target = new StringToFileConverter();
			//Act Statement(s)
			File result = target.convert("<value>");
			File file = new File("<value>");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(file));
				resourceUtils.verify(() -> ResourceUtils.isUrl("<value>"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${03d8f555-1dd9-38a9-b897-7a2e2e1a9054}, hash: 4FF5BD0F296AE61358E3225D7EB0D85A
	@Disabled()
	@Test()
	void convertWhenResourceExists() throws IOException {
		/* Branches:
		 * (ResourceUtils.isUrl(source)) : false
		 * (file.exists()) : false
		 * (resource.exists()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: resourceLoader
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
			resourceUtils.when(() -> ResourceUtils.isUrl("<value>")).thenReturn(false);
			StringToFileConverter target = new StringToFileConverter();
			//Act Statement(s)
			File result = target.convert("<value>");
			DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader((ClassLoader) null);
			Resource resource = defaultResourceLoader.getResource("<value>");
			File file = resource.getFile();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(file));
				resourceUtils.verify(() -> ResourceUtils.isUrl("<value>"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${13bbfd1c-0f8c-32d7-bd4f-49ef55997d7c}, hash: 29F2B3B3C7118997E8270617F9E14D49
	@Disabled()
	@Test()
	void convertWhenResourceNotExists() throws IOException {
		/* Branches:
		 * (ResourceUtils.isUrl(source)) : false
		 * (file.exists()) : false
		 * (resource.exists()) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: resourceLoader
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
			resourceUtils.when(() -> ResourceUtils.isUrl("<value>")).thenReturn(false);
			StringToFileConverter target = new StringToFileConverter();
			//Act Statement(s)
			File result = target.convert("<value>");
			File file = new File("<value>");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(file));
				resourceUtils.verify(() -> ResourceUtils.isUrl("<value>"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${948c567c-eeea-3afd-a332-081877576f13}, hash: 762FF4554E2B040F672D8D18EDE9F9DB
	@Disabled()
	@Test()
	void convertWhenResourceExistsAndCaughtIOExceptionThrowsIllegalStateException() throws IOException {
		/* Branches:
		 * (ResourceUtils.isUrl(source)) : false
		 * (file.exists()) : false
		 * (resource.exists()) : true
		 * (catch-exception (IOException)) : true  #  inside getFile method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: resourceLoader
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class)) {
			resourceUtils.when(() -> ResourceUtils.isUrl("<value>")).thenReturn(false);
			StringToFileConverter target = new StringToFileConverter();
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.convert("<value>");
			});
			IllegalStateException illegalStateException = new IllegalStateException("Could not retrieve file for A: B");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				resourceUtils.verify(() -> ResourceUtils.isUrl("<value>"), atLeast(1));
			});
		}
	}
}
