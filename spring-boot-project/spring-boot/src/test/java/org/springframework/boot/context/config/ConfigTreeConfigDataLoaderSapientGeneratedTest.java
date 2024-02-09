package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import org.mockito.stubbing.Answer;

import java.nio.file.Path;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import org.springframework.boot.env.ConfigTreePropertySource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigTreeConfigDataLoaderSapientGeneratedTest {

	//Sapient generated method id: ${ff42effe-8e08-33e3-9690-b409079214e3}
	@Disabled()
	@Test()
	void loadTest() throws IOException, ConfigDataResourceNotFoundException {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigTreeConfigDataResource resourceMock = mock(ConfigTreeConfigDataResource.class);
		ConfigDataLoaderContext configDataLoaderContextMock = mock(ConfigDataLoaderContext.class);
		try (MockedStatic<ConfigDataResourceNotFoundException> configDataResourceNotFoundException = mockStatic(ConfigDataResourceNotFoundException.class)) {
			//TODO: Needs to return real value
			doReturn(null).when(resourceMock).getPath();
			configDataResourceNotFoundException.when(() -> ConfigDataResourceNotFoundException.throwIfDoesNotExist(resourceMock, (Path) null)).thenAnswer((Answer<Void>) invocation -> null);
			ConfigTreeConfigDataLoader target = new ConfigTreeConfigDataLoader();
			//Act Statement(s)
			ConfigData result = target.load(configDataLoaderContextMock, resourceMock);
			ConfigTreePropertySource.Option[] optionArray = new ConfigTreePropertySource.Option[] { ConfigTreePropertySource.Option.AUTO_TRIM_TRAILING_NEW_LINE };
			ConfigTreePropertySource configTreePropertySource = new ConfigTreePropertySource("Config tree 'load_path1'", (Path) null, optionArray);
			List<ConfigTreePropertySource> configTreePropertySourceList = new ArrayList<>(List.of(configTreePropertySource));
			ConfigData.Option[] optionArray2 = new ConfigData.Option[] {};
			ConfigData configData = new ConfigData(configTreePropertySourceList, optionArray2);
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigData for verification to succeed or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, equalTo(configData));
				verify(resourceMock).getPath();
				configDataResourceNotFoundException.verify(() -> ConfigDataResourceNotFoundException.throwIfDoesNotExist(resourceMock, (Path) null), atLeast(1));
			});
		}
	}
}
