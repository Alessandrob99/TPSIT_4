/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptriangolo;
import java.util.Scanner;
/**
 *
 * @author studente_2
 */
public class APTriangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int l1, l2, b , h , p;
        float a;
        System.out.println("Inserire misure triangolo : ");
        System.out.println("Lato 1):");
        l1 = input.nextInt();
        System.out.println("Lato 2):");
        l2 = input.nextInt();
        System.out.println("Base :");
        b = input.nextInt();
        System.out.println("Altezza:");
        h = input.nextInt();
        p=l1+l2+b;
        a=(b*h)/2;
        System.out.println("Il perimetro e l'area valgono rispettivamente : ");
        System.out.println(p);
        System.out.println(a);
        // TODO code application logic here
    }
    
}
