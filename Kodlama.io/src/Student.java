
public class Student extends User {

	String finishedCourse, homework;

	public Student(String finishedCourse, String homework) {
		super();
		this.finishedCourse = finishedCourse;
		this.homework = homework;
	}

	public String getFinishedCourse() {
		return finishedCourse;
	}

	public void setFinishedCourse(String finishedCourse) {
		this.finishedCourse = finishedCourse;
	}

	public String getHomework() {
		return homework;
	}

	public void setHomework(String homework) {
		this.homework = homework;
	}

}
