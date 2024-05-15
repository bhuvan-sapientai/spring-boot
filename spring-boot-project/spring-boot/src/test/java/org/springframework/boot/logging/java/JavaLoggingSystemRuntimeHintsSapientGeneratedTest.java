package org.springframework.boot.logging.java;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.aot.hint.ResourceHints;
import org.springframework.aot.hint.RuntimeHints;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JavaLoggingSystemRuntimeHintsSapientGeneratedTest {

    //Sapient generated method id: ${registerHintsTest}, hash: F0955ED67DAA6EB2860DB4A5A1624273
    @Test()
    void registerHintsTest() {
        //Arrange Statement(s)
        RuntimeHints hintsMock = mock(RuntimeHints.class);
        ResourceHints resourceHintsMock = mock(ResourceHints.class);
        ResourceHints resourceHintsMock2 = mock(ResourceHints.class);
        doReturn(resourceHintsMock2).when(resourceHintsMock).registerPattern("org/springframework/boot/logging/java/logging.properties");
        ResourceHints resourceHintsMock3 = mock(ResourceHints.class);
        doReturn(resourceHintsMock, resourceHintsMock3).when(hintsMock).resources();
        ResourceHints resourceHintsMock4 = mock(ResourceHints.class);
        doReturn(resourceHintsMock4).when(resourceHintsMock3).registerPattern("org/springframework/boot/logging/java/logging-file.properties");
        JavaLoggingSystemRuntimeHints target = new JavaLoggingSystemRuntimeHints();
        ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        
        //Act Statement(s)
        target.registerHints(hintsMock, classLoader);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(hintsMock, times(2)).resources();
            verify(resourceHintsMock).registerPattern("org/springframework/boot/logging/java/logging.properties");
            verify(resourceHintsMock3).registerPattern("org/springframework/boot/logging/java/logging-file.properties");
        });
    }
}
