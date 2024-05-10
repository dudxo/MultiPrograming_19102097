package homework_week10;

public class Page302_01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concrete c = new Concrete(100 ,50);
		c.show();
	}

}

abstract class Abstract{
	int i;
	
	Abstract(int i){
		this.i = i;
	}
	
	void show() {};	
}

class Concrete extends Abstract{
	int j;
	
	Concrete(int i, int j){
		super(i);
		this.j = j;
	}
	
	void show() {
		System.out.printf("i = %d, j = %d", i, j);
	}
}