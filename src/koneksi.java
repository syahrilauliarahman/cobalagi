
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syahril
 */
public class koneksi {
    Connection con;
    public Connection getConnection(){
        try{
             con = DriverManager.getConnection("jdbc:mysql://localhost/coba","root","");
             JOptionPane.showMessageDialog(null, "Berhasil Koneksi");
        }
        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null,"Gagal Koneksi");
        }
        return con;
    }
    
    
}
