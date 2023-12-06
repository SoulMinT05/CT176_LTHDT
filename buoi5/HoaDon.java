package buoi5;

import java.util.Scanner;

public class HoaDon {
	private String mso, tde, nvien;
	private KhachHang k;
	private Date d;
	private ChiTiet c[];
	private int sl;
	public HoaDon() {
		mso = new String();
		tde = new String();
		nvien = new String();
		k = new KhachHang();
		d = new Date();
		sl = 0;
		c = new ChiTiet[20];
	}
	public HoaDon(HoaDon h) {
		mso = new String(h.mso);
		tde = new String(h.tde);
		nvien = new String(h.nvien);
		k = new KhachHang(h.k);
		d = new Date(h.d);
		sl = h.sl;
		c = new ChiTiet[20];
		for(int i=0; i<sl; i++) {
			if(h.c[i] == null) break;
			else c[i] = new ChiTiet(h.c[i]);
		}
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so: ");
		mso = sc.nextLine();
		System.out.println("Nhap tieu de: ");
		tde = sc.nextLine();
		System.out.println("Nhap nhan vien: ");
		nvien = sc.nextLine();
		
		d.nhap();
		System.out.println("Nhap so luong hoa don: ");
		sl = sc.nextInt();
		
		System.out.println("Chon Khach hang(0) hay Khach hang VIP(1): ");
		int d= sc.nextInt();
		if(d==0) k = new KhachHang();
		else k = new KhachHangVip(); 
		k.nhap();
		for(int i=0; i<sl; i++) {
			c[i] = new ChiTiet();
			System.out.println("Nhap chi tiet thu "+ (i+1) +":");
			c[i].nhap();
//			c[i].
		}
		
		
	}
	public void in() {
		System.out.println("Ma so: "+ mso + "\nTieu de: "+ tde+ "\nNhan vien: "+ nvien + "\nKhach hang: "+ k + "\nNgay, thang, nam: "+ d + "\nSo luong: "+ sl);
		for(int i=0; i<sl; i++) {
			System.out.println("Chi tiet thu "+(i+1) + ":"+ c[i]);
		}
		System.out.println("Tong tien: "+ tong());
		
	}
	public String toString() {
		String s =("Ma so: "+ mso + "\nTieu de: "+ tde+ "\nNhan vien: "+ nvien + "\nKhach hang: "+ k + "\nNgay, thang, nam: "+ d + "\nSo luong: "+ sl);
		for(int i=0; i<sl; i++) {
			s+=("Chi tiet thu "+(i+1) + ": "+ c[i]);
		}
		s+=("Tong tien: "+ tong());
		return s;
	}
	public float tong() {
		float t = 0.0f;
		for(int i=0; i<sl; i++) {
			t+= c[i].layDGia() + c[i].laySLuong();
		}
		
		t= t-t*k.layTLeGiam();
		return t;
	}
}
