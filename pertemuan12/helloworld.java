package paradigma;
import java.util.*;

interface Lambda {
    int lambda (int x, int y);
}

public class helloworld {
    public static void main(String[] args) {
        //List<Integer> L;

        Lambda L;

        // L = new ArrayList<>();
        // L.add(1); L.add(2); L.add(3);
        /* 
        for (Integer i : L) {
            System.out.println(i);
        } */
        //L.forEach(i -> System.out.println(i));

        L = (x, y) -> x + y;
        System.out.println(L.lambda(10, 20));
        L = (x, y) -> {return x*y;};
        System.out.println(L.lambda(10, 20));
        L = (x, y) -> x - y;
        System.out.println(L.lambda(10, 20));
        L = (a,b) -> {System.out.println("Hello World"); return 0;};
        L.lambda(0, 0); // Lambda tanpa parameter
    }
}
