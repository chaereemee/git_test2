
public class Hello {

	String message = "�ȳ��ϼ���";
	
	public Hello() {
		this("�ȳ��ϼ���");
	}
	
	public Hello(String message) {
		this.message = message;
	}

	public void say() {
		System.out.println(message);
	}

}
