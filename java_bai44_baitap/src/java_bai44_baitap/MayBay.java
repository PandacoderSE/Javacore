package java_bai44_baitap;

public class MayBay extends PhuongTienDiChuyen {
	private String LoaiNhienLieu ;

	public MayBay(String loaiPhuongTien, HangSanXuat hSX, String loaiNhienLieu) {
		super(loaiPhuongTien, hSX);
		LoaiNhienLieu = loaiNhienLieu;
	}
	@Override
	public double layvantoc() {
		return 500 ; 
	}
	public void HaCanh() {
		System.out.println(" Ha Canh >>>");
	}
	
	
}
