package org.springframework.boot.context.properties.source;

import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyNameException;

import java.lang.*;

import org.springframework.boot.context.properties.source.*;

import java.util.List;

import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyNameException;

import java.lang.CharSequence;
import java.util.*;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsInstanceOf.*;
import static org.hamcrest.MatcherAssert.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.eq;

import org.hamcrest.Matchers;
import org.hamcrest.core.IsInstanceOf;
import org.hamcrest.MatcherAssert;
import org.mockito.Mockito;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.net.*;
import java.beans.*;

import javax.net.*;
import javax.annotation.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

public class InvalidConfigurationPropertyNameExceptionGetInvalidCharactersEnhancedTest {

	@Test
	public void testGetInvalidCharacters() {
		// Arrange
		List<Character> invalidChars = Arrays.asList('!', '@', '#');
		InvalidConfigurationPropertyNameException exception = new InvalidConfigurationPropertyNameException("invalid.name", invalidChars);
		// Act
		List<Character> result = exception.getInvalidCharacters();
		// Assert
		assertNotNull(result, "The list of invalid characters should not be null");
		assertEquals(invalidChars, result, "The invalid characters should match the expected list");
	}
}
