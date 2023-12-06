package buoi2;
import java.util.Scanner;
public class Date {
	private int d, m, y;
	public Date() {
		d=5;
		m=5;
		y=2025;
	}
	public Date(int day,int month,int year) {
		d=day;
		m=month;
		y=year;
	}
	public Date(Date k) {
		d=k.d;
		m=k.m;
		y=k.y;
	}
	public void hienThi() {
		System.out.println(d+ "/" + m + "/" + y);
	}
	public void nhap() {
		Scanner sc = new Scanner (System.in);
		do {
			System.out.println("Nhap vao ngay = ");
			d = sc.nextInt();	
			System.out.println("Nhap vao thang = ");
			m = sc.nextInt();	
			System.out.println("Nhap vao nam = ");
			y = sc.nextInt();	
			if(!hopLe()) System.out.println("Nhap sai, hay nhap lai!");
		}while(!hopLe());	
	}
	public boolean hopLe() {
		int max[] ={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if((y%4==0 && y%100!=0) || y%400==0)  {
			max[2]= 29;
		}
		if(y>0 && m>0 && m<13 && d>0 && d<=max[m] ) {
			return true;
		}
		return false;
	}
	public Date ngayHomSau() {
		Date d1= new Date(d,m,y);
		d1.d++;
		if(!d1.hopLe()) {
			d1.d =1;
			d1.m++;
			if(!d1.hopLe()) {
				d1.m = 1;
				d1.y++;
			}
		}
		return d1;
	}
	public Date congNgay(int n) {
		Date d1 = new Date(d,m,y);
		for(int i=0; i<n; i++) {
			d1 = d1.ngayHomSau();
		}
		return d1;
	}
	@Override
	public String toString() {
		return (d+ "/" + m + "/" + y);
	}
	
}