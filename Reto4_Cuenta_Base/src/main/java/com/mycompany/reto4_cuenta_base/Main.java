/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto4_cuenta_base;

/**
 *
 * @author migue
 */
    public class Main {
public static void main(String[] args) {
    TarjetadeCredito tc = new TarjetadeCredito(1000);
    tc.sumaInteres();
    tc.depositar(200);
    System.out.println("Deuda crédito: " + tc.getMontoActual());
    
    TarjetadeDebito td = new TarjetadeDebito(500);
    td.retirar(100);
    System.out.println("Saldo débito: " + td.getMontoActual());
    CuentaAhorro ca = new CuentaAhorro(1000);
    ca.invertir();
    System.out.println("Saldo ahorro: " + ca.getMontoActual());
  }
}