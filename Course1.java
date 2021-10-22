package PP_final_Exam;

public class Course1 {
    private String  cId;
    private String  cName;

    public Course1(String cId, String cName) {
        this.cId = cId;
        this.cName = cName;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }
}
