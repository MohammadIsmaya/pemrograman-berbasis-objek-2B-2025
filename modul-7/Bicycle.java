/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking;

/**
 *
 * @author LENOVO
 */
public class Bicycle implements Booking {
    @Override
    public void book(String name, int age) {
        System.out.println("Sepeda berhasil dipesan oleh " + name);
    }

    @Override
    public double calculateCost(int days) {
        return days * 50000;
    }
}
