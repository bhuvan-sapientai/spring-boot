package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;
import org.springframework.core.io.Resource;
import org.springframework.core.env.PropertySource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class YamlPropertySourceLoaderSapientGeneratedTest {

    private final Resource resourceMock = mock(Resource.class);

    //Sapient generated method id: ${getFileExtensionsTest}, hash: 329510E34E56C937E0618CC6A2066EDC
    @Test()
    void getFileExtensionsTest() {
        //Arrange Statement(s)
        YamlPropertySourceLoader target = new YamlPropertySourceLoader();
        //Act Statement(s)
        String[] result = target.getFileExtensions();
        String[] stringResultArray = new String[] { "yml", "yaml" };
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(stringResultArray)));
    }

    //Sapient generated method id: ${loadWhenLoadedIsEmpty}, hash: C11B3E365F9374D832BBC8651FECC411
    @Disabled()
    @Test()
    void loadWhenLoadedIsEmpty() throws IOException {
        /* Branches:
         * (!ClassUtils.isPresent("org.yaml.snakeyaml.Yaml", getClass().getClassLoader())) : false
         * (loaded.isEmpty()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type OriginTrackedYamlLoader - Method: load
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        YamlPropertySourceLoader target = new YamlPropertySourceLoader();
        //Act Statement(s)
        List<PropertySource<?>> result = target.load("name1", resourceMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${loadWhenLoadedSizeNotEquals1}, hash: 3B07F152DA79A6D4F652E6CB58977446
    @Disabled()
    @Test()
    void loadWhenLoadedSizeNotEquals1() throws IOException {
        /* Branches:
         * (!ClassUtils.isPresent("org.yaml.snakeyaml.Yaml", getClass().getClassLoader())) : false
         * (loaded.isEmpty()) : false
         * (i < loaded.size()) : true
         * (loaded.size() != 1) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type OriginTrackedYamlLoader - Method: load
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        YamlPropertySourceLoader target = new YamlPropertySourceLoader();
        //Act Statement(s)
        List<PropertySource<?>> result = target.load("A", resourceMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result.get(0), is(instanceOf(PropertySource.class)));
        });
    }

    //Sapient generated method id: ${loadWhenLoadedSizeEquals1}, hash: 23870A971773F478B5F3F33ED1975DAC
    @Disabled()
    @Test()
    void loadWhenLoadedSizeEquals1() throws IOException {
        /* Branches:
         * (!ClassUtils.isPresent("org.yaml.snakeyaml.Yaml", getClass().getClassLoader())) : false
         * (loaded.isEmpty()) : false
         * (i < loaded.size()) : true
         * (loaded.size() != 1) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type OriginTrackedYamlLoader - Method: load
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        YamlPropertySourceLoader target = new YamlPropertySourceLoader();
        //Act Statement(s)
        List<PropertySource<?>> result = target.load("A", resourceMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result.get(0), is(instanceOf(PropertySource.class)));
        });
    }
}
