package de1;

import java.util.Scanner;

public class GDichTTe extends GDich {
	private float dgia;
	private int sluong;
	private char loai;
	private float tgia;
	
	public GDichTTe() {
		super();
		dgia = 0.0f;
		sluong = 1;
		loai = '\0';
		tgia = 0.0f;
	}
	public GDichTTe(GDichTTe g) {
		super(g);
		dgia = g.dgia;
		sluong = g.sluong;
		loai = g.loai;
		tgia = g.tgia;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap don gia: ");
		dgia = sc.nextFloat();
		System.out.println("Nhap so luong: ");
		sluong = sc.nextInt();
		System.out.println("Nhap loai: ");
		loai = sc.next().charAt(0);
		System.out.println("Nhap ti gia: ");
		tgia = sc.nextFloat();
	}
	public void in() {
		super.in();
		System.out.println("Don gia: "+ dgia + ", so luong: "+ sluong + ", loai: " + loai + ", ti gia: + tgia ");
	}
	public float soTien() {
		return (float)sluong*dgia*tgia;
	}
	public boolean thanhTien() {
		float tien = sluong * tgia * dgia;
		if(tien>100000 && loai == 'V') {
			return true;
		}
		return false;
	}
	
	public static void main(String[]agrs) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap vao tong doi tuong: ");
		n = sc.nextInt();
		sc.nextLine();
		int c;
		
		GDich ds[] = new GDich[n];
		
		
		for(int i=0; i<n; i++) {
			System.out.println("Ban muon Giao dich hay Giao dich tien the thu "+ (i+1) + "\n1. Giao dich\n2. Giao dich tien te");
			c = sc.nextInt();
			if(c==1) ds[i] =  new GDich();
			else ds[i] = new GDichTTe();
			ds[i].nhap();
		}
		for(int i=0; i<n; i++) {
			System.out.println("In thong tin cho doi tuong thu "+(i+1) + ":" + ds[i]);
		}
		for(int i=0; i<n; i++) {
			if((ds[i].thanhTien()) && (ds[i].getTthai() == true)) {
				System.out.println("Ma giao dich cua doi tuong thu "+(i+1) + ": " + ds[i].getmgd());
			}
		}
		
		//co cach nao tach giao dich ra khoi ham phiua duoi khong?
		for(int i=0; i<n; i++) {
			System.out.println("So tien cua cac giao dich tien te theo thang nam thu "+(i+1) + ": "  + ds[i].soTien());
			
		}
		
		
	}
}
