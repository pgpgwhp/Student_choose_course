package Domain;

public class cource {

    private int cource_id;
    private String cource_name;
    private String credit;
    private int teacher;
    private int classroom;
    private String schooltime;

    public cource(int cource_id, String cource_name, String credit, int teacher, int classroom, String schooltime) {
        this.cource_id = cource_id;
        this.cource_name = cource_name;
        this.credit = credit;
        this.teacher = teacher;
        this.classroom = classroom;
        this.schooltime = schooltime;
    }

    public cource() {

    }

    public int getCource_id() {
        return cource_id;
    }

    public void setCource_id(int cource_id) {
        this.cource_id = cource_id;
    }

    public String getCource_name() {
        return cource_name;
    }

    public void setCource_name(String cource_name) {
        this.cource_name = cource_name;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public int getTeacher() {
        return teacher;
    }

    public void setTeacher(int teacher) {
        this.teacher = teacher;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getSchooltime() {
        return schooltime;
    }

    public void setSchooltime(String schooltime) {
        this.schooltime = schooltime;
    }





}
