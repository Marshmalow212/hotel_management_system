
package HMS;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;


public class dbconnection {
    
    dbconnection(){}
    
    private static ResultSet rs;
    private static Connection con;
    
    public static Connection getConnection(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/hmsdb_erfan","root","");
            System.out.println("MySQL Connection established");
          
            
        } catch (SQLException ex) {
            Logger.getLogger(dbconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
        
    }
    
    
    public static ResultSet getresult(String sql){
        
        getConnection();
        try {           
            Statement ps = con.createStatement();
            rs = ps.executeQuery(sql);
            
            System.out.println("Resultset is ready!");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(dbconnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection Failed!");
        }
      
        return rs;
        
    }
    
    public static void getqueryupdate(String sql){
        try {
            getConnection();
            
            Statement ps = con.createStatement();        
            ps.executeUpdate(sql);
            
       
            
        } catch (SQLException ex) {
            Logger.getLogger(dbconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static String res;
    public static String getsingledata(String sql){
        try {
            getConnection();
            Statement ps = con.createStatement();
            
            res = String.valueOf(ps.executeQuery(sql));
        } catch (SQLException ex) {
            Logger.getLogger(dbconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
//    public static void main(String[] args) throws SQLException {
//        getConnection();
//        
//        ResultSet grs = getresult("select * from admin");
//        String[] data = {"N","E","P","A","P"};
//        while(grs.next()){
//            data[0] = grs.getString("Name");
//            data[1] = grs.getString("Email");
//            data[2] = grs.getString("Password");
//            data[3] = grs.getString("Address");
//            data[4] = grs.getString("Phone");          
//        System.out.println(data[0]+"\n"+data[1]+"\n"+data[2]+"\n"+data[3]+"\n"+data[4]);
//        }
//        
//    }
  
}
