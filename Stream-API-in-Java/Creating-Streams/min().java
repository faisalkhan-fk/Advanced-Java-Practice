//min() stream me se minimum (sabse chhota element) return karta hai

import java.util.*;
import java.util.stream.*;
public class Test {
    public static void main(String[] args) {
        List<Integer> l = List.of(10, 25, 5, 40, 15);

        int min = l.stream()
                   .min((a,b) -> a - b)
                   .get();

        System.out.println(min);
    }
}
