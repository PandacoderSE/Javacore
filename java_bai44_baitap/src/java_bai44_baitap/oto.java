package java_bai44_baitap;

public class oto extends PhuongTienDiChuyen {
	private String LoaiNhienLieu ;


	public oto(String loaiPhuongTien, HangSanXuat hSX, String loaiNhienLieu) {
		super(loaiPhuongTien, hSX);
		LoaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return LoaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		LoaiNhienLieu = loaiNhienLieu;
	} 
	@Override
	public double layvantoc() {
		return 250 ; 
	}
	
}
