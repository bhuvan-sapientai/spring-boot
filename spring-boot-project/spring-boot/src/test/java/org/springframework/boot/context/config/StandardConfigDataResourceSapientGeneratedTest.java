package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import org.mockito.stubbing.Answer;
import org.springframework.core.io.Resource;
import org.mockito.MockedStatic;
import org.springframework.core.io.FileUrlResource;
import java.io.File;
import org.springframework.util.Assert;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StandardConfigDataResourceSapientGeneratedTest {

    private final StandardConfigDataReference referenceMock = mock(StandardConfigDataReference.class, "reference");

    private final FileUrlResource resourceMock = mock(FileUrlResource.class, "resource");

    //Sapient generated method id: ${getProfileTest}, hash: 18F9592B0D0772D2A851A0D5AE0213BB
    @Test()
    void getProfileTest() {
        //Arrange Statement(s)
        Resource resourceMock2 = mock(Resource.class);
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(referenceMock, "Reference must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(resourceMock2, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            StandardConfigDataResource target = new StandardConfigDataResource(referenceMock, resourceMock2, false);
            doReturn("return_of_getProfile1").when(referenceMock).getProfile();
            //Act Statement(s)
            String result = target.getProfile();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getProfile1"));
                _assert.verify(() -> Assert.notNull(referenceMock, "Reference must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(resourceMock2, "Resource must not be null"), atLeast(1));
                verify(referenceMock).getProfile();
            });
        }
    }

    //Sapient generated method id: ${toStringWhenThisResourceInstanceOfFileUrlResource}, hash: FCB36FC738083A7B5417D9143EDA0431
    @Test()
    void toStringWhenThisResourceInstanceOfFileUrlResource() throws IOException {
        /* Branches:
         * (this.resource instanceof FileSystemResource) : false
         * (this.resource instanceof FileUrlResource) : true
         */
        //Arrange Statement(s)
        File fileMock = mock(File.class, "file");
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(referenceMock, "Reference must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            StandardConfigDataResource target = new StandardConfigDataResource(referenceMock, resourceMock, false);
            doReturn(fileMock).when(resourceMock).getFile();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("file [file]"));
                _assert.verify(() -> Assert.notNull(referenceMock, "Reference must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                verify(resourceMock).getFile();
            });
        }
    }

    //Sapient generated method id: ${toStringWhenThisResourceNotInstanceOfFileUrlResource}, hash: 92D803421A7E595F3B9DB0FE0EA9B9D6
    @Test()
    void toStringWhenThisResourceNotInstanceOfFileUrlResource() throws IOException {
        /* Branches:
         * (this.resource instanceof FileSystemResource) : false
         * (this.resource instanceof FileUrlResource) : false
         */
        //Arrange Statement(s)
        Resource resourceMock2 = mock(Resource.class, "resource");
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(referenceMock, "Reference must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(resourceMock2, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            StandardConfigDataResource target = new StandardConfigDataResource(referenceMock, resourceMock2, false);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("resource"));
                _assert.verify(() -> Assert.notNull(referenceMock, "Reference must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(resourceMock2, "Resource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toStringWhenThisResourceInstanceOfFileUrlResourceAndCaughtIOException}, hash: A018733765DB9CA9BBE00D48E960B5EA
    @Disabled()
    @Test()
    void toStringWhenThisResourceInstanceOfFileUrlResourceAndCaughtIOException() throws IOException {
        /* Branches:
         * (this.resource instanceof FileSystemResource) : false
         * (this.resource instanceof FileUrlResource) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(referenceMock, "Reference must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            StandardConfigDataResource target = new StandardConfigDataResource(referenceMock, resourceMock, false);
            File file = new File("pathname1");
            doReturn(file).when(resourceMock).getFile();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("resource"));
                _assert.verify(() -> Assert.notNull(referenceMock, "Reference must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                verify(resourceMock).getFile();
            });
        }
    }
}
