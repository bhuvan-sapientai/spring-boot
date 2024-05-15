package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.time.Duration;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertySourcesCachingSapientGeneratedTest {

    private final ConfigurationPropertyCaching configurationPropertyCachingMock = mock(ConfigurationPropertyCaching.class);

    private final ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);

    //Sapient generated method id: ${enableWhenCachingIsNotNull}, hash: AFDE590F800C79FAFBE71CF6922D942F
    @Test()
    void enableWhenCachingIsNotNull() {
        /* Branches:
         * (this.sources != null) : true  #  inside forEach method
         * (for-each(this.sources)) : true  #  inside forEach method
         * (caching != null) : true  #  inside forEach method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: action - Method: accept
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CachingConfigurationPropertySource> cachingConfigurationPropertySource = mockStatic(CachingConfigurationPropertySource.class)) {
            cachingConfigurationPropertySource.when(() -> CachingConfigurationPropertySource.find(configurationPropertySourceMock)).thenReturn(configurationPropertyCachingMock);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
            ConfigurationPropertySourcesCaching target = new ConfigurationPropertySourcesCaching(iterable);
            //Act Statement(s)
            target.enable();
            //Assert statement(s)
            assertAll("result", () -> cachingConfigurationPropertySource.verify(() -> CachingConfigurationPropertySource.find(configurationPropertySourceMock), atLeast(1)));
        }
    }

    //Sapient generated method id: ${disableWhenCachingIsNotNull}, hash: 6A84A339FE4D129B736183B0F78324D9
    @Test()
    void disableWhenCachingIsNotNull() {
        /* Branches:
         * (this.sources != null) : true  #  inside forEach method
         * (for-each(this.sources)) : true  #  inside forEach method
         * (caching != null) : true  #  inside forEach method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: action - Method: accept
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CachingConfigurationPropertySource> cachingConfigurationPropertySource = mockStatic(CachingConfigurationPropertySource.class)) {
            cachingConfigurationPropertySource.when(() -> CachingConfigurationPropertySource.find(configurationPropertySourceMock)).thenReturn(configurationPropertyCachingMock);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
            ConfigurationPropertySourcesCaching target = new ConfigurationPropertySourcesCaching(iterable);
            //Act Statement(s)
            target.disable();
            //Assert statement(s)
            assertAll("result", () -> cachingConfigurationPropertySource.verify(() -> CachingConfigurationPropertySource.find(configurationPropertySourceMock), atLeast(1)));
        }
    }

    //Sapient generated method id: ${setTimeToLiveWhenCachingIsNotNull}, hash: E6CEF3F6EAF137232EA36A31233F131B
    @Test()
    void setTimeToLiveWhenCachingIsNotNull() {
        /* Branches:
         * (this.sources != null) : true  #  inside forEach method
         * (for-each(this.sources)) : true  #  inside forEach method
         * (caching != null) : true  #  inside forEach method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: action - Method: accept
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CachingConfigurationPropertySource> cachingConfigurationPropertySource = mockStatic(CachingConfigurationPropertySource.class)) {
            cachingConfigurationPropertySource.when(() -> CachingConfigurationPropertySource.find(configurationPropertySourceMock)).thenReturn(configurationPropertyCachingMock);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
            ConfigurationPropertySourcesCaching target = new ConfigurationPropertySourcesCaching(iterable);
            Duration duration = Duration.ofDays(0L);
            //Act Statement(s)
            target.setTimeToLive(duration);
            //Assert statement(s)
            assertAll("result", () -> cachingConfigurationPropertySource.verify(() -> CachingConfigurationPropertySource.find(configurationPropertySourceMock), atLeast(1)));
        }
    }

    //Sapient generated method id: ${clearWhenCachingIsNotNull}, hash: B6840F24B5BEA0E8D0E04968E8E357E2
    @Test()
    void clearWhenCachingIsNotNull() {
        /* Branches:
         * (this.sources != null) : true  #  inside forEach method
         * (for-each(this.sources)) : true  #  inside forEach method
         * (caching != null) : true  #  inside forEach method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: action - Method: accept
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CachingConfigurationPropertySource> cachingConfigurationPropertySource = mockStatic(CachingConfigurationPropertySource.class)) {
            cachingConfigurationPropertySource.when(() -> CachingConfigurationPropertySource.find(configurationPropertySourceMock)).thenReturn(configurationPropertyCachingMock);
            Iterable<ConfigurationPropertySource> iterable = new ArrayList<>(List.of(configurationPropertySourceMock));
            ConfigurationPropertySourcesCaching target = new ConfigurationPropertySourcesCaching(iterable);
            //Act Statement(s)
            target.clear();
            //Assert statement(s)
            assertAll("result", () -> cachingConfigurationPropertySource.verify(() -> CachingConfigurationPropertySource.find(configurationPropertySourceMock), atLeast(1)));
        }
    }
}
