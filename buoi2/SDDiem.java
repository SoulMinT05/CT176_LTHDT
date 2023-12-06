package buoi2;

public class SDDiem {

	public static void main(String[] args) {
		Diem a = new Diem(3,4);
		System.out.println("Toa do diem A: "+a.toString());
		Diem b = new Diem();
		b.nhapDiem();
		System.out.println("Toa do diem B: " + b.toString());
		Diem c = new Diem(-b.giaTriX(), -b.giaTriY());
		System.out.println("Toa do diem C: " + c.toString());
		System.out.println("Khoang cach tu diem B den tam O: "+ b.khoangCach());
		System.out.println("Khoang cach tu diem A den tam B: "+a.khoangCach(b));
	}

}
