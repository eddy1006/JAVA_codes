class Numbers {
    void even(int n){
        for (int i=0;i<=100;i++){
            System.out.println("Inside even");
        }
    }
    void odd(int n){
        for (int i=0;i<=100;i++){
            System.out.println("Inside odd");
        }
    }
    void armstrong(int n){
        for (int i=0;i<=100;i++){
            System.out.println("Inside armstrong");
        }
    }
}


public class InLab3 implements Runnable {
    int n =10;
    Numbers obj = new Numbers();
    @Override
    public void run() {
        if(Thread.currentThread().getName() == "even")
            obj.even(n);
        else if(Thread.currentThread().getName() == "odd")
            obj.odd(n);
        else
            obj.armstrong(n);
    }

    public static void main(String[] args) {
        InLab3 run1 = new InLab3();
        InLab3 run2 = new InLab3();
        InLab3 run3 = new InLab3();
        Thread t1 = new Thread(run1,"even");
        Thread t2 = new Thread(run2,"odd");
        Thread t3 = new Thread(run3,"armstrong");
        t1.start();
        t2.start();
        t3.start();
    }
}
