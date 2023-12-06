package de3;

import java.util.Scanner;

//B2113394, NGUYENMINHTAM, de05
public class QuocGia {
	 String msqg, tenqg, tenthudo;
	private float GDP;
	public QuocGia() {
		msqg = new String();
		tenqg = new String();
		tenthudo = new String();
		GDP = 1;
	}
	public QuocGia(QuocGia q) {
		msqg = new String(q.msqg);
		tenqg = new String(q.tenqg);
		tenthudo = new String(q.tenthudo);
		GDP = q.GDP;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so quoc gia: ");
		msqg = sc.nextLine();
		System.out.println("Nhap ten quoc gia: ");
		tenqg = sc.nextLine();
		System.out.println("Nhap ten thu do: ");
		tenthudo = sc.nextLine();
		System.out.println("Nhap GDP: ");
		GDP = sc.nextFloat();
	}
	public void in() {
		System.out.println("Ma so quoc gia: " + msqg + ", ten quoc gia: "+ tenqg + ", ten thu do: "+ tenthudo + ", GDP: "+ GDP);
	}
	public String toString() {
		return ("Ma so quoc gia: " + msqg + ", ten quoc gia: "+ tenqg + ", ten thu do: "+ tenthudo + ", GDP: "+ GDP);
	}
	public String layTengq() {
		return tenqg;
	}
	public float layGDP() {
		return GDP;
	}
	public char layCluc() {
		return 0;
	}
	public float GDPtb() {
		return 0;
	}
	public static void main(String[] args) {
		QuocGia qg1 = new QuocGia();
		qg1.nhap();
		qg1.in();
		QuocGia qg2 = new QuocGia(qg1);
		qg2.in();
		qg2.

	}

}