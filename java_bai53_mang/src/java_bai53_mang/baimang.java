package java_bai53_mang;

import java.lang.reflect.Array;
import java.util.Arrays;

public class baimang {
	public static void main(String[] args) {
		//Kiểu Nguyên Thủy 
		int[] a1= {1,2,3,4} ; 
		
		
		//copy mảng 
		int []a2=a1 ; 
		a2[0]=1000 ; 
		System.out.println("mang 1 :"+Arrays.toString(a1));
		//Nguyên thủy nên thay đổi cả 2 mảng và quan hệ với nhau khi thay đổi 
		
		//copy mảng = clone() ; 
		int []a3=a1.clone() ; 
		a3[2]=1000 ; 
		System.out.println("a3 :"+ Arrays.toString(a3));
		System.out.println("a1 :"+ Arrays.toString(a1));
		//Khổng ảnh huwongr tới nhau khi thay đổi giá trị 
		
		//hàm system.arraycopy ; 
		int[]a4= new int[4] ; 
		System.arraycopy(a1, 0, a4, 0,a1.length);
		a4[3]=0 ; 
		System.out.println("a1 :"+ Arrays.toString(a1));
		System.out.println("a4 :"+ Arrays.toString(a4));
		// Thay đổi không ảnh hưởng đến mảng khác 
		

	}
}
