package tuDuy_khoa3_chuong3_buiQuocTrieu;

import java.util.Scanner;

public class bt11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao so n");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println(demSoLe(n));
	}

	public static int demSoLe(int n) {
		if (n == 0) {
			return 0;
		}
		if (n%2 == 1) {
			return demSoLe(n/10) +1;
		}
		return demSoLe(n/10);
	}


}
