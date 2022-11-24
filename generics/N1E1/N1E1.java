package generics.N1E1;

public class N1E1 {

	public static void main(String[] args) {
		
		Persona pers1 = new Persona ("Toni", "Ferraté", 53);
		Persona pers2 = new Persona ("Josep", "Perez", 22);
		Persona pers3 = new Persona ("Maria", "Garcia", 33);
		
		// Els arguments es poden posar en qualsevol posició en la crida al constructor
		NoGenericMethods ngm = new NoGenericMethods( pers1, pers2, pers3);
		System.out.println(ngm);
		NoGenericMethods ngm2 = new NoGenericMethods( pers3, pers2, pers1);
		System.out.println(ngm2);
	}

}
