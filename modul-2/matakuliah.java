/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author LENOVO
 */
public class matakuliah {
    private String kode;
    private String nama;
    private int sks;

    public matakuliah(String kode, String nama, int sks) {
        if (!isValidSKS(sks)) {
            throw new IllegalArgumentException("SKS tidak valid. Hanya boleh 2 atau 3.");
        }
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public static boolean isValidSKS(int sks) {
        return sks == 2 || sks == 3; // Mengembalikan true jika SKS sama dengan 2 atau 3, dan false jika tidak.
    }

    public String toString() {
        return kode + " - " + nama + " (" + sks + " SKS)";
    }
}