package com.linecomparisonOops;

public class UC3compare {
	public static void main(String[] args) {
		LineOps1 value3 = new LineOps1();
		value3.enterValues();
		value3.enterValues2();
		value3.setLenth1();
		value3.setLength2();
		System.out.println("Length of line 1 ::" + value3.getLength1());
		System.out.println("Length of line 2 ::"+ value3.getLength2());
		double  a = value3.getLength1() ;
		double b = value3.getLength2() ;
		if (Double.compare(a, b) == 0) {
            System.out.println("Length1 = Length2");
	   }
        else if (Double.compare(a, b) < 0) {
            System.out.println("Length1 is less than Lenth2");
        }
        else {
            System.out.println("Length1 is greater than Length2");
        }
	}

}
