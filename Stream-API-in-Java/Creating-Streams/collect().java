// collect() in stream API

package advancejava_sec_B;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

class Student02{
	int id;
	String name;
	
	Student02(int id,String name){
		this.id=id;
		this.name=name;
	}
}

public class streamapi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student02> stud=Arrays.asList(
				new Student02(1,"xyz"),
				new Student02(2,"xyz1"),
				new Student02(3,"xyz2")
    );
		List<String> names=stud.stream().map(s->s.name).collect(Collectors.toList());
		System.out.println(names);
	}

}
