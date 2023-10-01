package viDu;

import java.util.Arrays;

public class Tesst {
	public static void main(String[] args) {
		String chuoi1="Xin chao cac ban , tui la peter" ; 
		// silip(cắt theo kiểu gì)
		String[] A=chuoi1.split(" ") ; 
		System.out.println(" A :"+ Arrays.toString(A));
		//
		String[] B=chuoi1.split(",") ; 
		System.out.println("B :"+ Arrays.toString(B));
		// Cách cắt "," và "." trong cùng 1 câu : \\.|\\,
		String chuoi2="Xin Chao, Toi La pêt. Lap trinh vien .Manh" ;
		String[] C=chuoi2.split("\\.|\\,") ; 
		System.out.println("C :"+Arrays.toString(C));
	}
}
