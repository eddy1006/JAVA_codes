
interface lambda{
    void oneFunction();
}

interface lambdaWithArgs{
    String funcwithparam(String a,String b);
}

interface lambdaReturn {
    int add(int a,int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        lambda obj = ()->{
            System.out.println("Implementing one function ");
        };
        obj.oneFunction();
        lambdaWithArgs obj1 = (a,b)->{
            String ans = a+"/"+b;
            return ans;
        };
        System.out.println(obj1.funcwithparam("23","3"));
        lambdaReturn obj2 = (a,b)->{
          return a+b;
        };
        System.out.println(obj2.add(5,10));
    }
}
