package ch22;

import java.util.ArrayList;

public class Student {

    private static int studentNum=1001;

    int studentID;
    String studentName;

    ArrayList<Subject> subjectList;

    public Student(String studentName) {
        this.studentID = studentNum++;
        this.studentName = studentName;

        subjectList=new ArrayList<>();
//        subjectList=new ArrayList<Subject>();
    }

    public void addSubject(String name,int score){
        Subject subject=new Subject();

        subject.setName(name);
        subject.setScorePoint(score);
        subjectList.add(subject);
    }

    public void showStudentInfo(){
        int total=0;
        for(Subject s:subjectList){
            total+=s.getScorePoint();
            System.out.println(studentID+"학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + s.getScorePoint() + "입니다.");
        }

        System.out.println(studentID+"학생 "+studentName+"의 총점은 "+total+"입니다.");
    }
}
