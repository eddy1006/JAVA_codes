
import java.util.*;

interface example {
    public void add(int a,int b,int c);
}

abstract class Abs {
    int a;
    int  b;
    public void multiply(int a,int b){};
}


public class StaticKeyword implements example{
    int a;
    int b;
    static int c = 10;
    StaticKeyword (int x,int y,int z){
        a = x;
        b = y;
        c = z;
    }

    static {
        System.out.println("I run first");
        c = 20;
    }

    @Override
    public void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        System.out.println(c);
        StaticKeyword st = new StaticKeyword(2,4,6);
        System.out.println(c);
        System.out.println(st.c);
        StaticKeyword kt = new StaticKeyword(2,7,5);
        System.out.println(c);
        System.out.println(st.c);
        System.out.println(kt.c);
        st.add(st.a,st.b,c);

    }

    static {
        System.out.println("I run second");
        c = 30;
    }
}
