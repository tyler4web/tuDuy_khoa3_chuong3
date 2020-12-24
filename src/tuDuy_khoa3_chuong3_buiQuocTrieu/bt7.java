package tuDuy_khoa3_chuong3_buiQuocTrieu;

import java.util.Scanner;

public class bt7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao so n");
		float n = Float.parseFloat(scan.nextLine());
		System.out.println(tongChia(n));
	}

	public static float tinhTong(float n) {
		if (n == 1) {
			return n;
		}
		return tinhTong(n - 1) + n;
	}

	public static float tongChia(float n) {
		if (n == 1) {
			return 1;
		}
		return tongChia(n - 1) + 1 / (tinhTong(n - 1) + n);
	}

}
