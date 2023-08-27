package java_bai36_BaiTapOOP;

public class BoPhim {
	private String tenPhim ; 
	private int namSanXuat ; 
	private HangSanXuat HSX ; 
	private float giaVe ; 
	private NgayChieu ngayChieu ;
	public BoPhim(String tenPhim, int namSanXuat, HangSanXuat hSX, float giaVe, NgayChieu ngayChieu) {
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		HSX = hSX;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public HangSanXuat getHSX() {
		return HSX;
	}
	public void setHSX(HangSanXuat hSX) {
		HSX = hSX;
	}
	public float getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(float giaVe) {
		this.giaVe = giaVe;
	}
	public NgayChieu getNgayChieu() {
		return ngayChieu;
	}
	public void setNgayChieu(NgayChieu ngayChieu) {
		this.ngayChieu = ngayChieu;
	} 
	
	public boolean kiemTraGiaVe(BoPhim x) {
		return this.giaVe==x.giaVe ; 
	}
	
	public void inTenHangSanXuat() {
		System.out.println("Ten Hang San Xuat Bo Phim Nay :"+ this.HSX.getTenHang());
	}
	// hàm trả về cùng đc dạng string inTenHangSanXuat
	public float giamGiaVe(float x) {
		return (this.giaVe - (x/100)*this.giaVe) ; 
	}
	
	
}
