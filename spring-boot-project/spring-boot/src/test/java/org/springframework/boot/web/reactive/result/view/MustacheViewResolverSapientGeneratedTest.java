package org.springframework.boot.web.reactive.result.view;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.web.reactive.result.view.AbstractUrlBasedView;
import org.springframework.http.MediaType;
import org.springframework.util.Assert;

import com.samskivert.mustache.Mustache;
import org.mockito.MockedStatic;

import java.nio.charset.Charset;
import java.util.ArrayList;

import org.springframework.beans.BeanUtils;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
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

	//Sapient generated method id: ${48ada91a-064c-3a8d-9857-a45b057b39df}
	@Disabled()
	@Test()
	void createViewTest() {
		//Arrange Statement(s)
		MustacheView mustacheViewMock = mock(MustacheView.class);
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class)) {
			beanUtils.when(() -> BeanUtils.instantiateClass(MustacheView.class)).thenReturn(mustacheViewMock);
			MediaType mediaType = MediaType.parseMediaType("text/html;charset=UTF-8");
			List<MediaType> mediaTypeList = new ArrayList<>(4);
			mediaTypeList.add(mediaType);
			doNothing().when(mustacheViewMock).setSupportedMediaTypes(mediaTypeList);
			doNothing().when(mustacheViewMock).setDefaultCharset((Charset) any());
			doNothing().when(mustacheViewMock).setUrl("A");
			doNothing().when(mustacheViewMock).setRequestContextAttribute("B");
			doNothing().when(mustacheViewMock).setCompiler(mustacheCompilerMock);
			doNothing().when(mustacheViewMock).setCharset("C");
			MustacheViewResolver target = new MustacheViewResolver(mustacheCompilerMock);
			target.setCharset("C");
			target.setRequestContextAttribute("B");
			Charset charset = Charset.defaultCharset();
			target.setDefaultCharset(charset);
			//Act Statement(s)
			AbstractUrlBasedView result = target.createView("A");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(mustacheViewMock));
				beanUtils.verify(() -> BeanUtils.instantiateClass(MustacheView.class), atLeast(1));
				verify(mustacheViewMock).setSupportedMediaTypes(mediaTypeList);
				verify(mustacheViewMock).setDefaultCharset((Charset) any());
				verify(mustacheViewMock).setUrl("A");
				verify(mustacheViewMock).setRequestContextAttribute("B");
				verify(mustacheViewMock).setCompiler(mustacheCompilerMock);
				verify(mustacheViewMock).setCharset("C");
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
