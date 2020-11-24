package Domain;

public class Score {


    private int score_id;
    private int student;
    private int course;
    private String pingshi_score;
    private String qimo_score;
    private String final_score;

    public Score(int score_id, int student, int course, String pingshi_score, String qimo_score, String final_score) {
        this.score_id = score_id;
        this.student = student;
        this.course = course;
        this.pingshi_score = pingshi_score;
        this.qimo_score = qimo_score;
        this.final_score = final_score;
    }


    public Score() {

    }

    public int getScore_id() {
        return score_id;
    }

    public void setScore_id(int score_id) {
        this.score_id = score_id;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getPingshi_score() {
        return pingshi_score;
    }

    public void setPingshi_score(String pingshi_score) {
        this.pingshi_score = pingshi_score;
    }

    public String getQimo_score() {
        return qimo_score;
    }

    public void setQimo_score(String qimo_score) {
        this.qimo_score = qimo_score;
    }

    public String getFinal_score() {
        return final_score;
    }

    public void setFinal_score(String final_score) {
        this.final_score = final_score;
    }


}
