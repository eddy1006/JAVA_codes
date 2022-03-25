package com.company;
import sorting.*;
import java.util.Scanner;

abstract class Parent{
    int age;
    abstract void wealth();
}

class Child extends Parent{
    void wealth(){
        System.out.println("NAHI HAI PAISE");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String[] arr1 = new String[5];
        System.out.println("Enter the string array");
        for(int i=0;i<5;i++){
            arr1[i] = sc.next();
        }
        System.out.println("Enter the number array");
        int[] arr2 = new int[5];
        for(int i=0;i<5;i++){
            arr2[i] = sc.nextInt();
        }
        Sorting st = new Sorting();
        st.sortNumbers(arr2);
        st.sortStrings(arr1);
        System.out.println("After Sorting");
        for(int num : arr2)
            System.out.println(num);
        for(String s : arr1)
            System.out.println(s);
    }
}
