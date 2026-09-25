package Model;

public class MenuItem {
    private String kode;
    private String nama;
    private int harga;
    private Boolean tersedia;

    public MenuItem(String kode, String nama, int harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.tersedia = true;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(Boolean tersedia) {
        this.tersedia = tersedia;
    }

    public void tandaiHabis() {
        this.tersedia = false;
    }
}

