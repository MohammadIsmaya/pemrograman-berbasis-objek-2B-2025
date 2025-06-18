/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasi;

/**
 *
 * @author LENOVO
 */
public class BukuFiksi implements Peminjaman, Reservasi {
    @Override
    public void pinjam(String nama) {
        System.out.println(nama + " meminjam buku fiksi.");
    }

    @Override
    public void reservasi(String nama) {
        System.out.println(nama + " mereservasi buku fiksi.");
    }
}
