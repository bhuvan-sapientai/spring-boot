package org.springframework.boot.web.reactive.result.view;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.springframework.web.reactive.result.view.AbstractUrlBasedView;
import org.springframework.http.MediaType;
import org.springframework.util.Assert;
import com.samskivert.mustache.Mustache;
import org.springframework.web.reactive.result.view.ViewResolverSupport;
import org.mockito.MockedStatic;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.springframework.beans.BeanUtils;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MustacheViewResolverSapientGeneratedTest {

    private final Mustache.Compiler mustacheCompilerMock = mock(Mustache.Compiler.class);

    //Sapient generated method id: ${requiredViewClassTest}, hash: 913AA89659E8456DFCCB9C748F0B4053
    @Test()
    void requiredViewClassTest() {
        //Arrange Statement(s)
        MustacheViewResolver target = new MustacheViewResolver(mustacheCompilerMock);
        //Act Statement(s)
        Class<?> result = target.requiredViewClass();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(MustacheView.class)));
    }

    //Sapient generated method id: ${createViewTest}, hash: 3D7330577E76FFCFDD52393C3F5186F6
    @Disabled()
    @Test()
    void createViewTest() {
        //Arrange Statement(s)
        MustacheView mustacheViewMock = mock(MustacheView.class);
        try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class)) {
            beanUtils.when(() -> BeanUtils.instantiateClass(MustacheView.class)).thenReturn(mustacheViewMock);
            MediaType mediaType = ViewResolverSupport.DEFAULT_CONTENT_TYPE;
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
                verify(mustacheViewMock, atLeast(1)).setSupportedMediaTypes(mediaTypeList);
                verify(mustacheViewMock).setDefaultCharset((Charset) any());
                verify(mustacheViewMock, atLeast(1)).setUrl("A");
                verify(mustacheViewMock, atLeast(1)).setRequestContextAttribute("B");
                verify(mustacheViewMock, atLeast(1)).setCompiler(mustacheCompilerMock);
                verify(mustacheViewMock, atLeast(1)).setCharset("C");
            });
        }
    }

    //Sapient generated method id: ${instantiateViewWhenGetViewClassEqualsMustacheView}, hash: 2CC560A4D52DAA1401FE5ED3FF602A26
    @Test()
    void instantiateViewWhenGetViewClassEqualsMustacheView() {
        /* Branches:
         * (getViewClass() == MustacheView.class) : true
         */
        //Arrange Statement(s)
        MustacheViewResolver target = new MustacheViewResolver(mustacheCompilerMock);
        //Act Statement(s)
        AbstractUrlBasedView result = target.instantiateView();
        //Assert statement(s)
        //TODO: Please implement equals method in MustacheView for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
