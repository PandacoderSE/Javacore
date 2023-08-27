package java_bai31_OOP;

public class hoadonCF {
	private String tenLoaiCF ; 
	private double giaTien ; 
	private double khoiLuong ; 
	
	public hoadonCF(String a , double b , double c){
		this.tenLoaiCF=a ; 
		this.khoiLuong=c ; 
		this.giaTien=b ; 
	}
	public  double tongTien() {
		return this.giaTien*this.khoiLuong ; 
	}
	public boolean kiemTraKhoiLuong(double b) {
//		if(this.khoiLuong>b) {
//			return true ;
//		}else return false ;
		return this.khoiLuong>b ; 
	}
	public boolean kiemTraGiaTien() {
		/*
		 * tai su dung phuong thuc 
		 */
		return this.tongTien()>500 ;
	}
// Giam gia cho hoa don >500000d 
	public double  giamGia( double x) {
		if(this.kiemTraGiaTien()==true) {
			System.out.println("Giam Gia thanh cong : ");
			return (x/100) ;
		}else {
			System.out.println("so tien < 500 K : "+this.tongTien()+" => Khong duoc giam gia !!");
			return 0 ; 
		}
	}
	public double tienCuoi(double x ) {
		return this.tongTien()-(this.giamGia(x)*this.tongTien()) ; 
	}
}
