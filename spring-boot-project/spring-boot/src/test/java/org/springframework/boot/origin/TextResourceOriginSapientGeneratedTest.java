package org.springframework.boot.origin;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.io.Resource;

import org.mockito.MockedStatic;

import org.springframework.core.io.ClassPathResource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TextResourceOriginSapientGeneratedTest {

	private final Resource resourceMock = mock(Resource.class);

	//Sapient generated method id: ${5455f6a6-c86e-3f05-be56-c037c0b1cda5}, hash: 5327107CF47AC6D16357D2CC075170AB
	@Test()
	void getParentTest() {
		//Arrange Statement(s)
		Origin originMock = mock(Origin.class);
		TextResourceOrigin.Location textResourceOriginLocationMock = mock(TextResourceOrigin.Location.class);
		try (MockedStatic<Origin> origin = mockStatic(Origin.class)) {
			origin.when(() -> Origin.from(resourceMock)).thenReturn(originMock);
			TextResourceOrigin target = new TextResourceOrigin(resourceMock, textResourceOriginLocationMock);
			//Act Statement(s)
			Origin result = target.getParent();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(originMock));
				origin.verify(() -> Origin.from(resourceMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3abf516b-1871-3fa1-9cbb-dc938b7959a8}, hash: FC71F4FC67A03A96847CEA81CDE28358
	@Disabled()
	@Test()
	void toStringWhenThisLocationIsNotNull() {
		/* Branches:
		 * (resource instanceof OriginTrackedResource originTrackedResource) : true  #  inside getResourceDescription method
		 * (this.location != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		OriginTrackedResource originTrackedResourceMock = mock(OriginTrackedResource.class);
		doReturn(resourceMock).when(originTrackedResourceMock).getResource();
		TextResourceOrigin.Location textResourceOriginLocationMock = mock(TextResourceOrigin.Location.class, "<init>_textResourceOrigin.Location1");
		TextResourceOrigin target = new TextResourceOrigin(originTrackedResourceMock, textResourceOriginLocationMock);
		//Act Statement(s)
		String result = target.toString();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("A - <init>_textResourceOrigin.Location1"));
			verify(originTrackedResourceMock).getResource();
		});
	}

	//Sapient generated method id: ${26ec678d-cb57-3082-89b9-53bf4a643f18}, hash: 9244F98EA2282F46835B8EBD999CD86F
	@Test()
	void toStringWhenResourceIsNullAndThisLocationIsNull() {
		/* Branches:
		 * (resource instanceof OriginTrackedResource originTrackedResource) : false  #  inside getResourceDescription method
		 * (resource == null) : true  #  inside getResourceDescription method
		 * (this.location != null) : false
		 */
		//Arrange Statement(s)
		TextResourceOrigin target = new TextResourceOrigin((Resource) null, (TextResourceOrigin.Location) null);
		//Act Statement(s)
		String result = target.toString();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("unknown resource [?]")));
	}

	//Sapient generated method id: ${1bfa8e28-7d41-3580-bef1-1034c1b433e9}, hash: 01518E27408E236F7774013EC47BA03F
	@Disabled()
	@Test()
	void toStringWhenResourceInstanceOfClassPathResourceAndThisLocationIsNull() {
		/* Branches:
		 * (resource instanceof OriginTrackedResource originTrackedResource) : false  #  inside getResourceDescription method
		 * (resource == null) : false  #  inside getResourceDescription method
		 * (resource instanceof ClassPathResource classPathResource) : true  #  inside getResourceDescription method
		 * (this.location != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ClassPathResource classPathResourceMock = mock(ClassPathResource.class);
		TextResourceOrigin target = new TextResourceOrigin(classPathResourceMock, (TextResourceOrigin.Location) null);
		//Act Statement(s)
		String result = target.toString();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("A")));
	}

	//Sapient generated method id: ${6cb8512c-1161-3233-b9ac-7c529416afed}, hash: 1D95FA6B83364C6927CDE311DC488E68
	@Test()
	void toStringWhenResourceNotInstanceOfClassPathResourceAndThisLocationIsNull() {
		/* Branches:
		 * (resource instanceof OriginTrackedResource originTrackedResource) : false  #  inside getResourceDescription method
		 * (resource == null) : false  #  inside getResourceDescription method
		 * (resource instanceof ClassPathResource classPathResource) : false  #  inside getResourceDescription method
		 * (this.location != null) : false
		 */
		//Arrange Statement(s)
		doReturn("A").when(resourceMock).getDescription();
		TextResourceOrigin target = new TextResourceOrigin(resourceMock, (TextResourceOrigin.Location) null);
		//Act Statement(s)
		String result = target.toString();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("A"));
			verify(resourceMock).getDescription();
		});
	}
}
