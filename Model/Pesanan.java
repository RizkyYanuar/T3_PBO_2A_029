package Model;

public class Pesanan {
    private int nextNumber = 1;
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
        if (jumlah > 0 && menu.isTersedia() == true) {
            return true;
        }
        return false;
    }

    public int hitungTotal() {
        return menu.getHarga() * jumlah;
    }

    public String getNim() {
        return this.pemesan.getNim();
    }

    public String getNama() {
        return this.pemesan.getNama();
    }

    public int getNomor() {
        return this.nomor;
    }
}

