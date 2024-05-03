package biblioteca;

import java.sql.*;

public class Conexion {
    static String url = "jdbc:mysql://localhost:3306/biblioteca";
    static String user = "root";
    static String password = "";
    
    public static Connection establecerConexion(){
        Connection conector = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conector = DriverManager.getConnection(url, user, password);
            System.out.println("Se ha conecctado");
        } catch (Exception e) {
            System.err.println(e);
        }
        return conector;
    }
}
