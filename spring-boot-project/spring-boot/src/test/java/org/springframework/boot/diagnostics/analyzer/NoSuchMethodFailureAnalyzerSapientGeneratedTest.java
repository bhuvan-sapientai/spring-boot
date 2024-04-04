package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.util.ClassUtils;
import org.springframework.boot.diagnostics.FailureAnalysis;

import java.net.URL;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NoSuchMethodFailureAnalyzerSapientGeneratedTest {

	private final URL uRLMock = mock(URL.class);

	private final URL uRLMock2 = mock(URL.class);

	//Sapient generated method id: ${704eaada-d20a-3dfa-adfd-a484b34d4e53}, hash: 26D1CF0F3A6259BCEE58F7244A5F4278
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

	//Sapient generated method id: ${6fbb3818-3e5a-3c60-a4bc-a4f9d001e509}, hash: 6E521C22AD9770541C80CC7C18156D62
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor424")).thenReturn("");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor424"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b29d7342-ebab-3a0d-9728-0d79a6d7c706}, hash: 353E9C8F6DFD08934381D66891B37541
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
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor424")).thenReturn("");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor424"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${206a33ac-70eb-3ff2-9ee4-90320a86047a}, hash: 85CF9D1E64B2E13354CDCA23707D8DE9
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor424")).thenReturn("<value>");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor424"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f4e264c8-31c9-34e8-acd1-9e99b5229330}, hash: 59B5879BB2FA785FE85364606AC29166
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor424")).thenReturn("org.springframework.boot.diagnostics.analyzer.NoSuchMethodFailureAnalyzer");
			_class.when(() -> Class.forName(eq("jdk.internal.reflect.GeneratedConstructorAccessor424"), eq(false), (ClassLoader) any())).thenReturn(ClassNotFoundException.class);
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor424"), atLeast(1));
				_class.verify(() -> Class.forName(eq("jdk.internal.reflect.GeneratedConstructorAccessor424"), eq(false), (ClassLoader) any()));
			});
		}
	}

	//Sapient generated method id: ${afabb07b-a959-3e25-b98c-7d5e9c454e74}, hash: 6C7C518C629DAAE5E27F914E475C58D1
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor424")).thenReturn("some_value");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor424"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${fde1cfb1-74d7-34a6-b921-4198b5c8db60}, hash: B7ABC0AE6A34CBB08E64DE57D944B40B
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
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor424")).thenReturn("org/springframework/boot/diagnostics/analyzer/");
			NoSuchMethodFailureAnalyzer target = spy(new NoSuchMethodFailureAnalyzer());
			doReturn(null).when(target).getNoSuchMethodDescriptor((String) null);
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor424"), atLeast(1));
				verify(target).getNoSuchMethodDescriptor((String) null);
			});
		}
	}

	//Sapient generated method id: ${43a85aae-4c7b-361b-93a3-0a08feefbb73}, hash: 3F493C46D328DCE037A9F6C87A456466
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor424")).thenReturn("");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor424"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7a2df98d-0caa-32ab-b012-b9fce2ca49e3}, hash: 28244F20284B615E2FA043F986A74C51
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
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor424")).thenReturn("<value>");
			NoSuchMethodFailureAnalyzer target = spy(new NoSuchMethodFailureAnalyzer());
			NoSuchMethodFailureAnalyzer.ClassDescriptor noSuchMethodFailureAnalyzerClassDescriptor = new NoSuchMethodFailureAnalyzer.ClassDescriptor("name1", uRLMock);
			List<NoSuchMethodFailureAnalyzer.ClassDescriptor> noSuchMethodFailureAnalyzerClassDescriptorList = new ArrayList<>();
			noSuchMethodFailureAnalyzerClassDescriptorList.add(noSuchMethodFailureAnalyzerClassDescriptor);
			List<NoSuchMethodFailureAnalyzer.ClassDescriptor> noSuchMethodFailureAnalyzerClassDescriptorList2 = new ArrayList<>();
			noSuchMethodFailureAnalyzerClassDescriptorList2.add(noSuchMethodFailureAnalyzerClassDescriptor);
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor noSuchMethodFailureAnalyzerNoSuchMethodDescriptor = new NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor("errorMessage1", "B", noSuchMethodFailureAnalyzerClassDescriptorList, noSuchMethodFailureAnalyzerClassDescriptorList2);
			doReturn(noSuchMethodFailureAnalyzerNoSuchMethodDescriptor).when(target).getNoSuchMethodDescriptor((String) null);
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor424"), atLeast(1));
				verify(target).getNoSuchMethodDescriptor((String) null);
			});
		}
	}

	//Sapient generated method id: ${4426d88f-f417-34bc-9500-2ae3aa57161f}, hash: CE5089C45324A12CBC16257F2D9FF442
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
		uRLList.add(uRLMock);
		NoSuchMethodFailureAnalyzer.ClassDescriptor noSuchMethodFailureAnalyzerClassDescriptor = new NoSuchMethodFailureAnalyzer.ClassDescriptor("name1", uRLMock2);
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

		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(target).getNoSuchMethodDescriptor("s1");
		});
	}

	//Sapient generated method id: ${0c3f36ec-db06-34b6-92e4-f72114cad8fa}, hash: 1C186F0099FD203098BAC2633E2DD191
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor424")).thenReturn("<value>");
			NoSuchMethodFailureAnalyzer target = spy(new NoSuchMethodFailureAnalyzer());
			List<URL> uRLList = new ArrayList<>();
			uRLList.add(uRLMock);
			NoSuchMethodFailureAnalyzer.ClassDescriptor noSuchMethodFailureAnalyzerClassDescriptor = new NoSuchMethodFailureAnalyzer.ClassDescriptor("name1", uRLMock2);
			List<NoSuchMethodFailureAnalyzer.ClassDescriptor> noSuchMethodFailureAnalyzerClassDescriptorList = new ArrayList<>();
			noSuchMethodFailureAnalyzerClassDescriptorList.add(noSuchMethodFailureAnalyzerClassDescriptor);
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor noSuchMethodFailureAnalyzerNoSuchMethodDescriptor = new NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor("errorMessage1", "B", uRLList, noSuchMethodFailureAnalyzerClassDescriptorList);
			doReturn(noSuchMethodFailureAnalyzerNoSuchMethodDescriptor).when(target).getNoSuchMethodDescriptor((String) null);
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("jdk.internal.reflect.GeneratedConstructorAccessor424"), atLeast(1));
				verify(target).getNoSuchMethodDescriptor((String) null);
			});
		}
	}

	//Sapient generated method id: ${d47752d3-f58d-3714-9c1a-0b70470e9832}, hash: 6F6EF9118AE61A2B65813ED7147E1445
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

	//Sapient generated method id: ${5420aee5-49cc-3d26-ba4d-4283ceebc47b}, hash: 82EF998C458519F1F53704623A3A7D69
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
		NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("'  '");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${d65a6d3d-a9e1-394c-b9ee-0c8570fe3653}, hash: B47E75986063F6DA6C88184F2B7BD787
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
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();

		//Act Statement(s)
		NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("cause1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${70022c1c-728e-3c66-87dc-42f436b04517}, hash: 714C305BF055002EA5F80BFCAFC872E3
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

	//Sapient generated method id: ${bdcf8c78-4b80-3efe-bc2c-65aff3d65a3f}, hash: BC18AF5FBCB320AA7BA2695CCF6E6659
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

	//Sapient generated method id: ${a8af11c4-bdea-39bd-a356-8355a188edd9}, hash: 669E40F0F30EA641061D94502F575628
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("NoSuchMethodError: com.example.TestClass")).thenReturn("com/example/TestClass.class");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			//Act Statement(s)
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("NoSuchMethodError: com.example.TestClass.testMethod()");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("NoSuchMethodError: com.example.TestClass"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5978b965-b6f0-3306-ae27-b0ecaf58b4ae}, hash: 26727145FDE7197C1BF242A5CF98F503
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("org.springframework.boot.diagnostics.analyzer.Test")).thenReturn("org/springframework/boot/diagnostics/analyzer");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			//Act Statement(s)
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("org.springframework.boot.diagnostics.analyzer.Test.methodName(Ljava/lang/String;)V (loaded from Test.java)");
			//Assert statement(s)
			//TODO: Please implement equals method in NoSuchMethodDescriptor for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("org.springframework.boot.diagnostics.analyzer.Test"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${0b9c1389-dc3b-33be-a162-cf11a92a5a06}, hash: 7C1800B00164649348E7BA4B5C7E7895
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

	//Sapient generated method id: ${258c1ae3-1861-3d56-872a-db04669ab3d1}, hash: 54DE82CC33541CCD608FD0725FC12BB1
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
			//Assert statement(s)
			//TODO: Please implement equals method in NoSuchMethodDescriptor for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${19dfbaac-d8b9-3bac-abc8-63285332bd07}, hash: 210F825C3D83C094F732C3C3C3F50FED
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("java.lang.NoSuchMethodError: org.springframework.boot.autoconfigure.condition.OnBeanCondition")).thenReturn("org/springframework/util/ClassUtils.class");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			//Act Statement(s)
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("java.lang.NoSuchMethodError: org.springframework.boot.autoconfigure.condition.OnBeanCondition.<init>(Lorg/springframework/boot/autoconfigure/condition/ConditionEvaluator;Z)V (loaded from file:/C:/Users/John/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.5.4/spring-boot-autoconfigure-2.5.4.jar))");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.NoSuchMethodError: org.springframework.boot.autoconfigure.condition.OnBeanCondition"), atLeast(1));
			});
		}
	}
}
