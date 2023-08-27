package java_bai42_overrding_ghide;

public class dog extends animal {
	public dog() {
		super(" Dog ") ; 
	}

	@Override
	public void eat() {
		System.out.println(" Toi an Xuong ");
	}

	@Override
	public void makesound() {
		System.out.println(" Gâu Gâu ");
	}
	
}
