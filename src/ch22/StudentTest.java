package ch22;

public class StudentTest {

    public static void main(String[] args) {

        Student studentK = new Student( "Kim");
        studentK.addSubject("국어",100);
        studentK.addSubject("수학",50);

        Student studentH=new Student("Ham");

        studentH.addSubject("국어",95);
        studentH.addSubject("수학",100);
        studentH.addSubject("영어",80);

        studentK.showStudentInfo();
        System.out.println("============");
        studentH.showStudentInfo();

    }

}
