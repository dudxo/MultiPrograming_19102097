package homework_week3;

import java.util.Scanner;

public class Page122_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		do {
			if(num % 2 == 0)
				sum += num; 
			System.out.print("양의 정수를 입력하세요 : ");
			num = sc.nextInt();
		}while(num > 0);
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
	}

}
