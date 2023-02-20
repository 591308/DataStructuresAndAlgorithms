package Øving1b;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student> liste = new ArrayList<>();
		liste.add(new Student(3, "Vlad", "Civilgin", "Bergen", "HVL"));
		liste.add(new Student(1, "Bathu", "Titrek", "Bergen", "HVL"));
		liste.add(new Student(2, "Valerian", "Moss", "Oslo", "Innland"));
		liste.add(new Student(6, "Kristina", "Dahlgren", "Bergen", "HVL"));
		liste.add(new Student(4, "Viktor", "Igesund", "Torndheim", "NTNU"));
		
		Collections.sort(liste, (a,b) -> a.compareTo(b));
		
		for(Student a: liste) {
			System.out.println(a.toString());
		}
		
		System.out.println("");
		Collections.sort(liste, (a,b) -> a.getFornavn().compareTo(b.getFornavn()));
		
		for(Student a: liste) {
			System.out.println(a.toString());
		}
		
	}
}
