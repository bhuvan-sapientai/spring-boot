package org.springframework.boot.jackson;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.util.ClassUtils;
import java.util.Collection;
import org.mockito.MockedStatic;
import org.springframework.context.ApplicationContext;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JsonMixinModuleEntriesSapientGeneratedTest {

    private final ApplicationContext applicationContextMock = mock(ApplicationContext.class);

    private final BiConsumer biConsumerMock = mock(BiConsumer.class);

    private final JsonMixinModuleEntries jsonMixinModuleEntriesMock = mock(JsonMixinModuleEntries.class);

    //Sapient generated method id: ${createTest}, hash: 3B758B14DC6473FE2A0317E4E264E680
    @Test()
    void createTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Consumer consumerMock = mock(Consumer.class);
        //Act Statement(s)
        JsonMixinModuleEntries result = JsonMixinModuleEntries.create(consumerMock);
        //Assert statement(s)
        //TODO: Please implement equals method in JsonMixinModuleEntries for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${scanTest}, hash: 19980ACCAE93A01D2A01076F8550E54E
    @Test()
    void scanTest() {
        //Arrange Statement(s)
        try (MockedStatic<JsonMixinModuleEntries> jsonMixinModuleEntries = mockStatic(JsonMixinModuleEntries.class, CALLS_REAL_METHODS)) {
            jsonMixinModuleEntries.when(() -> JsonMixinModuleEntries.create((Consumer) any())).thenReturn(jsonMixinModuleEntriesMock);
            Collection<String> collection = new ArrayList<>();
            //Act Statement(s)
            JsonMixinModuleEntries result = JsonMixinModuleEntries.scan(applicationContextMock, collection);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(jsonMixinModuleEntriesMock));
                jsonMixinModuleEntries.verify(() -> JsonMixinModuleEntries.create((Consumer) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${doWithEntryWhenTypeInstanceOfClass_}, hash: 44A83BC2691624FAEA31D6095798220A
    @Disabled()
    @Test()
    void doWithEntryWhenTypeInstanceOfClass_() {
        /* Branches:
         * (type instanceof Class<?> clazz) : true  #  inside resolveClassNameIfNecessary method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<JsonMixinModuleEntries> jsonMixinModuleEntries = mockStatic(JsonMixinModuleEntries.class)) {
            jsonMixinModuleEntries.when(() -> JsonMixinModuleEntries.create((Consumer) any())).thenReturn(jsonMixinModuleEntriesMock);
            Collection<String> collection = new ArrayList<>();
            JsonMixinModuleEntries target = JsonMixinModuleEntries.scan(applicationContextMock, collection);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            //Act Statement(s)
            target.doWithEntry(classLoader, biConsumerMock);
            //Assert statement(s)
            assertAll("result", () -> jsonMixinModuleEntries.verify(() -> JsonMixinModuleEntries.create((Consumer) any())));
        }
    }

    //Sapient generated method id: ${doWithEntryWhenTypeNotInstanceOfClass_}, hash: A07E6358E8D4ADB3371587CA5BBA3C0A
    @Disabled()
    @Test()
    void doWithEntryWhenTypeNotInstanceOfClass_() {
        /* Branches:
         * (type instanceof Class<?> clazz) : false  #  inside resolveClassNameIfNecessary method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
            MockedStatic<JsonMixinModuleEntries> jsonMixinModuleEntries = mockStatic(JsonMixinModuleEntries.class)) {
            jsonMixinModuleEntries.when(() -> JsonMixinModuleEntries.create((Consumer) any())).thenReturn(jsonMixinModuleEntriesMock);
            classUtils.when(() -> ClassUtils.resolveClassName(eq("java.lang.String"), (ClassLoader) any())).thenReturn(Object.class);
            Collection<String> collection = new ArrayList<>();
            JsonMixinModuleEntries target = JsonMixinModuleEntries.scan(applicationContextMock, collection);
            ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
            //Act Statement(s)
            target.doWithEntry(classLoader, biConsumerMock);
            //Assert statement(s)
            assertAll("result", () -> {
                jsonMixinModuleEntries.verify(() -> JsonMixinModuleEntries.create((Consumer) any()));
                classUtils.verify(() -> ClassUtils.resolveClassName(eq("java.lang.String"), (ClassLoader) any()), atLeast(2));
            });
        }
    }
}
