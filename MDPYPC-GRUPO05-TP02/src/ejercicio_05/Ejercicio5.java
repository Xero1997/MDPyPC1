/*5) Cree una aplicación que lea el archivo “TP02Frase.txt”, para ello deberá descargar el archivo
(desde el aula virtual) a su disco rígido y pasarle la ubicación al programa. A continuación
debe calcular y mostrar lo siguiente:
1.5.1. Cantidad de cada una de las vocales (cantidades de A/a, E/e, I/i, O/o y U/u).
1.5.2. Cantidad de espacios en blanco.
1.5.3. Cantidad de palabras.
1.5.4. Cantidad de letras en mayúscula.
1.5.5. Cantidad de líneas del archivo.
1.5.6. Cantidad de signos de puntuación.
1.5.7. Para cada vocal (acentuada o no) obtenga el código ASCII, adiciónele 20 a dicho
valor, y vuelva a obtener el carácter correspondiente reemplazando el nuevo
valor en la frase original. Muestre por pantalla el nuevo resultado.*/
package ejercicio_05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

class Ejercicio5 {
	public static void main(String [] arg) {

		int contEspacios=0,lineasTotales=0,contPalabras=0,contMayus=0
				,contA=0,contE=0,contI=0,contO=0,contU=0,contSignos=0,ascii;
		File archivo = null;
		FileReader fR = null;
		BufferedReader bR = null; 

		try {
			// Apertura del fichero y creacion de BufferedReader 
			archivo = new File ("C:\\2022\\MDPyPC\\TP2\\TP02Frase.txt");
			fR = new FileReader (archivo);
			bR = new BufferedReader(fR);

			// Lectura del fichero
			String linea;

			while((linea=bR.readLine())!=null){             

				System.out.println(linea );
				
				for (int i=0; i < linea.length();i++){
					char letra = Character.toLowerCase(linea.charAt(i));
					char signo = linea.charAt(i);
	
					if (letra=='a')
						contA++;
					if(letra=='e')
						contE++;
					if(letra=='i' || letra=='í')
						contI++;
					if(letra=='o')
						contO++;
					if(letra=='u')
						contU++;
					if (linea.charAt(i)== ' ')
						contEspacios++;
					if(Character.isUpperCase(linea.charAt(i))){
						contMayus++;
					}

					if(signo==44 || signo==33 || signo==58 || signo==59 || signo=='¡' || signo==46)
						contSignos++;         
				}                                        

				for (int i=0; i < linea.length();i++){
					char objeto=Character.toLowerCase(linea.charAt(i));
					if (objeto=='a' || objeto=='e' || objeto=='i' || objeto=='o' || objeto=='u' || objeto==160 || 
							(linea.charAt(i)=='í') || objeto==162 || objeto==163 || objeto==130) {                        

						ascii= linea.charAt(i) + 20;

						linea = linea.replace(linea.charAt(i), (char) ascii);                        
					}
				}             
				System.out.println(linea+ "\n");
				
				StringTokenizer pal = new StringTokenizer(linea);  // trocea 
				lineasTotales++;
				contPalabras= contPalabras + pal.countTokens();                          
			}          
			System.out.println("Cantidad de Vocales de a: "+ contA);
			System.out.println("Cantidad de Vocales de e: "+ contE);
			System.out.println("Cantidad de Vocales de i: "+ contI);
			System.out.println("Cantidad de Vocales de o: "+ contO);
			System.out.println("Cantidad de Vocales de u: "+ contU);
			System.out.println("Cantidad de espacios en blanco: " +contEspacios);
			System.out.println("Cantidad de Palabras: " + contPalabras);
			System.out.println("Cantidad de Mayusculas: " + contMayus);
			System.out.println("Cantidad de Lineas: " + lineasTotales);
			System.out.println("Cantidad de signos de Puntacion: " + contSignos);  

			//        Cerramos el fichero
			fR.close();      
		}
		catch(Exception e){
			e.printStackTrace();
		}   
	}
}