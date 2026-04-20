//max() stream me se maximum (sabse bada element) return karta hai

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> l = List.of(10, 25, 5, 40, 15);

        int max = l.stream()
                   .max((a,b) -> a - b)
                   .get();

        System.out.println(max);
    }
}
