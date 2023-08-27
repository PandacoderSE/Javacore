package java_bai46_interface;

public class thongtinbai {
/***
 * interface : có thể đa kế thừa , có tính trừu tượng hoàn toàn 
 * làm đc những việc mà kế thừa và abstract ko làm đc
 * trong interface : chỉ có phương thức trừu tượng và các hằng số , ko có biến số 
 * - Tất cả phương thức ở dạng public , hằng số ở dạng final 
 * - tương tự abstract : ko thể tạo thành đối tượng , chỉ tạo ra các dối tượng khác của lớp kế thừa 
 * - 1 lớp có thể triển khai một hoặc nhiều interface tại 1 thowif diểm , 1 interface có thể kế thừa từ 1 interface khác 
 * tương tự cách 1 lớp kế thừa lớp khavcs 
 * cú pháp khi lớp kế thừa interface
 * public class MaytinhCasioFX500 implements MaytinhbotuiInterface 
 */
	public void xinchao() {
		System.out.println(" hello bai 46");
	}
}
