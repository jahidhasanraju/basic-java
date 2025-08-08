package static_varAndMethod;

public class ClassB {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassA b = new ClassA();
        a.setMembers();
        b.setMembers();
        ClassA.setMembers2();
        System.out.println(a.value());
    }
}
