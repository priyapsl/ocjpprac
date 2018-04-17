package com.package2;

import com.package1.Study1;

public class Study2 extends Study1 {

	String address;
	
	
	public static void m1( Study1 aa)
	{
		
	int val =	aa.returnAge();
		System.out.println("I am in strudy1  -m1");
	}
	
	public static void m1( Study2 aa)
	{
		
		int val = aa.returnAge();
		System.out.println("i am in study2-m1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Study1 st = new Study2();
	System.out.println(st.returnAge());
	m1(st);
	
	
	}

}
