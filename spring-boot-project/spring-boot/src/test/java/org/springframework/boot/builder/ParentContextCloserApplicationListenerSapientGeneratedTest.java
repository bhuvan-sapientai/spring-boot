package org.springframework.boot.builder;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ParentContextCloserApplicationListenerSapientGeneratedTest {

    private final ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);

    private final ParentContextApplicationContextInitializer.ParentContextAvailableEvent eventMock = mock(ParentContextApplicationContextInitializer.ParentContextAvailableEvent.class);

    //Sapient generated method id: ${onApplicationEventWhenChildEqualsThisContextThrowsNullPointerException}, hash: 3D2D0F3913D36186A9B4775AB759B9D6
    @Test()
    void onApplicationEventWhenChildEqualsThisContextThrowsNullPointerException() {
        /* Branches:
         * (child == this.context) : true  #  inside maybeInstallListenerInParent method
         */
         //Arrange Statement(s)
        doReturn(null).when(eventMock).getApplicationContext();
        ParentContextCloserApplicationListener target = new ParentContextCloserApplicationListener();
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            target.onApplicationEvent(eventMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(eventMock).getApplicationContext();
        });
    }

    //Sapient generated method id: ${onApplicationEventWhenChildNotEqualsThisContext}, hash: BAC24996380263F641AB406F7956B777
    @Test()
    void onApplicationEventWhenChildNotEqualsThisContext() {
        /* Branches:
         * (child == this.context) : false  #  inside maybeInstallListenerInParent method
         */
         //Arrange Statement(s)
        doReturn(configurableApplicationContextMock).when(eventMock).getApplicationContext();
        ParentContextCloserApplicationListener target = new ParentContextCloserApplicationListener();
        
        //Act Statement(s)
        target.onApplicationEvent(eventMock);
        
        //Assert statement(s)
        assertAll("result", () -> verify(eventMock).getApplicationContext());
    }

    //Sapient generated method id: ${createContextCloserListenerTest}, hash: 724BD05ADB275D64A29AF8C5A96ADC63
    @Test()
    void createContextCloserListenerTest() {
        //Arrange Statement(s)
        ParentContextCloserApplicationListener target = new ParentContextCloserApplicationListener();
        
        //Act Statement(s)
        ParentContextCloserApplicationListener.ContextCloserListener result = target.createContextCloserListener(configurableApplicationContextMock);
        ParentContextCloserApplicationListener.ContextCloserListener parentContextCloserApplicationListenerContextCloserListener = new ParentContextCloserApplicationListener.ContextCloserListener(configurableApplicationContextMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(parentContextCloserApplicationListenerContextCloserListener)));
    }
}
