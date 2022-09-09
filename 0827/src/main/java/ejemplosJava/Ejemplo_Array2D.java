package ejemplosJava;

public class Ejemplo_Array2D {

	public static void main(String[] args) {
		int arr[][] = { {2,7,9} , {3,6,1,3} , {7,4,2,2,9}};
		
		//System.out.println(arr[0][0]);
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");//print se hace sobre la misma lienas
			}
			System.out.println();
		}
		
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");//print se hace sobre la misma lienas
			}
			System.out.println();
		}

	}

}
