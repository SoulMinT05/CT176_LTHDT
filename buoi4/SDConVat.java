package buoi4;

import java.util.Scanner;

public class SDConVat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap danh sach con vat: ");
		int n = sc.nextInt();
		int c;
		ConVat ds[] = new ConVat[n];
		for(int i=0; i<n; i++) {
			ds[i] = new ConVat();
		}
		for(int i=0; i<n; i++) {
			System.out.println("Nhap thong tin chon con vat: \n1.Bo \n2.Heo \n3.De \n4.Ga");
			c = sc.nextInt();
			if(c==1) ds[i] = new Bo();
			else if(c==2) ds[i] = new Heo();
			else if(c==3) ds[i] = new De();
			else ds[i] = new Ga();
			ds[i].nhap();
		}
		for(int i=0; i<n; i++) {
			System.out.println("Xuat thong tin cho con vat thu "+ (i+1) +" :" );
			ds[i].in();
			ds[i].keu();
		}
		
	}

}
