package org.springframework.boot.logging.log4j2;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.core.config.Configuration;

import java.io.ByteArrayInputStream;

import org.apache.logging.log4j.core.config.DefaultConfiguration;

import java.io.File;

import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.InputStream;
import java.io.ByteArrayOutputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringBootConfigurationFactorySapientGeneratedTest {

	//Sapient generated method id: ${73052bf0-4a32-37a1-b2f0-143ba6bfce23}
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

	//Sapient generated method id: ${7af94ba2-bfc1-3a03-8017-404a37d735ad}
	@Disabled()
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
		DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
		//Assert statement(s)
		//TODO: Please implement equals method in DefaultConfiguration for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(defaultConfiguration)));
	}
}
