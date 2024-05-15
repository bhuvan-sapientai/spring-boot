package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.mockito.stubbing.Answer;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.util.StringUtils;
import org.springframework.util.Assert;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.mockito.MockedStatic;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NoUniqueBeanDefinitionFailureAnalyzerSapientGeneratedTest {

    private final ConfigurableBeanFactory beanFactoryMock = mock(ConfigurableBeanFactory.class, "beanFactory");

    private final BeanDefinition beanDefinitionMock = mock(BeanDefinition.class);

    //Sapient generated method id: ${analyze3WhenDescriptionIsNull}, hash: 547B99991F01970E74EFBF97422294B3
    @Test()
    void analyze3WhenDescriptionIsNull() {
        /* Branches:
         * (description == null) : true
         */
        //Arrange Statement(s)
        NoUniqueBeanDefinitionException noUniqueBeanDefinitionExceptionMock = mock(NoUniqueBeanDefinitionException.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(ConfigurableBeanFactory.class, beanFactoryMock)).thenAnswer((Answer<Void>) invocation -> null);
            NoUniqueBeanDefinitionFailureAnalyzer target = new NoUniqueBeanDefinitionFailureAnalyzer(beanFactoryMock);
            Throwable throwable = new Throwable();
            //Act Statement(s)
            FailureAnalysis result = target.analyze(throwable, noUniqueBeanDefinitionExceptionMock, (String) null);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.isInstanceOf(ConfigurableBeanFactory.class, beanFactoryMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${analyze3WhenCauseGetMessageNotContainsBut_foundAndBeanNamesIsNull}, hash: 7783E27E24061F54FA7C1631BE361E1B
    @Test()
    void analyze3WhenCauseGetMessageNotContainsBut_foundAndBeanNamesIsNull() {
        /* Branches:
         * (description == null) : false
         * (cause.getMessage().contains("but found")) : false  #  inside extractBeanNames method
         * (beanNames == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(ConfigurableBeanFactory.class, beanFactoryMock)).thenAnswer((Answer<Void>) invocation -> null);
            NoUniqueBeanDefinitionFailureAnalyzer target = new NoUniqueBeanDefinitionFailureAnalyzer(beanFactoryMock);
            Throwable throwable = new Throwable();
            NoUniqueBeanDefinitionException noUniqueBeanDefinitionException = new NoUniqueBeanDefinitionException(Object.class, 0, "A");
            //Act Statement(s)
            FailureAnalysis result = target.analyze(throwable, noUniqueBeanDefinitionException, "description1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(nullValue()));
                _assert.verify(() -> Assert.isInstanceOf(ConfigurableBeanFactory.class, beanFactoryMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${analyze3WhenResourceDescriptionIsNotNull}, hash: 67D9454171CEE655FFAA80A5309C7130
    @Disabled()
    @Test()
    void analyze3WhenResourceDescriptionIsNotNull() throws NoSuchBeanDefinitionException {
        /* Branches:
         * (description == null) : false
         * (cause.getMessage().contains("but found")) : true  #  inside extractBeanNames method
         * (beanNames == null) : false
         * (for-each(beanNames)) : true
         * (StringUtils.hasText(definition.getFactoryMethodName())) : true  #  inside getDefinitionDescription method
         * (resourceDescription != null) : true  #  inside getResourceDescription method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MissingParameterNamesFailureAnalyzer> missingParameterNamesFailureAnalyzer = mockStatic(MissingParameterNamesFailureAnalyzer.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(ConfigurableBeanFactory.class, beanFactoryMock)).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            stringUtils.when(() -> StringUtils.commaDelimitedListToStringArray("str1")).thenReturn(stringArray);
            stringUtils.when(() -> StringUtils.hasText("return_of_getFactoryMethodName1")).thenReturn(false);
            StringBuilder stringBuilder = new StringBuilder();
            missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder)).thenAnswer((Answer<Void>) invocation -> null);
            NoUniqueBeanDefinitionFailureAnalyzer target = new NoUniqueBeanDefinitionFailureAnalyzer(beanFactoryMock);
            doReturn(beanDefinitionMock).when(beanFactoryMock).getMergedBeanDefinition("beanName1");
            doReturn("return_of_getFactoryMethodName1").when(beanDefinitionMock).getFactoryMethodName();
            doReturn("return_of_getResourceDescription1").when(beanDefinitionMock).getResourceDescription();
            Throwable throwable = new Throwable();
            NoUniqueBeanDefinitionException noUniqueBeanDefinitionException = new NoUniqueBeanDefinitionException(Object.class, 0, "message1");
            //Act Statement(s)
            FailureAnalysis result = target.analyze(throwable, noUniqueBeanDefinitionException, "description1");
            //Assert statement(s)
            //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.isInstanceOf(ConfigurableBeanFactory.class, beanFactoryMock), atLeast(1));
                stringUtils.verify(() -> StringUtils.commaDelimitedListToStringArray("str1"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasText("return_of_getFactoryMethodName1"), atLeast(1));
                missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder), atLeast(1));
                verify(beanFactoryMock).getMergedBeanDefinition("beanName1");
                verify(beanDefinitionMock, times(2)).getFactoryMethodName();
                verify(beanDefinitionMock).getResourceDescription();
            });
        }
    }

    //Sapient generated method id: ${analyze3WhenResourceDescriptionIsNull}, hash: CDEA07DB10A69AC9D78960304F351195
    @Disabled()
    @Test()
    void analyze3WhenResourceDescriptionIsNull() throws NoSuchBeanDefinitionException {
        /* Branches:
         * (description == null) : false
         * (cause.getMessage().contains("but found")) : true  #  inside extractBeanNames method
         * (beanNames == null) : false
         * (for-each(beanNames)) : true
         * (StringUtils.hasText(definition.getFactoryMethodName())) : true  #  inside getDefinitionDescription method
         * (resourceDescription != null) : false  #  inside getResourceDescription method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MissingParameterNamesFailureAnalyzer> missingParameterNamesFailureAnalyzer = mockStatic(MissingParameterNamesFailureAnalyzer.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(ConfigurableBeanFactory.class, beanFactoryMock)).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            stringUtils.when(() -> StringUtils.commaDelimitedListToStringArray("str1")).thenReturn(stringArray);
            stringUtils.when(() -> StringUtils.hasText("return_of_getFactoryMethodName1")).thenReturn(false);
            StringBuilder stringBuilder = new StringBuilder();
            missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder)).thenAnswer((Answer<Void>) invocation -> null);
            NoUniqueBeanDefinitionFailureAnalyzer target = new NoUniqueBeanDefinitionFailureAnalyzer(beanFactoryMock);
            doReturn(beanDefinitionMock).when(beanFactoryMock).getMergedBeanDefinition("beanName1");
            doReturn("return_of_getFactoryMethodName1").when(beanDefinitionMock).getFactoryMethodName();
            doReturn(null).when(beanDefinitionMock).getResourceDescription();
            Throwable throwable = new Throwable();
            NoUniqueBeanDefinitionException noUniqueBeanDefinitionException = new NoUniqueBeanDefinitionException(Object.class, 0, "message1");
            //Act Statement(s)
            FailureAnalysis result = target.analyze(throwable, noUniqueBeanDefinitionException, "description1");
            //Assert statement(s)
            //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.isInstanceOf(ConfigurableBeanFactory.class, beanFactoryMock), atLeast(1));
                stringUtils.verify(() -> StringUtils.commaDelimitedListToStringArray("str1"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasText("return_of_getFactoryMethodName1"), atLeast(1));
                missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder), atLeast(1));
                verify(beanFactoryMock).getMergedBeanDefinition("beanName1");
                verify(beanDefinitionMock, times(2)).getFactoryMethodName();
                verify(beanDefinitionMock).getResourceDescription();
            });
        }
    }

    //Sapient generated method id: ${analyze3WhenStringUtilsNotHasTextDefinitionGetFactoryMethodNameAndResourceDescriptionIsNotNull}, hash: C09C79875DC0BA72F9EDCC023C8AFD54
    @Disabled()
    @Test()
    void analyze3WhenStringUtilsNotHasTextDefinitionGetFactoryMethodNameAndResourceDescriptionIsNotNull() throws NoSuchBeanDefinitionException {
        /* Branches:
         * (description == null) : false
         * (cause.getMessage().contains("but found")) : true  #  inside extractBeanNames method
         * (beanNames == null) : false
         * (for-each(beanNames)) : true
         * (StringUtils.hasText(definition.getFactoryMethodName())) : false  #  inside getDefinitionDescription method
         * (resourceDescription != null) : true  #  inside getResourceDescription method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MissingParameterNamesFailureAnalyzer> missingParameterNamesFailureAnalyzer = mockStatic(MissingParameterNamesFailureAnalyzer.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(ConfigurableBeanFactory.class, beanFactoryMock)).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            stringUtils.when(() -> StringUtils.commaDelimitedListToStringArray("str1")).thenReturn(stringArray);
            stringUtils.when(() -> StringUtils.hasText("return_of_getFactoryMethodName1")).thenReturn(false);
            StringBuilder stringBuilder = new StringBuilder();
            missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder)).thenAnswer((Answer<Void>) invocation -> null);
            NoUniqueBeanDefinitionFailureAnalyzer target = new NoUniqueBeanDefinitionFailureAnalyzer(beanFactoryMock);
            doReturn(beanDefinitionMock).when(beanFactoryMock).getMergedBeanDefinition("beanName1");
            doReturn("return_of_getFactoryMethodName1").when(beanDefinitionMock).getFactoryMethodName();
            doReturn("return_of_getResourceDescription1").when(beanDefinitionMock).getResourceDescription();
            Throwable throwable = new Throwable();
            NoUniqueBeanDefinitionException noUniqueBeanDefinitionException = new NoUniqueBeanDefinitionException(Object.class, 0, "message1");
            //Act Statement(s)
            FailureAnalysis result = target.analyze(throwable, noUniqueBeanDefinitionException, "description1");
            //Assert statement(s)
            //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.isInstanceOf(ConfigurableBeanFactory.class, beanFactoryMock), atLeast(1));
                stringUtils.verify(() -> StringUtils.commaDelimitedListToStringArray("str1"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasText("return_of_getFactoryMethodName1"), atLeast(1));
                missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder), atLeast(1));
                verify(beanFactoryMock).getMergedBeanDefinition("beanName1");
                verify(beanDefinitionMock).getFactoryMethodName();
                verify(beanDefinitionMock).getResourceDescription();
            });
        }
    }

    //Sapient generated method id: ${analyze3WhenStringUtilsNotHasTextDefinitionGetFactoryMethodNameAndResourceDescriptionIsNull}, hash: BBA1221E384C23DE282D76A0211C4371
    @Disabled()
    @Test()
    void analyze3WhenStringUtilsNotHasTextDefinitionGetFactoryMethodNameAndResourceDescriptionIsNull() throws NoSuchBeanDefinitionException {
        /* Branches:
         * (description == null) : false
         * (cause.getMessage().contains("but found")) : true  #  inside extractBeanNames method
         * (beanNames == null) : false
         * (for-each(beanNames)) : true
         * (StringUtils.hasText(definition.getFactoryMethodName())) : false  #  inside getDefinitionDescription method
         * (resourceDescription != null) : false  #  inside getResourceDescription method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MissingParameterNamesFailureAnalyzer> missingParameterNamesFailureAnalyzer = mockStatic(MissingParameterNamesFailureAnalyzer.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(ConfigurableBeanFactory.class, beanFactoryMock)).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            stringUtils.when(() -> StringUtils.commaDelimitedListToStringArray("str1")).thenReturn(stringArray);
            stringUtils.when(() -> StringUtils.hasText("return_of_getFactoryMethodName1")).thenReturn(false);
            StringBuilder stringBuilder = new StringBuilder();
            missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder)).thenAnswer((Answer<Void>) invocation -> null);
            NoUniqueBeanDefinitionFailureAnalyzer target = new NoUniqueBeanDefinitionFailureAnalyzer(beanFactoryMock);
            doReturn(beanDefinitionMock).when(beanFactoryMock).getMergedBeanDefinition("beanName1");
            doReturn("return_of_getFactoryMethodName1").when(beanDefinitionMock).getFactoryMethodName();
            doReturn(null).when(beanDefinitionMock).getResourceDescription();
            Throwable throwable = new Throwable();
            NoUniqueBeanDefinitionException noUniqueBeanDefinitionException = new NoUniqueBeanDefinitionException(Object.class, 0, "message1");
            //Act Statement(s)
            FailureAnalysis result = target.analyze(throwable, noUniqueBeanDefinitionException, "description1");
            //Assert statement(s)
            //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.isInstanceOf(ConfigurableBeanFactory.class, beanFactoryMock), atLeast(1));
                stringUtils.verify(() -> StringUtils.commaDelimitedListToStringArray("str1"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasText("return_of_getFactoryMethodName1"), atLeast(1));
                missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder), atLeast(1));
                verify(beanFactoryMock).getMergedBeanDefinition("beanName1");
                verify(beanDefinitionMock).getFactoryMethodName();
                verify(beanDefinitionMock).getResourceDescription();
            });
        }
    }

    //Sapient generated method id: ${analyze3WhenCaughtNoSuchBeanDefinitionException}, hash: 1A5071B0772B9D55EE3E0B60E735DD2D
    @Disabled()
    @Test()
    void analyze3WhenCaughtNoSuchBeanDefinitionException() throws NoSuchBeanDefinitionException {
        /* Branches:
         * (description == null) : false
         * (cause.getMessage().contains("but found")) : true  #  inside extractBeanNames method
         * (beanNames == null) : false
         * (for-each(beanNames)) : true
         * (StringUtils.hasText(definition.getFactoryMethodName())) : true  #  inside getDefinitionDescription method
         * (resourceDescription != null) : false  #  inside getResourceDescription method
         * (catch-exception (NoSuchBeanDefinitionException)) : true  #  inside buildMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MissingParameterNamesFailureAnalyzer> missingParameterNamesFailureAnalyzer = mockStatic(MissingParameterNamesFailureAnalyzer.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(ConfigurableBeanFactory.class, beanFactoryMock)).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            stringUtils.when(() -> StringUtils.commaDelimitedListToStringArray("str1")).thenReturn(stringArray);
            stringUtils.when(() -> StringUtils.hasText("return_of_getFactoryMethodName1")).thenReturn(false);
            StringBuilder stringBuilder = new StringBuilder();
            missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder)).thenAnswer((Answer<Void>) invocation -> null);
            NoUniqueBeanDefinitionFailureAnalyzer target = new NoUniqueBeanDefinitionFailureAnalyzer(beanFactoryMock);
            doReturn(beanDefinitionMock).when(beanFactoryMock).getMergedBeanDefinition("beanName1");
            doReturn("return_of_getFactoryMethodName1").when(beanDefinitionMock).getFactoryMethodName();
            doReturn(null).when(beanDefinitionMock).getResourceDescription();
            Throwable throwable = new Throwable();
            NoUniqueBeanDefinitionException noUniqueBeanDefinitionException = new NoUniqueBeanDefinitionException(Object.class, 0, "message1");
            //Act Statement(s)
            FailureAnalysis result = target.analyze(throwable, noUniqueBeanDefinitionException, "description1");
            //Assert statement(s)
            //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.isInstanceOf(ConfigurableBeanFactory.class, beanFactoryMock), atLeast(1));
                stringUtils.verify(() -> StringUtils.commaDelimitedListToStringArray("str1"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasText("return_of_getFactoryMethodName1"), atLeast(1));
                missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder), atLeast(1));
                verify(beanFactoryMock).getMergedBeanDefinition("beanName1");
                verify(beanDefinitionMock, times(2)).getFactoryMethodName();
                verify(beanDefinitionMock).getResourceDescription();
            });
        }
    }

    //Sapient generated method id: ${analyze3WhenResourceDescriptionIsNullAndCaughtNoSuchBeanDefinitionException}, hash: 47FA541AFECF56A9EA10AA71E44F3D5D
    @Disabled()
    @Test()
    void analyze3WhenResourceDescriptionIsNullAndCaughtNoSuchBeanDefinitionException() throws NoSuchBeanDefinitionException {
        /* Branches:
         * (description == null) : false
         * (cause.getMessage().contains("but found")) : true  #  inside extractBeanNames method
         * (beanNames == null) : false
         * (for-each(beanNames)) : true
         * (StringUtils.hasText(definition.getFactoryMethodName())) : false  #  inside getDefinitionDescription method
         * (resourceDescription != null) : false  #  inside getResourceDescription method
         * (catch-exception (NoSuchBeanDefinitionException)) : true  #  inside buildMessage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MissingParameterNamesFailureAnalyzer> missingParameterNamesFailureAnalyzer = mockStatic(MissingParameterNamesFailureAnalyzer.class);
            MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.isInstanceOf(ConfigurableBeanFactory.class, beanFactoryMock)).thenAnswer((Answer<Void>) invocation -> null);
            String[] stringArray = new String[] {};
            stringUtils.when(() -> StringUtils.commaDelimitedListToStringArray("str1")).thenReturn(stringArray);
            stringUtils.when(() -> StringUtils.hasText("return_of_getFactoryMethodName1")).thenReturn(false);
            StringBuilder stringBuilder = new StringBuilder();
            missingParameterNamesFailureAnalyzer.when(() -> MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder)).thenAnswer((Answer<Void>) invocation -> null);
            NoUniqueBeanDefinitionFailureAnalyzer target = new NoUniqueBeanDefinitionFailureAnalyzer(beanFactoryMock);
            doReturn(beanDefinitionMock).when(beanFactoryMock).getMergedBeanDefinition("beanName1");
            doReturn("return_of_getFactoryMethodName1").when(beanDefinitionMock).getFactoryMethodName();
            doReturn(null).when(beanDefinitionMock).getResourceDescription();
            Throwable throwable = new Throwable();
            NoUniqueBeanDefinitionException noUniqueBeanDefinitionException = new NoUniqueBeanDefinitionException(Object.class, 0, "message1");
            //Act Statement(s)
            FailureAnalysis result = target.analyze(throwable, noUniqueBeanDefinitionException, "description1");
            //Assert statement(s)
            //TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.isInstanceOf(ConfigurableBeanFactory.class, beanFactoryMock), atLeast(1));
                stringUtils.verify(() -> StringUtils.commaDelimitedListToStringArray("str1"), atLeast(1));
                stringUtils.verify(() -> StringUtils.hasText("return_of_getFactoryMethodName1"), atLeast(1));
                missingParameterNamesFailureAnalyzer.verify(() -> MissingParameterNamesFailureAnalyzer.appendPossibility(stringBuilder), atLeast(1));
                verify(beanFactoryMock).getMergedBeanDefinition("beanName1");
                verify(beanDefinitionMock).getFactoryMethodName();
                verify(beanDefinitionMock).getResourceDescription();
            });
        }
    }
}
