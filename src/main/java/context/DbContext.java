package context;
import java.sql.*;

public class DbContext {
    
    private static String serverName = "localhost";
    private static String dbName = "ShopDB";
    private static String portNumber = "1433";  
    private static String userID = "sa";
    private static String password = "sa";
    
    public static Connection getConnection()
    {
        Connection conn=null;
        try{ 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //b2. dinh nghia chuoi ket noi URL
            String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
            //b3.Thiet lap ket noi
            conn = DriverManager.getConnection(url,userID,password);       
        }catch(Exception ex){
            System.out.println("Error:" + ex.toString());
        }
        return conn;
    }
    
    public static void main(String[] args)
    {
        System.out.println("Ket Qua ket noi:" + new DbContext().getConnection());        
    }
}
