package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.format.Formatter;
import org.springframework.format.Parser;
import org.springframework.core.convert.converter.ConverterRegistry;
import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.format.Printer;
import org.springframework.util.Assert;
import java.util.HashSet;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;
import java.util.Map;
import java.util.HashMap;
import org.springframework.util.StringValueResolver;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConverterFactory;
import org.mockito.stubbing.Answer;
import org.springframework.format.FormatterRegistry;
import java.lang.annotation.Annotation;
import org.springframework.core.convert.ConversionService;
import java.util.Set;
import org.springframework.core.GenericTypeResolver;
import java.util.function.Supplier;
import org.mockito.MockedStatic;
import org.springframework.format.AnnotationFormatterFactory;
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

    //Sapient generated method id: ${addPrinterWhenThisNotUnmodifiable}, hash: 6654D19A9619FC48C319388543885757
    @Disabled()
    @Test()
    void addPrinterWhenThisNotUnmodifiable() {
        /* Branches:
         * (this.unmodifiable) : false  #  inside assertModifiable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
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
        }
    }

    //Sapient generated method id: ${addParserWhenThisNotUnmodifiable}, hash: 957485D59DB24460E5713A24969F1DCE
    @Disabled()
    @Test()
    void addParserWhenThisNotUnmodifiable() {
        /* Branches:
         * (this.unmodifiable) : false  #  inside assertModifiable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
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
        }
    }

    //Sapient generated method id: ${addFormatterWhenThisNotUnmodifiable}, hash: B06B68D091596AA5CC8A8256A7B2624D
    @Disabled()
    @Test()
    void addFormatterWhenThisNotUnmodifiable() {
        /* Branches:
         * (this.unmodifiable) : false  #  inside assertModifiable method
         */
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
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
        }
    }

    //Sapient generated method id: ${addFormatterForFieldTypeWhenThisNotUnmodifiable}, hash: F758A7083521BD561A04787271BE0987
    @Disabled()
    @Test()
    void addFormatterForFieldTypeWhenThisNotUnmodifiable() {
        /* Branches:
         * (this.unmodifiable) : false  #  inside assertModifiable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
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
        }
    }

    //Sapient generated method id: ${addConverterWhenThisNotUnmodifiable}, hash: B359E6305D2DCAC195A9A2D3EB9D8E44
    @Disabled()
    @Test()
    void addConverterWhenThisNotUnmodifiable() {
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
            target.addConverter(converterMock);
            //Assert statement(s)
            assertAll("result", () -> {
                defaultConversionService.verify(() -> DefaultConversionService.addDefaultConverters(target), atLeast(1));
                defaultFormattingConversionService.verify(() -> DefaultFormattingConversionService.addDefaultFormatters(target), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${addFormatterForFieldType1WhenThisNotUnmodifiable}, hash: BA3FA36D6B197CC23E957387C2EB4A7E
    @Disabled()
    @Test()
    void addFormatterForFieldType1WhenThisNotUnmodifiable() {
        /* Branches:
         * (this.unmodifiable) : false  #  inside assertModifiable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
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
        }
    }

    //Sapient generated method id: ${addFormatterForFieldAnnotationWhenThisNotUnmodifiable}, hash: DCFC4CF60922857562E511276B59A460
    @Disabled()
    @Test()
    void addFormatterForFieldAnnotationWhenThisNotUnmodifiable() {
        /* Branches:
         * (this.unmodifiable) : false  #  inside assertModifiable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<GenericTypeResolver> genericTypeResolver = mockStatic(GenericTypeResolver.class);
            MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
            MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class)) {
            Set<Class<?>> anySet = new HashSet<>();
            anySet.add(Object.class);
            doReturn(anySet).when(annotationFormatterFactoryMock).getFieldTypes();
            genericTypeResolver.when(() -> GenericTypeResolver.resolveTypeArgument(AnnotationFormatterFactory.class, AnnotationFormatterFactory.class)).thenReturn(Annotation.class);
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
        }
    }

    //Sapient generated method id: ${addFormatterForFieldAnnotationWhenThisNotUnmodifiableThrowsIllegalArgumentException}, hash: B7C3C9D118837310E217EB45ED2496E3
    @Disabled()
    @Test()
    void addFormatterForFieldAnnotationWhenThisNotUnmodifiableThrowsIllegalArgumentException() {
        /* Branches:
         * (this.unmodifiable) : false  #  inside assertModifiable method
         */
        //Arrange Statement(s)
        try (MockedStatic<GenericTypeResolver> genericTypeResolver = mockStatic(GenericTypeResolver.class);
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
        }
    }

    //Sapient generated method id: ${addConverter1WhenThisNotUnmodifiable}, hash: 085603193D777FB63951AC5596FA0443
    @Test()
    void addConverter1WhenThisNotUnmodifiable() {
        /* Branches:
         * (this.unmodifiable) : false  #  inside assertModifiable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Converter<Object, Object> converterMock = mock(Converter.class);
        try (MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
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
        }
    }

    //Sapient generated method id: ${addConverter2WhenThisNotUnmodifiable}, hash: 6D275E204D2F0D4525023A2DD7768DE4
    @Test()
    void addConverter2WhenThisNotUnmodifiable() {
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
            target.addConverter(genericConverterMock);
            //Assert statement(s)
            assertAll("result", () -> {
                defaultConversionService.verify(() -> DefaultConversionService.addDefaultConverters(target), atLeast(1));
                defaultFormattingConversionService.verify(() -> DefaultFormattingConversionService.addDefaultFormatters(target), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${addConverterFactoryWhenThisNotUnmodifiable}, hash: 8DE54E3C7DE5537FC4207E8D638ADC71
    @Disabled()
    @Test()
    void addConverterFactoryWhenThisNotUnmodifiable() {
        /* Branches:
         * (this.unmodifiable) : false  #  inside assertModifiable method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConverterFactory<?, ?> converterFactoryMock = mock(ConverterFactory.class);
        try (MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
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
        }
    }

    //Sapient generated method id: ${removeConvertibleWhenThisNotUnmodifiable}, hash: 134B1873892997D02F4A05A627CC29B7
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

    //Sapient generated method id: ${isConvertViaObjectSourceTypeWhenConverterIsNullAndPairsIsNull}, hash: C90AA5E3E972FA3AAAC51C8E073D67AD
    @Disabled()
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
        try (MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
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
        }
    }

    //Sapient generated method id: ${isConvertViaObjectSourceTypeWhenObjectEqualsPairGetSourceType}, hash: 72E990EDC9862E6623CA568D80FDC3C7
    @Disabled()
    @Test()
    void isConvertViaObjectSourceTypeWhenObjectEqualsPairGetSourceType() {
        /* Branches:
         * (converter != null) : true
         * (pairs != null) : true
         * (for-each(pairs)) : true
         * (Object.class.equals(pair.getSourceType())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
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
        }
    }

    //Sapient generated method id: ${isConvertViaObjectSourceTypeWhenObjectNotEqualsPairGetSourceType}, hash: 1DB49A1A858AF4A6DEC4F611D9A42537
    @Disabled()
    @Test()
    void isConvertViaObjectSourceTypeWhenObjectNotEqualsPairGetSourceType() {
        /* Branches:
         * (converter != null) : true
         * (pairs != null) : true
         * (for-each(pairs)) : true
         * (Object.class.equals(pair.getSourceType())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DefaultFormattingConversionService> defaultFormattingConversionService = mockStatic(DefaultFormattingConversionService.class);
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
        }
    }

    //Sapient generated method id: ${getSharedInstanceWhenDefaultBranch}, hash: 0DBFDE61FA8B17A967C2103344028294
    @Disabled()
    @Test()
    void getSharedInstanceWhenDefaultBranch() {
        /* Branches:
         * (sharedInstance == null) : true
         * (sharedInstance == null) : true
         * (branch expression (line 69)) : false  #  inside <init> method
         */
        //Arrange Statement(s)
        try (MockedStatic<ApplicationConversionService> applicationConversionService = mockStatic(ApplicationConversionService.class, CALLS_REAL_METHODS)) {
            applicationConversionService.when(() -> ApplicationConversionService.configure((FormatterRegistry) any())).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ConversionService result = ApplicationConversionService.getSharedInstance();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                applicationConversionService.verify(() -> ApplicationConversionService.configure((FormatterRegistry) any()), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${configureTest}, hash: B46E429DAC6A1E8219C00C0A4A96B347
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

    //Sapient generated method id: ${addApplicationConvertersWhenRegistryNotInstanceOfConversionService}, hash: C9C091536F016766F4A834B9C841089A
    @Test()
    void addApplicationConvertersWhenRegistryNotInstanceOfConversionService() {
        /* Branches:
         * (registry instanceof ConversionService conversionService) : false
         */
        //Arrange Statement(s)
        ConverterRegistry registryMock = mock(ConverterRegistry.class);
        try (MockedStatic<ApplicationConversionService> applicationConversionService = mockStatic(ApplicationConversionService.class, CALLS_REAL_METHODS)) {
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
            doNothing().when(registryMock).addConverterFactory((ConverterFactory) any());
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
                verify(registryMock, atLeast(2)).addConverterFactory((ConverterFactory) any());
                applicationConversionService.verify(() -> ApplicationConversionService.addDelimitedStringConverters(registryMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${addDelimitedStringConvertersTest}, hash: 962CC2419F8845E10BE924F7623A8E00
    @Disabled()
    @Test()
    void addDelimitedStringConvertersTest() {
        /*
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

    //Sapient generated method id: ${addApplicationFormattersTest}, hash: 7E77D2C530E4F015CCB60A29F2A5B33D
    @Test()
    void addApplicationFormattersTest() {
        //Arrange Statement(s)
        doNothing().when(registryMock).addFormatter((Formatter) any());
        //Act Statement(s)
        ApplicationConversionService.addApplicationFormatters(registryMock);
        //Assert statement(s)
        assertAll("result", () -> verify(registryMock, atLeast(3)).addFormatter((Formatter) any()));
    }

    //Sapient generated method id: ${addBeansWhenBeanInstanceOfGenericConverter}, hash: 815CB2309ABE65CB01CF4E6C0F0E822F
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

    //Sapient generated method id: ${addBeansWhenBeanInstanceOfConverter}, hash: 76E68AF292A49C75B8CCEC2EB3B6335D
    @Disabled()
    @Test()
    void addBeansWhenBeanInstanceOfConverter() throws BeansException {
        /* Branches:
         * (for-each(beans)) : true
         * (bean instanceof GenericConverter) : false
         * (bean instanceof Converter) : true
         */
        //Arrange Statement(s)
        doNothing().when(registryMock).addConverter(converterMock);
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
            verify(registryMock).addConverter(converterMock);
            verify(beanFactoryMock).getBeansOfType(GenericConverter.class);
            verify(beanFactoryMock).getBeansOfType(Converter.class);
            verify(beanFactoryMock).getBeansOfType(Printer.class);
            verify(beanFactoryMock).getBeansOfType(Parser.class);
        });
    }

    //Sapient generated method id: ${addBeansWhenBeanInstanceOfFormatter}, hash: BD17B422A51FED493D05CE767F415583
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

    //Sapient generated method id: ${addBeansWhenBeanInstanceOfPrinter}, hash: 4168379012E2CDB64265EE0E8DEBE723
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

    //Sapient generated method id: ${addBeansWhenBeanInstanceOfParser}, hash: F35E3E4FF851EDD6D3643346E07B12DD
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
