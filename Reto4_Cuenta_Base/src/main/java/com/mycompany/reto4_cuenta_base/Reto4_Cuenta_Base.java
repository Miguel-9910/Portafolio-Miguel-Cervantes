/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reto4_cuenta_base;

/**
 *
 * @author migue
 */
public class Reto4_Cuenta_Base {
    private double montoActual;
    
    public Reto4_Cuenta_Base(double apertura) {
        this.montoActual = apertura;
    }
    
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.montoActual += cantidad;
        }
    }
    
    public double getMontoActual() {
        return this.montoActual;
    }
    
    protected void setMontoActual(double monto) {
        this.montoActual = monto;
    }

}
