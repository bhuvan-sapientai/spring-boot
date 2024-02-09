package org.springframework.boot.web.servlet.view;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.util.Assert;

import com.samskivert.mustache.Mustache;

import java.util.Map;
import java.util.HashMap;

import org.mockito.MockedStatic;

import org.springframework.beans.BeanUtils;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MustacheViewResolverSapientGeneratedTest {

	private final Mustache.Compiler mustacheCompilerMock = mock(Mustache.Compiler.class);

	//Sapient generated method id: ${f8d03cba-1c26-3980-bbdf-18812cd44497}
	@Test()
	void requiredViewClassTest() {
		//Arrange Statement(s)
		MustacheViewResolver target = new MustacheViewResolver(mustacheCompilerMock);
		//Act Statement(s)
		Class<?> result = target.requiredViewClass();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(MustacheView.class)));
	}

	//Sapient generated method id: ${5858c9cc-d550-3722-98cf-1e8f92b43cfb}
	@Disabled()
	@Test()
	void buildViewTest() throws Exception {
		//Arrange Statement(s)
		MustacheView mustacheViewMock = mock(MustacheView.class);
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class)) {
			beanUtils.when(() -> BeanUtils.instantiateClass(MustacheView.class)).thenReturn(mustacheViewMock);
			doNothing().when(mustacheViewMock).setUrl("A");
			Map<String, Object> stringObjectMap = new HashMap<>();
			doNothing().when(mustacheViewMock).setAttributesMap(eq(stringObjectMap));
			doNothing().when(mustacheViewMock).setContentType("B");
			doNothing().when(mustacheViewMock).setRequestContextAttribute("C");
			doNothing().when(mustacheViewMock).setExposePathVariables(false);
			String[] stringArray = new String[] {};
			doNothing().when(mustacheViewMock).setExposedContextBeanNames(stringArray);
			doNothing().when(mustacheViewMock).setExposeRequestAttributes(false);
			doNothing().when(mustacheViewMock).setAllowRequestOverride(false);
			doNothing().when(mustacheViewMock).setExposeSessionAttributes(false);
			doNothing().when(mustacheViewMock).setAllowSessionOverride(false);
			doNothing().when(mustacheViewMock).setExposeSpringMacroHelpers(true);
			doNothing().when(mustacheViewMock).setCompiler(mustacheCompilerMock);
			doNothing().when(mustacheViewMock).setCharset("D");
			MustacheViewResolver target = new MustacheViewResolver(mustacheCompilerMock);
			target.setCharset("D");
			target.setExposePathVariables(false);
			target.setExposedContextBeanNames(stringArray);
			target.setRequestContextAttribute("C");
			target.setContentType("B");
			//Act Statement(s)
			AbstractUrlBasedView result = target.buildView("A");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(mustacheViewMock));
				beanUtils.verify(() -> BeanUtils.instantiateClass(MustacheView.class), atLeast(1));
				verify(mustacheViewMock).setUrl("A");
				verify(mustacheViewMock).setAttributesMap(eq(stringObjectMap));
				verify(mustacheViewMock).setContentType("B");
				verify(mustacheViewMock).setRequestContextAttribute("C");
				verify(mustacheViewMock).setExposePathVariables(false);
				verify(mustacheViewMock).setExposedContextBeanNames(stringArray);
				verify(mustacheViewMock).setExposeRequestAttributes(false);
				verify(mustacheViewMock).setAllowRequestOverride(false);
				verify(mustacheViewMock).setExposeSessionAttributes(false);
				verify(mustacheViewMock).setAllowSessionOverride(false);
				verify(mustacheViewMock).setExposeSpringMacroHelpers(true);
				verify(mustacheViewMock).setCompiler(mustacheCompilerMock);
				verify(mustacheViewMock).setCharset("D");
			});
		}
	}

	//Sapient generated method id: ${f1a0db2e-678d-3d0c-ae28-7098d6655055}
	@Disabled()
	@Test()
	void instantiateViewWhenGetViewClassEqualsMustacheView() {
		/* Branches:
		 * (getViewClass() == MustacheView.class) : true
		 */
		//Arrange Statement(s)
		MustacheViewResolver target = new MustacheViewResolver(mustacheCompilerMock);
		//Act Statement(s)
		AbstractUrlBasedView result = target.instantiateView();
		MustacheView mustacheView = new MustacheView();
		//Assert statement(s)
		//TODO: Please implement equals method in MustacheView for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, equalTo(mustacheView)));
	}
}
