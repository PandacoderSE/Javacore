package java_Bai44_abstract;

public class test {
	public static void main(String[] args) {
		Toado a1= new Toado(1,2) ; 
		Toado a2= new Toado(2, 3) ; 
		Toado a3= new Toado(5, 5) ; 
		
//		Hinh h = new Hinh(a3) ; lop trừu tượng ko tồn tại đc
		//khong the goi lop truu tuong abstract class
		// lop truu tuong tao ra cac hinh 
		Hinh h1 = new diem(a1) ; 
		Hinh h2 = new HinhTron(a3,100) ; 
		Hinh h3 = new HinhChuNhat(a2,3,2) ;
		
		
		
		System.out.println(" Hinh tron :"+ h2.dientich());
		System.out.println(" Diem :"+ h1.dientich());
		System.out.println(" Hinh CN :"+ h3.dientich());
		
	}
}
