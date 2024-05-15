package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.springframework.boot.origin.Origin;
import org.springframework.util.Assert;
import java.nio.file.Path;
import org.springframework.core.io.Resource;
import org.mockito.MockedStatic;
import java.io.File;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataResourceNotFoundExceptionSapientGeneratedTest {

    private final ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class, "resource");

    private final Path pathMock = mock(Path.class);

    private final Resource resourceToCheckMock = mock(Resource.class);

    //Sapient generated method id: ${getOriginTest}, hash: BF8C6FF1EE19AFA5A26961B6C880CE62
    @Test()
    void getOriginTest() {
        //Arrange Statement(s)
        Origin originMock = mock(Origin.class);
        try (MockedStatic<Origin> origin = mockStatic(Origin.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(configDataResourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            origin.when(() -> Origin.from((ConfigDataLocation) null)).thenReturn(originMock);
            Throwable throwable = new Throwable();
            ConfigDataResourceNotFoundException target = new ConfigDataResourceNotFoundException(configDataResourceMock, throwable);
            //Act Statement(s)
            Origin result = target.getOrigin();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(originMock));
                _assert.verify(() -> Assert.notNull(configDataResourceMock, "Resource must not be null"), atLeast(1));
                origin.verify(() -> Origin.from((ConfigDataLocation) null), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getReferenceDescriptionWhenLocationIsNull}, hash: AF06398D9E5292B24E2BC003570E6560
    @Disabled()
    @Test()
    void getReferenceDescriptionWhenLocationIsNull() {
        /* Branches:
         * (location != null) : false  #  inside getReferenceDescription method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(configDataResourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Throwable throwable = new Throwable();
            ConfigDataResourceNotFoundException target = new ConfigDataResourceNotFoundException(configDataResourceMock, throwable);
            //Act Statement(s)
            String result = target.getReferenceDescription();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("resource 'null'"));
                _assert.verify(() -> Assert.notNull(configDataResourceMock, "Resource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${withLocationWhenLocationIsNotNull}, hash: 0363ECE5DCE4477400D9F184A4C4FD01
    @Test()
    void withLocationWhenLocationIsNotNull() {
        /* Branches:
         * (location != null) : true  #  inside getReferenceDescription method
         */
        //Arrange Statement(s)
        ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class, "location");
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(configDataResourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            Throwable throwable = new Throwable();
            ConfigDataResourceNotFoundException target = spy(new ConfigDataResourceNotFoundException(configDataResourceMock, throwable));
            Throwable throwable2 = new Throwable();
            doReturn(throwable2).when(target).getCause();
            //Act Statement(s)
            ConfigDataResourceNotFoundException result = target.withLocation(configDataLocationMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(configDataResourceMock, "Resource must not be null"), atLeast(2));
                verify(target).getCause();
            });
        }
    }

    //Sapient generated method id: ${throwIfDoesNotExistWhenExists}, hash: 4FA35AAD70778856361736051E38D5C8
    @Disabled()
    @Test()
    void throwIfDoesNotExistWhenExists() {
        /* Branches:
         * (!exists) : false  #  inside throwIfDoesNotExist method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class);
        //Act Statement(s)
        ConfigDataResourceNotFoundException.throwIfDoesNotExist(configDataResourceMock, pathMock);
    }

    //Sapient generated method id: ${throwIfDoesNotExistWhenLocationIsNullThrowsConfigDataResourceNotFoundException}, hash: E2EA526035EE3B04AD4B7FFA2D0F671D
    @Disabled()
    @Test()
    void throwIfDoesNotExistWhenLocationIsNullThrowsConfigDataResourceNotFoundException() {
        /* Branches:
         * (!exists) : true  #  inside throwIfDoesNotExist method
         * (location != null) : false  #  inside getReferenceDescription method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(configDataResourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            final ConfigDataResourceNotFoundException result = assertThrows(ConfigDataResourceNotFoundException.class, () -> {
                ConfigDataResourceNotFoundException.throwIfDoesNotExist(configDataResourceMock, pathMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(configDataResourceMock, "Resource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${throwIfDoesNotExist1WhenExists}, hash: 02D2E2F7AD07C40BE1299791246D8F86
    @Disabled()
    @Test()
    void throwIfDoesNotExist1WhenExists() {
        /* Branches:
         * (!exists) : false  #  inside throwIfDoesNotExist method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class);
        File file = new File("pathname1");
        //Act Statement(s)
        ConfigDataResourceNotFoundException.throwIfDoesNotExist(configDataResourceMock, file);
    }

    //Sapient generated method id: ${throwIfDoesNotExist1WhenLocationIsNullThrowsConfigDataResourceNotFoundException}, hash: 86B5D9C039AD75ED4A6BC65753C9A7C8
    @Test()
    void throwIfDoesNotExist1WhenLocationIsNullThrowsConfigDataResourceNotFoundException() {
        /* Branches:
         * (!exists) : true  #  inside throwIfDoesNotExist method
         * (location != null) : false  #  inside getReferenceDescription method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(configDataResourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            File file = new File("pathname1");
            //Act Statement(s)
            final ConfigDataResourceNotFoundException result = assertThrows(ConfigDataResourceNotFoundException.class, () -> {
                ConfigDataResourceNotFoundException.throwIfDoesNotExist(configDataResourceMock, file);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(configDataResourceMock, "Resource must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${throwIfDoesNotExist2WhenExists}, hash: 5201B03FA70A77AD0BB11D16CC1EFF62
    @Test()
    void throwIfDoesNotExist2WhenExists() {
        /* Branches:
         * (!exists) : false  #  inside throwIfDoesNotExist method
         */
        //Arrange Statement(s)
        doReturn(true).when(resourceToCheckMock).exists();
        ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class);
        //Act Statement(s)
        ConfigDataResourceNotFoundException.throwIfDoesNotExist(configDataResourceMock, resourceToCheckMock);
        //Assert statement(s)
        assertAll("result", () -> verify(resourceToCheckMock).exists());
    }

    //Sapient generated method id: ${throwIfDoesNotExist2WhenLocationIsNullThrowsConfigDataResourceNotFoundException}, hash: A98BA838467DB94D1DE2C9A37433D733
    @Test()
    void throwIfDoesNotExist2WhenLocationIsNullThrowsConfigDataResourceNotFoundException() {
        /* Branches:
         * (!exists) : true  #  inside throwIfDoesNotExist method
         * (location != null) : false  #  inside getReferenceDescription method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(false).when(resourceToCheckMock).exists();
            _assert.when(() -> Assert.notNull(configDataResourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            final ConfigDataResourceNotFoundException result = assertThrows(ConfigDataResourceNotFoundException.class, () -> {
                ConfigDataResourceNotFoundException.throwIfDoesNotExist(configDataResourceMock, resourceToCheckMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(resourceToCheckMock).exists();
                _assert.verify(() -> Assert.notNull(configDataResourceMock, "Resource must not be null"), atLeast(1));
            });
        }
    }
}
