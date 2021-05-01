
public class Instructor extends User {

	String course, courseCategory;

	public Instructor(String course, String courseCategory) {
		super();
		this.course = course;
		this.courseCategory = courseCategory;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCourseCategory() {
		return courseCategory;
	}

	public void setCourseCategory(String courseCategory) {
		this.courseCategory = courseCategory;
	}


}
