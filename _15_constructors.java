package Two;

class Machine{
	private String name;
	int code;
	
	public Machine() {
		System.out.println("First constructor running");
	}
	
	public Machine(String name) {
		System.out.println("Second constructor running");
		this.name=name;
		System.out.println("I am "+name);
	}
	
	public Machine(String name, int code) {
		this(name);
		System.out.println("Third constructor running");
		this.code=code;
		System.out.println("I am "+name);
		System.out.println("code is: "+code);
	}
}

public class _2_constructors {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Ani");
		Machine machine3 = new Machine("Jess",5748);

	}

}
