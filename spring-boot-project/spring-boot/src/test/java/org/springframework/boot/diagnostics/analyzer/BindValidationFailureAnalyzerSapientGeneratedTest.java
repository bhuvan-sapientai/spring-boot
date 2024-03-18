package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.boot.origin.Origin;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.boot.diagnostics.FailureAnalysis;

import org.mockito.MockedStatic;

import org.springframework.validation.ObjectError;

import java.util.ArrayList;

import org.springframework.boot.context.properties.bind.validation.ValidationErrors;
import org.springframework.boot.context.properties.bind.validation.BindValidationException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BindValidationFailureAnalyzerSapientGeneratedTest {

	private final BindValidationException failureMock = mock(BindValidationException.class, "BindValidationException");

	private final ValidationErrors validationErrorsMock = mock(ValidationErrors.class);

	//Sapient generated method id: ${74528cc7-6566-32ce-bcb9-9d46fce74dc2}, hash: 529EC1318072A575215369AFCB99724F
	@Test()
	void analyze2WhenDetailsIsNotNullAndDetailsGetErrorsIsEmpty() {
		/* Branches:
		 * (failure != null) : true  #  inside findCause method
		 * (type.isInstance(failure)) : true  #  inside findCause method
		 * (validationException != null) : true  #  inside getBindValidationExceptionDetails method
		 * (details == null) : false
		 * (for-each(details.getErrors())) : false  #  inside analyzeBindValidationException method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(null).when(failureMock).getCause();
		doReturn(validationErrorsMock).when(failureMock).getValidationErrors();
		ObjectError objectError = new ObjectError("objectName1", "defaultMessage1");
		List<ObjectError> objectErrorList = new ArrayList<>();
		objectErrorList.add(objectError);
		doReturn(objectErrorList).when(validationErrorsMock).getAllErrors();
		BindValidationFailureAnalyzer target = new BindValidationFailureAnalyzer();
		Throwable throwableMock = mock(Throwable.class, "Throwable");
		//Act Statement(s)
		FailureAnalysis result = target.analyze((Throwable) failureMock, throwableMock);
		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(failureMock).getCause();
			verify(failureMock).getValidationErrors();
			verify(validationErrorsMock).getAllErrors();
		});
	}

	//Sapient generated method id: ${4b493960-dc90-359c-8031-c5ab43a592c4}, hash: DF259948BB4450BAD562C63B365AF4AA
	@Test()
	void analyze2WhenBindExceptionIsNullAndDetailsIsNull() {
		/* Branches:
		 * (failure != null) : true  #  inside findCause method
		 * (type.isInstance(failure)) : false  #  inside findCause method
		 * (validationException != null) : false  #  inside getBindValidationExceptionDetails method
		 * (bindException != null) : false  #  inside getBindValidationExceptionDetails method
		 * (details == null) : true
		 */
		//Arrange Statement(s)
		BindValidationFailureAnalyzer target = new BindValidationFailureAnalyzer();
		Throwable throwable = new Throwable();
		Throwable throwable2 = new Throwable();
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, throwable2);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${1d3180ec-8a4f-3ced-b157-b41f55510059}, hash: 15622B7EFE81E93AF6A9FF4AEF817BD3
	@Test()
	void analyze2WhenBindExceptionIsNotNullAndDetailsIsNotNullAndDetailsGetErrorsIsEmpty() {
		/* Branches:
		 * (failure != null) : true  #  inside findCause method
		 * (type.isInstance(failure)) : false  #  inside findCause method
		 * (validationException != null) : false  #  inside getBindValidationExceptionDetails method
		 * (bindException != null) : true  #  inside getBindValidationExceptionDetails method
		 * (details == null) : false
		 * (for-each(details.getErrors())) : false  #  inside analyzeBindValidationException method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		BindException bindExceptionMock = mock(BindException.class);
		List<ObjectError> objectErrorList = new ArrayList<>();
		doReturn(objectErrorList).when(bindExceptionMock).getAllErrors();
		Object object = new Object();
		doReturn(object).when(bindExceptionMock).getTarget();
		BindValidationFailureAnalyzer target = new BindValidationFailureAnalyzer();
		Throwable throwable = new Throwable();
		//Act Statement(s)
		FailureAnalysis result = target.analyze((Throwable) bindExceptionMock, throwable);
		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(bindExceptionMock).getAllErrors();
			verify(bindExceptionMock).getTarget();
		});
	}

	//Sapient generated method id: ${9e0f0ffa-acc2-39f4-ae79-30dee02dbcff}, hash: 3FAADE1A9C2A3A74636A4E9F9EC9C98E
	@Disabled()
	@Test()
	void analyze2WhenOriginIsNotNull() {
		/* Branches:
		 * (failure != null) : true  #  inside findCause method
		 * (type.isInstance(failure)) : true  #  inside findCause method
		 * (validationException != null) : true  #  inside getBindValidationExceptionDetails method
		 * (details == null) : false
		 * (for-each(details.getErrors())) : true  #  inside analyzeBindValidationException method
		 * (error instanceof FieldError fieldError) : true  #  inside analyzeBindValidationException method
		 * (origin != null) : true  #  inside appendFieldError method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Origin originMock = mock(Origin.class, "Origin");
		Object objectMock = mock(Object.class, "Object");
		try (MockedStatic<Origin> origin = mockStatic(Origin.class)) {
			doReturn(null).when(failureMock).getCause();
			doReturn(validationErrorsMock).when(failureMock).getValidationErrors();
			ObjectError objectError = new ObjectError("objectName1", "defaultMessage1");
			List<ObjectError> objectErrorList = new ArrayList<>();
			objectErrorList.add(objectError);
			doReturn(objectErrorList).when(validationErrorsMock).getAllErrors();
			String[] stringArray = new String[] {};
			Object[] objectArray = new Object[] {};
			FieldError fieldError = new FieldError("", "", objectMock, false, stringArray, objectArray, "");
			origin.when(() -> Origin.from(fieldError)).thenReturn(originMock);
			BindValidationFailureAnalyzer target = new BindValidationFailureAnalyzer();
			Throwable throwable = new Throwable();
			//Act Statement(s)
			FailureAnalysis result = target.analyze((Throwable) failureMock, throwable);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(failureMock).getCause();
				verify(failureMock).getValidationErrors();
				verify(validationErrorsMock).getAllErrors();
				origin.verify(() -> Origin.from(fieldError), atLeast(1));
			});
		}
	}
}
