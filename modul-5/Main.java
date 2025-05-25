/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

/**
 *
 * @author LENOVO
 */

public class Main {
    public static void main(String[] args) {
        Joko joko = new Joko();
        Beni beni = new Beni();
        Fani fani = new Fani();
        Jani jani = new Jani();

        joko.berbicara();
        joko.bekerja();
        joko.makan();

        System.out.println("--------------------");

        beni.berbicara();
        beni.bekerja();
        beni.makan();

        System.out.println("--------------------");

        fani.berbicara();
        fani.bekerja();
        fani.makan();

        System.out.println("--------------------");

        jani.berbicara();
        jani.bekerja();
        jani.makan();
    }
}

