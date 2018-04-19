import java.util.*;


public class example141 implements Comparable{

	public static void test(String[] args){		
//		ArrayList<String> list = new ArrayList<String>(); 
//		list.add("a");
//		list.add("b");
//		list.add("c");		
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()){
//			String str = (String)it.next();
//			System.out.println(str);
//		}		
//		int i = (int)(Math.random()*(list.size()));
//		String str = list.get(i);
//		System.out.println(i + str);
//
//		System.out.println(list.contains("a"));
//		System.out.println(list.containsAll(list));
//		System.out.println(list.hashCode());
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//		list.add("d");
//		System.out.println(list.size());
//		list.add("");
//		try{
//		list.set(4,"e");
//		}
//		catch(Exception ex){
//			System.out.println(ex.toString());
//			System.out.println(ex.getMessage());
//		}
//		finally{
//			System.out.println("finallyFunction");
//		}
		
		
		TreeSet<example141> set = new TreeSet<example141>();
		set.add(new example141("a",1));
		set.add(new example141("b",2));		
		set.add(new example141("c",3));
		set.add(new example141("d",4));
		set.add(new example141("e",5));
		Iterator<example141> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		TreeSet<example141> headset = (TreeSet<example141>)set.headSet(new example141("b",2));
		Iterator<example141> it2 = headset.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		example141 exp = (example141)o;
		int result = id > exp.id ? 1 : (id == exp.id ? 0 : -1);
		return result;
	}
	
	public example141(String name, long id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "example141 [id=" + id + ", name=" + name + "]";
	}

	String name;
	long id;

}
