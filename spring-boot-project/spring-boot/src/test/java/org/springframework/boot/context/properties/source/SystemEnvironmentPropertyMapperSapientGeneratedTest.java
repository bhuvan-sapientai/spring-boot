package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;

import org.mockito.MockedStatic;

import java.util.function.BiPredicate;
import java.util.ArrayList;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SystemEnvironmentPropertyMapperSapientGeneratedTest {

	private final ConfigurationPropertyName nameMock = mock(ConfigurationPropertyName.class);

	//Sapient generated method id: ${0d351d26-e57f-3cfd-8d08-746ed9b81454}, hash: 613F79C169D89BA8F89F863D6AE20959
	@Test()
	void mapWhenResultNotIsEmptyAndNameEqualsLegacyName() {
		/* Branches:
		 * (i < numberOfElements) : true  #  inside convertName method
		 * (!result.isEmpty()) : true  #  inside convertName method
		 * (i < name.getNumberOfElements()) : true  #  inside convertLegacyName method
		 * (!result.isEmpty()) : true  #  inside convertLegacyName method
		 * (name.equals(legacyName)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(1).when(nameMock).getNumberOfElements();
		doReturn("uniform").when(nameMock).getElement(0, ConfigurationPropertyName.Form.UNIFORM);
		doReturn("uniform").when(nameMock).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
		SystemEnvironmentPropertyMapper target = new SystemEnvironmentPropertyMapper();

		//Act Statement(s)
		List<String> result = target.map(nameMock);
		List<String> stringResultList = new ArrayList<>(List.of("_UNIFORM"));

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(stringResultList.size()));
			assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
			verify(nameMock, times(3)).getNumberOfElements();
			verify(nameMock).getElement(0, ConfigurationPropertyName.Form.UNIFORM);
			verify(nameMock).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
		});
	}

	//Sapient generated method id: ${11c06ecb-0abf-3531-b987-8b008d643352}, hash: 5951147EBB4CFA3C905D93ACE3C67870
	@Test()
	void mapWhenResultNotIsEmptyAndNameNotEqualsLegacyName() {
		/* Branches:
		 * (i < numberOfElements) : true  #  inside convertName method
		 * (!result.isEmpty()) : true  #  inside convertName method
		 * (i < name.getNumberOfElements()) : true  #  inside convertLegacyName method
		 * (!result.isEmpty()) : true  #  inside convertLegacyName method
		 * (name.equals(legacyName)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(1).when(nameMock).getNumberOfElements();
		doReturn("A").when(nameMock).getElement(0, ConfigurationPropertyName.Form.UNIFORM);
		doReturn("uniform").when(nameMock).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
		SystemEnvironmentPropertyMapper target = new SystemEnvironmentPropertyMapper();

		//Act Statement(s)
		List<String> result = target.map(nameMock);
		List<String> stringResultList = new ArrayList<>(List.of("_A", "_UNIFORM"));

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(stringResultList.size()));
			assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
			verify(nameMock, times(3)).getNumberOfElements();
			verify(nameMock).getElement(0, ConfigurationPropertyName.Form.UNIFORM);
			verify(nameMock).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
		});
	}

	//Sapient generated method id: ${a03b9a38-0fc2-3b2d-973b-ea8a4e60d386}, hash: 56C2043B8BA4F14CFBF76CEFAAD32C72
	@Test()
	void map1Test() throws Exception {
		//Arrange Statement(s)
		ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class)) {
			configurationPropertyName.when(() -> ConfigurationPropertyName.adapt(eq("propertySourceName1"), eq('_'), (Function) any())).thenReturn(configurationPropertyNameMock);
			SystemEnvironmentPropertyMapper target = new SystemEnvironmentPropertyMapper();
			//Act Statement(s)
			ConfigurationPropertyName result = target.map("propertySourceName1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyNameMock));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.adapt(eq("propertySourceName1"), eq('_'), (Function) any()));
			});
		}
	}

	//Sapient generated method id: ${3f6cd547-d0d1-3672-8525-a059e4dfae64}, hash: 60B7B41C8AFADC12FB05AE6EA0150B2B
	@Test()
	void map1WhenCaughtException() throws Exception {
		/* Branches:
		 * (catch-exception (Exception)) : true  #  inside convertName method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class)) {
			RuntimeException runtimeException = new RuntimeException();
			configurationPropertyName.when(() -> ConfigurationPropertyName.adapt(eq("propertySourceName1"), eq('_'), (Function) any())).thenThrow(runtimeException);
			SystemEnvironmentPropertyMapper target = new SystemEnvironmentPropertyMapper();
			//Act Statement(s)
			ConfigurationPropertyName result = target.map("propertySourceName1");
			ConfigurationPropertyName configurationPropertyName2 = ConfigurationPropertyName.EMPTY;
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyName2));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.adapt(eq("propertySourceName1"), eq('_'), (Function) any()));
			});
		}
	}

	//Sapient generated method id: ${5a09359f-c11e-36ef-92e0-2b5a2904a585}, hash: 26E917B0AF1848A42F285FE729570B27
	@Test()
	void getAncestorOfCheckTest() {
		//Arrange Statement(s)
		SystemEnvironmentPropertyMapper target = new SystemEnvironmentPropertyMapper();

		//Act Statement(s)
		BiPredicate<ConfigurationPropertyName, ConfigurationPropertyName> result = target.getAncestorOfCheck();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${edd849b5-1e5a-340e-8273-6132a91ffdf7}, hash: F1061E34AB8C05C9F9E723D30FAFC476
	@Test()
	void hasDashedEntriesWhenNameGetElementIFormDASHEDIndexOf___NotEqualsMinus1() {
		/* Branches:
		 * (i < name.getNumberOfElements()) : true
		 * (name.getElement(i, Form.DASHED).indexOf('-') != -1) : true
		 */
		//Arrange Statement(s)
		doReturn(1).when(nameMock).getNumberOfElements();
		doReturn("-").when(nameMock).getElement(0, ConfigurationPropertyName.Form.DASHED);
		SystemEnvironmentPropertyMapper target = new SystemEnvironmentPropertyMapper();

		//Act Statement(s)
		boolean result = target.hasDashedEntries(nameMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(nameMock).getNumberOfElements();
			verify(nameMock).getElement(0, ConfigurationPropertyName.Form.DASHED);
		});
	}

	//Sapient generated method id: ${c99744fc-f6bf-3272-93b1-a09fed4b25ae}, hash: 4AC4F6A1266E71E4DC6DA062C0A7DB97
	@Test()
	void hasDashedEntriesWhenNameGetElementIFormDASHEDIndexOf___EqualsMinus1() {
		/* Branches:
		 * (i < name.getNumberOfElements()) : true
		 * (name.getElement(i, Form.DASHED).indexOf('-') != -1) : false
		 */
		doReturn("").when(nameMock).getElement(0, ConfigurationPropertyName.Form.DASHED);
		doReturn(1, 0).when(nameMock).getNumberOfElements();
		SystemEnvironmentPropertyMapper target = new SystemEnvironmentPropertyMapper();

		//Act Statement(s)
		boolean result = target.hasDashedEntries(nameMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(nameMock, times(2)).getNumberOfElements();
			verify(nameMock).getElement(0, ConfigurationPropertyName.Form.DASHED);
		});
	}
}
