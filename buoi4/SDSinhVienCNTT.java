package buoi4;

import java.util.Scanner;

public class SDSinhVienCNTT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so lhuong sinh vien: ");
		int n = sc.nextInt();
		
		SinhVienCNTT ds[] = new SinhVienCNTT[n];
		for(int i=0; i<n; i++) {
			ds[i] = new SinhVienCNTT();
			
		}
		for(int i=0; i<n; i++) {
			System.out.println("Nhap thong tin sinh vien thu "+ (i+1) + " :");
			ds[i].nhap();
		}
		for(int i=0; i<n; i++) {
			System.out.println("Xuat thong tin sinh vien thu "+ (i+1) + " :" + ds[i]);
		}
		
		
		String email;
		sc.nextLine();
		System.out.println("Nhap dia chi email: ");
		email = sc.nextLine();
		boolean tim = false;
		for(int i=0; i<n; i++) {
			if(ds[i].layEmail().compareToIgnoreCase(email)==0) {
				System.out.println("Tim duoc sinh vien co dia chi email: "+ ds[i].layEmail()
						+ ", voi tai khoan: "+ ds[i].layTK() + ",voi diem trung binh: "+ ds[i].diemtb());
				tim= true;
				break;
			}
		}
		
		
		if(tim==false ) System.out.println("Khong tim duoc thong tin!");
		
		
	}

}
