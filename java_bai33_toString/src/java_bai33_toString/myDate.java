package java_bai33_toString;
// Hieu ro phuong thuc toString
public class myDate {
	private int day ; 
	private int month ; 
	private int year ; 
	
	public myDate(int d, int m , int y) {
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

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day>=1 && day<=31)
			this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month>=1 && month<=12)
			this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year>=0)
			this.year = year;
	}
	
	// Ham to String ,  
	// Tác dụng đưa ra thông tin của đối tượng nhanh tróng khi chỉ cần gọi tên đối tượng mà ko kèm thuộc tính
	// có thể in 1 vài thuộc tính cũng đc VD , ngày , tháng 
	@Override
	public String toString() {
		return this.day+"/"+this.month+"/"+this.year ; 
	}
//hashcode : hàm Băm 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}
//equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		myDate other = (myDate) obj; // ép kiểu obj về  lớp mydate
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	
	
	// Phần 2 : Hiểu rõ phương thức so sánh equals và hascode 
	
}
