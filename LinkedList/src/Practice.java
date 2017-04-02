import java.util.Iterator;
import java.util.LinkedList;

public class Practice {

	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>();
		placesToVisit.add("Dhaka");
		placesToVisit.add("Barishal");
		placesToVisit.add("Chittagong");
		placesToVisit.add("Sylhet");
		placesToVisit.add("Comilla");

		printList(placesToVisit);

	}

	private static void printList(LinkedList<String> linkedList) {
		Iterator<String> i = linkedList.iterator();
		while (i.hasNext()) {
			System.out.println("Now visiting " + i.next());
		}
		System.out.println("=====================================");
	}

	public static boolean addInOrder(LinkedList<String> linkedList, String newCity) {

	}
}
