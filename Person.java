package b2;

import java.util.Scanner;

public class Person {
	String hoten;
	String gioitinh;
	String diachi;
	String ngaysinh;
	public Person() {}
	public Person(String hoten,String gioitinh,String diachi,String ngaysinh) {
		this.hoten=hoten;
		this.gioitinh=gioitinh;
		this.diachi=diachi;
		this.ngaysinh=ngaysinh;
		}
	public void NhapN() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhap ho ten :");
		hoten=sc.nextLine();
		System.out.print("Nhap gioi tinh :");
	    gioitinh=sc.nextLine();
		System.out.print("Nhap dia chi :");
		diachi=sc.nextLine();
	    System.out.print("Nhap ngay sinh :");
	    ngaysinh=sc.nextLine();
	}
	public void inN() {
	System.out.println("Ho ten : "+hoten);
	System.out.println("Gioi Tinh :"+gioitinh);
	System.out.println("Dia chi :"+diachi);
	System.out.println("Ngay Sinh : "+ngaysinh);
	}
	
}
