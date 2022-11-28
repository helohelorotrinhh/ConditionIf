package basic.dev;

import java. util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch (n) {
		case 2: { 
			System.out.println("Thang Co 28 Ngay");
		
		} break;
		case 1,3,5,7,8,10,12: {
			System.out.println("Thang co 31 Ngay");
		}break;
		case 4,6,9,11: {
			System.out.println("Thang co 30 Ngay");
		}break;
		default:
			System. out.println("Ban Nhap Sai Thang");
		}
		// TODO Auto-generated method stub

	}

}
