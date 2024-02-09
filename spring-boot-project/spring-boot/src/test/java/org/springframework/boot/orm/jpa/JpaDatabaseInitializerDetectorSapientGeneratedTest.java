package org.springframework.boot.orm.jpa;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import org.springframework.core.env.Environment;

import java.util.Set;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import jakarta.persistence.EntityManagerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JpaDatabaseInitializerDetectorSapientGeneratedTest {

	private final Environment environmentMock = mock(Environment.class, "environment");

	//Sapient generated method id: ${46fe046c-e3a1-3b59-bfcc-cb5d79b66cf9}
	@Test()
	void getDatabaseInitializerBeanTypesWhenDeferred() {
		/* Branches:
		 * (deferred) : true
		 */
		//Arrange Statement(s)
		JpaDatabaseInitializerDetector target = new JpaDatabaseInitializerDetector(environmentMock);
		doReturn(true).when(environmentMock).getProperty("spring.jpa.defer-datasource-initialization", boolean.class, false);

		//Act Statement(s)
		Set<Class<?>> result = target.getDatabaseInitializerBeanTypes();
		Set<Class<?>> anySet = new HashSet<>(Set.of(EntityManagerFactory.class));

		//Assert statement(s)
		//TODO: Please implement equals method in Collection for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(anySet.size()));
			assertThat(result, containsInAnyOrder(anySet.toArray()));
			verify(environmentMock).getProperty("spring.jpa.defer-datasource-initialization", boolean.class, false);
		});
	}

	//Sapient generated method id: ${cb4d4fbd-6e7c-3de6-b276-a8242349b150}
	@Test()
	void getDatabaseInitializerBeanTypesWhenNotDeferred() {
		/* Branches:
		 * (deferred) : false
		 */
		//Arrange Statement(s)
		JpaDatabaseInitializerDetector target = new JpaDatabaseInitializerDetector(environmentMock);
		doReturn(false).when(environmentMock).getProperty("spring.jpa.defer-datasource-initialization", boolean.class, false);

		//Act Statement(s)
		Set<Class<?>> result = target.getDatabaseInitializerBeanTypes();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(0));
			verify(environmentMock).getProperty("spring.jpa.defer-datasource-initialization", boolean.class, false);
		});
	}

	//Sapient generated method id: ${6ce64f65-aff3-321b-884d-336e927c19bf}
	@Test()
	void detectionCompleteWhenOtherInitializersIsEmpty() {
		/* Branches:
		 * (iterator.hasNext()) : false  #  inside configureOtherInitializersToDependOnJpaInitializers method
		 * (for-each(otherInitializers)) : false  #  inside configureOtherInitializersToDependOnJpaInitializers method
		 */
		//Arrange Statement(s)
		JpaDatabaseInitializerDetector target = new JpaDatabaseInitializerDetector(environmentMock);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		Set<String> stringSet = new HashSet<>();

		//Act Statement(s)
		target.detectionComplete(configurableListableBeanFactoryMock, stringSet);
	}
}
