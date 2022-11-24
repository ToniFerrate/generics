package generics.N2E2;
/*
Modifica l'apartat anterior de manera que els arguments del mètode genèric siguin una llista d'arguments 
de variable indefinida.
*/
public class GenericMethods {
	
	
	public static <T> void imprimir(T...obj) {
		  System.out.println("Nombre d'arguments: "+obj.length);
		     for (int i=0; i<obj.length;i++) {
		    	 System.out.println(" arg "+i+": "+obj[i]);
		     }
		     System.out.println();
	}
	
}
