package java_Bai40;

public class animal {
	protected String name ;

	public animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	public void eat() {
		System.out.println("An Thoi ");
	}
	
}
