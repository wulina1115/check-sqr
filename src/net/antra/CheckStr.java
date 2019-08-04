package net.antra;

public class CheckStr {
		public static void main(String[] args) {
			String str = "999.99999";
			System.out.println(isNumber(str));
		}
		public static boolean isNumber(String str) {
		    try {
		        Double.parseDouble(str);
		    } catch (Exception e) {
		        return false;
		    }
		    return true;
		}
	}
