import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Program {
    public static void main(String args[]){
        int[] students = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
        students[i] = sc.nextInt();
    }
        int sum=0;
        for(int i=0;i<5;i++){
            sum += students[i];
            if(students[i] >= 80 && students[i]<= 90 )
                System.out.println("Grade A");
            else if(students[i] >= 70 && students[i] < 80)
                System.out.println("Grade B");
            else if(students[i] >= 60 && students[i] < 70)
                System.out.println("Grade C");
            else if(students[i] >= 50 && students[i] < 60)
                System.out.println("Grade D");
            else
                System.out.println("Grade F");
        }
        double avg = sum/5.0;
        System.out.println("Class Average :" + avg);
    }
}
