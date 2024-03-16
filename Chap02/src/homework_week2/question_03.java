package homework_week2;

import java.util.Scanner;

public class question_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은? ");
		double r = sc.nextDouble();
		System.out.print("원기둥의 높이는? ");
		double h = sc.nextDouble();
		System.out.printf("원기둥의 부피는 %.1f",r*r*h*3.14);
		
	}

}
