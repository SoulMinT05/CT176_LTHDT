package buoi2;
import java.util.Scanner;
public class SDDate {
	public static void main(String[] args) {
		Date a = new Date(9,2,2023);
		a.hienThi();
		Date b = new Date();
		System.out.println("Nhap vao ngay thang nam: ");
		b.nhap();
		System.out.println("Ngay thang nam vua nhap la: " + b.toString());
		
		b = b.ngayHomSau();
		System.out.print("Ngay hom sau la: " );
		b.hienThi();
		
		System.out.println("Nhap so ngay muon cong: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Ngay khi da duoc them: "+ b.congNgay(n));
	}
}
