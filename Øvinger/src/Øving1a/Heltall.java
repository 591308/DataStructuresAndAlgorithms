package Øving1a;

public class Heltall {

	private int tall;
	
	public Heltall(int n) {
		tall = n;
	}
	
	public void inkrement() {
		tall++;
	}
	
	public String toString() {
		return "" + tall; 
	}
}
