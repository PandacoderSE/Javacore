package java_Bai43_NapChongToanTu_overloading;
// overloading : vieets phuoung thuc co ten giong nhau , khc kieu du lieu cua bien 
public class Mymath {
	public int timMin(int a , int b) {
		if(a<b) {
			return a ; 
		} else return b ; 
	}
	public double timMin(double a , double b) {
		if(a<b) {
			return a ; 
		} else return b ; 
	}
	public double tinhtong(double a , double b) {
		return a+b ; 
	}
	public double tinhtong(double arr[]) {
		double tong=0 ; 
		for (int i = 0; i < arr.length; i++) {
			tong+=arr[i] ; 
		}
		return tong ; 
	}
}
