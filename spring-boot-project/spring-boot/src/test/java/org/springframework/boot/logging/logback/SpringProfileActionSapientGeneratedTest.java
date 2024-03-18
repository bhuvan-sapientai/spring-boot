package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import org.xml.sax.Attributes;
import ch.qos.logback.core.model.Model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringProfileActionSapientGeneratedTest {

	//Sapient generated method id: ${092b1823-6183-3e97-8b23-aa76d89aae9b}, hash: 2E1C4DDC88003F63C703F03CF7951485
	@Test()
	void buildCurrentModelTest() {
		//Arrange Statement(s)
		Attributes attributesMock = mock(Attributes.class);
		doReturn("return_of_getValue1").when(attributesMock).getValue("name");
		SpringProfileAction target = new SpringProfileAction();
		SaxEventInterpretationContext saxEventInterpretationContextMock = mock(SaxEventInterpretationContext.class);

		//Act Statement(s)
		Model result = target.buildCurrentModel(saxEventInterpretationContextMock, "name1", attributesMock);
		SpringProfileModel springProfileModel = new SpringProfileModel();
		springProfileModel.setName("return_of_getValue1");

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(springProfileModel));
			verify(attributesMock).getValue("name");
		});
	}
}
