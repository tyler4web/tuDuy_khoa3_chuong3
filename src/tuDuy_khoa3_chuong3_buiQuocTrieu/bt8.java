package tuDuy_khoa3_chuong3_buiQuocTrieu;

import java.util.Scanner;

public class bt8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao so n");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println(demSoLuongChuSo(n));
	}

	public static int demSoLuongChuSo(int n) {
		if (n == 0) {
			return 0;
		}
		return demSoLuongChuSo(n/10)+1;
	}


}
