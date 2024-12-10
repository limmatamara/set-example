package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many students for course A?");
		int listA = sc.nextInt();
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		for (int i=1; i<=listA; i++) {
			int number = sc.nextInt();
			a.add(number);
		}
		System.out.print("How many students for course B?");
		int listB = sc.nextInt();
		for (int i=1; i<=listB; i++) {
			int number = sc.nextInt();
			b.add(number);
		}
		System.out.print("How many students for course C?");
		int listC = sc.nextInt();
		for (int i=1; i<=listC; i++) {
			int number = sc.nextInt();
			c.add(number);
		}
		
		Set<Integer> retainAll = new HashSet<>(a);
		retainAll.addAll(b);
		retainAll.addAll(c);
		
		System.out.println("Total Students: " + retainAll.size());
		sc.close();		
	}

}
