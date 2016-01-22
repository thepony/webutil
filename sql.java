/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author brucecolburn
 */
import java.sql.*;
//import static java.time.Clock.system;

public class sql {
    //String addressNport = "jdbc:mysql://127.0.0.1:3306";
    //String dbName = "gl5";
    //String username = "gl5_user";
    //String password = "!w0rLDh4rl3y!@";
    //sql = "SELECT * FROM answers WHERE query='hi';";
    
    protected ResultSet sql(String IP, String port, String username, String password, String dbName, String sql) throws SQLException {
        // ** Test for Drivers First ** //
        if("".equals(port)) port = "3306"; // -- Makes faster for standard port
        try { Class.forName("com.mysql.jdbc.Driver");}
        catch (ClassNotFoundException e) {
            System.err.println("No JDBC Driver available.");
            return null;
        }
        finally {
            System.out.println("jdbc Driver up and running...");
        }
        // ** Create Connection 'conn' ** //
        Connection conn = null;
        
        try {
		conn = DriverManager.getConnection("jdbc:mysql://" + IP + ":" + port + "/" 
                        + dbName, username, password);
	}
        catch (SQLException e) {
            System.err.println("Connection Failed!");
            return null;
	}
        Statement statement = conn.createStatement();
        ResultSet results = statement.executeQuery(sql);
        //conn.close();
        return results;
    }
}

