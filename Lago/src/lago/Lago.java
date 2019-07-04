/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lago;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bparr
 */
public class Lago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double j, k;

        double resultado;
        ArrayList<Double> a = new ArrayList();
        Scanner sc = new Scanner(System.in);
        do {
            j = sc.nextDouble();
            k = sc.nextDouble();
            k = k / 100;
            resultado = (Math.pow(j / 2, 2) - Math.pow(k, 2)) / (2 * k);
            a.add(resultado);
        } while (j != 0 && k != 0);
        for (int i = 0; i < a.size()-1; i++) {
            System.out.println(a.get(i));
        }
    }

}
