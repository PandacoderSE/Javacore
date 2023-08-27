package java_bai46_interface;

public class PhanMemaytinh_nhieuinterface implements MaytinhbotuiInterface, Sapxepinterface {


	@Override
	public double cong(double a, double b) {
		
		return a+b;
	}

	@Override
	public double tru(double a, double b) {
		
		return a-b;
	}

	@Override
	public double nhan(double a, double b) {
		
		return a*b;
	}

	@Override
	public double chia(double a, double b) {
		
		return (double)a/b;
	}
	@Override
	public void sapxeptang(double[] a) {
		int n = a.length;
		int i, j, min_idx;
		for (i = 0; i < n - 1; i++) {
			min_idx = i;
			for (j = i + 1; j < n; j++)
				if (a[j] < a[min_idx])
					min_idx = j;
			double temp = a[min_idx];
			a[min_idx] = a[i];
			a[i] = temp;
		}
		
	}

	@Override
	public void sapxepgiam(double[] a) {
		int n = a.length;
		int i, j, min_idx;
		for (i = 0; i < n - 1; i++) {
			min_idx = i;
			for (j = i + 1; j < n; j++)
				if (a[j] > a[min_idx])
					min_idx = j;
			double temp = a[min_idx];
			a[min_idx] = a[i];
			a[i] = temp;
		}
		
	}
}
