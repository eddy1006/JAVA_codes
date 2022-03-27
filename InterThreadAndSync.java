class Bank {
    int amount = 10000;
    synchronized void withdraw(){
        System.out.println("Going to withdraw....");
        if(this.amount <= amount){
            System.out.println("Insufficient balance");
            try{
                wait();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        this.amount -= amount;
        System.out.println("Successfully withdraw");
    }
    synchronized void deposit(int n){
        System.out.println("Going to deposit....");
        this.amount += n;
        try{
            notify();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Deposited successfully");
    }
}



public class InterThreadAndSync {
    public static void main(String[] args) {
        Bank user = new Bank();
        user.amount =5000;
        new Thread(){
            public void run(){
                user.withdraw();
            }
        }.start();
        new Thread(){
            public void run(){
                user.deposit(10000);
            }
        }.start();
    }
}
