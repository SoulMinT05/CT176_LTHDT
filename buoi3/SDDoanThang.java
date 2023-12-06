package buoi3;
import buoi2.Diem;
public class SDDoanThang {

	public static void main(String[] args) {
		Diem a = new Diem(2, 5);
		Diem b = new Diem(20, 35);
		DoanThang AB = new DoanThang(a, b); 
		System.out.println("AB = "+ AB);
		AB.tinhtien(5, 3);
		System.out.println("Do dai doan AB sau khi tinh tien la: "+ AB);
		
		
		DoanThang CD = new DoanThang();
		CD.nhap();
		System.out.println("CD = "+ CD);
		System.out.println("Do dai doan CD sau khi tinh la: "+ CD.dodai());
		System.out.println("Goc cua doan CD voi truc hoanh sau khi tinh la: "+ CD.goc());

	}

}
