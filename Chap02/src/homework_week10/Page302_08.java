package homework_week10;

import java.util.Scanner;

public class Page302_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        Echor e = new Echor() {
            void echo() {
                String cmd = "";
                while (!cmd.equals("끝")){
                    cmd = in.nextLine();
                    System.out.println(cmd);
                }
            }
        };
        e.start();
        e.echo();
        e.stop();
	}

}

abstract class Echor {
    void start() {
        System.out.println("시작합니다.");
    }
    
    abstract void echo();
    
    void stop() {
        System.out.println("종료합니다.");
    }
}