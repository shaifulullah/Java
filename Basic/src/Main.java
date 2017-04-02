/*Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data:*/

//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter your Number");
//		int number = input.nextInt();
//		
//		for (int i =0; i <= 10; i++){
//			System.out.println(number+" X "+ i + " = "+number*i);
//		}
//	}
//
//}

/*Write a Java program to print the area and perimeter of a circle.*/
//public class Main {
//
//	public static void main(String[] args) {
//		double radius = 7.5;
//		
//		double perimeter = 2*Math.PI*radius;
//		double area =  Math.PI*radius*radius;
//		
//		System.out.println("Perimeter ="+perimeter);
//		System.out.println("Area ="+area);
//	}
//
//}


/* Write a Java program that takes three numbers as input to calculate and print the average of the numbers.*/

//public class Main {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("Enter First Number: ");
//		double firstNumber = scanner.nextDouble();
//		
//		System.out.print("Enter First Number: ");
//		double secondNumber = scanner.nextDouble();
//		
//		System.out.print("Enter First Number: ");
//		double thirdNumber = scanner.nextDouble();
//		
//		double average =  (firstNumber+secondNumber+thirdNumber)/3;
//		
//		System.out.println("Average is: "+average);
//	}
//}


/*Write a Java program to swap two variables.*/

//public class Main {
//
//	public static void main(String[] args) {
//		int a, b, temp;
//		
//		a=20;
//		b=30;
//		System.out.println("Befor swap : a= "+ a +" b= "+b );
//		
//		temp = a;
//		a = b;
//		b=temp;
//		
//		System.out.println("After swap : a= "+ a +" b= "+b );
//	}
//}


/*write a program that will take a string and reverse it*/

//import java.util.Scanner;
//
//public class Main {
//
//	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter your String: ");
//		String input = scanner.nextLine();
//		
//		char[] charArray = input.toCharArray();
//		
//		for (int i = charArray.length -1; i>= 0; i--){
//			System.out.print(charArray[i]);
//		}
//
//	}
//}

/*program will take a sentense and reverse it
 * ex;INPUT: my name is shaiful, OUTPUT: shaiful is name my*/
//import java.util.Scanner;
//
//public class Main {
//
//	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter your String: ");
//		String input = scanner.nextLine();
//		
//		String output = " ";
//		
//		String string[] = input.split(" ");
//		
//		for (int i = 0; i < string.length; i++) {
//			System.out.print(string[i]+" ");
//		}
//		System.out.println("");
//		for (int i = string.length-1; i >= 0; i--) {
//			output = output+string[i]+" ";
//			
//		}
//		System.out.print("Reverse is: "+output);
//	}
//}

/*write a function that will convert a number in to phone number format*/
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your phone number: ");
//		long phoneNum = scanner.nextLong();
//
//		System.out.println(String.valueOf(phoneNum).replaceFirst("(\\d{3})(\\d{3})(\\d+})", "($1)-$2-$3"));
//	}
//}

/*write a function that will take a string/value and remove any character in it*/

//import java.util.Scanner;
//
//
//public class Main {
//
//	public static String convert(String s) {
//		
//		StringBuilder stringBuilder = new StringBuilder(s);
//		
//		for (int i = 0; i < stringBuilder.length(); i++) {
//			if (stringBuilder.charAt(i)< 97 || stringBuilder.charAt(i)>122) { //for digit ascii range is 48-57
//																			// for alphabet ascii range is 97 to 122	
//				stringBuilder.deleteCharAt(i);
//				i--;
//			}
//					}
//		return stringBuilder.toString();
//	}
//	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your string here: ");
//		String input = scanner.nextLine();
//		
//		String output = convert(input);
//		System.out.println(output);
//	}
//}

import java.util.Scanner;


public class Main {

	public static String convert(String string) {
		StringBuilder sBuilder = new StringBuilder(string);
		
		for (int i = 0; i < sBuilder.length(); i++) {
			if (sBuilder.charAt(i)<48 || sBuilder.charAt(i)>57) {
				sBuilder.deleteCharAt(i);
				i--;
			}
		}
		return sBuilder.toString();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String input = scanner.nextLine();
		
		String output = convert(input);
		System.out.println(output);

	}
}











