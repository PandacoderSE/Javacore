package java_Bai38_OOP_BT;

public class NgaySanXuat {
	private int Ngay ; 
	private int Thang ; 
	private int Nam ;
	
	public NgaySanXuat(int ngay, int thang, int nam) {
		
		Ngay = ngay;
		Thang = thang;
		Nam = nam;
	}
	public int getNgay() {
		return Ngay;
	}
	public void setNgay(int ngay) {
		Ngay = ngay;
	}
	public int getThang() {
		return Thang;
	}
	public void setThang(int thang) {
		Thang = thang;
	}
	public int getNam() {
		return Nam;
	}
	public void setNam(int nam) {
		Nam = nam;
	} 
	
	
}
