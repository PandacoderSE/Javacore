package java_bai44_baitap;

public class tesstmain {
	public static void main(String[] args) {
		HangSanXuat H1= new HangSanXuat("samsung","korean") ; 
		HangSanXuat H2= new HangSanXuat("dagob","china") ; 
		HangSanXuat H3= new HangSanXuat("mecxadet","vietnam") ; 
		
		PhuongTienDiChuyen loai1 = new MayBay("maybay", H3,"xang dau") ; 
		PhuongTienDiChuyen loai2 = new oto(" oto", H2," dau diazen") ; 
		PhuongTienDiChuyen loai3 = new xedap("xedap", H3) ;
		//muon su dung ca phuong thuc rieng thif lam nhu ben duoi 
		MayBay b1 =new MayBay("maybay", H3,"xang dau") ;
		System.out.println(" Hang cua maybay va toc do :"+ b1.layTenHangSanXuat() + loai1.layvantoc() +".... :");
		b1.HaCanh();
	}
}
