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

	//Sapient generated method id: ${81b9d7fb-6b85-3488-a42a-929763a95266}
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

	//Sapient generated method id: ${b2ca3fc2-f033-3a47-b322-3a9b693e9772}
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

	//Sapient generated method id: ${1660a61c-fd9b-37f0-bc8c-abd860570587}
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
