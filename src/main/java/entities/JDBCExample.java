package entities;


import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;

/**
 * Created by Andrii on 9/4/2015.
 */
public class JDBCExample {

    public final static String JDBC_DRIVER = "org.postgresql.Driver";
    public final static String DB_URL = "jdbc:postgresql://localhost:5432/firstDB";
    public final static String USER = "postgres";
    public final static String PASSWORD = "234786";



   public static void DataSourceExample() throws NamingException {
       Connection con = null;
       try {
           DataSource source = (DataSource)new InitialContext().lookup("DataSource");
           con = source.getConnection();
       } catch(SQLException e) {
       } catch(NamingException e) {
       } finally {
           if(con != null) {
               try {con.close();}catch(SQLException e) {}
           }
       }
   }
}
