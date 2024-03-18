package org.springframework.boot.task;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.scheduling.concurrent.SimpleAsyncTaskScheduler;

import org.mockito.stubbing.Answer;

import org.springframework.boot.context.properties.PropertyMapper;
import org.springframework.util.CollectionUtils;
import org.springframework.util.Assert;

import java.time.Duration;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.function.Consumer;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SimpleAsyncTaskSchedulerBuilderSapientGeneratedTest {

	private final Iterable additionsMock = mock(Iterable.class);

	private final SimpleAsyncTaskSchedulerBuilder simpleAsyncTaskSchedulerBuilderMock = mock(SimpleAsyncTaskSchedulerBuilder.class);

	private final SimpleAsyncTaskScheduler simpleAsyncTaskSchedulerMock = mock(SimpleAsyncTaskScheduler.class);

	//Sapient generated method id: ${685f4a5d-cad1-361d-add4-158862b5b607}, hash: ABF7F6B5F760958DBC01F25FFD04CFB7
	@Test()
	void threadNamePrefixTest() {
		//Arrange Statement(s)
		SimpleAsyncTaskSchedulerBuilder target = new SimpleAsyncTaskSchedulerBuilder();
		//Act Statement(s)
		SimpleAsyncTaskSchedulerBuilder result = target.threadNamePrefix("threadNamePrefix1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${ea866017-6fd3-3d5a-a04d-3fcc7a43afee}, hash: A2838663CC70641A57206242ACF48073
	@Test()
	void concurrencyLimitTest() {
		//Arrange Statement(s)
		SimpleAsyncTaskSchedulerBuilder target = new SimpleAsyncTaskSchedulerBuilder();
		//Act Statement(s)
		SimpleAsyncTaskSchedulerBuilder result = target.concurrencyLimit(0);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${9eac6044-a8e2-3b90-b9a3-2f54d7fcbf72}, hash: EA73E36574BAC90F0B7898A2AD247F25
	@Test()
	void virtualThreadsTest() {
		//Arrange Statement(s)
		SimpleAsyncTaskSchedulerBuilder target = new SimpleAsyncTaskSchedulerBuilder();
		//Act Statement(s)
		SimpleAsyncTaskSchedulerBuilder result = target.virtualThreads(false);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${21dde231-3965-3602-a630-e377546febd3}, hash: 7EF44D12C689766BA8BD9EA3D941546C
	@Test()
	void taskTerminationTimeoutTest() {
		//Arrange Statement(s)
		SimpleAsyncTaskSchedulerBuilder target = new SimpleAsyncTaskSchedulerBuilder();
		Duration duration = Duration.ofDays(0L);
		//Act Statement(s)
		SimpleAsyncTaskSchedulerBuilder result = target.taskTerminationTimeout(duration);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${096c8c26-248f-3c0b-a109-b0008208dcb4}, hash: 3F890E2F7501FE33F1C7F4F964A7287B
	@Test()
	void customizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			SimpleAsyncTaskSchedulerCustomizer[] simpleAsyncTaskSchedulerCustomizerArray = new SimpleAsyncTaskSchedulerCustomizer[] {};
			_assert.when(() -> Assert.notNull(simpleAsyncTaskSchedulerCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SimpleAsyncTaskSchedulerBuilder target = spy(new SimpleAsyncTaskSchedulerBuilder());
			List<SimpleAsyncTaskSchedulerCustomizer> simpleAsyncTaskSchedulerCustomizerList = new ArrayList<>();
			doReturn(simpleAsyncTaskSchedulerBuilderMock).when(target).customizers(simpleAsyncTaskSchedulerCustomizerList);
			//Act Statement(s)
			SimpleAsyncTaskSchedulerBuilder result = target.customizers(simpleAsyncTaskSchedulerCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(simpleAsyncTaskSchedulerBuilderMock));
				_assert.verify(() -> Assert.notNull(simpleAsyncTaskSchedulerCustomizerArray, "Customizers must not be null"), atLeast(1));
				verify(target).customizers(simpleAsyncTaskSchedulerCustomizerList);
			});
		}
	}

	//Sapient generated method id: ${4093ce62-8361-3b14-be69-19a1177dbf57}, hash: 5B61082EF7C0C80BF6C88262CFD35ED8
	@Test()
	void customizers1WhenSetIsNull() {
		/* Branches:
		 * (set != null) : false  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(additionsMock).forEach((Consumer) any());
			_assert.when(() -> Assert.notNull(additionsMock, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SimpleAsyncTaskSchedulerBuilder target = new SimpleAsyncTaskSchedulerBuilder();
			//Act Statement(s)
			SimpleAsyncTaskSchedulerBuilder result = target.customizers(additionsMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(additionsMock).forEach((Consumer) any());
				_assert.verify(() -> Assert.notNull(additionsMock, "Customizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${01c5b568-1ccf-3f8d-be31-7c6a00d3b86f}, hash: C504E365956CDAA001FBDAB23B839ACA
	@Test()
	void additionalCustomizersTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			SimpleAsyncTaskSchedulerCustomizer[] simpleAsyncTaskSchedulerCustomizerArray = new SimpleAsyncTaskSchedulerCustomizer[] {};
			_assert.when(() -> Assert.notNull(simpleAsyncTaskSchedulerCustomizerArray, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SimpleAsyncTaskSchedulerBuilder target = spy(new SimpleAsyncTaskSchedulerBuilder());
			List<SimpleAsyncTaskSchedulerCustomizer> simpleAsyncTaskSchedulerCustomizerList = new ArrayList<>();
			doReturn(simpleAsyncTaskSchedulerBuilderMock).when(target).additionalCustomizers(simpleAsyncTaskSchedulerCustomizerList);
			//Act Statement(s)
			SimpleAsyncTaskSchedulerBuilder result = target.additionalCustomizers(simpleAsyncTaskSchedulerCustomizerArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(simpleAsyncTaskSchedulerBuilderMock));
				_assert.verify(() -> Assert.notNull(simpleAsyncTaskSchedulerCustomizerArray, "Customizers must not be null"), atLeast(1));
				verify(target).additionalCustomizers(simpleAsyncTaskSchedulerCustomizerList);
			});
		}
	}

	//Sapient generated method id: ${ec4a4216-0b11-3482-8467-7bedcdd174bc}, hash: 81C728D3DC412E1E5ED9F41DADA65F2E
	@Test()
	void additionalCustomizers1WhenSetIsNull() {
		/* Branches:
		 * (set != null) : false  #  inside append method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doNothing().when(additionsMock).forEach((Consumer) any());
			_assert.when(() -> Assert.notNull(additionsMock, "Customizers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SimpleAsyncTaskSchedulerBuilder target = new SimpleAsyncTaskSchedulerBuilder();
			//Act Statement(s)
			SimpleAsyncTaskSchedulerBuilder result = target.additionalCustomizers(additionsMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(additionsMock).forEach((Consumer) any());
				_assert.verify(() -> Assert.notNull(additionsMock, "Customizers must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c319ea97-f8d0-37c4-a5dd-88e142a90c6d}, hash: FCEE250AFCC0C174553783986468C09D
	@Test()
	void buildTest() {
		//Arrange Statement(s)
		SimpleAsyncTaskSchedulerBuilder target = spy(new SimpleAsyncTaskSchedulerBuilder());
		doReturn(simpleAsyncTaskSchedulerMock).when(target).configure((SimpleAsyncTaskScheduler) any());
		//Act Statement(s)
		SimpleAsyncTaskScheduler result = target.build();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(simpleAsyncTaskSchedulerMock));
			verify(target).configure((SimpleAsyncTaskScheduler) any());
		});
	}

	//Sapient generated method id: ${92778da8-5cb9-368b-8e0b-ad44bc4f7017}, hash: B611D52D3C898A3DAEE4D132EDFA62D0
	@Disabled()
	@Test()
	void configureWhenCollectionUtilsIsEmptyThisCustomizers() {
		/* Branches:
		 * (!CollectionUtils.isEmpty(this.customizers)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type PropertyMapper.Source
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		PropertyMapper propertyMapperMock = mock(PropertyMapper.class);
		PropertyMapper propertyMapperMock2 = mock(PropertyMapper.class);
		PropertyMapper.Source propertyMapperSourceMock = mock(PropertyMapper.Source.class);
		try (MockedStatic<PropertyMapper> propertyMapper = mockStatic(PropertyMapper.class)) {
			propertyMapper.when(() -> PropertyMapper.get()).thenReturn(propertyMapperMock);
			doReturn(propertyMapperMock2).when(propertyMapperMock).alwaysApplyingWhenNonNull();
			doReturn(propertyMapperSourceMock).when(propertyMapperMock2).from((String) null);
			doNothing().when(propertyMapperSourceMock).to((Consumer) any());
			PropertyMapper.Source source = propertyMapperMock2.from((Integer) null);
			doReturn(source).when(propertyMapperMock2).from((Integer) null);
			PropertyMapper.Source source2 = propertyMapperMock2.from((Boolean) null);
			doReturn(source2).when(propertyMapperMock2).from((Boolean) null);
			PropertyMapper.Source source3 = propertyMapperMock2.from((Duration) null);
			doReturn(source3).when(propertyMapperMock2).from((Duration) null);
			SimpleAsyncTaskSchedulerBuilder target = new SimpleAsyncTaskSchedulerBuilder();
			//Act Statement(s)
			SimpleAsyncTaskScheduler result = target.configure(simpleAsyncTaskSchedulerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(simpleAsyncTaskSchedulerMock));
				propertyMapper.verify(() -> PropertyMapper.get(), atLeast(1));
				verify(propertyMapperMock).alwaysApplyingWhenNonNull();
				verify(propertyMapperMock2).from((String) null);
				verify(propertyMapperSourceMock).to((Consumer) any());
				verify(propertyMapperMock2).from((Integer) null);
				verify(propertyMapperMock2).from((Boolean) null);
				verify(propertyMapperMock2).from((Duration) null);
			});
		}
	}
}
