import java.util.Scanner;
import java.util.concurrent.ExecutionException;

class InvalidRegistrationNumberException extends Exception {
    public InvalidRegistrationNumberException(String str) {
        super(str);
    }
}

class MarkNotSupportedException extends Exception {
    public MarkNotSupportedException(String str) {
        super(str);
    }
}

class Student_a1{
    String reg_no;
    int marks[];
    public void check_reg_no() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the registration number of the student");
        reg_no = sc.next();
        //try {
            if(!(reg_no.charAt(0) >= 48 && reg_no.charAt(0) <= 57) ){
                throw new InvalidRegistrationNumberException("Invalid format of reg no.");
            }else{
                System.out.println("Registration number accepted");
            }
//        }catch (InvalidRegistrationNumberException e){
//            System.out.println(e.getMessage());
//        }
    }
    public void get_marks() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of course registered by the student");
        int n = sc.nextInt();
        marks = new int[n];
        //try{
            for(int i=0;i<n;i++){
                System.out.println("Enter the marks for course number "+(i+1));
                float input = sc.nextFloat();
                if( input - (int)(input) > 0.0 ){
                    throw new MarkNotSupportedException("Marks should only be in positive integers");
                }else{
                    marks[i] = (int)input;
                }
            }
//        }catch (MarkNotSupportedException e){
//            System.out.println(e.getMessage());
//        }
    }
    public void average() {
        int sum = 0;
        for(int i=0;i<marks.length;i++){
            sum += marks[i];
        }
        float avg = sum / marks.length;
        System.out.println("Average marks are :"+avg);
    }
}


public class A1_Q1 {
    public static void main(String[] args)  throws Exception{
      Student_a1 st = new Student_a1();
      st.check_reg_no();
      st.get_marks();
      st.average();
    }
}
