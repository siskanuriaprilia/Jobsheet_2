public class Buku27 {

    String judul, pengarang;
    int halaman, stok, harga;
    int gantiHarga;

    void tampilInformasi()
    {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: "  + pengarang);
        System.out.println("Jumlah halaman : "  + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    void  terjual (int jml)
    {
        if (stok > 0){
            stok -= jml;
            if (stok < 0);
            stok = 0;
        }
        else 
        {
            System.out.println("Stok habis, tidak ada buku yang dapat dijual");
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
}
