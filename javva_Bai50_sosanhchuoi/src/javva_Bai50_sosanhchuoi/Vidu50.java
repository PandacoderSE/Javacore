package javva_Bai50_sosanhchuoi;

public class Vidu50 {
	public static void main(String[] args) {
		//so sanh chuoi 
		String s="Titv.vn" ; 
		String S="titv.VN" ; 
		String a="Titv.vn" ; 
		//ham equals => so sanhs 2 chuoois (phan biet hoa va thuong 
		System.out.println("so sanh s va S : "+ s.equals(S));
		System.out.println("so sanh s va a : "+ s.equals(a));

		//Ham equalsiInoreCase (so sanh ko phan biet hoa thuong)
		System.out.println("so sanh s va S : "+ s.equalsIgnoreCase(S));
		
		//Ham compareTo => so sanh > < =, Vd sap xep ten sinh vien
		// Ham nay tao 3 gia tri : âm(đúng , dương(ngược lại và sai), số 0(==) 
		String sv1 = "nguyen van A" ;
		String sv2 ="nguyen van B" ; 
		String sv3="nguyen van a" ;
		System.out.println(" sv1 compareTo sv2:"+sv1.compareTo(sv2));
		
		//compareToignoreCase => giống compareTo nhưng ko phân biệt chữ hoa chữ thường 
		System.out.println(" sv3 vs sv1 :"+ sv3.compareToIgnoreCase(sv1));
		
		//Hàm  regionMatches => so sánh 1 đoạn trong chuoi
		//VD so sanh Bien so xe , xem chung tỉnh ko 
		String c1="Titv.vn" ; 
		String c2="tv.v" ; 
		boolean check =c1.regionMatches(2, c2, 0, 4);
		System.out.println(" check c1 va c2 :" +check);
		//VD : so sánh SDt 
		String s1="0925334267" ;
		String s2="0925447390" ; 
		boolean check1=s1.regionMatches(1, s2, 1, 3) ; 
		System.out.println(" s1 vs s2 :"+check1);
		//Hàm starWith => hàm kiểm tra cguooix bắt đầu , kiểm tra xem số s1 có bắt đầu là 0925 ko
		System.out.println(s1.startsWith("0925"));
		// VD để biết ngành nào , thì đầu mã ngàng vd IT6002
		
		//Hàm endWitmh =>> kiểm tra chuỗi kết thúc bằng : giống starWith
		//VD : đê xem có cùng tên file ko : work (.docx)
		String File1="anh.docx" ;
		String File2="manh.jpg" ; 
		if(File1.endsWith(".docx")) {
			System.out.println("File1 là word");
		}else if(File2.endsWith(".jpg")){
			System.out.println("File2 là hinh anh");
		}
	}
}
