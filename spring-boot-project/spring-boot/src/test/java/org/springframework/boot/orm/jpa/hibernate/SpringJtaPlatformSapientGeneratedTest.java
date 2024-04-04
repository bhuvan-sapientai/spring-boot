package org.springframework.boot.orm.jpa.hibernate;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.transaction.jta.JtaTransactionManager;

import org.mockito.MockedStatic;
import jakarta.transaction.UserTransaction;
import jakarta.transaction.TransactionManager;

import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringJtaPlatformSapientGeneratedTest {

	//Sapient generated method id: ${8c9dc2f0-a483-35aa-9baa-4989ab32f191}, hash: D69D8F3A2B04927368A27278B953AC88
	@Test()
	void locateTransactionManagerTest() {
		//Arrange Statement(s)
		TransactionManager transactionManagerMock = mock(TransactionManager.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			JtaTransactionManager jtaTransactionManager = new JtaTransactionManager();
			jtaTransactionManager.setTransactionManager(transactionManagerMock);
			_assert.when(() -> Assert.notNull(jtaTransactionManager, "TransactionManager must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SpringJtaPlatform target = new SpringJtaPlatform(jtaTransactionManager);
			//Act Statement(s)
			TransactionManager result = target.locateTransactionManager();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(transactionManagerMock));
				_assert.verify(() -> Assert.notNull(jtaTransactionManager, "TransactionManager must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7ba11a3e-1176-3e9b-be68-0467a37d8293}, hash: CA8F96DC76EBEE0737572786E1C23AC6
	@Test()
	void locateUserTransactionTest() {
		//Arrange Statement(s)
		UserTransaction userTransactionMock = mock(UserTransaction.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			JtaTransactionManager jtaTransactionManager = new JtaTransactionManager();
			jtaTransactionManager.setUserTransaction(userTransactionMock);
			_assert.when(() -> Assert.notNull(jtaTransactionManager, "TransactionManager must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SpringJtaPlatform target = new SpringJtaPlatform(jtaTransactionManager);
			//Act Statement(s)
			UserTransaction result = target.locateUserTransaction();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(userTransactionMock));
				_assert.verify(() -> Assert.notNull(jtaTransactionManager, "TransactionManager must not be null"), atLeast(1));
			});
		}
	}
}
