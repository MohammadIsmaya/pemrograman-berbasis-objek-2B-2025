/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking;

/**
 *
 * @author LENOVO
 */
public class Motorcycle implements Booking {
    @Override
    public void book(String name, int age) {
        if (age < 18) {
            System.out.println("Pemesanan motor gagal. Usia minimal 18 tahun.");
        } else {
            System.out.println("Motor berhasil dipesan oleh " + name);
        }
    }

    @Override
    public double calculateCost(int days) {
        return days * 100000;
    }
}
