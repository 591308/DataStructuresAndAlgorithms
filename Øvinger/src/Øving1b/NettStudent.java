package Øving1b;

public class NettStudent extends Student{

	private String hjemsted;
	
	public NettStudent(int studentnummer, String fornavn, String etternavn, String studieBy, String studieSted, String hjemsted) {
		super(studentnummer, fornavn, etternavn, studieBy, studieSted);
		this.setHjemsted(hjemsted);
		
	}

	public String getHjemsted() {
		return hjemsted;
	}

	public void setHjemsted(String hjemsted) {
		this.hjemsted = hjemsted;
	}

	@Override
	public String toString() {
		return "NettStudent [hjemsted=" + hjemsted + ", getStudentnummer()=" + getStudentnummer() + ", getFornavn()="
				+ getFornavn() + ", getEtternavn()=" + getEtternavn() + ", getStudieBy()=" + getStudieBy()
				+ ", getStudieSted()=" + getStudieSted() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	}
	
	

}
