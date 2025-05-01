/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;

class Perpustakaan {
    private ArrayList<BukuFiksi> koleksiFiksi;
    private ArrayList<BukuNonFiksi> koleksiNonFiksi;

    public Perpustakaan() {
        koleksiFiksi = new ArrayList<>();
        koleksiNonFiksi = new ArrayList<>();
    }

    public void tambahBukuFiksi(BukuFiksi buku) {
        koleksiFiksi.add(buku);
    }

    public void tambahBukuNonFiksi(BukuNonFiksi buku) {
        koleksiNonFiksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("\n=== Koleksi Buku Fiksi ===");
        if (koleksiFiksi.isEmpty()) {
            System.out.println("Belum ada buku fiksi.");
        } else {
            for (BukuFiksi buku : koleksiFiksi) {
                buku.infoFiksi();
            }
        }

        System.out.println("\n=== Koleksi Buku Non-Fiksi ===");
        if (koleksiNonFiksi.isEmpty()) {
            System.out.println("Belum ada buku non-fiksi.");
        } else {
            for (BukuNonFiksi buku : koleksiNonFiksi) {
                buku.infoNonFiksi();
            }
        }
    }
}
