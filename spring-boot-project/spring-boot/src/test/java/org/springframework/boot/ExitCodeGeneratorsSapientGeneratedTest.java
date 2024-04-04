package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.mockito.stubbing.Answer;

import java.util.Iterator;

import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import org.springframework.core.annotation.AnnotationAwareOrderComparator;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ExitCodeGeneratorsSapientGeneratedTest {

	private final ExitCodeExceptionMapper exitCodeExceptionMapperMock = mock(ExitCodeExceptionMapper.class);

	private final ExitCodeGenerator exitCodeGeneratorMock = mock(ExitCodeGenerator.class);

	//Sapient generated method id: ${bd3d9c9c-4ad7-30b7-8307-e1834f82694d}, hash: 31BE7D7EC2B6EC4D2FD7108E9665BB2D
	@Test()
	void addAllTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Throwable throwable = new Throwable();
			_assert.when(() -> Assert.notNull(throwable, "Exception must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ExitCodeExceptionMapper[] exitCodeExceptionMapperArray = new ExitCodeExceptionMapper[] {};
			_assert.when(() -> Assert.notNull(exitCodeExceptionMapperArray, "Mappers must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ExitCodeGenerators target = spy(new ExitCodeGenerators());
			List<ExitCodeExceptionMapper> exitCodeExceptionMapperList = new ArrayList<>();
			doNothing().when(target).addAll(throwable, exitCodeExceptionMapperList);
			//Act Statement(s)
			target.addAll(throwable, exitCodeExceptionMapperArray);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(throwable, "Exception must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(exitCodeExceptionMapperArray, "Mappers must not be null"), atLeast(1));
				verify(target).addAll(throwable, exitCodeExceptionMapperList);
			});
		}
	}

	//Sapient generated method id: ${3cebba44-d4fc-3122-b2c3-83b8bfdc1e68}, hash: D1666DEC62CBA24F7CA65BF0DDC33A55
	@Test()
	void addAll1WhenMappersIsNotEmpty() {
		/* Branches:
		 * (for-each(mappers)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Mappers must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ExitCodeGenerators target = spy(new ExitCodeGenerators());
			Throwable throwable = new Throwable();
			doNothing().when(target).add(throwable, exitCodeExceptionMapperMock);
			Iterable<ExitCodeExceptionMapper> iterable = new ArrayList<>(List.of(exitCodeExceptionMapperMock));
			//Act Statement(s)
			target.addAll(throwable, iterable);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Mappers must not be null")), atLeast(1));
				verify(target, atLeast(1)).add(throwable, exitCodeExceptionMapperMock);
			});
		}
	}

	//Sapient generated method id: ${2f52d914-224e-3cf8-a2e5-c61089a0f6f4}, hash: A06531905F02617171348954B36EA231
	@Test()
	void addTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull(exitCodeExceptionMapperMock, "Mapper must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((ExitCodeGenerator) any(), eq("Generator must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ExitCodeGenerators target = new ExitCodeGenerators();
			Throwable throwable = new Throwable();
			//Act Statement(s)
			target.add(throwable, exitCodeExceptionMapperMock);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(exitCodeExceptionMapperMock, "Mapper must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull((ExitCodeGenerator) any(), eq("Generator must not be null")), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4f9e8728-9897-3e4d-94cc-6f5cce10e1be}, hash: 7B9FE661F42E4E8E72D6E6C74D9B82D0
	@Test()
	void addAll2Test() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ExitCodeGenerator[] exitCodeGeneratorArray = new ExitCodeGenerator[] {};
			_assert.when(() -> Assert.notNull(exitCodeGeneratorArray, "Generators must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ExitCodeGenerators target = spy(new ExitCodeGenerators());
			List<ExitCodeGenerator> exitCodeGeneratorList = new ArrayList<>();
			doNothing().when(target).addAll(exitCodeGeneratorList);
			//Act Statement(s)
			target.addAll(exitCodeGeneratorArray);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(exitCodeGeneratorArray, "Generators must not be null"), atLeast(1));
				verify(target).addAll(exitCodeGeneratorList);
			});
		}
	}

	//Sapient generated method id: ${07efa7de-7358-38b4-9119-e0d9001c9353}, hash: 75FE6CC5157DC11AD482E81E65E18615
	@Test()
	void addAll3WhenGeneratorsIsNotEmpty() {
		/* Branches:
		 * (for-each(generators)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<AnnotationAwareOrderComparator> annotationAwareOrderComparator = mockStatic(AnnotationAwareOrderComparator.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((Iterable) any(), eq("Generators must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(exitCodeGeneratorMock, "Generator must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			annotationAwareOrderComparator.when(() -> AnnotationAwareOrderComparator.sort(anyList())).thenAnswer((Answer<Void>) invocation -> null);
			ExitCodeGenerators target = new ExitCodeGenerators();
			Iterable<ExitCodeGenerator> iterable = new ArrayList<>(List.of(exitCodeGeneratorMock));
			//Act Statement(s)
			target.addAll(iterable);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((Iterable) any(), eq("Generators must not be null")));
				_assert.verify(() -> Assert.notNull(exitCodeGeneratorMock, "Generator must not be null"), atLeast(1));
				annotationAwareOrderComparator.verify(() -> AnnotationAwareOrderComparator.sort(anyList()));
			});
		}
	}

	//Sapient generated method id: ${c171c54c-6269-3c0b-b712-82c3caeff653}, hash: 435DEFA87925D3C83300850AA5AA5D24
	@Test()
	void add1Test() {
		//Arrange Statement(s)
		try (MockedStatic<AnnotationAwareOrderComparator> annotationAwareOrderComparator = mockStatic(AnnotationAwareOrderComparator.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(exitCodeGeneratorMock, "Generator must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			annotationAwareOrderComparator.when(() -> AnnotationAwareOrderComparator.sort(anyList())).thenAnswer((Answer<Void>) invocation -> null);
			ExitCodeGenerators target = new ExitCodeGenerators();
			//Act Statement(s)
			target.add(exitCodeGeneratorMock);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull(exitCodeGeneratorMock, "Generator must not be null"), atLeast(1));
				annotationAwareOrderComparator.verify(() -> AnnotationAwareOrderComparator.sort(anyList()));
			});
		}
	}

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}, hash: 6A53036B426906B3F414433BBBD563A0
	@Test()
	void iteratorTest() {
		//Arrange Statement(s)
		ExitCodeGenerators target = new ExitCodeGenerators();

		//Act Statement(s)
		Iterator<ExitCodeGenerator> result = target.iterator();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${d3f1fe3d-c76c-3e96-9886-cf614f870de1}, hash: FFD8844D36F399CFE963B0502C48104C
	@Test()
	void getExitCodeWhenThisGeneratorsIsEmpty() throws Exception {
		/* Branches:
		 * (for-each(this.generators)) : false
		 */
		//Arrange Statement(s)
		ExitCodeGenerators target = new ExitCodeGenerators();

		//Act Statement(s)
		int result = target.getExitCode();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(0)));
	}
}
