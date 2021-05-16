package javaCampD3Hw2;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student(1, "Emine", "Özbek");
		Student student2 = new Student(2, "Fatih", "Karaç");
		Instructor instructor1 = new Instructor(10, "Engin", "Demiroğ");

		
		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.add(instructor1);
		userManager.delete(student2);
		

	}

}
