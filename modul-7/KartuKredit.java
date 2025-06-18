/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodepembayaran;

/**
 *
 * @author LENOVO
 */
public class KartuKredit implements MetodePembayaran {
    @Override
    public double hitungTotal(double jumlahAwal) {
        return jumlahAwal + 0.03 * jumlahAwal; // biaya tambahan 3%
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran kartu kredit sebesar Rp" + jumlah);
    }
}
