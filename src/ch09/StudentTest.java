package ch09;

public class StudentTest {

    public static void main(String[] args){

        Student studentKim=new Student(3,"Kim");
        studentKim.setKoreaSubject("국어",100);
        studentKim.setMathSubject("수학",95);

        studentKim.shoeScoreInfo();

    }

}
