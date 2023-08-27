package java_Bai44_abstract;

public class HinhTron extends Hinh {
	private double r ; 

	public HinhTron(Toado toado, double r) {
		super(toado);
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double dientich() {
		return Math.PI *this.r*this.r;
	}
 
}
