/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodepembayaran;

/**
 *
 * @author LENOVO
 */
public class EWallet implements MetodePembayaran {
    @Override
    public double hitungTotal(double jumlahAwal) {
        return jumlahAwal * 0.9; // diskon 10%
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran e-wallet sebesar Rp" + jumlah);
    }
}
