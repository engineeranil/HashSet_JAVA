import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(30);
        //hSet.isEmpty();
        System.out.println(hSet.contains(29));
       System.out.println(hSet.size());
       /* for(Integer i:hSet){
            System.out.println(i);
        }*/

        Iterator<Integer> ıtr = hSet.iterator();
        while (ıtr.hasNext()){
            System.out.println(ıtr.next());
        }

    }

}
