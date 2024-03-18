package org.springframework.boot.origin;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.mockito.stubbing.Answer;

import java.net.URI;

import org.springframework.util.Assert;
import org.springframework.core.io.Resource;

import java.net.URL;

import org.mockito.MockedStatic;

import java.io.File;
import java.nio.channels.ReadableByteChannel;
import java.io.InputStream;

import org.springframework.core.io.WritableResource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class OriginTrackedResourceSapientGeneratedTest {

	private final Origin originMock = mock(Origin.class);

	private final Resource resourceMock = mock(Resource.class);

	private final WritableResource writableResourceMock = mock(WritableResource.class);

	//Sapient generated method id: ${3d573faa-3786-3f2b-a930-ec5fe3cda1e0}, hash: 5F0B96573BEB0CBE7032FACB525203F8
	@Disabled()
	@Test()
	void getInputStreamTest() throws IOException {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(null).when(resourceMock).getInputStream();
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			InputStream result = target.getInputStream();
			//Assert statement(s)
			//TODO: Please implement equals method in InputStream for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(resourceMock).getInputStream();
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2c451646-b663-3601-bc79-a0d243d7433a}, hash: 95F0D1EBC805F94FFCACB12FA637FACE
	@Test()
	void existsWhenGetResourceExists() {
		/* Branches:
		 * (getResource().exists()) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(true).when(resourceMock).exists();
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			boolean result = target.exists();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				verify(resourceMock).exists();
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9f8086d1-f027-33bd-b6bc-3af96746c579}, hash: 0D00288F6F06D78A7B8870285F2F5456
	@Test()
	void existsWhenGetResourceNotExists() {
		/* Branches:
		 * (getResource().exists()) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(false).when(resourceMock).exists();
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			boolean result = target.exists();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				verify(resourceMock).exists();
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${fc6af407-ea8a-3902-833f-773439911137}, hash: 0839B95F3BFAAC0013A156A9C0567190
	@Test()
	void isReadableWhenGetResourceIsReadable() {
		/* Branches:
		 * (getResource().isReadable()) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(true).when(resourceMock).isReadable();
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			boolean result = target.isReadable();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				verify(resourceMock).isReadable();
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4599eccb-6290-3396-9926-cb8841818dfa}, hash: F88FBD16BB497B7743ADFFE50513A828
	@Test()
	void isReadableWhenGetResourceNotIsReadable() {
		/* Branches:
		 * (getResource().isReadable()) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(false).when(resourceMock).isReadable();
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			boolean result = target.isReadable();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				verify(resourceMock).isReadable();
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${26ccb553-62a1-3a3b-962a-da97a6033880}, hash: 0BEB81336CC5C350F7D3B8509DDD7132
	@Test()
	void isOpenWhenGetResourceIsOpen() {
		/* Branches:
		 * (getResource().isOpen()) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(true).when(resourceMock).isOpen();
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			boolean result = target.isOpen();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				verify(resourceMock).isOpen();
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a7e2cc87-489f-3e8c-9770-a77e00cd4ca6}, hash: 057D2F626D0DE34F0E7D4610ACAC65EA
	@Test()
	void isOpenWhenGetResourceNotIsOpen() {
		/* Branches:
		 * (getResource().isOpen()) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(false).when(resourceMock).isOpen();
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			boolean result = target.isOpen();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				verify(resourceMock).isOpen();
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${40420030-7ce9-330f-a5f1-4d915c48dd47}, hash: AE2AA9430A59F3FA46C6ECC0058D1499
	@Test()
	void isFileWhenGetResourceIsFile() {
		/* Branches:
		 * (getResource().isFile()) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(true).when(resourceMock).isFile();
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			boolean result = target.isFile();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				verify(resourceMock).isFile();
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9d159451-8ad1-30ce-a32d-ae7539b7942d}, hash: D5D280E6537BBD199B8C0A62182FA6C0
	@Test()
	void isFileWhenGetResourceNotIsFile() {
		/* Branches:
		 * (getResource().isFile()) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(false).when(resourceMock).isFile();
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			boolean result = target.isFile();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				verify(resourceMock).isFile();
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${0170ec55-44a5-32e5-bb98-f478152d93bb}, hash: 59597D849F4C479B0C5CFA5738CDB82C
	@Test()
	void getURLTest() throws IOException {
		//Arrange Statement(s)
		URL uRLMock = mock(URL.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(uRLMock).when(resourceMock).getURL();
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			URL result = target.getURL();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(uRLMock));
				verify(resourceMock).getURL();
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7d34882e-8115-3898-bcee-f75627a78c80}, hash: 56DB05D22DD9951B86DE7F56DAD93472
	@Test()
	void getURITest() throws IOException {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			URI uRI = URI.create("x1");
			doReturn(uRI).when(resourceMock).getURI();
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			URI result = target.getURI();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(uRI));
				verify(resourceMock).getURI();
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${1e87c1ad-c631-3cda-a9bc-af8b393c350c}, hash: F7A02372448E88175C8DC35D9E7BE279
	@Test()
	void getFileTest() throws IOException {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			File file = new File("pathname1");
			doReturn(file).when(resourceMock).getFile();
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			File result = target.getFile();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(file));
				verify(resourceMock).getFile();
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${94432585-927e-3497-9c23-0e54bf6da8ed}, hash: 287B8EE5220C77600250F65036146C15
	@Test()
	void readableChannelTest() throws IOException {
		//Arrange Statement(s)
		ReadableByteChannel readableByteChannelMock = mock(ReadableByteChannel.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(readableByteChannelMock).when(resourceMock).readableChannel();
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			ReadableByteChannel result = target.readableChannel();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(readableByteChannelMock));
				verify(resourceMock).readableChannel();
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a084f76c-0c99-3d2c-81cb-176265e8ed14}, hash: 1D1B4DBA27645D067782775FD6438F62
	@Test()
	void contentLengthTest() throws IOException {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(0L).when(resourceMock).contentLength();
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			long result = target.contentLength();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(0L));
				verify(resourceMock).contentLength();
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${8980a7e1-9363-332c-8756-20917039cad3}, hash: 1A0E46EA6CA3782014447EA2F334D8B0
	@Test()
	void lastModifiedTest() throws IOException {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(0L).when(resourceMock).lastModified();
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			long result = target.lastModified();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(0L));
				verify(resourceMock).lastModified();
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${70eb2d6d-5b78-30d7-a381-b62e270672dd}, hash: D6BD105E86EEA29D87F04518A02C8653
	@Test()
	void createRelativeTest() throws IOException {
		//Arrange Statement(s)
		Resource resourceMock2 = mock(Resource.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(resourceMock2).when(resourceMock).createRelative("relativePath1");
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			Resource result = target.createRelative("relativePath1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(resourceMock2));
				verify(resourceMock).createRelative("relativePath1");
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${748782ac-1fa7-3b0b-8500-d5fa2ecd37a8}, hash: 0524478CCF28486D022D7F85E55BDC64
	@Test()
	void getFilenameTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn("return_of_getFilename1").when(resourceMock).getFilename();
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			String result = target.getFilename();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_getFilename1"));
				verify(resourceMock).getFilename();
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c72539b8-9295-34c2-830f-8d27a3760c57}, hash: 9CD542331A40B2C3C7CBA0531921CEA6
	@Test()
	void getDescriptionTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn("return_of_getDescription1").when(resourceMock).getDescription();
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			String result = target.getDescription();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_getDescription1"));
				verify(resourceMock).getDescription();
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 04CBC43F6D381F796ABE27E3775BB134
	@Test()
	void toStringTest() {
		//Arrange Statement(s)
		Resource resourceMock = mock(Resource.class, "<init>_resource1");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedResource target = new OriginTrackedResource(resourceMock, originMock);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("<init>_resource1"));
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}, hash: 54D00CE3F7860C45FF8C8F0F6C6C0A83
	@Test()
	void ofTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		OriginTrackedResource.OriginTrackedWritableResource result = OriginTrackedResource.of(writableResourceMock, originMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${efbcc9f2-575a-35de-9448-f1250396efc6}, hash: F32AFB49771250C38F027E6C0F641019
	@Disabled()
	@Test()
	void of1WhenResourceInstanceOfWritableResource() {
		/* Branches:
		 * (resource instanceof WritableResource writableResource) : true
		 */
		//Act Statement(s)
		OriginTrackedResource result = OriginTrackedResource.of((Resource) writableResourceMock, originMock);
		OriginTrackedResource.OriginTrackedWritableResource originTrackedResourceOriginTrackedWritableResource = new OriginTrackedResource.OriginTrackedWritableResource(writableResourceMock, originMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(originTrackedResourceOriginTrackedWritableResource)));
	}

	//Sapient generated method id: ${11cc7407-cde6-3931-b076-168bffeb3b84}, hash: 2CDBEA150969038980160F99459EDCA9
	@Disabled()
	@Test()
	void of1WhenResourceNotInstanceOfWritableResource() {
		/* Branches:
		 * (resource instanceof WritableResource writableResource) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			OriginTrackedResource result = OriginTrackedResource.of(resourceMock, originMock);
			OriginTrackedResource originTrackedResource = new OriginTrackedResource(resourceMock, originMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(originTrackedResource));
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
			});
		}
	}
}
