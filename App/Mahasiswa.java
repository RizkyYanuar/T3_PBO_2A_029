package App;
import Model.DataMahasiswa;
import Model.MenuItem;
import Model.Pesanan;
public class Mahasiswa {
    public static void main(String[] args) {
        DataMahasiswa m1 = new DataMahasiswa("251511029", "Rizky Yanuar Irawan");
        DataMahasiswa m2 = new DataMahasiswa("251511030", "Kareem Nul Mustofa");
        DataMahasiswa m3 = new DataMahasiswa("251511031", "Aduh Mati Lampu");

        System.out.println("Nama: " + m1.getNama() + ", NIM: " + m1.getNim());
        System.out.println("Nama: " + m2.getNama() + ", NIM: " + m2.getNim());

        // TAHAP 2
        MenuItem nasi = new MenuItem("M01", "Nasi Goreng", 18000);
        MenuItem kopi = new MenuItem("M02", "Kopi Susu", 12000);
        MenuItem listrik = new MenuItem("M03", "Listrik", 50000);

        Pesanan p1 = new Pesanan(m1, nasi, 2);
        Pesanan p2 = new Pesanan(m2, kopi, 1);
        Pesanan p3 = new Pesanan(m3, listrik, 1);

        System.out.println("P1 dapat diproses: " + p1.dapatDiproses());
        System.out.println("Total P1: " + p1.hitungTotal());
        System.out.println("P2 dapat diproses: " + p2.dapatDiproses());

        System.out.println(nasi.getNama() + " tersedia: " + nasi.isTersedia());
        System.out.println(kopi.getNama() + " tersedia: " + kopi.isTersedia());
        System.out.println(kopi.getNama() + " tersedia: " + kopi.isTersedia());
        

        System.out.println("Pemesan Pertama: " + p1.getNama());
        System.out.println("Pemesan Kedua: " + p2.getNama());
        System.out.println("Nomor pesanan pertama: " + p1.getNomor());
        System.out.println("Nomor pesanan kedua: " + p2.getNomor());
        System.out.println("Nomor pesanan ketiga: " + p3.getNomor());
        System.out.println("Jumlah pesanan dibuat: " + Pesanan.getJumlahPesananDibuat()); 

    }
}