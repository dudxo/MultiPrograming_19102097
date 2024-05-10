package homework;

public class Page302_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel hotel = new Hotel();
        hotel.add(5,"호돌이");
        hotel.add(7,"길동이");
        hotel.show();
	}

}

class Hotel {
    static String[] room = new String[10];
    
    void add(int number, String name) {
        if(room[number]==null) {
        	room[number] = name;
        } else {
        	System.out.println("현재 예약이 차있는 방입니다.");
        }
    }
    
    void show() {
        for (int i = 0; i< room.length; i++) {
            if (room[i]!=null) System.out.println(i + "번 방을 " + room[i] + "가 예약했습니다.");
        }
    }
}