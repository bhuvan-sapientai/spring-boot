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

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NoSuchMethodFailureAnalyzerSapientGeneratedTest {

	private final URL uRLMock = mock(URL.class);

	private final URL uRLMock2 = mock(URL.class);

	//Sapient generated method id: ${704eaada-d20a-3dfa-adfd-a484b34d4e53}, hash: 41E283808F0D4BBEF202AC84F4DDD7C9
	@Disabled()
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
		NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${6fbb3818-3e5a-3c60-a4bc-a4f9d001e509}, hash: 3DB7A798A830B4F723D3B5B902BA4B4E
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String")).thenReturn("");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b29d7342-ebab-3a0d-9728-0d79a6d7c706}, hash: 1BB978B3336639FFBD142CF7804D7A92
	@Disabled()
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String")).thenReturn("");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${206a33ac-70eb-3ff2-9ee4-90320a86047a}, hash: 276AC401B974CDC04812AC29A6AB8045
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String")).thenReturn("java/lang/String.class");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f4e264c8-31c9-34e8-acd1-9e99b5229330}, hash: 1FB03362364D8BDF50D67736FCCD50EF
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String")).thenReturn("org/springframework/util/ClassUtils.class");
			_class.when(() -> Class.forName(eq("java.lang.String"), eq(false), (ClassLoader) any())).thenReturn(NoSuchMethodFailureAnalyzer.class);
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String"), atLeast(1));
				_class.verify(() -> Class.forName(eq("java.lang.String"), eq(false), (ClassLoader) any()));
			});
		}
	}

	//Sapient generated method id: ${afabb07b-a959-3e25-b98c-7d5e9c454e74}, hash: 18BAD629C64CD4880AA281907E56833A
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String")).thenReturn("some_value");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${fde1cfb1-74d7-34a6-b921-4198b5c8db60}, hash: 46A43EC7A38A214B2667B2E1A831618A
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
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String")).thenReturn("org/springframework/boot/diagnostics/analyzer/NoSuchMethodFailureAnalyzer.class");
			NoSuchMethodFailureAnalyzer target = spy(new NoSuchMethodFailureAnalyzer());
			doReturn(null).when(target).getNoSuchMethodDescriptor("cause1");
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String"), atLeast(1));
				verify(target).getNoSuchMethodDescriptor("cause1");
			});
		}
	}

	//Sapient generated method id: ${43a85aae-4c7b-361b-93a3-0a08feefbb73}, hash: EEA5723A44343D9E3F5719FF1B6B9EFA
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String")).thenReturn("some_value");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7a2df98d-0caa-32ab-b012-b9fce2ca49e3}, hash: 28BE7E8A306C17B82D0B091A37D834A5
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
        /*try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
    classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("A")).thenReturn("<value>");
    NoSuchMethodFailureAnalyzer target = spy(new NoSuchMethodFailureAnalyzer());
    NoSuchMethodFailureAnalyzer.ClassDescriptor noSuchMethodFailureAnalyzerClassDescriptor = new NoSuchMethodFailureAnalyzer.ClassDescriptor("name1", uRLMock);
    List<NoSuchMethodFailureAnalyzer.ClassDescriptor> noSuchMethodFailureAnalyzerClassDescriptorList = new ArrayList<>();
    noSuchMethodFailureAnalyzerClassDescriptorList.add(noSuchMethodFailureAnalyzerClassDescriptor);
    List<NoSuchMethodFailureAnalyzer.ClassDescriptor> noSuchMethodFailureAnalyzerClassDescriptorList2 = new ArrayList<>();
    noSuchMethodFailureAnalyzerClassDescriptorList2.add(noSuchMethodFailureAnalyzerClassDescriptor);
    NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor noSuchMethodFailureAnalyzerNoSuchMethodDescriptor = new NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor("errorMessage1", "F", noSuchMethodFailureAnalyzerClassDescriptorList, noSuchMethodFailureAnalyzerClassDescriptorList2);
    doReturn(noSuchMethodFailureAnalyzerNoSuchMethodDescriptor).when(target).getNoSuchMethodDescriptor("cause1");
    Throwable throwable = new Throwable();
    NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
    //Act Statement(s)
    FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
    //Assert statement(s)
    //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("A"), atLeast(1));
        verify(target).getNoSuchMethodDescriptor("cause1");
    });
}*/
	}

	//Sapient generated method id: ${4426d88f-f417-34bc-9500-2ae3aa57161f}, hash: 2E382A1645B342E91859A1F4EDC3A8FB
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
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("B")).thenReturn("<String>");
			NoSuchMethodFailureAnalyzer target = spy(new NoSuchMethodFailureAnalyzer());
			List<URL> uRLList = new ArrayList<>();
			uRLList.add(uRLMock);
			NoSuchMethodFailureAnalyzer.ClassDescriptor noSuchMethodFailureAnalyzerClassDescriptor = new NoSuchMethodFailureAnalyzer.ClassDescriptor("name1", uRLMock2);
			List<NoSuchMethodFailureAnalyzer.ClassDescriptor> noSuchMethodFailureAnalyzerClassDescriptorList = new ArrayList<>();
			noSuchMethodFailureAnalyzerClassDescriptorList.add(noSuchMethodFailureAnalyzerClassDescriptor);
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor noSuchMethodFailureAnalyzerNoSuchMethodDescriptor = new NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor("errorMessage1", "B", uRLList, noSuchMethodFailureAnalyzerClassDescriptorList);
			doReturn(noSuchMethodFailureAnalyzerNoSuchMethodDescriptor).when(target).getNoSuchMethodDescriptor("cause1");
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("B"), atLeast(1));
				verify(target).getNoSuchMethodDescriptor("cause1");
			});
		}
	}

	//Sapient generated method id: ${0c3f36ec-db06-34b6-92e4-f72114cad8fa}, hash: C4AC6C4FB39355F4AF96ED774298CF7E
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("A")).thenReturn("<value>");
			NoSuchMethodFailureAnalyzer target = spy(new NoSuchMethodFailureAnalyzer());
			List<URL> uRLList = new ArrayList<>();
			uRLList.add(uRLMock);
			NoSuchMethodFailureAnalyzer.ClassDescriptor noSuchMethodFailureAnalyzerClassDescriptor = new NoSuchMethodFailureAnalyzer.ClassDescriptor("name1", uRLMock2);
			List<NoSuchMethodFailureAnalyzer.ClassDescriptor> noSuchMethodFailureAnalyzerClassDescriptorList = new ArrayList<>();
			noSuchMethodFailureAnalyzerClassDescriptorList.add(noSuchMethodFailureAnalyzerClassDescriptor);
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor noSuchMethodFailureAnalyzerNoSuchMethodDescriptor = new NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor("errorMessage1", "F", uRLList, noSuchMethodFailureAnalyzerClassDescriptorList);
			doReturn(noSuchMethodFailureAnalyzerNoSuchMethodDescriptor).when(target).getNoSuchMethodDescriptor("cause1");
			Throwable throwable = new Throwable();
			NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("A"), atLeast(1));
				verify(target).getNoSuchMethodDescriptor("cause1");
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

	//Sapient generated method id: ${d65a6d3d-a9e1-394c-b9ee-0c8570fe3653}, hash: CFA34D02458F0D84BCF9C0B8B15A30C2
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
		NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("' ('");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${70022c1c-728e-3c66-87dc-42f436b04517}, hash: A24A824B820AC79F112CB72F904B2B36
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("")).thenReturn("J");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			//Act Statement(s)
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("' C(I'");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath(""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${bdcf8c78-4b80-3efe-bc2c-65aff3d65a3f}, hash: 0C069D8D1C669156F4221E5A4E55A3F8
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("")).thenReturn("J");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			//Act Statement(s)
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("' C(I'");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath(""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a8af11c4-bdea-39bd-a356-8355a188edd9}, hash: 16546E77BF4A56E7BD5E0C63518A70AD
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("")).thenReturn("J");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			//Act Statement(s)
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("' C(I'");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath(""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b3afc51e-5ddf-37bb-abf9-e06fc5d2e47d}, hash: D253DCC62EA15CF782E8D8EB66F3796C
	@Disabled()
	@Test()
	void getNoSuchMethodDescriptorWhenTypeEqualsObjectAndTypeHierarchyIsNotNull() throws Throwable {
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String")).thenReturn("<value>");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			//Act Statement(s)
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("<value>");
			//Assert statement(s)
			//TODO: Please implement equals method in NoSuchMethodDescriptor for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${0b9c1389-dc3b-33be-a162-cf11a92a5a06}, hash: 7C1800B00164649348E7BA4B5C7E7895
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

	//Sapient generated method id: ${258c1ae3-1861-3d56-872a-db04669ab3d1}, hash: 8D1BC9C1B4C7C916FC8C7C595F6F567C
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
			classUtils.when(() -> ClassUtils.convertClassNameToResourcePath(" ")).thenReturn("S");
			NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
			//Act Statement(s)
			NoSuchMethodFailureAnalyzer.NoSuchMethodDescriptor result = target.getNoSuchMethodDescriptor("'  (('");
			//Assert statement(s)
			//TODO: Please implement equals method in NoSuchMethodDescriptor for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath(" "), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${19dfbaac-d8b9-3bac-abc8-63285332bd07}, hash: 12A8637752B85C55873C62B1A971B45E
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
