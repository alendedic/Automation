package homework2;

public class StudentTest extends Student {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Alen", 1, 2, 3);
        students[1] = new Student("Robert", 2, 3, 4);
        students[2] = new Student("Sonja", 3, 4, 6);
        System.out.println(students[0].getName() + " " + students[0].getAge() + " " + students[0].getSemesterNo() + " " + students[0].getGps());
        System.out.println(students[1].getName() + " " + students[1].getAge() + " " + students[1].getSemesterNo() + " " + students[1].getGps());
        System.out.println(students[2].getName() + " " + students[2].getAge() + " " + students[2].getSemesterNo() + " " + students[2].getGps());
        double gpsAverage = (((students[0].getGps()) + students[1].getGps() + students[2].getGps()) / 2);
        System.out.println("The average value is " + gpsAverage);
    }
}
