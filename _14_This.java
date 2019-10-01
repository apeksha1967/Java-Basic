package Two;

class Employee {
	private String name;
	private int age;
	
	void setName(String name) {
		this.name = name;
	}
	
	void say(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("I am jumping from "+height+" feets");
	}
	
	void disp() {
		setName(name);
		System.out.println("I am "+name);
	}
	
	public void move(String direction, double value) {
		System.out.println("Please move "+value+" metres in the "+direction+" direction.");
	}
}

public class _1_This {

	public static void main(String[] args) {
		
		Employee person2 = new Employee();
		person2.say("Hello");
		person2.jump(15);
		person2.move("South-west", 10.4);
		
		person2.setName("Riya");
		person2.disp();

	}

}
