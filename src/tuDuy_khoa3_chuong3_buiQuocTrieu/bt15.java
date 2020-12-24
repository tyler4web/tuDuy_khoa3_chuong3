package tuDuy_khoa3_chuong3_buiQuocTrieu;

import java.util.Scanner;

public class bt15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao so n");
		double n = Integer.parseInt(scan.nextLine());
		System.out.println("Nhap vao so x");
		double x = Float.parseFloat(scan.nextLine());
		System.out.println(tinhTong(x, n));
	}

	public static double tinhTong(double x, double n) {
		if (n == 0) {
			return Math.pow(x, n);
		}
		
		return tinhTong(x, n-1) + Math.pow(x,n+1);
	}


}
