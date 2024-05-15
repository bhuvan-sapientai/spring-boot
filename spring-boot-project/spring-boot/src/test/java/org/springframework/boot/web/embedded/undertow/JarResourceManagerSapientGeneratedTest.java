package org.springframework.boot.web.embedded.undertow;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import io.undertow.server.handlers.resource.Resource;
import io.undertow.server.handlers.resource.ResourceChangeListener;
import org.mockito.MockedStatic;
import java.io.File;
import org.springframework.util.StringUtils;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JarResourceManagerSapientGeneratedTest {

    private final ResourceChangeListener resourceChangeListenerMock = mock(ResourceChangeListener.class);

    //Sapient generated method id: ${getResourceWhenResourceGetContentLengthLessThan0}, hash: 8223946C3A1A3DE207B0F7662F04C7C8
    @Test()
    void getResourceWhenResourceGetContentLengthLessThan0() throws IOException {
        /* Branches:
         * (path.startsWith("/")) : true
         * (StringUtils.hasText(path)) : true
         * (!"/".equals(path)) : true
         * (resource.getContentLength() < 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        JarResourceManager target = new JarResourceManager(file);
        //Act Statement(s)
        Resource result = target.getResource("/A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getResourceWhen_NotEqualsPathAndResourceGetContentLengthNotLessThan0}, hash: 7C064F25E95447776B70AFA5F1870695
    @Disabled()
    @Test()
    void getResourceWhen_NotEqualsPathAndResourceGetContentLengthNotLessThan0() throws IOException {
        /* Branches:
         * (path.startsWith("/")) : false
         * (StringUtils.hasText(path)) : true
         * (!"/".equals(path)) : true
         * (resource.getContentLength() < 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            stringUtils.when(() -> StringUtils.hasText("")).thenReturn(true);
            File file = new File("pathname1");
            JarResourceManager target = new JarResourceManager(file);
            //Act Statement(s)
            Resource result = target.getResource("");
            //Assert statement(s)
            //TODO: Please implement equals method in URLResource for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                stringUtils.verify(() -> StringUtils.hasText(""), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isResourceChangeListenerSupportedTest}, hash: AE8B4BFF3263E823CFD82196100FA56A
    @Test()
    void isResourceChangeListenerSupportedTest() {
        //Arrange Statement(s)
        File file = new File("pathname1");
        JarResourceManager target = new JarResourceManager(file);
        //Act Statement(s)
        boolean result = target.isResourceChangeListenerSupported();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${registerResourceChangeListenerThrowsIllegalArgumentException}, hash: 970747AFBBBD1AD3B81C4B5587B99DBF
    @Test()
    void registerResourceChangeListenerThrowsIllegalArgumentException() {
        //Arrange Statement(s)
        File file = new File("pathname1");
        JarResourceManager target = new JarResourceManager(file);
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.registerResourceChangeListener(resourceChangeListenerMock);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${removeResourceChangeListenerThrowsIllegalArgumentException}, hash: 21FFC74A0EA9578DB42E30755C634C4C
    @Test()
    void removeResourceChangeListenerThrowsIllegalArgumentException() {
        //Arrange Statement(s)
        File file = new File("pathname1");
        JarResourceManager target = new JarResourceManager(file);
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.removeResourceChangeListener(resourceChangeListenerMock);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
