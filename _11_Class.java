package One;

class Student{
	String name;
	int age;
}

public class _11_Class {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
		stu1.name = "Apeksha";
		stu1.age = 20;
		
		Student stu2 = new Student();
		stu2.name = "Divyata";
		
		System.out.println(stu1.name);
		System.out.println(stu2.name);
		System.out.println(stu2.age);

	}

}
