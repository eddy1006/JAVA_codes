import java.util.*;
class Student_debug implements Runnable {
    String name;
    Thread t;
    Student_debug(String sname){
        name = sname;
        t = new Thread(this,name);
        System.out.println("New Thread "+ t);
    }
    public void run (){
        int i = 0;
        while(true){
            System.out.println(name+":"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Interrupted" + name);
                System.out.println("Exiting" + name);
            }
            i++;
        }
    }
}


public class Debug_A1 {
    public static void main(String[] args)  {
        Student_debug s1 = new Student_debug("one");
        Student_debug s2 = new Student_debug("two");
        Student_debug s3 = new Student_debug("three");
        s1.t.start();
        s2.t.start();
        s3.t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Main thread interrupted");
            System.out.println("Main thread exiting");
        }
    }
}
