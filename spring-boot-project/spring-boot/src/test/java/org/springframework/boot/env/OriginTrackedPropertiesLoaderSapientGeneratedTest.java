package org.springframework.boot.env;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;
import org.mockito.stubbing.Answer;
import org.springframework.boot.origin.Origin;
import org.springframework.boot.origin.OriginTrackedValue;
import org.springframework.util.Assert;
import org.springframework.core.io.Resource;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
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
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class OriginTrackedPropertiesLoaderSapientGeneratedTest {

    private final OriginTrackedValue originTrackedValueMock = mock(OriginTrackedValue.class);

    private final Resource resourceMock = mock(Resource.class);

    //Sapient generated method id: ${loadTest}, hash: C81DA90DE5FD279B0EAAECE8C3EAB8A0
    @Test()
    void loadTest() throws Throwable {
        //Arrange Statement(s)
        try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            OriginTrackedPropertiesLoader target = spy(new OriginTrackedPropertiesLoader(resourceMock));
            List<OriginTrackedPropertiesLoader.Document> originTrackedPropertiesLoaderDocumentList = new ArrayList<>();
            doReturn(originTrackedPropertiesLoaderDocumentList).when(target).load(true);
            //Act Statement(s)
            List<OriginTrackedPropertiesLoader.Document> result = target.load();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(originTrackedPropertiesLoaderDocumentList));
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                verify(target).load(true);
            });
        }
    }

    //Sapient generated method id: ${load1WhenKeyNotEndsWith__AndReaderNotIsWhiteSpaceAndReaderIsEndOfLineAndDefaultBranchThrowsThrowable}, hash: F6E14FD084B1A42E868EA553CC807BF1
    @Disabled()
    @Test()
    void load1WhenKeyNotEndsWith__AndReaderNotIsWhiteSpaceAndReaderIsEndOfLineAndDefaultBranchThrowsThrowable() throws IOException {
        /* Branches:
         * (reader.read()) : true
         * (reader.isCommentPrefixCharacter()) : true
         * (reader.isSameLastLineCommentPrefix()) : true  #  inside isNewDocument method
         * (isNewDocument(reader)) : false
         * (document.isEmpty()) : true
         * (!documents.isEmpty()) : false
         * (!reader.isEndOfLine()) : false  #  inside loadKey method
         * (expandLists) : true  #  inside loadKeyAndValue method
         * (key.endsWith("[]")) : false  #  inside loadKeyAndValue method
         * (reader.isWhiteSpace()) : false  #  inside loadValue method
         * (!reader.isEndOfLine()) : false  #  inside loadValue method
         * (branch expression (line 80)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<OriginTrackedValue> originTrackedValue = mockStatic(OriginTrackedValue.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            originTrackedValue.when(() -> OriginTrackedValue.of(eq(""), (Origin) any())).thenReturn(originTrackedValueMock);
            OriginTrackedPropertiesLoader target = new OriginTrackedPropertiesLoader(resourceMock);
            //Act Statement(s)
            final Throwable result = assertThrows(Throwable.class, () -> {
                target.load(true);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                originTrackedValue.verify(() -> OriginTrackedValue.of(eq(""), (Origin) any()));
            });
        }
    }

    //Sapient generated method id: ${load1WhenNotPreviousWhitespaceAndNotExpandListsAndReaderNotIsWhiteSpaceAndReaderIsEndOfLineAndDocumentIsEmpty}, hash: D6E590D7911128ECC5C26F21E0FF7DA0
    @Disabled()
    @Test()
    void load1WhenNotPreviousWhitespaceAndNotExpandListsAndReaderNotIsWhiteSpaceAndReaderIsEndOfLineAndDocumentIsEmpty() throws Throwable {
        /* Branches:
         * (reader.read()) : true
         * (reader.isCommentPrefixCharacter()) : true
         * (reader.isSameLastLineCommentPrefix()) : true  #  inside isNewDocument method
         * (isNewDocument(reader)) : false
         * (document.isEmpty()) : true
         * (!documents.isEmpty()) : false
         * (!reader.isEndOfLine()) : true  #  inside loadKey method
         * (reader.isPropertyDelimiter()) : false  #  inside loadKey method
         * (!reader.isWhiteSpace()) : true  #  inside loadKey method
         * (previousWhitespace) : false  #  inside loadKey method
         * (expandLists) : false  #  inside loadKeyAndValue method
         * (reader.isWhiteSpace()) : false  #  inside loadValue method
         * (!reader.isEndOfLine()) : false  #  inside loadValue method
         * (!document.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<OriginTrackedValue> originTrackedValue = mockStatic(OriginTrackedValue.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            originTrackedValue.when(() -> OriginTrackedValue.of(eq(" "), (Origin) any())).thenReturn(originTrackedValueMock);
            OriginTrackedPropertiesLoader target = new OriginTrackedPropertiesLoader(resourceMock);
            //Act Statement(s)
            List<OriginTrackedPropertiesLoader.Document> result = target.load(false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                originTrackedValue.verify(() -> OriginTrackedValue.of(eq(" "), (Origin) any()));
            });
        }
    }

    //Sapient generated method id: ${load1WhenReaderNotIsWhiteSpaceAndReaderIsEndOfLineAndDefaultBranchAndDocumentNotIsEmptyAndDocumentsNotContainsDocument}, hash: 474706CDEDA33D76E75E2C4AE2D660FC
    @Disabled()
    @Test()
    void load1WhenReaderNotIsWhiteSpaceAndReaderIsEndOfLineAndDefaultBranchAndDocumentNotIsEmptyAndDocumentsNotContainsDocument() throws Throwable {
        /* Branches:
         * (reader.read()) : true
         * (reader.isCommentPrefixCharacter()) : true
         * (reader.isSameLastLineCommentPrefix()) : true  #  inside isNewDocument method
         * (isNewDocument(reader)) : false
         * (document.isEmpty()) : true
         * (!documents.isEmpty()) : false
         * (!reader.isEndOfLine()) : false  #  inside loadKey method
         * (expandLists) : true  #  inside loadKeyAndValue method
         * (key.endsWith("[]")) : false  #  inside loadKeyAndValue method
         * (reader.isWhiteSpace()) : false  #  inside loadValue method
         * (!reader.isEndOfLine()) : false  #  inside loadValue method
         * (branch expression (line 80)) : true
         * (!document.isEmpty()) : true
         * (!documents.contains(document)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<OriginTrackedValue> originTrackedValue = mockStatic(OriginTrackedValue.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            originTrackedValue.when(() -> OriginTrackedValue.of(eq(""), (Origin) any())).thenReturn(originTrackedValueMock);
            OriginTrackedPropertiesLoader target = new OriginTrackedPropertiesLoader(resourceMock);
            //Act Statement(s)
            List<OriginTrackedPropertiesLoader.Document> result = target.load(true);
            //Assert statement(s)
            //TODO: Please implement equals method in OriginTrackedPropertiesLoader.Document for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                originTrackedValue.verify(() -> OriginTrackedValue.of(eq(""), (Origin) any()));
            });
        }
    }

    //Sapient generated method id: ${load1WhenSplitListsNotAndReaderIsListDelimiterAndDocumentNotIsEmptyAndDocumentsNotContainsDocument}, hash: 6669151458DCF5F4D330601522CEC046
    @Disabled()
    @Test()
    void load1WhenSplitListsNotAndReaderIsListDelimiterAndDocumentNotIsEmptyAndDocumentsNotContainsDocument() throws Throwable {
        /* Branches:
         * (reader.read()) : true
         * (reader.isCommentPrefixCharacter()) : true
         * (reader.isSameLastLineCommentPrefix()) : true  #  inside isNewDocument method
         * (isNewDocument(reader)) : false
         * (document.isEmpty()) : true
         * (!documents.isEmpty()) : false
         * (!reader.isEndOfLine()) : true  #  inside loadKey method
         * (reader.isPropertyDelimiter()) : true  #  inside loadKey method
         * (expandLists) : true  #  inside loadKeyAndValue method
         * (key.endsWith("[]")) : false  #  inside loadKeyAndValue method
         * (reader.isWhiteSpace()) : true  #  inside loadValue method
         * (!reader.isEndOfLine()) : true  #  inside loadValue method
         * (!reader.isEndOfLine()) : true  #  inside loadValue method
         * (!(splitLists && reader.isListDelimiter())) : true  #  inside loadValue method
         * (!document.isEmpty()) : true
         * (!documents.contains(document)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<OriginTrackedValue> originTrackedValue = mockStatic(OriginTrackedValue.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            originTrackedValue.when(() -> OriginTrackedValue.of(eq("A"), (Origin) any())).thenReturn(originTrackedValueMock);
            OriginTrackedPropertiesLoader target = new OriginTrackedPropertiesLoader(resourceMock);
            //Act Statement(s)
            List<OriginTrackedPropertiesLoader.Document> result = target.load(true);
            //Assert statement(s)
            //TODO: Please implement equals method in OriginTrackedPropertiesLoader.Document for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                originTrackedValue.verify(() -> OriginTrackedValue.of(eq("A"), (Origin) any()));
            });
        }
    }

    //Sapient generated method id: ${load1WhenReaderIsEndOfLineAndNotExpandListsAndReaderNotIsWhiteSpaceAndReaderIsEndOfLineAndDocumentIsEmpty}, hash: 286FB46E766EBEC5CED33897265B5AB3
    @Disabled()
    @Test()
    void load1WhenReaderIsEndOfLineAndNotExpandListsAndReaderNotIsWhiteSpaceAndReaderIsEndOfLineAndDocumentIsEmpty() throws Throwable {
        /* Branches:
         * (reader.read()) : true
         * (reader.isCommentPrefixCharacter()) : true
         * (reader.isSameLastLineCommentPrefix()) : false  #  inside isNewDocument method
         * (reader.getLocation().getColumn() == 0) : false  #  inside isNewDocument method
         * (result) : false  #  inside isNewDocument method
         * (result) : false  #  inside isNewDocument method
         * (result) : false  #  inside isNewDocument method
         * (!reader.isEndOfLine()) : true  #  inside isNewDocument method
         * (result) : false  #  inside isNewDocument method
         * (isNewDocument(reader)) : false
         * (document.isEmpty()) : false
         * (!reader.isEndOfLine()) : false  #  inside loadKey method
         * (expandLists) : false  #  inside loadKeyAndValue method
         * (reader.isWhiteSpace()) : false  #  inside loadValue method
         * (!reader.isEndOfLine()) : false  #  inside loadValue method
         * (!document.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<OriginTrackedValue> originTrackedValue = mockStatic(OriginTrackedValue.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            originTrackedValue.when(() -> OriginTrackedValue.of(eq(""), (Origin) any())).thenReturn(originTrackedValueMock);
            OriginTrackedPropertiesLoader target = new OriginTrackedPropertiesLoader(resourceMock);
            //Act Statement(s)
            List<OriginTrackedPropertiesLoader.Document> result = target.load(false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                originTrackedValue.verify(() -> OriginTrackedValue.of(eq(""), (Origin) any()));
            });
        }
    }

    //Sapient generated method id: ${load1WhenReaderIsEndOfLineAndNotExpandListsAndReaderNotIsWhiteSpaceAndReaderIsEndOfLineAndDocumentIsEmpty2}, hash: 7F7F1ACA36B5C0764E38B9786E7955B1
    @Disabled()
    @Test()
    void load1WhenReaderIsEndOfLineAndNotExpandListsAndReaderNotIsWhiteSpaceAndReaderIsEndOfLineAndDocumentIsEmpty2() throws Throwable {
        /* Branches:
         * (reader.read()) : true
         * (reader.isCommentPrefixCharacter()) : true
         * (reader.isSameLastLineCommentPrefix()) : false  #  inside isNewDocument method
         * (reader.getLocation().getColumn() == 0) : true  #  inside isNewDocument method
         * (result) : true  #  inside isNewDocument method
         * (check.getAsBoolean()) : false  #  inside readAndExpect method
         * (readAndExpect(reader, reader::isHyphenCharacter)) : false  #  inside isNewDocument method
         * (result) : false  #  inside isNewDocument method
         * (result) : false  #  inside isNewDocument method
         * (!reader.isEndOfLine()) : false  #  inside isNewDocument method
         * (result) : false  #  inside isNewDocument method
         * (isNewDocument(reader)) : false
         * (document.isEmpty()) : false
         * (!reader.isEndOfLine()) : false  #  inside loadKey method
         * (expandLists) : false  #  inside loadKeyAndValue method
         * (reader.isWhiteSpace()) : false  #  inside loadValue method
         * (!reader.isEndOfLine()) : false  #  inside loadValue method
         * (!document.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<OriginTrackedValue> originTrackedValue = mockStatic(OriginTrackedValue.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            originTrackedValue.when(() -> OriginTrackedValue.of(eq(""), (Origin) any())).thenReturn(originTrackedValueMock);
            OriginTrackedPropertiesLoader target = new OriginTrackedPropertiesLoader(resourceMock);
            //Act Statement(s)
            List<OriginTrackedPropertiesLoader.Document> result = target.load(false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                originTrackedValue.verify(() -> OriginTrackedValue.of(eq(""), (Origin) any()));
            });
        }
    }

    //Sapient generated method id: ${load1WhenReaderIsEndOfLineAndNotExpandListsAndReaderNotIsWhiteSpaceAndReaderIsEndOfLineAndDocumentIsEmpty3}, hash: C4F7C972F0325924052F2D8B520CAD30
    @Disabled()
    @Test()
    void load1WhenReaderIsEndOfLineAndNotExpandListsAndReaderNotIsWhiteSpaceAndReaderIsEndOfLineAndDocumentIsEmpty3() throws Throwable {
        /* Branches:
         * (reader.read()) : true
         * (reader.isCommentPrefixCharacter()) : true
         * (reader.isSameLastLineCommentPrefix()) : false  #  inside isNewDocument method
         * (reader.getLocation().getColumn() == 0) : true  #  inside isNewDocument method
         * (result) : true  #  inside isNewDocument method
         * (check.getAsBoolean()) : true  #  inside readAndExpect method
         * (readAndExpect(reader, reader::isHyphenCharacter)) : true  #  inside isNewDocument method
         * (result) : true  #  inside isNewDocument method
         * (readAndExpect(reader, reader::isHyphenCharacter)) : false  #  inside isNewDocument method
         * (result) : false  #  inside isNewDocument method
         * (!reader.isEndOfLine()) : false  #  inside isNewDocument method
         * (result) : false  #  inside isNewDocument method
         * (isNewDocument(reader)) : false
         * (document.isEmpty()) : false
         * (!reader.isEndOfLine()) : false  #  inside loadKey method
         * (expandLists) : false  #  inside loadKeyAndValue method
         * (reader.isWhiteSpace()) : false  #  inside loadValue method
         * (!reader.isEndOfLine()) : false  #  inside loadValue method
         * (!document.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<OriginTrackedValue> originTrackedValue = mockStatic(OriginTrackedValue.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            originTrackedValue.when(() -> OriginTrackedValue.of(eq(""), (Origin) any())).thenReturn(originTrackedValueMock);
            OriginTrackedPropertiesLoader target = new OriginTrackedPropertiesLoader(resourceMock);
            //Act Statement(s)
            List<OriginTrackedPropertiesLoader.Document> result = target.load(false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                originTrackedValue.verify(() -> OriginTrackedValue.of(eq(""), (Origin) any()));
            });
        }
    }

    //Sapient generated method id: ${load1WhenReaderIsEndOfLineAndNotExpandListsAndReaderNotIsWhiteSpaceAndReaderIsEndOfLineAndDocumentIsEmpty4}, hash: C2102E4A40DCF8807188F8AEBEAF1D35
    @Disabled()
    @Test()
    void load1WhenReaderIsEndOfLineAndNotExpandListsAndReaderNotIsWhiteSpaceAndReaderIsEndOfLineAndDocumentIsEmpty4() throws Throwable {
        /* Branches:
         * (reader.read()) : true
         * (reader.isCommentPrefixCharacter()) : true
         * (reader.isSameLastLineCommentPrefix()) : false  #  inside isNewDocument method
         * (reader.getLocation().getColumn() == 0) : true  #  inside isNewDocument method
         * (result) : true  #  inside isNewDocument method
         * (check.getAsBoolean()) : true  #  inside readAndExpect method
         * (readAndExpect(reader, reader::isHyphenCharacter)) : true  #  inside isNewDocument method
         * (result) : true  #  inside isNewDocument method
         * (readAndExpect(reader, reader::isHyphenCharacter)) : true  #  inside isNewDocument method
         * (result) : true  #  inside isNewDocument method
         * (readAndExpect(reader, reader::isHyphenCharacter)) : false  #  inside isNewDocument method
         * (!reader.isEndOfLine()) : false  #  inside isNewDocument method
         * (result) : false  #  inside isNewDocument method
         * (isNewDocument(reader)) : false
         * (document.isEmpty()) : false
         * (!reader.isEndOfLine()) : false  #  inside loadKey method
         * (expandLists) : false  #  inside loadKeyAndValue method
         * (reader.isWhiteSpace()) : false  #  inside loadValue method
         * (!reader.isEndOfLine()) : false  #  inside loadValue method
         * (!document.isEmpty()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<OriginTrackedValue> originTrackedValue = mockStatic(OriginTrackedValue.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            originTrackedValue.when(() -> OriginTrackedValue.of(eq(""), (Origin) any())).thenReturn(originTrackedValueMock);
            OriginTrackedPropertiesLoader target = new OriginTrackedPropertiesLoader(resourceMock);
            //Act Statement(s)
            List<OriginTrackedPropertiesLoader.Document> result = target.load(false);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(0));
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                originTrackedValue.verify(() -> OriginTrackedValue.of(eq(""), (Origin) any()));
            });
        }
    }

    //Sapient generated method id: ${load1WhenNotExpandListsAndReaderNotIsWhiteSpaceAndReaderIsEndOfLineAndDocumentNotIsEmptyAndDocumentsNotContainsDocument}, hash: 358B8D632317F9F6C0C6B9D8AA2244CC
    @Disabled()
    @Test()
    void load1WhenNotExpandListsAndReaderNotIsWhiteSpaceAndReaderIsEndOfLineAndDocumentNotIsEmptyAndDocumentsNotContainsDocument() throws Throwable {
        /* Branches:
         * (reader.read()) : true
         * (reader.isCommentPrefixCharacter()) : true
         * (reader.isSameLastLineCommentPrefix()) : false  #  inside isNewDocument method
         * (reader.getLocation().getColumn() == 0) : true  #  inside isNewDocument method
         * (result) : true  #  inside isNewDocument method
         * (check.getAsBoolean()) : true  #  inside readAndExpect method
         * (readAndExpect(reader, reader::isHyphenCharacter)) : true  #  inside isNewDocument method
         * (result) : true  #  inside isNewDocument method
         * (readAndExpect(reader, reader::isHyphenCharacter)) : true  #  inside isNewDocument method
         * (result) : true  #  inside isNewDocument method
         * (readAndExpect(reader, reader::isHyphenCharacter)) : true  #  inside isNewDocument method
         * (!reader.isEndOfLine()) : true  #  inside isNewDocument method
         * (result) : true  #  inside isNewDocument method
         * (reader.isEndOfLine()) : true  #  inside isNewDocument method
         * (isNewDocument(reader)) : true
         * (!document.isEmpty()) : true
         * (!reader.isEndOfLine()) : false  #  inside loadKey method
         * (expandLists) : false  #  inside loadKeyAndValue method
         * (reader.isWhiteSpace()) : false  #  inside loadValue method
         * (!reader.isEndOfLine()) : false  #  inside loadValue method
         * (!document.isEmpty()) : true
         * (!documents.contains(document)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<OriginTrackedValue> originTrackedValue = mockStatic(OriginTrackedValue.class);
            MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
            _assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
            originTrackedValue.when(() -> OriginTrackedValue.of(eq(""), (Origin) any())).thenReturn(originTrackedValueMock);
            OriginTrackedPropertiesLoader target = new OriginTrackedPropertiesLoader(resourceMock);
            //Act Statement(s)
            List<OriginTrackedPropertiesLoader.Document> result = target.load(false);
            //Assert statement(s)
            //TODO: Please implement equals method in OriginTrackedPropertiesLoader.Document for verification of the entire object or you need to adjust respective assertion statements
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(2));
                _assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
                originTrackedValue.verify(() -> OriginTrackedValue.of(eq(""), (Origin) any()));
            });
        }
    }
}
