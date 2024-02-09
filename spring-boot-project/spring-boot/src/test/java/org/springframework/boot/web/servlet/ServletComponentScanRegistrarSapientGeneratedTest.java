package org.springframework.boot.web.servlet;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.util.ClassUtils;
import org.springframework.core.annotation.AnnotationAttributes;

import java.util.Map;
import java.util.HashMap;

import org.mockito.MockedStatic;

import org.springframework.core.type.AnnotationMetadata;

import java.util.LinkedHashSet;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ServletComponentScanRegistrarSapientGeneratedTest {

	private final AnnotationMetadata metadataMock = mock(AnnotationMetadata.class);

	private final BeanDefinitionRegistry registryMock = mock(BeanDefinitionRegistry.class);

	//Sapient generated method id: ${ac1665a7-d228-3af7-ae2f-13870887141e}
	@Test()
	void registerBeanDefinitionsWhenRegistryContainsBeanDefinitionBEAN_NAME() throws NoSuchBeanDefinitionException {
		//TODO: Please change the modifier of addPackageNames from private to default to isolate the test case scenario
		//Act Statement(s)
		//Assert statement(s)
		/* Branches:
		 * (for-each(basePackageClasses)) : true  #  inside getPackagesToScan method
		 * (packagesToScan.isEmpty()) : true  #  inside getPackagesToScan method
		 * (registry.containsBeanDefinition(BEAN_NAME)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		//ServletComponentScanRegistrar.ServletComponentRegisteringPostProcessorBeanDefinition servletComponentScanRegistrarServletComponentRegisteringPostProcessorBeanDefinitionMock = mock(ServletComponentScanRegistrar.ServletComponentRegisteringPostProcessorBeanDefinition.class);
		//Map<String, Object> stringObjectMap = new HashMap<>();
		//doReturn(stringObjectMap).when(metadataMock).getAnnotationAttributes("org.springframework.boot.web.servlet.ServletComponentScan");
		//doReturn("return_of_getClassName1").when(metadataMock).getClassName();
		//doReturn(false).when(registryMock).containsBeanDefinition("servletComponentRegisteringPostProcessor");
		//doReturn(servletComponentScanRegistrarServletComponentRegisteringPostProcessorBeanDefinitionMock).when(registryMock).getBeanDefinition("servletComponentRegisteringPostProcessor");
		//LinkedHashSet<String> stringSet = new LinkedHashSet<>();
		//doNothing().when(servletComponentScanRegistrarServletComponentRegisteringPostProcessorBeanDefinitionMock).addPackageNames(stringSet);
		//AnnotationAttributes annotationAttributes2 = new AnnotationAttributes();
		//annotationAttributes.when(() -> AnnotationAttributes.fromMap(anyMap())).thenReturn(annotationAttributes2);
		//classUtils.when(() -> ClassUtils.getPackageName(Object.class)).thenReturn("return_of_getPackageName1");
		//classUtils.when(() -> ClassUtils.getPackageName("return_of_getClassName1")).thenReturn("return_of_getPackageName1");
		//ServletComponentScanRegistrar target = new ServletComponentScanRegistrar();
		//target.registerBeanDefinitions(metadataMock, registryMock);
		//assertAll("result", () -> {    verify(metadataMock).getAnnotationAttributes("org.springframework.boot.web.servlet.ServletComponentScan");    verify(metadataMock).getClassName();    verify(registryMock).containsBeanDefinition("servletComponentRegisteringPostProcessor");    verify(registryMock).getBeanDefinition("servletComponentRegisteringPostProcessor");    annotationAttributes.verify(() -> AnnotationAttributes.fromMap(anyMap()));    classUtils.verify(() -> ClassUtils.getPackageName(Object.class), atLeast(1));    classUtils.verify(() -> ClassUtils.getPackageName("return_of_getClassName1"), atLeast(1));});
	}

	//Sapient generated method id: ${5751228f-1ea8-3cb0-ba0a-09f2aaa56240}
	@Disabled()
	@Test()
	void registerBeanDefinitionsWhenRegistryNotContainsBeanDefinitionBEAN_NAME() throws BeanDefinitionStoreException {
		/* Branches:
		 * (for-each(basePackageClasses)) : true  #  inside getPackagesToScan method
		 * (packagesToScan.isEmpty()) : true  #  inside getPackagesToScan method
		 * (registry.containsBeanDefinition(BEAN_NAME)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<AnnotationAttributes> annotationAttributes = mockStatic(AnnotationAttributes.class)) {
			Map<String, Object> stringObjectMap = new HashMap<>();
			doReturn(stringObjectMap).when(metadataMock).getAnnotationAttributes("org.springframework.boot.web.servlet.ServletComponentScan");
			doReturn("return_of_getClassName1").when(metadataMock).getClassName();
			doReturn(false).when(registryMock).containsBeanDefinition("servletComponentRegisteringPostProcessor");
			doNothing().when(registryMock).registerBeanDefinition(eq("servletComponentRegisteringPostProcessor"), (ServletComponentScanRegistrar.ServletComponentRegisteringPostProcessorBeanDefinition) any());
			AnnotationAttributes annotationAttributes2 = new AnnotationAttributes();
			annotationAttributes.when(() -> AnnotationAttributes.fromMap(anyMap())).thenReturn(annotationAttributes2);
			classUtils.when(() -> ClassUtils.getPackageName(Object.class)).thenReturn("return_of_getPackageName1");
			classUtils.when(() -> ClassUtils.getPackageName("return_of_getClassName1")).thenReturn("return_of_getPackageName1");
			ServletComponentScanRegistrar target = new ServletComponentScanRegistrar();
			//Act Statement(s)
			target.registerBeanDefinitions(metadataMock, registryMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(metadataMock).getAnnotationAttributes("org.springframework.boot.web.servlet.ServletComponentScan");
				verify(metadataMock).getClassName();
				verify(registryMock).containsBeanDefinition("servletComponentRegisteringPostProcessor");
				verify(registryMock).registerBeanDefinition(eq("servletComponentRegisteringPostProcessor"), (ServletComponentScanRegistrar.ServletComponentRegisteringPostProcessorBeanDefinition) any());
				annotationAttributes.verify(() -> AnnotationAttributes.fromMap(anyMap()));
				classUtils.verify(() -> ClassUtils.getPackageName(Object.class), atLeast(1));
				classUtils.verify(() -> ClassUtils.getPackageName("return_of_getClassName1"), atLeast(1));
			});
		}
	}
}
