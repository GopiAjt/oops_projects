package customeSort;
import java.util.Comparator;
class EmpSort implements Comparator<Employee> 
{
	@Override
	public int compare(Employee x, Employee y)
	{
		return x.id - y.id;
	}
}
//x -> Object to be Inserted and y -> Already Existing Object