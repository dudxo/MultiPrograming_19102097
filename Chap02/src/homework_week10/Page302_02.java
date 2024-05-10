package homework_week10;

public class Page302_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

interface Edible{
	void eat();
}

interface Sweetable{
	void sweet();
}

interface Delicious extends Edible, Sweetable{
}