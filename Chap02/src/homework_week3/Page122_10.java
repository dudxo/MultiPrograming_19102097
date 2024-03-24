package homework_week3;

import java.util.Scanner;

public class Page122_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("양의 정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		if (isPrime(num))
			System.out.println(num + "는 소수입니다.");
		else
			System.out.println(num + "는 소수가 아닙니다.");
	}
	
	static boolean isPrime(int num) {
		if(num < 2 ) {
			return false;
		}
		
		if(num ==2) {
			return true;
		}
		
		for (int i=2; i<num; i++) {
	        if(num % i == 0) {
	            return false;
	        }
	    }
		return true;
		
	}

}
