/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin;

/**
 *
 * @author ASUS
 */
public class UserPremium extends User {

    public UserPremium(String nama, String password, String role) throws ValidasiInputException {
        super(nama, password, "premium");
    }

    public void tambahResep(Tubes buku, Resep resep) {
        buku.addResep(resep);
    }

    public void editResep(Resep resep, String namaBaru) {
        System.out.println("Mengubah nama resep dari " + resep.getNama() + " menjadi " + namaBaru);
    }

    void tambahResep(BukuResep bukuResep, Resep nasiGoreng) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void deleteResep(BukuResep bukuResep, String nasi_Goreng_Spesial) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
