package java_bai44b;

public class tesst {
	public static void main(String[] args) {
		dog d = new dog() ; 
		cat c= new cat() ; 
		fly f=new fly() ; 
		System.out.println(d.Name);
		d.bark();
		d.eat();
		System.out.println(c.Name);
		c.eat();
		c.meow();
		System.out.println(f.Name);
		f.eat();
		f.bay();
		
	}
}
