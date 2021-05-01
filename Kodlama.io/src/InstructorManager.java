import java.util.Scanner;

public class InstructorManager extends UserManager {

	public void addCourse(Instructor instructor) {
		Scanner course = new Scanner(System.in);
		System.out.println("Yeni kursunuzu giriniz");
		instructor.course = course.nextLine();
		System.out.println("Hocam yeni kursunuz : " + instructor.course);
	}

	public void addCourseCategory(Instructor instructor) {
		Scanner courseCategory = new Scanner(System.in);
		System.out.println("Yeni kurs/kursunuzun kategorisini giriniz");
		instructor.courseCategory = courseCategory.nextLine();
		System.out.println("Hocam yeni kurs/kursunuzun kategorisi : " + instructor.courseCategory);
	}
}
