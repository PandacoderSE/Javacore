package java_35_OOP_baiTap;

public class bookOFman {
	private String tenSach ; 
	private int namXBan ; 
	private man tacGia ;
	public bookOFman(String tenSach, int namXBan, man tacGia) {
		
		this.tenSach = tenSach;
		this.namXBan = namXBan;
		this.tacGia = tacGia;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public int getNamXBan() {
		return namXBan;
	}
	public void setNamXBan(int namXBan) {
		this.namXBan = namXBan;
	}
	public man getTacGia() {
		return tacGia;
	}
	public void setTacGia(man tacGia) {
		this.tacGia = tacGia;
	} 
	public void inManHinh() {
		System.out.println("Sach :"+ this.tenSach+" , Nam SX :"+this.namXBan+",Tac Gia :"+ tacGia.getTenTacGia()
																+" , NSN :" +tacGia.getNgaySinh().getNgay());
	}
	public boolean kiemTracungNam(bookOFman x ) {
		return this.namXBan==x.namXBan ; 
	}
	public float giaSauKhiGiam(float x) {
		return 1 ; 
	}
}
