/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class BukuResep {
    private String judul;
    private List<Resep> daftarResep;

    public BukuResep(String judul) {
        this.judul = judul;
        this.daftarResep = new ArrayList<>();
    }

    public void addResep(Resep resep) {
        daftarResep.add(resep);
        System.out.println("Resep berhasil ditambahkan: " + resep.getNama());
    }

    public void deleteResep(String resepName) {
        daftarResep.removeIf(resep -> resep.getNama().equalsIgnoreCase(resepName));
        System.out.println("Resep berhasil dihapus: " + resepName);
    }

    public Resep searchResep(String resepName) {
        for (Resep resep : daftarResep) {
            if (resep.getNama().equalsIgnoreCase(resepName)) {
                return resep;
            }
        }
        System.out.println("Resep tidak ditemukan: " + resepName);
        return null;
    }

    public void listAllRecipes() {
        System.out.println("Daftar Resep di Buku: " + judul);
        for (Resep resep : daftarResep) {
            System.out.println("- " + resep.getNama());
        }
    }
}