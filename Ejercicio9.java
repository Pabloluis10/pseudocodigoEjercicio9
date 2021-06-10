import java.util.*;

public class Ejercicio9{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		
		double temp1=0;
		double temp2=0;
		double promedio =0;
		int contador=0;

		System.out.println("Ingrese pares de temperatura hasta que ingrese 0 en la primera temperatura");
		System.out.println("De las temeperaturas que hay ingresado y se encuentren entre 5 y 15 grados se hallara el promedio");

		do{
			System.out.print("Ingrese temperatura 1: ");
			temp1 = entrada.nextDouble();

			if(temp1 != 0){
				System.out.print("Ingrese temperatura 2: ");
				temp2 = entrada.nextDouble();
			} else {
				System.out.println("Decidio salir");
			}

			if(temp1 > 4 && temp1 < 16){
				promedio += temp1;
				contador++;
			}
			if(temp2 > 4 && temp2 < 16){
				promedio += temp2;
				contador++;
			}
		}while(temp1 != 0);
		
		promedio /= contador;

		System.out.println("El promedio de las temperaturas entre 5 y 15 es: "+promedio);
	}
}