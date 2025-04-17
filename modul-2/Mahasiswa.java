/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author LENOVO
 */
    import java.util.ArrayList;

    public class Mahasiswa {
        private String nama; //menyimpan nma mhs tapi bersifat privat
        private String nim;
        private String prodi;
        private ArrayList<matakuliah> matakuliah = new ArrayList<>();

        private static int jumlahMahasiswa = 0; //atribut gawe nyimpan total mhs

        public Mahasiswa(String nama, String nim, String prodi) {
            if (!isValidNIM(nim)) { //gawe ngecek nim e valid apa ngga
                throw new IllegalArgumentException("NIM tidak valid (harus mulai dengan '23' dan 10 digit)");
            }
            this.nama = nama;
            this.nim = nim;
            this.prodi = prodi;
            jumlahMahasiswa++;
        }

        public void tambahmatakuliah(matakuliah mk) { //untk menambahkan metod ke objek mhs
            matakuliah.add(mk);
        }

        public void tampilkanBiodata() { //metod untuk menampilkan biodata mhs
            System.out.println("Nama       : " + nama);
            System.out.println("NIM        : " + nim);
            System.out.println("Prodi      : " + prodi);
            System.out.println("Mata Kuliah:");
            for (matakuliah mk : matakuliah) {
                System.out.println("  - " + mk.toString());
            }
            System.out.println();
        }

        public static boolean isValidNIM(String nim) {
            return nim.startsWith("23") && nim.length() == 10;
        }

        public static int getJumlahMahasiswa() {
            return jumlahMahasiswa;
        }
    }