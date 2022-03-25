
class Thread1 extends Thread {  //Multithreading by extending the thread class
    @Override
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("Thread 1 Running");
            i++;
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("Thread 2 Running");
            i++;
        }
    }
}

class RunnableThread1 implements Runnable{  //Multithreading by implementing the Runnable interface
    @Override
    public void run() {
        int i = 0;
        while(i<200){
            System.out.println("Inside Runnable 1");
            i++;
        }
    }
}

class RunnableThread2 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(i<200){
            System.out.println("Inside Runnable 2");
            i++;
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
//        Thread1 t1 = new Thread1();
//        Thread2 t2 = new Thread2();
//        t1.start();  //starting the thread with .start() method
//        t2.start();   //Output will be random
        RunnableThread1 run1 = new RunnableThread1();
        Thread th1 = new Thread(run1);
        RunnableThread2 run2 = new RunnableThread2();
        Thread th2 = new Thread(run2);
        th1.start();
        th2.start();
    }
}
