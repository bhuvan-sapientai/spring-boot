package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.BeansException;
import org.springframework.format.Formatter;
import org.springframework.format.Parser;
import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.util.Assert;

import java.util.HashSet;

import org.springframework.format.support.DefaultFormattingConversionService;

import java.util.HashMap;

import org.springframework.util.StringValueResolver;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConverterFactory;

import org.mockito.stubbing.Answer;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.core.convert.converter.ConverterRegistry;
import org.springframework.format.Printer;
import org.springframework.core.convert.support.DefaultConversionService;

import java.util.Map;

import org.springframework.format.FormatterRegistry;

import java.lang.annotation.Annotation;

import org.springframework.core.convert.ConversionService;

import java.util.Set;

import org.springframework.core.GenericTypeResolver;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ApplicationConversionServiceSapientGeneratedTest {

	private final AnnotationFormatterFactory<Annotation> annotationFormatterFactoryMock = mock(AnnotationFormatterFactory.class);

	private final ListableBeanFactory beanFactoryMock = mock(ListableBeanFactory.class);

	private final Converter<?, ?> converterMock = mock(Converter.class);

	private final Formatter<?> formatterMock = mock(Formatter.class);

	private final GenericConverter genericConverterMock = mock(GenericConverter.class);

	private final Parser<?> parserMock = mock(Parser.class);

	private final Printer<?> printerMock = mock(Printer.class);

	private final FormatterRegistry registryMock = mock(FormatterRegistry.class);

	private final TypeDescriptor sourceTypeMock = mock(TypeDescriptor.class);

	private final StringValueResolver stringValueResolverMock = mock(StringValueResolver.class);

	private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

	//Sapient generated method id: ${ef281f25-2280-370b-aed7-95fdaa56f48e}
	@Test()
	void addPrinterWhenThisNotUnmodifiable() {
		/* Branches:
		 * (this.unmodifiable) : false  #  inside assertModifiable method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
    MockedStatic<GenericTypeResolver> genericTypeResolver = mockStatic(GenericTypeResolver.class);
    MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
    MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class)) {
    genericTypeResolver.when(() -> GenericTypeResolver.resolveTypeArgument(Printer.class, Printer.class)).thenReturn(null);
    _assert.when(() -> Assert.notNull(eq((Class) null), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ApplicationConversionService target = spy(new ApplicationConversionService(stringValueResolverMock));
    defaultConversionService.when(() -> DefaultConversionService.addDefaultConverters(target)).thenAnswer((Answer<Void>) invocation -> null);
    defaultFormattingConversionService.when(() -> DefaultFormattingConversionService.addDefaultFormatters(target)).thenAnswer((Answer<Void>) invocation -> null);
    doNothing().when(target).addConverter((GenericConverter) any());
    //Act Statement(s)
    target.addPrinter(printerMock);
    //Assert statement(s)
    assertAll("result", () -> {
        genericTypeResolver.verify(() -> GenericTypeResolver.resolveTypeArgument(Printer.class, Printer.class), atLeast(1));
        _assert.verify(() -> Assert.notNull(eq((Class) null), (Supplier) any()));
        defaultConversionService.verify(() -> DefaultConversionService.addDefaultConverters(target), atLeast(1));
        defaultFormattingConversionService.verify(() -> DefaultFormattingConversionService.addDefaultFormatters(target), atLeast(1));
        verify(target).addConverter((GenericConverter) any());
    });
}*/
	}

	//Sapient generated method id: ${6e65794f-158e-3a14-bbbd-ba9a14a23b80}
	@Test()
	void addParserWhenThisNotUnmodifiable() {
		/* Branches:
		 * (this.unmodifiable) : false  #  inside assertModifiable method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
    MockedStatic<GenericTypeResolver> genericTypeResolver = mockStatic(GenericTypeResolver.class);
    MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
    MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class)) {
    genericTypeResolver.when(() -> GenericTypeResolver.resolveTypeArgument(Parser.class, Parser.class)).thenReturn(null);
    _assert.when(() -> Assert.notNull(eq((Class) null), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ApplicationConversionService target = spy(new ApplicationConversionService(stringValueResolverMock));
    defaultConversionService.when(() -> DefaultConversionService.addDefaultConverters(target)).thenAnswer((Answer<Void>) invocation -> null);
    defaultFormattingConversionService.when(() -> DefaultFormattingConversionService.addDefaultFormatters(target)).thenAnswer((Answer<Void>) invocation -> null);
    doNothing().when(target).addConverter((GenericConverter) any());
    //Act Statement(s)
    target.addParser(parserMock);
    //Assert statement(s)
    assertAll("result", () -> {
        genericTypeResolver.verify(() -> GenericTypeResolver.resolveTypeArgument(Parser.class, Parser.class), atLeast(1));
        _assert.verify(() -> Assert.notNull(eq((Class) null), (Supplier) any()));
        defaultConversionService.verify(() -> DefaultConversionService.addDefaultConverters(target), atLeast(1));
        defaultFormattingConversionService.verify(() -> DefaultFormattingConversionService.addDefaultFormatters(target), atLeast(1));
        verify(target).addConverter((GenericConverter) any());
    });
}*/
	}

	//Sapient generated method id: ${b95d9966-c5cb-35ad-9204-3f44c86fbb9c}
	@Test()
	void addFormatterWhenThisNotUnmodifiable() {
		/* Branches:
		 * (this.unmodifiable) : false  #  inside assertModifiable method
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
    MockedStatic<GenericTypeResolver> genericTypeResolver = mockStatic(GenericTypeResolver.class);
    MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
    MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class)) {
    genericTypeResolver.when(() -> GenericTypeResolver.resolveTypeArgument(Formatter.class, Formatter.class)).thenReturn(null);
    _assert.when(() -> Assert.notNull(eq((Class) null), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    ApplicationConversionService target = spy(new ApplicationConversionService(stringValueResolverMock));
    defaultConversionService.when(() -> DefaultConversionService.addDefaultConverters(target)).thenAnswer((Answer<Void>) invocation -> null);
    defaultFormattingConversionService.when(() -> DefaultFormattingConversionService.addDefaultFormatters(target)).thenAnswer((Answer<Void>) invocation -> null);
    doNothing().when(target).addFormatterForFieldType((Class) null, formatterMock);
    //Act Statement(s)
    target.addFormatter(formatterMock);
    //Assert statement(s)
    assertAll("result", () -> {
        genericTypeResolver.verify(() -> GenericTypeResolver.resolveTypeArgument(Formatter.class, Formatter.class), atLeast(1));
        _assert.verify(() -> Assert.notNull(eq((Class) null), (Supplier) any()));
        defaultConversionService.verify(() -> DefaultConversionService.addDefaultConverters(target), atLeast(1));
        defaultFormattingConversionService.verify(() -> DefaultFormattingConversionService.addDefaultFormatters(target), atLeast(1));
        verify(target).addFormatterForFieldType((Class) null, formatterMock);
    });
}*/
	}

	//Sapient generated method id: ${567449d5-2e6d-3512-a917-83d9d1d57540}
	@Test()
	void addFormatterForFieldTypeWhenThisNotUnmodifiable() {
		/* Branches:
		 * (this.unmodifiable) : false  #  inside assertModifiable method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
    MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class)) {
    ApplicationConversionService target = spy(new ApplicationConversionService(stringValueResolverMock));
    defaultConversionService.when(() -> DefaultConversionService.addDefaultConverters(target)).thenAnswer((Answer<Void>) invocation -> null);
    defaultFormattingConversionService.when(() -> DefaultFormattingConversionService.addDefaultFormatters(target)).thenAnswer((Answer<Void>) invocation -> null);
    doNothing().when(target).addConverter((GenericConverter) any());
    doNothing().when(target).addConverter((GenericConverter) any());
    //Act Statement(s)
    target.addFormatterForFieldType(Object.class, formatterMock);
    //Assert statement(s)
    assertAll("result", () -> {
        defaultConversionService.verify(() -> DefaultConversionService.addDefaultConverters(target), atLeast(1));
        defaultFormattingConversionService.verify(() -> DefaultFormattingConversionService.addDefaultFormatters(target), atLeast(1));
        verify(target, atLeast(2)).addConverter((GenericConverter) any());
    });
}*/
	}

	//Sapient generated method id: ${55276897-f922-3817-bfaf-676f6ad65c23}
	@Test()
	void addConverterWhenThisNotUnmodifiable() {
		/* Branches:
		 * (this.unmodifiable) : false  #  inside assertModifiable method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
    MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class)) {
    ApplicationConversionService target = new ApplicationConversionService(stringValueResolverMock);
    defaultConversionService.when(() -> DefaultConversionService.addDefaultConverters(target)).thenAnswer((Answer<Void>) invocation -> null);
    defaultFormattingConversionService.when(() -> DefaultFormattingConversionService.addDefaultFormatters(target)).thenAnswer((Answer<Void>) invocation -> null);
    //Act Statement(s)
    target.addConverter(converterMock);
    //Assert statement(s)
    assertAll("result", () -> {
        defaultConversionService.verify(() -> DefaultConversionService.addDefaultConverters(target), atLeast(1));
        defaultFormattingConversionService.verify(() -> DefaultFormattingConversionService.addDefaultFormatters(target), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${21192281-56fb-3c02-86da-fb6765e3e294}
	@Test()
	void addFormatterForFieldType1WhenThisNotUnmodifiable() {
		/* Branches:
		 * (this.unmodifiable) : false  #  inside assertModifiable method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
    MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class)) {
    ApplicationConversionService target = spy(new ApplicationConversionService(stringValueResolverMock));
    defaultConversionService.when(() -> DefaultConversionService.addDefaultConverters(target)).thenAnswer((Answer<Void>) invocation -> null);
    defaultFormattingConversionService.when(() -> DefaultFormattingConversionService.addDefaultFormatters(target)).thenAnswer((Answer<Void>) invocation -> null);
    doNothing().when(target).addConverter((GenericConverter) any());
    doNothing().when(target).addConverter((GenericConverter) any());
    //Act Statement(s)
    target.addFormatterForFieldType(Object.class, printerMock, parserMock);
    //Assert statement(s)
    assertAll("result", () -> {
        defaultConversionService.verify(() -> DefaultConversionService.addDefaultConverters(target), atLeast(1));
        defaultFormattingConversionService.verify(() -> DefaultFormattingConversionService.addDefaultFormatters(target), atLeast(1));
        verify(target, atLeast(2)).addConverter((GenericConverter) any());
    });
}*/
	}

	//Sapient generated method id: ${f9993464-7974-3764-afe1-82de70d07b50}
	@Test()
	void addFormatterForFieldAnnotationWhenThisNotUnmodifiable() {
		/* Branches:
		 * (this.unmodifiable) : false  #  inside assertModifiable method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<GenericTypeResolver> genericTypeResolver = mockStatic(GenericTypeResolver.class);
    MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
    MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class)) {
    Set<Class<?>> anySet = new HashSet<>();
    anySet.add(Object.class);
    doReturn(anySet).when(annotationFormatterFactoryMock).getFieldTypes();
    genericTypeResolver.when(() -> GenericTypeResolver.resolveTypeArgument(AnnotationFormatterFactory.class, AnnotationFormatterFactory.class)).thenReturn(java.lang.annotation.Annotation.class);
    ApplicationConversionService target = spy(new ApplicationConversionService(stringValueResolverMock));
    defaultConversionService.when(() -> DefaultConversionService.addDefaultConverters(target)).thenAnswer((Answer<Void>) invocation -> null);
    defaultFormattingConversionService.when(() -> DefaultFormattingConversionService.addDefaultFormatters(target)).thenAnswer((Answer<Void>) invocation -> null);
    doNothing().when(target).addConverter((GenericConverter) any());
    doNothing().when(target).addConverter((GenericConverter) any());
    //Act Statement(s)
    target.addFormatterForFieldAnnotation(annotationFormatterFactoryMock);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(annotationFormatterFactoryMock).getFieldTypes();
        genericTypeResolver.verify(() -> GenericTypeResolver.resolveTypeArgument(AnnotationFormatterFactory.class, AnnotationFormatterFactory.class), atLeast(1));
        defaultConversionService.verify(() -> DefaultConversionService.addDefaultConverters(target), atLeast(1));
        defaultFormattingConversionService.verify(() -> DefaultFormattingConversionService.addDefaultFormatters(target), atLeast(1));
        verify(target, atLeast(2)).addConverter((GenericConverter) any());
    });
}*/
	}

	//Sapient generated method id: ${814dc26c-aec7-321d-be26-0f6ea17e008b}
	@Test()
	void addFormatterForFieldAnnotationWhenThisNotUnmodifiableThrowsIllegalArgumentException() {
		/* Branches:
		 * (this.unmodifiable) : false  #  inside assertModifiable method
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<GenericTypeResolver> genericTypeResolver = mockStatic(GenericTypeResolver.class);
    MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
    MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class)) {
    genericTypeResolver.when(() -> GenericTypeResolver.resolveTypeArgument(AnnotationFormatterFactory.class, AnnotationFormatterFactory.class)).thenReturn(null);
    ApplicationConversionService target = new ApplicationConversionService(stringValueResolverMock);
    defaultConversionService.when(() -> DefaultConversionService.addDefaultConverters(target)).thenAnswer((Answer<Void>) invocation -> null);
    defaultFormattingConversionService.when(() -> DefaultFormattingConversionService.addDefaultFormatters(target)).thenAnswer((Answer<Void>) invocation -> null);
    //Act Statement(s)
    final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
        target.addFormatterForFieldAnnotation(annotationFormatterFactoryMock);
    });
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to extract parameterized Annotation type argument from AnnotationFormatterFactory [org.springframework.format.AnnotationFormatterFactory]; does the factory parameterize the <A extends Annotation> generic type?");
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        genericTypeResolver.verify(() -> GenericTypeResolver.resolveTypeArgument(AnnotationFormatterFactory.class, AnnotationFormatterFactory.class), atLeast(1));
        defaultConversionService.verify(() -> DefaultConversionService.addDefaultConverters(target), atLeast(1));
        defaultFormattingConversionService.verify(() -> DefaultFormattingConversionService.addDefaultFormatters(target), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${0a638b01-6442-34bf-9570-7e3f6e0c1f9c}
	@Test()
	void addConverter1WhenThisNotUnmodifiable() {
		/* Branches:
		 * (this.unmodifiable) : false  #  inside assertModifiable method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//Converter<Object, Object> converterMock = mock(Converter.class);
        /*try (MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
    MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class)) {
    ApplicationConversionService target = new ApplicationConversionService(stringValueResolverMock);
    defaultConversionService.when(() -> DefaultConversionService.addDefaultConverters(target)).thenAnswer((Answer<Void>) invocation -> null);
    defaultFormattingConversionService.when(() -> DefaultFormattingConversionService.addDefaultFormatters(target)).thenAnswer((Answer<Void>) invocation -> null);
    //Act Statement(s)
    target.addConverter(Object.class, Object.class, converterMock);
    //Assert statement(s)
    assertAll("result", () -> {
        defaultConversionService.verify(() -> DefaultConversionService.addDefaultConverters(target), atLeast(1));
        defaultFormattingConversionService.verify(() -> DefaultFormattingConversionService.addDefaultFormatters(target), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${6c5175f0-2b95-3728-8bde-31a58d21eba9}
	@Test()
	void addConverter2WhenThisNotUnmodifiable() {
		/* Branches:
		 * (this.unmodifiable) : false  #  inside assertModifiable method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
    MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class)) {
    ApplicationConversionService target = new ApplicationConversionService(stringValueResolverMock);
    defaultConversionService.when(() -> DefaultConversionService.addDefaultConverters(target)).thenAnswer((Answer<Void>) invocation -> null);
    defaultFormattingConversionService.when(() -> DefaultFormattingConversionService.addDefaultFormatters(target)).thenAnswer((Answer<Void>) invocation -> null);
    //Act Statement(s)
    target.addConverter(genericConverterMock);
    //Assert statement(s)
    assertAll("result", () -> {
        defaultConversionService.verify(() -> DefaultConversionService.addDefaultConverters(target), atLeast(1));
        defaultFormattingConversionService.verify(() -> DefaultFormattingConversionService.addDefaultFormatters(target), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${8eeea4da-2ca3-3f84-bf7d-0acf130ce1ba}
	@Test()
	void addConverterFactoryWhenThisNotUnmodifiable() {
		/* Branches:
		 * (this.unmodifiable) : false  #  inside assertModifiable method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ConverterFactory<?, ?> converterFactoryMock = mock(ConverterFactory.class);
        /*try (MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
    MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class)) {
    ApplicationConversionService target = new ApplicationConversionService(stringValueResolverMock);
    defaultConversionService.when(() -> DefaultConversionService.addDefaultConverters(target)).thenAnswer((Answer<Void>) invocation -> null);
    defaultFormattingConversionService.when(() -> DefaultFormattingConversionService.addDefaultFormatters(target)).thenAnswer((Answer<Void>) invocation -> null);
    //Act Statement(s)
    target.addConverterFactory(converterFactoryMock);
    //Assert statement(s)
    assertAll("result", () -> {
        defaultConversionService.verify(() -> DefaultConversionService.addDefaultConverters(target), atLeast(1));
        defaultFormattingConversionService.verify(() -> DefaultFormattingConversionService.addDefaultFormatters(target), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${91dded4d-2edb-3843-a298-128442799ca8}
	@Test()
	void removeConvertibleWhenThisNotUnmodifiable() {
		/* Branches:
		 * (this.unmodifiable) : false  #  inside assertModifiable method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
			 MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class)) {
			ApplicationConversionService target = new ApplicationConversionService(stringValueResolverMock);
			defaultConversionService.when(() -> DefaultConversionService.addDefaultConverters(target)).thenAnswer((Answer<Void>) invocation -> null);
			defaultFormattingConversionService.when(() -> DefaultFormattingConversionService.addDefaultFormatters(target)).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			target.removeConvertible(Object.class, Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				defaultConversionService.verify(() -> DefaultConversionService.addDefaultConverters(target), atLeast(1));
				defaultFormattingConversionService.verify(() -> DefaultFormattingConversionService.addDefaultFormatters(target), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${33c8ac70-a3f4-3dc1-bcb0-420004e41834}
	@Test()
	void isConvertViaObjectSourceTypeWhenConverterIsNullAndPairsIsNull() {
		/* Branches:
		 * (converter != null) : false
		 * (pairs != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
    MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class)) {
    doReturn(false).when(sourceTypeMock).isAssignableTo(typeDescriptorMock);
    ApplicationConversionService target = new ApplicationConversionService(stringValueResolverMock);
    defaultConversionService.when(() -> DefaultConversionService.addDefaultConverters(target)).thenAnswer((Answer<Void>) invocation -> null);
    defaultFormattingConversionService.when(() -> DefaultFormattingConversionService.addDefaultFormatters(target)).thenAnswer((Answer<Void>) invocation -> null);
    //Act Statement(s)
    boolean result = target.isConvertViaObjectSourceType(sourceTypeMock, typeDescriptorMock);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo(Boolean.FALSE));
        verify(sourceTypeMock).isAssignableTo(typeDescriptorMock);
        defaultConversionService.verify(() -> DefaultConversionService.addDefaultConverters(target), atLeast(1));
        defaultFormattingConversionService.verify(() -> DefaultFormattingConversionService.addDefaultFormatters(target), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${9233cd17-fa9d-393b-9a47-5116863f0596}
	@Test()
	void isConvertViaObjectSourceTypeWhenObjectEqualsPairGetSourceType() {
		/* Branches:
		 * (converter != null) : true
		 * (pairs != null) : true
		 * (for-each(pairs)) : true
		 * (Object.class.equals(pair.getSourceType())) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: converter
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
    MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class)) {
    doReturn(true).when(sourceTypeMock).isAssignableTo(typeDescriptorMock);
    ApplicationConversionService target = new ApplicationConversionService(stringValueResolverMock);
    defaultConversionService.when(() -> DefaultConversionService.addDefaultConverters(target)).thenAnswer((Answer<Void>) invocation -> null);
    defaultFormattingConversionService.when(() -> DefaultFormattingConversionService.addDefaultFormatters(target)).thenAnswer((Answer<Void>) invocation -> null);
    //Act Statement(s)
    boolean result = target.isConvertViaObjectSourceType(sourceTypeMock, typeDescriptorMock);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo(Boolean.TRUE));
        verify(sourceTypeMock).isAssignableTo(typeDescriptorMock);
        defaultConversionService.verify(() -> DefaultConversionService.addDefaultConverters(target), atLeast(1));
        defaultFormattingConversionService.verify(() -> DefaultFormattingConversionService.addDefaultFormatters(target), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${dd9d2f13-9f83-32de-9bdd-a9e0b5bc2c7f}
	@Test()
	void isConvertViaObjectSourceTypeWhenObjectNotEqualsPairGetSourceType() {
		/* Branches:
		 * (converter != null) : true
		 * (pairs != null) : true
		 * (for-each(pairs)) : true
		 * (Object.class.equals(pair.getSourceType())) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: converter
		 *  Suggestions:
		 *  You can change the initialization of above variables and make it injectable or
		 *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
    MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class)) {
    doReturn(true).when(sourceTypeMock).isAssignableTo(typeDescriptorMock);
    ApplicationConversionService target = new ApplicationConversionService(stringValueResolverMock);
    defaultConversionService.when(() -> DefaultConversionService.addDefaultConverters(target)).thenAnswer((Answer<Void>) invocation -> null);
    defaultFormattingConversionService.when(() -> DefaultFormattingConversionService.addDefaultFormatters(target)).thenAnswer((Answer<Void>) invocation -> null);
    //Act Statement(s)
    boolean result = target.isConvertViaObjectSourceType(sourceTypeMock, typeDescriptorMock);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo(Boolean.FALSE));
        verify(sourceTypeMock).isAssignableTo(typeDescriptorMock);
        defaultConversionService.verify(() -> DefaultConversionService.addDefaultConverters(target), atLeast(1));
        defaultFormattingConversionService.verify(() -> DefaultFormattingConversionService.addDefaultFormatters(target), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${5649aa5d-2660-339b-9226-0848cbabf011}
	@Test()
	void getSharedInstanceWhenDefaultBranch() {
		/* Branches:
		 * (sharedInstance == null) : true
		 * (sharedInstance == null) : true
		 * (branch expression (line 69)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<ApplicationConversionService> applicationConversionService = mockStatic(ApplicationConversionService.class, CALLS_REAL_METHODS)) {
    applicationConversionService.when(() -> ApplicationConversionService.configure(target)).thenAnswer((Answer<Void>) invocation -> null);
    //Act Statement(s)
    ConversionService result = ApplicationConversionService.getSharedInstance();
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        applicationConversionService.verify(() -> ApplicationConversionService.configure(target), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${f56d41b4-cf00-3592-bb68-9a89456c3c5f}
	@Test()
	void configureTest() {
		//Arrange Statement(s)
		FormatterRegistry formatterRegistryMock = mock(FormatterRegistry.class);
		try (MockedStatic<ApplicationConversionService> applicationConversionService = mockStatic(ApplicationConversionService.class, CALLS_REAL_METHODS);
			 MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
			 MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class)) {
			defaultConversionService.when(() -> DefaultConversionService.addDefaultConverters(formatterRegistryMock)).thenAnswer((Answer<Void>) invocation -> null);
			defaultFormattingConversionService.when(() -> DefaultFormattingConversionService.addDefaultFormatters(formatterRegistryMock)).thenAnswer((Answer<Void>) invocation -> null);
			applicationConversionService.when(() -> ApplicationConversionService.addApplicationFormatters(formatterRegistryMock)).thenAnswer((Answer<Void>) invocation -> null);
			applicationConversionService.when(() -> ApplicationConversionService.addApplicationConverters(formatterRegistryMock)).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			ApplicationConversionService.configure(formatterRegistryMock);
			//Assert statement(s)
			assertAll("result", () -> {
				defaultConversionService.verify(() -> DefaultConversionService.addDefaultConverters(formatterRegistryMock), atLeast(1));
				defaultFormattingConversionService.verify(() -> DefaultFormattingConversionService.addDefaultFormatters(formatterRegistryMock), atLeast(1));
				applicationConversionService.verify(() -> ApplicationConversionService.addApplicationFormatters(formatterRegistryMock), atLeast(1));
				applicationConversionService.verify(() -> ApplicationConversionService.addApplicationConverters(formatterRegistryMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${136b3119-a902-361d-84da-611596227824}
	@Test()
	void addApplicationConvertersWhenRegistryNotInstanceOfConversionService() {
		/* Branches:
		 * (registry instanceof ConversionService conversionService) : false
		 */
		//Arrange Statement(s)
		//ConverterRegistry registryMock = mock(ConverterRegistry.class);
        /*try (MockedStatic<ApplicationConversionService> applicationConversionService = mockStatic(ApplicationConversionService.class, CALLS_REAL_METHODS)) {
    doNothing().when(registryMock).addConverter((StringToDurationConverter) any());
    doNothing().when(registryMock).addConverter((DurationToStringConverter) any());
    doNothing().when(registryMock).addConverter((NumberToDurationConverter) any());
    doNothing().when(registryMock).addConverter((DurationToNumberConverter) any());
    doNothing().when(registryMock).addConverter((StringToPeriodConverter) any());
    doNothing().when(registryMock).addConverter((PeriodToStringConverter) any());
    doNothing().when(registryMock).addConverter((NumberToPeriodConverter) any());
    doNothing().when(registryMock).addConverter((StringToDataSizeConverter) any());
    doNothing().when(registryMock).addConverter((NumberToDataSizeConverter) any());
    doNothing().when(registryMock).addConverter((StringToFileConverter) any());
    doNothing().when(registryMock).addConverter((InputStreamSourceToByteArrayConverter) any());
    doNothing().when(registryMock).addConverterFactory((LenientStringToEnumConverterFactory) any());
    doNothing().when(registryMock).addConverterFactory((LenientBooleanToEnumConverterFactory) any());
    applicationConversionService.when(() -> ApplicationConversionService.addDelimitedStringConverters(registryMock)).thenAnswer((Answer<Void>) invocation -> null);
    //Act Statement(s)
    ApplicationConversionService.addApplicationConverters(registryMock);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(registryMock, atLeast(1)).addConverter((StringToDurationConverter) any());
        verify(registryMock, atLeast(1)).addConverter((DurationToStringConverter) any());
        verify(registryMock, atLeast(1)).addConverter((NumberToDurationConverter) any());
        verify(registryMock, atLeast(1)).addConverter((DurationToNumberConverter) any());
        verify(registryMock, atLeast(1)).addConverter((StringToPeriodConverter) any());
        verify(registryMock, atLeast(1)).addConverter((PeriodToStringConverter) any());
        verify(registryMock, atLeast(1)).addConverter((NumberToPeriodConverter) any());
        verify(registryMock, atLeast(1)).addConverter((StringToDataSizeConverter) any());
        verify(registryMock, atLeast(1)).addConverter((NumberToDataSizeConverter) any());
        verify(registryMock, atLeast(1)).addConverter((StringToFileConverter) any());
        verify(registryMock, atLeast(1)).addConverter((InputStreamSourceToByteArrayConverter) any());
        verify(registryMock, atLeast(1)).addConverterFactory((LenientStringToEnumConverterFactory) any());
        verify(registryMock, atLeast(1)).addConverterFactory((LenientBooleanToEnumConverterFactory) any());
        applicationConversionService.verify(() -> ApplicationConversionService.addDelimitedStringConverters(registryMock), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${81074e95-dd11-3689-95e2-4934d32bd7df}
	@Disabled()
	@Test()
	void addDelimitedStringConvertersTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConverterRegistry registryMock = mock(ConverterRegistry.class);
		doNothing().when(registryMock).addConverter((ArrayToDelimitedStringConverter) any());
		doNothing().when(registryMock).addConverter((CollectionToDelimitedStringConverter) any());
		doNothing().when(registryMock).addConverter((DelimitedStringToArrayConverter) any());
		doNothing().when(registryMock).addConverter((DelimitedStringToCollectionConverter) any());
		//Act Statement(s)
		ApplicationConversionService.addDelimitedStringConverters(registryMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(registryMock).addConverter((ArrayToDelimitedStringConverter) any());
			verify(registryMock).addConverter((CollectionToDelimitedStringConverter) any());
			verify(registryMock).addConverter((DelimitedStringToArrayConverter) any());
			verify(registryMock).addConverter((DelimitedStringToCollectionConverter) any());
		});
	}

	//Sapient generated method id: ${15c6bfba-f4ff-39d4-b29e-667fd899651a}
	@Test()
	void addApplicationFormattersTest() {
		//Arrange Statement(s)
		//doNothing().when(registryMock).addFormatter((CharArrayFormatter) any());
		//doNothing().when(registryMock).addFormatter((InetAddressFormatter) any());
		//doNothing().when(registryMock).addFormatter((IsoOffsetFormatter) any());
		//Act Statement(s)
		//ApplicationConversionService.addApplicationFormatters(registryMock);
		//Assert statement(s)
        /*assertAll("result", () -> {
    verify(registryMock).addFormatter((CharArrayFormatter) any());
    verify(registryMock).addFormatter((InetAddressFormatter) any());
    verify(registryMock).addFormatter((IsoOffsetFormatter) any());
});*/
	}

	//Sapient generated method id: ${5e289418-edf5-38b7-816c-6003ba17598a}
	@Disabled()
	@Test()
	void addBeansWhenBeanInstanceOfGenericConverter() throws BeansException {
		/* Branches:
		 * (for-each(beans)) : true
		 * (bean instanceof GenericConverter) : true
		 */
		//Arrange Statement(s)
		doNothing().when(registryMock).addConverter(genericConverterMock);
		Map<String, Object> stringObjectMap = new HashMap<>();
		doReturn(stringObjectMap).when(beanFactoryMock).getBeansOfType(GenericConverter.class);
		Map<String, Object> stringObjectMap2 = new HashMap<>();
		doReturn(stringObjectMap2).when(beanFactoryMock).getBeansOfType(Converter.class);
		Map<String, Object> stringObjectMap3 = new HashMap<>();
		doReturn(stringObjectMap3).when(beanFactoryMock).getBeansOfType(Printer.class);
		Map<String, Object> stringObjectMap4 = new HashMap<>();
		doReturn(stringObjectMap4).when(beanFactoryMock).getBeansOfType(Parser.class);
		//Act Statement(s)
		ApplicationConversionService.addBeans(registryMock, beanFactoryMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(registryMock).addConverter(genericConverterMock);
			verify(beanFactoryMock).getBeansOfType(GenericConverter.class);
			verify(beanFactoryMock).getBeansOfType(Converter.class);
			verify(beanFactoryMock).getBeansOfType(Printer.class);
			verify(beanFactoryMock).getBeansOfType(Parser.class);
		});
	}

	//Sapient generated method id: ${0f3002aa-d453-3684-89d1-1de3308cf8b8}
	@Test()
	void addBeansWhenBeanInstanceOfConverter() throws BeansException {
		/* Branches:
		 * (for-each(beans)) : true
		 * (bean instanceof GenericConverter) : false
		 * (bean instanceof Converter) : true
		 */
		//Arrange Statement(s)
		//doNothing().when(registryMock).addConverter(converterMock);
		//Map<String, Object> stringObjectMap = new HashMap<>();
		//doReturn(stringObjectMap).when(beanFactoryMock).getBeansOfType(GenericConverter.class);
		//Map<String, Object> stringObjectMap2 = new HashMap<>();
		//doReturn(stringObjectMap2).when(beanFactoryMock).getBeansOfType(Converter.class);
		//Map<String, Object> stringObjectMap3 = new HashMap<>();
		//doReturn(stringObjectMap3).when(beanFactoryMock).getBeansOfType(Printer.class);
		//Map<String, Object> stringObjectMap4 = new HashMap<>();
		//doReturn(stringObjectMap4).when(beanFactoryMock).getBeansOfType(Parser.class);
		//Act Statement(s)
		//ApplicationConversionService.addBeans(registryMock, beanFactoryMock);
		//Assert statement(s)
        /*assertAll("result", () -> {
    verify(registryMock).addConverter(converterMock);
    verify(beanFactoryMock).getBeansOfType(GenericConverter.class);
    verify(beanFactoryMock).getBeansOfType(Converter.class);
    verify(beanFactoryMock).getBeansOfType(Printer.class);
    verify(beanFactoryMock).getBeansOfType(Parser.class);
});*/
	}

	//Sapient generated method id: ${d5a64b88-5173-3df1-bd3e-463f234e0552}
	@Disabled()
	@Test()
	void addBeansWhenBeanInstanceOfFormatter() throws BeansException {
		/* Branches:
		 * (for-each(beans)) : true
		 * (bean instanceof GenericConverter) : false
		 * (bean instanceof Converter) : false
		 * (bean instanceof Formatter) : true
		 */
		//Arrange Statement(s)
		Formatter formatterMock = mock(Formatter.class);
		doNothing().when(registryMock).addFormatter(formatterMock);
		Map<String, Object> stringObjectMap = new HashMap<>();
		doReturn(stringObjectMap).when(beanFactoryMock).getBeansOfType(GenericConverter.class);
		Map<String, Object> stringObjectMap2 = new HashMap<>();
		doReturn(stringObjectMap2).when(beanFactoryMock).getBeansOfType(Converter.class);
		Map<String, Object> stringObjectMap3 = new HashMap<>();
		doReturn(stringObjectMap3).when(beanFactoryMock).getBeansOfType(Printer.class);
		Map<String, Object> stringObjectMap4 = new HashMap<>();
		doReturn(stringObjectMap4).when(beanFactoryMock).getBeansOfType(Parser.class);
		//Act Statement(s)
		ApplicationConversionService.addBeans(registryMock, beanFactoryMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(registryMock).addFormatter(formatterMock);
			verify(beanFactoryMock).getBeansOfType(GenericConverter.class);
			verify(beanFactoryMock).getBeansOfType(Converter.class);
			verify(beanFactoryMock).getBeansOfType(Printer.class);
			verify(beanFactoryMock).getBeansOfType(Parser.class);
		});
	}

	//Sapient generated method id: ${c583a71d-17ac-3e92-8aa0-9162d40dc71e}
	@Disabled()
	@Test()
	void addBeansWhenBeanInstanceOfPrinter() throws BeansException {
		/* Branches:
		 * (for-each(beans)) : true
		 * (bean instanceof GenericConverter) : false
		 * (bean instanceof Converter) : false
		 * (bean instanceof Formatter) : false
		 * (bean instanceof Printer) : true
		 */
		//Arrange Statement(s)
		Printer printerMock = mock(Printer.class);
		doNothing().when(registryMock).addPrinter(printerMock);
		Map<String, Object> stringObjectMap = new HashMap<>();
		doReturn(stringObjectMap).when(beanFactoryMock).getBeansOfType(GenericConverter.class);
		Map<String, Object> stringObjectMap2 = new HashMap<>();
		doReturn(stringObjectMap2).when(beanFactoryMock).getBeansOfType(Converter.class);
		Map<String, Object> stringObjectMap3 = new HashMap<>();
		doReturn(stringObjectMap3).when(beanFactoryMock).getBeansOfType(Printer.class);
		Map<String, Object> stringObjectMap4 = new HashMap<>();
		doReturn(stringObjectMap4).when(beanFactoryMock).getBeansOfType(Parser.class);
		//Act Statement(s)
		ApplicationConversionService.addBeans(registryMock, beanFactoryMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(registryMock).addPrinter(printerMock);
			verify(beanFactoryMock).getBeansOfType(GenericConverter.class);
			verify(beanFactoryMock).getBeansOfType(Converter.class);
			verify(beanFactoryMock).getBeansOfType(Printer.class);
			verify(beanFactoryMock).getBeansOfType(Parser.class);
		});
	}

	//Sapient generated method id: ${39a0fabd-0983-33dd-ab2c-461497b79d47}
	@Disabled()
	@Test()
	void addBeansWhenBeanInstanceOfParser() throws BeansException {
		/* Branches:
		 * (for-each(beans)) : true
		 * (bean instanceof GenericConverter) : false
		 * (bean instanceof Converter) : false
		 * (bean instanceof Formatter) : false
		 * (bean instanceof Printer) : false
		 * (bean instanceof Parser) : true
		 */
		//Arrange Statement(s)
		Parser parserMock = mock(Parser.class);
		doNothing().when(registryMock).addParser(parserMock);
		Map<String, Object> stringObjectMap = new HashMap<>();
		doReturn(stringObjectMap).when(beanFactoryMock).getBeansOfType(GenericConverter.class);
		Map<String, Object> stringObjectMap2 = new HashMap<>();
		doReturn(stringObjectMap2).when(beanFactoryMock).getBeansOfType(Converter.class);
		Map<String, Object> stringObjectMap3 = new HashMap<>();
		doReturn(stringObjectMap3).when(beanFactoryMock).getBeansOfType(Printer.class);
		Map<String, Object> stringObjectMap4 = new HashMap<>();
		doReturn(stringObjectMap4).when(beanFactoryMock).getBeansOfType(Parser.class);
		//Act Statement(s)
		ApplicationConversionService.addBeans(registryMock, beanFactoryMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(registryMock).addParser(parserMock);
			verify(beanFactoryMock).getBeansOfType(GenericConverter.class);
			verify(beanFactoryMock).getBeansOfType(Converter.class);
			verify(beanFactoryMock).getBeansOfType(Printer.class);
			verify(beanFactoryMock).getBeansOfType(Parser.class);
		});
	}
}
