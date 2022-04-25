import java.util.*;
import java.io.*;
class Ipl{
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> won = new HashMap<String,Integer>();
        try{
            FileInputStream s = new FileInputStream("test.txt");
            DataInputStream fs = new DataInputStream(s);
            int c;
            while((c = fs.read()) != -1){
                byte b[] = new byte[15];
                fs.read(b);
                char ch1 = (char)(byte)(c);
                char ch2 = (char)b[0];
                char ch3 = (char)b[1];
                char nm[] = {ch1,ch2,ch3};
                String name = new String(nm);
//                System.out.println(name);
                int n1 = (char)b[6] - 48;
                int n2 = (char)b[7] - 48;
                int n = n1*10 + n2;
                if(won.get(name) == null){
                    won.put(name,n);
                }else{
                    int curr = won.get(name);
                    won.put(name,curr+n);
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        Thread t1 = new Thread() {
            public void run(){
                //System.out.println("Hi from thread 1");
                String minWonTeam = "";
                int minWon = -1;
                for(Map.Entry<String,Integer> m : won.entrySet()){
                    if(minWon == -1){
                        minWon = m.getValue();
                        minWonTeam = m.getKey();
                    }else{
                        if(m.getValue() < minWon){
                            minWon = m.getValue();
                            minWonTeam = m.getKey();
                        }
                    }
                }
                System.out.println(minWonTeam+" "+minWon);
            }
        };
        t1.start();

        Thread t2 = new Thread() {
            public void run() {
//                System.out.println("YO from thread 2");
                ArrayList<String> points = new ArrayList<String>();
                for(Map.Entry<String,Integer> m : won.entrySet()){
                    if(m.getValue()*2 == 46){
                        points.add(m.getKey());
                    }
                }
                System.out.println(points);
            }
        };
        t2.start();
    }
}

