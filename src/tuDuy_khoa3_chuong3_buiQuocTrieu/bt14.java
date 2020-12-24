package tuDuy_khoa3_chuong3_buiQuocTrieu;

import java.util.Scanner;

public class bt14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao so n");
		int n = Integer.parseInt(scan.nextLine());
		
		System.out.println(tinhTongSoChan(n));
	}

	public static int tinhTongSoChan( int n) {
		if (n == 0) {
			return 0;
		}
		
		if (n%2 == 0) {
			return tinhTongSoChan(n/10) + (n%10);
		}

		
		return tinhTongSoChan(n/10);
	}


}
