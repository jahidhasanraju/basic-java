package static_varAndMethod;

public class ClassA {
    int y=20;// this variable associate with the object
    static int x=20; // this variable associate with the class
                     // static variable must be in only one for every object
    public void setMembers(){
        System.err.println("setMembers");
    }
    public static void setMembers2(){
        System.err.println("setMembers2");
    }
    public int value(){
        x=10;
        return x;
    }
}
