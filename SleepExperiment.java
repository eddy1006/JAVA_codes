
public class SleepExperiment {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread:"+Thread.currentThread().getName());
        try{
            for(int i=0;i<10;i++){
                System.out.println(i);
                System.out.println("Going into sleep");
                Thread.sleep(1000);
                System.out.println("Waking up from sleep");
                System.out.println("Value before operation "+i);
                i--;
                System.out.println("Value after operation"+i);
                if(i == 4){
                    System.out.println("Inside condition");
                    t.interrupt();  //After interrupting it waits till  next sleep statement and soon as it gets that the sleep gets interrupted
                }
                i++;
            }
        }catch (Exception e){
            System.out.println("Thread interrupted");
        }
        System.out.println("Outside loop");
    }

}
