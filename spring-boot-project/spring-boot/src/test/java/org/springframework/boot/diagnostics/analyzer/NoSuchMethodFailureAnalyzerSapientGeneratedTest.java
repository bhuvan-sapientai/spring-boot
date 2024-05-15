package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.springframework.util.ClassUtils;
import org.springframework.boot.diagnostics.FailureAnalysis;
import java.net.URL;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
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

    //Sapient generated method id: ${analyze2WhenCallerDescriptorIsNull}, hash: 26D1CF0F3A6259BCEE58F7244A5F4278
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

    //Sapient generated method id: ${analyze2WhenCandidatesIsNullAndCallerDescriptorIsNull}, hash: 3605332305B1B9B09FD4E89FF3918013
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

    //Sapient generated method id: ${analyze2WhenTypeIsNullAndCallerDescriptorIsNull}, hash: A88B993A8C423F31771995912B946122
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

    //Sapient generated method id: ${analyze2WhenCaughtThrowableAndCandidatesIsNullAndCallerDescriptorIsNull}, hash: B1B32DF383B6B703598DEBB232DAFC5F
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

    //Sapient generated method id: ${analyze2WhenCaughtThrowableAndTypeIsNullAndCallerDescriptorIsNull}, hash: 3393062E61F81E45407DC3E185BDEEE6
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
        try (MockedStatic<Class> _class = mockStatic(Class.class)) {
            _class.when(() -> Class.forName(eq("A"), eq(false), (ClassLoader) any())).thenReturn(Object.class);
            NoSuchMethodFailureAnalyzer target = new NoSuchMethodFailureAnalyzer();
            Throwable throwable = new Throwable();
            StackTraceElement stackTraceElement = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
            StackTraceElement[] stackTraceElementArray = new StackTraceElement[] { stackTraceElement };
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.setStackTrace(stackTraceElementArray);
            //Act Statement(s)
            FailureAnalysis result = target.analyze(throwable, noSuchMethodError);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _class.verify(() -> Class.forName(eq("A"), eq(false), (ClassLoader) any()));
            });
        }
    }

    //Sapient generated method id: ${analyze2WhenCalledDescriptorIsNull}, hash: 8B2CDB1840E76AC6A089B6CE2A8A4B8F
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

    //Sapient generated method id: ${analyze2WhenTypeHierarchyIsNullAndCallerDescriptorIsNull}, hash: A137D231FDFEB02C34303D49783E3621
    @Test()
    void analyze2WhenTypeHierarchyIsNullAndCallerDescriptorIsNull() throws Throwable {
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

    //Sapient generated method id: ${analyze2WhenCallerDescriptorGetClassNameNotEqualsCalledDescriptorGetClassName}, hash: 26B79BA321EAE11C2F550DC95356A9AC
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
        uRLList.add(uRLMock);
        NoSuchMethodFailureAnalyzer.ClassDescriptor noSuchMethodFailureAnalyzerClassDescriptor = new NoSuchMethodFailureAnalyzer.ClassDescriptor("name1", uRLMock2);
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
        //Assert statement(s)
        //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(target).getNoSuchMethodDescriptor("s1");
        });
    }

    //Sapient generated method id: ${analyze2WhenCallerDescriptorGetClassNameEqualsCalledDescriptorGetClassName}, hash: CE5089C45324A12CBC16257F2D9FF442
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

    //Sapient generated method id: ${analyze2WhenCalledDescriptorGetTypeHierarchyIsNotEmptyAndCallerDescriptorGetClassNameNotEqualsCalledDescriptorGetClassN2}, hash: 42513D87D18DAF841A56CCD8D3B20766
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
        NoSuchMethodFailureAnalyzer target = spy(new NoSuchMethodFailureAnalyzer());
        List<URL> uRLList = new ArrayList<>();
        uRLList.add(uRLMock);
        NoSuchMethodFailureAnalyzer.ClassDescriptor noSuchMethodFailureAnalyzerClassDescriptor = new NoSuchMethodFailureAnalyzer.ClassDescriptor("name1", uRLMock2);
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
        //Assert statement(s)
        //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(target).getNoSuchMethodDescriptor("s1");
        });
    }

    //Sapient generated method id: ${getNoSuchMethodDescriptorWhenSplitIndexEqualsMinus1AndClassNameIsNull}, hash: 6F6EF9118AE61A2B65813ED7147E1445
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

    //Sapient generated method id: ${getNoSuchMethodDescriptorWhenSplitIndexNotEqualsMinus1AndDescriptorIndexEqualsMinus1AndClassNameIsNull}, hash: 82EF998C458519F1F53704623A3A7D69
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

    //Sapient generated method id: ${getNoSuchMethodDescriptorWhenSplitIndexNotEqualsMinus1AndDescriptorIndexNotEqualsMinus1AndMethodNameIndexEqualsMinus1An}, hash: CFA34D02458F0D84BCF9C0B8B15A30C2
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

    //Sapient generated method id: ${getNoSuchMethodDescriptorWhenCandidatesIsNull}, hash: 714C305BF055002EA5F80BFCAFC872E3
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

    //Sapient generated method id: ${getNoSuchMethodDescriptorWhenTypeIsNull}, hash: BC18AF5FBCB320AA7BA2695CCF6E6659
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

    //Sapient generated method id: ${getNoSuchMethodDescriptorWhenCaughtThrowableAndCandidatesIsNull}, hash: 4EF79C561D3DD8E7A59D45640D7D594F
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

    //Sapient generated method id: ${getNoSuchMethodDescriptorWhenTypeHierarchyIsNotNull}, hash: F57DBCDBABB312EB39A6905683598B88
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
            //Assert statement(s)
            //TODO: Please implement equals method in NoSuchMethodDescriptor for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getNoSuchMethodDescriptorWhenTypeNotEqualsObjectAndTypeHierarchyIsNotNull}, hash: 54DE82CC33541CCD608FD0725FC12BB1
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
            //Assert statement(s)
            //TODO: Please implement equals method in NoSuchMethodDescriptor for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                classUtils.verify(() -> ClassUtils.convertClassNameToResourcePath("java.lang.String"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getNoSuchMethodDescriptorWhenTypeHierarchyIsNull}, hash: 7C1800B00164649348E7BA4B5C7E7895
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
