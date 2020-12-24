package tuDuy_khoa3_chuong3_buiQuocTrieu;

import java.util.Scanner;

public class bt9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao so n");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println(tinhTongCacChuSoDuong(n));
	}

	public static int tinhTongCacChuSoDuong(int n) {
		if (n == 0) {
			return 0;
		}
		return tinhTongCacChuSoDuong(n/10)+ n%10;
	}


}
