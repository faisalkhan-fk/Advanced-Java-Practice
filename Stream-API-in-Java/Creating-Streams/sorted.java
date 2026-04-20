//sorted() -> sorted list in ascending order
import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> l = List.of(5,2,8,1,3);

        List<Integer> sortedList = l.stream().sorted().toList();

        System.out.println(sortedList);
    }
}
