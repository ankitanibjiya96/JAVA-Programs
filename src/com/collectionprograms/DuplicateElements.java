package com.collectionprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateElements {
	
public static void main(String[] args) {

	duplicateDemo();
}

static void duplicateDemo() {
	List<Integer> list=new ArrayList<Integer>();
	Scanner s = new Scanner(System.in);
	System.out.println("How many values you want to enter:");
	
	int size=s.nextInt();
	boolean flag=false;
	int count=1;
	   do {
		     System.out.println("Enter Number");
		     int num=s.nextInt();
		     if(count <= size) {
		     if(!list.contains(num)) {
		    	 list.add(num);
		    	 count++;
		     }else {
		    	 System.out.println("Duplicate Elements not allowed");
		     }
	      }else {
	    	  System.out.println("Size is alrady full Now");
	      }
		     
		     System.out.println("Do u want Continoue ...");
           String msg=s.next();
           if(msg.equalsIgnoreCase("y")) {
        	   flag=true;
           }else {
        	   flag=false;
           }
	   }while(flag);
	   System.out.println("The elements of list are: " + list);
	   System.out.println("====EOP =====");
}
}
