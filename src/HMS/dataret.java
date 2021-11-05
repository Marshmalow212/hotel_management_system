package HMS;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class dataret extends dashboard {
    
    dataret(){}
    
    private static ResultSet sdata;
    
    //JTable tcn = new JTable(dashrecordtable);       
    
    private static DefaultTableModel mr;
    public static DefaultTableModel getinforecord(String[] cn,String sql){
        
        try {
//            String sql = "select * from cust_info join record where cust_info.id = record.customer_id";
            
            ResultSet grs = dbconnection.getresult(sql);
            mr = new DefaultTableModel(cn,0);
            while(grs.next()){
                
                String a = grs.getString("Name");
                String b = grs.getString("Address");
                String d = grs.getString("Phone");
                String c = grs.getString("NID");
                String e = grs.getDate("in_date").toString();
                String f = grs.getDate("out_date").toString();
                String g = String.valueOf(grs.getInt("service_id"));
                String h = grs.getString("room_no");
                String p = String.valueOf(grs.getInt("payment"));
              
                
                String[] data = {a,b,c,d,e,f,g,h,p};
                
                mr.addRow(data);
                //        System.out.println(a + b + c + d + e + f + g + h + p);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(dataret.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mr;
    }
    
    public static DefaultTableModel getoutrecord(String[] cn,String sql){
        
        try {
//            String sql = "select * from cust_info join record where cust_info.id = record.customer_id";
            
            ResultSet grs = dbconnection.getresult(sql);
            mr = new DefaultTableModel(cn,0);
            while(grs.next()){
                String id = String.valueOf(grs.getInt("record.ID"));
                String a = grs.getString("Name");
                String b = grs.getString("Address");
                String d = grs.getString("Phone");
                String c = grs.getString("NID");
                String e = grs.getDate("in_date").toString();
                String f = grs.getDate("out_date").toString();
                String g = String.valueOf(grs.getInt("service_id"));
                String h = grs.getString("room_no");
                String p = String.valueOf(grs.getInt("payment"));
                String s = grs.getString("status");
              
                
                String[] data = {id,a,b,c,d,e,f,g,h,p,s};
                
                mr.addRow(data);
                //        System.out.println(a + b + c + d + e + f + g + h + p);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(dataret.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mr;
    }
    
    public static DefaultTableModel getbookrecord(String[] cn,String sql){
        
        try {
//            String sql = "select * from cust_info join record where cust_info.id = record.customer_id";
            
            ResultSet grs = dbconnection.getresult(sql);
            mr = new DefaultTableModel(cn,0);
            while(grs.next()){
                String id = String.valueOf(grs.getInt("record.ID"));
                String a = grs.getString("Name");
                String b = grs.getString("Address");
                String d = grs.getString("Phone");
                String c = grs.getString("NID");
                String e = grs.getDate("in_date").toString();
                String f = grs.getDate("out_date").toString();
                String g = String.valueOf(grs.getInt("service_id"));
                String h = grs.getString("room_no");
                String p = String.valueOf(grs.getInt("payment"));
                String s = grs.getString("status");
              
                
                String[] data = {id,a,b,c,d,e,f,g,h,p,s};
                
                mr.addRow(data);
                //        System.out.println(a + b + c + d + e + f + g + h + p);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(dataret.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mr;
    }
    
    
//    public static void main(String[] args) throws SQLException {
//        
//    }
    
            
    
}
