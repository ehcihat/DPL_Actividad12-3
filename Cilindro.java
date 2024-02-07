/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cilindro;

import javax.swing.JOptionPane;
/**
 * Creamos atributos de la clase.
 * @author jumia
 */
public class Cilindro {
    private double radio;
    private double altura;

    /**
     * Constructor de la clase.
     * @param radio el radio.
     * @param altura la altura.
     */
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }
/**
 * Obtenenos el valor del radio.
 * @return Nos devuelve el Radio.
 */
    public double getRadio() {
        return radio;
    }
/**
 * Le asignamos el valor al Radio.
 * @param radio Le asignamos el Radio.
 */
    public void setRadio(double radio) {
        this.radio = radio;
    }
/**
 * Obtenenos el valor de la altura.
 * @return Nos devuelve la altura.
 */
    public double getAltura() {
        return altura;
    }
/**
 * Le asignamos el valo a la altura.
 * @param altura Le asignamos la altura.
 */
    public void setAltura(double altura) {
        this.altura = altura;
    }
/**
 * Nos calcula el area del Cilindro.
 * @return Nos devueelve la Areaa de la base Cilindro.
 */
    public double calcularArea() {
        return 2 * Math.PI * radio * (radio + altura);
    }
/**
 * Nos calcula el volumen del cilindro.
 * @return Nos calcula el volumne total del cilindro.
 */
    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }
/**
 * Aqui creamos el objeto.
 * @param num Es un contador.
 * @return Devolvemos el Objeto con sus atributos.
 */
    public static Cilindro crearCilindro(int num) {
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del cilindro: " + num));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del cilindro: "+ num));
        return new Cilindro(radio, altura);
    }
/**
 * Es un metodo para mostrar un mensaje.
 * @param valor es la cadena pasada desde la llamadada.
 */
     public static void imprimirValor(String valor) {
        JOptionPane.showMessageDialog(null, valor);
    }
     /**
      * Aqui tenemos nuestro main
      * @param args es una cosa Ejecutamos el codigo...
      */
    public static void main(String[] args) {
        Cilindro cilindro1 = crearCilindro(1);
        Cilindro cilindro2 = crearCilindro(2);
        Cilindro cilindro3 = crearCilindro(3);

        double volumen1 = cilindro1.calcularVolumen();
        double volumen2 = cilindro2.calcularVolumen();
        double volumen3 = cilindro3.calcularVolumen();

        if ((volumen1 < volumen2) && (volumen1 < volumen3)) {
            imprimirValor("El cilindro 1 es el menor");
        } else if ((volumen2 < volumen1) && (volumen2 < volumen3)) {
            imprimirValor("El cilindro 2 es el menor");
        } else {
            imprimirValor("El cilindro 3 es el menor");
        }
        System.out.println("El volumen del cilindro 1 es: " + volumen1);
        System.out.println("El volumen del cilindro 2 es: " + volumen2);
        System.out.println("El volumen del cilindro 3 es: " + volumen3);
        System.out.println("El Ã¡rea del cilindro 1 es: " + cilindro1.calcularArea());
        System.out.println("El Ã¡rea del cilindro 2 es: " + cilindro2.calcularArea());
        System.out.println("El Ã¡rea del cilindro 3 es: " + cilindro3.calcularArea());
    }
}