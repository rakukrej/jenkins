package com.pega.practice.HelloWorld.controller;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import com.pega.practice.HelloWorld.Controller.HelloWorldController;

public class HelloWorldControllerTest {
	
	@Test
    public void isGreaterTest() {
        System.out.println("Test");
        HelloWorldController helloWorld = new HelloWorldController();

        org.junit.jupiter.api.Assertions.assertTrue( helloWorld.hello(4, 3));
        org.junit.jupiter.api.Assertions.assertFalse(helloWorld.hello(3, 4));
    }
	



}
