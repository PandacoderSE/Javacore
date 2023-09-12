package code;

import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ; 
		String s ; 
		System.out.println(" Moi Ban Nhap chuoi :");
		s=scanner.nextLine() ; 
		System.out.println("-------------------");
		//chieu dai chuoi => ham lenght()
		System.out.println(s.length());
		
		//Ham charAt() => lay ky tu ow vi tri bat ki trong chuoi 
		System.out.println(" Lay kytu 5 trong chuoi s :"+s.charAt(5));
		
		//Ham getChar(VT bat dau,VT ket thuc,Mang luu du lieu,vitri bat dau luu cua mang) : Lay hang loat ki tu 
		char a[]=new char[100] ; 
		s.getChars(0,6,a,5);
		for(int i=0 ; i<a.length ; i++) {
			System.out.println(" ViTri "+i+" Ky tu :"+a[i]);
		}
		
		//Ham getByte=>có 3 cách lấy ra giá trị các ký tự 
		// so sanh chu == so 
		 byte b[] =s.getBytes() ;
		 for (byte c : b) {
			System.out.print(c+" ");
		}
		
	}
}
