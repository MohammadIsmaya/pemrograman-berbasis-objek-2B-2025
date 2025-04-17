/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2;

/**
 *
 * @author LENOVO
 */

public class Main {
    public static void main(String[] args) {
        // Buat mata kuliah
        matakuliah mk1 = new matakuliah("MK001", "Algoritma", 3);
        matakuliah mk2 = new matakuliah("MK002", "Pemrograman", 3);
        matakuliah mk3 = new matakuliah("MK003", "Basis Data", 2);
        matakuliah mk4 = new matakuliah("MK004", "Matematika", 2);
        matakuliah mk5 = new matakuliah("MK005", "Bhs.Inggris", 2);
        matakuliah mk6 = new matakuliah("MK006", "PBO", 3);
        matakuliah mk7 = new matakuliah("MK007", "Jaringan", 3);
        matakuliah mk8 = new matakuliah("MK008", "Sistem Operasi", 2);

        matakuliah[] semuaMK = {mk1, mk2, mk3, mk4, mk5, mk6, mk7, mk8};

        // Buat mahasiswa
        Mahasiswa m1 = new Mahasiswa("Rafly", "2312345678", "TI");
        Mahasiswa m2 = new Mahasiswa("Shin tae yong", "2312345679", "TI");
        Mahasiswa m3 = new Mahasiswa("Fahri", "2312345680", "SI");
        Mahasiswa m4 = new Mahasiswa("Yanto", "2312345681", "SI");
        Mahasiswa m5 = new Mahasiswa("Hudin", "2312345682", "TI");
        Mahasiswa m6 = new Mahasiswa("Faisal", "2312345683", "SI");

        Mahasiswa[] mahasiswaList = {m1, m2, m3, m4, m5, m6};

        // Assign 4 mata kuliah ke masing-masing mahasiswa
        for (Mahasiswa m : mahasiswaList) {
            m.tambahmatakuliah(mk1);
            m.tambahmatakuliah(mk2);
            m.tambahmatakuliah(mk3);
            m.tambahmatakuliah(mk4);
        }

        // Buat kampus
        Kampus Kampus = new Kampus("Universitas Trunojoyo Madura ", "Jl. Telang Indah No.1927");

        // Tampilkan data mahasiswa
        for (Mahasiswa m : mahasiswaList) {
            m.tampilkanBiodata(); 
        }

        // Tampilkan info kampus
        Kampus.tampilkanInfoKampus("Universitas Trunojoyo Madura, Jl.Telang Indah", Mahasiswa.getJumlahMahasiswa());
    }
}
