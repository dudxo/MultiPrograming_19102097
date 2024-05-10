package homework_week10;

public class Page302_04 {
	
	
	static void speak(Talkable t) {
		t.talk();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		speak(new Korean());
		speak(new American());		
	}

}

interface Talkable{
	void talk();
}

class Korean implements Talkable{

	@Override
	public void talk() {
		System.out.println("안녕하세요!");
	}
}

class American implements Talkable{

	@Override
	public void talk() {
		System.out.println("Hello!");
	}
}