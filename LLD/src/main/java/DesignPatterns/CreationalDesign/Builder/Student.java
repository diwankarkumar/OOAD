package DesignPatterns.CreationalDesign.Builder;

import java.util.List;

public class Student {

    int rollNumber ;
    int age ;
    String name ;
    String fatherName ;
    String motherName ;
    List<String> subjects ;

    Student(StudentBuilder builder){
         this.rollNumber = builder.rollNumber ;
         this.age = builder.age ;
         this.name = builder.name ;
         this.fatherName = builder.fatherName ;
         this.motherName = builder.motherName ;
         this.subjects = builder.subjects ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjects=" + subjects.get(0) + " , "
                 +subjects.get(1) + " , " +subjects.get(2)+
                '}';
    }
}
