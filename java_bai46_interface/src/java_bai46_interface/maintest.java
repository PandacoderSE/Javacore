package java_bai46_interface;

public class maintest {
	public static void main(String[] args) {
		System.out.println("Test câu a ");
		//cách khai báo 
		MaytinhCasioFX500 m1 = new MaytinhCasioFX500() ; 
		MaytinhvinaCal500 m2= new MaytinhvinaCal500() ; 
		
		System.out.println(" 5+3="+ m1.cong(5,3));
		System.out.println("4*5="+ m2.nhan(4,5));
		System.out.println(" 4/5="+m1.chia(4,0));
		
		System.out.println(" test cau b ");
		double a[] = new double[] {1,3,4,2,5,7,9} ;
		Sapxepchen sxc= new Sapxepchen() ; 
		Sapxepchon sxchon = new Sapxepchon() ; 
		sxc.sapxeptang(a) ; 
		for(int i=0 ; i<a.length ; i++) {
			System.out.print(" - "+ a[i]);
		}
		sxchon.sapxepgiam(a) ; 
		System.out.println(" \n");
		for(int i=0 ; i<a.length ; i++) {
			System.out.print(" - "+ a[i]);
		}
		System.out.println(" Test câu c : da ke thua tron interface");
		//1 lop ke thua nhieu intreface khac nhau 
		PhanMemaytinh_nhieuinterface PM1 = new PhanMemaytinh_nhieuinterface() ; 
		System.out.println("10 +10 ="+ PM1.cong(10, 10));
		double b[]= new double [] {12.5 , 13, 11 , 10} ; 
		PM1.sapxeptang(b) ; 
		for(int i=0 ; i<b.length ; i++) {
			System.out.print("\\"+b[i]);
		}
	}
}
