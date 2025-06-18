/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservasi;

/**
 *
 * @author LENOVO
 */
public class MainPerpustakaan {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI PERPUSTAKAAN ===");

        String nama1 = "Andi";
        String nama2 = "Budi";
        String nama3 = "Citra";

        // Simulasi 1: Andi meminjam dan mereservasi buku fiksi
        System.out.println("\n[Simulasi 1 - Buku Fiksi oleh Andi]");
        BukuFiksi bukuFiksi1 = new BukuFiksi();
        bukuFiksi1.pinjam(nama1);
        bukuFiksi1.reservasi(nama1);

        // Simulasi 2: Budi mencoba meminjam dan mereservasi buku referensi
        System.out.println("\n[Simulasi 2 - Buku Referensi oleh Budi]");
        BukuReferensi bukuReferensi = new BukuReferensi();
        System.out.println("Buku referensi tidak dapat dipinjam.");
        bukuReferensi.reservasi(nama2);

        // Simulasi 3: Citra hanya meminjam buku fiksi
        System.out.println("\n[Simulasi 3 - Peminjaman Buku Fiksi oleh Citra]");
        BukuFiksi bukuFiksi2 = new BukuFiksi();
        bukuFiksi2.pinjam(nama3);
    }
}

