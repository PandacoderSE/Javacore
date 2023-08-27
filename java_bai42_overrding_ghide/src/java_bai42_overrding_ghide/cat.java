package java_bai42_overrding_ghide;

public class cat extends animal{
	public cat() {
		super(" Cat ") ; 
	}
	@Override
	public void eat() {
		System.out.println(" Toi an Ca ");
	}
	@Override
	public void makesound() {
		System.out.println(" Toi Keu meow meow");
	}
}
