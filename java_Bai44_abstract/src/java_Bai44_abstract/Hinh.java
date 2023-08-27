package java_Bai44_abstract;
// cú pháp của lớp trìu tượng 
// Mục đichs của lớp trừu tượng , cho các lớp con kế thừa , và viết lại tính toán 
//sử dụng tạo ra các lớp con , và đối tượng con , 

public  abstract class Hinh {
	protected Toado toado ;

	public Hinh(Toado toado) {
		this.toado = toado;
	}

	public Toado getToado() {
		return toado;
	}

	public void setToado(Toado toado) {
		this.toado = toado;
	} 
	public abstract double dientich() ; 
	//cú pháp của phương thức trừu tượng 
}
