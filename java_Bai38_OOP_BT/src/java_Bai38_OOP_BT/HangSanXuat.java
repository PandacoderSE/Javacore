package java_Bai38_OOP_BT;

public class HangSanXuat {
	private String tenHang ; 
	private QuocGia quocGia ;
	public String getTenHang() {
		return tenHang;
	}
	
	public HangSanXuat(String tenHang, QuocGia quocGia) {
		
		this.tenHang = tenHang;
		this.quocGia = quocGia;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public QuocGia getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	} 
	
	
}
