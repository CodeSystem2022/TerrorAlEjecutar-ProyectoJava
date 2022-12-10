package controlstock;

import java.util.Scanner;

public class EntradaBebidas {

    public static void entradaBebidas(double[] Sbebida, double valorB, String[] bebida, double gastos[]) {
        // Mostramos todas las bebidas para que se elija a la que se desee agregar stock
        int i, opcion, aux, precio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("***** INGRESAR STOCK (Bebidas) *****");
        System.out.println("------------------------------------");
        for (i = 0;  i <= valorB; i++) {
            System.out.println("" + i + "_ " + bebida[i]);
        }
        System.out.println(Math. round(valorB + 1) + "_volver");
        System.out.println("------------------------------------");
        opcion = Integer.parseInt(teclado.next()); // Leemos la opcion de bebida

        if (opcion == valorB) {
            System.out.println("Ingrese la cantidad de botellas ingresadas: ");
            aux = Integer.parseInt(teclado.nextLine());
            Sbebida[opcion] = Sbebida[opcion] + aux; // Aumentamos la cantidad ingresada al stock total
            System.out.println("");
            System.out.println("Ingrese precio por botella");
            precio = Integer.parseInt(teclado.nextLine());
            gastos = gastos + (precio + aux); // Sumamos los gastos de la compra de las bebudas a gastis totales
        }
    }
}
