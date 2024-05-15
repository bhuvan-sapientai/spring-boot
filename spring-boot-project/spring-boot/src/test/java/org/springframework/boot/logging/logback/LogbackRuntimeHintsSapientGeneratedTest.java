package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import ch.qos.logback.classic.pattern.SyslogStartConverter;
import org.springframework.util.ClassUtils;
import org.springframework.aot.hint.MemberCategory;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.classic.LoggerContext;
import org.springframework.aot.hint.RuntimeHints;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import org.springframework.aot.hint.TypeReference;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import org.springframework.aot.hint.ReflectionHints;
import java.util.function.Consumer;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LogbackRuntimeHintsSapientGeneratedTest {

    //Sapient generated method id: ${registerHintsWhenClassUtilsNotIsPresentCh_qos_logback_classic_LoggerContextClassLoader}, hash: EEA1F4A5D233F0B6F179CD544FA61218
    @Test()
    void registerHintsWhenClassUtilsNotIsPresentCh_qos_logback_classic_LoggerContextClassLoader() {
        /* Branches:
         * (!ClassUtils.isPresent("ch.qos.logback.classic.LoggerContext", classLoader)) : true
         */
        //Arrange Statement(s)
        RuntimeHints runtimeHintsMock = mock(RuntimeHints.class);
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            classUtils.when(() -> ClassUtils.isPresent(eq("ch.qos.logback.classic.LoggerContext"), (ClassLoader) any())).thenReturn(false);
            LogbackRuntimeHints target = new LogbackRuntimeHints();
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            //Act Statement(s)
            target.registerHints(runtimeHintsMock, classLoader);
            //Assert statement(s)
            assertAll("result", () -> classUtils.verify(() -> ClassUtils.isPresent(eq("ch.qos.logback.classic.LoggerContext"), (ClassLoader) any())));
        }
    }

    //Sapient generated method id: ${registerHintsWhenClassUtilsIsPresentCh_qos_logback_classic_LoggerContextClassLoader}, hash: 89D9BCFBA05886167CF9EF2BB39703A9
    @Disabled()
    @Test()
    void registerHintsWhenClassUtilsIsPresentCh_qos_logback_classic_LoggerContextClassLoader() {
        /* Branches:
         * (!ClassUtils.isPresent("ch.qos.logback.classic.LoggerContext", classLoader)) : false
         */
        //Arrange Statement(s)
        RuntimeHints hintsMock = mock(RuntimeHints.class);
        ReflectionHints reflectionHintsMock = mock(ReflectionHints.class);
        ReflectionHints reflectionHintsMock2 = mock(ReflectionHints.class);
        ReflectionHints reflectionHintsMock3 = mock(ReflectionHints.class);
        ReflectionHints reflectionHintsMock4 = mock(ReflectionHints.class);
        ReflectionHints reflectionHintsMock5 = mock(ReflectionHints.class);
        try (MockedStatic<TypeReference> typeReference = mockStatic(TypeReference.class);
            MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
            doReturn(reflectionHintsMock).when(hintsMock).reflection();
            MemberCategory[] memberCategoryArray = new MemberCategory[] {};
            doReturn(reflectionHintsMock2).when(reflectionHintsMock).registerType(LoggerContext.class, memberCategoryArray);
            doReturn(reflectionHintsMock3).when(reflectionHintsMock).registerTypeIfPresent((ClassLoader) any(), eq("org.slf4j.bridge.SLF4JBridgeHandler"), (Consumer) any());
            List<TypeReference> typeReferenceList = new ArrayList<>();
            doReturn(reflectionHintsMock4).when(reflectionHintsMock).registerTypes(eq(typeReferenceList), (Consumer) any());
            List<TypeReference> typeReferenceList2 = new ArrayList<>();
            doReturn(reflectionHintsMock5).when(reflectionHintsMock).registerTypes(eq(typeReferenceList2), (Consumer) any());
            classUtils.when(() -> ClassUtils.isPresent(eq("ch.qos.logback.classic.LoggerContext"), (ClassLoader) any())).thenReturn(true);
            Class<DateTokenConverter>[] classArray = new Class[] { DateTokenConverter.class, IntegerTokenConverter.class, SyslogStartConverter.class };
            typeReference.when(() -> TypeReference.listOf(classArray)).thenReturn(typeReferenceList);
            Class<ColorConverter>[] classArray2 = new Class[] { ColorConverter.class, ExtendedWhitespaceThrowableProxyConverter.class, WhitespaceThrowableProxyConverter.class, CorrelationIdConverter.class };
            typeReference.when(() -> TypeReference.listOf(classArray2)).thenReturn(typeReferenceList2);
            LogbackRuntimeHints target = new LogbackRuntimeHints();
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            //Act Statement(s)
            target.registerHints(hintsMock, classLoader);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(hintsMock).reflection();
                verify(reflectionHintsMock).registerType(LoggerContext.class, memberCategoryArray);
                verify(reflectionHintsMock).registerTypeIfPresent((ClassLoader) any(), eq("org.slf4j.bridge.SLF4JBridgeHandler"), (Consumer) any());
                verify(reflectionHintsMock).registerTypes(eq(typeReferenceList), (Consumer) any());
                verify(reflectionHintsMock).registerTypes(eq(typeReferenceList2), (Consumer) any());
                classUtils.verify(() -> ClassUtils.isPresent(eq("ch.qos.logback.classic.LoggerContext"), (ClassLoader) any()));
                typeReference.verify(() -> TypeReference.listOf(classArray), atLeast(1));
                typeReference.verify(() -> TypeReference.listOf(classArray2), atLeast(1));
            });
        }
    }
}
