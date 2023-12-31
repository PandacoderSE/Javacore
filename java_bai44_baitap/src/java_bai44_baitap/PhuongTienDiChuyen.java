package java_bai44_baitap;

public abstract class PhuongTienDiChuyen {
	protected String LoaiPhuongTien ;
	protected HangSanXuat HSX ; 
	
	
	public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hSX) {
		super();
		LoaiPhuongTien = loaiPhuongTien;
		HSX = hSX;
	}

	public String getLoaiPhuongTien() {
		return LoaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		LoaiPhuongTien = loaiPhuongTien;
	}
	
	public String layTenHangSanXuat() {
		return this.HSX.getTenHangSanXuat() ; 
	}
	public void batdau() {
		System.out.println(" bat dau");
	}
	public void tangToc() {
		System.out.println(" tang toc ...");
	}
	public void dunglai() {
		System.out.println(" dung lai");
	}
	public abstract double layvantoc() ; 
}
