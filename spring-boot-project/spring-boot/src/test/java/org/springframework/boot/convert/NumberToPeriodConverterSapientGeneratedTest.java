package org.springframework.boot.convert;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.core.convert.TypeDescriptor;
import java.util.Set;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NumberToPeriodConverterSapientGeneratedTest {

    private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

    private final TypeDescriptor typeDescriptorMock2 = mock(TypeDescriptor.class);

    //Sapient generated method id: ${getConvertibleTypesTest}, hash: E276C040F10D74C8201B128B92E4C65A
    @Test()
    void getConvertibleTypesTest() {
        //Arrange Statement(s)
        NumberToPeriodConverter target = new NumberToPeriodConverter();
        //Act Statement(s)
        Set<GenericConverter.ConvertiblePair> result = target.getConvertibleTypes();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result.iterator().next(), is(instanceOf(GenericConverter.ConvertiblePair.class)));
        });
    }

    //Sapient generated method id: ${convertWhenSourceIsNotNull}, hash: 4809CD4338F81163E2CB0F6B45410B39
    @Disabled()
    @Test()
    void convertWhenSourceIsNotNull() {
        /* Branches:
         * (source != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: convert
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NumberToPeriodConverter target = new NumberToPeriodConverter();
        Object objectMock = mock(Object.class, "source");
        //Act Statement(s)
        Object result = target.convert(objectMock, typeDescriptorMock, typeDescriptorMock2);
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${convertWhenSourceIsNull}, hash: 543F562F1055E25FE97F02B559EF396B
    @Disabled()
    @Test()
    void convertWhenSourceIsNull() {
        /* Branches:
         * (source != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: delegate - Method: convert
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NumberToPeriodConverter target = new NumberToPeriodConverter();
        Object object = null;
        //Act Statement(s)
        Object result = target.convert(object, typeDescriptorMock, typeDescriptorMock2);
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
