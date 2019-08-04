package net.antra;

import java.io.File;
import java.util.Scanner;

public class MultiThread {
	public static void main(String[] args) throws Exception 
	  { 
	    // pass the path to the file as a parameter 
	    File file = 
	      new File("C:\\Users\\jacyz\\eclipse-workspace\\batch13\\src\\net\\antra\\input.txt"); 
	    Scanner sc = new Scanner(file); 
	  
	    while (sc.hasNextLine()) 
	      System.out.println(sc.nextLine()); 
	  }
}
