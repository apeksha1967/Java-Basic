package One;

class Person{
	String name;
	int age;
	
	//getter
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
	
	int yearsLeft() {
		int years = 60 - age;
		return years;
	}
}

public class _13_Getters_Return {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Apeksha";
		person1.age = 20;
		
		int years = person1.yearsLeft();
		String name = person1.getName();
		int age = person1.getAge();
		
		System.out.println("Hello, I am "+name);
		System.out.println("My age: "+age);
		System.out.println("Years till retirement: "+years);

	}

}
