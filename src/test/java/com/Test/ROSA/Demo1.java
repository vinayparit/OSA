package com.Test.ROSA;


import org.testng.annotations.Test;



public class Demo1 {

	@Test (groups={"smoke","regression"})
	public void testscript1_Test()
	{
		System.out.println("----testscript1_Test----");
		System.out.println("----testscript1_Test----");
	}
	
	@Test 
	public void testscript2_Test()
	{
		System.out.println("----testscript2_Test----");
	}
	@Test(groups="smoke")
	public void testscript5_Test()
	{
		System.out.println("----testscript5_Test----");
	}
	
}
