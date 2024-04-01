//package homework_week4;
//
//import java.util.Scanner;
//
//class Printer{
//	private int numOfPapers = 0;
//	
//	Printer(){}
//	Printer(int numOfPapers) { this.numOfPapers = numOfPapers;}
//	
//	public void print(int amount) {
//		if (numOfPapers > amount) {       
//			numOfPapers -= amount;
//			System.out.println(amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
//		} else if (0 < numOfPapers && numOfPapers < amount) {
//            		numOfPapers -= amount; 
//            		amount += numOfPapers;
//            		System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", (numOfPapers * -1), amount);
//		} else {
//			System.out.println("용지가 없습니다.");
//		}
//	}
//}
//
//
//public class Page158_02 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Printer p = new Printer(10);
//		p.print(2);
//		p.print(20);
//		p.print(10);
//	}
//
//}
