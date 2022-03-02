package com.company;

import java.util.Scanner;

class MyException extends Exception{
    int e;
    MyException(int a) {
        e=a;
    }
    public String toString(){
        if(e == 1){
            return ("Exception in alphabetic series");
        }else if(e == 2){
            return ("Exception in fourth Character");
        }else{
            return ("Exception in fifth Character");
        }
    }
}


public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pan;
        String firstName;
        String lastName;
        System.out.print("Pan Number : ");
        pan = sc.next();
        System.out.print("Person Name(First name, last name/surname): ");
        firstName = sc.next();
        lastName = sc.next();
        try{
            for(int i=0;i<3;i++){
                if(!Character.isUpperCase(pan.charAt(i))){
                    throw new MyException(1);
                }
            }
            char[] validChars = {'A', 'B', 'C', 'F', 'G', 'H', 'I', 'J', 'L' ,'P'};
            boolean isValid = false;
            for(char character : validChars){
                if(character == pan.charAt(3))
                    isValid = true;
            }
            if(!isValid){
                throw new MyException(2);
            }
            if(!(pan.charAt(4) == firstName.charAt(0) || pan.charAt(4) == lastName.charAt(0))){
                throw new MyException(3);
            }else{
                System.out.println("This might be valid PAN number");
                if(pan.charAt(4) == lastName.charAt(0)) {
                    System.out.println("It belongs to individual");
                }
                else {
                    System.out.println("It belongs to non-individual");
                }
            }
        }catch (MyException e){
            System.out.println(e);
        }
    }
}
