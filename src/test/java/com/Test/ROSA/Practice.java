package com.Test.ROSA;


import org.testng.annotations.Test;



public class Practice  {
	
	@Test(groups="regression")
	public void testscript3_Test()
	{
		System.out.println("----testscript3_Test----");
		System.out.println("----testscript3_Test----");
		System.out.println("s----testscript3_Test----");
	}
	
	@Test(groups={"regression", "smoke"})
	public void testscript4_Test()
	{
		System.out.println("----testscript4_Test----");
		System.out.println("----testscript3_Test----");
		System.out.println("----testscript3_Test----");
	}
}
