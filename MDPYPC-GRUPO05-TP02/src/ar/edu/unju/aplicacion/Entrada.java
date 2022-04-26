package ar.edu.unju.aplicacion;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		int num, dec, uni;
		Scanner sc=new Scanner(System.in);
		do {		
			String decena="", unidad="";		
			System.out.print("Ingrese Número de hasta 2 cifras (-1 para salir) : ");
			num=sc.nextInt();
			if(num > 0 && num < 100){
				if(num > 10 && num < 16){
					switch(num){
					case 11: System.out.println("ONCE"); break;
					case 12: System.out.println("DOCE"); break;
					case 13: System.out.println("TRECE"); break;
					case 14: System.out.println("CATORCE"); break;
					case 15: System.out.println("QUINCE"); break;
					}
				}else{
					dec = num / 10;
					uni = num - (dec * 10);
					switch(dec){
					case 1: decena = "DIEZ"; break;
					case 2: decena = "VEINTE"; break;
					case 3: decena = "TREINTA "; break;
					case 4: decena = "CUARENTA ";break;
					case 5: decena = "CINCUENTA "; break;
					case 6: decena = "SESENTA "; break;
					case 7: decena = "SETENTA "; break;
					case 8: decena = "OCHENTA "; break;
					case 9: decena = "NOVENTA "; break;

					}
					if(uni != 0){
						switch(uni){
						case 1: unidad = "UNO"; break;
						case 2: unidad = "DOS"; break;
						case 3: unidad = "TRES"; break;
						case 4: unidad = "CUATRO"; break;
						case 5: unidad = "CINCO"; break;
						case 6: unidad = "SEIS"; break;
						case 7: unidad = "SIETE"; break;
						case 8: unidad = "OCHO"; break;
						case 9: unidad = "NUEVE"; break;
						}
						if(dec == 1){
							decena = "DIECI";
						}
						if(dec == 2){
							decena = "VEINTI";
						}
						if(dec > 2 && dec < 10){
							System.out.println("Usted ingreso el "+decena + " Y " + unidad);						
						}else{
							System.out.println("Usted ingreso el "+decena + "" + unidad);
						}
					}else{
						System.out.println(decena);
					}
				}
			}
		} while (num!=-1);
		System.out.println("Adios");
		sc.close();
	}

}
