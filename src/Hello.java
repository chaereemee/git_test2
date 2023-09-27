
public class Hello {

	String message = "æ»≥Á«œººø‰";
	
	public Hello() {
		this("æ»≥Á«œººø‰");
	}
	
	public Hello(String message) {
		this.message = message;
	}

	public void say() {
		System.out.println(message);
	}

}
