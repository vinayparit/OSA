package com.Test.ROSA;


import org.testng.annotations.Test;



public class Sample  {

	@Test
	public void testscript5_Test()
	{
		System.out.println("----testscript5_Test----");
	}
	
	@Test(groups="regression")
	public void testscript6_Test()
	{
		System.out.println("----testscript6_Test----");
	}
}
