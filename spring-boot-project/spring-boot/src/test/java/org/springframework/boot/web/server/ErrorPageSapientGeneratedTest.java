package org.springframework.boot.web.server;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ErrorPageSapientGeneratedTest {

    //Sapient generated method id: ${getStatusCodeWhenThisStatusIsNotNull}, hash: 6779DFF41E2D2F1319DD2296E44380B2
    @Test()
    void getStatusCodeWhenThisStatusIsNotNull() {
        /* Branches:
         * (this.status != null) : true
         */
         //Arrange Statement(s)
        ErrorPage target = new ErrorPage(HttpStatus.MULTI_STATUS, "path1");
        
        //Act Statement(s)
        int result = target.getStatusCode();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(207)));
    }

    //Sapient generated method id: ${getStatusCodeWhenThisStatusIsNull}, hash: 8AECAE7A5F09E480C47D3CF240B5281F
    @Test()
    void getStatusCodeWhenThisStatusIsNull() {
        /* Branches:
         * (this.status != null) : false
         */
         //Arrange Statement(s)
        ErrorPage target = new ErrorPage((HttpStatus) null, "path1");
        
        //Act Statement(s)
        int result = target.getStatusCode();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${getExceptionNameWhenThisExceptionIsNull}, hash: F2D77EB9D747735C7799123A18DC6A52
    @Test()
    void getExceptionNameWhenThisExceptionIsNull() {
        /* Branches:
         * (this.exception != null) : false
         */
         //Arrange Statement(s)
        ErrorPage target = new ErrorPage(HttpStatus.CONTINUE, "path1");
        
        //Act Statement(s)
        String result = target.getExceptionName();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${isGlobalWhenThisStatusIsNotNull}, hash: 904E963DA6F6B6D66AA05A3BD59435CF
    @Test()
    void isGlobalWhenThisStatusIsNotNull() {
        /* Branches:
         * (this.status == null) : false
         */
         //Arrange Statement(s)
        ErrorPage target = new ErrorPage(HttpStatus.CONTINUE, "path1");
        
        //Act Statement(s)
        boolean result = target.isGlobal();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isGlobalWhenThisExceptionIsNull}, hash: AE212858FA93C6637DC9ADE6C0B8E183
    @Test()
    void isGlobalWhenThisExceptionIsNull() {
        /* Branches:
         * (this.status == null) : true
         * (this.exception == null) : true
         */
         //Arrange Statement(s)
        ErrorPage target = new ErrorPage((HttpStatus) null, "path1");
        
        //Act Statement(s)
        boolean result = target.isGlobal();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }
}
