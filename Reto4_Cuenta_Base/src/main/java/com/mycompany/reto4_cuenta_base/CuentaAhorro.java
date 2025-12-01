/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto4_cuenta_base;

/**
 *
 * @author migue
 */
public class CuentaAhorro extends Reto4_Cuenta_Base {
    public CuentaAhorro(double apertura) {
super(Math.max(0.0, apertura));
}
    public void invertir(double porcentaje) {
        double pct = porcentaje > 0 ? porcentaje : 10.0;
        double factor = 1 + (pct / 100.0);
        setMontoActual(getMontoActual() * factor);
}
    public void invertir() {
        invertir(10.0);
    }
}
    

