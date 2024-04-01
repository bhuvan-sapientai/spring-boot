package org.springframework.boot;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.Environment;
import org.springframework.boot.ansi.AnsiColor;
import org.springframework.boot.ansi.AnsiOutput;

import java.io.OutputStream;

import org.springframework.boot.ansi.AnsiStyle;

import java.io.PrintStream;

import org.mockito.MockedStatic;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringBootBannerSapientGeneratedTest {

	//Sapient generated method id: ${97dc33a4-c770-39f5-8531-1dd36ef746cc}, hash: DBB8B98E5619E09A20077C978A58ADF5
	@Disabled()
	@Test()
	void printBannerWhenPaddingLengthLessThanSTRAP_LINE_SIZEMinusVersionLengthPlusSPRING_BOOTLength() {
		/* Branches:
		 * (for-each(BANNER)) : true
		 * (version != null) : true
		 * (padding.length() < STRAP_LINE_SIZE - (version.length() + SPRING_BOOT.length())) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Environment environmentMock = mock(Environment.class, "test");
		try (MockedStatic<AnsiOutput> ansiOutput = mockStatic(AnsiOutput.class);
			 MockedStatic<SpringBootVersion> springBootVersion = mockStatic(SpringBootVersion.class)) {
			springBootVersion.when(() -> SpringBootVersion.getVersion()).thenReturn("2.5.2");
			Object[] objectArray = new Object[] { AnsiColor.GREEN, " :: Spring Boot :: ", AnsiColor.DEFAULT, " ", AnsiStyle.FAINT, " (v2.5.2)" };
			ansiOutput.when(() -> AnsiOutput.toString(objectArray)).thenReturn(" :: Spring Boot ::  (v2.5.2)");
			SpringBootBanner target = new SpringBootBanner();
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(byteArrayOutputStream);
			//Act Statement(s)
			target.printBanner(environmentMock, Object.class, printStream);
			//Assert statement(s)
			assertAll("result", () -> {
				springBootVersion.verify(() -> SpringBootVersion.getVersion(), atLeast(1));
				ansiOutput.verify(() -> AnsiOutput.toString(objectArray), atLeast(1));
			});
		}
	}
}
