package homework_week3;

import java.util.Scanner;

public class Page122_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("철수 : ");
		String str1 = sc.next();
		System.out.print("영희 : ");
		String str2 = sc.next();
		
		if(str1.equals(str2)) {
			System.out.println("무승부");
		}
		
		if("s".equals(str1)) {
			if("p".equals(str2)) {
				System.out.println("철수, 승!");
			} else {
				System.out.println("영희, 승");
			}
		}
		if("r".equals(str1)) {
			if("s".equals(str2)) {
				System.out.println("철수, 승!");
			} else {
				System.out.println("영희, 승");
			}
		}
		if("p".equals(str1)) {
			if("r".equals(str2)) {
				System.out.println("철수, 승!");
			} else {
				System.out.println("영희, 승");
			}
		}
		
		
	}

}
