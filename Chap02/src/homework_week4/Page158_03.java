package homework_week4;

class Printer{
	private int numOfPapers = 0;
	private boolean duplex;
	
	Printer(){}
	Printer(int numOfPapers, boolean duplex) { 
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}
	
	public void print(int amount) {
		if (duplex == true) {
			if ((amount / 2) == 0) {         
				numOfPapers -= amount / 2;
				System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n", (amount / 2), numOfPapers);
			} else {                            
				numOfPapers -= (amount / 2) + 1;
				System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n", (amount / 2) + 1, numOfPapers);
			}
		} else {
			if (numOfPapers > amount) {    
				numOfPapers -= amount;     
				System.out.printf("단면으로 모두 출력하여 용지 %d장을 출력하고 남아있는 용지는 %d장 입니다.\n", amount, numOfPapers);
			} else {                       
				numOfPapers -= amount;     
				amount += numOfPapers;     
				System.out.printf("단면으로 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", (numOfPapers * -1), amount);
			}
		}
	}
	public boolean getDuplex() {        
		return duplex;
	}

	public void setDuplex(boolean duplex) { 
		this.duplex = duplex;
	}

}

public class Page158_03 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer demoPrinter = new Printer(20, true);   // demoPrinter는 객체 인스턴스다.
		demoPrinter.print(25); 
		demoPrinter.setDuplex(false); 
		demoPrinter.print(10);
	}

}
