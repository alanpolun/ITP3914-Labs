package Lab10;

class AStudent {
	private String name;
	public int age;

	public void setName(String inName) {
		name = inName;
	}

	public String getName() {
		return name;
	}
}

public class Ex3 {
	public static void main(String s[]) {
		AStudent stud1 = new AStudent();
		AStudent stud2 = new AStudent();
		stud1.setName("Chan Tai Man");
		stud1.age = 19;
		stud2.setName("Ng Hing");
		stud2.age = -23;
		System.out.println("Student: name="+stud1.getName() + 
							", age=" + stud1.age);
		System.out.println("Student: name="+stud2.getName() + 
							", age=" + stud2.age);
	}
}
