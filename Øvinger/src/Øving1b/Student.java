package Øving1b;

import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class Student implements Comparable<Student>{

	private int studentnummer;
	private String fornavn;
	private String etternavn;
	private String studieBy;
	private String studieSted;
	
	public Student(int studentnummer, String fornavn, String etternavn, String studieBy, String studieSted) {
		this.studentnummer = studentnummer;
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.studieBy = studieBy;
		this.studieSted = studieSted;
	}

	public int getStudentnummer() {
		return studentnummer;
	}

	public void setStudentnummer(int studentnummer) {
		this.studentnummer = studentnummer;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getStudieBy() {
		return studieBy;
	}

	public void setStudieBy(String studieBy) {
		this.studieBy = studieBy;
	}

	public String getStudieSted() {
		return studieSted;
	}

	public void setStudieSted(String studieSted) {
		this.studieSted = studieSted;
	}

	@Override
	public int compareTo(Student o) {
		
		int studentnr = o.studentnummer;
		
		return this.studentnummer - studentnr;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(studentnummer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentnummer == other.studentnummer;
	}

	@Override
	public String toString() {
		return "Student [st.nr=" + studentnummer + ", fornavn=" + fornavn + ", etternavn=" + etternavn
				+ ", studieBy=" + studieBy + ", studieSted=" + studieSted + "]";
	}

	
	
	
}
