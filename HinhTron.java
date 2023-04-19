package LAB1;

import java.util.Scanner;

public class HinhTron {
//	Viết chương trình nhập vào bán kính hình tròn, in ra màn hình chu vi và diện tích của hình tròn.
	public int r;
	float PI = 3.14f;
// Viết chương trình tính Chu vi	
	public float tinhChuvi() {
		float chuvi = this.r * 2*PI;
		return chuvi;
	}
	// Viết chương trình tính Diện tích
	public float tinhDientich() {
		float dientich = this.r * this.r * PI;
		return dientich;
	}
	
	public static void main(String[] args) {
		HinhTron o = new HinhTron();
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
// Sử dụng vòng lặp để nhập liên tục, nếu ấn E thì thoát		
		while (!exit) {
			try {
				System.out.print("Nhap vao ban kinh r (hoac nhap E de thoat): ");
				String rInput = scanner.nextLine();
				
				if (rInput.equalsIgnoreCase("E")) {
					exit = true;
					break;
				}
				
				o.r = Integer.parseInt(rInput);
				
				float chuvi = o.tinhChuvi();
				float dientich = o.tinhDientich();
				System.out.println("Chu vi hinh tron = " + chuvi);
				System.out.println("Dien tich hinh tron = " + dientich);
			} catch (NumberFormatException ex) {
				System.out.println("Vui long nhap gia tri so hoac E de thoat!");
			}
		}
		
		System.out.println("Chuong trinh da thoat.");
	}
}
