public class stringVariable {
    String s1="hello";
    String s2="hello";
    String s3=new String("hello");
    public void check(){
        s1=s1+"world";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        s3=s3+"world";
        System.out.println(s3==s1);
    }
}
