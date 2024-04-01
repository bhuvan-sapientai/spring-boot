package org.springframework.boot.web.servlet;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;

import jakarta.servlet.MultipartConfigElement;

import org.springframework.util.StringUtils;
import org.springframework.beans.factory.support.AbstractBeanDefinition;

import java.util.Map;
import java.util.HashMap;

import org.mockito.MockedStatic;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.config.BeanDefinition;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WebServletHandlerSapientGeneratedTest {

	private final AnnotationMetadata annotationMetadataMock = mock(AnnotationMetadata.class);

	private final BeanDefinitionBuilder beanDefinitionBuilder4Mock = mock(BeanDefinitionBuilder.class);

	private final BeanDefinitionBuilder beanDefinitionBuilderMock = mock(BeanDefinitionBuilder.class);

	private final BeanDefinitionBuilder beanDefinitionBuilderMock10 = mock(BeanDefinitionBuilder.class);

	private final BeanDefinitionBuilder beanDefinitionBuilderMock2 = mock(BeanDefinitionBuilder.class);

	private final BeanDefinitionBuilder beanDefinitionBuilderMock3 = mock(BeanDefinitionBuilder.class);

	private final BeanDefinitionBuilder beanDefinitionBuilderMock4 = mock(BeanDefinitionBuilder.class);

	private final BeanDefinitionBuilder beanDefinitionBuilderMock5 = mock(BeanDefinitionBuilder.class);

	private final BeanDefinitionBuilder beanDefinitionBuilderMock6 = mock(BeanDefinitionBuilder.class);

	private final BeanDefinitionBuilder beanDefinitionBuilderMock7 = mock(BeanDefinitionBuilder.class);

	private final BeanDefinitionBuilder beanDefinitionBuilderMock8 = mock(BeanDefinitionBuilder.class);

	private final BeanDefinitionBuilder beanDefinitionBuilderMock9 = mock(BeanDefinitionBuilder.class);

	private final AnnotatedBeanDefinition beanDefinitionMock = mock(AnnotatedBeanDefinition.class);

	private final BeanDefinitionBuilder builderMock = mock(BeanDefinitionBuilder.class);

	private final BeanDefinitionRegistry registryMock = mock(BeanDefinitionRegistry.class);

	//Sapient generated method id: ${d5d9f3cb-67a4-3272-a28e-82b6863c712c}, hash: A90AE594D20429EBC9D40A15C4DBD4E1
	@Disabled()
	@Test()
	void doHandleWhenAttributesIsNull() throws BeanDefinitionStoreException {
		/* Branches:
		 * (StringUtils.hasText((String) attributes.get("name"))) : true  #  inside determineName method
		 * (attributes == null) : true  #  inside determineMultipartConfig method
		 */
		//Arrange Statement(s)
		try (MockedStatic<BeanDefinitionBuilder> beanDefinitionBuilder = mockStatic(BeanDefinitionBuilder.class)) {
			doReturn(annotationMetadataMock).when(beanDefinitionMock).getMetadata();
			doReturn(null).when(annotationMetadataMock).getAnnotationAttributes("jakarta.servlet.annotation.MultipartConfig");
			doNothing().when(registryMock).registerBeanDefinition(eq("A"), (BeanDefinition) any());
			Object object = new Object();
			doReturn(beanDefinitionBuilderMock).when(builderMock).addPropertyValue("asyncSupported", object);
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(beanDefinitionBuilderMock2).when(builderMock).addPropertyValue(eq("initParameters"), eq(stringStringMap));
			Object object2 = new Object();
			doReturn(beanDefinitionBuilderMock3).when(builderMock).addPropertyValue("loadOnStartup", object2);
			doReturn(beanDefinitionBuilderMock4).when(builderMock).addPropertyValue("name", "A");
			doReturn(beanDefinitionBuilderMock5).when(builderMock).addPropertyValue("servlet", beanDefinitionMock);
			String[] stringArray = new String[] {};
			doReturn(beanDefinitionBuilderMock6).when(builderMock).addPropertyValue("urlMappings", stringArray);
			BeanDefinitionBuilder beanDefinitionBuilder2 = builderMock.addPropertyValue("multipartConfig", (BeanDefinition) null);
			doReturn(beanDefinitionBuilder2).when(builderMock).addPropertyValue("multipartConfig", (BeanDefinition) null);
			AbstractBeanDefinition abstractBeanDefinition = builderMock.getBeanDefinition();
			doReturn(abstractBeanDefinition).when(builderMock).getBeanDefinition();
			beanDefinitionBuilder.when(() -> BeanDefinitionBuilder.rootBeanDefinition(ServletRegistrationBean.class)).thenReturn(builderMock);
			WebServletHandler target = spy(new WebServletHandler());
			Object object3 = new Object();
			Map<String, Object> stringObjectMap = new HashMap<>();
			stringObjectMap.put("loadOnStartup", object2);
			stringObjectMap.put("asyncSupported", object);
			stringObjectMap.put("name", "A");
			stringObjectMap.put("attributesItem4Key1", object3);
			doReturn(stringStringMap).when(target).extractInitParameters(eq(stringObjectMap));
			doReturn(stringArray).when(target).extractUrlPatterns(eq(stringObjectMap));
			//Act Statement(s)
			target.doHandle(stringObjectMap, beanDefinitionMock, registryMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(beanDefinitionMock).getMetadata();
				verify(annotationMetadataMock).getAnnotationAttributes("jakarta.servlet.annotation.MultipartConfig");
				verify(registryMock).registerBeanDefinition(eq("A"), (BeanDefinition) any());
				verify(builderMock).addPropertyValue("asyncSupported", object);
				verify(builderMock).addPropertyValue(eq("initParameters"), eq(stringStringMap));
				verify(builderMock).addPropertyValue("loadOnStartup", object2);
				verify(builderMock).addPropertyValue("name", "A");
				verify(builderMock).addPropertyValue("servlet", beanDefinitionMock);
				verify(builderMock).addPropertyValue("urlMappings", stringArray);
				verify(builderMock).addPropertyValue("multipartConfig", (BeanDefinition) null);
				verify(builderMock).getBeanDefinition();
				beanDefinitionBuilder.verify(() -> BeanDefinitionBuilder.rootBeanDefinition(ServletRegistrationBean.class), atLeast(1));
				verify(target).extractInitParameters(eq(stringObjectMap));
				verify(target).extractUrlPatterns(eq(stringObjectMap));
			});
		}
	}

	//Sapient generated method id: ${a186b2e1-6c03-34ec-88de-e3cb1eac806f}, hash: 6F197F5AE922D02312243C4D7086EF0D
	@Disabled()
	@Test()
	void doHandleWhenAttributesIsNotNull() throws BeanDefinitionStoreException {
		/* Branches:
		 * (StringUtils.hasText((String) attributes.get("name"))) : true  #  inside determineName method
		 * (attributes == null) : false  #  inside determineMultipartConfig method
		 */
		//Arrange Statement(s)
		try (MockedStatic<BeanDefinitionBuilder> beanDefinitionBuilder = mockStatic(BeanDefinitionBuilder.class)) {
			doReturn(annotationMetadataMock).when(beanDefinitionMock).getMetadata();
			Object object = new Object();
			Object object2 = new Object();
			Object object3 = new Object();
			Object object4 = new Object();
			Map<String, Object> stringObjectMap = new HashMap<>();
			stringObjectMap.put("maxRequestSize", object);
			stringObjectMap.put("maxFileSize", object2);
			stringObjectMap.put("fileSizeThreshold", object3);
			stringObjectMap.put("location", object4);
			doReturn(stringObjectMap).when(annotationMetadataMock).getAnnotationAttributes("jakarta.servlet.annotation.MultipartConfig");
			doNothing().when(registryMock).registerBeanDefinition(eq("A"), (BeanDefinition) any());
			Object object5 = new Object();
			doReturn(beanDefinitionBuilderMock).when(builderMock).addPropertyValue("asyncSupported", object5);
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(beanDefinitionBuilderMock2).when(builderMock).addPropertyValue(eq("initParameters"), eq(stringStringMap));
			Object object6 = new Object();
			doReturn(beanDefinitionBuilderMock3).when(builderMock).addPropertyValue("loadOnStartup", object6);
			doReturn(beanDefinitionBuilderMock4).when(builderMock).addPropertyValue("name", "A");
			doReturn(beanDefinitionBuilderMock5).when(builderMock).addPropertyValue("servlet", beanDefinitionMock);
			String[] stringArray = new String[] {};
			doReturn(beanDefinitionBuilderMock6).when(builderMock).addPropertyValue("urlMappings", stringArray);
			AbstractBeanDefinition abstractBeanDefinition = beanDefinitionBuilder4Mock.getBeanDefinition();
			BeanDefinitionBuilder beanDefinitionBuilder3 = builderMock.addPropertyValue("multipartConfig", abstractBeanDefinition);
			doReturn(beanDefinitionBuilder3).when(builderMock).addPropertyValue(eq("multipartConfig"), (AbstractBeanDefinition) any());
			AbstractBeanDefinition abstractBeanDefinition2 = builderMock.getBeanDefinition();
			doReturn(abstractBeanDefinition2).when(builderMock).getBeanDefinition();
			doReturn(beanDefinitionBuilderMock7).when(beanDefinitionBuilder4Mock).addConstructorArgValue(object4);
			doReturn(beanDefinitionBuilderMock8).when(beanDefinitionBuilder4Mock).addConstructorArgValue(object2);
			doReturn(beanDefinitionBuilderMock9).when(beanDefinitionBuilder4Mock).addConstructorArgValue(object);
			doReturn(beanDefinitionBuilderMock10).when(beanDefinitionBuilder4Mock).addConstructorArgValue(object3);
			doReturn(abstractBeanDefinition).when(beanDefinitionBuilder4Mock).getBeanDefinition();
			beanDefinitionBuilder.when(() -> BeanDefinitionBuilder.rootBeanDefinition(ServletRegistrationBean.class)).thenReturn(builderMock);
			beanDefinitionBuilder.when(() -> BeanDefinitionBuilder.rootBeanDefinition(MultipartConfigElement.class)).thenReturn(beanDefinitionBuilder4Mock);
			WebServletHandler target = spy(new WebServletHandler());
			Object object7 = new Object();
			Map<String, Object> stringObjectMap2 = new HashMap<>();
			stringObjectMap2.put("name", "A");
			stringObjectMap2.put("loadOnStartup", object6);
			stringObjectMap2.put("attributesItem3Key1", object7);
			stringObjectMap2.put("asyncSupported", object5);
			doReturn(stringStringMap).when(target).extractInitParameters(eq(stringObjectMap2));
			doReturn(stringArray).when(target).extractUrlPatterns(eq(stringObjectMap2));
			//Act Statement(s)
			target.doHandle(stringObjectMap2, beanDefinitionMock, registryMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(beanDefinitionMock).getMetadata();
				verify(annotationMetadataMock).getAnnotationAttributes("jakarta.servlet.annotation.MultipartConfig");
				verify(registryMock).registerBeanDefinition(eq("A"), (BeanDefinition) any());
				verify(builderMock).addPropertyValue("asyncSupported", object5);
				verify(builderMock).addPropertyValue(eq("initParameters"), eq(stringStringMap));
				verify(builderMock).addPropertyValue("loadOnStartup", object6);
				verify(builderMock).addPropertyValue("name", "A");
				verify(builderMock).addPropertyValue("servlet", beanDefinitionMock);
				verify(builderMock).addPropertyValue("urlMappings", stringArray);
				verify(builderMock).addPropertyValue(eq("multipartConfig"), (AbstractBeanDefinition) any());
				verify(builderMock).getBeanDefinition();
				verify(beanDefinitionBuilder4Mock).addConstructorArgValue(object4);
				verify(beanDefinitionBuilder4Mock).addConstructorArgValue(object2);
				verify(beanDefinitionBuilder4Mock).addConstructorArgValue(object);
				verify(beanDefinitionBuilder4Mock).addConstructorArgValue(object3);
				verify(beanDefinitionBuilder4Mock).getBeanDefinition();
				beanDefinitionBuilder.verify(() -> BeanDefinitionBuilder.rootBeanDefinition(ServletRegistrationBean.class), atLeast(1));
				beanDefinitionBuilder.verify(() -> BeanDefinitionBuilder.rootBeanDefinition(MultipartConfigElement.class), atLeast(1));
				verify(target).extractInitParameters(eq(stringObjectMap2));
				verify(target).extractUrlPatterns(eq(stringObjectMap2));
			});
		}
	}

	//Sapient generated method id: ${761a2088-4165-32b3-bddf-a261e5ec03bd}, hash: 9AECA86116ECBC5BF7D5CDF9C933690E
	@Disabled()
	@Test()
	void doHandleWhenStringUtilsNotHasTextAttributesGetNameAndAttributesIsNotNull() throws BeanDefinitionStoreException {
		/* Branches:
		 * (StringUtils.hasText((String) attributes.get("name"))) : false  #  inside determineName method
		 * (attributes == null) : false  #  inside determineMultipartConfig method
		 */
		//Arrange Statement(s)
		try (MockedStatic<BeanDefinitionBuilder> beanDefinitionBuilder = mockStatic(BeanDefinitionBuilder.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("return_of_getBeanClassName1").when(beanDefinitionMock).getBeanClassName();
			doReturn(annotationMetadataMock).when(beanDefinitionMock).getMetadata();
			Object object = new Object();
			Object object2 = new Object();
			Object object3 = new Object();
			Object object4 = new Object();
			Map<String, Object> stringObjectMap = new HashMap<>();
			stringObjectMap.put("maxRequestSize", object);
			stringObjectMap.put("maxFileSize", object2);
			stringObjectMap.put("fileSizeThreshold", object3);
			stringObjectMap.put("location", object4);
			doReturn(stringObjectMap).when(annotationMetadataMock).getAnnotationAttributes("jakarta.servlet.annotation.MultipartConfig");
			doNothing().when(registryMock).registerBeanDefinition(eq("return_of_getBeanClassName1"), (BeanDefinition) any());
			Object object5 = new Object();
			doReturn(beanDefinitionBuilderMock).when(builderMock).addPropertyValue("asyncSupported", object5);
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(beanDefinitionBuilderMock2).when(builderMock).addPropertyValue(eq("initParameters"), eq(stringStringMap));
			Object object6 = new Object();
			doReturn(beanDefinitionBuilderMock3).when(builderMock).addPropertyValue("loadOnStartup", object6);
			doReturn(beanDefinitionBuilderMock4).when(builderMock).addPropertyValue("name", "return_of_getBeanClassName1");
			doReturn(beanDefinitionBuilderMock5).when(builderMock).addPropertyValue("servlet", beanDefinitionMock);
			String[] stringArray = new String[] {};
			doReturn(beanDefinitionBuilderMock6).when(builderMock).addPropertyValue("urlMappings", stringArray);
			AbstractBeanDefinition abstractBeanDefinition = beanDefinitionBuilder4Mock.getBeanDefinition();
			BeanDefinitionBuilder beanDefinitionBuilder3 = builderMock.addPropertyValue("multipartConfig", abstractBeanDefinition);
			doReturn(beanDefinitionBuilder3).when(builderMock).addPropertyValue(eq("multipartConfig"), (AbstractBeanDefinition) any());
			AbstractBeanDefinition abstractBeanDefinition2 = builderMock.getBeanDefinition();
			doReturn(abstractBeanDefinition2).when(builderMock).getBeanDefinition();
			doReturn(beanDefinitionBuilderMock7).when(beanDefinitionBuilder4Mock).addConstructorArgValue(object4);
			doReturn(beanDefinitionBuilderMock8).when(beanDefinitionBuilder4Mock).addConstructorArgValue(object2);
			doReturn(beanDefinitionBuilderMock9).when(beanDefinitionBuilder4Mock).addConstructorArgValue(object);
			doReturn(beanDefinitionBuilderMock10).when(beanDefinitionBuilder4Mock).addConstructorArgValue(object3);
			doReturn(abstractBeanDefinition).when(beanDefinitionBuilder4Mock).getBeanDefinition();
			beanDefinitionBuilder.when(() -> BeanDefinitionBuilder.rootBeanDefinition(ServletRegistrationBean.class)).thenReturn(builderMock);
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			beanDefinitionBuilder.when(() -> BeanDefinitionBuilder.rootBeanDefinition(MultipartConfigElement.class)).thenReturn(beanDefinitionBuilder4Mock);
			WebServletHandler target = spy(new WebServletHandler());
			Object object7 = new Object();
			Map<String, Object> stringObjectMap2 = new HashMap<>();
			stringObjectMap2.put("name", "A");
			stringObjectMap2.put("asyncSupported", object5);
			stringObjectMap2.put("attributesItem3Key1", object7);
			stringObjectMap2.put("loadOnStartup", object6);
			doReturn(stringStringMap).when(target).extractInitParameters(eq(stringObjectMap2));
			doReturn(stringArray).when(target).extractUrlPatterns(eq(stringObjectMap2));
			//Act Statement(s)
			target.doHandle(stringObjectMap2, beanDefinitionMock, registryMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(beanDefinitionMock).getBeanClassName();
				verify(beanDefinitionMock).getMetadata();
				verify(annotationMetadataMock).getAnnotationAttributes("jakarta.servlet.annotation.MultipartConfig");
				verify(registryMock).registerBeanDefinition(eq("return_of_getBeanClassName1"), (BeanDefinition) any());
				verify(builderMock).addPropertyValue("asyncSupported", object5);
				verify(builderMock).addPropertyValue(eq("initParameters"), eq(stringStringMap));
				verify(builderMock).addPropertyValue("loadOnStartup", object6);
				verify(builderMock).addPropertyValue("name", "return_of_getBeanClassName1");
				verify(builderMock).addPropertyValue("servlet", beanDefinitionMock);
				verify(builderMock).addPropertyValue("urlMappings", stringArray);
				verify(builderMock).addPropertyValue(eq("multipartConfig"), (AbstractBeanDefinition) any());
				verify(builderMock).getBeanDefinition();
				verify(beanDefinitionBuilder4Mock).addConstructorArgValue(object4);
				verify(beanDefinitionBuilder4Mock).addConstructorArgValue(object2);
				verify(beanDefinitionBuilder4Mock).addConstructorArgValue(object);
				verify(beanDefinitionBuilder4Mock).addConstructorArgValue(object3);
				verify(beanDefinitionBuilder4Mock).getBeanDefinition();
				beanDefinitionBuilder.verify(() -> BeanDefinitionBuilder.rootBeanDefinition(ServletRegistrationBean.class), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
				beanDefinitionBuilder.verify(() -> BeanDefinitionBuilder.rootBeanDefinition(MultipartConfigElement.class), atLeast(1));
				verify(target).extractInitParameters(eq(stringObjectMap2));
				verify(target).extractUrlPatterns(eq(stringObjectMap2));
			});
		}
	}
}
