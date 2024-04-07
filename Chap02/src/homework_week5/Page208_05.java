package homework_week5;

import java.util.Scanner;

public class Page208_05 {
	static String[] str = new String[]{"", "", "", "", "", "", "", "", "", ""};

	static void histogram(int[] arr) {
		for(int i : arr) {
			if(i < 0) continue;
			switch(i/10) {
			case 0 : str[0] += "*"; break;
			case 1 : str[1] += "*"; break;
			case 2 : str[2] += "*"; break;
			case 3 : str[3] += "*"; break;
			case 4 : str[4] += "*"; break;
			case 5 : str[5] += "*"; break;
			case 6 : str[6] += "*"; break;
			case 7 : str[7] += "*"; break;
			case 8 : str[8] += "*"; break;
			case 9 : str[9] += "*"; break;
			default : continue;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.print("숫자를 10개 입력하세요");
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		histogram(arr);
		for(int j = 0; j < 10; j++) {
			System.out.println((j*10) + " ~ " + (j*10 + 9) + " : " + str[j]);
		}
	}

}
