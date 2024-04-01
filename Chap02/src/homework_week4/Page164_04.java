package homework_week4;

class Car{
	static int numOfCar, numOfRedCar;

    static int getNumOfCar(){
        return numOfCar;
    }

    static int getNumOfRedCar() {
        return numOfRedCar;
    }

    Car(String Color){
        numOfCar++;
        if (Color.equals("red") || Color.equals("RED")){  // equalslgnoreCase("red")로 간단하게 가능
            numOfRedCar++;
        }
    }
}

public class Page164_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
	}

}
