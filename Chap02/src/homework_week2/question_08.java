package homework_week2;

import java.util.Scanner;

public class question_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int hundred = num / 100;
		int ten = (num % 100) / 10;
		int one = (num % 100) % 10;
		System.out.println("각 자릿수의 합 = " + (hundred+ten+one));
	}

}
