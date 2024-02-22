public class BukuMain27 {

    public static void main(String[] args) 
    {

        Buku27 bk1 = new Buku27();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilanInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilanInformasi();

        Buku27 bk2 = new Buku27 ("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilanInformasi();

        Buku27 bksiskanuriaprilia = new Buku27 ("Esok Lebih Baik", "Abdullah Al-Maghults", 127, 20, 70000);
        bksiskanuriaprilia.terjual(7);
        bksiskanuriaprilia.tampilanInformasi();
 
        System.out.println("total harga: Rp"+bksiskanuriaprilia.hitungHargaTotal(7));
        System.out.println("Total diskon: Rp"+bksiskanuriaprilia.hitungDiskon(490000));
        System.out.println("Total harga yang harus dibayar: Rp"+bksiskanuriaprilia.hitungHargaBayar(490000, 0.12));
    }   
}
