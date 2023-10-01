package Main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * Mot nguoi choi co tai khoan . Nguoi choi cos quyen dat cuoc so tien it 
 * hon hoac bang so tien họ có . 
 * Luật Chơi : 
 * có 3 viên xúc sắc . Mỗi viên có giá trị 6 mặt  (1,6) .
 * Mỗi lần lắc sẽ ra 1 kết quả : Kết quả bẳng = GT XS1+ SX2 +XS3 
 * 3 Trường hợp xảy ra : 
 * 1) Nếu Tổng =3 hoặc 18 . Cái Ăn hết nguời chơi thua 
 * 2) Nếu tổng 3 viên =(4->10) : Xỉu => nếu người chơi đặt xỉu thì thắng , ngược lại thua 
 * 3) Nếu tổng 3 viên =(11-17) : Tại => người chơi đặt tài thì thắng ngược lại thua  
 * -- sử dụng class random => tạo giá trị 
 * 
 * -- Test Font con số 
 * -- Lơp numberformat
 */
public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi=5000000 ; 
		Scanner sc = new Scanner(System.in) ; 
		//---------- Cách Làm dùng numberformat
		Locale lc = new Locale("vi","VN") ; 
		NumberFormat numf = NumberFormat.getInstance(lc) ; // chọn theo loại hay sử dụng 
		//NumberFormat numf = NumberFormat.getCurrencyInstance(lc) ; 
		//------- để sử dụng hàm thì numf.format(số cần dùng)
		int luaChon ; 
		//Lựa Chon Bắt đâu trò chơi 
		do {
			System.out.println("-------------------Moi Ban Lua Chon-------------");
			System.out.println("Chon (1) Tiep tuc choi .");
			System.out.println("Chon(Phim bat ky) Thoat");
			luaChon=sc.nextInt() ; 
			if(luaChon==1) {
				System.out.println("-- Bat Dau Choi --");
				System.out.println("-- So Tien TaiKhoan :"+numf.format(taiKhoanNguoiChoi));
				double cuoc=0 ; 
				//Lựa Chọn Số Tiền cược 
				do {
					System.out.println(" Ban Muon Cuoc Bao nhieu tien :");
					 cuoc=sc.nextDouble() ; 
				}while(cuoc<=0 || cuoc>taiKhoanNguoiChoi) ;
				//Lựa chọn Đăt cược 
				int luaChonTaiXiu=0 ; 
				do {
					System.out.println(" Lua Chon : 1(Tai) - 2(xiu)");
					luaChonTaiXiu=sc.nextInt() ; 
				}while(luaChonTaiXiu!=1 && luaChonTaiXiu!=2) ; 
				if(luaChonTaiXiu==1) {
					System.out.println("Ban Da Chon Tai !");
				}else {
					System.out.println("Ban Da Chon Xiu !");
				}
				//Tung Xúc Sắc -> class RanDom 
				Random xucxac1= new Random() ; 
				Random xucxac2= new Random() ; 
				Random xucxac3= new Random() ; 
				
				 int GT1 =xucxac1.nextInt(5)+1 ;
				 int GT2 =xucxac2.nextInt(5)+1 ; 
				 int GT3 =xucxac3.nextInt(5)+1 ;
				 int tong=GT1+GT2+GT3 ; 
				 
				 //Tính toán kq : 
				 System.out.println("---- Ket Qua : "+GT1+"+"+GT2+"+"+GT3);
				 if(tong==3 || tong==18) {
					 System.out.println(" Tong la : "+tong+" =>Ban Thua cuoc, Nha cai an ");
					 taiKhoanNguoiChoi-=cuoc ; 
					 System.out.println(" Tai Khoan Ban con :"+numf.format(taiKhoanNguoiChoi));
				 }else if(tong>=4 && tong<=10) {
					 if(luaChonTaiXiu==1) {
						 taiKhoanNguoiChoi+=cuoc ; 
						 System.out.println("Tong :"+tong+" => Ban Da Thang, Tai Khoan Ban La:"+numf.format(taiKhoanNguoiChoi));
					 }else {
						 taiKhoanNguoiChoi-=cuoc ;
						 System.out.println("Tong :"+tong+" => Ban Da Thua, Tai Khoan Ban La:"+numf.format(taiKhoanNguoiChoi));
					 }
					 
				 }else {
					 if(luaChonTaiXiu==2) {
						 taiKhoanNguoiChoi+=cuoc ; 
						 System.out.println("Tong :"+tong+" => Ban Da Thang, Tai Khoan Ban La:"+numf.format(taiKhoanNguoiChoi));
					 }else {
						 taiKhoanNguoiChoi-=cuoc ;
						 System.out.println("Tong :"+tong+" => Ban Da Thua, Tai Khoan Ban La:"+numf.format(taiKhoanNguoiChoi));
					 }
				 }
			}
		}while(luaChon==1) ; 
		System.out.println("Ban Da Thoat game !!");
	}
}
