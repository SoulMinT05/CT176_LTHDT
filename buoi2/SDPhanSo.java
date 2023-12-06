package buoi2;
import java.util.Scanner;
import java.lang.Math;
public class SDPhanSo {

	public static void main(String[] args) {
		PhanSo a = new PhanSo(3, 7);
		PhanSo b = new PhanSo(4, 9);
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Phan so vua nhap: "+ a.toString());
		System.out.println("Phan so vua nhap: "+ b.toString());

		x.nhap();
		System.out.println("Phan so vua dc nhap: "+ x.toString());
		y.nhap();
		System.out.println("Phan so vua dc nhap: "+ y.toString());
		
		x.giatriNghichDao();
		System.out.println("Gia tri nghich dao cua phan so x: " + x.giatriNghichDao().toString());
//		x.hienThiGTND();
		System.out.println("Tong cua x va y: "+ x.congPs(y));
		
		
		System.out.println("Danh sach cua ban co bao nhieu phan tu: ");
		int n = sc.nextInt();
		PhanSo ds[] = new PhanSo[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Nhap phan so thu "+ (i+1));
			ds[i] = new PhanSo();
			ds[i].nhap();			
		}
		
		System.out.println("Danh sach ban vua nhap: ");
		for(int i=0; i<n; i++) {
			System.out.println("Phan so thu "+ (i+1) + "\n" + ds[i].toString());
		}
		
		double sum =0;
		for(int i=0; i<ds.length; i++) {
			sum+=ds[i].giaTriThuc();
		}
		System.out.println("Tong "+ n + " phan so ban vua nhap: "+ sum);
		
	}
			
}
