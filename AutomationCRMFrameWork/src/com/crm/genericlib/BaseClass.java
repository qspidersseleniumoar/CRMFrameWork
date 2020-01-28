package com.crm.genericlib;

import org.testng.annotations.BeforeSuite;

public class BaseClass {

	@BeforeSuite
	public void configBS() {
		System.out.println("connect to DB");
	}
}
