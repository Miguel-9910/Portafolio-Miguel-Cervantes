/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto4_cuenta_base;

/**
 *
 * @author migue
 */
public class TarjetadeCredito extends Reto4_Cuenta_Base {
    public TarjetadeCredito(double apertura) {
        super(-Math.abs(apertura));
}
    public void sumaInteres(double porcentaje) {
        double pct = porcentaje > 0 ? porcentaje : 15.0;
        double factor = 1 + (pct / 100.0);
        setMontoActual(getMontoActual() * factor);
    }
    public void sumaInteres() {
        sumaInteres(15.0);
    }
}