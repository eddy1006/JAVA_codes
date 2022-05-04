package com.company;


import java.util.*;

class InvalidRegistrationNumber extends Exception {
    InvalidRegistrationNumber(String str){
        super(str);
    }
}

class Student {
    String s_name;
    int id;
    int class_id;
    static ArrayList<Student> studentList  = new ArrayList<Student>();

    public void addStudent(String name,int id,int class_id) throws IllegalArgumentException {
        Student s = new Student();
        s.s_name = name;
        s.class_id = class_id;
        s.id = id;
        studentList.add(s);
    }

    public void removeStudent(int id){
        boolean flag = true;
        for(Student s : studentList){
            if(s.id == id){
                flag = false;
                break;
            }
        }
        try{
            if(flag){
                throw new InvalidRegistrationNumber("This student id does not exist");
            }else{
                System.out.println("Student found");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}


public class RemoveException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student obj = new Student();
        for(int i=0;i<5;i++){
            String name;
            int id;
            int class_id;
            System.out.println("Enter name:");
            name = sc.next();
            System.out.println("Ener id");
            id = sc.nextInt();
            System.out.println("Enter your class id");
            class_id = sc.nextInt();
            obj.addStudent(name,id,class_id);
        }
        obj.removeStudent(4);
    }

}
