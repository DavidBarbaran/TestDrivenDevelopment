/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdrivendevelopment;

/**
 *
 * @author Dvid
 */
public class CalcularImpuesto {

    private double ingresoAnual;
    private static final double UIT = 3950;

    public CalcularImpuesto(double ingresoAnual) {
        this.ingresoAnual = ingresoAnual;
    }

    public double calcular() {
        double impuestoRenta = 0;
        if (ingresoAnual < 7 * UIT) {
            impuestoRenta = 0;
        } else if (ingresoAnual >= 7 * UIT && ingresoAnual <= 12 * UIT) {
            impuestoRenta = ingresoAnual * 8/100;
        } else if (ingresoAnual > 12 * UIT && ingresoAnual <= 27 * UIT) {
            impuestoRenta = ingresoAnual * 14/100;
        } else if (ingresoAnual > 27 * UIT && ingresoAnual <= 42 * UIT) {
            impuestoRenta = ingresoAnual * 17/100;
        } else if (ingresoAnual > 42 * UIT && ingresoAnual <= 52 * UIT) {
            impuestoRenta = ingresoAnual * 20/100;
        } else {
            impuestoRenta = ingresoAnual * 30/100;
        }
        return impuestoRenta;
    }
}