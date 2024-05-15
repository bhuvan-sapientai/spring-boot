package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataEnvironmentContributorPlaceholdersResolverSapientGeneratedTest {

    private final ConfigDataActivationContext configDataActivationContextMock = mock(ConfigDataActivationContext.class);

    private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock = mock(ConfigDataEnvironmentContributor.class);

    //Sapient generated method id: ${resolvePlaceholdersWhenValueInstanceOfString}, hash: 994F0EF1373C806A60AF1C2931477F42
    @Disabled()
    @Test()
    void resolvePlaceholdersWhenValueInstanceOfString() {
        /* Branches:
         * (value instanceof String string) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: helper - Method: replacePlaceholders
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Iterable<ConfigDataEnvironmentContributor> iterable = new ArrayList<>();
        ConfigDataEnvironmentContributorPlaceholdersResolver target = new ConfigDataEnvironmentContributorPlaceholdersResolver(iterable, configDataActivationContextMock, configDataEnvironmentContributorMock, false);
        //Act Statement(s)
        Object result = target.resolvePlaceholders("value1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("return_of_replacePlaceholders1")));
    }

    //Sapient generated method id: ${resolvePlaceholdersWhenValueNotInstanceOfString}, hash: 197C9A82B193F8D43BEAB9CED184BBB3
    @Test()
    void resolvePlaceholdersWhenValueNotInstanceOfString() {
        /* Branches:
         * (value instanceof String string) : false
         */
        //Arrange Statement(s)
        Iterable<ConfigDataEnvironmentContributor> iterable = new ArrayList<>();
        ConfigDataEnvironmentContributorPlaceholdersResolver target = new ConfigDataEnvironmentContributorPlaceholdersResolver(iterable, configDataActivationContextMock, configDataEnvironmentContributorMock, false);
        Object object = new Object();
        //Act Statement(s)
        Object result = target.resolvePlaceholders(object);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(object)));
    }
}
