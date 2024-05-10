package homework;

public class Page302_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller[] c = { new TV(false), new Radio(true)};

        for (Controller controller : c) {
            controller.show();
        }
	}

}

abstract class Controller{
	boolean power;
	
	Controller(boolean power){
		this.power = power;
	}
	
	void show() {
		if(power) {
			System.out.println(getName() + "가 켜졌습니다.");
		} else {
			System.out.println(getName() + "가 졌습니다.");			
		}
	};
	abstract String getName();
}

class TV extends Controller{
	TV(boolean power){
		super(power);
	}
	
	String getName() {
		return "TV";
	}
}

class Radio extends Controller{
	Radio(boolean power){
		super(power);
	}
	
	String getName() {
		return "라디오";
	}
}