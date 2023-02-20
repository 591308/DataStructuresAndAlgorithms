package Øving1a;

import java.util.ArrayList;
import java.util.List;

public class Oppgave2 {

		public static List<Integer> liste = new ArrayList<>();
		
	public static void main(String[] args) {
		
		//a
		liste.add(1);
		liste.add(3);
		liste.add(2);
		liste.add(3);
		liste.add(4);
		
		int a = liste.get(3);
		int b = liste.get(4);
		
		System.out.println(a + ", " + b);
		// We get eeror if we try to print elemtns at index 4 and 5 because array is of size 5 
		//but starts at index 0, so index 5 is out of bounds.
		
		//b
		System.out.println(liste.size());
		
		//c 
		System.out.println("Finnes element i listen: " + liste.contains(1));
		
		System.out.println("Finnes element i listen: " + finnes(3));
		
		//d)
		førstOgSistForekomst(liste);
		
		//e) remove all elements in the list
		liste.clear();
		
		skrivUt();
		
	}
	
	
	public static void førstOgSistForekomst(List<Integer> liste) {
		int first = -1;
		int last = -1;
		
		for(int i = 0; i < liste.size(); i++){
			for(int j = i+1; j < liste.size(); j++) {
				if(liste.get(i) == liste.get(j)) {
					first = i;
					last = j;
				}
			}
		}
		
		if(first != -1) {
			System.out.println("First occurence of " + liste.get(first) + " = " + first);
			System.out.println("Last occurence of " + liste.get(last) + " = " + last);
		} else 
			System.out.println("No duplicates found");
		
		
	}
	
	public static void skrivUt() {
		System.out.println(liste.toString());
	}
	
	public static boolean finnes(int a) {
		boolean funnet = false;
		for(int i = 0; i < liste.size() && !funnet; i ++) {
			if(liste.get(i).equals(a)) {
				funnet = true;
			}
		}
		return funnet;
	}
}
