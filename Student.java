package b2;

import java.util.Scanner;

public class Student extends Person {
	int maSV;
	float dtb;
	String email;
	Person n=new Person();
	public Student() {}
	public Student(int maSV,float dtb,String email) {
		this.maSV=maSV;
		this.dtb=dtb;
		this.email=email;
	}
public void NhapSV() {
	Scanner sc= new Scanner(System.in);
	System.out.print("Nhap ma sinh vien :");
	maSV=sc.nextInt();
	n.NhapN();
	System.out.print("Nhap diem trung binh :");
	dtb=sc.nextFloat();
	System.out.print("Nhap email sinh vien :");
    email=sc.nextLine();
   
}
public void XuatSV() {
	System.out.println("maSV :"+maSV);
	n.inN();
	System.out.println("diem trung binh :"+dtb);
	System.out.println("email :"+email);
	
 
}
public void kiemtrahocbong(){
	if(dtb >=8){
		System.out.println("Duoc hoc bong");
	}else{
		System.out.println("Khong duoc hoc bong");
	}
}
public static void main(String[] args) {
	Student st=new Student();
	st.NhapSV();
	System.out.println("\nTHONG TIN SINH VIEN");
	st.XuatSV();
	st.kiemtrahocbong();
}
}
