package com.package2;

public class A {
	
	int d =2;
	public void math(int a, int b)
	{
		int sum = a+b;
		System.out.println("I am from A int" +sum + "value of d " +d);
	}

 void mathf(float a, float b)
	{
		float sum = a+b;
		System.out.println("I am from A float" +sum);
	}

	 void m1(A a)
	{
		System.out.println("i am in a");
	}

	void m1(B b)
	{
		System.out.println("i am in b");
	}
	
	public  void m1(c cc)
	{
		System.out.println("i am in c");
	}
   
}
