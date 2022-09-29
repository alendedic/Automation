package homework2;

public class Student {
    private String name;
    private   int age;
    private int semesterNo;
    private double gps;

    public Student(String name, int age, int semesterNo, double gps) {
        this.name = name;
        this.age = age;
        this.semesterNo = semesterNo;
        this.gps = gps;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSemesterNo() {
        return semesterNo;
    }

    public void setSemesterNo(int semesterNo) {
        this.semesterNo = semesterNo;
    }

    public double getGps() {
        return gps;
    }

    public void setGps(double gps) {
        this.gps = gps;
    }
    public Student() {}
}
