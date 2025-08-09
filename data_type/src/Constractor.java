public class Constractor {

    int x;
    private Constractor(int x){
        System.err.println("inside constractor");
        this.x = x;

    }
    static Constractor getConstractor(){
        return new Constractor(10);
    }
}
