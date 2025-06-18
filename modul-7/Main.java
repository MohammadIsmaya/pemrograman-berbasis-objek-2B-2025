/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package booking;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Booking car = new Car();
        car.book("Andi", 25);
        System.out.println("Biaya sewa mobil: Rp" + car.calculateCost(2));

        Booking motor = new Motorcycle();
        motor.book("Budi", 17);
        System.out.println("Biaya sewa motor: Rp" + motor.calculateCost(3));

        Booking bike = new Bicycle();
        bike.book("Citra", 15);
        System.out.println("Biaya sewa sepeda: Rp" + bike.calculateCost(1));
    }
}
