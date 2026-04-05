//Write a Java program to filter employees whose salary is greater than 60,000 and return their names in uppercase using map().

package advancejava_sec_B;
import java.util.*;
import java.util.stream.Collectors;

class employees{
	int id;
	String name;
	int salary;
	
	employees(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
}
public class streamapiQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<employees> stud1=Arrays.asList(
				new employees(1,"Rahul",30000),
				new employees(2,"Manish",35000),
				new employees(3,"Faisal",70000)

				
				);
		List<String> names=stud1.stream().filter(s->s.salary>60000).map(s->s.name.toUpperCase()).collect(Collectors.toList());
		System.out.println(names);
	}

}
