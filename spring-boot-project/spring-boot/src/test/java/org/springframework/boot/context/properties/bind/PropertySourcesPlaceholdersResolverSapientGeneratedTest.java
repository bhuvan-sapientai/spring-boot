package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.util.PropertyPlaceholderHelper;

import java.util.ArrayList;

import org.springframework.core.env.PropertySource;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PropertySourcesPlaceholdersResolverSapientGeneratedTest {

	private final PropertyPlaceholderHelper helperMock = mock(PropertyPlaceholderHelper.class, "helper");

	private final PropertySource sourceMock = mock(PropertySource.class);

	//Sapient generated method id: ${92f654c1-59d0-3f5f-8724-669bbd7eff5a}, hash: 3553ECA62E11EE70F6CB5554AD8A5FF3
	@Disabled()
	@Test()
	void resolvePlaceholdersWhenValueInstanceOfString() {
		/* Branches:
		 * (value instanceof String string) : true
		 */
		//Arrange Statement(s)
		Iterable<PropertySource<?>> iterable = new ArrayList<>();
		PropertySourcesPlaceholdersResolver target = spy(new PropertySourcesPlaceholdersResolver(iterable, helperMock));
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

	//Sapient generated method id: ${2e755de7-a01c-3580-9542-15932e99692f}, hash: 4BEB1D583A61175AFB2511AC9E726B90
	@Test()
	void resolvePlaceholdersWhenValueNotInstanceOfString() {
		/* Branches:
		 * (value instanceof String string) : false
		 */
		//Arrange Statement(s)
		Iterable<PropertySource<?>> iterable = new ArrayList<>();
		PropertySourcesPlaceholdersResolver target = new PropertySourcesPlaceholdersResolver(iterable, helperMock);
		Object object = new Object();
		//Act Statement(s)
		Object result = target.resolvePlaceholders(object);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(object)));
	}

	//Sapient generated method id: ${f55b244d-d45e-37b8-b852-86b4d940632d}, hash: B763E2790EECC3330223CED9222BBCB2
	@Test()
	void resolvePlaceholderWhenValueIsNotNull() {
		/* Branches:
		 * (this.sources != null) : true
		 * (for-each(this.sources)) : true
		 * (value != null) : true
		 */
		//Arrange Statement(s)
		//Object objectMock = mock(Object.class, "resolvePlaceholder_object2");
		//doReturn(objectMock).when(sourceMock).getProperty("placeholder1");
		//Iterable<PropertySource<?>> iterable = new ArrayList<>(List.of(sourceMock));
		//PropertySourcesPlaceholdersResolver target = new PropertySourcesPlaceholdersResolver(iterable, helperMock);
		//Act Statement(s)
		//String result = target.resolvePlaceholder("placeholder1");
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, equalTo("resolvePlaceholder_object2"));
    verify(sourceMock).getProperty("placeholder1");
});*/
	}

	//Sapient generated method id: ${2e40d513-19be-3dae-9d54-18bd4c132e8b}, hash: 4C067C81D5E722F874691589324C4D16
	@Test()
	void resolvePlaceholderWhenValueIsNull() {
		/* Branches:
		 * (this.sources != null) : true
		 * (for-each(this.sources)) : true
		 * (value != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//doReturn(null).when(sourceMock).getProperty("placeholder1");
		//Iterable<PropertySource<?>> iterable = new ArrayList<>(List.of(sourceMock));
		//PropertySourcesPlaceholdersResolver target = new PropertySourcesPlaceholdersResolver(iterable, helperMock);
		//Act Statement(s)
		//String result = target.resolvePlaceholder("placeholder1");
		//Assert statement(s)
        /*assertAll("result", () -> {
    assertThat(result, is(nullValue()));
    verify(sourceMock).getProperty("placeholder1");
});*/
	}
}
