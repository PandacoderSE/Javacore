package test;

import code.Vidu1;
//khong cho de ten giong nhau 
//import code_b.Vidu1;
//java_Bai47_goi_package/src/test : cách tạo package con 
public class testvidu {
	public static void main(String[] args) {
		Vidu1 vidu1 = new Vidu1(5,6) ; 
		System.out.println(vidu1.getA());
		// nhung co cách có thể gọi 
		code_b.Vidu1 vd2= new code_b.Vidu1(1,2,3) ; 
		System.out.println(vd2.getA());
		
		// Cách tạo ngày tháng năm 
	}
}
