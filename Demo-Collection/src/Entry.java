import java.util.Collection;
import java.util.List;

import com.cg.util.*;


public class Entry {
	public static void main(String[] args) {

		LinkedList list1 = new LinkedList();
		Collection c;
		List l;
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);

		list1.display();

		LinkedList list2 = new LinkedList();

		list2.add(4);
		list2.add(20);
		list2.add(32);
		list2.add(40);

		list2.display();
	}
}
