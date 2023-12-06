package de5;

import java.util.Scanner;

// B2113394, NGUYENMINHTAM, de5, ..
public class CThu extends CNguoi{
	private int so;
	private String vtri, mua, clbo;
	private long bthang;
	
	public CThu() {
		super();
		so = 1;
		vtri = new String();
		mua = new String();
		clbo = new String();
		bthang = 1;
	}
	public CThu(CThu c) {
		super(c);
		so = c.so;
		vtri = new String(c.vtri);
		mua = new String(c.mua);
		clbo = new String(c.clbo);
		bthang = c.bthang;
	}
	public boolean cauThuHopLe(String vt) {
		String a[] = {"thu mon", "hau ve", "tien dao", "tien ve", "trung ve"};
		for(int i=0; i<a.length; i++) {
			if(a[i].equalsIgnoreCase(vt)) {
				return true;
			}
		}

		System.out.println("Nhap khong dung dinh dang, hay nhap lai!");
		return false;
		
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so: ");
		so = sc.nextInt();
		sc.nextLine();
		while(true) {
			System.out.println("Nhap vi tri: ");
			vtri = sc.nextLine();
			if(cauThuHopLe(vtri)) {
				break;
			}
		}
		System.out.println("Nhap mua: ");
		mua = sc.nextLine();
		System.out.println("Nhap cau lac bo: ");
		clbo = sc.nextLine();
		System.out.println("Nhap ban thang: ");
		bthang = sc.nextLong();
	}
	public void in() {
		super.in();
		System.out.println("So: "+ so + ", vi tri: "+ vtri + ", mua: "+ mua + ", cau lac bo: "+ clbo + ", ban thang: "+ bthang);
	}
	public String toString() {
		return (super.toString()  + "So: "+ so + ", vi tri: "+ vtri + ", mua: "+ mua + ", cau lac bo: "+ clbo + ", ban thang: "+ bthang);
	}
	public long tinhLuong() {
		long luongcoban = 7000000;
		long luongtangthem = 0;
		if(vtri.equalsIgnoreCase("thu mon")) {
			luongtangthem = 3000000;
		}else if(vtri.equalsIgnoreCase("hau ve")) {
			luongtangthem = 4000000;
		}else if(vtri.equalsIgnoreCase("trung ve")) {
			luongtangthem = 4500000;
		}else if(vtri.equalsIgnoreCase("tien ve")) {
			luongtangthem = 5000000;
		}else if(vtri.equalsIgnoreCase("tien dao")) {
			luongtangthem = 7000000;
		}
		long luongthuong = bthang*500000;
		long tongtienluong = luongcoban + luongtangthem + luongthuong;
		long luonghuong = tongtienluong - tongtienluong * 10 /100;
		return luonghuong;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CNguoi ds[];
		System.out.println("Nhap tong so doi tuong: ");
		int n = sc.nextInt();
		ds = new CNguoi[n];
		int d;
		for(int i=0; i<n; i++) {
			System.out.println("Ban muon chon Con nguoi(0) hay Cau thu(1): ");
			d = sc.nextInt();
			if(d==0) ds[i] = new CNguoi();
			else ds[i] = new CThu();
			System.out.println("Nhap thong tin cho doi tuong thu "+ (i+1) + " : ");
			ds[i].nhap();
		}
		for(int i=0; i<n; i++) {
			System.out.println("Thong tin cho doi tuong thu "+ (i+1) + " : ");
			ds[i].in();
		}
		System.out.println("Danh sach tien luong cua cau thu: ");
		for(int i=0; i<n; i++) {
			System.out.println("	Ho va ten: "+ ds[i].layHTen() + ", voi tien luong: "+ ds[i].tinhLuong());	
		}
	}

}
