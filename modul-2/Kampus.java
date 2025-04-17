/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author LENOVO
 */
/*gawe menyimpan nama kampus*/
public class Kampus { 
    private String nama;
    private String alamat;

    public static int totalMahasiswa; /*gawe nyimpan total mhs*/

    public Kampus(String nama, String alamat) { /*kontruktor gawe objek baru*/
        if (!isValidNama(nama)) {
            throw new IllegalArgumentException("Nama kampus tidak boleh mengandung angka.");
        }
        this.nama = nama;
        this.alamat = alamat;
        totalMahasiswa = Mahasiswa.getJumlahMahasiswa();
    }

    public static boolean isValidNama(String nama) { //gewe memeriksa apakah nama kampus vlid
        return !nama.matches(".*\\d.*"); // Tidak boleh mengandung angka
    }

    public static void tampilkanInfoKampus(String nama, int totalMahasiswa) { //menampilkan tntang kampus
        System.out.println("Kampus: " + nama);
        System.out.println("Jumlah Mahasiswa: " + totalMahasiswa);
        System.out.println("Validasi Nama Kampus: " + (isValidNama(nama) ? "Valid" : "Tidak Valid"));
    }
}
