package cn.com.xiafen;

public class Hello {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void say(){
		System.out.println(this.getMessage());
	}
}
