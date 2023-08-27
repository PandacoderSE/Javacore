package java_bai44b;

public class animal {
	protected String Name ;

	public animal(String name) {
		this.Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	} 
	public  void eat() {
		System.out.println(" an an ");
	}
	
}
