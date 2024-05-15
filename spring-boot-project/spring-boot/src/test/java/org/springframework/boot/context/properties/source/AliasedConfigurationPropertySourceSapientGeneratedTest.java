package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.mockito.stubbing.Answer;
import java.util.Iterator;
import org.springframework.util.Assert;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AliasedConfigurationPropertySourceSapientGeneratedTest {

    private final ConfigurationPropertySource sourceMock = mock(ConfigurationPropertySource.class, "source");

    private final ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);

    private final ConfigurationPropertyNameAliases configurationPropertyNameAliasesMock = mock(ConfigurationPropertyNameAliases.class);

    private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

    private final ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class);

    private final ConfigurationPropertyName configurationPropertyNameMock3 = mock(ConfigurationPropertyName.class);

    private final ConfigurationPropertyName nameMock = mock(ConfigurationPropertyName.class);

    //Sapient generated method id: ${getConfigurationPropertyWhenResultIsNull}, hash: C3E1683F9054AC6439666E93180E2C1F
    @Test()
    void getConfigurationPropertyWhenResultIsNull() {
        /* Branches:
         * (result == null) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(null).when(sourceMock).getConfigurationProperty(configurationPropertyNameMock);
            doReturn(configurationPropertyMock).when(sourceMock).getConfigurationProperty(configurationPropertyNameMock2);
            doReturn(configurationPropertyNameMock2).when(configurationPropertyNameAliasesMock).getNameForAlias(configurationPropertyNameMock);
            _assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            AliasedConfigurationPropertySource target = new AliasedConfigurationPropertySource(sourceMock, configurationPropertyNameAliasesMock);
            //Act Statement(s)
            ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(configurationPropertyMock));
                verify(sourceMock).getConfigurationProperty(configurationPropertyNameMock);
                verify(sourceMock).getConfigurationProperty(configurationPropertyNameMock2);
                verify(configurationPropertyNameAliasesMock).getNameForAlias(configurationPropertyNameMock);
                _assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${containsDescendantOfWhenResultNotEqualsConfigurationPropertyStateABSENT}, hash: 7F126117F029916232B95617F483922A
    @Test()
    void containsDescendantOfWhenResultNotEqualsConfigurationPropertyStateABSENT() {
        /* Branches:
         * (result != ConfigurationPropertyState.ABSENT) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            AliasedConfigurationPropertySource target = new AliasedConfigurationPropertySource(sourceMock, configurationPropertyNameAliasesMock);
            doReturn(ConfigurationPropertyState.PRESENT).when(sourceMock).containsDescendantOf(configurationPropertyNameMock);
            //Act Statement(s)
            ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
                _assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
                verify(sourceMock).containsDescendantOf(configurationPropertyNameMock);
            });
        }
    }

    //Sapient generated method id: ${containsDescendantOfWhenAliasResultNotEqualsConfigurationPropertyStateABSENT}, hash: DDB3D0FF16AF55B94D319E68BEF210F2
    @Test()
    void containsDescendantOfWhenAliasResultNotEqualsConfigurationPropertyStateABSENT() {
        /* Branches:
         * (result != ConfigurationPropertyState.ABSENT) : false
         * (for-each(getAliases().getAliases(name))) : true
         * (aliasResult != ConfigurationPropertyState.ABSENT) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
            configurationPropertyNameList.add(configurationPropertyNameMock);
            doReturn(configurationPropertyNameList).when(configurationPropertyNameAliasesMock).getAliases(configurationPropertyNameMock2);
            _assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(configurationPropertyNameMock2, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            AliasedConfigurationPropertySource target = new AliasedConfigurationPropertySource(sourceMock, configurationPropertyNameAliasesMock);
            doReturn(ConfigurationPropertyState.ABSENT).when(sourceMock).containsDescendantOf(configurationPropertyNameMock2);
            doReturn(ConfigurationPropertyState.UNKNOWN).when(sourceMock).containsDescendantOf(configurationPropertyNameMock);
            //Act Statement(s)
            ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.UNKNOWN));
                verify(configurationPropertyNameAliasesMock).getAliases(configurationPropertyNameMock2);
                _assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(configurationPropertyNameMock2, "Name must not be null"), atLeast(1));
                verify(sourceMock).containsDescendantOf(configurationPropertyNameMock2);
                verify(sourceMock).containsDescendantOf(configurationPropertyNameMock);
            });
        }
    }

    //Sapient generated method id: ${containsDescendantOfWhenNameIsAncestorOfAliasAndThisSourceGetConfigurationPropertyFromIsNotNull}, hash: B0B1A4E32DE6F97CC1F080AE201E3552
    @Test()
    void containsDescendantOfWhenNameIsAncestorOfAliasAndThisSourceGetConfigurationPropertyFromIsNotNull() {
        /* Branches:
         * (result != ConfigurationPropertyState.ABSENT) : false
         * (for-each(getAliases().getAliases(name))) : true
         * (aliasResult != ConfigurationPropertyState.ABSENT) : false
         * (for-each(getAliases())) : true
         * (for-each(getAliases().getAliases(from))) : true
         * (name.isAncestorOf(alias)) : true
         * (this.source.getConfigurationProperty(from) != null) : true
         */
         //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(true).when(nameMock).isAncestorOf(configurationPropertyNameMock);
            List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
            configurationPropertyNameList.add(configurationPropertyNameMock2);
            doReturn(configurationPropertyNameList).when(configurationPropertyNameAliasesMock).getAliases(nameMock);
            List<ConfigurationPropertyName> configurationPropertyNameList2 = new ArrayList<>();
            configurationPropertyNameList2.add(configurationPropertyNameMock3);
            Iterator<ConfigurationPropertyName> iterator = configurationPropertyNameList2.iterator();
            doReturn(iterator).when(configurationPropertyNameAliasesMock).iterator();
            List<ConfigurationPropertyName> configurationPropertyNameList3 = new ArrayList<>();
            configurationPropertyNameList3.add(configurationPropertyNameMock);
            doReturn(configurationPropertyNameList3).when(configurationPropertyNameAliasesMock).getAliases(configurationPropertyNameMock3);
            _assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            AliasedConfigurationPropertySource target = new AliasedConfigurationPropertySource(sourceMock, configurationPropertyNameAliasesMock);
            doReturn(ConfigurationPropertyState.ABSENT).when(sourceMock).containsDescendantOf(nameMock);
            doReturn(ConfigurationPropertyState.ABSENT).when(sourceMock).containsDescendantOf(configurationPropertyNameMock2);
            doReturn(configurationPropertyMock).when(sourceMock).getConfigurationProperty(configurationPropertyNameMock3);
            //Act Statement(s)
            ConfigurationPropertyState result = target.containsDescendantOf(nameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
                verify(nameMock).isAncestorOf(configurationPropertyNameMock);
                verify(configurationPropertyNameAliasesMock).getAliases(nameMock);
                verify(configurationPropertyNameAliasesMock).iterator();
                verify(configurationPropertyNameAliasesMock).getAliases(configurationPropertyNameMock3);
                _assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
                verify(sourceMock).containsDescendantOf(nameMock);
                verify(sourceMock).containsDescendantOf(configurationPropertyNameMock2);
                verify(sourceMock).getConfigurationProperty(configurationPropertyNameMock3);
            });
        }
    }

    //Sapient generated method id: ${containsDescendantOfWhenNameIsAncestorOfAliasAndThisSourceGetConfigurationPropertyFromIsNull}, hash: BCB10AC593D810C714C94686C21D7906
    @Test()
    void containsDescendantOfWhenNameIsAncestorOfAliasAndThisSourceGetConfigurationPropertyFromIsNull() {
        /* Branches:
         * (result != ConfigurationPropertyState.ABSENT) : false
         * (for-each(getAliases().getAliases(name))) : true
         * (aliasResult != ConfigurationPropertyState.ABSENT) : false
         * (for-each(getAliases())) : true
         * (for-each(getAliases().getAliases(from))) : true
         * (name.isAncestorOf(alias)) : true
         * (this.source.getConfigurationProperty(from) != null) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            doReturn(true).when(nameMock).isAncestorOf(configurationPropertyNameMock);
            List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
            configurationPropertyNameList.add(configurationPropertyNameMock2);
            doReturn(configurationPropertyNameList).when(configurationPropertyNameAliasesMock).getAliases(nameMock);
            List<ConfigurationPropertyName> configurationPropertyNameList2 = new ArrayList<>();
            configurationPropertyNameList2.add(configurationPropertyNameMock3);
            Iterator<ConfigurationPropertyName> iterator = configurationPropertyNameList2.iterator();
            doReturn(iterator).when(configurationPropertyNameAliasesMock).iterator();
            List<ConfigurationPropertyName> configurationPropertyNameList3 = new ArrayList<>();
            configurationPropertyNameList3.add(configurationPropertyNameMock);
            doReturn(configurationPropertyNameList3).when(configurationPropertyNameAliasesMock).getAliases(configurationPropertyNameMock3);
            _assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            AliasedConfigurationPropertySource target = new AliasedConfigurationPropertySource(sourceMock, configurationPropertyNameAliasesMock);
            doReturn(ConfigurationPropertyState.ABSENT).when(sourceMock).containsDescendantOf(nameMock);
            doReturn(ConfigurationPropertyState.ABSENT).when(sourceMock).containsDescendantOf(configurationPropertyNameMock2);
            doReturn(null).when(sourceMock).getConfigurationProperty(configurationPropertyNameMock3);
            //Act Statement(s)
            ConfigurationPropertyState result = target.containsDescendantOf(nameMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
                verify(nameMock).isAncestorOf(configurationPropertyNameMock);
                verify(configurationPropertyNameAliasesMock).getAliases(nameMock);
                verify(configurationPropertyNameAliasesMock).iterator();
                verify(configurationPropertyNameAliasesMock).getAliases(configurationPropertyNameMock3);
                _assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
                verify(sourceMock).containsDescendantOf(nameMock);
                verify(sourceMock).containsDescendantOf(configurationPropertyNameMock2);
                verify(sourceMock).getConfigurationProperty(configurationPropertyNameMock3);
            });
        }
    }

    //Sapient generated method id: ${getUnderlyingSourceTest}, hash: D728E67873080913969B8CFBE2FFEA38
    @Test()
    void getUnderlyingSourceTest() {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            _assert.when(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            AliasedConfigurationPropertySource target = new AliasedConfigurationPropertySource(sourceMock, configurationPropertyNameAliasesMock);
            Object object = new Object();
            doReturn(object).when(sourceMock).getUnderlyingSource();
            //Act Statement(s)
            Object result = target.getUnderlyingSource();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(object));
                _assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
                _assert.verify(() -> Assert.notNull(configurationPropertyNameAliasesMock, "Aliases must not be null"), atLeast(1));
                verify(sourceMock).getUnderlyingSource();
            });
        }
    }
}
