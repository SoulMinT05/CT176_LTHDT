package buoi3;
import java.util.Scanner;

import buoi2.Diem;
public class DoanThang {
	private Diem d1, d2;
	
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	public DoanThang(Diem a, Diem b) {
		d1 = new Diem(a);
		d2 = new Diem(b);
	}
	public DoanThang(DoanThang d) {
		d1 = new Diem(d.d1);
		d2 = new Diem(d.d2);
	}
	public DoanThang(int ax, int ay, int bx, int by) {
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap toa do doan d1: ");
		d1.nhapDiem();
		System.out.println("Nhap toa do doan d2: ");
		d2.nhapDiem();
	}
	public void in() {
		System.out.println("Gia tri doan thang d1 la: "+ d1);
		System.out.println("Gia tri doan thang d2 la: "+ d2);
	}
	public String toString() {
		return "("+ d1 +"," + d2 +")";
	}
	public void tinhtien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	public double dodai() {
		return (double)d1.khoangCach(d2);
	}
	public double goc() {
		return (double)Math.acos(Math.abs(d2.giaTriX()-d1.giaTriX())/this.dodai());
	}
}
