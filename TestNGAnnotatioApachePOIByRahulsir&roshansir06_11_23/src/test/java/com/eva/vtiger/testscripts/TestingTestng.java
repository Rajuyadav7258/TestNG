package com.eva.vtiger.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingTestng  extends BaseTest {

	////  @BeforeTest
		
	@Test()
	public void test1() {
		
		System.out.println("marketing click - account verification");
	}
	
	@Test()
    public void test2() {
		System.out.println("test2 testcase running");

	}
	
}
