package ViDu;

public class test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(150,"Ngyen Manh","A1",9.5f) ;
		SinhVien sv2 = new SinhVien(123,"Mai Anh","A1",8) ;
		
		System.out.println(" so sanh sv1 dung trc sv2 ko :"+ sv1.compareTo(sv2));
	}
	
	
}
