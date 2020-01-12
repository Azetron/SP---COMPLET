package l3;


public class Author {
	public String Nume;
	
	public Author() {}
	public Author(String N) {
		this.Nume = N;
		
	}
	public String getNume() {
		return Nume;
	}
	public void setNume(String nume) {
		Nume = nume;
	}
	
	public String toString() {
		return this.Nume;
	}
	public void print() {
		System.out.println("Author:" + this.Nume);
	}
	
	
	
}
