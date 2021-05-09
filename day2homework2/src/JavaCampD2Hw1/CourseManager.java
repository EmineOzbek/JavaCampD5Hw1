package JavaCampD2Hw1;

public class CourseManager {

	public void addCourse(Course course) {
		System.out.println(course.courseName + " eklendi.");
	}

	public void addStudent(Student student) {
		System.out.println(student.id + " numaralı " + student.name + " eklendi.");
	}

	public void deleteCourse(Course course) {
		System.out.println(course.courseName + " silindi.");
	}

	public void deleteStudent(Student student) {
		System.out.println(student.id + " numaralı " + student.name + " silindi.");
	}
}
