package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import ch.qos.logback.classic.model.RootLoggerModel;
import ch.qos.logback.core.model.AppenderModel;
import ch.qos.logback.classic.model.LoggerModel;
import ch.qos.logback.core.model.Model;

import java.util.ArrayList;

import ch.qos.logback.core.joran.sanity.Pair;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringProfileIfNestedWithinSecondPhaseElementSanityCheckerSapientGeneratedTest {

	private final Model modelMock = mock(Model.class);

	//Sapient generated method id: ${6c84febe-8b56-311e-adba-431d20da30a0}
	@Test()
	void checkWhenModelIsNull() {
		/* Branches:
		 * (model == null) : true
		 */
		//Arrange Statement(s)
		SpringProfileIfNestedWithinSecondPhaseElementSanityChecker target = new SpringProfileIfNestedWithinSecondPhaseElementSanityChecker();
		Model model = null;

		//Act Statement(s)
		target.check(model);
	}

	//Sapient generated method id: ${2f9f2706-22fc-345c-baef-739eba6dd0e0}
	@Test()
	void checkWhenNestedPairsNotIsEmptyThrowsNullPointerException() {
		/* Branches:
		 * (model == null) : false
		 * (!nestedPairs.isEmpty()) : true
		 */
		//Arrange Statement(s)
		SpringProfileIfNestedWithinSecondPhaseElementSanityChecker target = spy(new SpringProfileIfNestedWithinSecondPhaseElementSanityChecker());
		List<Model> modelList = new ArrayList<>();
		doNothing().when(target).deepFindAllModelsOfType(AppenderModel.class, modelList, modelMock);
		doNothing().when(target).deepFindAllModelsOfType(LoggerModel.class, modelList, modelMock);
		doNothing().when(target).deepFindAllModelsOfType(RootLoggerModel.class, modelList, modelMock);
		Pair<Model, Model> pairMock = mock(Pair.class);
		List<Pair<Model, Model>> pairModelModelList = new ArrayList<>();
		pairModelModelList.add(pairMock);
		doReturn(pairModelModelList).when(target).deepFindNestedSubModelsOfType(SpringProfileModel.class, modelList);
		doNothing().when(target).addWarn("<springProfile> elements cannot be nested within an <appender>, <logger> or <root> element");
		//Act Statement(s)
		final NullPointerException result = assertThrows(NullPointerException.class, () -> {
			target.check(modelMock);
		});

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(target).deepFindAllModelsOfType(AppenderModel.class, modelList, modelMock);
			verify(target).deepFindAllModelsOfType(LoggerModel.class, modelList, modelMock);
			verify(target).deepFindAllModelsOfType(RootLoggerModel.class, modelList, modelMock);
			verify(target).deepFindNestedSubModelsOfType(SpringProfileModel.class, modelList);
			verify(target).addWarn("<springProfile> elements cannot be nested within an <appender>, <logger> or <root> element");
		});
	}

	//Sapient generated method id: ${628736b7-f3d5-36a0-90bd-f5966e6749a7}
	@Test()
	void checkWhenNestedPairsIsEmpty() {
		/* Branches:
		 * (model == null) : false
		 * (!nestedPairs.isEmpty()) : false
		 */
		//Arrange Statement(s)
		SpringProfileIfNestedWithinSecondPhaseElementSanityChecker target = spy(new SpringProfileIfNestedWithinSecondPhaseElementSanityChecker());
		List<Model> modelList = new ArrayList<>();
		doNothing().when(target).deepFindAllModelsOfType(AppenderModel.class, modelList, modelMock);
		doNothing().when(target).deepFindAllModelsOfType(LoggerModel.class, modelList, modelMock);
		doNothing().when(target).deepFindAllModelsOfType(RootLoggerModel.class, modelList, modelMock);
		List<Pair<Model, Model>> pairModelModelList = new ArrayList<>();
		doReturn(pairModelModelList).when(target).deepFindNestedSubModelsOfType(SpringProfileModel.class, modelList);

		//Act Statement(s)
		target.check(modelMock);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(target).deepFindAllModelsOfType(AppenderModel.class, modelList, modelMock);
			verify(target).deepFindAllModelsOfType(LoggerModel.class, modelList, modelMock);
			verify(target).deepFindAllModelsOfType(RootLoggerModel.class, modelList, modelMock);
			verify(target).deepFindNestedSubModelsOfType(SpringProfileModel.class, modelList);
		});
	}
}
