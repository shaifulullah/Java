import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>();
		// placesToVisit.add("Dhaka");
		// placesToVisit.add("Chittagong");
		// placesToVisit.add("Barshal");
		// placesToVisit.add("Canada");

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        showPlaces(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        showPlaces(placesToVisit);
        visit(placesToVisit);
	}

	public static void showPlaces(LinkedList<String> visitingPlaces) {
		Iterator<String> iterator = visitingPlaces.iterator();
		while (iterator.hasNext()) {
			System.out.println("Now Visiting: " + iterator.next());
		}
	}

	public static boolean addInOrder(LinkedList<String> visitingPlaces, String newCity) {
		ListIterator<String> StringListIterator = visitingPlaces.listIterator();
		while (StringListIterator.hasNext()) {
			int comparison = StringListIterator.next().compareTo(newCity);
			if (comparison == 0) {
				System.out.println(newCity + " is already in list");
				return false;
			} else if (comparison > 0) {
				StringListIterator.previous();
				StringListIterator.add(newCity);
				return true;
			} else if (comparison < 0) {
				// do nothing. it will automatically traverse to next city
			}
		}
		StringListIterator.add(newCity);
		return true;
	}

	public static void visit(LinkedList cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		ListIterator<String> listIterator = cities.listIterator();

		if (cities.isEmpty()) {
			System.out.println("No cities in this itenerary");
			return;// why?
		} else {
			System.out.println("Now visiting " + listIterator.next());
			printMenu();
		}
		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action) {
			case 0:
				System.out.println("Vacation over");
				quit = true;
				break;

			case 1:
				if (listIterator.hasNext()) {
					System.out.println("Now visiting " + listIterator.next());
				} else {
					System.out.println("We are at the end of the list");
				}
				break;
			case 2:
				if (listIterator.hasPrevious()) {
					System.out.println("now visiting " + listIterator.previous());
				} else {
					System.out.println("We are at the start of the list");
				}
				break;

			case 3:
				printMenu();
				break;
			}
		}
	}

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}