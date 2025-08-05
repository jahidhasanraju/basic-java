public class promotion {
    public static void main(String[] args) {
        byte a=127;
        byte b=1;
        //byte c=a+b;(a+b) automatically promoted int;
        byte c=(byte)(a+b);//now i demotion integer to byte
        System.out.println(c);
    }
}
