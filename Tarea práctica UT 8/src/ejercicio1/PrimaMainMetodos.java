package ejercicio1;
import java.util.Scanner;
/**
 * Clase PrimaMainMetodos
 * Esta clase calcula la prima de un empleado, dependiendo
 * de si es o no directivo y del n?mero de meses que ha trabajado.
 * @author Montse
 * @version 2020-09 (4.17.0)
 * @date 2022/04/22
 */


public class PrimaMainMetodos {
	

	static Scanner  teclado=new Scanner(System.in);
	
	/**
	 * Este m?todo se encarga de iniciar la ejecuci?n del programa
	 * ?ste es el m?todo principal del proyecto
	 * @param args[] es un arreglo con los par?metros que ?l reciba por consola
	 * 
	*/

	public static void main(String[] args) {

		int numEmple;
		String nomEmple;
		int meses;
		char esDirectivo;
		char respuesta;
		

		do {
			System.out.println("\nDATOS  EMPLEADO/A");
			numEmple=leerNumEmple();
			nomEmple=leerNomEmple();
			meses=leerMeses();
			esDirectivo=leerEsDirectivo();
			System.out.println("\n\tLe corresponde la prima "+hallarPrima(esDirectivo, meses));
			
			
			System.out.println("\n?CALCULAR MAS PRIMAS? (S/N): ");
			respuesta=teclado.nextLine().toUpperCase().charAt(0);
		}while(respuesta=='S');		
	}
/**
 * Este m?todo se encarga de calcular la prima
 * que le corresponde al empleado. Si es directivo, si los meses
 * son iguales o mayores a 12, devolver? P1 y sino, devolver?
 * P3. Si no es directivo, si los meses son iguales o mayores a 12
 * devolver? P2 y sino devolver? P4.
 * @param esDirectivo es un par?metro de tipo car?cter, que indica 
 * si el empleado es o no directivo.
 * meses es un par?metro de tipo entero, que indica el n?mero de
 * meses
 * @return El tipo de prima que le corresponde al empleado
 */

	public static String hallarPrima(char esDirectivo, int meses) {
		if(esDirectivo=='+') // ES DIRECTIVO
			if(meses>=12)
				return "P1";
			else
				return "P3";
		else 	// NO ES DIRECTIVO
			if(meses>=12)
				return "P2";
			else
				return "P4";
	}

	/**
	 * Este m?todo se encarga de leer por teclado el n?mero de empleado,
	 * que tiene que estar entre 100 y 999.
	 * @return El n?mero de empleado
	 */
	public static int leerNumEmple() {		
		int numEmple;
		do{
			System.out.println("N?MERO [100-999]: ");
			numEmple = teclado.nextInt();
		}while(numEmple<100 || numEmple>999);		
		teclado.nextLine();
		return numEmple;
	}
	
	/**
	 * Este m?todo se encarga de leer por teclado el nombre del empleado,
	 * que tiene que tener m?ximo 10 caracteres.
	 * @return El nombre del empleado
	 */
	public static String leerNomEmple() {
		String nomEmple;
		do {
			System.out.println("NOMBRE (max 10 caracteres): ");
			nomEmple = teclado.nextLine();
		}while(nomEmple.length()>10);		
		return nomEmple;
	}
	
	/**
	 * Este m?todo se encarga de leer por teclado los meses de trabajo del empleado,
	 * que no pueden ser menores que 0.
	 * @return el n?mero de meses trabajados por el empleado.
	 */
	public static int leerMeses() {
		int meses;
		do {
			System.out.println("MESES DE TRABAJO: ");
			meses = teclado.nextInt();
		}while(meses<0);
		teclado.nextLine();
		return meses;
	}
	
	/**
	 * Este m?todo se encarga de leer por teclado si el empleado es directivo (+) o no (-)-
	 * @return un + (el empleado es directivo) o un - (el empleado no es directivo).
	 */

	public static char leerEsDirectivo() {
		char esDirectivo;
		do {
			System.out.println("?ES DIRECTIVO? (+/-): ");
			esDirectivo = teclado.nextLine().charAt(0);
		}while(esDirectivo!='+' && esDirectivo!='-');
		return esDirectivo;
	}
}