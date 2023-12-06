package buoi3;
import java.util.Scanner;

import buoi2.Date;

public class SinhVien {
	private String mso;
	private String hten;
	private Date nsinh;
	private int sl;
	private String mon[];
	private String diem[];
	private final int max = 50;
	
	public SinhVien() {
		mso = new String();
		hten = new String();
		nsinh = new Date();
		sl = 0;
		mon = new String[max];
		diem = new String[max];
	}
	public SinhVien(String mssv, String hoten, Date nsinhh) {
		mso = new String(mssv);
		hten = new String(hoten);
		nsinh = new Date(nsinhh);
		sl = 0;
		mon = new String[max];
		diem = new String[max];
	}
	public SinhVien(SinhVien sv) {
		mso = new String(sv.mso);
		hten = new String(sv.hten);
		nsinh = new Date(sv.nsinh);
//		Ham sao chep chi duoc ap dung voi 3 doi tuong co sv. o tren thoi, con 3 cai duoi khong an thua
		sl = 0;
		mon = new String[max];
		diem = new String[max];
		
		for(int i=0; i<sl; i++) {
			mon[i] = new String(sv.mon[i]);
			diem[i] = new String(sv.diem[i]);
		}
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so sinh vien: ");
		mso = sc.nextLine();
		System.out.println("Nhap ho ten sinh vien: ");
		hten = sc.nextLine();
		System.out.println("Nhap ngay thang nam sinh sinh vien: ");
		nsinh.nhap();
	}
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong mon cua sinh vien: ");
		sl = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<sl; i++) {
			System.out.println("Nhap mon sinh vien thu "+ (i+1)+ " :" );
			mon[i] = sc.nextLine();
			System.out.println("Nhap diem sinh vien thu "+ (i+1)+ " :" );
			diem[i] = sc.nextLine();
		}
	}
	public void in() {
		System.out.println("[" + mso + "," + hten + "," + nsinh);
		for(int i=0; i<sl; i++) {
			System.out.println("," + mon[i] + "," + diem[i]);
			
		}
		System.out.println("]");
	}
	public String toString() {
		String s = ("[" + mso + "," + hten + "," + nsinh);
		for(int i=0; i<sl; i++) {
			s+=("," + mon[i] + "-" + diem[i]);
		}
		s+=("]");
		return s;
	}
	public float diemtb() {
		float t = 0.0f;
		for(int i=0; i<sl; i++) {
			if(diem[i].equals("A")) return t = 4.0f;
			else if (diem[i].equals("B+")) return t = 3.5f;
			else if (diem[i].equals("B")) return t = 3.0f;
			else if (diem[i].equals("C+")) return t = 2.5f;
			else if (diem[i].equals("C")) return t = 2.0f;
			else if (diem[i].equals("D+")) return t = 1.5f;
			else if (diem[i].equals("D")) return t = 1.0f;
			else if (diem[i].equals("F")) return t = 0.0f;
		}
		return t/sl;
	}
	
//	Neu dung cau truc for(String e:mon) {
//		if(e==null) break; tranh truong hop max = 50, nhung can tinh it hon nhu 10, 20 thi khong tinh duoc
//	}
//	hoac for(SinhVien e: ds) {
//		if(e==null) break;
//	}
	public void them(String m, String d) {
		if(sl<max) {
			mon[sl] = new String(m);
			diem[sl] = new String(d);
			sl++;
		}else {
			System.out.println("Mang day!");
		}
	}
	public void xoa(String m) {
		int i=0;
		for(i=0; i<sl; i++) {
			if(mon[i].equals(m)) break;
		}
		if(i<sl) {
			for(int j=i;j<sl-1;j++) {
				mon[i] = mon[i+1];
				diem[i] = diem[i+1];
				sl--;
			}
		}
		
	}
	public String hoTen() {
		return hten.substring(hten.lastIndexOf(" ") + 1); // bat dau tu vi tri dau cach cuoi cung, roi cong them 1 don vi --> sau do lay tu do ve sau. 
			//VD: Cris huy hieu -> xuat ra: hieu. Nhung neu "  Cris huy hieu     " --> xuat ra dau cach
	}
	public String layhten() {
		return hten; // lay luon ca ho va ten, nhap gi lay het do --> xuat ra Cris huy hieu luon
	}
	public String laymso() {
		return mso;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
