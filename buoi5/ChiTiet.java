package buoi5;

import java.util.Scanner;

public class ChiTiet {
	private int sluong;
	private float dgia;
	private HangHoa h;
	
	public ChiTiet() {
		sluong = 1;
		dgia = 1;
		h = new HangHoa();
	}
	public ChiTiet(ChiTiet c) {
		sluong = c.sluong;
		dgia = c.dgia;
		h = new HangHoa(c.h);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong: ");
		sluong = sc.nextInt();
		System.out.println("Nhap don gia: ");
		dgia = sc.nextFloat();
		h.nhap();
	}
	public void in() {
		System.out.println("So luong: "+ sluong + " ,don gia: "+ dgia + h);
	}
	public String toString() {
		return ("So luong: "+ sluong + " ,don gia: "+ dgia + h);
	}
	public float layDGia() {
		return dgia;
	}
	public int laySLuong() {
		return sluong;
	}
}
