package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.function.Consumer;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MutuallyExclusiveConfigurationPropertiesExceptionSapientGeneratedTest {

	private final Consumer entriesMock = mock(Consumer.class, "value1");

	//Sapient generated method id: ${3108182a-2878-331d-9fc8-447f5994d0fc}, hash: FF5EAA0740BA8F8B918A5706748F1480
	@Test()
	void throwIfMultipleNonNullValuesInWhenConfiguredNamesSizeNotGreaterThan1() {
		/* Branches:
		 * (configuredNames.size() > 1) : false
		 */
		//Arrange Statement(s)
		Map<String, Object> stringObjectMap = new LinkedHashMap<>();
		doNothing().when(entriesMock).accept(eq(stringObjectMap));
		//Act Statement(s)
		MutuallyExclusiveConfigurationPropertiesException.throwIfMultipleNonNullValuesIn(entriesMock);
		//Assert statement(s)
		assertAll("result", () -> verify(entriesMock).accept(eq(stringObjectMap)));
	}

	//Sapient generated method id: ${88052858-048f-33ac-8a82-ddf8cad9aead}, hash: 0BF17F33351D2FE684AD7889EF579CEE
	@Disabled()
	@Test()
	void throwIfMultipleNonNullValuesInWhenCollectionIsNotNullThrowsMutuallyExclusiveConfigurationPropertiesException() {
		/* Branches:
		 * (configuredNames.size() > 1) : true
		 * (collection != null) : true  #  inside asSet method
		 */
		//Arrange Statement(s)
		Map<String, Object> stringObjectMap = new LinkedHashMap<>();
		doNothing().when(entriesMock).accept(eq(stringObjectMap));
		//Act Statement(s)
		final MutuallyExclusiveConfigurationPropertiesException result = assertThrows(MutuallyExclusiveConfigurationPropertiesException.class, () -> {
			MutuallyExclusiveConfigurationPropertiesException.throwIfMultipleNonNullValuesIn(entriesMock);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(entriesMock).accept(eq(stringObjectMap));
		});
	}

	//Sapient generated method id: ${3dd09632-79d9-3e4f-846b-f9cf2a2ec546}, hash: 5A60C527CC8BF301ACBBC4BDA954B3F2
	@Disabled()
	@Test()
	void throwIfMultipleNonNullValuesInWhenCollectionIsNullThrowsMutuallyExclusiveConfigurationPropertiesException() {
		/* Branches:
		 * (configuredNames.size() > 1) : true
		 * (collection != null) : false  #  inside asSet method
		 */
		//Arrange Statement(s)
		Map<String, Object> stringObjectMap = new LinkedHashMap<>();
		doNothing().when(entriesMock).accept(eq(stringObjectMap));
		//Act Statement(s)
		final MutuallyExclusiveConfigurationPropertiesException result = assertThrows(MutuallyExclusiveConfigurationPropertiesException.class, () -> {
			MutuallyExclusiveConfigurationPropertiesException.throwIfMultipleNonNullValuesIn(entriesMock);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(entriesMock).accept(eq(stringObjectMap));
		});
	}
}
