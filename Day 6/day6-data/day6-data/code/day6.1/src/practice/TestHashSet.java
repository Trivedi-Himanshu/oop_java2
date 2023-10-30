package practice;
import java.util.HashSet;
import com.app.core.Employee;
public class TestHashSet {
	public static void main(String[] args) {
		HashSet<Employee> emps = new HashSet<>();
		
		Employee e1 = new Employee("md-101", "Himanshu", 200000);
		Employee e2 = new Employee("md-101", "Himanshu", 200000);
		Employee e3 = new Employee("md-101", "Himanshu", 200000);
		
		System.out.println(emps.add(e1));
		System.out.println(emps.add(e2));
		System.out.println(emps.add(e3));
		
		
	}
}

/*
*	public boolean equals(Object o){
*		if(o instanceOf Employee)
*			return email.equals(o.email);  // calling equals() of the string since the email is a String type
*		return false;
*	}
*
*	public int hashCode(){
*		return this.email.hashCode();      // callling hashCode() of String which is already overridden
*	}
*/
