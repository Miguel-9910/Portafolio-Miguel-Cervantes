/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto4_cuenta_base;

/**
 *
 * @author migue
 */
public class TarjetadeDebito extends Reto4_Cuenta_Base {
    public TarjetadeDebito(double apertura) {
super(Math.max(0.0, apertura));
}

public void retirar(double cantidad) {
    if (cantidad > 0) {
        setMontoActual(getMontoActual() - cantidad);
    }
  }
}
