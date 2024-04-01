package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import org.xml.sax.Attributes;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.SaxEventInterpreter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringPropertyActionSapientGeneratedTest {

	//Sapient generated method id: ${092b1823-6183-3e97-8b23-aa76d89aae9b}, hash: DD15C6D9D8B990B25F5B8E052BD171C9
	@Test()
	void buildCurrentModelTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Attributes attributesMock = mock(Attributes.class);
		doReturn("return_of_getValue1").when(attributesMock).getValue("name");
		doReturn("A").when(attributesMock).getValue("source");
		doReturn("B").when(attributesMock).getValue("scope");
		doReturn("C").when(attributesMock).getValue("defaultValue");
		SpringPropertyAction target = new SpringPropertyAction();
		Context contextMock = mock(Context.class);
		SaxEventInterpreter saxEventInterpreterMock = mock(SaxEventInterpreter.class);
		SaxEventInterpretationContext saxEventInterpretationContext = new SaxEventInterpretationContext(contextMock, saxEventInterpreterMock);
		//Act Statement(s)
		Model result = target.buildCurrentModel(saxEventInterpretationContext, "<value>", attributesMock);
		SpringPropertyModel springPropertyModel = new SpringPropertyModel();
		springPropertyModel.setName("return_of_getValue1");
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(springPropertyModel));
			verify(attributesMock).getValue("name");
			verify(attributesMock).getValue("source");
			verify(attributesMock).getValue("scope");
			verify(attributesMock).getValue("defaultValue");
		});
	}
}
