package com.company;

import java.io.*;
import java.text.FieldPosition;
import java.util.*;

class StudentInfo implements Serializable {
    String name;
    String id;
    String phone;
    String address;

    public StudentInfo(String name,String id,String phone,String address){
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.address = address;
    }
}

public class Serialize {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentInfo arr[] = new StudentInfo[5];
        for(int i=0;i<5;i++){
            String name;
            String id;
            String phone;
            String address;
            System.out.println("Enter name :");
            name = sc.next();
            System.out.println("Enter id :");
            id = sc.next();
            System.out.println("Enter phone :");
            phone = sc.next();
            System.out.println("Enter address :");
            address = sc.next();
            StudentInfo st = new StudentInfo(name,id,phone,address);
            arr[i] = st;
        }
        try {
            FileOutputStream fs = new FileOutputStream("StudentInfo.txt");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            for(int i=0;i<5;i++) {
                os.writeObject(arr[i]);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        StudentInfo array[] = new StudentInfo[5];
        try{
            FileInputStream fs = new FileInputStream("StudentInfo.txt");
            ObjectInputStream oi = new ObjectInputStream(fs);
            for(int i=0;i<5;i++) {
                StudentInfo obj = (StudentInfo) oi.readObject();
                System.out.println(obj.name);
                System.out.println(obj.address);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
