package org.springframework.boot.logging.logback;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import ch.qos.logback.classic.spi.ILoggingEvent;
import org.springframework.boot.logging.CorrelationIdFormatter;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CorrelationIdConverterSapientGeneratedTest {

    //Sapient generated method id: ${startTest}, hash: C79D4413A60088860AE7D3A91B469321
    @Test()
    void startTest() {
        //Arrange Statement(s)
        CorrelationIdFormatter correlationIdFormatterMock = mock(CorrelationIdFormatter.class);
        try (MockedStatic<CorrelationIdFormatter> correlationIdFormatter = mockStatic(CorrelationIdFormatter.class)) {
            correlationIdFormatter.when(() -> CorrelationIdFormatter.of(anyList())).thenReturn(correlationIdFormatterMock);
            CorrelationIdConverter target = new CorrelationIdConverter();
            List<String> stringList = new ArrayList<>();
            target.setOptionList(stringList);
            //Act Statement(s)
            target.start();
            //Assert statement(s)
            assertAll("result", () -> correlationIdFormatter.verify(() -> CorrelationIdFormatter.of(anyList())));
        }
    }

    //Sapient generated method id: ${stopTest}, hash: 049900F571D8A487933A4F9DBB2D629E
    @Test()
    void stopTest() {
        //Arrange Statement(s)
        CorrelationIdConverter target = new CorrelationIdConverter();
        
        //Act Statement(s)
        target.stop();
    }

    //Sapient generated method id: ${convert1WhenThisFormatterIsNull}, hash: 26DA770D51C4F9707B39E0417A09AC3B
    @Test()
    void convert1WhenThisFormatterIsNull() {
        /* Branches:
         * (this.formatter == null) : true
         */
         //Arrange Statement(s)
        CorrelationIdConverter target = new CorrelationIdConverter();
        ILoggingEvent iLoggingEventMock = mock(ILoggingEvent.class);
        
        //Act Statement(s)
        String result = target.convert(iLoggingEventMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }
}
