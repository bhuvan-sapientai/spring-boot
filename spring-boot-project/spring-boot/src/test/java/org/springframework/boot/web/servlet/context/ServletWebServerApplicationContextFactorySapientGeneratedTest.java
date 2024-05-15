package org.springframework.boot.web.servlet.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.WebApplicationType;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ServletWebServerApplicationContextFactorySapientGeneratedTest {

    //Sapient generated method id: ${getEnvironmentTypeWhenWebApplicationTypeNotEqualsWebApplicationTypeSERVLET}, hash: 2316D7866BDEB593E3E46705BDC2DD97
    @Test()
    void getEnvironmentTypeWhenWebApplicationTypeNotEqualsWebApplicationTypeSERVLET() {
        /* Branches:
         * (webApplicationType != WebApplicationType.SERVLET) : true
         */
         //Arrange Statement(s)
        ServletWebServerApplicationContextFactory target = new ServletWebServerApplicationContextFactory();
        
        //Act Statement(s)
        Class<? extends ConfigurableEnvironment> result = target.getEnvironmentType(WebApplicationType.NONE);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getEnvironmentTypeWhenWebApplicationTypeEqualsWebApplicationTypeSERVLET}, hash: 623B537CA13DB6D5715C2BD78CF9D431
    @Test()
    void getEnvironmentTypeWhenWebApplicationTypeEqualsWebApplicationTypeSERVLET() {
        /* Branches:
         * (webApplicationType != WebApplicationType.SERVLET) : false
         */
         //Arrange Statement(s)
        ServletWebServerApplicationContextFactory target = new ServletWebServerApplicationContextFactory();
        
        //Act Statement(s)
        Class<? extends ConfigurableEnvironment> result = target.getEnvironmentType(WebApplicationType.SERVLET);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(ApplicationServletEnvironment.class)));
    }

    //Sapient generated method id: ${createEnvironmentWhenWebApplicationTypeNotEqualsWebApplicationTypeSERVLET}, hash: D2B9E13E4F0D5D35E1E8D2D23D23CF52
    @Test()
    void createEnvironmentWhenWebApplicationTypeNotEqualsWebApplicationTypeSERVLET() {
        /* Branches:
         * (webApplicationType != WebApplicationType.SERVLET) : true
         */
         //Arrange Statement(s)
        ServletWebServerApplicationContextFactory target = new ServletWebServerApplicationContextFactory();
        
        //Act Statement(s)
        ConfigurableEnvironment result = target.createEnvironment(WebApplicationType.NONE);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${createEnvironmentWhenWebApplicationTypeEqualsWebApplicationTypeSERVLET}, hash: 39A450CE7093C51F9D2391D06CC12D92
    @Test()
    void createEnvironmentWhenWebApplicationTypeEqualsWebApplicationTypeSERVLET() {
        /* Branches:
         * (webApplicationType != WebApplicationType.SERVLET) : false
         */
         //Arrange Statement(s)
        ServletWebServerApplicationContextFactory target = new ServletWebServerApplicationContextFactory();
        
        //Act Statement(s)
        ConfigurableEnvironment result = target.createEnvironment(WebApplicationType.SERVLET);
        
        //Assert statement(s)
        //TODO: Please implement equals method in ApplicationServletEnvironment for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${createWhenWebApplicationTypeNotEqualsWebApplicationTypeSERVLET}, hash: C193A43BCF95E28ABE26AA1F02C31F72
    @Test()
    void createWhenWebApplicationTypeNotEqualsWebApplicationTypeSERVLET() {
        /* Branches:
         * (webApplicationType != WebApplicationType.SERVLET) : true
         */
         //Arrange Statement(s)
        ServletWebServerApplicationContextFactory target = new ServletWebServerApplicationContextFactory();
        
        //Act Statement(s)
        ConfigurableApplicationContext result = target.create(WebApplicationType.NONE);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${createWhenAotDetectorNotUseGeneratedArtifacts}, hash: 8BEB46072EE13CB5E72045BA57E4E379
    @Test()
    void createWhenAotDetectorNotUseGeneratedArtifacts() {
        /* Branches:
         * (webApplicationType != WebApplicationType.SERVLET) : false
         * (!AotDetector.useGeneratedArtifacts()) : true  #  inside createContext method
         */
         //Arrange Statement(s)
        ServletWebServerApplicationContextFactory target = new ServletWebServerApplicationContextFactory();
        
        //Act Statement(s)
        ConfigurableApplicationContext result = target.create(WebApplicationType.SERVLET);
        
        //Assert statement(s)
        //TODO: Please implement equals method in AnnotationConfigServletWebServerApplicationContext for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
