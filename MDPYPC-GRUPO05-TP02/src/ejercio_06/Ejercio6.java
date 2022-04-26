package ejercio_06;
import java.util.Random;
public class Ejercio6 {		
		public static void main(String[] args) {
			int[] array = new int[1000];
			int suma1=0,suma2=0,suma3=0,suma4=0;
			int j=500,k=750;
			Random rd = new Random();
			for ( int i = 0; i < array.length; i++) {
				array[i]=rd.nextInt(51)+50;
				System.out.print(array[i]+" ");				
			}
			for ( int i = 0; i < 250; i++) {				
				suma1=suma1+array[i];				
			}
			
			for (int i = 250; i < 500; i++) {
				suma2=suma2+array[i];
			}			
			
			do {
				suma3=suma3+array[j];
				j++;
			} while (j<750);
			
			while (k<1000) {
				suma4=suma4+array[k];
				k++;
			}
			System.out.println("\nLa suma de las 250 primeras posiciones es: " + suma1);
			System.out.println("La suma de las posiciones entre 250 y 500 es: " + suma2);
			System.out.println("La suma de las posiciones entre 500 y 750 es: " + suma3);
			System.out.println("La suma de las ultimas 250 posiciones es: " + suma4);
		}		
	}