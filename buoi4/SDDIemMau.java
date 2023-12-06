package buoi4;

public class SDDIemMau {

	public static void main(String[] args) {
		DiemMau A = new DiemMau(5, 10 ,"Trang");
		System.out.println("Diem mau A vua dc nhap la: "+ A);
		
		DiemMau B = new DiemMau();
		B.nhap();
		System.out.println("Diem mau B vua dc nhap la: "+ B);
		B.doiDiem(10, 8);
		System.out.println("Diem mau B vua dc doi la: "+ B);
		B.GanMau("Vang");
		System.out.println("Diem mau B vua dc doi mau la: "+ B);
		
		
	}

}
