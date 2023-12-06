// B2113394, NGUYEBNMINHTAM, DE5, 
package de4;

import java.util.Scanner;

import de3.QuocGia;

public class ChuyenXe extends QuocGia{
	private int mso;
	private String tenlx, nden;
	private float dthu;
	public Xe x;
	
	public ChuyenXe() {
		mso = 1;
		tenlx = new String();
		nden = new String();
		dthu = 1;
		x = new Xe();
	}
	public ChuyenXe(ChuyenXe cx) {
		mso = cx.mso;
		tenlx = new String(cx.tenlx);
		nden = new String(cx.nden);
		dthu = cx.dthu;
		x = new Xe(cx.x);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Nhap ma so: ");
		mso = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ten lai xe: ");
		tenlx = sc.nextLine();
		System.out.println("Nhap ngay den: ");
		nden = sc.nextLine();
		System.out.println("Nhap doanh thu: ");
		dthu = sc.nextFloat();
		x.nhap();
	}
	public void in() {
		System.out.println("Ma so: "+ mso + ", ten lai xe: "+ tenlx + ", ngay den: "+ nden + ", doanh thu: "+ dthu + " ," + x);
	}
	public String toString() {
		return ("Ma so: "+ mso + ", ten lai xe: "+ tenlx + ", ngay den: "+ nden + ", doanh thu: "+ dthu + " ," + x);
	}
	public float loiNhuan() {
		return dthu*30/100;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tong so luong chuyen xe: ");
		int n = sc.nextInt();
		ChuyenXe ds1[] = new ChuyenXe[n];
		
		for(int i=0; i<n; i++) {
			ds1[i] = new ChuyenXe();
			System.out.println("Nhap thong tin cho doi tuong thu "+ (i+1) + " : " );
			ds1[i].nhap();
			
		}
		for(int i=0; i<n; i++) {
			System.out.println("\nThong tin cho doi tuong thu "+ (i+1) + " : " );
			ds1[i].in();
			ds1[i].
		}
		
		
		System.out.println("\nTat ca ma so chuyen xe bi huy hoac co doanh thu duoi 100.000: ");
		for(int i=0; i<n; i++) {
			if(ds1[i].x.layTthai() == 'K' || ds1[i].dthu <100000 ) {
				System.out.println("	Ma so: "+ ds1[i].mso);
			}
		}
		
		System.out.println("\nTong loi nhuan cho tung loai xe theo thang-nam: ");
		for(int i=0; i<n; i++) {			
			System.out.println("	Loi nhuan cho "+ ds1[i].x.layLoai() + " theo " + ds1[i].x.layNgay() + " : " + ds1[i].loiNhuan());
		}
	}

}
