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
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
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

	private final ConfigurationPropertyName n2Mock = mock(ConfigurationPropertyName.class);

	private final ConfigurationPropertyName nameMock = mock(ConfigurationPropertyName.class);

	//Sapient generated method id: ${f4596ad2-fcaa-3ae5-b219-deb972de5338}
	@Disabled()
	@Test()
	void isEmptyWhenThisElementsGetSizeEquals0() {
		/* Branches:
		 * (this.elements.getSize() == 0) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '<', (Function) null);
		//Act Statement(s)
		boolean result = target.isEmpty();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${88fa19c8-e796-3d0d-8b27-4e5e8f3ea28c}
	@Test()
	void isEmptyWhenThisElementsGetSizeNotEquals0() {
		/* Branches:
		 * (this.elements.getSize() == 0) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '<', (Function) null);
		//Act Statement(s)
		boolean result = target.isEmpty();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${743bc64a-79ef-32bb-ae4f-d5483ab77361}
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
		ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", 'c', (Function) null));
		doReturn(1).when(target).getNumberOfElements();
		doReturn(true).when(target).isIndexed(0);
		//Act Statement(s)
		boolean result = target.isLastElementIndexed();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(target).getNumberOfElements();
			verify(target).isIndexed(0);
		});
	}

	//Sapient generated method id: ${dffb566d-1c21-30a4-9f2c-92dbb1cfcf29}
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
		ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", ',', (Function) null));
		doReturn(1).when(target).getNumberOfElements();
		doReturn(false).when(target).isIndexed(0);
		//Act Statement(s)
		boolean result = target.isLastElementIndexed();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(target).getNumberOfElements();
			verify(target).isIndexed(0);
		});
	}

	//Sapient generated method id: ${c9915a84-d4e3-3a10-a7ef-8edaf94f1726}
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
		ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", ',', (Function) null));
		doReturn(1).when(target).getNumberOfElements();
		doReturn(true).when(target).isIndexed(0);
		//Act Statement(s)
		boolean result = target.hasIndexedElement();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(target).getNumberOfElements();
			verify(target).isIndexed(0);
		});
	}

	//Sapient generated method id: ${eca9dbb4-366b-32b0-86e5-571c7d615dc3}
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
		ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", '<', (Function) null));
		doReturn(false).when(target).isIndexed(0);
		doReturn(1, 0).when(target).getNumberOfElements();
		//Act Statement(s)
		boolean result = target.hasIndexedElement();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(target, times(2)).getNumberOfElements();
			verify(target).isIndexed(0);
		});
	}

	//Sapient generated method id: ${1524a8ad-2b9d-33ba-bc61-f917ca09bee4}
	@Disabled()
	@Test()
	void isIndexedWhenThisElementsGetTypeElementIndexIsIndexed() {
		/* Branches:
		 * (this.elements.getType(elementIndex).isIndexed()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '-', (Function) null);
		//Act Statement(s)
		boolean result = target.isIndexed(0);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${55125aab-7291-3fd7-a424-cb5c8d9fa8fb}
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
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
			//Act Statement(s)
			boolean result = target.isIndexed(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${99011359-4aa4-3047-95be-fbac1a4c4639}
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
		ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", '-', (Function) null);
		//Act Statement(s)
		boolean result = target.isNumericIndex(0);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${13bf2442-e51c-305b-89ea-aec7a9f5a845}
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
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
			//Act Statement(s)
			boolean result = target.isNumericIndex(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${37d3a550-5c79-3b91-8b60-8495b7ec9aab}
	@Test()
	void getLastElementWhenSizeNotEquals0() {
		/* Branches:
		 * (size != 0) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", '-', (Function) null));
		doReturn(1).when(target).getNumberOfElements();
		doReturn("return_of_getElement1").when(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
		//Act Statement(s)
		String result = target.getLastElement(ConfigurationPropertyName.Form.ORIGINAL);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("return_of_getElement1"));
			verify(target).getNumberOfElements();
			verify(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
		});
	}

	//Sapient generated method id: ${6276f483-19d3-3bf7-9dd1-273b9e311dea}
	@Test()
	void getLastElementWhenSizeEquals0() {
		/* Branches:
		 * (size != 0) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", '-', (Function) null));
		doReturn(0).when(target).getNumberOfElements();
		//Act Statement(s)
		String result = target.getLastElement(ConfigurationPropertyName.Form.ORIGINAL);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(""));
			verify(target).getNumberOfElements();
		});
	}

	//Sapient generated method id: ${606c826e-9e9e-3c25-8425-30dd5468c200}
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
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("result1"));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${cefa584d-7383-397c-a1a9-7de7a840bafb}
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
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("result1"));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4a51b34a-2727-3536-ae01-8c2407adbed1}
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
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("result1"));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2367b9e3-a480-3321-a4ae-98615f0c4845}
	@Disabled()
	@Test()
	void getNumberOfElementsTest() {
		/**
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
			//Act Statement(s)
			int result = target.getNumberOfElements();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(0));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${dad83f36-7c06-367a-aa81-1455798d2513}
	@Test()
	void appendWhenStringUtilsNotHasLengthSuffix() {
		/* Branches:
		 * (!StringUtils.hasLength(suffix)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
			//Act Statement(s)
			ConfigurationPropertyName result = target.append("A");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4b9e7357-d7ac-313b-b7ea-1086b15abebc}
	@Disabled()
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.hasLength((String) null)).thenReturn(true);
			_assert.when(() -> Assert.isTrue(false, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
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

	//Sapient generated method id: ${32e66336-84b5-3990-99de-aa40dba2488d}
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
			//Act Statement(s)
			ConfigurationPropertyName result = target.append("suffix1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c1cd3d1a-8f7e-3013-b5a8-a7637605cc58}
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
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
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

	//Sapient generated method id: ${c892a6d5-41c1-30ea-a488-dd758662c766}
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
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
			//Act Statement(s)
			ConfigurationPropertyName result = target.append("J");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3e52cefe-2ddf-3c0d-a140-fbd11f3032dd}
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
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
			//Act Statement(s)
			final InvalidConfigurationPropertyNameException result = assertThrows(InvalidConfigurationPropertyNameException.class, () -> {
				target.append("C");
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7b65cb91-8838-33b2-a0c8-d4dd709f903f}
	@Test()
	void append1WhenSuffixIsNull() {
		/* Branches:
		 * (suffix == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
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

	//Sapient generated method id: ${a3ce3e9f-8901-315a-95cd-1ffffa2e31d8}
	@Disabled()
	@Test()
	void append1WhenSuffixIsNotNull() {
		/* Branches:
		 * (suffix == null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
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

	//Sapient generated method id: ${8d5834e4-e251-3bb2-be8c-b1391d280df5}
	@Test()
	void getParentWhenNumberOfElementsLessThanOrEqualsTo1() {
		/* Branches:
		 * (numberOfElements <= 1) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null));
			doReturn(0).when(target).getNumberOfElements();
			//Act Statement(s)
			ConfigurationPropertyName result = target.getParent();
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.EMPTY;
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyName));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				verify(target).getNumberOfElements();
			});
		}
	}

	//Sapient generated method id: ${0c679d0a-f36e-3d5d-b93a-4b77d27252ce}
	@Test()
	void getParentWhenNumberOfElementsGreaterThan1() {
		/* Branches:
		 * (numberOfElements <= 1) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null));
			doReturn(2).when(target).getNumberOfElements();
			doReturn(configurationPropertyNameMock).when(target).chop(1);
			//Act Statement(s)
			ConfigurationPropertyName result = target.getParent();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyNameMock));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				verify(target).getNumberOfElements();
				verify(target).chop(1);
			});
		}
	}

	//Sapient generated method id: ${138a5323-d04f-398a-8780-1815be54bdbe}
	@Test()
	void chopWhenSizeGreaterThanOrEqualsToGetNumberOfElements() {
		/* Branches:
		 * (size >= getNumberOfElements()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null));
			doReturn(0).when(target).getNumberOfElements();
			//Act Statement(s)
			ConfigurationPropertyName result = target.chop(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				verify(target).getNumberOfElements();
			});
		}
	}

	//Sapient generated method id: ${4fc3e13d-c0f9-396e-9c13-9b47216f0899}
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
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null));
			doReturn(1).when(target).getNumberOfElements();
			//Act Statement(s)
			ConfigurationPropertyName result = target.chop(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				verify(target).getNumberOfElements();
			});
		}
	}

	//Sapient generated method id: ${347ef665-0662-3396-96f8-476448a15026}
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
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
			//Act Statement(s)
			ConfigurationPropertyName result = target.subName(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ccf6eec0-f07d-398c-b217-c26a9a6ec34b}
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null));
			doReturn(1).when(target).getNumberOfElements();
			//Act Statement(s)
			ConfigurationPropertyName result = target.subName(1);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.EMPTY;
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyName));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				verify(target).getNumberOfElements();
			});
		}
	}

	//Sapient generated method id: ${f0a05ff4-f4d5-34c6-a323-4109b1b22a7a}
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null));
			doReturn(3, 0, 2).when(target).getNumberOfElements();
			//Act Statement(s)
			final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
				target.subName(2);
			});
			IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Offset: 2, NumberOfElements: 2");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				verify(target, times(3)).getNumberOfElements();
			});
		}
	}

	//Sapient generated method id: ${3b49b001-db6e-3346-813c-51acd4341977}
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null));
			doReturn(2, 1).when(target).getNumberOfElements();
			//Act Statement(s)
			ConfigurationPropertyName result = target.subName(1);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				verify(target, times(2)).getNumberOfElements();
			});
		}
	}

	//Sapient generated method id: ${7393e6ef-1cdb-3d7e-a151-69c57ce7ac40}
	@Test()
	void isParentOfWhenGetNumberOfElementsNotEqualsNameGetNumberOfElementsMinus1() {
		/* Branches:
		 * (getNumberOfElements() != name.getNumberOfElements() - 1) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(1).when(nameMock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null));
			doReturn(1).when(target).getNumberOfElements();
			//Act Statement(s)
			boolean result = target.isParentOf(nameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				verify(nameMock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				verify(target).getNumberOfElements();
			});
		}
	}

	//Sapient generated method id: ${9766f280-514d-36da-a996-214897f48da0}
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(1).when(nameMock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null));
			doReturn(0).when(target).getNumberOfElements();
			doReturn(true).when(target).isAncestorOf(nameMock);
			//Act Statement(s)
			boolean result = target.isParentOf(nameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				verify(nameMock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				verify(target).getNumberOfElements();
				verify(target).isAncestorOf(nameMock);
			});
		}
	}

	//Sapient generated method id: ${d35f1b79-fd93-31df-905e-d745f15c67a3}
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(1).when(nameMock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null));
			doReturn(0).when(target).getNumberOfElements();
			doReturn(false).when(target).isAncestorOf(nameMock);
			//Act Statement(s)
			boolean result = target.isParentOf(nameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				verify(nameMock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				verify(target).getNumberOfElements();
				verify(target).isAncestorOf(nameMock);
			});
		}
	}

	//Sapient generated method id: ${3617a22a-65d4-36d5-89eb-fa61397e960a}
	@Test()
	void isAncestorOfWhenGetNumberOfElementsGreaterThanOrEqualsToNameGetNumberOfElements() {
		/* Branches:
		 * (getNumberOfElements() >= name.getNumberOfElements()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(0).when(nameMock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null));
			doReturn(0).when(target).getNumberOfElements();
			//Act Statement(s)
			boolean result = target.isAncestorOf(nameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				verify(nameMock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				verify(target).getNumberOfElements();
			});
		}
	}

	//Sapient generated method id: ${6e2b95d4-f982-3a21-aaaa-1f77fab9c20b}
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(1).when(nameMock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null));
			doReturn(0).when(target).getNumberOfElements();
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
				verify(target).getNumberOfElements();
			});
		}
	}

	//Sapient generated method id: ${5daae2e6-cb0f-39cf-a2e6-bbffabc4ebc9}
	@Disabled()
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(1).when(nameMock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null));
			doReturn(0).when(target).getNumberOfElements();
			//Act Statement(s)
			boolean result = target.isAncestorOf(nameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				verify(nameMock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				verify(target).getNumberOfElements();
			});
		}
	}

	//Sapient generated method id: ${3f99306f-7f4e-34f3-99ce-51cbd9b067bf}
	@Disabled()
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(0).when(n2Mock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
			//Act Statement(s)
			int result = target.compareTo(n2Mock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(0));
				verify(n2Mock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f15ced91-476f-3118-9347-e6d6fe4e136a}
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
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
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

	//Sapient generated method id: ${155368dd-6252-3895-854f-2166addc2cfe}
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
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
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

	//Sapient generated method id: ${c00e9222-9dde-3b2c-b737-81bbc3258b96}
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
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
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

	//Sapient generated method id: ${379fb16a-9f66-3912-89c0-c923f1d04b9e}
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
			doReturn(0).when(n2Mock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
			//Act Statement(s)
			int result = target.compareTo(n2Mock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(1));
				verify(n2Mock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${763e6db3-3721-3433-8032-25809c0bd7ba}
	@Disabled()
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("buildToString_charSequence1"));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${bdf9caf2-174d-3c0e-8641-ba714d57898e}
	@Disabled()
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null));
			doReturn(1).when(target).getNumberOfElements();
			doReturn(false).when(target).isIndexed(0);
			doReturn("A").when(target).getElement(0, ConfigurationPropertyName.Form.DASHED);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(".A"));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				verify(target).getNumberOfElements();
				verify(target).isIndexed(0);
				verify(target).getElement(0, ConfigurationPropertyName.Form.DASHED);
			});
		}
	}

	//Sapient generated method id: ${b2b0ef0d-b14f-360e-9b74-1bedb98f169b}
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null));
			doReturn(1).when(target).getNumberOfElements();
			doReturn(true).when(target).isIndexed(0);
			doReturn("A").when(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("[A]"));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
				verify(target).getNumberOfElements();
				verify(target).isIndexed(0);
				verify(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			});
		}
	}

	//Sapient generated method id: ${6e61ee1e-4207-3f48-bcec-6ed4c0229294}
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

	//Sapient generated method id: ${65dbb7f9-8067-39ca-a271-d4ddd22c74ab}
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

	//Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}
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

	//Sapient generated method id: ${43991db9-68c0-3f0d-b3e2-c8e9c3e6b36b}
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

	//Sapient generated method id: ${253cb848-d0c8-3394-a070-ecd777efd8ab}
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

	//Sapient generated method id: ${711901d4-0ed2-36db-a259-022dbc7b914c}
	@Disabled()
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
		ConfigurationPropertyName result = ConfigurationPropertyName.of("of_charSequence1", false);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${0656251b-a4e1-3bac-b147-6eb0888bb576}
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

	//Sapient generated method id: ${cd3ab7e9-39dc-3956-9ae9-68e1fee39e1f}
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
		ConfigurationPropertyName result = ConfigurationPropertyName.of("of_charSequence1", true);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${1eaa7bd3-b6b5-3b6f-a123-e6685b4b7a73}
	@Disabled()
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
		ConfigurationPropertyName result = ConfigurationPropertyName.of("of_charSequence1", false);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${7a2c45a8-4736-343e-9dbb-89e219c5a22b}
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
		ConfigurationPropertyName result = ConfigurationPropertyName.of("of_charSequence1", true);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${f1260875-c4cf-394b-821d-b127960812b5}
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
			ConfigurationPropertyName.of("of_charSequence1", false);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${7cb0c307-0ab8-33fc-b482-896df948fd60}
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

	//Sapient generated method id: ${30cbaeaa-63cc-3ba7-8954-2f85a2857f69}
	@Disabled()
	@Test()
	void adapt1WhenNameIsEmpty() {
		/* Branches:
		 * (name.isEmpty()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//TODO: Needs initialization with real value
			Function function = null;
			//Act Statement(s)
			ConfigurationPropertyName result = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', function);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.EMPTY;
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyName));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${305b99c6-6c7c-3b43-afe8-c1aa84b706e9}
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
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("adapt_charSequence1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//TODO: Needs initialization with real value
			Function function = null;
			//Act Statement(s)
			ConfigurationPropertyName result = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', function);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("adapt_charSequence1", "Name must not be null"), atLeast(1));
			});
		}
	}
}
