package tuDuy_khoa3_chuong3_buiQuocTrieu;

import java.util.Scanner;

public class bt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao so n");
		float n = Float.parseFloat(scan.nextLine());
		System.out.println(tinhTong(n));
	}

	public static float tinhTong (float n) {
		if (n == 1) {
			return 1;
		}
		return tinhTong(n-1) + 1/n;
	}


}
