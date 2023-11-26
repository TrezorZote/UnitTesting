public class Calculator {
    public static int add(int a, int b){
        return a+b ;
    }

    public static int multiply(int a,int b){
        return a*b;

    }

    public static int modulo(int a,int b){
        return a%b;
    }

    public static char throwError()throws IllegalStateException{
        throw new IllegalStateException("error err");
    }
}
