package buoi5;

import java.util.Scanner;

public class KhachHangVip extends KhachHang{
	private float tLeGiam;
	private Date d;
	public KhachHangVip() {
		super();
		tLeGiam = 0.0f;
		d = new Date();
	}
	public KhachHangVip(KhachHangVip kv) {
		super(kv);
		tLeGiam = kv.tLeGiam;
		d = new Date(kv.d);
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ti le giam: ");
		tLeGiam = sc.nextFloat();
		System.out.println("Nhap ngay cua Vip: ");
		d.nhap();
	}
	public void in() {
		super.in();
		System.out.println("Ti le giam: " + tLeGiam  + ",ngay cua Vip: "+d);
	}
	public String toString() {
		return (super.toString()+", Ti le giam: " + tLeGiam  +", ngay cua Vip: "+ d);
	}
	public float layTLeGiam() {
		return tLeGiam;
	}
}
