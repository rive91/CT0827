package ejemplosJava;

public class Ejemplo_CyO_DemoVehiculo {

	public static void main(String[] args) {
		Ejemplo_CyO_Vehiculo minivan = new Ejemplo_CyO_Vehiculo();
		
		int rango;
		
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//Calcular el rando asumiendo un tanque lleno
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("la minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango + " kiometros");
		
		Ejemplo_CyO_Vehiculo carro = new Ejemplo_CyO_Vehiculo();
		
		carro.pasajeros = 9;
		System.out.println("Numero de pasaejeros en carro es: " + carro.pasajeros);

	}

}
