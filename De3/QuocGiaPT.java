package de3;

import java.util.Scanner;

public class QuocGiaPT extends QuocGia {
	private float ttho, dtich;
	private char chluc;
	public QuocGiaPT () {
		super();
		ttho = 1;
		dtich =1;
		chluc = '\0';
	}
	public QuocGiaPT (QuocGiaPT q) {
		super(q);
		ttho = q.ttho;
		dtich =q.dtich;
		chluc = q.chluc;
	}
	public boolean checkchauluc(char c) {
		if(c == 'A' || c == 'W' || c == 'M' || c == 'U' || c == 'P') {
			return true;
		}else {
			System.out.println("Nhap chau luc khong hop le, hay nhap lai! ");
		}
		return false;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tuoi tho: ");
		ttho = sc.nextFloat();
		System.out.println("Nhap dien tich: ");
		dtich = sc.nextFloat();
		while(true) {
			System.out.println("Nhap chau luc: ");
			chluc = sc.next().charAt(0);
			if(checkchauluc(chluc)) {
				break;
			}
		}
		
	}
	public void in() {
		super.in();
		System.out.println("tuoi tho: "+ ttho + ", dien tich: "+ dtich + ", chau luc: "+ chluc);
	}
	public String toString() {
		return (super.toString()+ "tuoi tho: "+ ttho + ", dien tich: "+ dtich + ", chau luc: "+ chluc);
	}
	public char layCluc() {
		return chluc;
	}
	public float GDPtb() {
		return layGDP()/ttho*dtich;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so doi tuong: ");
		int n = sc.nextInt();
		QuocGia ds[] = new QuocGia[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Ban muon chon doi tuong quoc gia(0) hoac quoc gia phat trien (1): ");
			int d = sc.nextInt();
			if(d==0) ds[i] = new QuocGia();
			else ds[i] = new QuocGiaPT();
			
			System.out.println("Nhap thong tin cho quoc gia thu "+ (i+1) + " : ");
			ds[i].nhap();
			ds[i].
			
			
		}
		for(int i=0; i<n; i++) {
			System.out.println("Thong tin cho quoc gia thu "+ (i+1) + " : ");
			ds[i].in();
		}
		for(int i=0; i<n; i++) {
			if(ds[i].layGDP() > 500 && ds[i].layCluc() == 'P') {
				System.out.println("Ten quoc gia co GDP tren 500 va den tu Chau Phi: "+ ds[i].layTengq());
			}
		}
		System.out.println("GDP trung binh cua cac nuoc phat trien theo moi chau luc: ");
		for(int i=0; i<n; i++) {
			System.out.println(" Quoc gia "+ ds[i].layTengq() + " cua chau luc "+ ds[i].layCluc() + " co GDP trung binh: "+ ds[i].GDPtb());
		}

	}

}
