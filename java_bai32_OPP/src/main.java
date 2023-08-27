import java_bai32_OPP;

public class main {
	public static void main(String[] args) {
		myDate myd= new myDate(20,2,2033) ; 
		System.out.println("Day :"+ myd.getDay());
		
		myd.setDay(19);
		System.out.println("Day  sau khi doi :"+ myd.getDay());
		// xem month 
		System.out.println("Month :"+ myd.getMonth());
		myd.setMonth(13);
		System.out.println("Month sau khi thay doi :"+myd.getMonth());
	}
}
