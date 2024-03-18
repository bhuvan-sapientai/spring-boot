package org.springframework.boot.logging.log4j2;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.logging.CorrelationIdFormatter;

import org.mockito.MockedStatic;

import org.springframework.util.ObjectUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CorrelationIdConverterSapientGeneratedTest {

	//Sapient generated method id: ${467b6340-c3c4-3b4d-9634-1af4ea4ad206}, hash: DAABC334D16AD8238905A717AAB0F4E0
	@Test()
	void newInstanceWhenObjectUtilsNotIsEmptyOptions() {
		/* Branches:
		 * (!ObjectUtils.isEmpty(options)) : true
		 */
		//Arrange Statement(s)
		CorrelationIdFormatter correlationIdFormatterMock = mock(CorrelationIdFormatter.class, "newInstance_correlationIdFormatter1");
		try (MockedStatic<CorrelationIdFormatter> correlationIdFormatter = mockStatic(CorrelationIdFormatter.class);
			 MockedStatic<ObjectUtils> objectUtils = mockStatic(ObjectUtils.class)) {
			String[] stringArray = new String[] { "optionsItem1" };
			objectUtils.when(() -> ObjectUtils.isEmpty(stringArray)).thenReturn(false);
			correlationIdFormatter.when(() -> CorrelationIdFormatter.of("optionsItem1")).thenReturn(correlationIdFormatterMock);
			//Act Statement(s)
			CorrelationIdConverter result = CorrelationIdConverter.newInstance(stringArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				objectUtils.verify(() -> ObjectUtils.isEmpty(stringArray), atLeast(1));
				correlationIdFormatter.verify(() -> CorrelationIdFormatter.of("optionsItem1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a8a1e575-3d31-3bd6-8c1c-f6c75c2a3fca}, hash: 9D10CA62224938F7210C68FF4B2E28A4
	@Test()
	void newInstanceWhenObjectUtilsIsEmptyOptions() {
		/* Branches:
		 * (!ObjectUtils.isEmpty(options)) : false
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] {};

		//Act Statement(s)
		CorrelationIdConverter result = CorrelationIdConverter.newInstance(stringArray);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
