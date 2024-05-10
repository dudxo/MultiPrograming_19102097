package homework;

public class Page302_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable f = new Flyable(){
			public void speed() {
				System.out.println("속도");
			}
			public void height() {
				System.out.println("높이");
			}
		};
		
        f.speed();
        f.height();
	}

}

interface Flyable {
	void speed();
    void height();
}