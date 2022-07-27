/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan.ukl;
import java.util.*;
import java.io.*;

public class Petugas {  
    public static void Karyawan() {
        
        //ArrayList nama petugas
        ArrayList<String>namaPetugas = new ArrayList<String>();
        namaPetugas.add("Asep");
        namaPetugas.add("Budi");
        namaPetugas.add("Wahyu");
        namaPetugas.add("Adi");

        //Arraylist alamat karyawan
        ArrayList<String>alamatPetugas = new ArrayList<String>();
        alamatPetugas.add("Jl.Kaliresik");
        alamatPetugas.add("Jl.Kalirusuh");
        alamatPetugas.add("Jl.Cibaduyut 2");
        alamatPetugas.add("Jl.Ikan Piranha");

        //Arraylist telefon karyawan
        ArrayList<String>telefonPetugas = new ArrayList<String>();
        telefonPetugas.add("0817353829938");
        telefonPetugas.add("0812325259935");
        telefonPetugas.add("0819899897236");
        telefonPetugas.add("081235252525");
        
        //Menampilkan data karayawan
        System.out.println("Nama Petugas: "+namaPetugas.get(0));
        System.out.println("Alamat: "+alamatPetugas.get(0));
        System.out.println("Telefon: "+telefonPetugas.get(0));
    }
}