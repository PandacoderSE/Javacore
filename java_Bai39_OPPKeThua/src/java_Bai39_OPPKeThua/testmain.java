package java_Bai39_OPPKeThua;

// Thuc hien ke thua  lop con : Hoc sinh , Lop cha : Con Nguoi : Tukhoa : extends
public class testmain {
	public static void main(String[] args) {
		ConNguoi x = new ConNguoi("Nguyen Van Manh", 2003);
		x.an();
		x.uong();

		HocSinh y = new HocSinh("Nguyen Van Manh", 2003, "KTPM", "Haui");
		y.an();
		y.uong();
		y.LamBaiTap();
	}
}
// phim copy : ctrl + alt + phim mui ten 