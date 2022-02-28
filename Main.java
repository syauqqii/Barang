public class Main{
    public static void main (String[]args){
        // Beri new line untuk spasi
        System.out.println();
        
        // Area Barang.java (input manual [tidak dengan parameter] b1)
        // Pastikan ada file "Barang.java" di dalam folder yang sama di main.java
        Barang b1 = new Barang ();

        b1.namaBarang = "Corsair 2 GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 10;
        
        b1.tambahStok (1);
        b1.kurangiStok (3);
        b1.tampilkanBarang ();

        int hargaTotal = b1.hitungHargaTotal (4);
        
        // Beri new line untuk spasi
        System.out.println();
        
        // Area Barang1.java (input manual [dengan parameter] b2)
        // Pastikan ada file "Barang1.java" di dalam folder yang sama di main.java
        Barang1 b2 = new Barang1("Logitech", "Wireless mouse", 25, 150000);
        b2.tampilkanBarang();
  }
}
