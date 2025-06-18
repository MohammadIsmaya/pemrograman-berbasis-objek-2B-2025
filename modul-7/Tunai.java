/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodepembayaran;

/**
 *
 * @author LENOVO
 */
public class Tunai implements MetodePembayaran {
    @Override
    public double hitungTotal(double jumlahAwal) {
        return jumlahAwal - 5000; // potongan tunai
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran tunai sebesar Rp" + jumlah);
    }
}
