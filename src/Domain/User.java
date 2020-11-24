package Domain;

public class User {

    private int user_id;
    private String school_num;
    private String name;
    private String sex;
    private String grade;
    private String school;
    private String major;
    private String class_;
    private String qq;
    private String phone;
    private String email;
    private String password;
    private String adress;
    private int role;

    public User(int user_id, String school_num, String name, String sex, String grade, String school, String major, String class_, String qq, String phone, String email, String password, String adress, int role) {
        this.user_id = user_id;
        this.school_num = school_num;
        this.name = name;
        this.sex = sex;
        this.grade = grade;
        this.school = school;
        this.major = major;
        this.class_ = class_;
        this.qq = qq;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.adress = adress;
        this.role = role;
    }

    public User() {

    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getSchool_num() {
        return school_num;
    }

    public void setSchool_num(String school_num) {
        this.school_num = school_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }



}
