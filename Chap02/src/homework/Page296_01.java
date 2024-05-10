package homework;

public class Page296_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Countable[] m = { new Bird("뻐꾸기"), new Bird("독수리"), new Tree("사과나무"), new Tree("밤나무")};
//		
//		for (Countable e : m) {
//			e.count();
//		}
//		
//		for (int i = 0; i < m.length; i++) {
//			// 타입에 따라 fly() 또는 ripen() 메서드를 호출하는 코드
//			if (m[i] instanceof Bird) {
//				m[i].fly();
//			} else {
//				m[i].ripen();
//			}
//		}
		
		Countable[] m = { new Bird("뻐꾸기", 5), new Bird("독수리", 2), new Tree("사과나무", 10), new Tree("밤나무", 7) };

		for (Countable e : m) {
			e.count();
		}

		for (int i = 0; i < m.length; i++) {
			// 타입에 따라 fly() 또는 ripen() 메서드를 호출하는 코드
			if (m[i] instanceof Bird) {
				((Bird) m[i]).fly();
			} else {
				((Tree) m[i]).ripen();
			}
		}
	}
}


class Bird extends Countable{
	public Bird(String name, int num) {
		super(name, num);
	}
	
	void fly() {
		System.out.println("2마리 " + name + "가 날아간다.");
	}

	@Override
	public void count() {
		System.out.println(name + "가 2마리 있다.");
	}

}

class Tree extends Countable{
	public Tree(String name, int num) {
		super(name, num);
	}

	public void ripen() {
		System.out.println(name + "에 열매가 잘 익었다.");
	}

	@Override
	public void count() {
		System.out.println(name + "가 5그루 있다.");
	}
	
}