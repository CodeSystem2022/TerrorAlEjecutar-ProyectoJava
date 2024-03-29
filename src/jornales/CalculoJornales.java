
package jornales;

import java.util.Scanner;

public class CalculoJornales {
    // ----------------------------
	// SUBPROCESO CALCULO JORNALES
	// ----------------------------
	// Subproceso para asignar horas a empleados
	public static void calculojornales(double horasT[], String semana[][], double horas[][]) {
            Scanner entrada = new Scanner(System.in);
		int i;
		int j;
		// asignamos un valor a HorasT 
		horasT[0] = 0;
		// esto recorrer los 5 dias y va poniendo las horas que trabajo 
		for (j=0;j<=4;j++) {
			System.out.print("Definir las horas del dia "+(j+1)+" De la semana: ");
			horas[0][j] = entrada.nextDouble();
			// aca se van sumando el total de horas q trabajo en la semana 
			horasT[0] = horasT[0]+horas[0][j];
			System.out.println(""); 
		}
		// recorremos la matriz
		for (i=0;i<=1;i++) {
			for (j=0;j<=4;j++) {
				// esto nos va a mostrar primero los dias de la semana 
				if (i==0) {
					System.out.print("|"+semana[0][j]+"| ");
					// en las acciones por falso, nos muestra las horas que trabajo con sus respectivos dias
				} else {
					System.out.print("   "+horas[0][j]+"       ");
				}
			}
			System.out.println(" ");
		}
		// se muestra el total de horas de la semana 
		System.out.println("La cantidad de horas semanales de este empleado son: "+horasT[0]);
	}

	public static double calculosalario(double horasT[], double salario[]) {
		double pago;
		// esta funcion realiza un calculo multiplicando el salario por horas, y las horas de la semana
		pago = horasT[0]*salario[0];
		return pago;
	}
}


