/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasi;

/**
 *
 * @author LENOVO
 */
public class BukuReferensi implements Reservasi {
    @Override
    public void reservasi(String nama) {
        System.out.println(nama + " mereservasi buku referensi (tidak bisa dipinjam).");
    }
}
