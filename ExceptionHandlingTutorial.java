import java.io.IOException;

class UserDefinedException extends Exception {
    public UserDefinedException(String str){
        super(str);
    }
    public UserDefinedException(int str){
        super(String.valueOf(str));
    }
}

class ExceptionPropogation{
    public void p(){
        int m = 100/0;  //throws exception but no catch block found so will go to the next stack method
        System.out.println("Will never run");
    }
    public void q(){
        try{
            p();
        }catch (Exception e){
            System.out.println("Exception caught in q");
        }
        System.out.println("This will run in q");
        //p();   //Here also not found so again next
    }
    public void r(){
        try{
            q();
            System.out.println("This will run in r");
        }catch (Exception e){
            System.out.println("Exception caught in r");
        }
    }
}

class ThrowsKeyword {
    public void a() throws IOException {  // throws keyword only used with methods that can throw a checked exception
        throw new IOException("Some device error");
    }
    public void b(){  // Handling exception
        try {
            a();
        }catch (Exception e){
            System.out.println("Exception caught and handled "+e);
        }
    }
    public void c() throws IOException {
        a(); //not handling the exception instead Declaring an exception
    }
}

class Parent {
    public void func(){
        System.out.println("No exception throwing");
    }
    public void f() throws IOException {
        System.out.println("Throwing exception so child can throw same or subclass or nothing");
    }
}

class Child extends Parent {
//    public void func () throws IOException {   //overriding func  checked exception so it wont work
//        throw new IOException("This method will give error if you comment out");
//    }
    public void func () throws ArithmeticException {
        System.out.println("Inside child func");
    }
    public void f() throws IOException {
        System.out.println("Inside child f function");
    }
}

public class ExceptionHandlingTutorial {

    public static void validate(int n){
        try{
            if(n < 18){
                throw new ArithmeticException("BALAK ILLEGAL");  //unchecked exception needs catch always
            }else{
                System.out.println("Can vote");
            }
        }catch(ArithmeticException e){
            System.out.println("Printing a custom exception" + e);
        }
    }
    public static void main(String[] args) throws IOException {
//        try{
//            int a = 100/0;}
////        }catch (Exception e){
////            System.out.println(e);
////        }
//       catch (ArithmeticException e){
//            System.out.println(e);
//        }finally {
//            System.out.println("Finally this will run no matter what");
//        }
//        try{
//            int a = 100/0;
//        }finally {
//            System.out.println("Finally this will run no matter what");
//        }

//        try {
//            int a = 100/0;
//        }finally {
//            System.out.println("inside final block");
//        }
//        System.out.println("This will not run");  //exception not handled if then java automatically handles it but also terminates the program

//        try {
//            int a = 100/0;
//        }catch (Exception e){
//            System.out.println("Inside catch block and the exception is : "+e);
//        }finally {
//            System.out.println("inside final block");
//        }
//        System.out.println("This will work now");   //exception handled if then execution will continue

        try{
            //int a = 100/0;
//            String s = new String("aditya");
//            int b = Integer.parseInt(s);
//            int [] arr = new int[5];
//            System.out.println(arr[5]);
//            String s = null;
//            System.out.println(s.length());
            int arr[] = new int[5];
            //arr[5] = 30/0;  //arithmetic first
            System.out.println(arr[10]); //out of bound first
            System.out.println("This will not execute");
        }catch (NullPointerException e){
            System.out.println("Null pointer" + e);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bound "+e);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception" + e);
        }catch (Exception e){   //Parent exception class containing catch must be at last otherwise compile error
            System.out.println("Exception class" + e);
        }finally {
            System.out.println("multiple try-catch");
        }
        try{
            System.out.println("First try block");
//            String s = null;
//            System.out.println(s.length());  //If this happens inner try won't get execute ever
            try{
                System.out.println("Second try block");
                int a = 10/0;
            }catch (ArithmeticException e){
                System.out.println("Inner catch block "+e);
            }
            String s = null;
            System.out.println(s.length());
            System.out.println("Back to first try block");
        }catch (NullPointerException e){
            System.out.println("Outer catch :"+e);
        }finally {
            System.out.println("out of nested try catch");
        }
        validate(13);
        System.out.println("wont execute without try - catch");
        try{
            throw new UserDefinedException("This is a user defined exception");  // content for getmessage
            //throw new UserDefinedException(3);
        }catch (UserDefinedException ude){
            System.out.println(ude.getMessage());
        }
        ExceptionPropogation obj = new ExceptionPropogation();
        obj.r();
        ThrowsKeyword obj1 = new ThrowsKeyword();
        obj1.b();
        //obj1.c();  //to use this add throws to main
        System.out.println("This will also run");  //Now this wont run if c is called
        Child c = new Child();
        c.f();
    }
}
