package tuDuy_khoa3_chuong3_buiQuocTrieu;

import java.util.Scanner;

public class bt12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao so n");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println(chuSoDau(n));
	}

	public static int chuSoDau(int n) {
		if (n/10 == 0) {
			return n;
		}

		return chuSoDau(n/10);
	}


}
