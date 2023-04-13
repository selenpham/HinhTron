package LAB1;

import java.util.Scanner;

public class HinhTron {
//	Viết chương trình nhập vào bán kính hình tròn, in ra màn hình chu vi và diện tích của hình tròn.
	public int r;
	float PI = 3.14f;
	
//Tạo công thức tính chu vi
	public float tinhChuvi() {
		float chuvi = this.r * 2*PI;
		return chuvi;
		}

//Tạo công thức tính diện tích
	public float tinhDientich() {
		float dientich = this.r *this.r*PI;
		return dientich;
		}
// Sử dụng Scanner nhập r
	public static void main(String[] args) {
		HinhTron o = new HinhTron();
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Nhap vao ban kinh r: ");
			int r1 = scanner.nextInt();
			o.r = r1;
				
				
		float chuvi = o.tinhChuvi();
		float dientich = o.tinhDientich();
		System.out.println("Chu vi hinh tron = "+ chuvi);
		System.out.println("Dien tich hinh tron = "+ dientich);
		}	
}
