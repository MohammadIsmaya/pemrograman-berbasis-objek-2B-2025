package Modul1;

import java.util.ArrayList;

class Hewan {
    String nama;
    String jenis;
    String suara;
    
    // konstruktor default (diperlukan karena kita tidak pakai super())
    public Hewan() {}

    public String bersuara() {
        return nama + " mengeluarkan suara " + suara + ".";
    }
}

// mewarisi class hewan
class Kucing extends Hewan {
    String warna;

    // konstruktor & parameter
    public Kucing(String nama, String warna) {
        this.nama = nama;
        this.jenis = "Kucing";
        this.suara = "Meong";
        this.warna = warna;
    }

    public String info() {
        return nama + " adalah kucing berwarna " + warna + ".";
    }
}

// mewarisi class hewan
class Anjing extends Hewan {
    String ras;

    public Anjing(String nama, String ras) {
        this.nama = nama;
        this.jenis = "Anjing";
        this.suara = "Guk-guk";
        this.ras = ras;
    }

    public String info() {
        return nama + " adalah anjing ras " + ras + ".";
    }
}

class Burung extends Hewan {
    boolean bisaTerbang;

    public Burung(String nama, boolean bisaTerbang) {
        this.nama = nama;
        this.jenis = "Burung";
        this.suara = "Cuit-cuit";
        this.bisaTerbang = bisaTerbang;
    }

    public String info() {
        String kemampuan = bisaTerbang ? "bisa terbang" : "tidak bisa terbang";
        return nama + " adalah burung yang " + kemampuan + ".";
    }
}

// program utama
public class Soal3 {
    public static void main(String[] args) {
        ArrayList<Hewan> hewanList = new ArrayList<>();

        Object[][] dataHewan = {
            {"Yanto", "Hitam", "Kucing"},
            {"Dalang", "Depok", "Anjing"},
            {"Antoni", true, "Burung"}
        };

        for (Object[] data : dataHewan) {
            String nama = (String) data[0];
            String jenis = (String) data[2];

            switch (jenis) {
                case "Kucing" -> hewanList.add(new Kucing(nama, (String) data[1]));
                case "Anjing" -> hewanList.add(new Anjing(nama, (String) data[1]));
                case "Burung" -> hewanList.add(new Burung(nama, (Boolean) data[1]));
            }
        }

        for (Hewan hewan : hewanList) {
            switch (hewan) {
                case Kucing kucing -> System.out.println(kucing.info());
                case Anjing anjing -> System.out.println(anjing.info());
                case Burung burung -> System.out.println(burung.info());
                default -> {
                }
            }

            System.out.println(hewan.bersuara());
            System.out.println();
        }
    }
}