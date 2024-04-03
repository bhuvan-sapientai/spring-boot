package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.util.MultiValueMap;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.core.env.Environment;
import org.springframework.boot.context.properties.bind.BindResult;

import java.util.Iterator;
import java.util.Set;

import org.springframework.util.StringUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.boot.context.properties.bind.Bindable;

import java.util.Collection;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.Spliterators;
import java.util.ArrayList;
import java.util.stream.StreamSupport;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ProfilesSapientGeneratedTest {

	private final MultiValueMap groupsMock = mock(MultiValueMap.class, "groups");

	private final BindResult bindResultMock = mock(BindResult.class);

	private final BindResult<Set<String>> bindResultMock2 = mock(BindResult.class);

	private final BindResult<Set<String>> bindResultMock3 = mock(BindResult.class);

	private final Bindable<MultiValueMap<String, String>> bindableMock = mock(Bindable.class);

	private final Bindable<Set<String>> bindableMock2 = mock(Bindable.class);

	private final Binder binderMock = mock(Binder.class);

	private final Environment environmentMock = mock(Environment.class);

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}, hash: 4A6B7727D9C654C7C5A92E4F16DEB159
	@Test()
	void iteratorTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("arg0");
			doReturn(bindResultMock).when(binderMock).bind("spring.profiles.group", bindableMock);
			doReturn(groupsMock).when(bindResultMock).orElseGet((Supplier) any());
			doReturn(false).when(bindResultMock2).isBound();
			doReturn(bindResultMock2, bindResultMock3).when(binderMock).bind("name1", bindableMock2);
			doReturn(false).when(bindResultMock3).isBound();
			stringUtils.when(() -> StringUtils.hasLength("return_of_getProperty1")).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyCollection())).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(true);
			collectionUtils.when(() -> CollectionUtils.isEmpty((Collection) null)).thenReturn(false);
			Collection<String> collection = new ArrayList<>();
			Profiles target = spy(new Profiles(environmentMock, binderMock, collection));
			List list = new ArrayList<>();
			List list2 = new ArrayList<>();
			doReturn(list, list2).when(groupsMock).get("arg0");
			List<String> stringList = new ArrayList<>();
			doReturn(stringList).when(target).getAccepted();
			//Act Statement(s)
			Iterator<String> result = target.iterator();
			List<String> stringList2 = new ArrayList<>();
			Iterator<String> iteratorResult = stringList2.iterator();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(StreamSupport.stream(Spliterators.spliteratorUnknownSize(result, 0), false).toArray(), equalTo(StreamSupport.stream(Spliterators.spliteratorUnknownSize(iteratorResult, 0), false).toArray()));
				verify(environmentMock, times(2)).getProperty("arg0");
				verify(binderMock).bind("spring.profiles.group", bindableMock);
				verify(bindResultMock).orElseGet((Supplier) any());
				verify(binderMock, times(2)).bind("name1", bindableMock2);
				verify(bindResultMock2).isBound();
				verify(bindResultMock3).isBound();
				stringUtils.verify(() -> StringUtils.hasLength("return_of_getProperty1"), atLeast(4));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyCollection()));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()), atLeast(4));
				collectionUtils.verify(() -> CollectionUtils.isEmpty((Collection) null), atLeast(3));
				verify(groupsMock, times(2)).get("arg0");
				verify(target).getAccepted();
			});
		}
	}

	//Sapient generated method id: ${cffbf970-a697-3296-9d13-518d7ba78eaa}, hash: 2E527A083AEF91C17BF26712D4315CF2
	@Test()
	void getAcceptedWhenThisActiveProfilesIsEmpty() {
		/* Branches:
		 * (!this.activeProfiles.isEmpty()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("arg0");
			doReturn(bindResultMock).when(binderMock).bind("spring.profiles.group", bindableMock);
			doReturn(groupsMock).when(bindResultMock).orElseGet((Supplier) any());
			doReturn(false).when(bindResultMock2).isBound();
			doReturn(bindResultMock2, bindResultMock3).when(binderMock).bind("name1", bindableMock2);
			doReturn(false).when(bindResultMock3).isBound();
			stringUtils.when(() -> StringUtils.hasLength("return_of_getProperty1")).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyCollection())).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(true);
			collectionUtils.when(() -> CollectionUtils.isEmpty((Collection) null)).thenReturn(false);
			Collection<String> collection = new ArrayList<>();
			Profiles target = new Profiles(environmentMock, binderMock, collection);
			List list = new ArrayList<>();
			List list2 = new ArrayList<>();
			doReturn(list, list2).when(groupsMock).get("arg0");
			//Act Statement(s)
			List<String> result = target.getAccepted();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(environmentMock, times(2)).getProperty("arg0");
				verify(binderMock).bind("spring.profiles.group", bindableMock);
				verify(bindResultMock).orElseGet((Supplier) any());
				verify(binderMock, times(2)).bind("name1", bindableMock2);
				verify(bindResultMock2).isBound();
				verify(bindResultMock3).isBound();
				stringUtils.verify(() -> StringUtils.hasLength("return_of_getProperty1"), atLeast(4));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyCollection()));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()), atLeast(4));
				collectionUtils.verify(() -> CollectionUtils.isEmpty((Collection) null), atLeast(3));
				verify(groupsMock, times(2)).get("arg0");
			});
		}
	}

	//Sapient generated method id: ${b99f08d2-fb50-3b52-b75b-ee013f79d6d0}, hash: 7EBB4718CE9D0B4436D0C0E81F3A4DE1
	@Test()
	void isAcceptedWhenGetAcceptedContainsProfile() {
		/* Branches:
		 * (getAccepted().contains(profile)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("arg0");
			doReturn(bindResultMock).when(binderMock).bind("spring.profiles.group", bindableMock);
			doReturn(groupsMock).when(bindResultMock).orElseGet((Supplier) any());
			doReturn(false).when(bindResultMock2).isBound();
			doReturn(bindResultMock2, bindResultMock3).when(binderMock).bind("name1", bindableMock2);
			doReturn(false).when(bindResultMock3).isBound();
			stringUtils.when(() -> StringUtils.hasLength("return_of_getProperty1")).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyCollection())).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(true);
			collectionUtils.when(() -> CollectionUtils.isEmpty((Collection) null)).thenReturn(false);
			Collection<String> collection = new ArrayList<>();
			Profiles target = spy(new Profiles(environmentMock, binderMock, collection));
			List list = new ArrayList<>();
			List list2 = new ArrayList<>();
			doReturn(list, list2).when(groupsMock).get("arg0");
			List<String> stringList = new ArrayList<>();
			stringList.add("profile1");
			doReturn(stringList).when(target).getAccepted();
			//Act Statement(s)
			boolean result = target.isAccepted("profile1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				verify(environmentMock, times(2)).getProperty("arg0");
				verify(binderMock).bind("spring.profiles.group", bindableMock);
				verify(bindResultMock).orElseGet((Supplier) any());
				verify(binderMock, times(2)).bind("name1", bindableMock2);
				verify(bindResultMock2).isBound();
				verify(bindResultMock3).isBound();
				stringUtils.verify(() -> StringUtils.hasLength("return_of_getProperty1"), atLeast(4));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyCollection()));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()), atLeast(4));
				collectionUtils.verify(() -> CollectionUtils.isEmpty((Collection) null), atLeast(3));
				verify(groupsMock, times(2)).get("arg0");
				verify(target).getAccepted();
			});
		}
	}

	//Sapient generated method id: ${129ae9ad-fa43-3e97-9819-16403b42169e}, hash: CB2C1E0E52A6B6BF33AD477DA2D15A0C
	@Test()
	void isAcceptedWhenGetAcceptedNotContainsProfile() {
		/* Branches:
		 * (getAccepted().contains(profile)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("arg0");
			doReturn(bindResultMock).when(binderMock).bind("spring.profiles.group", bindableMock);
			doReturn(groupsMock).when(bindResultMock).orElseGet((Supplier) any());
			doReturn(false).when(bindResultMock2).isBound();
			doReturn(bindResultMock2, bindResultMock3).when(binderMock).bind("name1", bindableMock2);
			doReturn(false).when(bindResultMock3).isBound();
			stringUtils.when(() -> StringUtils.hasLength("return_of_getProperty1")).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyCollection())).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(true);
			collectionUtils.when(() -> CollectionUtils.isEmpty((Collection) null)).thenReturn(false);
			Collection<String> collection = new ArrayList<>();
			Profiles target = spy(new Profiles(environmentMock, binderMock, collection));
			List list = new ArrayList<>();
			List list2 = new ArrayList<>();
			doReturn(list, list2).when(groupsMock).get("arg0");
			List<String> stringList = new ArrayList<>();
			doReturn(stringList).when(target).getAccepted();
			//Act Statement(s)
			boolean result = target.isAccepted("profile1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				verify(environmentMock, times(2)).getProperty("arg0");
				verify(binderMock).bind("spring.profiles.group", bindableMock);
				verify(bindResultMock).orElseGet((Supplier) any());
				verify(binderMock, times(2)).bind("name1", bindableMock2);
				verify(bindResultMock2).isBound();
				verify(bindResultMock3).isBound();
				stringUtils.verify(() -> StringUtils.hasLength("return_of_getProperty1"), atLeast(4));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyCollection()));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()), atLeast(4));
				collectionUtils.verify(() -> CollectionUtils.isEmpty((Collection) null), atLeast(3));
				verify(groupsMock, times(2)).get("arg0");
				verify(target).getAccepted();
			});
		}
	}

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: EDF69B37A5C92992CF4C0A0403711952
	@Test()
	void toStringTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: creator
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("return_of_getProperty1").when(environmentMock).getProperty("arg0");
			doReturn(bindResultMock).when(binderMock).bind("spring.profiles.group", bindableMock);
			doReturn(groupsMock).when(bindResultMock).orElseGet((Supplier) any());
			doReturn(false).when(bindResultMock2).isBound();
			doReturn(bindResultMock2, bindResultMock3).when(binderMock).bind("name1", bindableMock2);
			doReturn(false).when(bindResultMock3).isBound();
			stringUtils.when(() -> StringUtils.hasLength("return_of_getProperty1")).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyCollection())).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(true);
			collectionUtils.when(() -> CollectionUtils.isEmpty((Collection) null)).thenReturn(false);
			Collection<String> collection = new ArrayList<>();
			Profiles target = spy(new Profiles(environmentMock, binderMock, collection));
			List list = new ArrayList<>();
			List list2 = new ArrayList<>();
			doReturn(list, list2).when(groupsMock).get("arg0");
			List<String> stringList = new ArrayList<>();
			doReturn(stringList).when(target).getAccepted();
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("result1"));
				verify(environmentMock, times(2)).getProperty("arg0");
				verify(binderMock).bind("spring.profiles.group", bindableMock);
				verify(bindResultMock).orElseGet((Supplier) any());
				verify(binderMock, times(2)).bind("name1", bindableMock2);
				verify(bindResultMock2).isBound();
				verify(bindResultMock3).isBound();
				stringUtils.verify(() -> StringUtils.hasLength("return_of_getProperty1"), atLeast(4));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyCollection()));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()), atLeast(4));
				collectionUtils.verify(() -> CollectionUtils.isEmpty((Collection) null), atLeast(3));
				verify(groupsMock, times(2)).get("arg0");
				verify(target).getAccepted();
			});
		}
	}
}
