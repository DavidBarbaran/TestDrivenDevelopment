/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdrivendevelopment;

import java.util.Scanner;

public class TestDrivenDevelopment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su sueldo anual:");
        double sueldoAnual = Double.parseDouble(scanner.nextLine());
        CalcularImpuesto calcularImpuesto = new CalcularImpuesto(sueldoAnual);
        System.out.println("Su impuesto a la renta es: " +  calcularImpuesto.calcular());
    }
}