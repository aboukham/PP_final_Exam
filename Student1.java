package PP_final_Exam;

public class Student1 {
    private String name;
    private int id;
    private Course1[] courses;

    public Student1(String name, int id, Course1[] courses) {
        this.name = name;
        this.id = id;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Course1[] getCourses() {
        return courses;
    }

    public void setCourses(Course1[] courses) {
        this.courses = courses;
    }
}




