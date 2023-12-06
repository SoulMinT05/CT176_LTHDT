package buoi4;
import java.util.Scanner;

import buoi2.Diem;
public class DiemMau extends Diem{
		private String color;
		
		public DiemMau() {
			super();
			color = new String();
		}
		public DiemMau(int x1, int y1, String m1) {
			super(x1, y1);
			color = new String(m1);
		}
		public DiemMau(DiemMau m) {
			super(m);
			color = new String(m.color);
		}
		public void GanMau(String mau) {
			color = new String(mau);
		}
		public void nhap() {
			super.nhapDiem();
			Scanner sc= new Scanner(System.in);
			System.out.println("Nhap mau: ");
			color = sc.nextLine();
		}
		public void in() {
			super.hienThi();
			System.out.println("Mau vua nhap la: " + color);
		}
		public String toString() {
			return super.toString() + ",voi mau: "+ color;
		}
}
