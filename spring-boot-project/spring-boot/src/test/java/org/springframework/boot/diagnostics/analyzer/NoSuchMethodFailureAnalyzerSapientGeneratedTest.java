package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.util.ClassUtils;
import org.springframework.boot.diagnostics.FailureAnalysis;

import java.net.URL;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NoSuchMethodFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${704eaada-d20a-3dfa-adfd-a484b34d4e53}
	@Test()
	void analyze2WhenCallerDescriptorIsNull() throws Throwable {
		/* Branches:
		 * (className == null) : true  #  inside getDescriptorForClass method
		 * (callerDescriptor == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
		Throwable throwable = new Throwable();
		StackTraceElement stackTraceElement = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
		StackTraceElement[] stackTraceElementArray = new StackTraceElement[] { stackTraceElement };
		NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
		noSuchMethodError.setStackTrace(stackTraceElementArray);
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${6fbb3818-3e5a-3c60-a4bc-a4f9d001e509}
	@Disabled()
	@Test()
	void analyze2WhenCandidatesIsNullAndCallerDescriptorIsNull() throws Throwable {
		/* Branches:
		 * (className == null) : false  #  inside getDescriptorForClass method
		 * (candidates == null) : true  #  inside getDescriptorForClass method
		 * (callerDescriptor == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.NativeConstructorAccessorImpl")).thenReturn("");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.NativeConstructorAccessorImpl"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b29d7342-ebab-3a0d-9728-0d79a6d7c706}
	@Test()
	void analyze2WhenTypeIsNullAndCallerDescriptorIsNull() throws Throwable {
		/* Branches:
		 * (className == null) : false  #  inside getDescriptorForClass method
		 * (candidates == null) : false  #  inside getDescriptorForClass method
		 * (type == null) : true  #  inside getDescriptorForClass method
		 * (callerDescriptor == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
		Throwable throwable = new Throwable();
		StackTraceElement stackTraceElement = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
		StackTraceElement[] stackTraceElementArray = new StackTraceElement[] { stackTraceElement };
		NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
		noSuchMethodError.setStackTrace(stackTraceElementArray);
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${206a33ac-70eb-3ff2-9ee4-90320a86047a}
	@Disabled()
	@Test()
	void analyze2WhenCaughtThrowableAndCandidatesIsNullAndCallerDescriptorIsNull() throws Throwable {
		/* Branches:
		 * (className == null) : false  #  inside getDescriptorForClass method
		 * (catch-exception (Throwable)) : true  #  inside findCandidates method
		 * (candidates == null) : true  #  inside getDescriptorForClass method
		 * (callerDescriptor == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.NativeConstructorAccessorImpl")).thenReturn("");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.NativeConstructorAccessorImpl"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f4e264c8-31c9-34e8-acd1-9e99b5229330}
	@Disabled()
	@Test()
	void analyze2WhenCaughtThrowableAndTypeIsNullAndCallerDescriptorIsNull() throws Throwable {
		/* Branches:
		 * (className == null) : false  #  inside getDescriptorForClass method
		 * (candidates == null) : false  #  inside getDescriptorForClass method
		 * (catch-exception (Throwable)) : true  #  inside load method
		 * (type == null) : true  #  inside getDescriptorForClass method
		 * (callerDescriptor == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Class> _class = mockStatic(Class.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.NativeConstructorAccessorImpl")).thenReturn("java.lang.String");
			_class.when(() -> Class.forName(eq("jdk.internal.reflect.NativeConstructorAccessorImpl"), eq(false), (ClassLoader) any())).thenReturn(Class.class);
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.NativeConstructorAccessorImpl"), atLeast(1));
				_class.verify(() -> Class.forName(eq("jdk.internal.reflect.NativeConstructorAccessorImpl"), eq(false), (ClassLoader) any()));
			});
		}
	}

	//Sapient generated method id: ${afabb07b-a959-3e25-b98c-7d5e9c454e74}
	@Disabled()
	@Test()
	void analyze2WhenTypeHierarchyIsNullAndCallerDescriptorIsNull() throws Throwable {
		/* Branches:
		 * (className == null) : false  #  inside getDescriptorForClass method
		 * (candidates == null) : false  #  inside getDescriptorForClass method
		 * (type == null) : false  #  inside getDescriptorForClass method
		 * (type != null) : true  #  inside getTypeHierarchy method
		 * (!type.equals(Object.class)) : true  #  inside getTypeHierarchy method
		 * (typeHierarchy == null) : true  #  inside getDescriptorForClass method
		 * (callerDescriptor == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor527")).thenReturn("convertClassNameToResourcePathValue");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor527"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${fde1cfb1-74d7-34a6-b921-4198b5c8db60}
	@Disabled()
	@Test()
	void analyze2WhenCalledDescriptorIsNull() throws Throwable {
		/* Branches:
		 * (className == null) : false  #  inside getDescriptorForClass method
		 * (candidates == null) : false  #  inside getDescriptorForClass method
		 * (type == null) : false  #  inside getDescriptorForClass method
		 * (type != null) : true  #  inside getTypeHierarchy method
		 * (!type.equals(Object.class)) : true  #  inside getTypeHierarchy method
		 * (typeHierarchy == null) : false  #  inside getDescriptorForClass method
		 * (callerDescriptor == null) : false
		 * (calledDescriptor == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NoSuchMethodFailureAnalyzer target = spy(new NoSuchMethodFailureAnalyzer());
		doReturn(null).when(target).getNoSuchMethodDescriptor("s1");
		Throwable throwable = new Throwable();
		StackTraceElement stackTraceElement = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
		StackTraceElement[] stackTraceElementArray = new StackTraceElement[] { stackTraceElement };
		NoSuchMethodError noSuchMethodError = new NoSuchMethodError("s1");
		noSuchMethodError.setStackTrace(stackTraceElementArray);
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(target).getNoSuchMethodDescriptor("s1");
		});
	}

	//Sapient generated method id: ${43a85aae-4c7b-361b-93a3-0a08feefbb73}
	@Disabled()
	@Test()
	void analyze2WhenCaughtThrowableAndTypeHierarchyIsNullAndCallerDescriptorIsNull() throws Throwable {
		/* Branches:
		 * (className == null) : false  #  inside getDescriptorForClass method
		 * (candidates == null) : false  #  inside getDescriptorForClass method
		 * (type == null) : false  #  inside getDescriptorForClass method
		 * (type != null) : true  #  inside getTypeHierarchy method
		 * (!type.equals(Object.class)) : true  #  inside getTypeHierarchy method
		 * (catch-exception (Throwable)) : true  #  inside getTypeHierarchy method
		 * (typeHierarchy == null) : true  #  inside getDescriptorForClass method
		 * (callerDescriptor == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.NativeConstructorAccessorImpl")).thenReturn("convertClassNameToResourcePathValue");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.NativeConstructorAccessorImpl"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7a2df98d-0caa-32ab-b012-b9fce2ca49e3}
	@Disabled()
	@Test()
	void analyze2WhenCallerDescriptorGetClassNameNotEqualsCalledDescriptorGetClassName() throws Throwable {
		/* Branches:
		 * (className == null) : false  #  inside getDescriptorForClass method
		 * (candidates == null) : false  #  inside getDescriptorForClass method
		 * (type == null) : false  #  inside getDescriptorForClass method
		 * (type != null) : true  #  inside getTypeHierarchy method
		 * (!type.equals(Object.class)) : true  #  inside getTypeHierarchy method
		 * (typeHierarchy == null) : false  #  inside getDescriptorForClass method
		 * (callerDescriptor == null) : false
		 * (calledDescriptor == null) : false
		 * (callerDescriptor.getCandidateLocations().size() > 1) : false  #  inside getDescription method
		 * (for-each(calledDescriptor.getCandidateLocations())) : true  #  inside getDescription method
		 * (for-each(calledDescriptor.getTypeHierarchy())) : true  #  inside getDescription method
		 * (callerDescriptor.getClassName().equals(calledDescriptor.getClassName())) : false  #  inside getAction method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NoSuchMethodFailureAnalyzer target = spy(new NoSuchMethodFailureAnalyzer());
		List<URL> uRLList = new ArrayList<>();
		uRLList.add((URL) null);
		NoSuchMethodFailureAnalyzer.ClassDescriptor noSuchMethodFailureAnalyzerClassDescriptor = new NoSuchMethodFailureAnalyzer.ClassDescriptor("name1", (URL) null);
		List<NoSuchMethodFailureAnalyzer.ClassDescriptor> noSuchMethodFailureAnalyzerClassDescriptorList = new ArrayList<>();
		noSuchMethodFailureAnalyzerClassDescriptorList.add(noSuchMethodFailureAnalyzerClassDescriptor);
		NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor noSuchMethodFailureAnalyzerNoSuchMethodDescriptor = new NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor("errorMessage1", "B", uRLList, noSuchMethodFailureAnalyzerClassDescriptorList);
		doReturn(noSuchMethodFailureAnalyzerNoSuchMethodDescriptor).when(target).getNoSuchMethodDescriptor("s1");
		Throwable throwable = new Throwable();
		StackTraceElement stackTraceElement = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
		StackTraceElement[] stackTraceElementArray = new StackTraceElement[] { stackTraceElement };
		NoSuchMethodError noSuchMethodError = new NoSuchMethodError("s1");
		noSuchMethodError.setStackTrace(stackTraceElementArray);
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
		FailureAnalysis failureAnalysis = new FailureAnalysis("An attempt was made to call a method that does not exist. The attempt was made from the following location:\n\n\nThe following method did not exist:\n\n\n\n\n\n\nThe called method's class hierarchy was loaded from the following locations:\n\n", "Correct the classpath of your application so that it contains compatible versions of the classes A and B", noSuchMethodError);
		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(failureAnalysis));
			verify(target).getNoSuchMethodDescriptor("s1");
		});
	}

	//Sapient generated method id: ${4426d88f-f417-34bc-9500-2ae3aa57161f}
	@Disabled()
	@Test()
	void analyze2WhenCallerDescriptorGetClassNameEqualsCalledDescriptorGetClassName() throws Throwable {
		/* Branches:
		 * (className == null) : false  #  inside getDescriptorForClass method
		 * (candidates == null) : false  #  inside getDescriptorForClass method
		 * (type == null) : false  #  inside getDescriptorForClass method
		 * (type != null) : true  #  inside getTypeHierarchy method
		 * (!type.equals(Object.class)) : true  #  inside getTypeHierarchy method
		 * (typeHierarchy == null) : false  #  inside getDescriptorForClass method
		 * (callerDescriptor == null) : false
		 * (calledDescriptor == null) : false
		 * (callerDescriptor.getCandidateLocations().size() > 1) : true  #  inside getDescription method
		 * (for-each(callerDescriptor.getCandidateLocations())) : true  #  inside getDescription method
		 * (for-each(calledDescriptor.getCandidateLocations())) : true  #  inside getDescription method
		 * (for-each(calledDescriptor.getTypeHierarchy())) : true  #  inside getDescription method
		 * (callerDescriptor.getClassName().equals(calledDescriptor.getClassName())) : true  #  inside getAction method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NoSuchMethodFailureAnalyzer target = spy(new NoSuchMethodFailureAnalyzer());
		List<URL> uRLList = new ArrayList<>();
		uRLList.add((URL) null);
		NoSuchMethodFailureAnalyzer.ClassDescriptor noSuchMethodFailureAnalyzerClassDescriptor = new NoSuchMethodFailureAnalyzer.ClassDescriptor("name1", (URL) null);
		List<NoSuchMethodFailureAnalyzer.ClassDescriptor> noSuchMethodFailureAnalyzerClassDescriptorList = new ArrayList<>();
		noSuchMethodFailureAnalyzerClassDescriptorList.add(noSuchMethodFailureAnalyzerClassDescriptor);
		NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor noSuchMethodFailureAnalyzerNoSuchMethodDescriptor = new NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor("errorMessage1", "A", uRLList, noSuchMethodFailureAnalyzerClassDescriptorList);
		doReturn(noSuchMethodFailureAnalyzerNoSuchMethodDescriptor).when(target).getNoSuchMethodDescriptor("s1");
		Throwable throwable = new Throwable();
		StackTraceElement stackTraceElement = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
		StackTraceElement[] stackTraceElementArray = new StackTraceElement[] { stackTraceElement };
		NoSuchMethodError noSuchMethodError = new NoSuchMethodError("s1");
		noSuchMethodError.setStackTrace(stackTraceElementArray);
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
		FailureAnalysis failureAnalysis = new FailureAnalysis("An attempt was made to call a method that does not exist. The attempt was made from the following location:\n\n\nThe following method did not exist:\n\n\n\n\nThe calling method's class was loaded from the following location:\n\n\n\n\nThe called method's class hierarchy was loaded from the following locations:\n\n", "Correct the classpath of your application so that it contains a single, compatible version of A", noSuchMethodError);
		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, equalTo(failureAnalysis));
			verify(target).getNoSuchMethodDescriptor("s1");
		});
	}

	//Sapient generated method id: ${0c3f36ec-db06-34b6-92e4-f72114cad8fa}
	@Disabled()
	@Test()
	void analyze2WhenCalledDescriptorGetTypeHierarchyIsNotEmptyAndCallerDescriptorGetClassNameNotEqualsCalledDescriptorGetClassN2() throws Throwable {
		/* Branches:
		 * (className == null) : false  #  inside getDescriptorForClass method
		 * (candidates == null) : false  #  inside getDescriptorForClass method
		 * (type == null) : false  #  inside getDescriptorForClass method
		 * (type != null) : true  #  inside getTypeHierarchy method
		 * (!type.equals(Object.class)) : true  #  inside getTypeHierarchy method
		 * (typeHierarchy == null) : false  #  inside getDescriptorForClass method
		 * (callerDescriptor == null) : false
		 * (calledDescriptor == null) : false
		 * (callerDescriptor.getCandidateLocations().size() > 1) : true  #  inside getDescription method
		 * (for-each(callerDescriptor.getCandidateLocations())) : true  #  inside getDescription method
		 * (for-each(calledDescriptor.getCandidateLocations())) : true  #  inside getDescription method
		 * (for-each(calledDescriptor.getTypeHierarchy())) : true  #  inside getDescription method
		 * (callerDescriptor.getClassName().equals(calledDescriptor.getClassName())) : false  #  inside getAction method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor527")).thenReturn("convertClassNameToResourcePathValue");
			NoSuchMethodFailureAnalyzer target = spy(new NoSuchMethodFailureAnalyzer());
			List<URL> uRLList = new ArrayList<>();
			uRLList.add((URL) null);
			NoSuchMethodFailureAnalyzer.ClassDescriptor noSuchMethodFailureAnalyzerClassDescriptor = new NoSuchMethodFailureAnalyzer.ClassDescriptor("name1", (URL) null);
			List<NoSuchMethodFailureAnalyzer.ClassDescriptor> noSuchMethodFailureAnalyzerClassDescriptorList = new ArrayList<>();
			noSuchMethodFailureAnalyzerClassDescriptorList.add(noSuchMethodFailureAnalyzerClassDescriptor);
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor noSuchMethodFailureAnalyzerNoSuchMethodDescriptor = new NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor("errorMessage1", "", uRLList, noSuchMethodFailureAnalyzerClassDescriptorList);
			doReturn(noSuchMethodFailureAnalyzerNoSuchMethodDescriptor).when(target).getNoSuchMethodDescriptor((String) null);
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			FailureAnalysis failureAnalysis = new FailureAnalysis("An attempt was made to call a method that does not exist. The attempt was made from the following location:\n\n    java.base/jdk.internal.reflect.GeneratedConstructorAccessor527.newInstance(Unknown Source)\n\nThe following method did not exist:\n\n    errorMessage1\n\nThe calling method's class, jdk.internal.reflect.GeneratedConstructorAccessor527, is available from the following locations:\n\n\nThe calling method's class was loaded from the following location:\n\n\nThe called method's class, , is available from the following locations:\n\n\nThe called method's class hierarchy was loaded from the following locations:\n\n    null: null\n", "Correct the classpath of your application so that it contains compatible versions of the classes jdk.internal.reflect.GeneratedConstructorAccessor527 and ", noSuchMethodError);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(failureAnalysis));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor527"), atLeast(1));
				verify(target).getNoSuchMethodDescriptor((String) null);
			});
		}
	}

	//Sapient generated method id: ${d47752d3-f58d-3714-9c1a-0b70470e9832}
	@Test()
	void getNoSuchMethodDescriptorWhenSplitIndexEqualsMinus1AndClassNameIsNull() throws Throwable {
		/* Branches:
		 * (loadedFromIndex == -1) : true  #  inside cleanMessage method
		 * (message.startsWith("'")) : true  #  inside extractClassName method
		 * (message.endsWith("'")) : true  #  inside extractClassName method
		 * (splitIndex == -1) : true  #  inside extractClassName method
		 * (className == null) : true  #  inside getDescriptorForClass method
		 */
		//Arrange Statement(s)
		NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
		//Act Statement(s)
		NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("'");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${5420aee5-49cc-3d26-ba4d-4283ceebc47b}
	@Test()
	void getNoSuchMethodDescriptorWhenSplitIndexNotEqualsMinus1AndDescriptorIndexEqualsMinus1AndClassNameIsNull() throws Throwable {
		/* Branches:
		 * (loadedFromIndex == -1) : true  #  inside cleanMessage method
		 * (message.startsWith("'")) : true  #  inside extractClassName method
		 * (message.endsWith("'")) : true  #  inside extractClassName method
		 * (splitIndex == -1) : false  #  inside extractClassName method
		 * (descriptorIndex == -1) : true  #  inside extractClassName method
		 * (className == null) : true  #  inside getDescriptorForClass method
		 */
		//Arrange Statement(s)
		NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
		//Act Statement(s)
		NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("' '");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${d65a6d3d-a9e1-394c-b9ee-0c8570fe3653}
	@Test()
	void getNoSuchMethodDescriptorWhenSplitIndexNotEqualsMinus1AndDescriptorIndexNotEqualsMinus1AndMethodNameIndexEqualsMinus1An() throws Throwable {
		/* Branches:
		 * (loadedFromIndex == -1) : true  #  inside cleanMessage method
		 * (message.startsWith("'")) : true  #  inside extractClassName method
		 * (message.endsWith("'")) : true  #  inside extractClassName method
		 * (splitIndex == -1) : false  #  inside extractClassName method
		 * (descriptorIndex == -1) : false  #  inside extractClassName method
		 * (methodNameIndex == -1) : true  #  inside extractClassName method
		 * (className == null) : true  #  inside getDescriptorForClass method
		 */
		//Arrange Statement(s)
		NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
		//Act Statement(s)
		NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("' ('");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${70022c1c-728e-3c66-87dc-42f436b04517}
	@Disabled()
	@Test()
	void getNoSuchMethodDescriptorWhenCandidatesIsNull() throws Throwable {
		/* Branches:
		 * (loadedFromIndex == -1) : true  #  inside cleanMessage method
		 * (message.startsWith("'")) : true  #  inside extractClassName method
		 * (message.endsWith("'")) : true  #  inside extractClassName method
		 * (splitIndex == -1) : false  #  inside extractClassName method
		 * (descriptorIndex == -1) : false  #  inside extractClassName method
		 * (methodNameIndex == -1) : false  #  inside extractClassName method
		 * (className == null) : false  #  inside getDescriptorForClass method
		 * (candidates == null) : true  #  inside getDescriptorForClass method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String")).thenReturn("return_of_convertClassNameToResourcePath1");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			//Act Statement(s)
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("cause1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${bdcf8c78-4b80-3efe-bc2c-65aff3d65a3f}
	@Disabled()
	@Test()
	void getNoSuchMethodDescriptorWhenTypeIsNull() throws Throwable {
		/* Branches:
		 * (loadedFromIndex == -1) : true  #  inside cleanMessage method
		 * (message.startsWith("'")) : true  #  inside extractClassName method
		 * (message.endsWith("'")) : true  #  inside extractClassName method
		 * (splitIndex == -1) : false  #  inside extractClassName method
		 * (descriptorIndex == -1) : false  #  inside extractClassName method
		 * (methodNameIndex == -1) : false  #  inside extractClassName method
		 * (className == null) : false  #  inside getDescriptorForClass method
		 * (candidates == null) : false  #  inside getDescriptorForClass method
		 * (type == null) : true  #  inside getDescriptorForClass method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String")).thenReturn("return_of_convertClassNameToResourcePath1");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			//Act Statement(s)
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("cause1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a8af11c4-bdea-39bd-a356-8355a188edd9}
	@Disabled()
	@Test()
	void getNoSuchMethodDescriptorWhenCaughtThrowableAndCandidatesIsNull() throws Throwable {
		/* Branches:
		 * (loadedFromIndex == -1) : true  #  inside cleanMessage method
		 * (message.startsWith("'")) : true  #  inside extractClassName method
		 * (message.endsWith("'")) : true  #  inside extractClassName method
		 * (splitIndex == -1) : false  #  inside extractClassName method
		 * (descriptorIndex == -1) : false  #  inside extractClassName method
		 * (methodNameIndex == -1) : false  #  inside extractClassName method
		 * (className == null) : false  #  inside getDescriptorForClass method
		 * (catch-exception (Throwable)) : true  #  inside findCandidates method
		 * (candidates == null) : true  #  inside getDescriptorForClass method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String")).thenReturn("return_of_convertClassNameToResourcePath1");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			//Act Statement(s)
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("cause1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5978b965-b6f0-3306-ae27-b0ecaf58b4ae}
	@Disabled()
	@Test()
	void getNoSuchMethodDescriptorWhenTypeHierarchyIsNotNull() throws Throwable {
		/* Branches:
		 * (loadedFromIndex == -1) : false  #  inside cleanMessage method
		 * (message.startsWith("'")) : false  #  inside extractClassName method
		 * (descriptorIndex == -1) : false  #  inside extractClassName method
		 * (methodNameIndex == -1) : false  #  inside extractClassName method
		 * (className == null) : false  #  inside getDescriptorForClass method
		 * (candidates == null) : false  #  inside getDescriptorForClass method
		 * (type == null) : false  #  inside getDescriptorForClass method
		 * (type != null) : true  #  inside getTypeHierarchy method
		 * (!type.equals(Object.class)) : false  #  inside getTypeHierarchy method
		 * (typeHierarchy == null) : false  #  inside getDescriptorForClass method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String")).thenReturn("return_of_convertClassNameToResourcePath1");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			//Act Statement(s)
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("cause1");
			ArrayList<URL> uRLList = new ArrayList<>();
			List<NoSuchMethodFailureAnalyzer.ClassDescriptor> noSuchMethodFailureAnalyzerClassDescriptorList = new ArrayList<>();
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor noSuchMethodFailureAnalyzerNoSuchMethodDescriptor = new NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor("errorMessage1", "java.lang.String", uRLList, noSuchMethodFailureAnalyzerClassDescriptorList);
			//Assert statement(s)
			//TODO: Please implement equals method in NoSuchMethodDescriptor for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(noSuchMethodFailureAnalyzerNoSuchMethodDescriptor));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${0b9c1389-dc3b-33be-a162-cf11a92a5a06}
	@Disabled()
	@Test()
	void getNoSuchMethodDescriptorWhenTypeHierarchyIsNull() throws Throwable {
		/* Branches:
		 * (loadedFromIndex == -1) : true  #  inside cleanMessage method
		 * (message.startsWith("'")) : true  #  inside extractClassName method
		 * (message.endsWith("'")) : true  #  inside extractClassName method
		 * (splitIndex == -1) : false  #  inside extractClassName method
		 * (descriptorIndex == -1) : false  #  inside extractClassName method
		 * (methodNameIndex == -1) : false  #  inside extractClassName method
		 * (className == null) : false  #  inside getDescriptorForClass method
		 * (candidates == null) : false  #  inside getDescriptorForClass method
		 * (type == null) : false  #  inside getDescriptorForClass method
		 * (type != null) : true  #  inside getTypeHierarchy method
		 * (!type.equals(Object.class)) : true  #  inside getTypeHierarchy method
		 * (typeHierarchy == null) : true  #  inside getDescriptorForClass method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String")).thenReturn("return_of_convertClassNameToResourcePath1");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			//Act Statement(s)
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("cause1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${258c1ae3-1861-3d56-872a-db04669ab3d1}
	@Disabled()
	@Test()
	void getNoSuchMethodDescriptorWhenTypeNotEqualsObjectAndTypeHierarchyIsNotNull() throws Throwable {
		/* Branches:
		 * (loadedFromIndex == -1) : true  #  inside cleanMessage method
		 * (message.startsWith("'")) : true  #  inside extractClassName method
		 * (message.endsWith("'")) : true  #  inside extractClassName method
		 * (splitIndex == -1) : false  #  inside extractClassName method
		 * (descriptorIndex == -1) : false  #  inside extractClassName method
		 * (methodNameIndex == -1) : false  #  inside extractClassName method
		 * (className == null) : false  #  inside getDescriptorForClass method
		 * (candidates == null) : false  #  inside getDescriptorForClass method
		 * (type == null) : false  #  inside getDescriptorForClass method
		 * (type != null) : true  #  inside getTypeHierarchy method
		 * (!type.equals(Object.class)) : true  #  inside getTypeHierarchy method
		 * (typeHierarchy == null) : false  #  inside getDescriptorForClass method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String")).thenReturn("return_of_convertClassNameToResourcePath1");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			//Act Statement(s)
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("cause1");
			ArrayList<URL> uRLList = new ArrayList<>();
			NoSuchMethodFailureAnalyzer.ClassDescriptor noSuchMethodFailureAnalyzerClassDescriptor = new NoSuchMethodFailureAnalyzer.ClassDescriptor("name1", (URL) null);
			List<NoSuchMethodFailureAnalyzer.ClassDescriptor> noSuchMethodFailureAnalyzerClassDescriptorList = new ArrayList<>();
			noSuchMethodFailureAnalyzerClassDescriptorList.add(noSuchMethodFailureAnalyzerClassDescriptor);
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor noSuchMethodFailureAnalyzerNoSuchMethodDescriptor = new NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor("cause1", "java.lang.String", uRLList, noSuchMethodFailureAnalyzerClassDescriptorList);
			//Assert statement(s)
			//TODO: Please implement equals method in NoSuchMethodDescriptor for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(noSuchMethodFailureAnalyzerNoSuchMethodDescriptor));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${19dfbaac-d8b9-3bac-abc8-63285332bd07}
	@Disabled()
	@Test()
	void getNoSuchMethodDescriptorWhenCaughtThrowableAndTypeHierarchyIsNull() throws Throwable {
		/* Branches:
		 * (loadedFromIndex == -1) : true  #  inside cleanMessage method
		 * (message.startsWith("'")) : true  #  inside extractClassName method
		 * (message.endsWith("'")) : true  #  inside extractClassName method
		 * (splitIndex == -1) : false  #  inside extractClassName method
		 * (descriptorIndex == -1) : false  #  inside extractClassName method
		 * (methodNameIndex == -1) : false  #  inside extractClassName method
		 * (className == null) : false  #  inside getDescriptorForClass method
		 * (candidates == null) : false  #  inside getDescriptorForClass method
		 * (type == null) : false  #  inside getDescriptorForClass method
		 * (type != null) : true  #  inside getTypeHierarchy method
		 * (!type.equals(Object.class)) : true  #  inside getTypeHierarchy method
		 * (catch-exception (Throwable)) : true  #  inside getTypeHierarchy method
		 * (typeHierarchy == null) : true  #  inside getDescriptorForClass method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String")).thenReturn("return_of_convertClassNameToResourcePath1");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			//Act Statement(s)
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("cause1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String"), atLeast(1));
			});
		}
	}
}
