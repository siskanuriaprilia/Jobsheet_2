public class Buku27 {
    
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilanInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: "  + pengarang);
        System.out.println("Jumlah halaman : "  + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    void terjual (int jml){
        stok -= jml;

    }
    void restock(int jml);{
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    } 
}
