// Inisialisai Class Barang1
public class Barang1{
    // Deklarasi namaBarang & jenisBarang ber "tipe data" String
    String namaBarang, jenisBarang;

    // Deklarasi stokBarang & hargaSatuan ber "tipe data" integer (int)
    int stokBarang, hargaSatuan;
    
    // Beri Konstuctor Barang1 menerima inputan parameter nm & jn ber "tipe data" String, st & hs ber "tipe data" integer (int)
    Barang1(String nm, String jn, int st, int hs){
        // Set namaBarang = nm (dari input parameter)
        namaBarang  = nm;
        // Set jenisBarang = jn (dari input parameter)
        jenisBarang = jn;
        // Set stokBarang = st (dari input parameter)
        stokBarang  = st;
        // Set hargaSatuan = hs (dari input parameter)
        hargaSatuan = hs;
    }
    
    // Deklarasi function tampilkanBarang() untuk menampilkan barang (nama, jenis, stok, harga satuan)
    void tampilkanBarang(){
        System.out.println(" [#] Nama         = " + namaBarang);
        System.out.println(" [#] Jenis        = " + jenisBarang);
        System.out.println(" [#] Stok         = " + stokBarang);
        System.out.println(" [#] Harga Satuan = " + hargaSatuan);
    }
    
    // Deklarasi function tambahStok() untuk menambah stok barang (rumus : stok = stok_sekarang + jumlah_stok_ditambahkan)
    void tambahStok(int n){
        stokBarang = stokBarang + n;
    }
    
    // Deklarasi function kurangiStok() untuk mengurangi stok barang (rumus : stok = stok_sekarang - jumlah_stok_yang_di_kurangi)
    void kurangiStok(int n){
        stokBarang = stokBarang - n;
    }
    
    // Deklarasi function hitungHargaTotal() untuk menghitung total harga barang (rumus : total_harga = jumlah_barang x harga_Satuan_barang)
    int hitungHargaTotal(int jumlah){
        return jumlah * hargaSatuan;
    }
}
