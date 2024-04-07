package homework_week5;

import java.util.Scanner;

public class Page208_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		double p = sc.nextDouble() * 0.01;
		String[][] arr = new String[m][n];
		double per = 0.0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				per = Math.random();
				if(per < p) {
					arr[i][j] = "*";
				} else {
					arr[i][j] = "-";
				}
				System.out.printf(arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!arr[i][j].equals("*")) { // If not a mine
                    int count = countNeighborMines(arr, i, j);
                    arr[i][j] = Integer.toString(count);
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
	}

	
	public static int countNeighborMines(String[][] arr, int m, int n) {
        int count = 0;
        for (int i = m - 1; i <= m + 1; i++) {
            for (int j = n - 1; j <= n + 1; j++) {
                if (i >= 0 && i < arr.length && j >= 0 && j < arr[0].length) {
                    if (arr[i][j].equals("*")) { // If neighboring cell contains mine
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
