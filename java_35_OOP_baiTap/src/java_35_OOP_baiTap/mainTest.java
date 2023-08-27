package java_35_OOP_baiTap;

public class mainTest {
	// test class , luôn tạo hàm set và get cho mỗi class để truy cập dữ liệu 
	public static void main(String[] args) {
		//class manDate
		manDate Day1 = new manDate(5,5,2015) ; 
		manDate Day2 = new manDate(15,5,2010) ; 
		//class man 
		man Manh1= new man("Nguyen Van Manh",Day1) ; 
		man Manh2= new man("Manh Me Code",Day2) ; 
		//class bookOfman 
		bookOFman Sach1= new bookOFman("CTDL&GT",2005, Manh1) ; 
		bookOFman Sach2= new bookOFman("Kinh Di ",2005, Manh2) ; 
		System.out.println("Thong Tin Sach 1 :");
		Sach1.inManHinh();
		
		//thuc hien so sanh 
		System.out.println("Thuc hien so sanh quyen 1 vs quyen 2 :" + Sach1.kiemTracungNam(Sach2));
		
}
}
