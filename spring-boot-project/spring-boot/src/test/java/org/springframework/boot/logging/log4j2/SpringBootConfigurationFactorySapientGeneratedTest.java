package org.springframework.boot.logging.log4j2;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.core.config.Configuration;
import java.io.ByteArrayInputStream;
import java.io.File;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.LoggerContext;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringBootConfigurationFactorySapientGeneratedTest {

    //Sapient generated method id: ${getConfigurationWhenSourceEqualsConfigurationSourceNULL_SOURCE}, hash: E1BFB4B15F9E95587468134D00573E2E
    @Test()
    void getConfigurationWhenSourceEqualsConfigurationSourceNULL_SOURCE() {
        /* Branches:
         * (source == null) : false
         * (source == ConfigurationSource.NULL_SOURCE) : true
         */
         //Arrange Statement(s)
        SpringBootConfigurationFactory target = new SpringBootConfigurationFactory();
        LoggerContext loggerContext = new LoggerContext("name1");
        ConfigurationSource configurationSource = ConfigurationSource.NULL_SOURCE;
        
        //Act Statement(s)
        Configuration result = target.getConfiguration(loggerContext, configurationSource);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${getConfigurationWhenSourceNotEqualsConfigurationSourceNULL_SOURCE}, hash: A5433D16348F52DCC785B64B031258FA
    @Test()
    void getConfigurationWhenSourceNotEqualsConfigurationSourceNULL_SOURCE() {
        /* Branches:
         * (source == null) : false
         * (source == ConfigurationSource.NULL_SOURCE) : false
         */
         //Arrange Statement(s)
        SpringBootConfigurationFactory target = new SpringBootConfigurationFactory();
        LoggerContext loggerContext = new LoggerContext("name1");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        File file = new File("pathname1");
        ConfigurationSource configurationSource = new ConfigurationSource(inputStream, file);
        
        //Act Statement(s)
        Configuration result = target.getConfiguration(loggerContext, configurationSource);
        
        //Assert statement(s)
        //TODO: Please implement equals method in DefaultConfiguration for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
