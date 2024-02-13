package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MutuallyExclusiveConfigurationPropertiesExceptionSapientGeneratedTest {

	//Sapient generated method id: ${3108182a-2878-331d-9fc8-447f5994d0fc}
	@Test()
	void throwIfMultipleNonNullValuesInWhenConfiguredNamesSizeNotGreaterThan1() {
		/* Branches:
		 * (configuredNames.size() > 1) : false
		 */
		//Arrange Statement(s)
		Consumer consumer = null;
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			MutuallyExclusiveConfigurationPropertiesException.throwIfMultipleNonNullValuesIn(consumer);
		});

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${88052858-048f-33ac-8a82-ddf8cad9aead}
	@Test()
	void throwIfMultipleNonNullValuesInWhenCollectionIsNotNullThrowsMutuallyExclusiveConfigurationPropertiesException() {
		/* Branches:
		 * (configuredNames.size() > 1) : true
		 * (collection != null) : true  #  inside asSet method
		 */
		//Arrange Statement(s)
		Consumer consumer = null;
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			MutuallyExclusiveConfigurationPropertiesException.throwIfMultipleNonNullValuesIn(consumer);
		});

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${3dd09632-79d9-3e4f-846b-f9cf2a2ec546}
	@Test()
	void throwIfMultipleNonNullValuesInWhenCollectionIsNullThrowsMutuallyExclusiveConfigurationPropertiesException() {
		/* Branches:
		 * (configuredNames.size() > 1) : true
		 * (collection != null) : false  #  inside asSet method
		 */
		//Arrange Statement(s)
		Consumer consumer = null;
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			MutuallyExclusiveConfigurationPropertiesException.throwIfMultipleNonNullValuesIn(consumer);
		});

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
