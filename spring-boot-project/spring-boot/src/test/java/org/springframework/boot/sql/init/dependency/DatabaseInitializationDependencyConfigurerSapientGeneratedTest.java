package org.springframework.boot.sql.init.dependency;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.config.BeanDefinition;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DatabaseInitializationDependencyConfigurerSapientGeneratedTest {

	//Sapient generated method id: ${ce40fea0-b825-3359-9140-d98e9640683a}, hash: 7363E3D9AC6CEC67E9F7F9325FDA8626
	@Test()
	void registerBeanDefinitionsWhenRegistryNotContainsBeanDefinitionName() throws BeanDefinitionStoreException {
		/* Branches:
		 * (!registry.containsBeanDefinition(name)) : true
		 */
		//Arrange Statement(s)
		BeanDefinitionRegistry registryMock = mock(BeanDefinitionRegistry.class);
		doReturn(false).when(registryMock).containsBeanDefinition("org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer$DependsOnDatabaseInitializationPostProcessor");
		doNothing().when(registryMock).registerBeanDefinition(eq("org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer$DependsOnDatabaseInitializationPostProcessor"), (BeanDefinition) any());
		DatabaseInitializationDependencyConfigurer target = new DatabaseInitializationDependencyConfigurer();
		AnnotationMetadata annotationMetadataMock = mock(AnnotationMetadata.class);

		//Act Statement(s)
		target.registerBeanDefinitions(annotationMetadataMock, registryMock);

		//Assert statement(s)
		assertAll("result", () -> {
			verify(registryMock).containsBeanDefinition("org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer$DependsOnDatabaseInitializationPostProcessor");
			verify(registryMock).registerBeanDefinition(eq("org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer$DependsOnDatabaseInitializationPostProcessor"), (BeanDefinition) any());
		});
	}
}
