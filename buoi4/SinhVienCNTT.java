package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien{
	private String tk, mk, email;
	
	public SinhVienCNTT() {
		super();
		tk = new String();
		mk = new String();
		email = new String();
	}
	public SinhVienCNTT(String taikhoan,String matkhau,String mail) {
		super();
		tk = new String(taikhoan);
		mk = new String(matkhau);
		email = new String(mail);
	}
	public SinhVienCNTT(SinhVienCNTT s) {
		super(s);
		tk = new String(s.tk);
		mk = new String(s.mk);
		email = new String(s.email);
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tai khoan: ");
		tk = sc.nextLine();
		System.out.println("Nhap mat khau: ");
		mk = sc.nextLine();
		System.out.println("Nhap email: ");
		email = sc.nextLine();
	
	}
	public void in() {
		super.in();
		System.out.println("Tai khoan vua duoc nhap: "+ tk);
		System.out.println("Mat khau vua duoc nhap: "+ mk);
		System.out.println("Email vua duoc nhap: "+ email);
	}
	public String toString() {
		return super.toString() + ", voi tai khoan: " + tk + ", voi mat khau: "+ mk+ ", voi email: "+ email;
	}
	public String layEmail() {
		return email;
	}
	public String layTK() {
		return tk;
	}
	public void doiMK(String newpass) {
		mk = new String(newpass);
	}
 }
