import java.util.*;

public class StringClass {
    public static void main(String[] args) {
        String s = new String("Aditya");
        StringBuilder sb = new StringBuilder("Aditya");
        StringBuffer sbf = new StringBuffer("Aditya");
        sb.insert(1,"m");
        sbf.append(" Gupta");
        System.out.println(sb);
        System.out.println(sbf);
        System.out.println(s.substring(1,6));
        for(int i=0;i<s.length();i++)
            System.out.println(s.charAt(i));
        char c[] = {'a','d','i','t','y','a'};
        String st = new String(c);
        System.out.println(st);
//        for(String arg : args)
//            System.out.println(arg);
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String arg  : args){
            if(map.get(arg) == null)
                map.put(arg,1);
            else{
                int n = map.get(arg) + 1;
                map.put(arg,n);
            }
        }
        for( Map.Entry m : map.entrySet())
            System.out.println(m.getKey()+" : "+m.getValue());
    }
}
