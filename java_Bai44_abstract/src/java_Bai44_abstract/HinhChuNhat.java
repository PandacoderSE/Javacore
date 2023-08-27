package java_Bai44_abstract;

public class HinhChuNhat extends Hinh {
	private double chieurong ; 
	private double chieucao ;
	
	public HinhChuNhat(Toado toado, double chieurong, double chieucao) {
		super(toado);
		this.chieurong = chieurong;
		this.chieucao = chieucao;
	}

	public double getChieurong() {
		return chieurong;
	}

	public void setChieurong(double chieurong) {
		this.chieurong = chieurong;
	}

	public double getChieucao() {
		return chieucao;
	}

	public void setChieucao(double chieucao) {
		this.chieucao = chieucao;
	} 
	@Override
	public double dientich() {
		return this.chieucao*this.chieurong ; 
	}
	
	
	
}
