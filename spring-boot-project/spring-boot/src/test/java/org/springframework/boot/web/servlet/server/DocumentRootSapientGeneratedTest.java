package org.springframework.boot.web.servlet.server;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.security.CodeSource;

import org.apache.commons.logging.Log;

import java.net.URL;
import java.io.File;
import java.security.cert.Certificate;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DocumentRootSapientGeneratedTest {

	//Sapient generated method id: ${2dee4d95-f631-3e76-b80f-a3d7dbc8796a}
	@Disabled()
	@Test()
	void getValidDirectoryWhenThisLoggerIsDebugEnabled() throws Exception {
		/* Branches:
		 * (file != null) : false
		 * (this.logger.isDebugEnabled()) : true  #  inside getArchiveFileDocumentRoot method
		 * (file != null) : true  #  inside getArchiveFileDocumentRoot method
		 * (file.exists()) : true  #  inside getArchiveFileDocumentRoot method
		 * (!file.isDirectory()) : true  #  inside getArchiveFileDocumentRoot method
		 * (file.getName().toLowerCase(Locale.ENGLISH).endsWith(extension)) : true  #  inside getArchiveFileDocumentRoot method
		 * (file != null) : true
		 * (file != null) : true
		 * (file == null) : false
		 * (this.logger.isDebugEnabled()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DocumentRoot target = spy(new DocumentRoot((Log) null));
		File file = new File("pathname1");
		doReturn(file).when(target).getCodeSourceArchive((CodeSource) any());
		//Act Statement(s)
		File result = target.getValidDirectory();
		File file2 = new File("pathname1");
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(file2));
			verify(target).getCodeSourceArchive((CodeSource) any());
		});
	}

	//Sapient generated method id: ${435668b7-3e13-30f7-842c-abc83369e6f7}
	@Disabled()
	@Test()
	void getValidDirectoryWhenThisLoggerNotIsDebugEnabledAndThisLoggerNotIsDebugEnabled() throws Exception {
		/* Branches:
		 * (file != null) : false
		 * (this.logger.isDebugEnabled()) : true  #  inside getArchiveFileDocumentRoot method
		 * (file != null) : false  #  inside getArchiveFileDocumentRoot method
		 * (file != null) : false
		 * (file != null) : false
		 * (for-each(COMMON_DOC_ROOTS)) : true  #  inside getCommonDocumentRoot method
		 * (root.exists()) : false  #  inside getCommonDocumentRoot method
		 * (file == null) : true
		 * (this.logger.isDebugEnabled()) : false
		 * (this.logger.isDebugEnabled()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DocumentRoot target = spy(new DocumentRoot((Log) null));
		File file = new File("pathname1");
		doReturn(null, file).when(target).getCodeSourceArchive((CodeSource) any());
		doReturn(null).when(target).getExplodedWarFileDocumentRoot(file);
		//Act Statement(s)
		File result = target.getValidDirectory();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(target, atLeast(2)).getCodeSourceArchive((CodeSource) any());
			verify(target).getExplodedWarFileDocumentRoot(file);
		});
	}

	//Sapient generated method id: ${161be609-c57f-3f50-be85-f2346a6e703b}
	@Disabled()
	@Test()
	void getValidDirectoryWhenFileIsNullAndThisLoggerIsDebugEnabled() throws Exception {
		/* Branches:
		 * (file != null) : false
		 * (this.logger.isDebugEnabled()) : true  #  inside getArchiveFileDocumentRoot method
		 * (file != null) : true  #  inside getArchiveFileDocumentRoot method
		 * (file.exists()) : true  #  inside getArchiveFileDocumentRoot method
		 * (!file.isDirectory()) : true  #  inside getArchiveFileDocumentRoot method
		 * (file.getName().toLowerCase(Locale.ENGLISH).endsWith(extension)) : true  #  inside getArchiveFileDocumentRoot method
		 * (file != null) : false
		 * (file != null) : false
		 * (for-each(COMMON_DOC_ROOTS)) : true  #  inside getCommonDocumentRoot method
		 * (root.exists()) : false  #  inside getCommonDocumentRoot method
		 * (file == null) : true
		 * (this.logger.isDebugEnabled()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DocumentRoot target = spy(new DocumentRoot((Log) null));
		File file = new File("pathname1");
		File file2 = new File("pathname1");
		doReturn(file, file2).when(target).getCodeSourceArchive((CodeSource) any());
		doReturn(null).when(target).getExplodedWarFileDocumentRoot(file2);
		//Act Statement(s)
		File result = target.getValidDirectory();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(target, atLeast(2)).getCodeSourceArchive((CodeSource) any());
			verify(target).getExplodedWarFileDocumentRoot(file2);
		});
	}

	//Sapient generated method id: ${373d8374-841d-3f85-bbf4-9883767db820}
	@Test()
	void getCodeSourceArchive1WhenCodeSourceIsNullAndLocationIsNull() throws Exception {
		/* Branches:
		 * (codeSource != null) : false
		 * (location == null) : true
		 */
		//Arrange Statement(s)
		DocumentRoot target = new DocumentRoot((Log) null);
		CodeSource codeSource = null;
		//Act Statement(s)
		File result = target.getCodeSourceArchive(codeSource);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${890b0a31-866d-30c9-985d-fab39dfd8141}
	@Disabled()
	@Test()
	void getCodeSourceArchive1WhenIndexNotEqualsMinus1() throws Exception {
		/* Branches:
		 * (codeSource != null) : true
		 * (location == null) : false
		 * (connection instanceof JarURLConnection jarURLConnection) : true
		 * (index != -1) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DocumentRoot target = new DocumentRoot((Log) null);
		Certificate[] certificateArray = new Certificate[] {};
		CodeSource codeSource = new CodeSource((URL) null, certificateArray);
		//Act Statement(s)
		File result = target.getCodeSourceArchive(codeSource);
		File file = new File("");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(file)));
	}

	//Sapient generated method id: ${5dcb5663-bf3e-3d4e-80f7-cb47a0648026}
	@Test()
	void getCodeSourceArchive1WhenCaughtException() throws Exception {
		/* Branches:
		 * (codeSource != null) : true
		 * (location == null) : false
		 * (connection instanceof JarURLConnection jarURLConnection) : true
		 * (index != -1) : true
		 * (catch-exception (Exception)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DocumentRoot target = new DocumentRoot((Log) null);
		Certificate[] certificateArray = new Certificate[] {};
		CodeSource codeSource = new CodeSource((URL) null, certificateArray);
		//Act Statement(s)
		File result = target.getCodeSourceArchive(codeSource);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${58c29682-3126-3aff-8fe0-23c7f8ba0036}
	@Disabled()
	@Test()
	void getExplodedWarFileDocumentRoot1WhenWebInfPathIndexGreaterThanOrEqualsTo0() {
		/* Branches:
		 * (this.logger.isDebugEnabled()) : true
		 * (codeSourceFile != null) : true
		 * (codeSourceFile.exists()) : true
		 * (webInfPathIndex >= 0) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DocumentRoot target = new DocumentRoot((Log) null);
		File file = new File("pathname1");
		//Act Statement(s)
		File result = target.getExplodedWarFileDocumentRoot(file);
		File file2 = new File("");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(file2)));
	}

	//Sapient generated method id: ${0cc41f0a-ebac-3814-ba84-16b1732078e4}
	@Disabled()
	@Test()
	void getExplodedWarFileDocumentRoot1WhenWebInfPathIndexLessThan0() {
		/* Branches:
		 * (this.logger.isDebugEnabled()) : true
		 * (codeSourceFile != null) : true
		 * (codeSourceFile.exists()) : true
		 * (webInfPathIndex >= 0) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DocumentRoot target = new DocumentRoot((Log) null);
		File file = new File("pathname1");
		//Act Statement(s)
		File result = target.getExplodedWarFileDocumentRoot(file);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}
}
