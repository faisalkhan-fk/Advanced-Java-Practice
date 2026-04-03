//Use of distinct(), limit(), skip(), count() in stream API

package advancejava_sec_B;
import java.util.List;
public class streamapi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=List.of(10,20,30,45,56,10,6,34,30);
		List<Integer> l2=l1.stream().distinct().toList();
		List<Integer> l3=l1.stream().distinct().skip(3).toList();
		List<Integer> l4=l1.stream().distinct().skip(1).limit(4).toList();
		long c2=l1.stream().distinct().skip(1).limit(4).count();


		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		long c=l1.stream().count();
		System.out.println(c);
		System.out.println(c2);

		//l1.stream().distinct().forEach(System.out::println);
		//l1.stream().distinct().forEach(System.out::println);

		}

}

