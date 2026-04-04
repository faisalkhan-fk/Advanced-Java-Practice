//forEach() method in stream API in java

package advancejava_sec_B;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.*;
import java.util.*;

public class streamapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.array
   int arr[]= {3,4,7,89,43,60};
   IntStream s=Arrays.stream(arr);
   s.forEach(x->System.out.println(x));

   //2.values
   Stream<Integer> s2=Stream.of(2,6,45,34);
    s2.forEach(x->System.out.println(x));
    
    //3.collections
    //List<Integer> list=new ArrayList<>();
    List<Integer> l3=new ArrayList<>();
    l3.add(45);
    l3.add(89);
    l3.add(43);
    l3.add(70);
    
    //Stream<Integer> s3=l3.stream();
    List<Integer> l4=l3.stream().filter(x->x%2==0).map(x->x*x).collect(Collectors.toList());
    System.out.println(l4);
    }
}

