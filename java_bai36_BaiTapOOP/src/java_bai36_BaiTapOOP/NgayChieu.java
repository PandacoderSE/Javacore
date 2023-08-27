package java_bai36_BaiTapOOP;

public class NgayChieu {
	private int Ngay ; 
	private int Thang ; 
	private int Nam ;
	
	public NgayChieu(int ngay, int thang, int nam) {
		Ngay = ngay;
		Thang = thang;
		Nam = nam;
	}

	public int getNgay() {
		return this.Ngay;
	}

	public void setNgay(int ngay) {
		this.Ngay = ngay;
	}

	public int getThang() {
		return this.Thang;
	}

	public void setThang(int thang) {
		this.Thang = thang;
	}

	public int getNam() {
		return this.Nam;
	}

	public void setNam(int nam) {
		this.Nam = nam;
	} 
}
