package java_bai30_OOP;
/*
 * cú pháp của oop : 
 * tên thuộc tính : kiểu private hoặc public + kiểu dữ liệu + tên biến 
 * Các Phương THức : - Để là public kiểu trả về tên phương thưc 
 * - PT khởi tạo 
 * _ PT in 
	- PT khác 
	- tạo 1 class main để gọi nó ra : myDate my= new myDate(..,..,..) ;
 */
public class myDate {
	
	private int day ; 
	private int month ; 
	private int year ; 
	
	
	public myDate(int d, int m , int y) {
		this.day=y ; 
		this.month=m ; 
		this.year=y ; 
	}
	
	public void printDay() {
		System.out.println("Day :"+this.day) ;
	}
	public void printMonth() {
		System.out.println("Day :"+this.month) ;
	}
	public void printYear() {
		System.out.println("Day :"+this.year) ;
	}
	public void printMyDate() {
		System.out.println("Ngay :"+this.day+" Thang :"+this.month+" Nam :"+this.year) ;;
	}
	
}
