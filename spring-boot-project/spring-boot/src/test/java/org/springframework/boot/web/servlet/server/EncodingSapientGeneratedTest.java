package org.springframework.boot.web.servlet.server;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EncodingSapientGeneratedTest {

    //Sapient generated method id: ${isForceTest}, hash: C4EB7C73F89B9515E3CD21E7A71A12AA
    @Test()
    void isForceTest() {
        //Arrange Statement(s)
        Encoding target = new Encoding();
        
        //Act Statement(s)
        boolean result = target.isForce();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${setForceTest}, hash: 3207583C7069980D45ACCA35EBC0F449
    @Test()
    void setForceTest() {
        //Arrange Statement(s)
        Encoding target = new Encoding();
        
        //Act Statement(s)
        target.setForce(false);
    }

    //Sapient generated method id: ${isForceRequestTest}, hash: 3BFB3294DD44702D1F286D138C9DCB8F
    @Test()
    void isForceRequestTest() {
        //Arrange Statement(s)
        Encoding target = new Encoding();
        
        //Act Statement(s)
        boolean result = target.isForceRequest();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${setForceRequestTest}, hash: 2EB3F59C5D15045C69CABA8BB23FBF8B
    @Test()
    void setForceRequestTest() {
        //Arrange Statement(s)
        Encoding target = new Encoding();
        
        //Act Statement(s)
        target.setForceRequest(false);
    }

    //Sapient generated method id: ${isForceResponseTest}, hash: 1BF654FFB2624E3DA92738ECD2EAB5A9
    @Test()
    void isForceResponseTest() {
        //Arrange Statement(s)
        Encoding target = new Encoding();
        
        //Act Statement(s)
        boolean result = target.isForceResponse();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${setForceResponseTest}, hash: F590BADB9F41CE764654B439F13A9C43
    @Test()
    void setForceResponseTest() {
        //Arrange Statement(s)
        Encoding target = new Encoding();
        
        //Act Statement(s)
        target.setForceResponse(false);
    }

    //Sapient generated method id: ${shouldForceWhenTypeNotEqualsTypeREQUEST}, hash: 8F980C42B564BD6CAC78DC0505BBA334
    @Test()
    void shouldForceWhenTypeNotEqualsTypeREQUEST() {
        /* Branches:
         * (type != Type.REQUEST) : true
         * (force == null) : true
         * (force == null) : true
         * (type == Type.REQUEST) : false
         */
         //Arrange Statement(s)
        Encoding target = new Encoding();
        
        //Act Statement(s)
        boolean result = target.shouldForce(Encoding.Type.RESPONSE);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${shouldForceWhenTypeEqualsTypeREQUEST}, hash: 9BC3B6518D75C8B794C44FC28E7C7526
    @Test()
    void shouldForceWhenTypeEqualsTypeREQUEST() {
        /* Branches:
         * (type != Type.REQUEST) : false
         * (force == null) : true
         * (force == null) : true
         * (type == Type.REQUEST) : true
         */
         //Arrange Statement(s)
        Encoding target = new Encoding();
        
        //Act Statement(s)
        boolean result = target.shouldForce(Encoding.Type.REQUEST);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }
}
