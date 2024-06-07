package ProyectoF;
import java.sql.*;
import javax.swing.*;

public class ConexionBD {
    Connection conect = null;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://54.164.79.56:3306/proyecto","GUEST01","SOYINVITADO01");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en la conexion" + e);
        }
        return conect;
    }
}
