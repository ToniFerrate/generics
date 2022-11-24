package generics.N2E1;

public class GenericMethods {
	
	public static <T> void imprimir(Persona obj1, T obj2, T obj3) {
		System.out.println("GenericMethods [obj1=" + obj1 + ", obj2=" + obj2 + ", obj3=" + obj3 + "]");
	}
	
}
