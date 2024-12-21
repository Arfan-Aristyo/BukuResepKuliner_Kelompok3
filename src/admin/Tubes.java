/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package admin;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class Tubes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat Buku Resep
        BukuResep bukuResep = new BukuResep("Koleksi Resep Keluarga");

        // Membuat resep
        Resep nasiGoreng = new Resep(
                "Nasi Goreng Spesial", "Makanan Utama", 2, 30,
                Arrays.asList("Nasi", "Kecap Manis", "Ayam", "Telur", "Bawang Merah", "Bawang Putih"),
                Arrays.asList("Panaskan minyak", "Tumis bumbu", "Masukkan nasi", "Tambahkan ayam dan telur", "Sajikan")
        );

        Resep esTeh = new Resep(
                "Es Teh Manis", "Minuman", 1, 5,
                Arrays.asList("Teh", "Gula", "Es Batu"),
                Arrays.asList("Seduh teh", "Tambahkan gula", "Masukkan es batu", "Sajikan")
        );

        // User Premium menambahkan resep
        bukuResep.listAllRecipes();
    }

    void addResep(Resep resep) {
    }

    Resep searchResep(String resepName) {
        return null;
    }
}
