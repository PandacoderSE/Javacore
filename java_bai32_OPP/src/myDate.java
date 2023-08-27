/*
 *  phương thức get , set 
 */
public class myDate {
	private int day ; 
	private int month ; 
	private int year ;
	//ham khoi tao consuctor
	public myDate(int d, int m, int y) {
		if(d>=1 && d<31) {
			this.day = d;
		}else {
			this.day = 0 ; 
		}
		if(m>=1 && m<=12) {
			this.month = m;
		}else 
			this.month = 0 ; 
		if(year>=0) {
			this.year = y;
		}else {
			this.year =0  ; 
		}
	}
	//Công dụng Set, get , thay đổi thông số của thuộc tính lớp
	// cách viết hàm set:nhập vào màn hình(gắn dữ liệu  mưới) :  và get : Xuất ra màn hình 
	// getDay , setDay 
	public int getDay() {
		return this.day ; 
	}
	public void setDay(int d) {
		if(d>=1 && d<=31) {
			this.day=d ; 
		}
	}
	//getmonth , setMonth
	
	public int getMonth() {
		return this.month ; 
	}
	public void setMonth( int m ) {
		if(m>=1 && m<=12) {
			this.month=m ; 
		}
	}
	
	//getyear, setyear 
	public int getYear() {
		return year;
	}
	public void setYear(int y) {
		if(y>=0) {
			this.year = y;
		}
	}
	
	
}
