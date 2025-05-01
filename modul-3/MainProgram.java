/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author LENOVO
 */
// File: MainProgram.java
public class MainProgram {
    public static void main(String[] args) {
        // ====== Bagian Mahasiswa ======
        System.out.println("======= Data Mahasiswa =======");
        
        MahasiswaReguler m1 = new MahasiswaReguler("Solikin", "23413", "SI-1");
        MahasiswaReguler m2 = new MahasiswaReguler("Yanto", "477621", "SI-2");
        MahasiswaReguler m3 = new MahasiswaReguler("Tumin", "757518", "SI-3");
        
        System.out.println("\n--- Mahasiswa Reguler ---");
        m1.infoReguler();
        System.out.println();
        m2.infoReguler();
        System.out.println();
        m3.infoReguler();
        
        MahasiswaBeasiswa b1 = new MahasiswaBeasiswa("Sofyan", "24132", "Bidikmisi");
        MahasiswaBeasiswa b2 = new MahasiswaBeasiswa("Yudi", "23125", "LPDP");
        MahasiswaBeasiswa b3 = new MahasiswaBeasiswa("sarip", "22212", "BCA");
        
        System.out.println("\n--- Mahasiswa Beasiswa ---");
        b1.infoBeasiswa();
        System.out.println();   
        b2.infoBeasiswa();
        System.out.println();   
        b3.infoBeasiswa();
        
    }
}