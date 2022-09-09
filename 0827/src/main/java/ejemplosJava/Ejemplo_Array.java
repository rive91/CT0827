package ejemplosJava;

public class Ejemplo_Array {

	public static void main(String[] args) {
		int intArr[];
		int[] inrArr2;
		
		//Ejemplos de arreglos
		byte byteArray[];
		long lonArray[];
		double doubleArray[];
		
		//Declarar un array de strings
		String[] arr;
		
		//asignando memoria para 5 enteros
		arr = new String[6];
		
		//Inicializar el primer elemento del array
		arr[0] = "cero";
		
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		arr[5] = "cinco";

		
		System.out.println(arr[4]);
		
		for(int i = 0; i < arr.length;i++) { //.lenght nos regresa la longitud del arreglo
			System.out.println("Elemento en la posicion " + i + ":" + arr[i]);
		}
	}

}
