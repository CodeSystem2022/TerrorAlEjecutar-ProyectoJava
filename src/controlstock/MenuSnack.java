package controlstock;

//-----------------------
// SUBPROCESO MENU SNACKS
//-----------------------

public class MenuSnack {

    public static void menuSnack(double[] Ssnack, int valorSNK[], String[] Snack) {
        int i;
        // Mostramos todo el menú de snacks y la cantidad de stock disponible.
        System.out.println("---------------------------------------");        
        for (i = 0; i <= valorSNK[0]; i++){
            System.out.println("El stock de "+ Snack[i]+ "es de: "+ Ssnack[i]+ " KG.");
            System.out.println("---------------------------------------");
        }
        
    }

   
}