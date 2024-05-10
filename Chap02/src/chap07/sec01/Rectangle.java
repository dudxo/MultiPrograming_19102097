package chap07.sec01;

class Rectangle extends Shape{
	int weigth;
	int hegith;
	
	public Rectangle(int weigth, int hegith) {
		this.weigth = weigth;
		this.hegith = hegith;
	}
	
	public void draw() {
		System.out.println("사각형을 그리다.");
	}
	
	public double findArea() {
		return weigth * hegith;
	}
}