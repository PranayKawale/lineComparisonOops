package com.linecomparisonOops;

public class Uc2equal {
	public static void main(String[] args) {
		
	
	LineOps1 value2 = new LineOps1();
	value2.enterValues();
	value2.enterValues2();
	value2.setLenth1();
	value2.setLength2();
	System.out.println("Length of line 1 ::" + value2.getLength1());
	System.out.println("Length of line 2 ::"+ value2.getLength2());
	String str1 = Double.toString(value2.getLength1());
	String str2 = Double.toString(value2.getLength2());
	System.out.print("is  length of line 1 = length of line 2 :: ");
	System.out.println(str1.equals(str2));
	  
	}
}
