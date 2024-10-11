package com.mayab.quality.doubles;

import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class DependencyTest {
	
	private SubDependency subdependency;
	private Dependency dependency;
	
	@BeforeEach
	void setup() {
		subdependency = mock(SubDependency.class);
		dependency = new Dependency(subdependency);
	}
	
	@Test
	void getClassNameTest() {
		//Exercise
		String name = dependency.getSubDependencyClassName();
		//Assertion
		assertThat(name,is("SubDependency.class"));
	}

}