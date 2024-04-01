package homework_week4;

class Triangle{
	double weight;
	double height;
	
	Triangle(){}
	Triangle(double weight, double height){
		this.weight = weight;
		this.height = height;
	}

	double findArea() {
		return weight * height * 0.5;
	}
}

public class Page164_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle(10.0, 5.0);
		System.out.println(t.findArea());
	}

}
