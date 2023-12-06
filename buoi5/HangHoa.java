package buoi5;

import java.util.Scanner;

public class HangHoa {
	private String mso, ten, nsxuat;
	public HangHoa() {
		mso = new String();
		ten = new String();
		nsxuat = new String();
	}
	public HangHoa(HangHoa h) {
		mso = new String(h.mso);
		ten = new String(h.ten);
		nsxuat = new String(h.nsxuat);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so: ");
		mso = sc.nextLine();
		System.out.println("Nhap ten: ");
		ten = sc.nextLine();
		System.out.println("Nhap nha san xuat: ");
		nsxuat = sc.nextLine();
	}
	public void in() {
		System.out.println("Ma so: "+ mso + " ,ten: "+ ten+ " ,nha san xuat: "+ nsxuat);
	}
	public String toString() {
		return ("Ma so: "+ mso + " ,ten: "+ ten+ " ,nha san xuat: "+ nsxuat);
	}
}
