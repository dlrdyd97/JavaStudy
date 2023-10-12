package ch04;

public class StudentTest {

    public static void main(String[] args){

        Student studentLee=new Student();
        studentLee.studentId=166;
        studentLee.setStudentName("김익환");
        studentLee.address="경기도 안양시";

        studentLee.showStudentInfo();

        System.out.println(studentLee);

    }

}
