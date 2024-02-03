package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.println("How many studants in Course A?");
		int courseA = scan.nextInt();
		
		for (int i = 1; i <= courseA; i++) {
			System.out.println("Enter the id number of the "+ i +"º studant");
			int number = scan.nextInt();
			a.add(number);
		}
		
		System.out.println(" How many studants in Course B?");
		int courseB = scan.nextInt();
		
		for (int i = 1; i <= courseB; i++) {
			System.out.println("Enter the id number of the "+ i +"º studant");
			int number = scan.nextInt();
			a.add(number);
		}
				
		System.out.println(" How many studants in Course C?");
		int courseC = scan.nextInt();
		
		for (int i = 1; i <= courseC; i++) {
			System.out.println("Enter the id number of the "+ i +"º studant");
			int number = scan.nextInt();
			a.add(number);
		}
				
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);

				
		System.out.println("Total studants: " + total.size());
				
		scan.close();
	}
}