package com.package2;

public class c extends B {

	int d = 10;
	
	 void mathdouble(int a, int b)
	{
		int sum = a+b;
		System.out.println("I am from C int" +sum +"value of d " +d );
	}

	void m1(A a)
	{
		System.out.println("i am in a");
	}

  void m1(B b)
	{
		System.out.println("i am in b");
	}
	
  void m1(c cc)
	{
		System.out.println("i am in c");
	}
}
