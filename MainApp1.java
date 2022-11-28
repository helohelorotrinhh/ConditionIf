package basic.dev;

import java.util.Scanner;

public class MainApp1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap a:");
		double a = sc.nextDouble();
		
		System.out.println("Nhap b:");
		double b = sc.nextDouble();
		
		System.out.println("Nhap c:");
		double c = sc.nextDouble();
		if(a == 0){
			System.out.println("Phuong Trinh Bac 1");
			
			
		}else {
			double dt = b*b-4*a*c;
			
			if( dt < 0) {
				System.out.println("Phuong Trinh Vo Nghiem");
				
				
			}else {
				if ( dt == 0) {
					
					double x = -b / (2*a);
					System.out.format("Phuong Trinh Co Nghiem Kep x=%.2f", x).println();
				}else {
					double x1 = (-b + Math.sqrt(dt))/(2*a);
					double x2 = (-b - Math.sqrt(dt))/(2*a);
					System.out.format("Phuong Trinh Co 2 Nghiem Phan Biet x1=%.2f va x2=%.2f", x1, x2).println();
					
					
					
					
				}
				
				
				
			}
			
		}
		
		
		// TODO Auto-generated method stub
		// dùng Scanner
		// b1: nhập a, b, c, 
		// b2: if else
		//b3: inra format

	}

}
