/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class Resep {
    private String nama;
    private String kategori;
    private int porsi;
    private int durasi;
    private List<String> bahanBahan;
    private List<String> langkahLangkah;

    public Resep(String nama, String kategori, int porsi, int durasi, List<String> bahanBahan, List<String> langkahLangkah) {
        this.nama = nama;
        this.kategori = kategori;
        this.porsi = porsi;
        this.durasi = durasi;
        this.bahanBahan = bahanBahan;
        this.langkahLangkah = langkahLangkah;
    }

    public void displayRecipe() {
        System.out.println("Nama Resep: " + nama);
        System.out.println("Kategori: " + kategori);
        System.out.println("Porsi: " + porsi);
        System.out.println("Durasi: " + durasi + " menit");
        System.out.println("Bahan-Bahan: " + String.join(", ", bahanBahan));
        System.out.println("Langkah-Langkah:");
        for (int i = 0; i < langkahLangkah.size(); i++) {
            System.out.println((i + 1) + ". " + langkahLangkah.get(i));
        }
    }

    public String getNama() {
        return nama;
    }

    void displayResep() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}