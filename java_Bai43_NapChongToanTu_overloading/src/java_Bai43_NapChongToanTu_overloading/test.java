package java_Bai43_NapChongToanTu_overloading;
// muc tieu overloading : phuong thuc giong co the nhap tham so khac 
public class test {
	public static void main(String[] args) {
		Mymath mm= new Mymath() ; 
		// khoi tao mang
		double a[]= new double[] {1,2,3,4} ;
		System.out.println("Tim min 5 6 :"+ mm.timMin(5,6));
		System.out.println("Tim min 5.5 6 :"+ mm.timMin(5.5,6));
		System.out.println(" tong 5 6:"+mm.tinhtong(5,6));
		System.out.println(" tong mang a[] :"+mm.tinhtong(a));
	}
}
