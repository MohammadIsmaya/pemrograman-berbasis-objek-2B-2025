/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author LENOVO
 */
class BukuFiksi {
    private String judul;
    private String penulis;
    private String genre;

    public BukuFiksi(String judul, String penulis, String genre) {
        this.judul = judul;
        this.penulis = penulis;
        this.genre = genre;
    }

    public void infoFiksi() {
        System.out.println("Fiksi - Judul: " + judul + ", Penulis: " + penulis + ", Genre: " + genre);
    }
}
