/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking;

/**
 *
 * @author LENOVO
 */
public class Car implements Booking, Insurance {
    @Override
    public void book(String name, int age) {
        if (age < 21) {
            System.out.println("Pemesanan mobil gagal. Usia minimal 21 tahun.");
        } else {
            System.out.println("Mobil berhasil dipesan oleh " + name);
        }
    }

    @Override
    public double calculateCost(int days) {
        return days * 300000 + insuranceFee();
    }

    @Override
    public double insuranceFee() {
        return 50000;
    }
}

