package generics.N2E1;

/*
Modifica l'exercici anterior de manera que un dels arguments del mètode genèric no sigui genèric.
*/

public class N2E1 {

	public static void main(String[] args) {
		
		// Cridem el mètode genèric imprimir amb tres paràmetres de tipus Persona
		
		Persona pers1 = new Persona ("Toni", "Ferraté", 53);
		Persona pers2 = new Persona ("Josep", "Perez", 22);
		Persona pers3 = new Persona ("Maria", "Garcia", 33);
		
		GenericMethods.imprimir(pers1, pers2, pers3);
		
		// Cridem el mètode genèric imprimir amb un argument Persona i dos arguments de tipus String
		
		GenericMethods.imprimir(pers1, "Josep", "Maria");
		
		// Cridem el mètode genèric imprimir amb un argument Persona i dos arguments de tipus int
		
		GenericMethods.imprimir(pers1, 2, 3);
	
	}

}
