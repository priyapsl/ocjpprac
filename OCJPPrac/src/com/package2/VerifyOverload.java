package com.package2;

public class VerifyOverload {
	
	
	public  void m1(A a)
	{
		System.out.println("i am in a");
	}

	public  void m1(B b)
	{
		System.out.println("i am in b");
	}
	
	public  void m1(c cc)
	{
		System.out.println("i am in c");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		A aa =new A();
		B bb = new B();
		c obj = new c();
		
		VerifyOverload over = new VerifyOverload();
		over.m1(aa);
		over.m1(bb);
		over.m1(obj);
		
		A ab = new B();
		over.m1(ab);
	
		
		B bc = new c();
		over.m1(bc);
		over.m1(null);
		
		
		
		
	}

}
