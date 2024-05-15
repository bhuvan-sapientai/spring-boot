package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import ch.qos.logback.core.model.processor.ModelHandlerException;
import org.mockito.stubbing.Answer;
import ch.qos.logback.core.joran.action.ActionUtil;
import org.springframework.core.env.Environment;
import ch.qos.logback.core.model.ModelUtil;
import ch.qos.logback.core.util.OptionHelper;
import org.mockito.MockedStatic;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;
import ch.qos.logback.core.Context;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringPropertyModelHandlerSapientGeneratedTest {

    private final Environment environmentMock = mock(Environment.class, "environment");

    private final Context contextMock = mock(Context.class);

    private final ModelInterpretationContext modelInterpretationContextMock = mock(ModelInterpretationContext.class);

    private final SpringPropertyModel propertyModelMock = mock(SpringPropertyModel.class);

    //Sapient generated method id: ${handleWhenThisEnvironmentIsNull}, hash: 290EFDA1307AA72A9079BFD2F93A7708
    @Test()
    void handleWhenThisEnvironmentIsNull() throws ModelHandlerException {
        /* Branches:
         * (OptionHelper.isNullOrEmpty(propertyModel.getName())) : false
         * (OptionHelper.isNullOrEmpty(source)) : true
         * (this.environment == null) : true  #  inside getValue method
         */
         //Arrange Statement(s)
        try (MockedStatic<ModelUtil> modelUtil = mockStatic(ModelUtil.class);
            MockedStatic<OptionHelper> optionHelper = mockStatic(OptionHelper.class)) {
            doReturn("A").when(propertyModelMock).getScope();
            doReturn("return_of_getDefaultValue1").when(propertyModelMock).getDefaultValue();
            doReturn("D").when(propertyModelMock).getSource();
            doReturn("B", "return_of_getName1").when(propertyModelMock).getName();
            optionHelper.when(() -> OptionHelper.isNullOrEmpty("B")).thenReturn(false);
            optionHelper.when(() -> OptionHelper.isNullOrEmpty("D")).thenReturn(true);
            modelUtil.when(() -> ModelUtil.setProperty(modelInterpretationContextMock, "return_of_getName1", "return_of_getDefaultValue1", ActionUtil.Scope.LOCAL)).thenAnswer((Answer<Void>) invocation -> null);
            SpringPropertyModelHandler target = spy(new SpringPropertyModelHandler(contextMock, (Environment) null));
            doNothing().when(target).addError("The \"name\" and \"source\" attributes of <springProperty> must be set");
            doNothing().when(target).addWarn("No Spring Environment available to resolve D");
            //Act Statement(s)
            target.handle(modelInterpretationContextMock, propertyModelMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(propertyModelMock).getScope();
                verify(propertyModelMock).getDefaultValue();
                verify(propertyModelMock).getSource();
                verify(propertyModelMock, times(2)).getName();
                optionHelper.verify(() -> OptionHelper.isNullOrEmpty("B"), atLeast(1));
                optionHelper.verify(() -> OptionHelper.isNullOrEmpty("D"), atLeast(1));
                modelUtil.verify(() -> ModelUtil.setProperty(modelInterpretationContextMock, "return_of_getName1", "return_of_getDefaultValue1", ActionUtil.Scope.LOCAL), atLeast(1));
                verify(target).addError("The \"name\" and \"source\" attributes of <springProperty> must be set");
                verify(target).addWarn("No Spring Environment available to resolve D");
            });
        }
    }

    //Sapient generated method id: ${handleWhenOptionHelperIsNullOrEmptySourceAndThisEnvironmentIsNotNull}, hash: 6C9FA4C24D39F20E6A0CC50C338F7ABF
    @Test()
    void handleWhenOptionHelperIsNullOrEmptySourceAndThisEnvironmentIsNotNull() throws ModelHandlerException {
        /* Branches:
         * (OptionHelper.isNullOrEmpty(propertyModel.getName())) : false
         * (OptionHelper.isNullOrEmpty(source)) : true
         * (this.environment == null) : false  #  inside getValue method
         */
         //Arrange Statement(s)
        try (MockedStatic<ModelUtil> modelUtil = mockStatic(ModelUtil.class);
            MockedStatic<OptionHelper> optionHelper = mockStatic(OptionHelper.class)) {
            doReturn("A").when(propertyModelMock).getScope();
            doReturn("return_of_getDefaultValue1").when(propertyModelMock).getDefaultValue();
            doReturn("D").when(propertyModelMock).getSource();
            doReturn("B", "return_of_getName1").when(propertyModelMock).getName();
            optionHelper.when(() -> OptionHelper.isNullOrEmpty("B")).thenReturn(false);
            optionHelper.when(() -> OptionHelper.isNullOrEmpty("D")).thenReturn(true);
            modelUtil.when(() -> ModelUtil.setProperty(modelInterpretationContextMock, "return_of_getName1", "return_of_getProperty1", ActionUtil.Scope.LOCAL)).thenAnswer((Answer<Void>) invocation -> null);
            SpringPropertyModelHandler target = spy(new SpringPropertyModelHandler(contextMock, environmentMock));
            doNothing().when(target).addError("The \"name\" and \"source\" attributes of <springProperty> must be set");
            doReturn("return_of_getProperty1").when(environmentMock).getProperty("D", "return_of_getDefaultValue1");
            //Act Statement(s)
            target.handle(modelInterpretationContextMock, propertyModelMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(propertyModelMock).getScope();
                verify(propertyModelMock).getDefaultValue();
                verify(propertyModelMock).getSource();
                verify(propertyModelMock, times(2)).getName();
                optionHelper.verify(() -> OptionHelper.isNullOrEmpty("B"), atLeast(1));
                optionHelper.verify(() -> OptionHelper.isNullOrEmpty("D"), atLeast(1));
                modelUtil.verify(() -> ModelUtil.setProperty(modelInterpretationContextMock, "return_of_getName1", "return_of_getProperty1", ActionUtil.Scope.LOCAL), atLeast(1));
                verify(target).addError("The \"name\" and \"source\" attributes of <springProperty> must be set");
                verify(environmentMock).getProperty("D", "return_of_getDefaultValue1");
            });
        }
    }
}
