package de1;

import java.util.Scanner;

public class GDich {
	private int mgd;
	private String hten;
	private String ngay;
	private boolean tthai;
	
	public GDich() {
		mgd = 1;
		hten = new String();
		ngay = new String();
		tthai = false;
	}
	public GDich(GDich g) {
		mgd = g.mgd;
		hten = new String(g.hten);
		ngay = new String(g.ngay);
		tthai = g.tthai;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so giao dich: ");
		mgd = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ho ten: ");
		hten = sc.nextLine();
		
		System.out.println("Nhap ngay: ");
		ngay = sc.nextLine();
		System.out.println("Nhap trang thai: ");
		tthai = sc.nextBoolean();
	}
	public void in() {
		System.out.println("ma so giao dich: "+ mgd + " ,ho ten: "+ hten + " ,ngay: "+ ngay + " ,trang thai: "+ tthai);
	}
	public String toString() {
		return ("ma so giao dich: "+ mgd + " ,ho ten: "+ hten + " ,ngay: "+ ngay + " ,trang thai: "+ tthai);
	}
	
	public int getmgd () {
		return mgd;
	}
	public boolean getTthai() {
		return tthai;
	}
	public boolean thanhTien() {
		return false;
	}
	public static void main(String[]agrs) {
		Scanner sc = new Scanner(System.in);
		GDich gd1 = new GDich();
		System.out.println("Nhap thong tin cho gd1: ");
		gd1.nhap();
		System.out.println("In thong tin cho gd1: " + gd1);
		
		GDich gd2 = new GDich(gd1);
		System.out.println("In thong tin cho gd2: " + gd2);
	}
	public float soTien() {
		// TODO Auto-generated method stub
		return 0;
	}
}  
