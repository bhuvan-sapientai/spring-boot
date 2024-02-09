package org.springframework.boot.orm.jpa;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import org.springframework.core.env.Environment;

import java.util.Set;

import jakarta.persistence.EntityManagerFactory;

import org.springframework.orm.jpa.AbstractEntityManagerFactoryBean;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JpaDependsOnDatabaseInitializationDetectorSapientGeneratedTest {

	private final Environment environmentMock = mock(Environment.class, "environment");

	//Sapient generated method id: ${59f9cfcd-fd70-39ed-8feb-bb0421a01204}
	@Test()
	void getDependsOnDatabaseInitializationBeanTypesWhenPostpone() {
		/* Branches:
		 * (postpone) : true
		 */
		//Arrange Statement(s)
		JpaDependsOnDatabaseInitializationDetector target = new JpaDependsOnDatabaseInitializationDetector(environmentMock);
		doReturn(true).when(environmentMock).getProperty("spring.jpa.defer-datasource-initialization", boolean.class, false);

		//Act Statement(s)
		Set<Class<?>> result = target.getDependsOnDatabaseInitializationBeanTypes();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(0));
			verify(environmentMock).getProperty("spring.jpa.defer-datasource-initialization", boolean.class, false);
		});
	}

	//Sapient generated method id: ${7a2f5d5c-8ec0-31f8-a034-e6599e645ec5}
	@Test()
	void getDependsOnDatabaseInitializationBeanTypesWhenNotPostpone() {
		/* Branches:
		 * (postpone) : false
		 */
		//Arrange Statement(s)
		JpaDependsOnDatabaseInitializationDetector target = new JpaDependsOnDatabaseInitializationDetector(environmentMock);
		doReturn(false).when(environmentMock).getProperty("spring.jpa.defer-datasource-initialization", boolean.class, false);

		//Act Statement(s)
		Set<Class<?>> result = target.getDependsOnDatabaseInitializationBeanTypes();
		Set<Class<?>> anySet = new HashSet<>();
		anySet.add(EntityManagerFactory.class);
		anySet.add(AbstractEntityManagerFactoryBean.class);

		//Assert statement(s)
		//TODO: Please implement equals method in Collection for verification to succeed or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(anySet.size()));
			assertThat(result, containsInAnyOrder(anySet.toArray()));
			verify(environmentMock).getProperty("spring.jpa.defer-datasource-initialization", boolean.class, false);
		});
	}
}
