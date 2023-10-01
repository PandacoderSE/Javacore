package java_bai51_SoSanhChuuoi;

public class SoSanhChuoi {
	public static void main(String[] args) {
		String s1="www xin chao co chu , xin chao cac ban" ;
		String s2="xin chao" ; 
		String s3="xin chao 123" ;
		//Ham indexof ; 
		System.out.println(s1.indexOf(s2));
		System.out.println(s1.indexOf(s3));
		// su dung vitri bat dau 
		System.out.println(" Vitri s2 tron s1 :"+s1.indexOf(s2,2));
		// co the tim vi tri cua ki tu 
		String s5=s3.concat(s2) ; 
		System.out.println("s5 : "+ s5.toUpperCase());
		
	}
}
