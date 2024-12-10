/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    private Connection koneksi;
    
    public Connection connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
        }   catch (ClassNotFoundException ex){
            System.out.println ("Gagal Koneksi"+ex);
        }

        String url ="jdbc:mysql://localhost:3306/utmj_inventory";
        try {
            koneksi = DriverManager.getConnection(url,"plsql","plsql");
            System.out.println("Berhasil Koneksi Database");
        }   catch (SQLException ex){
            System.out.println("Gagal Koneksi Database"+ex);
        }
        return koneksi;
    }
}
