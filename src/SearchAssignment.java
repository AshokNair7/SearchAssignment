import java.util.ArrayList;
import java.util.List;

/**
 * Main class
 */
public class SearchAssignment {
	
	public static boolean search(List<Integer> list, int searchFor) {
		return list.contains(searchFor);
	}
	
    /**
    * Main method
    * @param args 
    */
    public static void main(String[] args) {    	
		System.out.println("Hello world");
		List<Integer> test = new ArrayList();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		System.out.println(search(test, 3));
    }
}
