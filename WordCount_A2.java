import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class WordCount_A2 {
    public static HashMap<String,Integer> count(FileReader fr){
        HashMap<String,Integer> frequency = new HashMap<String, Integer>();
        try{
            int ch;String s = "";

            while((ch =fr.read()) != -1){
                if((char)ch == ' ' && s!= "."){
                    if(frequency.get(s) == null){
                        frequency.put(s,1);
                    }else{
                        int freq = frequency.get(s);
                        frequency.put(s,freq++);
                    }
                    s = "";
                }else{
                    s = s + (char)ch;
                }
            }
        }catch (IOException e){
            System.out.println(e);
        }
        return frequency;
    }
    public static void main(String[] args) {
        try {
            FileReader fr1 = new FileReader("file1.txt");
            FileReader fr2 = new FileReader("file2.txt");
            HashMap<String,Integer> frequency2 = count(fr2);
            HashMap<String,Integer> frequency1 = count(fr1);
            System.out.print("File name ");
            for(String s : frequency1.keySet()){
                System.out.print(s+" ");
            }
            System.out.print("\nfile1.txt ");
            for(int n : frequency1.values()){
                System.out.print(n+" ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
