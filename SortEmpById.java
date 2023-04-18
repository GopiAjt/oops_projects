package customeSort;

import java.util.ArrayList;
import java.util.Collections;
public class SortEmpById 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(100);
		Employee e2 = new Employee(300);
		Employee e3 = new Employee(200);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Collections.sort(list, new EmpSort());
		for(Employee e: list)
		{
			System.out.println(e);
		}
	}
}
//Default Sorting -> Comparable -> public int compareTo(Elements e);

//custom Sorting -> Comparator -> public int compare(Element e1, Element e2);
//1. Create a new class which implements Comparator interface.
//2. import comparator and specify generics.
//3. Override compare()
//4. invoke sort() of Collections class by passing list & Sorting logic object.