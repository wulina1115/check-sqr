package net.antra;

public class Merge2Array {

	public static void main(String[] args) {
	      int[]a = {2,0,1,9};
	      int[]b = {4,19,10,0,0};
	      int[]c = new int[a.length+b.length];
	      int count = 0;
	      
	      for(int i = 0; i < a.length; i++) { 
	         c[i] = a[i];
	         count++;
	      } 
	      for(int j = 0; j < b.length;j++) { 
	         c[count++] = b[j];
	      } 
	      for(int i = 0;i < c.length;i++) 
	    	  System.out.print(c[i]+" ");
	   } 
 }
  
