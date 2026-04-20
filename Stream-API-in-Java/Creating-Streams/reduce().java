//reduce() function used in stream API

import java.util.*;
public class Test {
    public static void main(String[] args) {
        List<Integer> l = List.of(1,2,3,4,5);

        int sum = l.stream().reduce(0, (a,b) -> a + b);

        System.out.println(sum);
    }
}
