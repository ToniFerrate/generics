package generics.N1E2;

/*
Crea una classe anomenada Persona amb els atributs nom, cognom i edat. Després crea una classe anomenada 
GenericMethods amb un mètode genèric que accepti tres arguments de tipus genèric. 
Aquest mètode només ha d’imprimir per pantalla els arguments que ha rebut. Al main() de la classe 
principal, crida el mètode genèric amb diferents tipus de paràmetres.

Exemple: un objecte de la classe Persona, un String i un tipus primitiu.

D’aquesta manera has comprovat que se li pot passar qualsevol tipus de paràmetre i en qualsevol ordre.
*/

public class N1E2 {

	public static void main(String[] args) {
		
		// Cridem el mètode genèric imprimir amb tres paràmetres de tipus Persona
		
		Persona pers1 = new Persona ("Toni", "Ferraté", 53);
		Persona pers2 = new Persona ("Josep", "Perez", 22);
		Persona pers3 = new Persona ("Maria", "Garcia", 33);
		
		GenericMethods.imprimir(pers1, pers2, pers3);
		
		// Cridem el mètode genèric imprimir amb tres paràmetres de tipus String
		
		GenericMethods.imprimir("Toni", "Josep", "Maria");
		
		// Cridem el mètode genèric imprimir amb tres paràmetres de tipus int
		
		GenericMethods.imprimir(1, 2, 3);
	
	}

}
