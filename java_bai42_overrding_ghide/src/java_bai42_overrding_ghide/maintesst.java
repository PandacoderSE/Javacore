package java_bai42_overrding_ghide;

public class maintesst {
	public static void main(String[] args) {
		dog d= new dog() ; 
		cat c= new cat() ; 
		System.out.println("-- DV1 :"+ d.name);
		d.eat();
		d.makesound();
		d.sleep();
		System.out.println("-- DV2 :"+ c.name);
		c.eat();
		c.makesound();
		c.sleep();
	}
}
