package tuDuy_khoa3_chuong3_buiQuocTrieu;

import java.util.Scanner;

public class bt13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao so n");
		int n = Integer.parseInt(scan.nextLine());
		int Max = n%10;
		System.out.println(timSoLonNhat(Max, n));
	}

	public static int timSoLonNhat(int Max, int n) {
		if (n%10 == 0) {
			return Max;
		}

		Max = (Max>n%10)? Max: n%10;
		return timSoLonNhat(Max, n/10);
	}


}
