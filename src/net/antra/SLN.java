package net.antra;

public class SLN{
	public static void SecondLargestNumber(int array[])
{
	int i, first, second;
	if(array.length < 2){
		System.out.println("null");
return;
}
		first = second = Integer.MIN_VALUE;
		for(i = 0 ; i < array.length; i ++){
			if(array[i] > first){
				second = first;
				first = array[i];
}
		else if (array[i] > second && array[i]!=first)
			second = array[i];
}
	if(second == Integer.MIN_VALUE)
		System.out.println("there is no SLN");
	else
		System.out.println("The SLN is " + second);
}

public static void main(String[] args)  
{ 
        int array[] = {12, 35, 1, 10, 34, 1}; 
        
        SecondLargestNumber(array); 
} 
} 

