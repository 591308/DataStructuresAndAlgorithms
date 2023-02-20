package Øving1b;

import java.util.ArrayList;
import java.util.Collections;

public class Main2 {

	public static void main(String[] args) {
		
		ArrayList<NettStudent> liste = new ArrayList<>();
		liste.add(new NettStudent(3, "Vlad", "Civilgin", "Bergen", "HVL", "Fosnavåg"));
		liste.add(new NettStudent(1, "Bathu", "Titrek", "Bergen", "HVL", "Tromsø"));
		liste.add(new NettStudent(2, "Valerian", "Moss", "Oslo", "Innland", "Oslo"));
		liste.add(new NettStudent(6, "Kristina", "Dahlgren", "Bergen", "HVL", "Tromsø"));
		liste.add(new NettStudent(4, "Viktor", "Igesund", "Torndheim", "NTNU", "Stavanger"));	
		
		
		System.out.println(liste.stream().map(a -> a.getHjemsted()).distinct().toList());
		
		//U can add nettstudent to student list as it innherit from student
		//But u cant add student to a nettstudent list since its class that was inherited from
	}
}
