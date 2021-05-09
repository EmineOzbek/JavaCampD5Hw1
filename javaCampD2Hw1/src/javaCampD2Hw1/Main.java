package javaCampD2Hw1;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course("C# + Angular Kursu", "Engin Demiroğ");
		Course course2 = new Course("Java + React Kursu", "Kerem Varış");
		Course course3 = new Course("Programlamaya Giriş Kursu", "Engin Demiroğ");

		Student student1 = new Student("123456", "Emine Özbek");
		Student student2 = new Student("789123", "Hakan Can");

		CourseManager courseManager = new CourseManager();

		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.addCourse(course3);
		courseManager.addStudent(student1);
		courseManager.deleteCourse(course2);
		courseManager.deleteStudent(student2);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.getInstructor(course2, course2);

		Course[] course = { course1, course2, course3 };
		System.out.println("---KURSLAR---");
		for (Course courses : course) {
			System.out.println(courses.courseName);
		}

	}

}
