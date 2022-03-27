
class Test{
    static void method1(){
        try{
            method2();
        }catch (NullPointerException aoe){
            System.out.println("Exception caught in method1");
        }
    }
    static void method2(){
        try{
            int a[] = {0};
            a[40] = 50;
        }catch (Exception e){
            throw e;
        }
    }
}

public class ExceptionExperiment {
    public static void main(String[] args) {
        try{
            Test.method1();
        }catch (Exception e){
            System.out.println("Exception caught in main");
        }
    }
}
