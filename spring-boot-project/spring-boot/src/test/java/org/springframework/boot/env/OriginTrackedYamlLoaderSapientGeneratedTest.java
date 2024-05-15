package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;
import org.springframework.core.CollectionFactory;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.mockito.MockedStatic;
import java.util.Properties;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class OriginTrackedYamlLoaderSapientGeneratedTest {

    private final Resource resourceMock = mock(Resource.class, "resource");

    //Sapient generated method id: ${createYamlTest}, hash: C7CE5D97211986625A7BD777653F90FD
    @Test()
    void createYamlTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Resource resourceMock = mock(Resource.class);
        OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);
        //Act Statement(s)
        Yaml result = target.createYaml();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${loadTest}, hash: 8F150BADAE918367C3451D64F1576726
    @Disabled()
    @Test()
    void loadTest() throws Throwable, IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: yaml - Method: loadAll
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
            doReturn(null).when(resourceMock).getInputStream();
            Properties properties = new Properties();
            collectionFactory.when(() -> CollectionFactory.createStringAdaptingProperties()).thenReturn(properties);
            OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);
            //Act Statement(s)
            List<Map<String, Object>> result = target.load();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(resourceMock).getInputStream();
                collectionFactory.verify(() -> CollectionFactory.createStringAdaptingProperties(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadTest3}, hash: FD30D0059DAC0A02ABCB1D60CDF01382
    @Disabled()
    @Test()
    void loadTest3() throws Throwable, IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: yaml - Method: loadAll
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
            doReturn(null).when(resourceMock).getInputStream();
            Properties properties = new Properties();
            properties.put("object2", "A");
            collectionFactory.when(() -> CollectionFactory.createStringAdaptingProperties()).thenReturn(properties);
            OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);
            //Act Statement(s)
            List<Map<String, Object>> result = target.load();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(resourceMock).getInputStream();
                collectionFactory.verify(() -> CollectionFactory.createStringAdaptingProperties(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadTest5}, hash: 48E012481C67DC991A6B8B931153FE03
    @Disabled()
    @Test()
    void loadTest5() throws Throwable, IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: yaml - Method: loadAll
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
            doReturn(null).when(resourceMock).getInputStream();
            Object object = new Object();
            Properties properties = new Properties();
            properties.put("document", object);
            collectionFactory.when(() -> CollectionFactory.createStringAdaptingProperties()).thenReturn(properties);
            OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);
            //Act Statement(s)
            List<Map<String, Object>> result = target.load();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(resourceMock).getInputStream();
                collectionFactory.verify(() -> CollectionFactory.createStringAdaptingProperties(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadTest8}, hash: 4CAE3713E65D91D88F8B7A8FF8D6A297
    @Disabled()
    @Test()
    void loadTest8() throws Throwable, IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: yaml - Method: loadAll
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
            doReturn(null).when(resourceMock).getInputStream();
            Properties properties = new Properties();
            collectionFactory.when(() -> CollectionFactory.createStringAdaptingProperties()).thenReturn(properties);
            OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);
            //Act Statement(s)
            List<Map<String, Object>> result = target.load();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(resourceMock).getInputStream();
                collectionFactory.verify(() -> CollectionFactory.createStringAdaptingProperties(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadTest9}, hash: 3413A172D517F0E774AC861F1A9BE2BD
    @Disabled()
    @Test()
    void loadTest9() throws Throwable, IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: yaml - Method: loadAll
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
            doReturn(null).when(resourceMock).getInputStream();
            Properties properties = new Properties();
            properties.put("[object2]", "");
            collectionFactory.when(() -> CollectionFactory.createStringAdaptingProperties()).thenReturn(properties);
            OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);
            //Act Statement(s)
            List<Map<String, Object>> result = target.load();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(resourceMock).getInputStream();
                collectionFactory.verify(() -> CollectionFactory.createStringAdaptingProperties(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadTest13}, hash: E90A9C5E72C6A912DBB6EF4B00DD7BDF
    @Disabled()
    @Test()
    void loadTest13() throws Throwable, IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: yaml - Method: loadAll
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
            doReturn(null).when(resourceMock).getInputStream();
            Properties properties = new Properties();
            properties.put("object2", "");
            collectionFactory.when(() -> CollectionFactory.createStringAdaptingProperties()).thenReturn(properties);
            OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);
            //Act Statement(s)
            List<Map<String, Object>> result = target.load();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(resourceMock).getInputStream();
                collectionFactory.verify(() -> CollectionFactory.createStringAdaptingProperties(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadTest14}, hash: B9C7326CE95C5F8755C3B40AB0E51651
    @Disabled()
    @Test()
    void loadTest14() throws Throwable, IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: yaml - Method: loadAll
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(null).when(resourceMock).getInputStream();
        OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);
        //Act Statement(s)
        List<Map<String, Object>> result = target.load();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(0));
            verify(resourceMock).getInputStream();
        });
    }

    //Sapient generated method id: ${loadWhenDefaultBranch}, hash: 2A254BF06FBA65090AB22EDF1192B205
    @Disabled()
    @Test()
    void loadWhenDefaultBranch() throws Throwable, IOException {
        /* Branches:
         * (branch expression (line 202)) : true  #  inside process method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: yaml - Method: loadAll
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
            doReturn(null).when(resourceMock).getInputStream();
            Properties properties = new Properties();
            properties.put("[object2]", "");
            collectionFactory.when(() -> CollectionFactory.createStringAdaptingProperties()).thenReturn(properties);
            OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);
            //Act Statement(s)
            List<Map<String, Object>> result = target.load();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                verify(resourceMock).getInputStream();
                collectionFactory.verify(() -> CollectionFactory.createStringAdaptingProperties(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loadWhenDefaultBranchThrowsThrowable}, hash: B4BA24A2DF45E63CEF50C5BDED3B91F0
    @Disabled()
    @Test()
    void loadWhenDefaultBranchThrowsThrowable() throws IOException {
        /* Branches:
         * (branch expression (line 202)) : true  #  inside process method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: yaml - Method: loadAll
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Resource resourceMock = mock(Resource.class);
        try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
            doReturn(null).when(resourceMock).getInputStream();
            Object object = new Object();
            Properties properties = new Properties();
            properties.put("document", object);
            collectionFactory.when(() -> CollectionFactory.createStringAdaptingProperties()).thenReturn(properties);
            OriginTrackedYamlLoader target = new OriginTrackedYamlLoader(resourceMock);
            //Act Statement(s)
            final Throwable result = assertThrows(Throwable.class, () -> {
                target.load();
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(resourceMock).getInputStream();
                collectionFactory.verify(() -> CollectionFactory.createStringAdaptingProperties(), atLeast(1));
            });
        }
    }
}
