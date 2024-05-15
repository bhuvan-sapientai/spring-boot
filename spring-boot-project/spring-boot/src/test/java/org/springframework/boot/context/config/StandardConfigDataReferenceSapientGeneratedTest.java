package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.boot.env.PropertySourceLoader;
import org.mockito.MockedStatic;
import org.springframework.util.StringUtils;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StandardConfigDataReferenceSapientGeneratedTest {

    private final ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class, "configDataLocation");

    private final PropertySourceLoader propertySourceLoaderMock = mock(PropertySourceLoader.class);

    //Sapient generated method id: ${isMandatoryDirectoryWhenThisDirectoryIsNotNull}, hash: 51D031B5EC25D439AF1596AFDACC513A
    @Test()
    void isMandatoryDirectoryWhenThisDirectoryIsNotNull() {
        /* Branches:
         * (!this.configDataLocation.isOptional()) : true
         * (this.directory != null) : true
         */
         //Arrange Statement(s)
        StandardConfigDataReference target = new StandardConfigDataReference(configDataLocationMock, "directory1", "B", "A", "C", propertySourceLoaderMock);
        doReturn(false).when(configDataLocationMock).isOptional();
        
        //Act Statement(s)
        boolean result = target.isMandatoryDirectory();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(configDataLocationMock).isOptional();
        });
    }

    //Sapient generated method id: ${isMandatoryDirectoryWhenThisDirectoryIsNull}, hash: 6307D56E630E41D9522E9C4298A74B70
    @Test()
    void isMandatoryDirectoryWhenThisDirectoryIsNull() {
        /* Branches:
         * (!this.configDataLocation.isOptional()) : true
         * (this.directory != null) : false
         */
         //Arrange Statement(s)
        StandardConfigDataReference target = new StandardConfigDataReference(configDataLocationMock, (String) null, "B", "A", "C", propertySourceLoaderMock);
        doReturn(false).when(configDataLocationMock).isOptional();
        
        //Act Statement(s)
        boolean result = target.isMandatoryDirectory();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(configDataLocationMock).isOptional();
        });
    }

    //Sapient generated method id: ${isSkippableWhenThisProfileIsNotNull}, hash: 4297276B88A6CD876D4F210FF61E72EA
    @Test()
    void isSkippableWhenThisProfileIsNotNull() {
        /* Branches:
         * (this.configDataLocation.isOptional()) : false
         * (this.directory != null) : false
         * (this.profile != null) : true
         */
         //Arrange Statement(s)
        StandardConfigDataReference target = new StandardConfigDataReference(configDataLocationMock, (String) null, "B", "A", "C", propertySourceLoaderMock);
        doReturn(false).when(configDataLocationMock).isOptional();
        
        //Act Statement(s)
        boolean result = target.isSkippable();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(configDataLocationMock).isOptional();
        });
    }

    //Sapient generated method id: ${isSkippableWhenThisProfileIsNull}, hash: 12202674078FFC558982F8C51C5B825D
    @Test()
    void isSkippableWhenThisProfileIsNull() {
        /* Branches:
         * (this.configDataLocation.isOptional()) : false
         * (this.directory != null) : false
         * (this.profile != null) : false
         */
         //Arrange Statement(s)
        try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
            stringUtils.when(() -> StringUtils.hasText((String) null)).thenReturn(true);
            StandardConfigDataReference target = new StandardConfigDataReference(configDataLocationMock, (String) null, "C", (String) null, "B", propertySourceLoaderMock);
            doReturn(false).when(configDataLocationMock).isOptional();
            //Act Statement(s)
            boolean result = target.isSkippable();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                stringUtils.verify(() -> StringUtils.hasText((String) null), atLeast(1));
                verify(configDataLocationMock).isOptional();
            });
        }
    }

    //Sapient generated method id: ${toStringTest}, hash: 195977375355E79214117236C0C831A8
    @Test()
    void toStringTest() {
        //Arrange Statement(s)
        StandardConfigDataReference target = new StandardConfigDataReference(configDataLocationMock, "directory1", "B", "A", "C", propertySourceLoaderMock);
        
        //Act Statement(s)
        String result = target.toString();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("B-A.C")));
    }
}
