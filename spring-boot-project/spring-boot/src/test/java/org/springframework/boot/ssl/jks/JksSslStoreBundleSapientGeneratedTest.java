package org.springframework.boot.ssl.jks;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JksSslStoreBundleSapientGeneratedTest {

    private final JksSslStoreDetails keyStoreDetailsMock = mock(JksSslStoreDetails.class, "keyStoreDetails");

    private final JksSslStoreDetails detailsMock = mock(JksSslStoreDetails.class);

    //Sapient generated method id: ${getKeyStorePasswordWhenThisKeyStoreDetailsIsNotNull}, hash: C2D71A98BDD2EEDF12BF7E319D3C383E
    @Test()
    void getKeyStorePasswordWhenThisKeyStoreDetailsIsNotNull() {
        /* Branches:
         * (this.keyStoreDetails != null) : true
         */
        //Arrange Statement(s)
        doReturn(true).when(keyStoreDetailsMock).isEmpty();
        doReturn(true).when(detailsMock).isEmpty();
        JksSslStoreBundle target = new JksSslStoreBundle(keyStoreDetailsMock, detailsMock);
        doReturn("return_of_password1").when(keyStoreDetailsMock).password();
        //Act Statement(s)
        String result = target.getKeyStorePassword();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_password1"));
            verify(keyStoreDetailsMock).isEmpty();
            verify(detailsMock).isEmpty();
            verify(keyStoreDetailsMock).password();
        });
    }

    //Sapient generated method id: ${getKeyStorePasswordWhenThisKeyStoreDetailsIsNull}, hash: AD9D96DD18FD1137CD20451316F626A8
    @Test()
    void getKeyStorePasswordWhenThisKeyStoreDetailsIsNull() {
        /* Branches:
         * (this.keyStoreDetails != null) : false
         */
        //Arrange Statement(s)
        doReturn(true).when(detailsMock).isEmpty();
        JksSslStoreBundle target = new JksSslStoreBundle((JksSslStoreDetails) null, detailsMock);
        //Act Statement(s)
        String result = target.getKeyStorePassword();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(detailsMock).isEmpty();
        });
    }

    //Sapient generated method id: ${toStringWhenThisTrustStoreIsNull}, hash: E5051808FE705D6F572D0A2DDB816A9B
    @Disabled()
    @Test()
    void toStringWhenThisTrustStoreIsNull() {
        /* Branches:
         * (this.keyStore != null) : false
         * (keyStorePassword != null) : true
         * (this.trustStore != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: creator - Method: append
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(true).when(keyStoreDetailsMock).isEmpty();
        doReturn(true).when(detailsMock).isEmpty();
        JksSslStoreBundle target = spy(new JksSslStoreBundle(keyStoreDetailsMock, detailsMock));
        doReturn("return_of_getKeyStorePassword1").when(target).getKeyStorePassword();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(keyStoreDetailsMock).isEmpty();
            verify(detailsMock).isEmpty();
            verify(target).getKeyStorePassword();
        });
    }

    //Sapient generated method id: ${toStringWhenKeyStorePasswordIsNullAndThisTrustStoreIsNull}, hash: FBDB026FBF48974B4B0F68C5518A508C
    @Disabled()
    @Test()
    void toStringWhenKeyStorePasswordIsNullAndThisTrustStoreIsNull() {
        /* Branches:
         * (this.keyStore != null) : false
         * (keyStorePassword != null) : false
         * (this.trustStore != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: creator - Method: append
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(true).when(keyStoreDetailsMock).isEmpty();
        doReturn(true).when(detailsMock).isEmpty();
        JksSslStoreBundle target = spy(new JksSslStoreBundle(keyStoreDetailsMock, detailsMock));
        doReturn(null).when(target).getKeyStorePassword();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(keyStoreDetailsMock).isEmpty();
            verify(detailsMock).isEmpty();
            verify(target).getKeyStorePassword();
        });
    }
}
