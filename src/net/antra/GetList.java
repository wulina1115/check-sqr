package net.antra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetList {
	public static void main(String[] args) {
		//create list A
		int[] arr = { 1, 2, 3, 4, 10};
		List<Integer> A = new ArrayList<>(arr.length);

		for (int i : arr) {
			A.add(Integer.valueOf(i));
		}
		
		//create map B
		Map<String, String> B = new HashMap<String , String>();
		B.put("a", "1");
		B.put("b", "2");
		B.put("c", "10");		

		System.out.println(merge(A, B));
		
	}
	public static List<Integer> merge(List<Integer> A, Map<String, String> B) {

		List<Integer> res = new ArrayList<>();			
		for(Integer i: A) {
			if(!B.containsValue(i.toString())) {
				res.add(i);
			} 
		}
		return res;
	}
}
