import java.util.*;

public class exercise228 {

	/**
	 * @param args
	 */
	public static void test(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
		//Integer a[] = {1,2,3,4,5};
		//list1.addAll(Arrays.asList(a));
		//Collections.addAll(list1,1,1,1,1,1);
		List<Integer> list2 = new ArrayList<Integer>();
		ListIterator<Integer> listIt = list1.listIterator(list1.size());
//		while (listIt.hasNext()){
//			listIt.next();
//		}
		while(listIt.hasPrevious()){
			list2.add(listIt.previous());
		}
		Iterator<Integer> it = list2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());}
	}

}
