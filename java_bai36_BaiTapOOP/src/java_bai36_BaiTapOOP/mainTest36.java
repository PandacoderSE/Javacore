package java_bai36_BaiTapOOP;

public class mainTest36 {
	public static void main(String[] args) {
		NgayChieu day1= new NgayChieu(5,6,2025) ; 
		NgayChieu day2= new NgayChieu(15,6,2020) ;
		
		HangSanXuat HSX1= new HangSanXuat("MaVel","EngLand") ; 
		HangSanXuat HSX2= new HangSanXuat("ToDay","VietNam") ; 

		BoPhim	BP1= new BoPhim("im BatMan",2022, HSX1,4000, day1) ; 
		BoPhim	BP2= new BoPhim("im Sprider Man",2020, HSX2,5000, day2) ; 
		System.out.println("Phim 1 :"+ BP1.getTenPhim());
		System.out.println(" a) kiem tra gia ve (BP1==BP2)ve phim :"+ BP1.kiemTraGiaVe(BP2));
		System.out.print(" b) Ten Hang BP1 :");
		BP1.inTenHangSanXuat() ; 
		System.out.println(" c) Gia cua BP1 khi giam 10% :"+ BP1.giamGiaVe(10));

	}
}
