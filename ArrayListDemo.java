import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		String[] allCodes= {"011","022","033","044","055","066","077"};
		String[] assignedCodes= {"022","033"};
		
		String[] unAssignedCodes=getUnAssignedCodes(allCodes,assignedCodes);
		System.out.println(Arrays.toString(unAssignedCodes));
		

	}
	
	static String[] getUnAssignedCodes(String[] allCodes,String[] assignedCodes)
	{
		List<String> list1=new ArrayList<String>(Arrays.asList(allCodes));
		List<String> list2=new ArrayList<String>(Arrays.asList(assignedCodes));
		
		list1.removeAll(list2);
		return list1.toArray(new String[list1.size()]);
	}

}
