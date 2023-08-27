package java_35_OOP_baiTap;

public class manDate {
	private int Ngay ; 
	private int Thang ; 
	private int Nam ;
	public manDate(int ngay, int thang, int nam) {
		Ngay = ngay;
		Thang = thang;
		Nam = nam;
	}
	public int getNgay() {
		return Ngay;
	}
	public void setNgay(int ngay) {
		this.Ngay = ngay;
	}
	public int getThang() {
		return Thang;
	}
	public void setThang(int thang) {
		this.Thang = thang;
	}
	public int getNam() {
		return Nam;
	}
	public void setNam(int nam) {
		this.Nam = nam;
	} 

}
