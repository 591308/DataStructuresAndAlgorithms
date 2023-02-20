package bagklient;

public class Person {
	
	private String navn;
	private int nr;
	
	public Person() {
		this("", 0);
	}
	
	//Constructor
	public Person(String navn, int nr) {
		this.navn=navn;
		this.nr=nr;
	}
	
	public String getNavn(){
		return navn;
	}
	
	public int getNr() {
		return nr;
	}
	
	public String toString() {
		return navn + " " + nr;
	}
	
	@Override
	public boolean equals(Object andre) {
		if(this == andre) {
			return true;
		}
		if(andre == null) {
			return false;
		}
		if(getClass() != andre.getClass()) {
			return false;
		} 
		Person denAndre = (Person) andre;
		boolean like = this.navn == denAndre.getNavn() && this.nr == denAndre.getNr();
		return like;
	}
	
}
