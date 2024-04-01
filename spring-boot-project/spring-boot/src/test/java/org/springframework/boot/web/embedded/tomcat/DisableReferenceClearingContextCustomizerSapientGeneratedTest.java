package org.springframework.boot.web.embedded.tomcat;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.Context;

import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DisableReferenceClearingContextCustomizerSapientGeneratedTest {

	//Sapient generated method id: ${50581471-8810-3105-b9d8-25d6161dcea5}, hash: 457EE98D3C2761459B170C52BDE17C0D
	@Test()
	void customizeWhenContextNotInstanceOfStandardContext() throws NoSuchMethodError {
		/* Branches:
		 * (!(context instanceof StandardContext standardContext)) : true
		 */
		//Arrange Statement(s)
		DisableReferenceClearingContextCustomizer target = new DisableReferenceClearingContextCustomizer();
		Context contextMock = mock(Context.class);
		//Act Statement(s)
		target.customize(contextMock);
	}

	//Sapient generated method id: ${51eff47f-39da-373d-a348-f86bfe82c95e}, hash: 7625687E434EF73A7E8A519795E733AD
	@Test()
	void customizeWhenContextInstanceOfStandardContext() throws NoSuchMethodError {
		/* Branches:
		 * (!(context instanceof StandardContext standardContext)) : false
		 */
		//Arrange Statement(s)
		DisableReferenceClearingContextCustomizer target = new DisableReferenceClearingContextCustomizer();
		StandardContext standardContext = new StandardContext();
		standardContext.setClearReferencesObjectStreamClassCaches(false);
		standardContext.setClearReferencesRmiTargets(false);
		standardContext.setClearReferencesThreadLocals(false);
		//Act Statement(s)
		target.customize(standardContext);
	}

	//Sapient generated method id: ${d72aefa7-deca-35dd-b537-5d5ec4ca5a60}, hash: 621693E28A7A44299CAE23912B8281A4
	@Test()
	void customizeWhenCaughtNoSuchMethodError() throws NoSuchMethodError {
		/* Branches:
		 * (!(context instanceof StandardContext standardContext)) : false
		 * (catch-exception (NoSuchMethodError)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		DisableReferenceClearingContextCustomizer target = new DisableReferenceClearingContextCustomizer();
		StandardContext standardContext = new StandardContext();
		standardContext.setClearReferencesObjectStreamClassCaches(false);
		standardContext.setClearReferencesRmiTargets(false);
		standardContext.setClearReferencesThreadLocals(false);
		//Act Statement(s)
		target.customize(standardContext);
	}
}
