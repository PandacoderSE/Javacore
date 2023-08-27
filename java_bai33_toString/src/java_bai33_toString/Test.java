package java_bai33_toString;

public class Test {
	public static void main(String[] args) {
		myDate mD1= new myDate(15, 5, 2015) ; 
		myDate mD2= new myDate(15, 5, 2015) ;
		myDate mD3= new myDate(5, 5, 2009) ;
		
		System.out.println(mD1 );
		System.out.println(mD2);
		System.out.println(mD3);
		//khong the in , in ra ma doi tuong 
		// Phai viet hamf toString 
		//Phần 2 hàm equals : so sánh các đối tượng giống nhau hay ko 
		//		hàm  hasecode 
//		if(mD1==mD2) {
//			System.out.println("bằng");
//		}else {
//			System.out.println("khong bang ");
//		}
		// Nó lại không = ??? =>> ko thể so sánh bằng == cho ddối tượng 
		// phải sử dụng phương thức (equals(đối tượng ) thì mới so sánh đc 
		System.out.println("So Sanh MD1 va MD2 :" + mD1.equals(mD2));
		System.out.println("So Sanh MD1 va MD3 :" + mD1.equals(mD3));
		
		//hasdCode : hàm Băm 
		System.out.println("HashCode MD1 :"+mD1.hashCode());
		System.out.println("HashCode MD2 :"+mD2.hashCode());
		System.out.println("HashCode MD3 :"+mD3.hashCode());

	}
}
