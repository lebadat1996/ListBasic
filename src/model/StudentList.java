package model;

import java.util.ArrayList;

public class StudentList {
    ArrayList<Student> listStudent=new ArrayList();
    public void inputList(){
        Student student=new Student(1,"dat");
        listStudent.add(student);
        Student student1=new Student(2,"qui");
        listStudent.add(student1);
    }
    public void Display(){

    }
}
