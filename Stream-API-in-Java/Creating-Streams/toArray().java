//toArray() method in stream API use in Java

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Faisal", "Rahul");

        Object[] arr = names.stream().toArray();

        for (Object name : arr) {
            System.out.println(name);
        }
    }
}
