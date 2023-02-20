package Øving1a;

import java.util.HashSet;

public class Oppgave3 {

	public static void main(String[] args) {
		
		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		
		set1.add("abba");
		set1.add("Vlad");
		set1.add("max");
		set1.add("kaboom");
		set1.add("kuk");
		
		set2.add("krom");
		set2.add("ka");
		set2.add("max");
		set2.add("hvem");
		set2.add("kuk");
		
		
		for(String a : set1) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		for(String a : set2) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		HashSet<String> nySetUn = new HashSet<>(set1);
		HashSet<String> nySetSn = new HashSet<>(set1);
		
		nySetUn.addAll(set2);
		System.out.println("Union av mengde 1 og 2 er" + nySetUn.toString());
		
		nySetSn.retainAll(set2);
		System.out.println("Snitt av mengde 1 og 2 er" + nySetSn.toString());
		
	}
	
}
