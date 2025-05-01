/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author LENOVO
 */
public class MahasiswaReguler extends Mahasiswa {
    private String kelas;
    
    public MahasiswaReguler(String nama, String nim, String kelas) {
        super(nama, nim);
        this.kelas = kelas;
    }
    
    public void infoReguler() {
        infoMahasiswa();
        System.out.println("Kelas: " + kelas);
    }
}
