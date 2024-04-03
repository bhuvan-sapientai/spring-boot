//package org.springframework.boot.context.properties.bind;
//
//import org.springframework.boot.context.properties.bind.Bindable;
//
//import org.springframework.boot.context.properties.bind.Bindable;
//import org.springframework.boot.context.properties.bind.BindMethod;
//
//import java.lang.Class;
//import java.util.function.*;
//
//import org.springframework.core.ResolvableType;
//import org.springframework.boot.context.properties.bind.*;
//
//import java.util.function.Supplier;
//import java.lang.*;
//
//import org.springframework.core.style.*;
//
//import java.lang.annotation.*;
//
//import org.springframework.util.*;
//import org.springframework.core.style.ToStringCreator;
//import org.springframework.util.ObjectUtils;
//
//import java.lang.annotation.Annotation;
//import java.util.EnumSet;
//
//import org.springframework.util.Assert;
//
//import java.lang.Object;
//
//import org.springframework.core.*;
//
//import java.util.*;
//
//import org.springframework.boot.context.properties.source.ConfigurationProperty;
//
//import java.lang.reflect.Array;
//
//import org.springframework.core.style.ToStringCreator;
//import org.springframework.util.Assert;
//
//import java.util.Set;
//import java.util.EnumSet;
//import java.util.function.Supplier;
//import java.util.List;
//
//import org.springframework.core.ResolvableType;
//
//import java.util.Arrays;
//import java.util.Map;
//
//import org.springframework.util.ObjectUtils;
//
//import java.lang.annotation.Annotation;
//
//import static org.hamcrest.Matchers.*;
//import static org.hamcrest.core.IsInstanceOf.*;
//import static org.hamcrest.MatcherAssert.*;
//import static org.mockito.Mockito.*;
//import static org.mockito.ArgumentMatchers.*;
//import static org.mockito.Mockito.any;
//import static org.mockito.Mockito.eq;
//
//import org.hamcrest.Matchers;
//import org.hamcrest.core.IsInstanceOf;
//import org.hamcrest.MatcherAssert;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mockito;
//import org.mockito.ArgumentMatchers;
//import org.mockito.InjectMocks;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.mockito.stubbing.Answer;
//import org.mockito.MockedStatic;
//import org.mockito.MockitoAnnotations;
//import org.mockito.Mock;
//
//import java.util.*;
//import java.util.stream.*;
//import java.io.*;
//import java.net.*;
//import java.beans.*;
//
//import javax.net.*;
//import javax.annotation.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Timeout;
//
//@ExtendWith(MockitoExtension.class)
//public class BindableGetAnnotationEnhancedTest {
//
//	@Mock
//	private ResolvableType type;
//
//	@Mock
//	private ResolvableType boxedType;
//
//	@Mock
//	private Supplier<Object> valueSupplier;
//
//	@Mock
//	private Annotation annotation;
//
//	private Bindable<Object> bindable;
//
//	@BeforeEach
//	void setUp() {
//		bindable = new Bindable<>(type, boxedType, valueSupplier, new Annotation[] { annotation }, Bindable.NO_BIND_RESTRICTIONS, Bindable.BindMethod.JAVA_BEAN);
//	}
//
//	@Test
//	void getAnnotationWhenPresentReturnsAnnotation() {
//		Class<Annotation> annotationType = Annotation.class;
//		when(annotation.annotationType()).thenReturn((Class) annotationType);
//		Annotation result = bindable.getAnnotation(annotationType);
//		assertNotNull(result);
//		assertEquals(annotation, result);
//	}
//
//	@Test
//	void getAnnotationWhenNotPresentReturnsNull() {
//		Class<Annotation> annotationType = Annotation.class;
//		when(annotation.annotationType()).thenReturn((Class) annotationType);
//		Annotation result = bindable.getAnnotation(Deprecated.class);
//		assertNull(result);
//	}
//
//	@Test
//	void getAnnotationWithMockedStaticMethods() {
//		try (MockedStatic<ResolvableType> resolvableTypeMockedStatic = mockStatic(ResolvableType.class);
//			 MockedStatic<Bindable> bindableMockedStatic = mockStatic(Bindable.class)) {
//			resolvableTypeMockedStatic.when(() -> ResolvableType.forClassWithGenerics(any(Class.class), any(Class[].class))).thenReturn(type);
//			bindableMockedStatic.when(() -> Bindable.of(any(ResolvableType.class))).thenReturn(bindable);
//			Class<Annotation> annotationType = Annotation.class;
//			when(annotation.annotationType()).thenReturn((Class) annotationType);
//			Bindable<Object> bindableResult = Bindable.of(ResolvableType.forClassWithGenerics(Object.class, new Class[] { String.class }));
//			Annotation result = bindableResult.getAnnotation(annotationType);
//			assertNotNull(result);
//			assertEquals(annotation, result);
//		}
//	}
//}
