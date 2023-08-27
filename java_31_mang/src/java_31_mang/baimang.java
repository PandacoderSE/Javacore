package java_31_mang;

import java.util.Scanner;

public class baimang {
	static int xoaphantu(double mang[], int vitri , int n) {
		for(int i=vitri ; i<n-1 ; i++) {
			mang[i]=mang[i+1] ;
		}
		return n-1 ; 
	}
	public static void main(String[] args) {
		double mang[] ; 
		Scanner sc =new Scanner(System.in) ; 
		System.out.println("Nhap n :");
		int n ; 
		n=sc.nextInt() ; 
		mang=new double[n] ; 
		for (int i = 0; i < mang.length; i++) {
			System.out.println("Moi ban nhap phan tu thu "+i+":");
			mang[i]=sc.nextDouble() ;
		}
		System.out.print("Mang Vua Nhap :");
		for (int i = 0; i < mang.length; i++) {
			System.out.print("\t"+mang[i]);
		}
		//thuc hien xap xep mang 
		System.out.print("sap xep tang dan ");
		for(int i=1 ; i<mang.length; i++) {
			for(int j=0 ; j<mang.length-i; j++) {
				if(mang[j]>mang[j+1]) {
					double tmg ; 
					tmg=mang[j] ; 
					mang[j]=mang[j+1] ; 
					mang[j+1]=tmg ; 
			}
		}
		}
		System.out.print("sap xep tang dan ");
		for (int i = 0; i < mang.length; i++) {
			System.out.print("\t"+mang[i]);
		}
		int vitri ; 
		System.out.println("Nhap vi tri can xoa :");
		vitri=sc.nextInt() ;
		n=xoaphantu(mang, vitri,n);
		System.out.print("Mang sau khi xoa :");
		for (int i = 0; i < n; i++) {
			System.out.print("\t"+mang[i]);
		}
		
			
	}
}
