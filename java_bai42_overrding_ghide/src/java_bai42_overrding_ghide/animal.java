package java_bai42_overrding_ghide;
// Ghi de : overrding 
// vi các thành phần kế thừa khác nhau nên có kiểu ăn khác nhau , 
// vậy nên mk phải ghi đè , sửa lại phương thức đã kế thừa
// 3 quy tắc : có tính kế thừa , phương thức lớp con giông sphuwowng thức lớp cha và tam số cũng phải giống , 
public class animal {
	protected String name ;

	public animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	public void eat() {
		System.out.println(" Tôi Dang ĂN .. ");
	}
	public void makesound() {
		System.out.println("Toi tao am thanh");
	}
	public void sleep() {
		System.out.println(" Toi ngu zz");
	}
	
	
}
