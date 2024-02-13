package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.time.Duration;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertySourcesCachingSapientGeneratedTest {

	//Sapient generated method id: ${cb96b1fd-4c54-332e-a77f-27ba1bdaf688}
	@Test()
	void enableWhenCachingIsNotNull() {
		/* Branches:
		 * (this.sources != null) : true  #  inside forEach method
		 * (for-each(this.sources)) : true  #  inside forEach method
		 * (caching != null) : true  #  inside forEach method
		 */
		//Arrange Statement(s)
		ConfigurationPropertySourcesCaching target = new ConfigurationPropertySourcesCaching((Iterable) null);

		//Act Statement(s)
		target.enable();
	}

	//Sapient generated method id: ${b8533de4-b672-3d9c-95d3-41074b1432ac}
	@Test()
	void disableWhenCachingIsNotNull() {
		/* Branches:
		 * (this.sources != null) : true  #  inside forEach method
		 * (for-each(this.sources)) : true  #  inside forEach method
		 * (caching != null) : true  #  inside forEach method
		 */
		//Arrange Statement(s)
		ConfigurationPropertySourcesCaching target = new ConfigurationPropertySourcesCaching((Iterable) null);

		//Act Statement(s)
		target.disable();
	}

	//Sapient generated method id: ${8cb0e90a-05d6-3fb9-aa16-eb1e353994f7}
	@Test()
	void setTimeToLiveWhenCachingIsNotNull() {
		/* Branches:
		 * (this.sources != null) : true  #  inside forEach method
		 * (for-each(this.sources)) : true  #  inside forEach method
		 * (caching != null) : true  #  inside forEach method
		 */
		//Arrange Statement(s)
		ConfigurationPropertySourcesCaching target = new ConfigurationPropertySourcesCaching((Iterable) null);
		Duration duration = Duration.ofDays(0L);

		//Act Statement(s)
		target.setTimeToLive(duration);
	}

	//Sapient generated method id: ${94b1de9e-8161-348d-92ce-f93cee722361}
	@Test()
	void clearWhenCachingIsNotNull() {
		/* Branches:
		 * (this.sources != null) : true  #  inside forEach method
		 * (for-each(this.sources)) : true  #  inside forEach method
		 * (caching != null) : true  #  inside forEach method
		 */
		//Arrange Statement(s)
		ConfigurationPropertySourcesCaching target = new ConfigurationPropertySourcesCaching((Iterable) null);

		//Act Statement(s)
		target.clear();
	}
}
