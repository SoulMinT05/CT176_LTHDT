package buoi2;
import java.util.Scanner;
public class Diem {
	private int x,y;
	
	public Diem () {
		x=2;
		y=3;
	}
	public Diem(int x1, int y1) {
		x=x1;
		y=y1;
	}
	public Diem (Diem d) {
		x=d.x;
		y=d.y;
	}
	
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap x = ");
		x = sc.nextInt();
		System.out.println("Nhap y = ");
		y = sc.nextInt();
	}
	public void hienThi() {
		System.out.println("("+ x + "," + y +")");
	}
	public void doiDiem(int dx, int dy) {
		x+=dx;
		y+=dy;
	}
	public int giaTriX() {
		return x;
	}
	public int giaTriY() {
		return y;
	}
	public float khoangCach() {
		return (float)Math.abs(Math.sqrt((x*x)+y*y));
	}
	public float khoangCach(Diem d) {
		return (float)Math.abs(Math.sqrt((Math.pow(x-d.x, 2)) + Math.pow(y-d.y, 2)));
	}

	public String toString() {
		return "("+ x + "," + y +")";
	}
}
