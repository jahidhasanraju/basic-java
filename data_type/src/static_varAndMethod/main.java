package static_varAndMethod;

import javax.print.Doc;

public class main {
    public static void main(String[] args) {
       /* Person person1 = new Person();
        person1.method1();
        person1.methode2();
        Person person2 = new Person();
        person2.method1();
        person2.methode2();
        Doctor doctor1 = new Doctor();
        doctor1.method1();*/
        /*Static_variable static_variable1 = new Static_variable();
        static_variable1.x=20;
        System.out.println(static_variable1.x);
        Static_variable static_variable2 = new Static_variable();
        static_variable2.x=30;
        System.out.println(static_variable2.x);
        System.out.println(Static_variable.x);*/
//        Person.method1();
//        Doctor.method1();
        Person person = new Doctor();
        person.method1();
        //don't create a static method when it works with instance variable..
        //because it's make effect when it in several thread
    }
}
