package de4;
// B2113394, NGUYEBNMINHTAM, DE5, 
import java.util.Scanner;

public class Xe {
	private String soxe, loai, ngay;
	private char tthai;
	public Xe() {
		soxe = new String();
		loai = new String();
		ngay = new String();
		tthai = '\0';
	}
	public Xe(Xe x) {
		soxe = new String(x.soxe);
		loai = new String(x.loai);
		ngay = new String(x.ngay);
		tthai = x.tthai;
	}
	
	public boolean trangthaihopLe(char c) {
		if(c == 'C' || c == 'K') {
			return true;
		}else {
			System.out.println("Nhap loai khong dung dinh dang, hay nhap lai!");
		}
		return false;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so xe: ");
		soxe = sc.nextLine();
		System.out.println("Nhap loai: ");
		loai = sc.nextLine();
		System.out.println("Nhap ngay: ");
		ngay = sc.nextLine();
		while(true) {
			System.out.println("Nhap trang thai: ");
			tthai = sc.next().charAt(0);
			if(trangthaihopLe(tthai)) {
				break;
			}
		}
	}
	public void in() {
		System.out.println("So xe: "+ soxe + ", loai: "+ loai+ ", ngay: "+ ngay+", trang thai: "+ tthai);
	}
	public String toString() {
		return ("So xe: "+ soxe + ", loai: "+ loai+ ", ngay: "+ ngay+", trang thai: "+ tthai);
	}
	public char layTthai() {
		return tthai;
	}
	public String layLoai() {
		return loai;
	}
	public String layNgay() {
		return ngay;
	}
	
	
	public static void main(String[] args) {
		Xe x1 = new Xe();
		x1.nhap();
		x1.in();
		Xe x2 = new Xe(x1);
		x2.in();

	}

}
