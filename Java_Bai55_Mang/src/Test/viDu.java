package Test;

import java.util.Arrays;
// Hàm arrays. : khá hay 

import ViDu.SinhVien;

public class viDu {
	public static int[] daonguoc(int[] x) {
		int[] rs=new int[x.length] ; 
		int j=0 ; 
		for(int i=x.length-1 ; i>=0 ; i--) {
			rs[j]=x[i] ; 
			j++ ; 
		}
		return rs ;
	}
	public static void main(String[] args) {
		int[] a= new int[] {1,8,2,6,4,3,7,9} ; 
		int[] b= new int[15] ; 
		SinhVien sv1 = new SinhVien(150,"Ngyen Manh","A1",9.5f) ;
		SinhVien sv2 = new SinhVien(123,"Mai Anh","A1",8) ;
		
		// sap xep :
		System.out.println(" Mang ban dau :"+Arrays.toString(a));
		//thuchien : sort : xap xếp tăng dân 
		Arrays.sort(a);
		//sau khi sap xep 
		System.out.println(" Mang sau khi sap :"+Arrays.toString(a));
		//Hàm Tìm Kiếm , dua ra vi chi => sắp xếp ms tìm kiếm đc 
		int ketQuaTimKiem=Arrays.binarySearch(a,4) ; 
		System.out.println(" vi tri 6 La :"+ketQuaTimKiem) ;
		//sap xep giam dan 
		//Object[] k= new Object[] {sv1,sv2} ; 
		Arrays.sort(a);
		a=viDu.daonguoc(a);
		System.out.println("Mang sau khi sap xep Nguoc lai :" +Arrays.toString(a));
		
	}
}
