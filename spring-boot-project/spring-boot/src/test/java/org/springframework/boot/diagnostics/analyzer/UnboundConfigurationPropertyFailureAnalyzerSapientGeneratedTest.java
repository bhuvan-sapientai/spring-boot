package org.springframework.boot.diagnostics.analyzer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.BindException;
import org.springframework.boot.diagnostics.FailureAnalysis;

import java.util.Set;

import org.springframework.boot.context.properties.bind.UnboundConfigurationPropertiesException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UnboundConfigurationPropertyFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${4a365458-5fe0-3a89-afee-917b3977ac44}, hash: C4442BC4E7065D3A861704EC5DD535ED
	@Test()
	void analyze2WhenTypeNotIsInstanceFailureThrowsNullPointerException() {
		/* Branches:
		 * (failure != null) : true  #  inside findCause method
		 * (type.isInstance(failure)) : false  #  inside findCause method
		 */
		//Arrange Statement(s)
		UnboundConfigurationPropertyFailureAnalyzer target = new UnboundConfigurationPropertyFailureAnalyzer();
		Throwable throwable = new Throwable();
		UnboundConfigurationPropertiesException unboundConfigurationPropertiesExceptionMock = mock(UnboundConfigurationPropertiesException.class);
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			target.analyze(throwable, unboundConfigurationPropertiesExceptionMock);
		});

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${7f6bbcb3-974f-343f-9bb9-8f49d6ecf1d0}, hash: 8CF96E4A1F7DF78CFA983AF858D087C3
	@Test()
	void analyze2WhenPropertyIsNotNull() {
		/* Branches:
		 * (failure != null) : true  #  inside findCause method
		 * (type.isInstance(failure)) : true  #  inside findCause method
		 * (for-each(exception.getUnboundProperties())) : true  #  inside analyzeUnboundConfigurationPropertiesException method
		 * (property != null) : true  #  inside buildDescription method
		 */
		//Arrange Statement(s)
		BindException causeMock = mock(BindException.class, "BindException");
		Bindable<?> bindableMock = mock(Bindable.class, "analyzeUnboundConfigurationPropertiesException_bindable1");
		doReturn(bindableMock).when(causeMock).getTarget();
		UnboundConfigurationPropertyFailureAnalyzer target = new UnboundConfigurationPropertyFailureAnalyzer();
		Set set = new HashSet<>();
		UnboundConfigurationPropertiesException unboundConfigurationPropertiesException = new UnboundConfigurationPropertiesException(set);

		//Act Statement(s)
		FailureAnalysis result = target.analyze((Throwable) causeMock, unboundConfigurationPropertiesException);

		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(causeMock, atLeast(1)).getTarget();
		});
	}
}
