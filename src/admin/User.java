/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin;

/**
 *
 * @author ASUS
 */
public class User {

    protected String nama;
    protected String password;
    protected String role;

    public User(String nama, String password, String role) throws ValidasiInputException {
        if (nama == null || nama.isEmpty()) {
            throw new ValidasiInputException("Nama tidak boleh kosong!");
        }
        if (password == null || password.isEmpty()) {
            throw new ValidasiInputException("Password tidak boleh kosong!");
        }
        this.nama = nama;
        this.password = password;
        this.role = role;
    }

    public void lihatResep(Resep resep) {
        System.out.println("Resep dilihat oleh: " + nama);
        resep.displayResep();
    }
}
