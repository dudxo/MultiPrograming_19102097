package homework_week4;

class Triangle2{
	double weight;
	double height;
	
	Triangle2(){}
	Triangle2(double weight, double height){
		this.weight = weight;
		this.height = height;
	}

	double findArea() {
		return weight * height * 0.5;
	}
	
	String isSameArea(Triangle2 t) {
		if(this.findArea() == t.findArea()) {
			return "동일하다.";
		}
		return "동일하지 않다.";
	}
}

public class Page164_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle2 t1 = new Triangle2(10.0, 5.0);
		Triangle2 t2 = new Triangle2(5.0, 10.0);
		Triangle2 t3 = new Triangle2(8.0, 8.0);
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}

}
