package buoi4;

import java.util.Scanner;

public class ConVat {
	private String giong, mau;
	float cnang;
	public ConVat() {
		giong = new String();
		mau = new String();
		cnang = 0.0f;
	}
	public ConVat(String g, String m,float cn) {
		giong = new String(g);
		mau = new String(m);
		cnang = cn;
	}
	public ConVat(ConVat c) {
		giong = new String(c.giong);
		mau = new String(c.mau);
		cnang = c.cnang;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap giong: ");
		giong = sc.nextLine();
		System.out.println("Nhap mau: ");
		mau = sc.nextLine();
		System.out.println("Nhap can nang: ");
		cnang = Float.parseFloat(sc.nextLine());
	}
	public void in() {
		System.out.println("Giong vua duoc nhap: "+ giong);
		System.out.println("Mau vua duoc nhap: "+ mau);
		System.out.println("Can nang vua duoc nhap: "+ cnang);
		System.out.println("Tieng keu vua duoc nhap: ");
	}
	public void keu() {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		if(c==1) System.out.println("Um bo");
		else if(c==2) System.out.println("Ec ec");
		else if(c==3) System.out.println("Be be");
		else System.out.println("Ooo... ooooo");
	}
}
