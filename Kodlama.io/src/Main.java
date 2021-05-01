
public class Main {

	public static void main(String[] args) {
	
		Instructor instructor = new Instructor("JavaKamp","Programlama");
		instructor.id =1;
		instructor.email = "hoca@hoca.com";
		instructor.password = "12345";
		instructor.firstName = "Fikret";
		instructor.lastName = "Idrisov";
		
		Student student = new Student("C# Kamp", "Gun3 Odev2");
		student.id = 1 ;
		student.email = "ogrenci@ogrenci.com";
		student.password = "54321";
		student.firstName = "Idris";
		student.lastName = "Fikretov";
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.signIn(instructor);
		System.out.println("-------------");
		instructorManager.addCourse(instructor);
		System.out.println("-------------");
		instructorManager.addCourseCategory(instructor);
		
		System.out.println();
		
		StudentManager studentManager = new StudentManager();
		studentManager.signIn(student);
		System.out.println("-------------");
		studentManager.homeworkChecked();
		
		System.out.println();
		
		studentManager.emailChange(student);
		studentManager.passwordChange(student);

		
	}

}
