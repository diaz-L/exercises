import java.util.ArrayList;

public class Exercise46
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		list1.add(4);
		list1.add(3);

		list2.add(5);
		list2.add(10);
		list2.add(7);
		list2.add(4);
		list2.add(3);	

		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);

		var combineList = combine(list1, list2);
		var combineUniqueList = combineUnique(list1, list2);

		System.out.println();	//empty line
		System.out.println("combine: " + combineList);
		System.out.println("combine unique: " + combineUniqueList);
	}

	public static ArrayList<Integer> combine(ArrayList<Integer> list1, ArrayList<Integer> list2)
	{
		ArrayList<Integer> copy = new ArrayList<>(list1);
		copy.addAll(list2);
		return copy;
	}

	public static ArrayList<Integer> combineUnique(ArrayList<Integer> list1, ArrayList<Integer> list2)
	{
		ArrayList<Integer> copy = new ArrayList<>(list1);
	
		for(var n : list2)
		if(!copy.contains(n))
			copy.add(n);	

		return copy;
	}
}
