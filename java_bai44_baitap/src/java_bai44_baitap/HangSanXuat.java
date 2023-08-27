package java_bai44_baitap;

public class HangSanXuat {
	private String tenHangSanXuat ; 
	private String tenQuocGia ;
	public String getTenHangSanXuat() {
		return tenHangSanXuat;
	}
	
	public HangSanXuat(String tenHangSanXuat, String tenQuocGia) {
		this.tenHangSanXuat = tenHangSanXuat;
		this.tenQuocGia = tenQuocGia;
	}

	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}
	public String getTenQuocGia() {
		return tenQuocGia;
	}
	public void setTenQuocGia(String tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	} 
	
	
}
