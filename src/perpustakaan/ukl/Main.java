/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpustakaan.ukl;
import java.util.*;

class halo extends Hello {
    Petugas pt = new Petugas();
    public void hello() {
        System.out.println("--Selamat Datang Di Perpustakaan-- ");
        System.out.println("");
        System.out.println("Petugas yang sedang berjaga-jaga adalah: ");
        Petugas.Karyawan();
    }
}

public class Main{
    private static int pilihan;
    public static void main(String[] args) {
    
        //Declare object
        halo hl = new halo();
        Siswa sw = new Siswa();
        //Buku bk = new Buku();
        Peminjaman pj = new Peminjaman();
        Petugas pt = new Petugas();

        //Main menu
        hl.hello();
        System.out.println("");
        System.out.println("--MENU PILIHAN PERPUSTAKAAN--");
        System.out.println("1. Pinjam Buku");
        System.out.println("2. Kembalikan Buku");
        System.out.println("3. Beli Buku");
        System.out.println("4. Lihat Buku");
        System.out.println("5. Exit");
        System.out.println("");

        System.out.println("--MASUKKAN PILIHAN ANDA--");
        Scanner input = new Scanner(System.in);
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
            sw.getSiswa();
            System.out.println("");
            pj.pinjambuku();
                break;
            case 2:
            sw.getSiswa();
            System.out.println("");
            pj.tampilBuku();
            pj.kembalikanbuku();
                break;

            case 3:
            sw.getSiswa();
            System.out.println("");
            pj.tampilBuku();
            pj.belibuku();
                break;

            case 4:
            sw.getSiswa();
            System.out.println("");
            pj.lihatbuku();
                break;
            
            case 5:
            System.out.println("--TERIMAKASIH SUDAH MENGGUNAKAN PERPUSTAKAAN--");
                break;
        
            default:
            System.out.println("Harap masukkan kode yang benar");
            main(args);
                break;
        }
    }
}
