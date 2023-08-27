package java_bai46_interface;

public class Sapxepchen implements Sapxepinterface {

	@Override
	public void sapxeptang(double[] a) {
		int n=a.length; 
		for(int i=1 ; i<n ; i++) {
			double M=a[i] ; 
			int j=i-1 ; 
			while(j>-1 && a[j]>M ) {
				a[j+1]=a[j] ; 
				j=j-1 ; 
			}
			a[j+1]=M ; 
		}
		
	}

	@Override
	public void sapxepgiam(double[] a) {
		int n=a.length; 
		for(int i=1 ; i<n ; i++) {
			double M=a[i] ; 
			int j=i-1 ; 
			while(j>-1 && a[j]<M ) {
				a[j+1]=a[j] ; 
				j=j-1 ; 
			}
			a[j+1]=M ; 
		}
		
	}
	
}
