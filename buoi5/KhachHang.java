package buoi5;

import java.util.Scanner;

public class KhachHang {
	private String cccd, hten, dchi;
	public KhachHang() {
		cccd = new String();
		hten = new String();
		dchi = new String();
	}
	public KhachHang(KhachHang k) {
		cccd = new String(k.cccd);
		hten = new String(k.hten);
		dchi = new String(k.dchi);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap can cuoc cong dan: ");
		cccd = sc.nextLine();
		System.out.println("Nhap ho ten: ");
		hten = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		dchi = sc.nextLine();
	}
	public void in() {
		System.out.println("Can cuoc cong dan: "+ cccd + " ,ho ten: "+ hten + " ,dia chi: "+ dchi);
	}
	public String toString() {
		return ("Can cuoc cong dan: "+ cccd + " ,ho ten: "+ hten + " ,dia chi: "+ dchi);
	}
	public float layTLeGiam() {
		return 0;
	}
}
