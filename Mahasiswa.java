class DataMahasiswa {
    private String nim;
    private String nama;

    public DataMahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
}

class MenuItem {
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
}

class Pesanan {
    private static int nextNumber = 1;
    private int nomor;
    private DataMahasiswa pemesan;
    private MenuItem menu;

    private int jumlah;

    public Pesanan(DataMahasiswa pemesan, MenuItem menu, int jumlah) {
        this.nomor = nextNumber++;
        this.pemesan = pemesan;
        this.menu = menu;
        this.jumlah = jumlah;
    }

    public boolean dapatDiproses() {
        return jumlah > 0 && menu.isTersedia();
    }

    public int hitungTotal() {
        return menu.getHarga() * jumlah;
    }
}

public class Mahasiswa {
    public static void main(String[] args) {
        DataMahasiswa m1 = new DataMahasiswa("251511029", "Rizky Yanuar Irawan");
        DataMahasiswa m2 = new DataMahasiswa("251511030", "Kareem Nul Mustofa");

        System.out.println("Nama: " + m1.getNama() + ", NIM: " + m1.getNim());
        System.out.println("Nama: " + m2.getNama() + ", NIM: " + m2.getNim());

        // TAHAP 2
        MenuItem nasi = new MenuItem("M01", "Nasi Goreng", 18000);
        MenuItem kopi = new MenuItem("M02", "Kopi Susu", 12000);
        // kopi.tandaiHabis();
        Pesanan p1 = new Pesanan(m1, nasi, 2);
        Pesanan p2 = new Pesanan(m2, kopi, 1);
        System.out.println("P1 dapat diproses: " + p1.dapatDiproses());
        System.out.println("Total P1: " + p1.hitungTotal());
        System.out.println("P2 dapat diproses: " + p2.dapatDiproses());

        System.out.println(nasi.getNama() + " tersedia: " + nasi.isTersedia());
        System.out.println(kopi.getNama() + " tersedia: " + kopi.isTersedia());
    }
}