package Øving1a;

public class Main {

	static void skrivTab(int[] tab) {
		for(int i = 0; i< tab.length;i++) {
			System.out.println(tab[i] + "");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int[] hTab = {1,2,3,4};
		skrivTab(hTab);

		//a)What will be printed out
		for(int i = 0; i < hTab.length; i++) {
			hTab[i]++;
		}
		skrivTab(hTab);
		//2,3,4,5
		
		//b) what will be printed out?
		for(int t: hTab) {
			t++;
		}
		//Answer: for each loops are not appropriate when we want to modify the array
		skrivTab(hTab);
		
		Heltall[] rTab = new Heltall[4];
		
		for(int i = 0; i < rTab.length; i++) {
			rTab[i] = new Heltall(i+1);
		}
		
		//c)why doesnt skrivTab(rTab) work?
		//skrivTab(rTab);
		//method skrivTab is not applicable for the arguments Heltall[]
		
		//d)Hva will be printed out?
		for(Heltall t: rTab) {
			System.out.print(t + " ");
		}
		System.out.println();
		
		//Answer 1 2 3 4
		
		//e) what will be printed out?
		for(Heltall t : rTab) {
			t.inkrement();
		}
		
		for(Heltall t: rTab) {
			System.out.print(t + " ");
		}
		System.out.println();
		
		//Answer 2 3 4 5
	}
	

}
