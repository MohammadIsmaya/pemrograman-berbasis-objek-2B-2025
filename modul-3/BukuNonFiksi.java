/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author LENOVO
 */
class BukuNonFiksi {
    private String judul;
    private String penulis;
    private String bidang;

    public BukuNonFiksi(String judul, String penulis, String bidang) {
        this.judul = judul;
        this.penulis = penulis;
        this.bidang = bidang;
    }

    public void infoNonFiksi() {
        System.out.println("Non-Fiksi - Judul: " + judul + ", Penulis: " + penulis + ", Bidang: " + bidang);
    }
}
