
package kata5p1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.spi.DirStateFactory.Result;

/**
 *
 * @author javi
 */
public class Kata5p1 {

    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        String urlConection = "jdbc:sqlite:kata5.db"; // directorio de la base de datos
        Connection connection = DriverManager.getConnection(urlConection);
        
        Statement statement = (Statement) connection.createStatement();
        String query = "Select * from People";
        ResultSet rs = statement.executeQuery(query);
        
        while(rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
        }
        
        
        // creacion de una tabla en una Base de Datos ...
    }
    
}
