//sorted(Comparator)-> (descending, logic-based sorting)
import java.util.*;
import java.util.stream.*;
public class Test {
    public static void main(String[] args) {
        List<Integer> l = List.of(5,2,8,1,3);

        List<Integer> desc = l.stream()
                              .sorted((a,b) -> b - a)
                              .toList();

        System.out.println(desc);
    }
}
