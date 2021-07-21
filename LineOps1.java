package com.linecomparisonOops;

import java.util.Scanner;

public class LineOps1 {
	  static int x1, x2, x3, x4, y1, y2, y3, y4;
	    static double length1, length2;

	    public void enterValues() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter x1: ");
	        x1 = sc.nextInt();
	        System.out.print("Enter x2: ");
	        x2 = sc.nextInt();

	        System.out.print("Enter y1: ");
	        y1 = sc.nextInt();
	        System.out.print("Enter y2: ");
	        y2 = sc.nextInt();
	    }
	    public void enterValues2() {
	    	Scanner sc = new Scanner(System.in);


	        System.out.print("Enter x4: ");
	        x4 = sc.nextInt();
	        System.out.print("Enter x3: ");
	        x3 = sc.nextInt();

	        System.out.print("Enter y4: ");
	        y4 = sc.nextInt();
	        System.out.print("Enter y3: ");
	        y3 = sc.nextInt();
	    }
	    
	        public void setLenth1(){
	            length1 = Math.sqrt((x2 - x1) * (x2-x1)) + ((y2-y1) * (y2-y1));
	        }
	        public double getLength1(){
	            return length1;
	        }
	        public void setLength2(){
	            length2 = Math.sqrt((x4 - x3) * (x4-x3)) + ((y4-y3) * (y4-y3));
	        }
	        public double getLength2(){
	            return length2;

	    }

}
