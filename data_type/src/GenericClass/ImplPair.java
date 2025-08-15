package GenericClass;

import java.util.ArrayList;

public class ImplPair {
    public static void main(String[] args) {
        ArrayList<Pair> list = new ArrayList<>();
        Pair pair=new Pair(2,"raju");
        list.add(pair);
        Pair pair1=new Pair(3,"sagor");
        list.add(pair1);
        for(Pair x:list){
            System.err.println(x.getKey()+" "+x.getValue());

        }

    }
}
