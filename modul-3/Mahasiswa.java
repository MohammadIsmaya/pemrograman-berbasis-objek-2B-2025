/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    String nama;
    String nim;
    
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    
    public void infoMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
