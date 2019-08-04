
	package net.antra;

	import java.util.Scanner;
	import java.sql.Timestamp;

	public class Assignment13 {
		public static void main(String[] args) {
			while(true) {
				Scanner scan = new Scanner(System.in);
				System.out.println("input x");
				if(scan.hasNextInt()) {
					int x = scan.nextInt();
					if(x > 0) {
						doSth(x);
					}
					else {
						System.out.println("error");
					}
			}
				else {
					if(scan.nextLine().equals("q")) {
						System.out.println("quit");
						break;
					}
				}
			  }
			}


	public static void doSth(int x) {
		for(int j = 0; j < x ; ++j) {
		     Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		     System.out.println(timestamp);
		}
	}
}