/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan.ukl;
import java.util.*;
import java.io.*;

public class Siswa {
    static Scanner input = new Scanner(System.in);

    //ArrayList declare
    ArrayList<String>namaSiswa = new ArrayList<>();
    ArrayList<String>alamatSiswa = new ArrayList<>();
    ArrayList<String>telefonSiswa = new ArrayList<>();
    ArrayList<Boolean>statusSiswa = new ArrayList<>();
    ArrayList<Integer>idSiswa = new ArrayList<>();

    public Siswa(){

        //Siswa 1
        this.namaSiswa.add("Abizar");
        this.alamatSiswa.add("Ngawi");
        this.telefonSiswa.add("08321556586");
        this.idSiswa.add(1038);
        this.statusSiswa.add(true);

        //Siswa 2
        this.namaSiswa.add("Abdul");
        this.alamatSiswa.add("Jombang");
        this.telefonSiswa.add("08321593638");
        this.idSiswa.add(2738);
        this.statusSiswa.add(false);

        //Siswa 3
        this.namaSiswa.add("Nabil");
        this.alamatSiswa.add("Malang");
        this.telefonSiswa.add("0832150283");
        this.idSiswa.add(1937);
        this.statusSiswa.add(true);

        //Siswa 4
        this.namaSiswa.add("Nur");
        this.alamatSiswa.add("Sidoarjo");
        this.telefonSiswa.add("08329373920");
        this.idSiswa.add(7352);
        this.statusSiswa.add(false);       
    }

    public void getSiswa(){
        System.out.print("Masukkan ID anda: ");
        int id = input.nextInt();
        //Search ID
        for (int i = 0; i < idSiswa.size(); i++) {
            if (id == idSiswa.get(i)) {
                System.out.println("Nama: " + namaSiswa.get(i));
                System.out.println("Alamat: " + alamatSiswa.get(i));
                System.out.println("Telepon: " + telefonSiswa.get(i));
            }else{
                System.out.println("ID tidak ditemukan");
                break;
            }
        }
    }
}
