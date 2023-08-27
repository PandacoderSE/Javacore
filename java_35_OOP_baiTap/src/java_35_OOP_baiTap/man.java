package java_35_OOP_baiTap;

public class man {
	private String tenTacGia ; 
	private manDate ngaySinh ;
	public man(String tenTacGia, manDate ngaySinh) {
	
		this.tenTacGia = tenTacGia;
		this.ngaySinh = ngaySinh;
	}
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public manDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(manDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	} 
	
	
}
