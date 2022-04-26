//Muestre el vector completo en una sola línea.
//1.4.2. La suma y el promedio de los números positivos.
//1.4.3. La suma y el promedio de los números negativos.
//1.4.4. La suma y el promedio de los números ubicados en posiciones pares del array.
//1.4.5. La suma y el promedio de los números ubicados en posiciones impares del array.
package ejercicio_04;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aux=0;
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			do {			
				System.out.println("Ingrese un numero distinto de 0 entre [-100,100]");
				aux=sc.nextInt();
				if (aux!=0 && aux>=-100 && aux<=100) {
					array[i]=aux;
				}else {
					System.out.println("Ingrese un valor valido");
					i=-1;
				}
			}while(aux<=-100 && aux>=100);
		}	

		mostrar(array);
		SumaPromPos(array);
		SumaPromNeg(array);
		SumaPromPosicPares(array);
		SumaPromPosicImpares(array);	
		sc.close();
	}

	public static void mostrar(int[] array) {
		System.out.print("Elementos del Vector: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	public static void SumaPromPos(int[]array) {
		int suma=0;
		float prom=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>0)
				suma=suma+array[i];						
		}	
		prom=suma/array.length;
		System.out.println("Suma de Positivos: "+suma+" Promedio de Positivos: "+prom);
	}
	public static void SumaPromNeg(int[]array) {
		int suma=0;
		float prom=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]<0)
				suma=suma+array[i];						
		}	
		prom=suma/array.length;
		System.out.println("Suma de Negativos: "+suma+" Promedio de Negativos: "+prom);
	}
	public static void SumaPromPosicPares(int[]array) {
		int suma=0;
		float prom=0;
		for (int i = 0; i < array.length; i++) {
			if(i%2==0)
				suma=suma+array[i];						
		}	
		prom=suma/array.length;
		System.out.println("Suma de Pos Pares: "+suma+" Promedio de Pos Pares: "+prom);
	}
	public static void SumaPromPosicImpares(int[]array) {
		int suma=0;
		float prom=0;
		for (int i = 1; i < array.length; i++) {
			if(i%2!=0)
				suma=suma+array[i];						
		}	
		prom=suma/array.length;
		System.out.println("Suma de Pos Impares: "+suma+" Promedio de Pos Impares: "+prom);
	}
}
