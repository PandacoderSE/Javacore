package java_bai31_OOP;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		double b,x ; 
		hoadonCF HD1= new hoadonCF("Nguyen Manh",100, 1) ; 
		System.out.println("Tong Tien :"+HD1.tongTien());
		Scanner sc=new Scanner(System.in) ; 
		System.out.println("Nhap B de kiem tra :");
		b=sc.nextDouble() ; 
		System.out.println("Kiem tra B< khoi luong ban : "+HD1.kiemTraKhoiLuong(b));
		System.out.println("Kiem tra Tong tien >500 :"+HD1.kiemTraGiaTien());
		System.out.println("------------ Giam Gia  nhap %:");
		x=sc.nextDouble() ;
		System.out.println(" Ket Qua Giam Gia :" + HD1.giamGia(x));
		System.out.println(" So Tien Con Lai Can Thanh Toan :"+HD1.tienCuoi(x));
	}
}
