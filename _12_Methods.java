package One;

class Students {
	String name;
	int age;
	
	void speak() {
		System.out.println("I am "+name+" and I am "+age+" years old.");
	}
	
	void sayHello() {
		for(int i=0;i<2;i++) {
			System.out.println("Hello!!");
		}
	}
}

//Method parameters

class Persons {
	
	void say(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("I am jumping from "+height+" feets");
	}
	
	public void move(String direction, double value) {
		System.out.println("Please move "+value+" metres in the "+direction+" direction.");
	}
}

public class _12_Methods {

	public static void main(String[] args) {
		
		Students stu1 = new Students();
		stu1.name = "Apeksha";
		stu1.age = 20;
		stu1.speak();
		stu1.sayHello();
		
		System.out.println(stu1.name);
		
		Students stu2 = new Students();
		stu2.name = "Divyata";
		stu2.sayHello();
		
		System.out.println(stu2.name);
		System.out.println(stu2.age);
		
		System.out.println("################");
		
		Persons person2 = new Persons();
		person2.say("Hello");
		person2.jump(15);
		person2.move("South-west", 10.4);
		
		String data = "Hi, I am "+stu1.name;
		person2.say(data);
		

	}

}
