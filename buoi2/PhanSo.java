package buoi2;
import java.util.Scanner;
public class PhanSo {
	private int t, m;
	public PhanSo() {
		t=1;
		m=2;
	}
	public PhanSo(int tu, int mau) {
		t=tu;
		m=mau;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap vao tu so = ");
			t = sc.nextInt();
			System.out.println("Nhap vao mau so = ");
			m = sc.nextInt();
			if(m==0) System.out.println("Nhap sai, hay nhap lai");
		}while(m==0);
	}
	public void hienThi() {
		if(t==0) System.out.println("Tu so = 0, phan so = "+ 0);
		else if(m==1) System.out.println("Mau so = 1, phan so = "+ t);
		else if(t==m) System.out.println("Gia tri cua phan so = "+ 1);
		else if(t*m<0) System.out.println("Gia tri cua phan so = "+ -t+ "/" + Math.abs(m));
		else {
			System.out.println("Gia tri cua phan so = "+ Math.abs(t)+ "/"+ Math.abs(m));
		}
	}
	
	@Override
	public String toString() {
		if(t==0) return ("Tu so = 0, phan so = "+ 0);
		else if(m==1) return ("Mau so = 1, phan so = "+ t);
		else if(t==m) return ("Gia tri cua phan so = "+ 1);
		else if(t*m<0) return ("Gia tri cua phan so = "+ -t+ "/" + Math.abs(m));
		else {
			return ("Gia tri cua phan so = "+ Math.abs(t)+ "/" + Math.abs(m));
		}
	}
	public void nghichDao() {
		int temp = t;
		t = m;
		m = temp;
	}
	public PhanSo giatriNghichDao() {
		PhanSo s = new PhanSo(m, t);
//		System.out.println("Gia tri nghich dao = "+ m/t);
		return s;
	}
	public void hienThiGTND() {
		System.out.println("Gia tri nghich dao = "+ (float)m/t);
	}
	public float giaTriThuc() {
		return (t/m);
	}
	public boolean lonHon(PhanSo a) {
		return giaTriThuc() > a.giaTriThuc();
	}
	public int timUcln(int a, int b) {
		int temp = a%b;
		while(temp!=0) {
			a=b;
			b=temp;
			temp=a%b;
		}
		return b;
	}
	public PhanSo toiGianPS() {
		PhanSo z = new PhanSo(t,m);
		int UCLN = z.timUcln(t, m);
		z.t = z.t / UCLN;
		z.m = z.m / UCLN;
		return z;
	}
	public PhanSo congPs(PhanSo b) {
		PhanSo kq = new PhanSo();
		kq.t = t*b.m + m*b.t;
		kq.m = m*b.m;
		return kq.toiGianPS();
	}
	public PhanSo cong(int n) {
		PhanSo s = new PhanSo(n,1);
		return congPs(s);
	}
	public PhanSo truPs(PhanSo b) {
		PhanSo kq = new PhanSo();
		kq.t = t*b.m - m*b.t;
		kq.m = m*b.m;
		return kq.toiGianPS();
	}
	public PhanSo tru(int n) {
		PhanSo s = new PhanSo(n,1);
		return truPs(s);
	}
	public PhanSo nhanPs(PhanSo b) {
		PhanSo kq = new PhanSo();
		kq.t = t*b.t;
		kq.m = m*b.m;
		return kq.toiGianPS();
	}
	public PhanSo nhan(int n) {
		PhanSo s = new PhanSo(n,1);
		return nhanPs(s);
	}
	public PhanSo chiaPs(PhanSo b) {
		PhanSo kq = new PhanSo();
		kq.t = t/b.t;
		kq.m = m/b.m;
		return kq.toiGianPS();
	}
	public PhanSo chia(int n) {
		PhanSo s = new PhanSo(n,1);
		return chiaPs(s);
	}
	
	
	
	
	
}
