package com.chander;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	private HelloWorld helloWorld;
	@Before
	public void setUp() throws Exception {
		helloWorld = new HelloWorld();
	}

	@Test
	public void testHelloEmpty() {
		assertEquals(helloWorld.getName(), "");
		assertEquals(helloWorld.getMessage(),"Hello!");
	}

	@Test
	public void testHelloWorld() {
		helloWorld.setName("World");
		assertEquals(helloWorld.getName(),"World");
		assertEquals(helloWorld.getMessage(),"Hello World!");
		
	}

	
}
