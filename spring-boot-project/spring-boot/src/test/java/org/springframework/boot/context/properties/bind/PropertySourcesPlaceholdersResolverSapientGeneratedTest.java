package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.util.PropertyPlaceholderHelper;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PropertySourcesPlaceholdersResolverSapientGeneratedTest {

	private final PropertyPlaceholderHelper helperMock = mock(PropertyPlaceholderHelper.class, "helper");

	//Sapient generated method id: ${92f654c1-59d0-3f5f-8724-669bbd7eff5a}
	@Disabled()
	@Test()
	void resolvePlaceholdersWhenValueInstanceOfString() {
		/* Branches:
		 * (value instanceof String string) : true
		 */
		//Arrange Statement(s)
		PropertySourcesPlaceholdersResolver target = spy(new PropertySourcesPlaceholdersResolver((Iterable) null, helperMock));
		doReturn("return_of_resolvePlaceholder1").when(target).resolvePlaceholder("placeholder1");
		doReturn("return_of_replacePlaceholders1").when(helperMock).replacePlaceholders(eq("value1"), (PropertyPlaceholderHelper.PlaceholderResolver) any());
		//Act Statement(s)
		Object result = target.resolvePlaceholders("value1");
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("return_of_replacePlaceholders1"));
			verify(target).resolvePlaceholder("placeholder1");
			verify(helperMock).replacePlaceholders(eq("value1"), (PropertyPlaceholderHelper.PlaceholderResolver) any());
		});
	}

	//Sapient generated method id: ${2e755de7-a01c-3580-9542-15932e99692f}
	@Test()
	void resolvePlaceholdersWhenValueNotInstanceOfString() {
		/* Branches:
		 * (value instanceof String string) : false
		 */
		//Arrange Statement(s)
		PropertySourcesPlaceholdersResolver target = new PropertySourcesPlaceholdersResolver((Iterable) null, helperMock);
		Object object = new Object();
		//Act Statement(s)
		Object result = target.resolvePlaceholders(object);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(object)));
	}

	//Sapient generated method id: ${f55b244d-d45e-37b8-b852-86b4d940632d}
	@Test()
	void resolvePlaceholderWhenValueIsNotNull() {
		/* Branches:
		 * (this.sources != null) : true
		 * (for-each(this.sources)) : true
		 * (value != null) : true
		 */
		//Arrange Statement(s)
		PropertySourcesPlaceholdersResolver target = new PropertySourcesPlaceholdersResolver((Iterable) null, helperMock);
		//Act Statement(s)
		String result = target.resolvePlaceholder("placeholder1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${2e40d513-19be-3dae-9d54-18bd4c132e8b}
	@Test()
	void resolvePlaceholderWhenValueIsNull() {
		/* Branches:
		 * (this.sources != null) : true
		 * (for-each(this.sources)) : true
		 * (value != null) : false
		 */
		//Arrange Statement(s)
		PropertySourcesPlaceholdersResolver target = new PropertySourcesPlaceholdersResolver((Iterable) null, helperMock);
		//Act Statement(s)
		String result = target.resolvePlaceholder("placeholder1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}
}
