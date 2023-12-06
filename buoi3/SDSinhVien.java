package buoi3;

import java.util.Scanner;

public class SDSinhVien {

	public static void main(String[] args) {
		SinhVien a = new SinhVien();
		System.out.println("Nhap thong tin cho sinh vien a: ");
		a.nhap();
//		System.out.println("Thong tin sinh vien a vua duoc nhap: "+ a);
//		a.nhapDiem();
		System.out.println("Thong tin mon hoc sinh vien a vua duoc nhap: "+ a);
		a.them("LTHDT", "A");
		System.out.println("Thong tin sinh vien a vua duoc them mon LTHDT: "+ a);
		
		
		SinhVien b = new SinhVien(a);
		System.out.println("Thong tin sv b: "+ b);
		b.them("NMLTW", "A");
		System.out.println("Thong tin sinh vien a vua duoc them mon NMLTW: "+ b);
		b.them("TRR", "A");
		System.out.println("Thong tin sinh vien a vua duoc them mon TRR: "+ b);
		b.xoa("NMLTW");
		System.out.println("Thong tin sinh vien a vua duoc xoa mon NMLTW: "+ b);
		b.xoa("LTHDT");
		System.out.println("Thong tin sinh vien a vua duoc xoa mon LTHDT: "+ b);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		SinhVien ds[] = new SinhVien[n];
		
		for(int i=0; i<n; i++) {
			ds[i] = new SinhVien();
		}
		for(int i=0; i<n; i++) {
			System.out.println("Nhap thong tin sinh vien thu "+ (i+1) + " :");
			ds[i].nhap();
			ds[i].nhapDiem();
		}
		for(int i=0; i<n; i++) {
			System.out.println(ds[i] + ",voi diem trung binh: "+ ds[i].diemtb());
		}
		
		System.out.println("Danh sach sinh vien bi canh bao hoc vu: ");
		for(SinhVien s : ds) {
			if(s.diemtb()<1) {
				System.out.println(s.laymso() + "-" + s.hoTen() + " bi canh bao hoc vu!");
			}else {
				System.out.println("Sinh vien "+ s.hoTen()+ " khong bi canh bao hoc vu!");
			}
		}
		
		float max = ds[0].diemtb();
		for(SinhVien s : ds) {
			if(max< s.diemtb()) {
				max = s.diemtb();
			}
		}
		System.out.println("Sinh vien co diem trung binh cao nhat lop: ");
		for(SinhVien s : ds) {
			if(s.diemtb()==max) {
				System.out.println(s.laymso() + "-" + s.hoTen());
			}
		}
		
		System.out.println("Danh sach sinh vien dc sap xep theo ten: ");
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				if(ds[i].layhten().compareTo(ds[j].layhten())>0) {
					SinhVien temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}
			}
		}
		for(SinhVien s : ds) {
			System.out.println(s);
		}
				
				
	}

}
