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

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertyNameSapientGeneratedTest {

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final Function functionMock = mock(Function.class);

	private final ConfigurationPropertyName n2Mock = mock(ConfigurationPropertyName.class);

	//Sapient generated method id: ${f4596ad2-fcaa-3ae5-b219-deb972de5338}, hash: 5D7959DB5CEFF79B4E1513E20291F21F
	@Disabled()
	@Test()
	void isEmptyWhenThisElementsGetSizeEquals0() {
		/* Branches:
		 * (this.elements.getSize() == 0) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("<value>", '<', functionMock);
		//Act Statement(s)
		boolean result = target.isEmpty();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${88fa19c8-e796-3d0d-8b27-4e5e8f3ea28c}, hash: 2A1364C67565F4FE52126E8A648B987D
	@Disabled()
	@Test()
	void isEmptyWhenThisElementsGetSizeNotEquals0() {
		/* Branches:
		 * (this.elements.getSize() == 0) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "exampleProcessor");
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("exampleName", '-', functionMock);
		//Act Statement(s)
		boolean result = target.isEmpty();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${743bc64a-79ef-32bb-ae4f-d5483ab77361}, hash: 920399A44E1F5AA64D99EC685EB85BEE
	@Disabled()
	@Test()
	void isLastElementIndexedWhenIsIndexedSizeMinus1() {
		/* Branches:
		 * (size > 0) : true
		 * (isIndexed(size - 1)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("<value>", '<', functionMock));
		doReturn(true).when(target).isIndexed(0);
		//Act Statement(s)
		boolean result = target.isLastElementIndexed();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(target).isIndexed(0);
		});
	}

	//Sapient generated method id: ${dffb566d-1c21-30a4-9f2c-92dbb1cfcf29}, hash: 7A1AA3B1527DEF32D3ACE8F3B8500CF0
	@Disabled()
	@Test()
	void isLastElementIndexedWhenIsIndexedNotSizeMinus1() {
		/* Branches:
		 * (size > 0) : true
		 * (isIndexed(size - 1)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("<value>", '<', functionMock));
		doReturn(false).when(target).isIndexed(0);
		//Act Statement(s)
		boolean result = target.isLastElementIndexed();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(target).isIndexed(0);
		});
	}

	//Sapient generated method id: ${c9915a84-d4e3-3a10-a7ef-8edaf94f1726}, hash: A9BFFB79FFF786655E2146743D5AF711
	@Disabled()
	@Test()
	void hasIndexedElementWhenIsIndexedI() {
		/* Branches:
		 * (i < getNumberOfElements()) : true
		 * (isIndexed(i)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("<value>", '<', functionMock));
		doReturn(true).when(target).isIndexed(0);
		//Act Statement(s)
		boolean result = target.hasIndexedElement();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(target).isIndexed(0);
		});
	}

	//Sapient generated method id: ${eca9dbb4-366b-32b0-86e5-571c7d615dc3}, hash: 51FAAD10A7800A3F85FE456B1FB6E6C7
	@Disabled()
	@Test()
	void hasIndexedElementWhenIsIndexedNotI() {
		/* Branches:
		 * (i < getNumberOfElements()) : true
		 * (isIndexed(i)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("<value>", '<', functionMock));
		doReturn(false).when(target).isIndexed(0);
		//Act Statement(s)
		boolean result = target.hasIndexedElement();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(target).isIndexed(0);
		});
	}

	//Sapient generated method id: ${1524a8ad-2b9d-33ba-bc61-f917ca09bee4}, hash: 3B92ED3CE2FE1AF1C1846463AACC60A9
	@Disabled()
	@Test()
	void isIndexedWhenThisElementsGetTypeElementIndexIsIndexed() {
		/* Branches:
		 * (this.elements.getType(elementIndex).isIndexed()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "null");
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("test", '-', functionMock);
		//Act Statement(s)
		boolean result = target.isIndexed(0);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${55125aab-7291-3fd7-a424-cb5c8d9fa8fb}, hash: 778B0A9A92DF8BB8E865BF33A27922E7
	@Disabled()
	@Test()
	void isIndexedWhenThisElementsGetTypeElementIndexNotIsIndexed() {
		/* Branches:
		 * (this.elements.getType(elementIndex).isIndexed()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "null");
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
		//Act Statement(s)
		boolean result = target.isIndexed(0);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${99011359-4aa4-3047-95be-fbac1a4c4639}, hash: 85523EE99CC06460BC41B81DF64997AE
	@Disabled()
	@Test()
	void isNumericIndexWhenThisElementsGetTypeElementIndexEqualsElementTypeNUMERICALLY_INDEXED() {
		/* Branches:
		 * (this.elements.getType(elementIndex) == ElementType.NUMERICALLY_INDEXED) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "null");
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
		//Act Statement(s)
		boolean result = target.isNumericIndex(0);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${13bf2442-e51c-305b-89ea-aec7a9f5a845}, hash: 69C6C6CC856D2D0F15B90FBE42A07F21
	@Disabled()
	@Test()
	void isNumericIndexWhenThisElementsGetTypeElementIndexNotEqualsElementTypeNUMERICALLY_INDEXED() {
		/* Branches:
		 * (this.elements.getType(elementIndex) == ElementType.NUMERICALLY_INDEXED) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "null");
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
		//Act Statement(s)
		boolean result = target.isNumericIndex(0);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${37d3a550-5c79-3b91-8b60-8495b7ec9aab}, hash: 1A1A6FC6CC92AF01166D67974745D2D7
	@Disabled()
	@Test()
	void getLastElementWhenSizeNotEquals0() {
		/* Branches:
		 * (size != 0) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "null");
		ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("example", '-', functionMock));
		doReturn("return_of_getElement1").when(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
		//Act Statement(s)
		String result = target.getLastElement(ConfigurationPropertyName.Form.ORIGINAL);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("return_of_getElement1"));
			verify(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
		});
	}

	//Sapient generated method id: ${6276f483-19d3-3bf7-9dd1-273b9e311dea}, hash: 372AD7E4D4FA7ED1F7D8379CCE06A967
	@Disabled()
	@Test()
	void getLastElementWhenSizeEquals0() {
		/* Branches:
		 * (size != 0) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "null");
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("example", '-', functionMock);
		//Act Statement(s)
		String result = target.getLastElement(ConfigurationPropertyName.Form.ORIGINAL);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("")));
	}

	//Sapient generated method id: ${606c826e-9e9e-3c25-8425-30dd5468c200}, hash: F9FFF2C3BDA1C3DA67D3374FAF1CC2E0
	@Disabled()
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
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("getElement_charSequence1"));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f2dce001-a7db-3e44-8b82-86908bb21bed}, hash: A4DEFF2CF80B0D74DFD8B9EBCCFFDADD
	@Disabled()
	@Test()
	void getElementWhenTypeNotEqualsElementTypeNON_UNIFORM() {
		/* Branches:
		 * (type.isIndexed()) : false
		 * (form == Form.ORIGINAL) : true
		 * (type != ElementType.NON_UNIFORM) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "null");
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("example", '-', functionMock);
		//Act Statement(s)
		String result = target.getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("getElement_charSequence1")));
	}

	//Sapient generated method id: ${b9226000-6776-3725-abd5-5fc101a55d8c}, hash: 7CA83A0A6C106F9C91BA9F3047CE2257
	@Disabled()
	@Test()
	void getElementWhenTypeEqualsElementTypeDASHED() {
		/* Branches:
		 * (type.isIndexed()) : false
		 * (form == Form.ORIGINAL) : false
		 * (form == Form.DASHED) : true
		 * (type == ElementType.UNIFORM) : false
		 * (type == ElementType.DASHED) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "null");
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("example", '-', functionMock);
		//Act Statement(s)
		String result = target.getElement(0, ConfigurationPropertyName.Form.DASHED);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("getElement_charSequence1")));
	}

	//Sapient generated method id: ${20f89634-1757-30ae-86fe-4c1a6982910c}, hash: 079B297EF070B728DB92A3378ACB3224
	@Disabled()
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
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.UNIFORM);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("getElement_charSequence1"));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${cefa584d-7383-397c-a1a9-7de7a840bafb}, hash: 5DCC907EB9F3EB18D021D9F6BC2D8B5C
	@Disabled()
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("A"));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4a51b34a-2727-3536-ae01-8c2407adbed1}, hash: 4493B3A4F2BAFCB0796015035DB9CBEA
	@Disabled()
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.DASHED);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("a"));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${cea76ae0-a9dc-3714-951b-2ee2307ada23}, hash: 21F027C3F4FD00E8BDAC90128CA3328A
	@Disabled()
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
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "null");
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("example", '-', functionMock);
		//Act Statement(s)
		String result = target.getElement(0, ConfigurationPropertyName.Form.UNIFORM);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("")));
	}

	//Sapient generated method id: ${2367b9e3-a480-3321-a4ae-98615f0c4845}, hash: 0392676E7A416FE9453ACE1E71FF7FD6
	@Disabled()
	@Test()
	void getNumberOfElementsTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "exampleProcessor");
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("exampleName", '-', functionMock);
		//Act Statement(s)
		int result = target.getNumberOfElements();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(0)));
	}

	//Sapient generated method id: ${dad83f36-7c06-367a-aa81-1455798d2513}, hash: 875373D82952044D6EC3E816D1C33F1C
	@Test()
	void appendWhenStringUtilsNotHasLengthSuffix() {
		/* Branches:
		 * (!StringUtils.hasLength(suffix)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.append("");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4b9e7357-d7ac-313b-b7ea-1086b15abebc}, hash: 89F8E7F1DC3B64F424D6E5C283B6CA06
	@Disabled()
	@Test()
	void appendWhenNameIsNull() {
		/* Branches:
		 * (!StringUtils.hasLength(suffix)) : false
		 * (name == null) : true  #  inside elementsOf method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "null");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			stringUtils.when(() -> StringUtils.hasLength((String) null)).thenReturn(true);
			_assert.when(() -> Assert.isTrue(false, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("test", '-', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.append((String) null);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				stringUtils.verify(() -> StringUtils.hasLength((String) null), atLeast(1));
				_assert.verify(() -> Assert.isTrue(false, "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${32e66336-84b5-3990-99de-aa40dba2488d}, hash: FF84FD1F61F6F6485154B2F27077966E
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
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.hasLength("")).thenReturn(true);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.append("");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength(""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c1cd3d1a-8f7e-3013-b5a8-a7637605cc58}, hash: 021DF644E4E11ACC0CD73578FC6C3EEB
	@Disabled()
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt((String) null, 'A', functionMock);
			//Act Statement(s)
			final InvalidConfigurationPropertyNameException result = assertThrows(InvalidConfigurationPropertyNameException.class, () -> {
				target.append("suffix1");
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c892a6d5-41c1-30ea-a488-dd758662c766}, hash: F5C7056E823078431CFEDD3D39D821CB
	@Disabled()
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.append("KQ");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3e52cefe-2ddf-3c0d-a140-fbd11f3032dd}, hash: B946D27CC98EAE71E238101758EB5D31
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			final InvalidConfigurationPropertyNameException result = assertThrows(InvalidConfigurationPropertyNameException.class, () -> {
				target.append("DE");
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7b65cb91-8838-33b2-a0c8-d4dd709f903f}, hash: AFBE5466AEF4037B9D53A0E793A05873
	@Test()
	void append1WhenSuffixIsNull() {
		/* Branches:
		 * (suffix == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			ConfigurationPropertyName configurationPropertyName = null;
			//Act Statement(s)
			ConfigurationPropertyName result = target.append(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a3ce3e9f-8901-315a-95cd-1ffffa2e31d8}, hash: 7AAAB80B3A6E64ED7E9FD79D196A5F86
	@Disabled()
	@Test()
	void append1WhenSuffixIsNotNull() {
		/* Branches:
		 * (suffix == null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "testProcessor");
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("testName", '-', functionMock);
		ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("append_configurationPropertyName1-name1");
		//Act Statement(s)
		ConfigurationPropertyName result = target.append(configurationPropertyName);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${8d5834e4-e251-3bb2-be8c-b1391d280df5}, hash: 0E340E5DD968AAFD91ADF16821F2AD2F
	@Disabled()
	@Test()
	void getParentWhenNumberOfElementsLessThanOrEqualsTo1() {
		/* Branches:
		 * (numberOfElements <= 1) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("<value>", '<', functionMock);
		//Act Statement(s)
		ConfigurationPropertyName result = target.getParent();
		ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.EMPTY;
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(configurationPropertyName)));
	}

	//Sapient generated method id: ${0c679d0a-f36e-3d5d-b93a-4b77d27252ce}, hash: 92A455E025576B4A2AD0B6C0BC1B7CB3
	@Disabled()
	@Test()
	void getParentWhenNumberOfElementsGreaterThan1() {
		/* Branches:
		 * (numberOfElements <= 1) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("<value>", '<', functionMock));
		doReturn(configurationPropertyNameMock).when(target).chop(1);
		//Act Statement(s)
		ConfigurationPropertyName result = target.getParent();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(configurationPropertyNameMock));
			verify(target).chop(1);
		});
	}

	//Sapient generated method id: ${138a5323-d04f-398a-8780-1815be54bdbe}, hash: DB3E5DB98770C338EF90796BA69BB04F
	@Disabled()
	@Test()
	void chopWhenSizeGreaterThanOrEqualsToGetNumberOfElements() {
		/* Branches:
		 * (size >= getNumberOfElements()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("John", '-', functionMock);
		//Act Statement(s)
		ConfigurationPropertyName result = target.chop(10);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${4fc3e13d-c0f9-396e-9c13-9b47216f0899}, hash: 33DAD419007BEBB39E817EE927D6F2C5
	@Disabled()
	@Test()
	void chopWhenSizeLessThanGetNumberOfElements() {
		/* Branches:
		 * (size >= getNumberOfElements()) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "null");
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("John", '-', functionMock);
		//Act Statement(s)
		ConfigurationPropertyName result = target.chop(10);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${347ef665-0662-3396-96f8-476448a15026}, hash: 14A6B53C92F7C10A1239290A68A84D09
	@Test()
	void subNameWhenOffsetEquals0() {
		/* Branches:
		 * (offset == 0) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.subName(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ccf6eec0-f07d-398c-b217-c26a9a6ec34b}, hash: 438968DE2D8BE906DAE5E1702B51B5B1
	@Disabled()
	@Test()
	void subNameWhenOffsetEqualsGetNumberOfElements() {
		/* Branches:
		 * (offset == 0) : false
		 * (offset == getNumberOfElements()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "null");
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("example", '-', functionMock);
		//Act Statement(s)
		ConfigurationPropertyName result = target.subName(1);
		ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.EMPTY;
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(configurationPropertyName)));
	}

	//Sapient generated method id: ${f0a05ff4-f4d5-34c6-a323-4109b1b22a7a}, hash: 9AC17B71E58971B1C2AEB02549407D69
	@Disabled()
	@Test()
	void subNameWhenOffsetGreaterThanGetNumberOfElementsThrowsIndexOutOfBoundsException() {
		/* Branches:
		 * (offset == 0) : false
		 * (offset == getNumberOfElements()) : false
		 * (offset < 0) : false
		 * (offset > getNumberOfElements()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "null");
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("example", '-', functionMock);
		IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Offset: 1, NumberOfElements: 2");
		//Act Statement(s)
		final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
			target.subName(1);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
		});
	}

	//Sapient generated method id: ${3b49b001-db6e-3346-813c-51acd4341977}, hash: F565BB175346D70A15BC7FCCF1188A16
	@Disabled()
	@Test()
	void subNameWhenOffsetNotGreaterThanGetNumberOfElements() {
		/* Branches:
		 * (offset == 0) : false
		 * (offset == getNumberOfElements()) : false
		 * (offset < 0) : false
		 * (offset > getNumberOfElements()) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "null");
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("{value=example}", '{', functionMock);
		//Act Statement(s)
		ConfigurationPropertyName result = target.subName(1);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${7393e6ef-1cdb-3d7e-a151-69c57ce7ac40}, hash: 7585B15A56ECC3F18E36A59C9CCA043F
	@Disabled()
	@Test()
	void isParentOfWhenGetNumberOfElementsNotEqualsNameGetNumberOfElementsMinus1() {
		/* Branches:
		 * (getNumberOfElements() != name.getNumberOfElements() - 1) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser, name
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("<value>", '<', functionMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("isParentOf_configurationPropertyName1-name1");
			//Act Statement(s)
			boolean result = target.isParentOf(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null")), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9766f280-514d-36da-a996-214897f48da0}, hash: CFA2FF4A92B3A96ABC128B24F9B4101F
	@Disabled()
	@Test()
	void isParentOfWhenIsAncestorOfName() {
		/* Branches:
		 * (getNumberOfElements() != name.getNumberOfElements() - 1) : false
		 * (isAncestorOf(name)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser, name
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("test", '-', functionMock));
			doReturn(true).when(target).isAncestorOf((ConfigurationPropertyName) any());
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("isParentOf_configurationPropertyName1-name1");
			//Act Statement(s)
			boolean result = target.isParentOf(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null")), atLeast(1));
				verify(target, atLeast(1)).isAncestorOf((ConfigurationPropertyName) any());
			});
		}
	}

	//Sapient generated method id: ${d35f1b79-fd93-31df-905e-d745f15c67a3}, hash: 9B8AA59B12A674779539F66463263869
	@Disabled()
	@Test()
	void isParentOfWhenIsAncestorOfNotName() {
		/* Branches:
		 * (getNumberOfElements() != name.getNumberOfElements() - 1) : false
		 * (isAncestorOf(name)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "exampleProcessor");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("exampleName", '-', functionMock));
			doReturn(false).when(target).isAncestorOf((ConfigurationPropertyName) any());
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("isParentOf_configurationPropertyName1-name1");
			//Act Statement(s)
			boolean result = target.isParentOf(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null")), atLeast(1));
				verify(target, atLeast(1)).isAncestorOf((ConfigurationPropertyName) any());
			});
		}
	}

	//Sapient generated method id: ${3617a22a-65d4-36d5-89eb-fa61397e960a}, hash: E45AD6D9C5B90C974988AE664185F2C8
	@Disabled()
	@Test()
	void isAncestorOfWhenGetNumberOfElementsGreaterThanOrEqualsToNameGetNumberOfElements() {
		/* Branches:
		 * (getNumberOfElements() >= name.getNumberOfElements()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "null");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("test", '-', functionMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("isAncestorOf_configurationPropertyName1-name1");
			//Act Statement(s)
			boolean result = target.isAncestorOf(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null")), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${6e2b95d4-f982-3a21-aaaa-1f77fab9c20b}, hash: 666A907CD1C692301236D0D39B5FB4B4
	@Disabled()
	@Test()
	void isAncestorOfWhenIGreaterThanOrEqualsTo0ThrowsNullPointerException() {
		/* Branches:
		 * (getNumberOfElements() >= name.getNumberOfElements()) : false
		 * (i >= 0) : true  #  inside elementsEqual method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser, name
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("<value>", '<', functionMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("isAncestorOf_configurationPropertyName1-name1");
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.isAncestorOf(configurationPropertyName);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null")), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5daae2e6-cb0f-39cf-a2e6-bbffabc4ebc9}, hash: 4FBDDA6BE41F1021DBE5C4732AB8784A
	@Disabled()
	@Test()
	void isAncestorOfWhenILessThan0() {
		/* Branches:
		 * (getNumberOfElements() >= name.getNumberOfElements()) : false
		 * (i >= 0) : false  #  inside elementsEqual method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser, name
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("<value>", '<', functionMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("isAncestorOf_configurationPropertyName1-name1");
			//Act Statement(s)
			boolean result = target.isAncestorOf(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull((ConfigurationPropertyName) any(), eq("Name must not be null")), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3f99306f-7f4e-34f3-99ce-51cbd9b067bf}, hash: 89945C582A085086A254C94DD8A6556C
	@Test()
	void compareToWhenI2NotLessThanL2() {
		/* Branches:
		 * (i1 < l1) : false  #  inside compare method
		 * (i2 < l2) : false  #  inside compare method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(0).when(n2Mock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			int result = target.compareTo(n2Mock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(0));
				verify(n2Mock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f15ced91-476f-3118-9347-e6d6fe4e136a}, hash: 70C46C642CBB31C74C4B768C2F4DD3A1
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(1).when(n2Mock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.compareTo(n2Mock);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(n2Mock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${155368dd-6252-3895-854f-2166addc2cfe}, hash: 412A34BFF6E9FC339D63333D203B084E
	@Disabled()
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(0).when(n2Mock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			int result = target.compareTo(n2Mock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(-1));
				verify(n2Mock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c00e9222-9dde-3b2c-b737-81bbc3258b96}, hash: 783B6F27688816BA54FD5A025E1D0386
	@Disabled()
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(0).when(n2Mock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
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
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${379fb16a-9f66-3912-89c0-c923f1d04b9e}, hash: AA5BFA19244053993C62628BF52E47FE
	@Disabled()
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
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("<value>", '<', functionMock);
		ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("compareTo_configurationPropertyName1-name1");
		//Act Statement(s)
		int result = target.compareTo(configurationPropertyName);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(1)));
	}

	//Sapient generated method id: ${763e6db3-3721-3433-8032-25809c0bd7ba}, hash: 63719B839834F470D77A62C39CB8F2E1
	@Disabled()
	@Test()
	void toStringWhenThisElementsCanShortcutWithSourceElementTypeUNIFORMElementTypeDASHED() {
		/* Branches:
		 * (this.string == null) : true
		 * (this.elements.canShortcutWithSource(ElementType.UNIFORM, ElementType.DASHED)) : true  #  inside buildToString method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "exampleProcessor");
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("exampleName", '-', functionMock);
		//Act Statement(s)
		String result = target.toString();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("buildToString_charSequence1")));
	}

	//Sapient generated method id: ${b2b0ef0d-b14f-360e-9b74-1bedb98f169b}, hash: E291A52273A6214F737C2547BBA857EB
	@Disabled()
	@Test()
	void toStringWhenIndexed() {
		/* Branches:
		 * (this.string == null) : true
		 * (this.elements.canShortcutWithSource(ElementType.UNIFORM, ElementType.DASHED)) : false  #  inside buildToString method
		 * (i < elements) : true  #  inside buildToString method
		 * (!result.isEmpty()) : false  #  inside buildToString method
		 * (indexed) : true  #  inside buildToString method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "null");
		ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("test", '-', functionMock));
		doReturn(true).when(target).isIndexed(0);
		doReturn("A").when(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
		//Act Statement(s)
		String result = target.toString();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("[A]"));
			verify(target).isIndexed(0);
			verify(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
		});
	}

	//Sapient generated method id: ${90c4017c-9ac9-3dc5-935d-5ef805034a7c}, hash: 554FC08D4FBC169EBE4E418308D9719E
	@Disabled()
	@Test()
	void toStringWhenNotIndexed() {
		/* Branches:
		 * (this.string == null) : true
		 * (this.elements.canShortcutWithSource(ElementType.UNIFORM, ElementType.DASHED)) : false  #  inside buildToString method
		 * (i < elements) : true  #  inside buildToString method
		 * (!result.isEmpty()) : false  #  inside buildToString method
		 * (indexed) : false  #  inside buildToString method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Function functionMock = mock(Function.class, "null");
		ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("test", '-', functionMock));
		doReturn(false).when(target).isIndexed(0);
		doReturn("A").when(target).getElement(0, ConfigurationPropertyName.Form.DASHED);
		//Act Statement(s)
		String result = target.toString();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("A"));
			verify(target).isIndexed(0);
			verify(target).getElement(0, ConfigurationPropertyName.Form.DASHED);
		});
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

	//Sapient generated method id: ${711901d4-0ed2-36db-a259-022dbc7b914c}, hash: 15F3743A990808ED51B8700AA986D91D
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
		ConfigurationPropertyName result = ConfigurationPropertyName.of((CharSequence) "", false);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${0656251b-a4e1-3bac-b147-6eb0888bb576}, hash: 52C44414C44B89C05A4A4DBF865C1EB6
	@Disabled()
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
			ConfigurationPropertyName.of((CharSequence) "name1", false);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${cd3ab7e9-39dc-3956-9ae9-68e1fee39e1f}, hash: F74DC21624A901C33016BA9094289B0B
	@Test()
	void of1WhenReturnNullIfInvalidAndElementsIsNull() {
		/* Branches:
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : false  #  inside elementsOf method
		 * (name.charAt(0) == '.') : false  #  inside elementsOf method
		 * (name.charAt(name.length() - 1) == '.') : true  #  inside elementsOf method
		 * (returnNullIfInvalid) : true  #  inside elementsOf method
		 * (elements != null) : false
		 */
		//Act Statement(s)
		ConfigurationPropertyName result = ConfigurationPropertyName.of((CharSequence) "example.", true);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${1d28567e-e658-3797-9570-edc6c786e383}, hash: B7F6046CC9277B1F7DA8E3A377764D90
	@Disabled()
	@Test()
	void of1WhenElementsGetTypeINotEqualsElementTypeNON_UNIFORMAndElementsIsNotNull() {
		/* Branches:
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : false  #  inside elementsOf method
		 * (name.charAt(0) == '.') : false  #  inside elementsOf method
		 * (name.charAt(name.length() - 1) == '.') : false  #  inside elementsOf method
		 * (i < elements.getSize()) : true  #  inside elementsOf method
		 * (elements.getType(i) == ElementType.NON_UNIFORM) : false  #  inside elementsOf method
		 * (elements != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		ConfigurationPropertyName result = ConfigurationPropertyName.of((CharSequence) "J", false);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${7a2c45a8-4736-343e-9dbb-89e219c5a22b}, hash: C35257EA574EB84C0687C4949BFD65D2
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
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type ConfigurationPropertyName.ElementsParser - Method: parse
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		ConfigurationPropertyName result = ConfigurationPropertyName.of((CharSequence) "exampleName", true);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${f1260875-c4cf-394b-821d-b127960812b5}, hash: 950AD3EB3871F01F609C211E838536AC
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
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type ConfigurationPropertyName.ElementsParser - Method: parse
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		final InvalidConfigurationPropertyNameException result = assertThrows(InvalidConfigurationPropertyNameException.class, () -> {
			ConfigurationPropertyName.of((CharSequence) "exampleName", false);
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

	//Sapient generated method id: ${30cbaeaa-63cc-3ba7-8954-2f85a2857f69}, hash: 7312F5CDAEF517421138887F4D0770F8
	@Test()
	void adapt1WhenNameIsEmpty() {
		/* Branches:
		 * (name.isEmpty()) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			ConfigurationPropertyName result = ConfigurationPropertyName.adapt((CharSequence) "", 'A', functionMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.EMPTY;
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyName));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e3b07462-0103-35eb-8584-6b4fefee9e08}, hash: 98357DDFFB9EFA2983EA7283F0CEE119
	@Disabled()
	@Test()
	void adapt1WhenElementsGetSizeEquals0() {
		/* Branches:
		 * (name.isEmpty()) : false
		 * (elements.getSize() == 0) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		ConfigurationPropertyName result = ConfigurationPropertyName.adapt((CharSequence) "<value>", '<', functionMock);
		ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.EMPTY;
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(configurationPropertyName)));
	}

	//Sapient generated method id: ${305b99c6-6c7c-3b43-afe8-c1aa84b706e9}, hash: D4663F36746DD4B52EC3E41C91D07602
	@Disabled()
	@Test()
	void adapt1WhenElementsGetSizeNotEquals0() {
		/* Branches:
		 * (name.isEmpty()) : false
		 * (elements.getSize() == 0) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		ConfigurationPropertyName result = ConfigurationPropertyName.adapt((CharSequence) "<value>", '<', functionMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
