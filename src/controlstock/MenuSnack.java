package controlstock;

//-----------------------
// SUBPROCESO MENU SNACKS
//-----------------------

public class MenuSnack {

    public static void menusnack(double[] Ssnack, double valorSNK, double[] Snack) {
        int i;
        // Mostramos todo el menú de snacks y la cantidad de stock disponible.
        System.out.println("---------------------------------------");        
        for (i = 0; i <= valorSNK; i++){
            System.out.println("El stock de ", Snack[i], "es de: ", Ssnack[i], " KG.");
            System.out.println("---------------------------------------");
        }
        
    }
}