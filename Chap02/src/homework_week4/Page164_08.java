package homework_week4;

class Dice{
	
	int roll() {
		return (int) (Math.random() * 6) + 1;
	}
}

public class Page164_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice d = new Dice();
		System.out.println("주사위의 숫자 : " + d.roll());
	}

}
