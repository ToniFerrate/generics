package generics.N2E2;

/*
Modifica l'apartat anterior de manera que els arguments del mètode genèric siguin una llista d'arguments 
de variable indefinida.
*/

public class N2E2 {

	public static void main(String[] args) {
		
		// Cridem el mètode genèric imprimir amb diferent nombre d'arguments i de diferent tipus
		
		Persona pers1 = new Persona ("Toni", "Ferraté", 53);
		Persona pers2 = new Persona ("Josep", "Perez", 22);
		Persona pers3 = new Persona ("Maria", "Garcia", 33);
		
		GenericMethods.imprimir(pers1, pers2, pers3);
		
		GenericMethods.imprimir();
		
		GenericMethods.imprimir(pers1, pers2, "Josep", "Maria", "Andreu");
				
		GenericMethods.imprimir(1, "Josep", 3, pers3, 5, 6, 7);
	
	}

}
