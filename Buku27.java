public class Buku27 {
    
    String judul, pengarang;
    int halaman, stok, harga;
    void tampilanInformasi()
    {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: "  + pengarang);
        System.out.println("Jumlah halaman : "  + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml)
    {
        if (stok > 0) 
        {
            stok -= jml;
        } 
        else 
        {
            System.out.println("Stok habis, tidak ada buku yang dapat dijual.");
        }
    }
    void restock(int jml)
    {
        stok += jml;
    }
    void gantiHarga(int hrg)
    {
        harga = hrg;
    }
    int hitungHargaTotal(int jumlahTerjual)
    {
        return harga * jumlahTerjual;
    }
    int hitungDiskon (int hargaTotal)
    {
        int diskon = 0;

        if (hargaTotal > 150000)
        {
            diskon = (int)(hargaTotal * 0.12); // Diskonya adalah 12%
        }
        else if (hargaTotal >= 75000 && hargaTotal <= 150000)
        {
            diskon = (int)(hargaTotal * 0.05); // Diskonya 5%
        }
        // jika harga total adalah kurang dari 75000, diskon tetap 0%
        return diskon;
        
    }
    
    double hitungHargaBayar(double hargaTotal, double diskon)
    {
        return hargaTotal - (hargaTotal * diskon);
    }

    public  Buku27(){
    }
    public Buku27 (String jud, String pg, int hal, int stok, int har)
    {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}