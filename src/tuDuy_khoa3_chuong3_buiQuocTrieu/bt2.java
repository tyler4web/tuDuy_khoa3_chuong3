package tuDuy_khoa3_chuong3_buiQuocTrieu;

import java.util.Scanner;

public class bt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao so n");
		float n = Float.parseFloat(scan.nextLine());
		System.out.println(doubleFunction(n));
	}

	public static double doubleFunction (double n) {
		if (n == 1) {
			return 1;
			
		}
		return Math.sqrt(n + doubleFunction(n-1));
	}


}
