/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author LENOVO
 */
// Subclass MobilSport
public class MobilSport extends Mobil {
    @Override
    public void nyalakan_mesin() {
        System.out.println("Mobil sport dinyalakan dengan suara makjegler!");
    }

    @Override
    public void matikan_mesin() {
        System.out.println("Mobil sport dimatikan dengan halus.");
    }
}

