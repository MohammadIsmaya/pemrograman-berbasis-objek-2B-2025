/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        System.out.println("=== Program Manajemen Buku Perpustakaan ===");

        System.out.print("Masukkan jumlah buku fiksi: ");
        int jumlahFiksi = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        for (int i = 0; i < jumlahFiksi; i++) {
            System.out.println("\nBuku Fiksi ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();
            System.out.print("Genre: ");
            String genre = scanner.nextLine();

            BukuFiksi bukuFiksi = new BukuFiksi(judul, penulis, genre);
            perpustakaan.tambahBukuFiksi(bukuFiksi);
        }

        System.out.print("\nMasukkan jumlah buku non-fiksi: ");
        int jumlahNonFiksi = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        for (int i = 0; i < jumlahNonFiksi; i++) {
            System.out.println("\nBuku Non-Fiksi ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();
            System.out.print("Topik: ");
            String topik = scanner.nextLine();

            BukuNonFiksi bukuNonFiksi = new BukuNonFiksi(judul, penulis, topik);
            perpustakaan.tambahBukuNonFiksi(bukuNonFiksi);
        }

        perpustakaan.tampilkanKoleksi();

        scanner.close();
    }
}