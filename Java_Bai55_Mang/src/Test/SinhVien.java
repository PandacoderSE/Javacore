package Test;
//kế thừa interface comparable 
public class SinhVien implements Comparable<SinhVien>{
	private int maSinhVien ; 
	private String hoTen ; 
	private String tenLop ; 
	private float diemTB ;
	
	public SinhVien(int maSinhVien, String hoTen, String tenLop, float diemTB) {
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.tenLop = tenLop;
		this.diemTB = diemTB;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	// ham cat ten 
	public String catTen() {
		// Nguyen Van Manh 
		//xoa khoang Trắng dư thừa hai đầu = trim()
		String s=this.hoTen.trim() ;
		if(s.indexOf(" ")>=0) {
			int vt =s.lastIndexOf(" ") ;
			return s.substring(vt +1) ; 
		}else {
			return s ; 
		}
	}
	@Override
	public int compareTo(SinhVien o) {
		
		// Quy tắc xắp sếp dùng comperato
		//<0 this nhở hơn 
		//=0 
		//>0 this lớn hơn cái truyền vô 
		//		return this.maSinhVien-o.maSinhVien;

		//dua tren so sanh ten 
		String tenthis=this.catTen(); 
		String teno=o.catTen() ; 
		 return tenthis.compareTo(teno);
		
	} 
	
	
	
}
