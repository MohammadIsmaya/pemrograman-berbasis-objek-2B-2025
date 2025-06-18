/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodepembayaran;

/**
 *
 * @author LENOVO
 */
public class MainPembayaran {
    public static void main(String[] args) {
        double total = 100000;

        MetodePembayaran pembayaran = new EWallet(); // bisa ganti Tunai atau KartuKredit
        double totalAkhir = pembayaran.hitungTotal(total);
        pembayaran.prosesPembayaran(totalAkhir);
    }
}

