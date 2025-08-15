package GenericClass;

public class Main {
    public static void main(String[] args) {
        withoutGeneric withoutGeneric=new withoutGeneric();
        withoutGeneric.setValue(125);
        System.out.println(withoutGeneric.getValue());
        if((Integer)withoutGeneric.getValue()==125)
            System.err.println(true);
        else
            System.err.println(false);
        GenericClass genericClass=new GenericClass();
        genericClass.setValue("225@ABC");
        System.err.println(genericClass.getValue());
    }
}
