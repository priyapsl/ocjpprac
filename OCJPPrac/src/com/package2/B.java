package com.package2;

public class B extends A {

	int d =5;
	public void maths(int a, int b)
	{
		int sum = a+b;
		System.out.println("I am from B int" +sum+"value of d " +d);
	}

	
	 void m1(A a)
	{
		System.out.println("i am in a");
	}

	c  void m1(B b)
	{
		System.out.println("i am in b");
	}
	
  void m1(c cc)
	{
		System.out.println("i am in c");
	}


    
}

