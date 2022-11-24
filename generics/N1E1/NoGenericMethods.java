package generics.N1E1;


public class NoGenericMethods {
	private Persona pers1;
	private Persona pers2;
	private Persona pers3;
	
	public NoGenericMethods(Persona pers1, Persona pers2, Persona pers3) {
		super();
		this.pers1 = pers1;
		this.pers2 = pers2;
		this.pers3 = pers3;
	}

	public Persona getPers1() {
		return pers1;
	}

	public void setPers1(Persona pers1) {
		this.pers1 = pers1;
	}

	public Persona getPers2() {
		return pers2;
	}
	
	public void setPers2(Persona pers2) {
		this.pers2 = pers2;
	}

	public Persona getPers3() {
		return pers3;
	}

	public void setPers3(Persona pers3) {
		this.pers3 = pers3;
	}

	@Override
	public String toString() {
		return "NoGenericMethods [pers1=" + pers1 + ", pers2=" + pers2 + ", pers3=" + pers3 + "]";
	}
	
	
	
}
