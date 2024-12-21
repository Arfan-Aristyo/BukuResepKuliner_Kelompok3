/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin;

/**
 *
 * @author ASUS
 */
public class FreeUser extends User{
     public FreeUser(String nama, String password, String role) throws ValidasiInputException {
        super(nama, password, "free");
    }

    public void cariResep(Tubes buku, String resepName) {
        Resep resep = buku.searchResep(resepName);
        if (resep != null) {
            lihatResep(resep);
        }
    }

    void cariResep(BukuResep bukuResep, String es_Teh_Manis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getUsername() {
        return nama;
    }

    String getPassword() {
        return password;
    }
}