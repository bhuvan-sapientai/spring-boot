package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.util.StringUtils;
import org.springframework.util.Assert;

import java.util.function.Function;

import org.mockito.MockedStatic;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertyNameSapientGeneratedTest {

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final Function functionMock = mock(Function.class, "null");

	private final ConfigurationPropertyName n2Mock = mock(ConfigurationPropertyName.class);

	//Sapient generated method id: ${f4596ad2-fcaa-3ae5-b219-deb972de5338}, hash: EF9A5314312E83867C9FCA282E76EBB5
	@Test()
	void isEmptyWhenThisElementsGetSizeEquals0() {
		/* Branches:
		 * (this.elements.getSize() == 0) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock);
			//Act Statement(s)
			boolean result = target.isEmpty();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${88fa19c8-e796-3d0d-8b27-4e5e8f3ea28c}, hash: ED8E638C6E36CBCEED1EF5A0F9D0277F
	@Test()
	void isEmptyWhenThisElementsGetSizeNotEquals0() {
		/* Branches:
		 * (this.elements.getSize() == 0) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock);
			//Act Statement(s)
			boolean result = target.isEmpty();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${743bc64a-79ef-32bb-ae4f-d5483ab77361}, hash: 14F24130E715BA54BAFD20881E1CFEAD
	@Test()
	void isLastElementIndexedWhenIsIndexedSizeMinus1() {
		/* Branches:
		 * (size > 0) : true
		 * (isIndexed(size - 1)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock));
			doReturn(true).when(target).isIndexed(0);
			//Act Statement(s)
			boolean result = target.isLastElementIndexed();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				verify(target).isIndexed(0);
			});
		}
	}

	//Sapient generated method id: ${dffb566d-1c21-30a4-9f2c-92dbb1cfcf29}, hash: 5056C6E36F480D99D37862E1E2C56FBF
	@Test()
	void isLastElementIndexedWhenIsIndexedNotSizeMinus1() {
		/* Branches:
		 * (size > 0) : true
		 * (isIndexed(size - 1)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock));
			doReturn(false).when(target).isIndexed(0);
			//Act Statement(s)
			boolean result = target.isLastElementIndexed();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				verify(target).isIndexed(0);
			});
		}
	}

	//Sapient generated method id: ${c9915a84-d4e3-3a10-a7ef-8edaf94f1726}, hash: F87893A5B8B00D17B5B0BCF48201E320
	@Test()
	void hasIndexedElementWhenIsIndexedI() {
		/* Branches:
		 * (i < getNumberOfElements()) : true
		 * (isIndexed(i)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock));
			doReturn(true).when(target).isIndexed(0);
			//Act Statement(s)
			boolean result = target.hasIndexedElement();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				verify(target).isIndexed(0);
			});
		}
	}

	//Sapient generated method id: ${eca9dbb4-366b-32b0-86e5-571c7d615dc3}, hash: B79509407EE0091F0E88830631CEBD17
	@Test()
	void hasIndexedElementWhenIsIndexedNotI() {
		/* Branches:
		 * (i < getNumberOfElements()) : true
		 * (isIndexed(i)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock));
			doReturn(false).when(target).isIndexed(0);
			//Act Statement(s)
			boolean result = target.hasIndexedElement();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				verify(target).isIndexed(0);
			});
		}
	}

	//Sapient generated method id: ${1524a8ad-2b9d-33ba-bc61-f917ca09bee4}, hash: 70F3120BFFBE69965A0E2D19A6989A3D
	@Test()
	void isIndexedWhenThisElementsGetTypeElementIndexIsIndexed() {
		/* Branches:
		 * (this.elements.getType(elementIndex).isIndexed()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			boolean result = target.isIndexed(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${55125aab-7291-3fd7-a424-cb5c8d9fa8fb}, hash: BE55A8C443C45B69CB7AD69022910C58
	@Test()
	void isIndexedWhenThisElementsGetTypeElementIndexNotIsIndexed() {
		/* Branches:
		 * (this.elements.getType(elementIndex).isIndexed()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			boolean result = target.isIndexed(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${99011359-4aa4-3047-95be-fbac1a4c4639}, hash: 86467B732501F52ECEE957ABCCCF26D0
	@Test()
	void isNumericIndexWhenThisElementsGetTypeElementIndexEqualsElementTypeNUMERICALLY_INDEXED() {
		/* Branches:
		 * (this.elements.getType(elementIndex) == ElementType.NUMERICALLY_INDEXED) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			boolean result = target.isNumericIndex(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${13bf2442-e51c-305b-89ea-aec7a9f5a845}, hash: 06DFACCEF638E76B1F8BA209DBDDB25F
	@Test()
	void isNumericIndexWhenThisElementsGetTypeElementIndexNotEqualsElementTypeNUMERICALLY_INDEXED() {
		/* Branches:
		 * (this.elements.getType(elementIndex) == ElementType.NUMERICALLY_INDEXED) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			boolean result = target.isNumericIndex(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${37d3a550-5c79-3b91-8b60-8495b7ec9aab}, hash: 29194009110C522D8025237812ADB7DD
	@Test()
	void getLastElementWhenSizeNotEquals0() {
		/* Branches:
		 * (size != 0) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", '-', functionMock));
			doReturn("return_of_getElement1").when(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			//Act Statement(s)
			String result = target.getLastElement(ConfigurationPropertyName.Form.ORIGINAL);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_getElement1"));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				verify(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			});
		}
	}

	//Sapient generated method id: ${6276f483-19d3-3bf7-9dd1-273b9e311dea}, hash: B35D4A3581F418FD43F6E850DC52CE14
	@Test()
	void getLastElementWhenSizeEquals0() {
		/* Branches:
		 * (size != 0) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '-', functionMock);
			//Act Statement(s)
			String result = target.getLastElement(ConfigurationPropertyName.Form.ORIGINAL);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(""));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${606c826e-9e9e-3c25-8425-30dd5468c200}, hash: F400530D7E8A266DCF306E943AD505E8
	@Test()
	void getElementWhenTypeIsIndexed() {
		/* Branches:
		 * (type.isIndexed()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("getElement_charSequence1"));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f2dce001-a7db-3e44-8b82-86908bb21bed}, hash: 8EBAD61A75D6589F84D340FEF9D42A14
	@Test()
	void getElementWhenTypeNotEqualsElementTypeNON_UNIFORM() {
		/* Branches:
		 * (type.isIndexed()) : false
		 * (form == Form.ORIGINAL) : true
		 * (type != ElementType.NON_UNIFORM) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("getElement_charSequence1"));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b9226000-6776-3725-abd5-5fc101a55d8c}, hash: 3A04F5C0DC7DABD361902E02CA9C77A2
	@Test()
	void getElementWhenTypeEqualsElementTypeDASHED() {
		/* Branches:
		 * (type.isIndexed()) : false
		 * (form == Form.ORIGINAL) : false
		 * (form == Form.DASHED) : true
		 * (type == ElementType.UNIFORM) : false
		 * (type == ElementType.DASHED) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.DASHED);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("getElement_charSequence1"));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${20f89634-1757-30ae-86fe-4c1a6982910c}, hash: 4DCDCD6A8EB7A7556A9908CC5D155998
	@Test()
	void getElementWhenTypeEqualsElementTypeUNIFORM() {
		/* Branches:
		 * (type.isIndexed()) : false
		 * (form == Form.ORIGINAL) : false
		 * (form == Form.DASHED) : false
		 * (uniformElement == null) : true
		 * (type != ElementType.UNIFORM) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.UNIFORM);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("getElement_charSequence1"));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${cefa584d-7383-397c-a1a9-7de7a840bafb}, hash: 4F2E441BA80B7B043E2B6CBC0B7F31A7
	@Test()
	void getElementWhenFilterTestChI() {
		/* Branches:
		 * (type.isIndexed()) : false
		 * (form == Form.ORIGINAL) : true
		 * (type != ElementType.NON_UNIFORM) : false
		 * (i < element.length()) : true  #  inside convertElement method
		 * (lowercase) : false  #  inside convertElement method
		 * (filter.test(ch, i)) : true  #  inside convertElement method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("A"));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4a51b34a-2727-3536-ae01-8c2407adbed1}, hash: 9189814CB00C74B1A15DB8A6A4CF5FCA
	@Test()
	void getElementWhenLowercaseAndFilterTestChI() {
		/* Branches:
		 * (type.isIndexed()) : false
		 * (form == Form.ORIGINAL) : false
		 * (form == Form.DASHED) : true
		 * (type == ElementType.UNIFORM) : false
		 * (type == ElementType.DASHED) : false
		 * (i < element.length()) : true  #  inside convertElement method
		 * (lowercase) : true  #  inside convertElement method
		 * (filter.test(ch, i)) : true  #  inside convertElement method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.DASHED);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("B"));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${cea76ae0-a9dc-3714-951b-2ee2307ada23}, hash: A3D5514C8CEA2AFA9C3BEB885C8C11A7
	@Test()
	void getElementWhenILessThanElementLengthAndLowercaseAndFilterTestChI() {
		/* Branches:
		 * (type.isIndexed()) : false
		 * (form == Form.ORIGINAL) : false
		 * (form == Form.DASHED) : false
		 * (uniformElement == null) : true
		 * (type != ElementType.UNIFORM) : true
		 * (i < element.length()) : true  #  inside convertElement method
		 * (lowercase) : true  #  inside convertElement method
		 * (filter.test(ch, i)) : true  #  inside convertElement method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.UNIFORM);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(""));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2367b9e3-a480-3321-a4ae-98615f0c4845}, hash: 6C22ABEA12FC36ED1E165A5E23E6047C
	@Test()
	void getNumberOfElementsTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock);
			//Act Statement(s)
			int result = target.getNumberOfElements();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(0));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${dad83f36-7c06-367a-aa81-1455798d2513}, hash: ADA347A663667B4D5D3A974A88FE27CF
	@Test()
	void appendWhenStringUtilsNotHasLengthSuffix() {
		/* Branches:
		 * (!StringUtils.hasLength(suffix)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.hasLength("<value>")).thenReturn(false);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.append("<value>");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("<value>"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4b9e7357-d7ac-313b-b7ea-1086b15abebc}, hash: 67BE12AF38C76170604B9CC1D9DA175F
	@Test()
	void appendWhenNameIsNull() {
		/* Branches:
		 * (!StringUtils.hasLength(suffix)) : false
		 * (name == null) : true  #  inside elementsOf method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.hasLength((String) null)).thenReturn(true);
			_assert.when(() -> Assert.isTrue(false, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.append((String) null);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength((String) null), atLeast(1));
				_assert.verify(() -> Assert.isTrue(false, "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${32e66336-84b5-3990-99de-aa40dba2488d}, hash: CBA424D724874EC8328512A83D91C5FE
	@Test()
	void appendWhenNameIsEmpty() {
		/* Branches:
		 * (!StringUtils.hasLength(suffix)) : false
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : true  #  inside elementsOf method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.hasLength("suffix1")).thenReturn(true);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.append("suffix1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("suffix1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c1cd3d1a-8f7e-3013-b5a8-a7637605cc58}, hash: EB81AE7C51ABEDDDE3FF9B1A26A829DC
	@Test()
	void appendWhenNotReturnNullIfInvalidThrowsInvalidConfigurationPropertyNameException() {
		/* Branches:
		 * (!StringUtils.hasLength(suffix)) : false
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : false  #  inside elementsOf method
		 * (name.charAt(0) == '.') : false  #  inside elementsOf method
		 * (name.charAt(name.length() - 1) == '.') : true  #  inside elementsOf method
		 * (returnNullIfInvalid) : false  #  inside elementsOf method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.hasLength("suffix1")).thenReturn(true);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			final InvalidConfigurationPropertyNameException result = assertThrows(InvalidConfigurationPropertyNameException.class, () -> {
				target.append("suffix1");
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("suffix1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c892a6d5-41c1-30ea-a488-dd758662c766}, hash: 9EB01F5B4A9E37F705E5F10D7E0A2459
	@Test()
	void appendWhenElementsGetTypeINotEqualsElementTypeNON_UNIFORM() {
		/* Branches:
		 * (!StringUtils.hasLength(suffix)) : false
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : false  #  inside elementsOf method
		 * (name.charAt(0) == '.') : false  #  inside elementsOf method
		 * (name.charAt(name.length() - 1) == '.') : false  #  inside elementsOf method
		 * (i < elements.getSize()) : true  #  inside elementsOf method
		 * (elements.getType(i) == ElementType.NON_UNIFORM) : false  #  inside elementsOf method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.hasLength("suffix1")).thenReturn(true);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.append("suffix1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("suffix1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3e52cefe-2ddf-3c0d-a140-fbd11f3032dd}, hash: 45AD70666E9C18E5D7198D71D4195CB3
	@Test()
	void appendWhenElementsParserNotIsValidCharChCharIndexThrowsInvalidConfigurationPropertyNameException() {
		/* Branches:
		 * (!StringUtils.hasLength(suffix)) : false
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : false  #  inside elementsOf method
		 * (name.charAt(0) == '.') : false  #  inside elementsOf method
		 * (name.charAt(name.length() - 1) == '.') : false  #  inside elementsOf method
		 * (i < elements.getSize()) : true  #  inside elementsOf method
		 * (elements.getType(i) == ElementType.NON_UNIFORM) : true  #  inside elementsOf method
		 * (returnNullIfInvalid) : false  #  inside elementsOf method
		 * (charIndex < elements.getLength(index)) : true  #  inside getInvalidChars method
		 * (!ElementsParser.isValidChar(ch, charIndex)) : true  #  inside getInvalidChars method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.hasLength("suffix1")).thenReturn(true);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			final InvalidConfigurationPropertyNameException result = assertThrows(InvalidConfigurationPropertyNameException.class, () -> {
				target.append("suffix1");
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("suffix1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7b65cb91-8838-33b2-a0c8-d4dd709f903f}, hash: C4AD3F77B9E0F2716FF428B06DE32323
	@Test()
	void append1WhenSuffixIsNull() {
		/* Branches:
		 * (suffix == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock);
			ConfigurationPropertyName configurationPropertyName = null;
			//Act Statement(s)
			ConfigurationPropertyName result = target.append(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a3ce3e9f-8901-315a-95cd-1ffffa2e31d8}, hash: D8C59A1958F252D4F3A0945F7B4B28A1
	@Test()
	void append1WhenSuffixIsNotNull() {
		/* Branches:
		 * (suffix == null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("append_configurationPropertyName1-name1");
			//Act Statement(s)
			ConfigurationPropertyName result = target.append(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${8d5834e4-e251-3bb2-be8c-b1391d280df5}, hash: F418DD058013883357101888DB11E5C7
	@Test()
	void getParentWhenNumberOfElementsLessThanOrEqualsTo1() {
		/* Branches:
		 * (numberOfElements <= 1) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.getParent();
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.EMPTY;
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyName));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${0c679d0a-f36e-3d5d-b93a-4b77d27252ce}, hash: B661A55C4739F0E536E60604D2D083A6
	@Test()
	void getParentWhenNumberOfElementsGreaterThan1() {
		/* Branches:
		 * (numberOfElements <= 1) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock));
			doReturn(configurationPropertyNameMock).when(target).chop(1);
			//Act Statement(s)
			ConfigurationPropertyName result = target.getParent();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyNameMock));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				verify(target).chop(1);
			});
		}
	}

	//Sapient generated method id: ${138a5323-d04f-398a-8780-1815be54bdbe}, hash: 8AEFBD44D113F7B894DFC8A62C556227
	@Test()
	void chopWhenSizeGreaterThanOrEqualsToGetNumberOfElements() {
		/* Branches:
		 * (size >= getNumberOfElements()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "someFunction");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '-', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.chop(10);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4fc3e13d-c0f9-396e-9c13-9b47216f0899}, hash: 06A2FD2E58B4A1EB48BFA3C1AF771F65
	@Test()
	void chopWhenSizeLessThanGetNumberOfElements() {
		/* Branches:
		 * (size >= getNumberOfElements()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '-', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.chop(5);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${347ef665-0662-3396-96f8-476448a15026}, hash: F16DBF3A82610F2489C8534E47D625D2
	@Test()
	void subNameWhenOffsetEquals0() {
		/* Branches:
		 * (offset == 0) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.subName(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ccf6eec0-f07d-398c-b217-c26a9a6ec34b}, hash: 9EF7FD3419864803C2F1FE0934AF0B9E
	@Test()
	void subNameWhenOffsetEqualsGetNumberOfElements() {
		/* Branches:
		 * (offset == 0) : false
		 * (offset == getNumberOfElements()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '-', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.subName(1);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.EMPTY;
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyName));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f0a05ff4-f4d5-34c6-a323-4109b1b22a7a}, hash: F359C71B0F057CCE869DF71F9BB323F1
	@Test()
	void subNameWhenOffsetGreaterThanGetNumberOfElementsThrowsIndexOutOfBoundsException() {
		/* Branches:
		 * (offset == 0) : false
		 * (offset == getNumberOfElements()) : false
		 * (offset < 0) : false
		 * (offset > getNumberOfElements()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '-', functionMock);
			//Act Statement(s)
			final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
				target.subName(1);
			});
			IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Offset: 1, NumberOfElements: 2");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3b49b001-db6e-3346-813c-51acd4341977}, hash: 453AE006190BC53D07461A13DA8C517E
	@Test()
	void subNameWhenOffsetNotGreaterThanGetNumberOfElements() {
		/* Branches:
		 * (offset == 0) : false
		 * (offset == getNumberOfElements()) : false
		 * (offset < 0) : false
		 * (offset > getNumberOfElements()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.subName(1);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7393e6ef-1cdb-3d7e-a151-69c57ce7ac40}, hash: CB28AF257B94F773D98357134460F9D2
	@Test()
	void isParentOfWhenGetNumberOfElementsNotEqualsNameGetNumberOfElementsMinus1() {
		/* Branches:
		 * (getNumberOfElements() != name.getNumberOfElements() - 1) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("isParentOf_configurationPropertyName1-name1");
			//Act Statement(s)
			boolean result = target.isParentOf(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null")));
			});
		}
	}

	//Sapient generated method id: ${9766f280-514d-36da-a996-214897f48da0}, hash: 7626A58699B98513A0B2CB7F8A342B12
	@Test()
	void isParentOfWhenIsAncestorOfName() {
		/* Branches:
		 * (getNumberOfElements() != name.getNumberOfElements() - 1) : false
		 * (isAncestorOf(name)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock));
			doReturn(true).when(target).isAncestorOf((ConfigurationPropertyName) any());
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("isParentOf_configurationPropertyName1-name1");
			//Act Statement(s)
			boolean result = target.isParentOf(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null")));
				verify(target).isAncestorOf((ConfigurationPropertyName) any());
			});
		}
	}

	//Sapient generated method id: ${d35f1b79-fd93-31df-905e-d745f15c67a3}, hash: 5D92ACE7BF1CF3D5D0FE23A800AA9163
	@Test()
	void isParentOfWhenIsAncestorOfNotName() {
		/* Branches:
		 * (getNumberOfElements() != name.getNumberOfElements() - 1) : false
		 * (isAncestorOf(name)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock));
			doReturn(false).when(target).isAncestorOf((ConfigurationPropertyName) any());
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("isParentOf_configurationPropertyName1-name1");
			//Act Statement(s)
			boolean result = target.isParentOf(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null")));
				verify(target).isAncestorOf((ConfigurationPropertyName) any());
			});
		}
	}

	//Sapient generated method id: ${3617a22a-65d4-36d5-89eb-fa61397e960a}, hash: 45867B758436E6A6DC05942A487657A1
	@Test()
	void isAncestorOfWhenGetNumberOfElementsGreaterThanOrEqualsToNameGetNumberOfElements() {
		/* Branches:
		 * (getNumberOfElements() >= name.getNumberOfElements()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("isAncestorOf_configurationPropertyName1-name1");
			//Act Statement(s)
			boolean result = target.isAncestorOf(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null")));
			});
		}
	}

	//Sapient generated method id: ${6e2b95d4-f982-3a21-aaaa-1f77fab9c20b}, hash: 728B1F883D7A28543CB5A5AF975D6E71
	@Test()
	void isAncestorOfWhenIGreaterThanOrEqualsTo0ThrowsNullPointerException() {
		/* Branches:
		 * (getNumberOfElements() >= name.getNumberOfElements()) : false
		 * (i >= 0) : true  #  inside elementsEqual method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName nameMock = mock(ConfigurationPropertyName.class);
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(1).when(nameMock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock);
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.isAncestorOf(nameMock);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5daae2e6-cb0f-39cf-a2e6-bbffabc4ebc9}, hash: 8193E9CB8E4EE2CE52DEEA31DE7ECCAD
	@Test()
	void isAncestorOfWhenILessThan0() {
		/* Branches:
		 * (getNumberOfElements() >= name.getNumberOfElements()) : false
		 * (i >= 0) : false  #  inside elementsEqual method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("isAncestorOf_configurationPropertyName1-name1");
			//Act Statement(s)
			boolean result = target.isAncestorOf(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null")));
			});
		}
	}

	//Sapient generated method id: ${3f99306f-7f4e-34f3-99ce-51cbd9b067bf}, hash: 1E9518910BBD504BC81054A303BC4974
	@Test()
	void compareToWhenI2NotLessThanL2() {
		/* Branches:
		 * (i1 < l1) : false  #  inside compare method
		 * (i2 < l2) : false  #  inside compare method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("compareTo_configurationPropertyName1-name1");
			//Act Statement(s)
			int result = target.compareTo(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(0));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f15ced91-476f-3118-9347-e6d6fe4e136a}, hash: C992C6C719FDDED74578FFAE237C0991
	@Test()
	void compareToWhenI1NotLessThanL1AndI2LessThanL2ThrowsNullPointerException() {
		/* Branches:
		 * (i1 < l1) : false  #  inside compare method
		 * (i2 < l2) : true  #  inside compare method
		 * (i1 < l1) : false  #  inside compare method
		 * (i2 < l2) : true  #  inside compare method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(1).when(n2Mock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock);
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.compareTo(n2Mock);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(n2Mock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${155368dd-6252-3895-854f-2166addc2cfe}, hash: 18C67AA6F09FF888E69371930A000E5A
	@Test()
	void compareToWhenResultNotEquals0() {
		/* Branches:
		 * (i1 < l1) : true  #  inside compare method
		 * (i1 < l1) : true  #  inside compare method
		 * (i2 < l2) : false  #  inside compare method
		 * (i1 < l1) : true  #  inside compare method
		 * (i2 < l2) : false  #  inside compare method
		 * (e1 == null) : true  #  inside compare method
		 * (result != 0) : true  #  inside compare method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(0).when(n2Mock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			int result = target.compareTo(n2Mock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(-1));
				verify(n2Mock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c00e9222-9dde-3b2c-b737-81bbc3258b96}, hash: D66D4356EE6920952BB8347B724AE4B1
	@Test()
	void compareToWhenCaughtArrayIndexOutOfBoundsExceptionThrowsRuntimeException() {
		/* Branches:
		 * (i1 < l1) : true  #  inside compare method
		 * (i1 < l1) : true  #  inside compare method
		 * (i2 < l2) : false  #  inside compare method
		 * (i1 < l1) : true  #  inside compare method
		 * (i2 < l2) : false  #  inside compare method
		 * (e1 == null) : true  #  inside compare method
		 * (result != 0) : true  #  inside compare method
		 * (catch-exception (ArrayIndexOutOfBoundsException)) : true  #  inside compare method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(0).when(n2Mock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', functionMock);
			//Act Statement(s)
			final RuntimeException result = assertThrows(RuntimeException.class, () -> {
				target.compareTo(n2Mock);
			});
			ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(arrayIndexOutOfBoundsException.getClass())));
				verify(n2Mock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${379fb16a-9f66-3912-89c0-c923f1d04b9e}, hash: 0F3B8F571069812F74BE61A7E0BCD03F
	@Test()
	void compareToWhenE2IsNullAndResultNotEquals0() {
		/* Branches:
		 * (i1 < l1) : true  #  inside compare method
		 * (i1 < l1) : true  #  inside compare method
		 * (i2 < l2) : false  #  inside compare method
		 * (i1 < l1) : true  #  inside compare method
		 * (i2 < l2) : false  #  inside compare method
		 * (e1 == null) : false  #  inside compare method
		 * (e2 == null) : true  #  inside compare method
		 * (result != 0) : true  #  inside compare method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '-', functionMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("compareTo_configurationPropertyName1-name1");
			//Act Statement(s)
			int result = target.compareTo(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(1));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${763e6db3-3721-3433-8032-25809c0bd7ba}, hash: 891ECB678000BADACC6174B6715F9A98
	@Test()
	void toStringWhenThisElementsCanShortcutWithSourceElementTypeUNIFORMElementTypeDASHED() {
		/* Branches:
		 * (this.string == null) : true
		 * (this.elements.canShortcutWithSource(ElementType.UNIFORM, ElementType.DASHED)) : true  #  inside buildToString method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("buildToString_charSequence1"));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${bdf9caf2-174d-3c0e-8641-ba714d57898e}, hash: A0E6A511DBDE90219C00DFDA096A7AA0
	@Test()
	void toStringWhenNotIndexedAndNotIndexed() {
		/* Branches:
		 * (this.string == null) : true
		 * (this.elements.canShortcutWithSource(ElementType.UNIFORM, ElementType.DASHED)) : false  #  inside buildToString method
		 * (i < elements) : true  #  inside buildToString method
		 * (!result.isEmpty()) : true  #  inside buildToString method
		 * (!indexed) : true  #  inside buildToString method
		 * (indexed) : false  #  inside buildToString method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock));
			doReturn(false).when(target).isIndexed(0);
			doReturn("A").when(target).getElement(0, ConfigurationPropertyName.Form.DASHED);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(".A"));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				verify(target).isIndexed(0);
				verify(target).getElement(0, ConfigurationPropertyName.Form.DASHED);
			});
		}
	}

	//Sapient generated method id: ${b2b0ef0d-b14f-360e-9b74-1bedb98f169b}, hash: A927569376A5C8BC9B4FAE403691F776
	@Test()
	void toStringWhenIndexed() {
		/* Branches:
		 * (this.string == null) : true
		 * (this.elements.canShortcutWithSource(ElementType.UNIFORM, ElementType.DASHED)) : false  #  inside buildToString method
		 * (i < elements) : true  #  inside buildToString method
		 * (!result.isEmpty()) : true  #  inside buildToString method
		 * (!indexed) : false  #  inside buildToString method
		 * (indexed) : true  #  inside buildToString method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", '<', functionMock));
			doReturn(true).when(target).isIndexed(0);
			doReturn("A").when(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("[A]"));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				verify(target).isIndexed(0);
				verify(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			});
		}
	}

	//Sapient generated method id: ${6e61ee1e-4207-3f48-bcec-6ed4c0229294}, hash: 67F7F2F953E1B94364F8DCE639585D01
	@Test()
	void isValidWhenOfNameTrueIsNotNull() {
		/* Branches:
		 * (of(name, true) != null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class, CALLS_REAL_METHODS)) {
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("isValid_charSequence1", true)).thenReturn(configurationPropertyNameMock);
			//Act Statement(s)
			boolean result = ConfigurationPropertyName.isValid("isValid_charSequence1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("isValid_charSequence1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${65dbb7f9-8067-39ca-a271-d4ddd22c74ab}, hash: 8F89D620E1775A1757EA4AD79D7155F3
	@Test()
	void isValidWhenOfNameTrueIsNull() {
		/* Branches:
		 * (of(name, true) != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class, CALLS_REAL_METHODS)) {
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("isValid_charSequence1", true)).thenReturn(null);
			//Act Statement(s)
			boolean result = ConfigurationPropertyName.isValid("isValid_charSequence1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("isValid_charSequence1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}, hash: 697F0A6368585ACD0687E8A9BBCADAF4
	@Test()
	void ofTest() {
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class, CALLS_REAL_METHODS)) {
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("of_charSequence1", false)).thenReturn(configurationPropertyNameMock);
			//Act Statement(s)
			ConfigurationPropertyName result = ConfigurationPropertyName.of("of_charSequence1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyNameMock));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("of_charSequence1", false), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${43991db9-68c0-3f0d-b3e2-c8e9c3e6b36b}, hash: CC021FE18A0986EF751E599996025F5D
	@Test()
	void ofIfValidTest() {
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class, CALLS_REAL_METHODS)) {
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("ofIfValid_charSequence1", true)).thenReturn(configurationPropertyNameMock);
			//Act Statement(s)
			ConfigurationPropertyName result = ConfigurationPropertyName.ofIfValid("ofIfValid_charSequence1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyNameMock));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("ofIfValid_charSequence1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${253cb848-d0c8-3394-a070-ecd777efd8ab}, hash: E7200D38645C9B888E6ACBA47132B31E
	@Test()
	void of1WhenElementsIsNull() {
		/* Branches:
		 * (name == null) : true  #  inside elementsOf method
		 * (elements != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.isTrue(false, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			CharSequence charSequence = null;
			//Act Statement(s)
			ConfigurationPropertyName result = ConfigurationPropertyName.of(charSequence, false);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.isTrue(false, "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${711901d4-0ed2-36db-a259-022dbc7b914c}, hash: 010B540929DD14CB0C9D144B885E06C9
	@Test()
	void of1WhenElementsIsNotNull() {
		/* Branches:
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : true  #  inside elementsOf method
		 * (elements != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */

		//Act Statement(s)
		ConfigurationPropertyName result = ConfigurationPropertyName.of((CharSequence) "of_charSequence1", false);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${0656251b-a4e1-3bac-b147-6eb0888bb576}, hash: 322B323505CD5CD52E8B1157D939E9AC
	@Test()
	void of1WhenNotReturnNullIfInvalidThrowsInvalidConfigurationPropertyNameException() {
		/* Branches:
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : false  #  inside elementsOf method
		 * (name.charAt(0) == '.') : false  #  inside elementsOf method
		 * (name.charAt(name.length() - 1) == '.') : true  #  inside elementsOf method
		 * (returnNullIfInvalid) : false  #  inside elementsOf method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		final InvalidConfigurationPropertyNameException result = assertThrows(InvalidConfigurationPropertyNameException.class, () -> {
			ConfigurationPropertyName.of("of_charSequence1", false);
		});

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${cd3ab7e9-39dc-3956-9ae9-68e1fee39e1f}, hash: A8226EA2E1D533F139BA11BBEF0D3A46
	@Test()
	void of1WhenReturnNullIfInvalidAndElementsIsNull() {
		/* Branches:
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : false  #  inside elementsOf method
		 * (name.charAt(0) == '.') : false  #  inside elementsOf method
		 * (name.charAt(name.length() - 1) == '.') : true  #  inside elementsOf method
		 * (returnNullIfInvalid) : true  #  inside elementsOf method
		 * (elements != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */

		//Act Statement(s)
		ConfigurationPropertyName result = ConfigurationPropertyName.of((CharSequence) "test", true);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${1eaa7bd3-b6b5-3b6f-a123-e6685b4b7a73}, hash: 1D60923CDB682DD868B695B89F019712
	@Test()
	void of1WhenElementsGetTypeINotEqualsElementTypeNON_UNIFORMAndElementsIsNull() {
		/* Branches:
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : false  #  inside elementsOf method
		 * (name.charAt(0) == '.') : false  #  inside elementsOf method
		 * (name.charAt(name.length() - 1) == '.') : false  #  inside elementsOf method
		 * (i < elements.getSize()) : true  #  inside elementsOf method
		 * (elements.getType(i) == ElementType.NON_UNIFORM) : false  #  inside elementsOf method
		 * (elements != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */

		//Act Statement(s)
		ConfigurationPropertyName result = ConfigurationPropertyName.of((CharSequence) "of_charSequence1", false);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${7a2c45a8-4736-343e-9dbb-89e219c5a22b}, hash: C87F42400C5F50611B4480729761E272
	@Test()
	void of1WhenElementsGetTypeIEqualsElementTypeNON_UNIFORMAndReturnNullIfInvalidAndElementsIsNull() {
		/* Branches:
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : false  #  inside elementsOf method
		 * (name.charAt(0) == '.') : false  #  inside elementsOf method
		 * (name.charAt(name.length() - 1) == '.') : false  #  inside elementsOf method
		 * (i < elements.getSize()) : true  #  inside elementsOf method
		 * (elements.getType(i) == ElementType.NON_UNIFORM) : true  #  inside elementsOf method
		 * (returnNullIfInvalid) : true  #  inside elementsOf method
		 * (elements != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */

		//Act Statement(s)
		ConfigurationPropertyName result = ConfigurationPropertyName.of((CharSequence) "of_charSequence1", true);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${f1260875-c4cf-394b-821d-b127960812b5}, hash: 3D42EDDCC2D6E9DAA552E6D0A7285150
	@Test()
	void of1WhenElementsParserNotIsValidCharChCharIndexThrowsInvalidConfigurationPropertyNameException() {
		/* Branches:
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : false  #  inside elementsOf method
		 * (name.charAt(0) == '.') : false  #  inside elementsOf method
		 * (name.charAt(name.length() - 1) == '.') : false  #  inside elementsOf method
		 * (i < elements.getSize()) : true  #  inside elementsOf method
		 * (elements.getType(i) == ElementType.NON_UNIFORM) : true  #  inside elementsOf method
		 * (returnNullIfInvalid) : false  #  inside elementsOf method
		 * (charIndex < elements.getLength(index)) : true  #  inside getInvalidChars method
		 * (!ElementsParser.isValidChar(ch, charIndex)) : true  #  inside getInvalidChars method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		final InvalidConfigurationPropertyNameException result = assertThrows(InvalidConfigurationPropertyNameException.class, () -> {
			ConfigurationPropertyName.of((CharSequence) "of_charSequence1", false);
		});

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${7cb0c307-0ab8-33fc-b482-896df948fd60}, hash: 4394A27981FD50994928DB10CDF17317
	@Test()
	void adaptTest() {
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class, CALLS_REAL_METHODS)) {
			configurationPropertyName.when(() -> ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null)).thenReturn(configurationPropertyNameMock);
			//Act Statement(s)
			ConfigurationPropertyName result = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A');
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyNameMock));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${30cbaeaa-63cc-3ba7-8954-2f85a2857f69}, hash: 2CB171A4B34E695FAC31D3D5F533EB4E
	@Test()
	void adapt1WhenNameIsEmpty() {
		/* Branches:
		 * (name.isEmpty()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			ConfigurationPropertyName result = ConfigurationPropertyName.adapt((CharSequence) "adapt_charSequence1", '-', functionMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.EMPTY;
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyName));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${305b99c6-6c7c-3b43-afe8-c1aa84b706e9}, hash: 854ECDF65343A71F370B7FD9C2B7C567
	@Test()
	void adapt1WhenElementsGetSizeNotEquals0() {
		/* Branches:
		 * (name.isEmpty()) : false
		 * (elements.getSize() == 0) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			ConfigurationPropertyName result = ConfigurationPropertyName.adapt((CharSequence) "adapt_charSequence1", '-', functionMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}
}
