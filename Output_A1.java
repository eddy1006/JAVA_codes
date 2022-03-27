public class Output_A1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread :"+t);
        try{
            for(int k=0;k<100;k++){
                System.out.println(--k);
                if(k == 1)
                    t.interrupt();
                Thread.sleep(1000);
                k+=3;
                if(k==5)
                    t.interrupt();
            }
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted "+ e);
        }
        System.out.println("End of main thread");
    }
}
