//B2113394, NGUYENMINHTAM, de5, ..
package de5;

import java.util.Scanner;


public class CNguoi {
	private String id, hten, ngay;
	private char phai;
	public CNguoi() {
		id = new String();
		hten = new String();
		ngay = new String();
		phai = '\0';
	}
	public CNguoi(CNguoi c) {
		id = new String(c.id);
		hten = new String(c.hten);
		ngay = new String(c.ngay);
		phai = c.phai;
	}
	public boolean phaiHopLe(char c) {
		if(c == 'M' || c== 'F') {
			return true;
		}else {
			System.out.println("Nhap khong dung dinh dang, hay nhap lai!");
		}
		return false;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so password hay CMND: ");
		id = sc.nextLine();
		System.out.println("Nhap ho va ten: ");
		hten = sc.nextLine();
		System.out.println("Nhap ngay-thang-nam sinh: ");
		ngay = sc.nextLine();
		while(true ) {
			System.out.println("Nhap phai(M: nam, F: nu): ");
			phai = sc.next().charAt(0);
			if(phaiHopLe(phai)) {
				break;
			}
		}

	}
	public void in() {
		System.out.println("So password hay CMND: "+ id + ", ho va ten: "+ hten + ", ngay-thang-nam sinh: "+ ngay + ", phai: "+ phai);
	}
	public String toString() {
		return ("So password hay CMND: "+ id + ", ho va ten: "+ hten + ", ngay-thang-nam sinh: "+ ngay + ", phai: "+ phai);
	}
	public String layHTen() {
		return hten;
	}
	public long tinhLuong() {
		return 0;
	}
	public static void main(String[] args) {
		CNguoi c1 = new CNguoi();
		c1.nhap();
		c1.in();
		CNguoi c2 = new CNguoi(c1);
		c2.in();

	}

}
