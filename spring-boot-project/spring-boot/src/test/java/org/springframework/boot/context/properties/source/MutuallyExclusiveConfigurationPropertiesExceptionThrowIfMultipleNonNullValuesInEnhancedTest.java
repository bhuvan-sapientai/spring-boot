//package org.springframework.boot.context.properties.source;
//
//import org.springframework.boot.context.properties.source.MutuallyExclusiveConfigurationPropertiesException;
//
//import org.springframework.boot.context.properties.source.*;
//
//import java.util.Collection;
//import java.util.Set;
//import java.util.function.Consumer;
//import java.util.function.*;
//
//import org.springframework.boot.context.properties.source.MutuallyExclusiveConfigurationPropertiesException;
//
//import java.util.*;
//import java.util.LinkedHashSet;
//import java.util.stream.Collectors;
//
//import org.springframework.util.Assert;
//
//import java.util.Set;
//import java.util.function.Consumer;
//import java.util.Collection;
//import java.util.Map;
//import java.util.LinkedHashMap;
//
//import static org.hamcrest.Matchers.*;
//import static org.hamcrest.core.IsInstanceOf.*;
//import static org.hamcrest.MatcherAssert.*;
//import static org.mockito.Mockito.*;
//import static org.mockito.ArgumentMatchers.*;
//import static org.mockito.Mockito.any;
//import static org.mockito.Mockito.eq;
//
//import org.hamcrest.Matchers;
//import org.hamcrest.core.IsInstanceOf;
//import org.hamcrest.MatcherAssert;
//import org.mockito.Mockito;
//import org.mockito.ArgumentMatchers;
//import org.mockito.InjectMocks;
//import org.mockito.stubbing.Answer;
//import org.mockito.MockedStatic;
//import org.mockito.MockitoAnnotations;
//import org.mockito.Mock;
//
//import java.util.*;
//import java.util.stream.*;
//import java.io.*;
//import java.net.*;
//import java.beans.*;
//
//import javax.net.*;
//import javax.annotation.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Timeout;
//
//public class MutuallyExclusiveConfigurationPropertiesExceptionThrowIfMultipleNonNullValuesInEnhancedTest {
//
//	@Test
//	public void testThrowIfMultipleNonNullValuesIn_WithSingleNonNullValue_ShouldNotThrowException() {
//		Consumer<Map<String, Object>> entries = Mockito.mock(Consumer.class);
//		Map<String, Object> map = new LinkedHashMap<>();
//		map.put("key1", "value1");
//		Mockito.doAnswer(invocation -> {
//			Consumer<Map<String, Object>> consumer = invocation.getArgument(0);
//			consumer.accept(map);
//			return null;
//		}).when(entries).accept(Mockito.anyMap());
//		Executable executable = () -> MutuallyExclusiveConfigurationPropertiesException.throwIfMultipleNonNullValuesIn(entries);
//		assertDoesNotThrow(executable);
//	}
//
//	@Test
//	public void testThrowIfMultipleNonNullValuesIn_WithMultipleNonNullValues_ShouldThrowException() {
//		Consumer<Map<String, Object>> entries = Mockito.mock(Consumer.class);
//		Map<String, Object> map = new LinkedHashMap<>();
//		map.put("key1", "value1");
//		map.put("key2", "value2");
//		Mockito.doAnswer(invocation -> {
//			Consumer<Map<String, Object>> consumer = invocation.getArgument(0);
//			consumer.accept(map);
//			return null;
//		}).when(entries).accept(Mockito.anyMap());
//		Executable executable = () -> MutuallyExclusiveConfigurationPropertiesException.throwIfMultipleNonNullValuesIn(entries);
//		assertThrows(MutuallyExclusiveConfigurationPropertiesException.class, executable);
//	}
//
//	@Test
//	public void testThrowIfMultipleNonNullValuesIn_WithAllNullValues_ShouldNotThrowException() {
//		Consumer<Map<String, Object>> entries = Mockito.mock(Consumer.class);
//		Map<String, Object> map = new LinkedHashMap<>();
//		map.put("key1", null);
//		map.put("key2", null);
//		Mockito.doAnswer(invocation -> {
//			Consumer<Map<String, Object>> consumer = invocation.getArgument(0);
//			consumer.accept(map);
//			return null;
//		}).when(entries).accept(Mockito.anyMap());
//		Executable executable = () -> MutuallyExclusiveConfigurationPropertiesException.throwIfMultipleNonNullValuesIn(entries);
//		assertDoesNotThrow(executable);
//	}
//
//	@Test
//	public void testThrowIfMultipleNonNullValuesIn_WithNoValues_ShouldNotThrowException() {
//		Consumer<Map<String, Object>> entries = Mockito.mock(Consumer.class);
//		Map<String, Object> map = new LinkedHashMap<>();
//		Mockito.doAnswer(invocation -> {
//			Consumer<Map<String, Object>> consumer = invocation.getArgument(0);
//			consumer.accept(map);
//			return null;
//		}).when(entries).accept(Mockito.anyMap());
//		Executable executable = () -> MutuallyExclusiveConfigurationPropertiesException.throwIfMultipleNonNullValuesIn(entries);
//		assertDoesNotThrow(executable);
//	}
//}
