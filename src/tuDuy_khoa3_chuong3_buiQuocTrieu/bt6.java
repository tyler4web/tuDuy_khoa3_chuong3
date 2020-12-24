package tuDuy_khoa3_chuong3_buiQuocTrieu;

import java.util.Scanner;

public class bt6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao so x");
		float x = Float.parseFloat(scan.nextLine());
		System.out.println("Nhap vao so n");
		float n = Float.parseFloat(scan.nextLine());
		System.out.println(tinhTong(x, n));
	}

	public static float luyThua (float x, float n) {
		if( n == 0) {
			return 1;
		}
		return luyThua(x, n-1)*x;
	}
	
	public static float tinhTong (float x, float n) {
		if (n == 1) {
			return x;
		}
		return tinhTong(x, n-1) + luyThua(x, n-1)*x;
	}
	
	


}
