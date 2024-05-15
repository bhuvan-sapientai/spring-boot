package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import org.springframework.boot.origin.Origin;
import java.io.ByteArrayInputStream;
import org.mockito.MockedStatic;
import org.springframework.util.FileCopyUtils;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import org.springframework.core.io.InputStreamSource;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.doThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class InputStreamSourceToByteArrayConverterSapientGeneratedTest {

    private final InputStreamSource sourceMock = mock(InputStreamSource.class);

    //Sapient generated method id: ${convertTest}, hash: 7E00C5999556A724DE1240CB93AB7624
    @Disabled()
    @Test()
    void convertTest() throws IOException {
        //Arrange Statement(s)
        try (MockedStatic<FileCopyUtils> fileCopyUtils = mockStatic(FileCopyUtils.class)) {
            doReturn(null).when(sourceMock).getInputStream();
            byte[] byteArray = new byte[] {};
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            fileCopyUtils.when(() -> FileCopyUtils.copyToByteArray(inputStream)).thenReturn(byteArray);
            InputStreamSourceToByteArrayConverter target = new InputStreamSourceToByteArrayConverter();
            //Act Statement(s)
            byte[] result = target.convert(sourceMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(byteArray));
                verify(sourceMock).getInputStream();
                fileCopyUtils.verify(() -> FileCopyUtils.copyToByteArray(inputStream), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${convertWhenOriginIsNotNullThrowsIllegalStateException}, hash: 17C4A88A7EA9CE91206DCA3114A25857
    @Test()
    void convertWhenOriginIsNotNullThrowsIllegalStateException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         * (origin != null) : true  #  inside getName method
         */
        //Arrange Statement(s)
        Origin originMock = mock(Origin.class, "origin");
        try (MockedStatic<Origin> origin = mockStatic(Origin.class)) {
            IOException iOException = new IOException();
            doThrow(iOException).when(sourceMock).getInputStream();
            origin.when(() -> Origin.from(sourceMock)).thenReturn(originMock);
            InputStreamSourceToByteArrayConverter target = new InputStreamSourceToByteArrayConverter();
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.convert(sourceMock);
            });
            IllegalStateException illegalStateException = new IllegalStateException("Unable to read from origin", iOException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                verify(sourceMock).getInputStream();
                origin.verify(() -> Origin.from(sourceMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${convertWhenSourceNotInstanceOfResourceThrowsIllegalStateException}, hash: 204B31EFEDBEF484EB639CA964567CC0
    @Test()
    void convertWhenSourceNotInstanceOfResourceThrowsIllegalStateException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         * (origin != null) : false  #  inside getName method
         * (source instanceof Resource resource) : false  #  inside getName method
         */
        //Arrange Statement(s)
        try (MockedStatic<Origin> origin = mockStatic(Origin.class)) {
            IOException iOException = new IOException();
            doThrow(iOException).when(sourceMock).getInputStream();
            origin.when(() -> Origin.from(sourceMock)).thenReturn(null);
            InputStreamSourceToByteArrayConverter target = new InputStreamSourceToByteArrayConverter();
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                target.convert(sourceMock);
            });
            IllegalStateException illegalStateException = new IllegalStateException("Unable to read from input stream source", iOException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                verify(sourceMock).getInputStream();
                origin.verify(() -> Origin.from(sourceMock), atLeast(1));
            });
        }
    }
}
