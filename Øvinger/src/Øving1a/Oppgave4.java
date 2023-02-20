package Øving1a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Oppgave4 {

	static HashMap<String, Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
		
		ArrayList<String> liste = new ArrayList<>();
		liste.add("er");
		liste.add("det");
		liste.add("alle");
		liste.add("er");
		liste.add("det");
		liste.add("det");
		
		
		mapFreq(liste);
		
		System.out.println(map.toString());
		map.clear();
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		liste.add(input);
		
		System.out.println("Liste ettter lagt til ord" + liste.toString());
		
		mapFreq(liste);
		
		System.out.println(map.toString());
		}
		
		
			
	public static HashMap<String, Integer> mapFreq(ArrayList<String> liste){
		
		for(String word: liste) {
			Integer integer = map.get(word);
			if(integer == null) {
				map.put(word, 1);
			} else {
				map.put(word, integer + 1); 
			}
		}
		return map;
	}
}
