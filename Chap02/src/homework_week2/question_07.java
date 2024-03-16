package homework_week2;

import java.util.Scanner;

public class question_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean check;
		if(num%4==0 && num%5==0) {
			check = true;
		} else {
			check = false;
		}
		System.out.println("4와 5로 나뉘어지는지? : " + check);

		if(num%4==0 || num%5==0) {
			check = true;
		} else {
			check = false;
		}
		System.out.println("4 또는 5로 나뉘어지는지? : " + check);
		
		if((num%4==0 || num%5==0) && !(num%4==0 && num%5==0)) {
			check = true;
		} else {
			check = false;
		}
		System.out.println("4나 5중 하나로 나누어지지만 두 수 모두로는 나누어지지 않는지? : " + check);
	}

}
